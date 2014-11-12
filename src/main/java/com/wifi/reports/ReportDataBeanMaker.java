package com.wifi.reports;

import java.util.ArrayList;

import com.wifi.reports.bean.ReportDataBean;

public class ReportDataBeanMaker {
	
	public ArrayList<ReportDataBean> getDataBeanList() {
		ArrayList<ReportDataBean> dataBeanList = new ArrayList<ReportDataBean>();

		dataBeanList.add(new ReportDataBean("Albert Einstein", "Engineer", "Ulm",	"Germany"));
		dataBeanList.add(new ReportDataBean("Alfred Hitchcock", "Movie Director", 	"London", "UK"));
		dataBeanList.add(new ReportDataBean("Wernher Von Braun", "Rocket Scientist", 	"Wyrzysk", "Poland (Previously Germany)"));
		dataBeanList.add(new ReportDataBean("Sigmund Freud", "Neurologist", "Pribor", 	"Czech Republic (Previously Austria)"));
		dataBeanList.add(new ReportDataBean("Mahatma Gandhi", "Lawyer", "Gujarat", "India"));
		dataBeanList.add(new ReportDataBean("Sachin Tendulkar", "Cricket Player",	"Mumbai", "India"));
		dataBeanList.add(new ReportDataBean("Michael Schumacher", "F1 Racer", "Cologne", "Germany"));

		return dataBeanList;
	}

}
