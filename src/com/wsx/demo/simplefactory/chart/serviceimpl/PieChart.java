package com.wsx.demo.simplefactory.chart.serviceimpl;

import com.wsx.demo.simplefactory.chart.service.Chart;

// �����Ʒ��״ͼ
public class PieChart implements Chart {

	@Override
	public void display() {
		System.out.println("show pie chart!");
	}
	
	public PieChart() {
		System.out.println("create pie chart!");
	}
}
