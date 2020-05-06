package com.hicap.springbatch.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "retailerDetails")
public class RetailerDetails {

	private int retailer_id;
	private String retailer_name;
	private String retailer_location;

	@XmlElement(name = "retailerId")
	public int getRetailerId() {
		return retailer_id;
	}

	public void setRetailerId(int retailer_id) {
		this.retailer_id = retailer_id;
	}

	@XmlElement(name = "retailerName")
	//@XmlJavaTypeAdapter(type = LocalDate.class, value = com.websystique.springbatch.LocalDateAdapter.class)
	public String getRetailerName() {
		return retailer_name;
	}

	public void setRetailerName(String retailer_name) {
		this.retailer_name = retailer_name;
	}

	@XmlElement(name = "retailerLocation")
	public String getRetailerLocation() {
		return retailer_location;
	}

	public void setRetailerLocation(String retailer_location) {
		this.retailer_location = retailer_location;
	}

	@Override
	public String toString() {
		return "Retailerdetails [Retailerid=" + retailer_id + ", Retailername=" + retailer_name
				+ ", retailerlocation=" + retailer_location + "]";
	}

}
