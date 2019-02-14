package com.wsx.demo.simplefactory.chart.serviceimpl;

import com.wsx.demo.simplefactory.chart.service.Chart;

// 具体产品柱状图
public class HistogramChart implements Chart {

	@Override
	public void display() {
		System.out.println("show histogram chart!");
	}

	public HistogramChart() {
		System.out.println("create histogram chart!");
	}
}
