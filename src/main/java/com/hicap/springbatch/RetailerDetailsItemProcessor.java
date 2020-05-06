package com.hicap.springbatch;

import com.hicap.springbatch.model.RetailerDetails;
import org.springframework.batch.item.ItemProcessor;

public class RetailerDetailsItemProcessor implements ItemProcessor<RetailerDetails, RetailerDetails>{

	
	@Override
	public RetailerDetails process(RetailerDetails result) throws Exception {
		System.out.println("Processing result :"+result);
		return result;
	}

}
