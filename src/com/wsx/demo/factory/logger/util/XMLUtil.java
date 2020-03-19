package com.wsx.demo.factory.logger.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean() {
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("factory-config.xml"));
			NodeList nodes = doc.getElementsByTagName("className");
			Node classNode = nodes.item(0).getFirstChild();
			String className = classNode.getNodeValue().trim();
			// 通过类名生成实例对象并返回
			Class<?> caller = Class.forName("com.wsx.demo.factory.logger.factory." + className);
			return caller.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private XMLUtil() {}
}
