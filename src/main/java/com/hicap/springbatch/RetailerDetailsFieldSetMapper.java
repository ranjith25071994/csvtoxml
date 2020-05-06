package com.hicap.springbatch;

import com.hicap.springbatch.model.RetailerDetails;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.util.HashMap;

public class RetailerDetailsFieldSetMapper implements FieldSetMapper<RetailerDetails>{

	public static HashMap<Integer,RetailerDetails> RetDet = new HashMap();
	@Override
	public RetailerDetails mapFieldSet(FieldSet fieldSet) throws BindException {

		RetailerDetails result = new RetailerDetails();
		result.setRetailerId(fieldSet.readInt(0));
		result.setRetailerName(fieldSet.readString(1));
		result.setRetailerLocation(fieldSet.readString(2));
		if(RetDet.containsKey(fieldSet.readInt(0)))
		{
			System.out.println("RetailerDetails 1"+result);
			return null;
		}
		RetDet.put(fieldSet.readInt(0),result);
		System.out.println("RetailerDetails 2"+result);
		return result;
	}

}
