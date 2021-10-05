package com.upstox.utility;

public class Margin {
	
	private String client_id;
	private String broker_code;
	private Symbol symbol1;
	private Symbol symbol2;
	
	
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public Symbol getSymbol1() {
		return symbol1;
	}
	public void setSymbol1(Symbol symbol1) {
		this.symbol1 = symbol1;
	}
	public Symbol getSymbol2() {
		return symbol2;
	}
	public void setSymbol2(Symbol symbol2) {
		this.symbol2 = symbol2;
	}
	
	
	public String getBroker_code() {
		return broker_code;
	}
	public void setBroker_code(String broker_code) {
		this.broker_code = broker_code;
	}

}
