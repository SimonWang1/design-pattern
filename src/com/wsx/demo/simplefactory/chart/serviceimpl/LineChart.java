package com.wsx.demo.simplefactory.chart.serviceimpl;

import com.wsx.demo.simplefactory.chart.service.Chart;

// ����ͼ�����Ʒ��ҵ��ʵ�֣�
public class LineChart implements Chart {

	@Override
	public void display() {
		System.out.println("show line chart!");
	}
	
	public LineChart() {
		System.out.println("create line chart!");
	}
}
