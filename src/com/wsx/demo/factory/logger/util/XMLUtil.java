package com.wsx.demo.factory.logger.util;

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
	public static Object getBean() {
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document doc = null;
			doc = builder.parse(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("factory-config.xml"));
			NodeList nodes = doc.getElementsByTagName("className");
			Node classNode = nodes.item(0).getFirstChild();
			String className = classNode.getNodeValue().trim();
			// 通过类名生成实例对象并返回
			Class<?> caller = Class.forName("com.wsx.demo.factory.logger.factory." + className);
			Object obj = caller.newInstance();
			return obj;
		} catch (DOMException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
