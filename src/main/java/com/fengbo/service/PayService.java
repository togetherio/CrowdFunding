package com.fengbo.service;

import java.util.Map;

public interface PayService {
	public Map<String,String> precreate(String out_trade_no,String total_amount);
	
	public Map<String,String> query(String out_trade_no);
	
	public Map<String,String> cancel(String out_trade_no);
}
