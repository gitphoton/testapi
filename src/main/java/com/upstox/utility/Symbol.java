package com.upstox.utility;

public class Symbol {
	private String exch_id;
	private String segment;
	private String scrip_code;
	private String underlying_scrip;
	private String buy_sell;
	private String quantity;
	private String instrument;
	private String strike_price;
	private String row_no;
	
	public String getExch_id() {
		return exch_id;
	}
	public void setExch_id(String exch_id) {
		this.exch_id = exch_id;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getScrip_code() {
		return scrip_code;
	}
	public void setScrip_code(String scrip_code) {
		this.scrip_code = scrip_code;
	}
	public String getUnderlying_scrip() {
		return underlying_scrip;
	}
	public void setUnderlying_scrip(String underlying_scrip) {
		this.underlying_scrip = underlying_scrip;
	}
	public String getBuy_sell() {
		return buy_sell;
	}
	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getStrike_price() {
		return strike_price;
	}
	public void setStrike_price(String strike_price) {
		this.strike_price = strike_price;
	}
	public String getRow_no() {
		return row_no;
	}
	public void setRow_no(String row_no) {
		this.row_no = row_no;
	}
}
