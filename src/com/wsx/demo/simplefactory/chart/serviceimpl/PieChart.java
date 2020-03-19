package com.wsx.demo.simplefactory.chart.serviceimpl;

import com.wsx.demo.simplefactory.chart.service.Chart;

// 饼状图具体产品（业务实现）
public class PieChart implements Chart {

	@Override
	public void display() {
		System.out.println("show pie chart!");
	}
	
	public PieChart() {
		System.out.println("create pie chart!");
	}
}
