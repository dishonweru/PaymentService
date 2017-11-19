package com.concretepage.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class XMLUtil {
	
	public String enrichInitXML(String init_xml) {
		String response = null;
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	public String enrichServiceXML(String service_xml,String parent_node,List<String> element,List<String> values, String client_details) {
		String response = null;
		try{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new InputSource( new StringReader(service_xml)));
			
			//Create variables element if not exists
			Node variables = doc.getElementsByTagName(parent_node).item(0);
			Node messages = doc.getElementsByTagName("messages").item(0);
			
			//Create account selection xml and append customer accounts
			Element selection = doc.createElement("selection");
			selection.setAttribute("name", "account_sel");
			
			Element title = doc.createElement("title");
			title.appendChild(doc.createTextNode("Select Account:"));
			selection.appendChild(title);
			
			Element store = doc.createElement("store-option-text");
			store.setAttribute("variable", "accountSelected");
			selection.appendChild(store);
			
			Element history = doc.createElement("remember-history");
			history.setAttribute("value", "true");
			selection.appendChild(history);
			
			Element ref = doc.createElement("ref");
			ref.appendChild(doc.createTextNode("#account_sel"));
			selection.appendChild(ref);			
			
			for(int i=0;i<element.size();i++){
				Element elem = doc.createElement("variable");
				elem.setAttribute("name",element.get(i)+String.valueOf(i));
				elem.setAttribute("value",values.get(i));	
				variables.appendChild(elem);
				
				Element opt = doc.createElement("option");
				opt.setAttribute("choice",String.valueOf(i + 1));
				opt.setAttribute("ref","#fetchCharge");
				//opt.setAttribute("text","${account"+String.valueOf(i)+"}");
				opt.setAttribute("text",values.get(i));
				selection.appendChild(opt);
			}
			//Append Personalization Details
			Element person_1 = doc.createElement("variable");
			person_1.setAttribute("name","first_name");
			person_1.setAttribute("value",client_details.split("~")[0]);	
			variables.appendChild(person_1);
			
			//Append Personalization Details
			Element person_2 = doc.createElement("variable");
			person_2.setAttribute("name","surname");
			person_2.setAttribute("value",client_details.split("~")[2]);	
			variables.appendChild(person_2);
			
			Element back = doc.createElement("back");
			selection.appendChild(back);
			
			Element exit = doc.createElement("exit");
			selection.appendChild(exit);
			
			//Append selection to service xml
			messages.appendChild(selection);
			
			
			//Transform xml doc to string
			TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer;
	        transformer = tf.newTransformer();
	        StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            response = writer.getBuffer().toString();			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	public String enrichChargeXML(String charge_xml,String parent_node,String amount) {
		String response = null;
		try{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new InputSource( new StringReader(charge_xml)));
			
			//Create variables element if not exists
			Node variables = doc.getElementsByTagName(parent_node).item(0);	
			
			Element elem = doc.createElement("variable");
			elem.setAttribute("name","transactionCharge");
			elem.setAttribute("value",amount);	
			variables.appendChild(elem);
			
			Element elem_tax = doc.createElement("variable");
			elem_tax.setAttribute("name","transactionTax");
			elem_tax.setAttribute("value",String.valueOf(Double.parseDouble(amount)/10));	
			variables.appendChild(elem_tax);
			
			//Transform xml doc to string
			TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer;
	        transformer = tf.newTransformer();
	        StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            response = writer.getBuffer().toString();			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	public String enrichBalanceXML(String balance_xml,String parent_node,String bal_amount) {
		String response = null;
		try{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new InputSource( new StringReader(balance_xml)));
			
			//Create variables element if not exists
			Node variables = doc.getElementsByTagName(parent_node).item(0);	
			
			Element elem = doc.createElement("variable");
			elem.setAttribute("name","account_balance");
			elem.setAttribute("value",bal_amount);	
			variables.appendChild(elem);
			
			//Transform xml doc to string
			TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer;
	        transformer = tf.newTransformer();
	        StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            response = writer.getBuffer().toString();	
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> element = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		
		element.add(0, "account");
		element.add(1, "account");
		
		values.add(0, "0170190906282");
		values.add(1, "035000022424");
		
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><xml-api xmlns=\"http://ussd.infobip.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://ussd.infobip.com https://sp.infobip.com/Programmes/USSD/Public/SalesToolkit/API/xml-api-v3.1.xsd\"><configuration><property name=\"pageNextMenu\" value=\"#login_redirect\"/><property name=\"firstMenuName\" value=\"#login_redirect\"/><property name=\"lastMenuName\" value=\"#DefaultExit\"/></configuration><variables></variables><messages><redirect name=\"login_redirect\"><ref>#services</ref></redirect></messages></xml-api>";
		
		XMLUtil util = new XMLUtil();
		System.out.println("Result:" + util.enrichServiceXML(xml, "variables", element, values, "Abel~Jevayi~Masai~abelmasai@gmail.com"));
	}

}
