package com.upstox.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upstox.utility.Data;
import com.upstox.utility.Margin;
import com.upstox.utility.MarginResponce;


@RestController
public class UpstockMarginControler {
	
	@RequestMapping(value = "/rws/margin/calc/mar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public MarginResponce marginStratgyBuilder(@RequestBody Margin margin ) {
		System.out.println("--------------------------->");
		System.out.println(margin.getClient_id());
		System.out.println(margin.getBroker_code());
		System.out.println(margin.getSymbol1().getExch_id());
		System.out.println(margin.getSymbol2().getExch_id());
		
		Data data = new Data();
		data.setT_EXPOSURE_MARGIN("15791.95");
		data.setT_NET_OPT_PREMIUM("0.0");
		data.setT_SPAN_MARGIN("0.0");
		data.setT_SPREAD_BENEFIT("84937.5");
		data.setT_TOTAL_MARGIN("15791.95");
		data.setT_VAR_MARGIN("0.0");
		data.setT_VARELM_MARGIN("0.0");
		data.setT_ELM_MARGIN("0.0");
		data.setT_TOT_ADHOC_MRG("0.0");
		
		
		
		MarginResponce marginResponce = new MarginResponce();
		marginResponce.setData(data);
		marginResponce.setStatus("Success");
		return marginResponce;
		
	}
	
	
	
	
}
