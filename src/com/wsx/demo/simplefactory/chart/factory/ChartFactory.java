package com.wsx.demo.simplefactory.chart.factory;

import com.wsx.demo.simplefactory.chart.service.Chart;
import com.wsx.demo.simplefactory.chart.serviceimpl.HistogramChart;
import com.wsx.demo.simplefactory.chart.serviceimpl.LineChart;
import com.wsx.demo.simplefactory.chart.serviceimpl.PieChart;

// 图表工厂类
public class ChartFactory {
	public static Chart getChart(String type) {
		Chart chart = null;
		if (type.equalsIgnoreCase("histogram")) {
			chart = new HistogramChart();
		} else if (type.equalsIgnoreCase("pie")) {
			chart = new PieChart();
		} else if (type.equalsIgnoreCase("line")) {
			chart = new LineChart();
		}
		return chart;
	}
}
