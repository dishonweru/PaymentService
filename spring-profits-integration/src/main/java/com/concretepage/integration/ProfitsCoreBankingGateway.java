package com.concretepage.integration;

import java.security.Provider.Service;

import com.intrasoft_internatinal.*;
import com.intrasoft_internatinal.gatewayservice.profitsext.ProfitsExtGateway;
import com.intrasoft_internatinal.gatewayservice.profitsext.ProfitsExtGatewaySoap;

public class ProfitsCoreBankingGateway {
	
	static ProfitsExtGateway gateway = new ProfitsExtGateway();
	static ProfitsExtGatewaySoap core_service = gateway.getProfitsExtGatewaySoap();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		core_service.d0350VBalanceInquiryMiniStatement(_import, executionParameters)
	}

}
