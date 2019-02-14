package com.wsx.demo.simplefactory.chart.util;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtil {
	public static String getChartType() {
		try {
			// 创建文档对象
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document doc = null;
			doc = builder.parse(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("simplefactory-config.xml"));
			// 获取包含图表类型的文本节点
			NodeList nodes = doc.getElementsByTagName("chartType");
			Node classNode = nodes.item(0).getFirstChild();
			String chartType = classNode.getNodeValue().trim();
			return chartType;
		} catch (DOMException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
