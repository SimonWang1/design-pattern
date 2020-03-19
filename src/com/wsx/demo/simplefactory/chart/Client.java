package com.wsx.demo.simplefactory.chart;

import com.wsx.demo.simplefactory.chart.factory.ChartFactory;
import com.wsx.demo.simplefactory.chart.service.Chart;
import com.wsx.demo.simplefactory.chart.util.XMLUtil;

public class Client {
	
	public static void main(String[] args) {
		// Chart	chart = ChartFactory.getChart("histogram");
		String type = XMLUtil.getChartType();
		Chart chart = ChartFactory.getChart(type);
		chart.display();
	}
}
