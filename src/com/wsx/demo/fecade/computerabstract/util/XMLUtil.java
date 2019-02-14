package com.wsx.demo.fecade.computerabstract.util;

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
	public static String getComputerType() {
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document doc = null;
			doc = builder.parse(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("facade-config.xml"));
			NodeList nodes = doc.getElementsByTagName("computerType");
			Node classNode = nodes.item(0).getFirstChild();
			String computerType = classNode.getNodeValue().trim();
			return computerType;
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
