package com.fengbo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.service.PayService;
import com.fengbo.unit.IdWorker;

@Controller
public class PayController {

	@Autowired
	PayService payService;
	/**
	 * 调用交易预下单接口，获取到二维码url
	 */
	@RequestMapping("/getqrcode")
	@ResponseBody
	public Map getqrcode(String money){
		//生成订单编号
		IdWorker idwork = new IdWorker(0,0);
		long orderid=idwork.nextId();
		
		return payService.precreate(orderid+"", money);
		
	}
	
	/**
	 * 交易状态查询
	 */
	@RequestMapping("/paystatus")
	@ResponseBody
	public Map getstatus(String out_trade_no){
		Map<String, String> map = new HashMap<String, String>();
		int count=0;
		while(true){
		   Map<String, String> map1 = payService.query(out_trade_no);
		   
		   //判断查询到了交易结果，就处理，跳出循环
		   if(map1!=null&&!map1.isEmpty()){
			   
			   String trade_status=map1.get("trade_status");
			   if(trade_status!=null&&trade_status.equals("TRADE_SUCCESS")){
				   map.put("trade_status", "TRADE_SUCCESS");
				   break;
			   }
		   }
		   //让查询请求睡眠3秒
		   try {
			Thread.sleep(3000);
			count++;
			if(count>=100){
				//调用取消订单接口
				Map<String, String> map2 = payService.cancel(out_trade_no);
				if(map2!=null&&!map2.isEmpty()){
					String msg=map2.get("msg");
					if(msg!=null&&msg.equals("Success")){
						map.put("trade_status", "TRADE_CLOSED");
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		return map;
	}
}
