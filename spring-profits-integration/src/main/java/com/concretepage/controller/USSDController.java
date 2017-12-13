package com.concretepage.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.Menu;
import com.concretepage.service.IMenuService;

@Controller
@RequestMapping("payments")
public class USSDController {
	@Autowired
	private IMenuService menuService;
	@PostMapping("stage/{id}")
	public ResponseEntity<String> getMenuByStageId(HttpServletRequest request, @PathVariable("id") Integer id) {
		String response = menuService.getMenuByStageId(request, id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	@PostMapping("init")
	public ResponseEntity<String> getInitMenuXML(HttpServletRequest request) {
		Menu menu = menuService.getInitMenuXML(1,request);
		return new ResponseEntity<String>(menu.getXmlPayLoad(), HttpStatus.OK);
	}
	@PostMapping("exit")
	public ResponseEntity<String> logSessionEnd(HttpServletRequest request) {
		menuService.updateMenuOnExit("exit", request);
		return new ResponseEntity<String>("10-4", HttpStatus.OK);
	}
	@PostMapping("mobile-money")
<<<<<<< HEAD
	public ResponseEntity<String> acceptMobileMoneyRequest(HttpServletRequest request) {		
		return new ResponseEntity<String>("{ \"transaction_data\": [ { \"service_code\": \"mpesa_b2c_own\", \"external_transaction_ref\":\"567776cfre34\", \"gateway_ref\": \"hh78sa7788\", \"status_message\": \"ACCEPTED\", \"status_code\": \"00\", \"remarks\":\"Transaction queued for processing successfully. A notification will be sent to the assigned result endpoint once transaction is completed \" } ] }", HttpStatus.OK);
=======
	public ResponseEntity<String> acceptMobileMoneyRequest(HttpEntity<String> httpEntity) {
		String json_request = httpEntity.getBody();
		return new ResponseEntity<String>(menuService.processMobileMoneyRequest(json_request), HttpStatus.OK);
>>>>>>> 8759ed31ff54714583aed42599881a72110d893d
	}
	@PostMapping("utility-payment")
	public ResponseEntity<String> acceptUtilityPaymentRequest(HttpEntity<String> httpEntity) {
		String json_request = httpEntity.getBody();
		return new ResponseEntity<String>(menuService.processUtilityPaymentRequest(json_request), HttpStatus.OK);
	}
} 