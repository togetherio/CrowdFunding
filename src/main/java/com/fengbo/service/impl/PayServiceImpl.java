package com.fengbo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradeCancelRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeCancelResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.fengbo.service.PayService;

@Service
public class PayServiceImpl implements PayService{

	@Autowired
	AlipayClient alipayClient;
	/**
	 * 预下单接口调用：alipay.trade.precreate
	 */
	@Override
	public Map<String,String> precreate(String out_trade_no,String total_amount){
		Map<String,String> map=new HashMap<String, String>();
		
		//创建预下单请求对象
		AlipayTradePrecreateRequest request=new AlipayTradePrecreateRequest();
		//设置预下单请求参数
		request.setBizContent("{" +
				"    \"out_trade_no\":\""+out_trade_no+"\"," +
				"    \"total_amount\":\""+total_amount+"\"," +
				"    \"subject\":\"IphoneX 128G\"," +
				"    \"store_id\":\"NJ_001\"," +
				"    \"timeout_express\":\"90m\"}");
		//调用AlipayClient发出交易请求
		try {
			AlipayTradePrecreateResponse response = alipayClient.execute(request);
			//获取响应状态码
			String code=response.getCode();
			System.out.println("支付宝网关预下单请求返回值:"+response.getBody());
			if(code!=null&&code.equals("10000")){
				//获取支付宝网关返回的二维码url地址
				map.put("qrcode", response.getQrCode());
				map.put("out_trade_no", out_trade_no);
			}
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
		
	}
	/**
	 * 交易状态查询接口
	 */
	@Override
	public Map<String, String> query(String out_trade_no) {
		Map<String,String> map=new HashMap<String, String>();
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		//设置交易查询请求参数
		request.setBizContent("{" +
				"    \"out_trade_no\":\""+out_trade_no+"\"," +
				"    \"trade_no\":\"\"}");
		//发出交易查询请求
		try {
			AlipayTradeQueryResponse response = alipayClient.execute(request);
			String code=response.getCode();
			System.out.println("交易状态查询返回值:"+response.getBody());
			if(code!=null&&code.equals("10000")){
				map.put("trade_status", response.getTradeStatus());
				map.put("out_trade_no", out_trade_no);
				
			}
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
	/**
	 * 取消预下单 交易撤销接口alipay.trade.cancel：
	 * 
	 */

	@Override
	public Map<String, String> cancel(String out_trade_no) {
		Map<String,String> map=new HashMap<String, String>();
		AlipayTradeCancelRequest request = new AlipayTradeCancelRequest();
		request.setBizContent("{" +
				"    \"out_trade_no\":\""+out_trade_no+"\"," +
				"    \"trade_no\":\"\"}");
		try {
			AlipayTradeCancelResponse response = alipayClient.execute(request);
			String code=response.getCode();
			System.out.println("撤销交易返回结果:"+response.getBody());
			if(code!=null&&code.equals("10000")){
				map.put("msg", response.getMsg());
				map.put("out_trade_no", out_trade_no);
			}
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}
	
}
