package com.wifi.reports;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import org.hibernate.mapping.Map;

import com.wifi.reports.bean.ReportDataBean;

public class Reporter {
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("report/test_jasper.jrxml");
		 
		ReportDataBeanMaker dataBeanMaker = new ReportDataBeanMaker();
		ArrayList<ReportDataBean> dataBeanList = dataBeanMaker.getDataBeanList();
		 
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);
		 
		HashMap parameters = new HashMap();
		 
		JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
		JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
		JasperExportManager.exportReportToPdfFile(jasperPrint, "report/test_jasper.pdf"); 
		}
}
