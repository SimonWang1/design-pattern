package com.wsx.demo.simplefactory.chart.factory;

import com.wsx.demo.simplefactory.chart.service.Chart;
import com.wsx.demo.simplefactory.chart.serviceimpl.HistogramChart;
import com.wsx.demo.simplefactory.chart.serviceimpl.LineChart;
import com.wsx.demo.simplefactory.chart.serviceimpl.PieChart;

// Í¼±í¹¤³§
public class ChartFactory {
	
	public static Chart getChart(String type) {
		if (type.equalsIgnoreCase("histogram")) {
			return new HistogramChart();
		} 
		if (type.equalsIgnoreCase("pie")) {
			return new PieChart();
		} 
		if (type.equalsIgnoreCase("line")) {
			return new LineChart();
		}
		return null;
	}
	
	private ChartFactory() {}
}
