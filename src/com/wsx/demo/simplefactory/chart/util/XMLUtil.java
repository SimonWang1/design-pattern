package com.wsx.demo.simplefactory.chart.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	
	public static String getChartType() {
		try {
			// 创建文档对象
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("simplefactory-config.xml"));
			// 获取包含图表类型的文本节点
			NodeList nodes = doc.getElementsByTagName("chartType");
			Node classNode = nodes.item(0).getFirstChild();
			return classNode.getNodeValue().trim();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	private XMLUtil() {}
}
