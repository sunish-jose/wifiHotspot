package com.wifi.reports.bean;

public class ReportDataBean {
	private String name;
	private String occupation;
	private String place;
	private String country;

	public ReportDataBean(){
	}
	
	public ReportDataBean(String name, String occupation, String place,	String country) {
		this.name = name;
		this.occupation = occupation;
		this.place = place;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}

	