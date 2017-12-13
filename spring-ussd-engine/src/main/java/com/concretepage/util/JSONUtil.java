package com.concretepage.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String[] parseAuthenticationResult(String result){
		String[] response = new String[3];
		try{
			JSONParser parser = new JSONParser();
			Object object = parser.parse(result);
			JSONObject jsonObject = (JSONObject)object;
			String resp_msg = (String)jsonObject.get("response_message");
			String resp_stat = (String)jsonObject.get("response_status");
			response[0] = resp_stat + "~" + resp_msg;
			if(resp_stat.contentEquals("OK")){
				//Parse the other objects
				Object client_obj = jsonObject.get("response_customer");
				JSONObject client = (JSONObject)client_obj;
				String surname = (String)client.get("surname");
				String firstname = (String)client.get("firstname");
				String middlename = (String)client.get("middlename");
				String email = (String)client.get("email");
				response[1] = firstname+"~"+middlename+"~"+surname+"~"+email;
				JSONArray accounts = (JSONArray)jsonObject.get("response_accounts");
				StringBuffer sb = new StringBuffer();
				for(Object account : accounts)
	            {
	                JSONObject acc = (JSONObject)account;
	                sb.append((String)acc.get("accName") + "~" + (String)acc.get("accNum") + "~" + (String)acc.get("accType") + "~" + (String)acc.get("type") + ":");
	            }
				response[2] = sb.toString();
			}			
			
			return response;
		}catch(Exception e){
			e.printStackTrace();
			response[0] = "ERROR~"+e.getMessage();
			return response;
		}
	}
	
	public String[] parseBalanceInquiryResult(String result){
		String[] response = new String[1];
		try{
			JSONParser parser = new JSONParser();
			Object object = parser.parse(result);
			JSONObject jsonObject = (JSONObject)object;
			String resp_msg = (String)jsonObject.get("response_message");
			String resp_stat = (String)jsonObject.get("response_status");
			response[0] = resp_stat + "~" + resp_msg;
			
			return response;
		}catch(Exception e){
			e.printStackTrace();
			response[0] = "ERROR~"+e.getMessage();
			return response;
		}
	}

}
