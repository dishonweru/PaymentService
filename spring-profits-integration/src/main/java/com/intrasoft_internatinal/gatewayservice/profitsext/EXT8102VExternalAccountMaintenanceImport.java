
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXT8102VExternalAccountMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXT8102VExternalAccountMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalCr12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCapitalDb12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionCommission12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionExpenses12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestCr12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionInterestDb12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty00" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty01" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty02" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty03" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty04" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty05" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty06" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty07" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty08" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty09" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPenalty12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCustomerPositionPosYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount13" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount14" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount16" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount17" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount18" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount19" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount20" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount21" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount22" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount23" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount24" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoAmount25" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoChar9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate11" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate12" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate13" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate14" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate15" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoLargeChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoLargeChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoLargeChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoLargeChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateExtrnlAccInfoLargeChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateMovementCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysAmn9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsAccountExtsysProcessDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxWorkDatesProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXT8102VExternalAccountMaintenanceImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inManipulateCustomerCDigit",
    "inManipulateCustomerCustId",
    "inManipulateCustomerPositionCapitalCr00",
    "inManipulateCustomerPositionCapitalCr01",
    "inManipulateCustomerPositionCapitalCr02",
    "inManipulateCustomerPositionCapitalCr03",
    "inManipulateCustomerPositionCapitalCr04",
    "inManipulateCustomerPositionCapitalCr05",
    "inManipulateCustomerPositionCapitalCr06",
    "inManipulateCustomerPositionCapitalCr07",
    "inManipulateCustomerPositionCapitalCr08",
    "inManipulateCustomerPositionCapitalCr09",
    "inManipulateCustomerPositionCapitalCr10",
    "inManipulateCustomerPositionCapitalCr11",
    "inManipulateCustomerPositionCapitalCr12",
    "inManipulateCustomerPositionCapitalDb00",
    "inManipulateCustomerPositionCapitalDb01",
    "inManipulateCustomerPositionCapitalDb02",
    "inManipulateCustomerPositionCapitalDb03",
    "inManipulateCustomerPositionCapitalDb04",
    "inManipulateCustomerPositionCapitalDb05",
    "inManipulateCustomerPositionCapitalDb06",
    "inManipulateCustomerPositionCapitalDb07",
    "inManipulateCustomerPositionCapitalDb08",
    "inManipulateCustomerPositionCapitalDb09",
    "inManipulateCustomerPositionCapitalDb10",
    "inManipulateCustomerPositionCapitalDb11",
    "inManipulateCustomerPositionCapitalDb12",
    "inManipulateCustomerPositionCommission00",
    "inManipulateCustomerPositionCommission01",
    "inManipulateCustomerPositionCommission02",
    "inManipulateCustomerPositionCommission03",
    "inManipulateCustomerPositionCommission04",
    "inManipulateCustomerPositionCommission05",
    "inManipulateCustomerPositionCommission06",
    "inManipulateCustomerPositionCommission07",
    "inManipulateCustomerPositionCommission08",
    "inManipulateCustomerPositionCommission09",
    "inManipulateCustomerPositionCommission10",
    "inManipulateCustomerPositionCommission11",
    "inManipulateCustomerPositionCommission12",
    "inManipulateCustomerPositionExpenses00",
    "inManipulateCustomerPositionExpenses01",
    "inManipulateCustomerPositionExpenses02",
    "inManipulateCustomerPositionExpenses03",
    "inManipulateCustomerPositionExpenses04",
    "inManipulateCustomerPositionExpenses05",
    "inManipulateCustomerPositionExpenses06",
    "inManipulateCustomerPositionExpenses07",
    "inManipulateCustomerPositionExpenses08",
    "inManipulateCustomerPositionExpenses09",
    "inManipulateCustomerPositionExpenses10",
    "inManipulateCustomerPositionExpenses11",
    "inManipulateCustomerPositionExpenses12",
    "inManipulateCustomerPositionInterestCr00",
    "inManipulateCustomerPositionInterestCr01",
    "inManipulateCustomerPositionInterestCr02",
    "inManipulateCustomerPositionInterestCr03",
    "inManipulateCustomerPositionInterestCr04",
    "inManipulateCustomerPositionInterestCr05",
    "inManipulateCustomerPositionInterestCr06",
    "inManipulateCustomerPositionInterestCr07",
    "inManipulateCustomerPositionInterestCr08",
    "inManipulateCustomerPositionInterestCr09",
    "inManipulateCustomerPositionInterestCr10",
    "inManipulateCustomerPositionInterestCr11",
    "inManipulateCustomerPositionInterestCr12",
    "inManipulateCustomerPositionInterestDb00",
    "inManipulateCustomerPositionInterestDb01",
    "inManipulateCustomerPositionInterestDb02",
    "inManipulateCustomerPositionInterestDb03",
    "inManipulateCustomerPositionInterestDb04",
    "inManipulateCustomerPositionInterestDb05",
    "inManipulateCustomerPositionInterestDb06",
    "inManipulateCustomerPositionInterestDb07",
    "inManipulateCustomerPositionInterestDb08",
    "inManipulateCustomerPositionInterestDb09",
    "inManipulateCustomerPositionInterestDb10",
    "inManipulateCustomerPositionInterestDb11",
    "inManipulateCustomerPositionInterestDb12",
    "inManipulateCustomerPositionPenalty00",
    "inManipulateCustomerPositionPenalty01",
    "inManipulateCustomerPositionPenalty02",
    "inManipulateCustomerPositionPenalty03",
    "inManipulateCustomerPositionPenalty04",
    "inManipulateCustomerPositionPenalty05",
    "inManipulateCustomerPositionPenalty06",
    "inManipulateCustomerPositionPenalty07",
    "inManipulateCustomerPositionPenalty08",
    "inManipulateCustomerPositionPenalty09",
    "inManipulateCustomerPositionPenalty10",
    "inManipulateCustomerPositionPenalty11",
    "inManipulateCustomerPositionPenalty12",
    "inManipulateCustomerPositionPosYear",
    "inManipulateExtrnlAccInfoAmount11",
    "inManipulateExtrnlAccInfoAmount12",
    "inManipulateExtrnlAccInfoAmount13",
    "inManipulateExtrnlAccInfoAmount14",
    "inManipulateExtrnlAccInfoAmount15",
    "inManipulateExtrnlAccInfoAmount16",
    "inManipulateExtrnlAccInfoAmount17",
    "inManipulateExtrnlAccInfoAmount18",
    "inManipulateExtrnlAccInfoAmount19",
    "inManipulateExtrnlAccInfoAmount20",
    "inManipulateExtrnlAccInfoAmount21",
    "inManipulateExtrnlAccInfoAmount22",
    "inManipulateExtrnlAccInfoAmount23",
    "inManipulateExtrnlAccInfoAmount24",
    "inManipulateExtrnlAccInfoAmount25",
    "inManipulateExtrnlAccInfoChar1",
    "inManipulateExtrnlAccInfoChar10",
    "inManipulateExtrnlAccInfoChar2",
    "inManipulateExtrnlAccInfoChar3",
    "inManipulateExtrnlAccInfoChar4",
    "inManipulateExtrnlAccInfoChar5",
    "inManipulateExtrnlAccInfoChar6",
    "inManipulateExtrnlAccInfoChar7",
    "inManipulateExtrnlAccInfoChar8",
    "inManipulateExtrnlAccInfoChar9",
    "inManipulateExtrnlAccInfoDate1",
    "inManipulateExtrnlAccInfoDate10",
    "inManipulateExtrnlAccInfoDate11",
    "inManipulateExtrnlAccInfoDate12",
    "inManipulateExtrnlAccInfoDate13",
    "inManipulateExtrnlAccInfoDate14",
    "inManipulateExtrnlAccInfoDate15",
    "inManipulateExtrnlAccInfoDate2",
    "inManipulateExtrnlAccInfoDate3",
    "inManipulateExtrnlAccInfoDate4",
    "inManipulateExtrnlAccInfoDate5",
    "inManipulateExtrnlAccInfoDate6",
    "inManipulateExtrnlAccInfoDate7",
    "inManipulateExtrnlAccInfoDate8",
    "inManipulateExtrnlAccInfoDate9",
    "inManipulateExtrnlAccInfoFlag1",
    "inManipulateExtrnlAccInfoFlag10",
    "inManipulateExtrnlAccInfoFlag2",
    "inManipulateExtrnlAccInfoFlag3",
    "inManipulateExtrnlAccInfoFlag4",
    "inManipulateExtrnlAccInfoFlag5",
    "inManipulateExtrnlAccInfoFlag6",
    "inManipulateExtrnlAccInfoFlag7",
    "inManipulateExtrnlAccInfoFlag8",
    "inManipulateExtrnlAccInfoFlag9",
    "inManipulateExtrnlAccInfoLargeChar1",
    "inManipulateExtrnlAccInfoLargeChar2",
    "inManipulateExtrnlAccInfoLargeChar3",
    "inManipulateExtrnlAccInfoLargeChar4",
    "inManipulateExtrnlAccInfoLargeChar5",
    "inManipulateLimitCurrencyIdCurrency",
    "inManipulateLimitCurrencyShortDescr",
    "inManipulateMovementCurrencyIdCurrency",
    "inManipulateMovementCurrencyShortDescr",
    "inManipulateProductIdProduct",
    "inManipulateProfitsAccountAccStatus",
    "inManipulateProfitsAccountAccountCd",
    "inManipulateProfitsAccountAccountNumber",
    "inManipulateProfitsAccountExtsysAmn1",
    "inManipulateProfitsAccountExtsysAmn10",
    "inManipulateProfitsAccountExtsysAmn2",
    "inManipulateProfitsAccountExtsysAmn3",
    "inManipulateProfitsAccountExtsysAmn4",
    "inManipulateProfitsAccountExtsysAmn5",
    "inManipulateProfitsAccountExtsysAmn6",
    "inManipulateProfitsAccountExtsysAmn7",
    "inManipulateProfitsAccountExtsysAmn8",
    "inManipulateProfitsAccountExtsysAmn9",
    "inManipulateProfitsAccountExtsysProcessDt",
    "inManipulateProfitsAccountPrftSystem",
    "inManipulateUnitCode",
    "inTrxTerminalTerminalNumber",
    "inTrxUnitClearingHouseFlag",
    "inTrxUnitCategoryGenericDetailSerialNum",
    "inTrxWorkDatesProductionDate"
})
public class EXT8102VExternalAccountMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InManipulateCustomerCDigit")
    protected short inManipulateCustomerCDigit;
    @XmlElement(name = "InManipulateCustomerCustId")
    protected int inManipulateCustomerCustId;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr00", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr00;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr01", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr01;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr02", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr02;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr03", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr03;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr04", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr04;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr05", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr05;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr06", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr06;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr07", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr07;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr08", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr08;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr09", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr09;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr10", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr10;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr11", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr11;
    @XmlElement(name = "InManipulateCustomerPositionCapitalCr12", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalCr12;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb00", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb00;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb01", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb01;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb02", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb02;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb03", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb03;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb04", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb04;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb05", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb05;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb06", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb06;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb07", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb07;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb08", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb08;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb09", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb09;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb10", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb10;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb11", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb11;
    @XmlElement(name = "InManipulateCustomerPositionCapitalDb12", required = true)
    protected BigDecimal inManipulateCustomerPositionCapitalDb12;
    @XmlElement(name = "InManipulateCustomerPositionCommission00", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission00;
    @XmlElement(name = "InManipulateCustomerPositionCommission01", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission01;
    @XmlElement(name = "InManipulateCustomerPositionCommission02", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission02;
    @XmlElement(name = "InManipulateCustomerPositionCommission03", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission03;
    @XmlElement(name = "InManipulateCustomerPositionCommission04", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission04;
    @XmlElement(name = "InManipulateCustomerPositionCommission05", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission05;
    @XmlElement(name = "InManipulateCustomerPositionCommission06", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission06;
    @XmlElement(name = "InManipulateCustomerPositionCommission07", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission07;
    @XmlElement(name = "InManipulateCustomerPositionCommission08", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission08;
    @XmlElement(name = "InManipulateCustomerPositionCommission09", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission09;
    @XmlElement(name = "InManipulateCustomerPositionCommission10", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission10;
    @XmlElement(name = "InManipulateCustomerPositionCommission11", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission11;
    @XmlElement(name = "InManipulateCustomerPositionCommission12", required = true)
    protected BigDecimal inManipulateCustomerPositionCommission12;
    @XmlElement(name = "InManipulateCustomerPositionExpenses00", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses00;
    @XmlElement(name = "InManipulateCustomerPositionExpenses01", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses01;
    @XmlElement(name = "InManipulateCustomerPositionExpenses02", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses02;
    @XmlElement(name = "InManipulateCustomerPositionExpenses03", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses03;
    @XmlElement(name = "InManipulateCustomerPositionExpenses04", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses04;
    @XmlElement(name = "InManipulateCustomerPositionExpenses05", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses05;
    @XmlElement(name = "InManipulateCustomerPositionExpenses06", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses06;
    @XmlElement(name = "InManipulateCustomerPositionExpenses07", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses07;
    @XmlElement(name = "InManipulateCustomerPositionExpenses08", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses08;
    @XmlElement(name = "InManipulateCustomerPositionExpenses09", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses09;
    @XmlElement(name = "InManipulateCustomerPositionExpenses10", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses10;
    @XmlElement(name = "InManipulateCustomerPositionExpenses11", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses11;
    @XmlElement(name = "InManipulateCustomerPositionExpenses12", required = true)
    protected BigDecimal inManipulateCustomerPositionExpenses12;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr00", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr00;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr01", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr01;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr02", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr02;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr03", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr03;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr04", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr04;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr05", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr05;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr06", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr06;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr07", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr07;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr08", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr08;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr09", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr09;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr10", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr10;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr11", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr11;
    @XmlElement(name = "InManipulateCustomerPositionInterestCr12", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestCr12;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb00", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb00;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb01", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb01;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb02", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb02;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb03", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb03;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb04", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb04;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb05", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb05;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb06", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb06;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb07", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb07;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb08", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb08;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb09", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb09;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb10", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb10;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb11", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb11;
    @XmlElement(name = "InManipulateCustomerPositionInterestDb12", required = true)
    protected BigDecimal inManipulateCustomerPositionInterestDb12;
    @XmlElement(name = "InManipulateCustomerPositionPenalty00", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty00;
    @XmlElement(name = "InManipulateCustomerPositionPenalty01", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty01;
    @XmlElement(name = "InManipulateCustomerPositionPenalty02", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty02;
    @XmlElement(name = "InManipulateCustomerPositionPenalty03", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty03;
    @XmlElement(name = "InManipulateCustomerPositionPenalty04", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty04;
    @XmlElement(name = "InManipulateCustomerPositionPenalty05", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty05;
    @XmlElement(name = "InManipulateCustomerPositionPenalty06", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty06;
    @XmlElement(name = "InManipulateCustomerPositionPenalty07", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty07;
    @XmlElement(name = "InManipulateCustomerPositionPenalty08", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty08;
    @XmlElement(name = "InManipulateCustomerPositionPenalty09", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty09;
    @XmlElement(name = "InManipulateCustomerPositionPenalty10", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty10;
    @XmlElement(name = "InManipulateCustomerPositionPenalty11", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty11;
    @XmlElement(name = "InManipulateCustomerPositionPenalty12", required = true)
    protected BigDecimal inManipulateCustomerPositionPenalty12;
    @XmlElement(name = "InManipulateCustomerPositionPosYear")
    protected short inManipulateCustomerPositionPosYear;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount11", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount11;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount12", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount12;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount13", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount13;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount14", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount14;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount15", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount15;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount16", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount16;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount17", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount17;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount18", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount18;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount19", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount19;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount20", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount20;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount21", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount21;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount22", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount22;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount23", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount23;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount24", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount24;
    @XmlElement(name = "InManipulateExtrnlAccInfoAmount25", required = true)
    protected BigDecimal inManipulateExtrnlAccInfoAmount25;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar1")
    protected String inManipulateExtrnlAccInfoChar1;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar10")
    protected String inManipulateExtrnlAccInfoChar10;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar2")
    protected String inManipulateExtrnlAccInfoChar2;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar3")
    protected String inManipulateExtrnlAccInfoChar3;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar4")
    protected String inManipulateExtrnlAccInfoChar4;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar5")
    protected String inManipulateExtrnlAccInfoChar5;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar6")
    protected String inManipulateExtrnlAccInfoChar6;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar7")
    protected String inManipulateExtrnlAccInfoChar7;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar8")
    protected String inManipulateExtrnlAccInfoChar8;
    @XmlElement(name = "InManipulateExtrnlAccInfoChar9")
    protected String inManipulateExtrnlAccInfoChar9;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate1;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate10;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate11", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate11;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate12", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate12;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate13", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate13;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate14;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate15", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate15;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate2;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate3;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate4;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate5;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate6;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate7;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate8;
    @XmlElement(name = "InManipulateExtrnlAccInfoDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateExtrnlAccInfoDate9;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag1")
    protected String inManipulateExtrnlAccInfoFlag1;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag10")
    protected String inManipulateExtrnlAccInfoFlag10;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag2")
    protected String inManipulateExtrnlAccInfoFlag2;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag3")
    protected String inManipulateExtrnlAccInfoFlag3;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag4")
    protected String inManipulateExtrnlAccInfoFlag4;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag5")
    protected String inManipulateExtrnlAccInfoFlag5;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag6")
    protected String inManipulateExtrnlAccInfoFlag6;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag7")
    protected String inManipulateExtrnlAccInfoFlag7;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag8")
    protected String inManipulateExtrnlAccInfoFlag8;
    @XmlElement(name = "InManipulateExtrnlAccInfoFlag9")
    protected String inManipulateExtrnlAccInfoFlag9;
    @XmlElement(name = "InManipulateExtrnlAccInfoLargeChar1")
    protected String inManipulateExtrnlAccInfoLargeChar1;
    @XmlElement(name = "InManipulateExtrnlAccInfoLargeChar2")
    protected String inManipulateExtrnlAccInfoLargeChar2;
    @XmlElement(name = "InManipulateExtrnlAccInfoLargeChar3")
    protected String inManipulateExtrnlAccInfoLargeChar3;
    @XmlElement(name = "InManipulateExtrnlAccInfoLargeChar4")
    protected String inManipulateExtrnlAccInfoLargeChar4;
    @XmlElement(name = "InManipulateExtrnlAccInfoLargeChar5")
    protected String inManipulateExtrnlAccInfoLargeChar5;
    @XmlElement(name = "InManipulateLimitCurrencyIdCurrency")
    protected int inManipulateLimitCurrencyIdCurrency;
    @XmlElement(name = "InManipulateLimitCurrencyShortDescr")
    protected String inManipulateLimitCurrencyShortDescr;
    @XmlElement(name = "InManipulateMovementCurrencyIdCurrency")
    protected int inManipulateMovementCurrencyIdCurrency;
    @XmlElement(name = "InManipulateMovementCurrencyShortDescr")
    protected String inManipulateMovementCurrencyShortDescr;
    @XmlElement(name = "InManipulateProductIdProduct")
    protected int inManipulateProductIdProduct;
    @XmlElement(name = "InManipulateProfitsAccountAccStatus")
    protected String inManipulateProfitsAccountAccStatus;
    @XmlElement(name = "InManipulateProfitsAccountAccountCd")
    protected short inManipulateProfitsAccountAccountCd;
    @XmlElement(name = "InManipulateProfitsAccountAccountNumber")
    protected String inManipulateProfitsAccountAccountNumber;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn1", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn1;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn10", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn10;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn2", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn2;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn3", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn3;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn4", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn4;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn5", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn5;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn6", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn6;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn7", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn7;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn8", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn8;
    @XmlElement(name = "InManipulateProfitsAccountExtsysAmn9", required = true)
    protected BigDecimal inManipulateProfitsAccountExtsysAmn9;
    @XmlElement(name = "InManipulateProfitsAccountExtsysProcessDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsAccountExtsysProcessDt;
    @XmlElement(name = "InManipulateProfitsAccountPrftSystem")
    protected short inManipulateProfitsAccountPrftSystem;
    @XmlElement(name = "InManipulateUnitCode")
    protected int inManipulateUnitCode;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InTrxUnitClearingHouseFlag")
    protected String inTrxUnitClearingHouseFlag;
    @XmlElement(name = "InTrxUnitCategoryGenericDetailSerialNum")
    protected int inTrxUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InTrxWorkDatesProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrxWorkDatesProductionDate;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inManipulateCustomerCDigit property.
     * 
     */
    public short getInManipulateCustomerCDigit() {
        return inManipulateCustomerCDigit;
    }

    /**
     * Sets the value of the inManipulateCustomerCDigit property.
     * 
     */
    public void setInManipulateCustomerCDigit(short value) {
        this.inManipulateCustomerCDigit = value;
    }

    /**
     * Gets the value of the inManipulateCustomerCustId property.
     * 
     */
    public int getInManipulateCustomerCustId() {
        return inManipulateCustomerCustId;
    }

    /**
     * Sets the value of the inManipulateCustomerCustId property.
     * 
     */
    public void setInManipulateCustomerCustId(int value) {
        this.inManipulateCustomerCustId = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr00() {
        return inManipulateCustomerPositionCapitalCr00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr00(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr01() {
        return inManipulateCustomerPositionCapitalCr01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr01(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr02() {
        return inManipulateCustomerPositionCapitalCr02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr02(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr03() {
        return inManipulateCustomerPositionCapitalCr03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr03(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr04() {
        return inManipulateCustomerPositionCapitalCr04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr04(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr05() {
        return inManipulateCustomerPositionCapitalCr05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr05(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr06() {
        return inManipulateCustomerPositionCapitalCr06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr06(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr07() {
        return inManipulateCustomerPositionCapitalCr07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr07(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr08() {
        return inManipulateCustomerPositionCapitalCr08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr08(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr09() {
        return inManipulateCustomerPositionCapitalCr09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr09(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr10() {
        return inManipulateCustomerPositionCapitalCr10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr10(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr11() {
        return inManipulateCustomerPositionCapitalCr11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr11(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalCr12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalCr12() {
        return inManipulateCustomerPositionCapitalCr12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalCr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalCr12(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalCr12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb00() {
        return inManipulateCustomerPositionCapitalDb00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb00(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb01() {
        return inManipulateCustomerPositionCapitalDb01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb01(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb02() {
        return inManipulateCustomerPositionCapitalDb02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb02(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb03() {
        return inManipulateCustomerPositionCapitalDb03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb03(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb04() {
        return inManipulateCustomerPositionCapitalDb04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb04(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb05() {
        return inManipulateCustomerPositionCapitalDb05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb05(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb06() {
        return inManipulateCustomerPositionCapitalDb06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb06(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb07() {
        return inManipulateCustomerPositionCapitalDb07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb07(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb08() {
        return inManipulateCustomerPositionCapitalDb08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb08(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb09() {
        return inManipulateCustomerPositionCapitalDb09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb09(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb10() {
        return inManipulateCustomerPositionCapitalDb10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb10(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb11() {
        return inManipulateCustomerPositionCapitalDb11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb11(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCapitalDb12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCapitalDb12() {
        return inManipulateCustomerPositionCapitalDb12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCapitalDb12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCapitalDb12(BigDecimal value) {
        this.inManipulateCustomerPositionCapitalDb12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission00() {
        return inManipulateCustomerPositionCommission00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission00(BigDecimal value) {
        this.inManipulateCustomerPositionCommission00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission01() {
        return inManipulateCustomerPositionCommission01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission01(BigDecimal value) {
        this.inManipulateCustomerPositionCommission01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission02() {
        return inManipulateCustomerPositionCommission02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission02(BigDecimal value) {
        this.inManipulateCustomerPositionCommission02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission03() {
        return inManipulateCustomerPositionCommission03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission03(BigDecimal value) {
        this.inManipulateCustomerPositionCommission03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission04() {
        return inManipulateCustomerPositionCommission04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission04(BigDecimal value) {
        this.inManipulateCustomerPositionCommission04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission05() {
        return inManipulateCustomerPositionCommission05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission05(BigDecimal value) {
        this.inManipulateCustomerPositionCommission05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission06() {
        return inManipulateCustomerPositionCommission06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission06(BigDecimal value) {
        this.inManipulateCustomerPositionCommission06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission07() {
        return inManipulateCustomerPositionCommission07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission07(BigDecimal value) {
        this.inManipulateCustomerPositionCommission07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission08() {
        return inManipulateCustomerPositionCommission08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission08(BigDecimal value) {
        this.inManipulateCustomerPositionCommission08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission09() {
        return inManipulateCustomerPositionCommission09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission09(BigDecimal value) {
        this.inManipulateCustomerPositionCommission09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission10() {
        return inManipulateCustomerPositionCommission10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission10(BigDecimal value) {
        this.inManipulateCustomerPositionCommission10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission11() {
        return inManipulateCustomerPositionCommission11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission11(BigDecimal value) {
        this.inManipulateCustomerPositionCommission11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionCommission12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionCommission12() {
        return inManipulateCustomerPositionCommission12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionCommission12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionCommission12(BigDecimal value) {
        this.inManipulateCustomerPositionCommission12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses00() {
        return inManipulateCustomerPositionExpenses00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses00(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses01() {
        return inManipulateCustomerPositionExpenses01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses01(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses02() {
        return inManipulateCustomerPositionExpenses02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses02(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses03() {
        return inManipulateCustomerPositionExpenses03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses03(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses04() {
        return inManipulateCustomerPositionExpenses04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses04(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses05() {
        return inManipulateCustomerPositionExpenses05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses05(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses06() {
        return inManipulateCustomerPositionExpenses06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses06(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses07() {
        return inManipulateCustomerPositionExpenses07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses07(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses08() {
        return inManipulateCustomerPositionExpenses08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses08(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses09() {
        return inManipulateCustomerPositionExpenses09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses09(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses10() {
        return inManipulateCustomerPositionExpenses10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses10(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses11() {
        return inManipulateCustomerPositionExpenses11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses11(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionExpenses12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionExpenses12() {
        return inManipulateCustomerPositionExpenses12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionExpenses12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionExpenses12(BigDecimal value) {
        this.inManipulateCustomerPositionExpenses12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr00() {
        return inManipulateCustomerPositionInterestCr00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr00(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr01() {
        return inManipulateCustomerPositionInterestCr01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr01(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr02() {
        return inManipulateCustomerPositionInterestCr02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr02(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr03() {
        return inManipulateCustomerPositionInterestCr03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr03(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr04() {
        return inManipulateCustomerPositionInterestCr04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr04(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr05() {
        return inManipulateCustomerPositionInterestCr05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr05(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr06() {
        return inManipulateCustomerPositionInterestCr06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr06(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr07() {
        return inManipulateCustomerPositionInterestCr07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr07(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr08() {
        return inManipulateCustomerPositionInterestCr08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr08(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr09() {
        return inManipulateCustomerPositionInterestCr09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr09(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr10() {
        return inManipulateCustomerPositionInterestCr10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr10(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr11() {
        return inManipulateCustomerPositionInterestCr11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr11(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestCr12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestCr12() {
        return inManipulateCustomerPositionInterestCr12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestCr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestCr12(BigDecimal value) {
        this.inManipulateCustomerPositionInterestCr12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb00() {
        return inManipulateCustomerPositionInterestDb00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb00(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb01() {
        return inManipulateCustomerPositionInterestDb01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb01(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb02() {
        return inManipulateCustomerPositionInterestDb02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb02(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb03() {
        return inManipulateCustomerPositionInterestDb03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb03(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb04() {
        return inManipulateCustomerPositionInterestDb04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb04(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb05() {
        return inManipulateCustomerPositionInterestDb05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb05(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb06() {
        return inManipulateCustomerPositionInterestDb06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb06(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb07() {
        return inManipulateCustomerPositionInterestDb07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb07(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb08() {
        return inManipulateCustomerPositionInterestDb08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb08(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb09() {
        return inManipulateCustomerPositionInterestDb09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb09(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb10() {
        return inManipulateCustomerPositionInterestDb10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb10(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb11() {
        return inManipulateCustomerPositionInterestDb11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb11(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionInterestDb12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionInterestDb12() {
        return inManipulateCustomerPositionInterestDb12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionInterestDb12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionInterestDb12(BigDecimal value) {
        this.inManipulateCustomerPositionInterestDb12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty00 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty00() {
        return inManipulateCustomerPositionPenalty00;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty00(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty00 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty01() {
        return inManipulateCustomerPositionPenalty01;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty01(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty01 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty02() {
        return inManipulateCustomerPositionPenalty02;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty02(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty02 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty03() {
        return inManipulateCustomerPositionPenalty03;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty03(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty03 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty04() {
        return inManipulateCustomerPositionPenalty04;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty04(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty04 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty05() {
        return inManipulateCustomerPositionPenalty05;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty05(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty05 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty06() {
        return inManipulateCustomerPositionPenalty06;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty06(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty06 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty07() {
        return inManipulateCustomerPositionPenalty07;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty07(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty07 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty08() {
        return inManipulateCustomerPositionPenalty08;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty08(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty08 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty09() {
        return inManipulateCustomerPositionPenalty09;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty09(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty09 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty10() {
        return inManipulateCustomerPositionPenalty10;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty10(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty10 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty11() {
        return inManipulateCustomerPositionPenalty11;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty11(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty11 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPenalty12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCustomerPositionPenalty12() {
        return inManipulateCustomerPositionPenalty12;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPenalty12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCustomerPositionPenalty12(BigDecimal value) {
        this.inManipulateCustomerPositionPenalty12 = value;
    }

    /**
     * Gets the value of the inManipulateCustomerPositionPosYear property.
     * 
     */
    public short getInManipulateCustomerPositionPosYear() {
        return inManipulateCustomerPositionPosYear;
    }

    /**
     * Sets the value of the inManipulateCustomerPositionPosYear property.
     * 
     */
    public void setInManipulateCustomerPositionPosYear(short value) {
        this.inManipulateCustomerPositionPosYear = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount11() {
        return inManipulateExtrnlAccInfoAmount11;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount11(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount11 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount12() {
        return inManipulateExtrnlAccInfoAmount12;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount12(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount12 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount13() {
        return inManipulateExtrnlAccInfoAmount13;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount13(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount13 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount14() {
        return inManipulateExtrnlAccInfoAmount14;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount14(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount14 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount15() {
        return inManipulateExtrnlAccInfoAmount15;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount15(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount15 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount16 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount16() {
        return inManipulateExtrnlAccInfoAmount16;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount16(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount16 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount17 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount17() {
        return inManipulateExtrnlAccInfoAmount17;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount17(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount17 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount18 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount18() {
        return inManipulateExtrnlAccInfoAmount18;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount18(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount18 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount19 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount19() {
        return inManipulateExtrnlAccInfoAmount19;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount19(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount19 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount20 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount20() {
        return inManipulateExtrnlAccInfoAmount20;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount20(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount20 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount21 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount21() {
        return inManipulateExtrnlAccInfoAmount21;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount21(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount21 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount22 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount22() {
        return inManipulateExtrnlAccInfoAmount22;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount22(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount22 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount23 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount23() {
        return inManipulateExtrnlAccInfoAmount23;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount23(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount23 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount24 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount24() {
        return inManipulateExtrnlAccInfoAmount24;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount24(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount24 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoAmount25 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateExtrnlAccInfoAmount25() {
        return inManipulateExtrnlAccInfoAmount25;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoAmount25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateExtrnlAccInfoAmount25(BigDecimal value) {
        this.inManipulateExtrnlAccInfoAmount25 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar1() {
        return inManipulateExtrnlAccInfoChar1;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar1(String value) {
        this.inManipulateExtrnlAccInfoChar1 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar10() {
        return inManipulateExtrnlAccInfoChar10;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar10(String value) {
        this.inManipulateExtrnlAccInfoChar10 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar2() {
        return inManipulateExtrnlAccInfoChar2;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar2(String value) {
        this.inManipulateExtrnlAccInfoChar2 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar3() {
        return inManipulateExtrnlAccInfoChar3;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar3(String value) {
        this.inManipulateExtrnlAccInfoChar3 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar4() {
        return inManipulateExtrnlAccInfoChar4;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar4(String value) {
        this.inManipulateExtrnlAccInfoChar4 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar5() {
        return inManipulateExtrnlAccInfoChar5;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar5(String value) {
        this.inManipulateExtrnlAccInfoChar5 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar6() {
        return inManipulateExtrnlAccInfoChar6;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar6(String value) {
        this.inManipulateExtrnlAccInfoChar6 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar7() {
        return inManipulateExtrnlAccInfoChar7;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar7(String value) {
        this.inManipulateExtrnlAccInfoChar7 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar8() {
        return inManipulateExtrnlAccInfoChar8;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar8(String value) {
        this.inManipulateExtrnlAccInfoChar8 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoChar9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoChar9() {
        return inManipulateExtrnlAccInfoChar9;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoChar9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoChar9(String value) {
        this.inManipulateExtrnlAccInfoChar9 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate1() {
        return inManipulateExtrnlAccInfoDate1;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate1(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate1 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate10() {
        return inManipulateExtrnlAccInfoDate10;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate10(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate10 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate11() {
        return inManipulateExtrnlAccInfoDate11;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate11(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate11 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate12() {
        return inManipulateExtrnlAccInfoDate12;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate12(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate12 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate13() {
        return inManipulateExtrnlAccInfoDate13;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate13(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate13 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate14() {
        return inManipulateExtrnlAccInfoDate14;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate14(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate14 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate15() {
        return inManipulateExtrnlAccInfoDate15;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate15(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate15 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate2() {
        return inManipulateExtrnlAccInfoDate2;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate2(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate2 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate3() {
        return inManipulateExtrnlAccInfoDate3;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate3(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate3 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate4() {
        return inManipulateExtrnlAccInfoDate4;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate4(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate4 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate5() {
        return inManipulateExtrnlAccInfoDate5;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate5(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate5 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate6() {
        return inManipulateExtrnlAccInfoDate6;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate6(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate6 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate7() {
        return inManipulateExtrnlAccInfoDate7;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate7(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate7 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate8() {
        return inManipulateExtrnlAccInfoDate8;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate8(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate8 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateExtrnlAccInfoDate9() {
        return inManipulateExtrnlAccInfoDate9;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateExtrnlAccInfoDate9(XMLGregorianCalendar value) {
        this.inManipulateExtrnlAccInfoDate9 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag1() {
        return inManipulateExtrnlAccInfoFlag1;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag1(String value) {
        this.inManipulateExtrnlAccInfoFlag1 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag10() {
        return inManipulateExtrnlAccInfoFlag10;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag10(String value) {
        this.inManipulateExtrnlAccInfoFlag10 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag2() {
        return inManipulateExtrnlAccInfoFlag2;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag2(String value) {
        this.inManipulateExtrnlAccInfoFlag2 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag3() {
        return inManipulateExtrnlAccInfoFlag3;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag3(String value) {
        this.inManipulateExtrnlAccInfoFlag3 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag4() {
        return inManipulateExtrnlAccInfoFlag4;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag4(String value) {
        this.inManipulateExtrnlAccInfoFlag4 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag5() {
        return inManipulateExtrnlAccInfoFlag5;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag5(String value) {
        this.inManipulateExtrnlAccInfoFlag5 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag6() {
        return inManipulateExtrnlAccInfoFlag6;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag6(String value) {
        this.inManipulateExtrnlAccInfoFlag6 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag7() {
        return inManipulateExtrnlAccInfoFlag7;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag7(String value) {
        this.inManipulateExtrnlAccInfoFlag7 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag8() {
        return inManipulateExtrnlAccInfoFlag8;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag8(String value) {
        this.inManipulateExtrnlAccInfoFlag8 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoFlag9() {
        return inManipulateExtrnlAccInfoFlag9;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoFlag9(String value) {
        this.inManipulateExtrnlAccInfoFlag9 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoLargeChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoLargeChar1() {
        return inManipulateExtrnlAccInfoLargeChar1;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoLargeChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoLargeChar1(String value) {
        this.inManipulateExtrnlAccInfoLargeChar1 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoLargeChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoLargeChar2() {
        return inManipulateExtrnlAccInfoLargeChar2;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoLargeChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoLargeChar2(String value) {
        this.inManipulateExtrnlAccInfoLargeChar2 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoLargeChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoLargeChar3() {
        return inManipulateExtrnlAccInfoLargeChar3;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoLargeChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoLargeChar3(String value) {
        this.inManipulateExtrnlAccInfoLargeChar3 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoLargeChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoLargeChar4() {
        return inManipulateExtrnlAccInfoLargeChar4;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoLargeChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoLargeChar4(String value) {
        this.inManipulateExtrnlAccInfoLargeChar4 = value;
    }

    /**
     * Gets the value of the inManipulateExtrnlAccInfoLargeChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateExtrnlAccInfoLargeChar5() {
        return inManipulateExtrnlAccInfoLargeChar5;
    }

    /**
     * Sets the value of the inManipulateExtrnlAccInfoLargeChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateExtrnlAccInfoLargeChar5(String value) {
        this.inManipulateExtrnlAccInfoLargeChar5 = value;
    }

    /**
     * Gets the value of the inManipulateLimitCurrencyIdCurrency property.
     * 
     */
    public int getInManipulateLimitCurrencyIdCurrency() {
        return inManipulateLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inManipulateLimitCurrencyIdCurrency property.
     * 
     */
    public void setInManipulateLimitCurrencyIdCurrency(int value) {
        this.inManipulateLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inManipulateLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateLimitCurrencyShortDescr() {
        return inManipulateLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the inManipulateLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateLimitCurrencyShortDescr(String value) {
        this.inManipulateLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inManipulateMovementCurrencyIdCurrency property.
     * 
     */
    public int getInManipulateMovementCurrencyIdCurrency() {
        return inManipulateMovementCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inManipulateMovementCurrencyIdCurrency property.
     * 
     */
    public void setInManipulateMovementCurrencyIdCurrency(int value) {
        this.inManipulateMovementCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inManipulateMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateMovementCurrencyShortDescr() {
        return inManipulateMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the inManipulateMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateMovementCurrencyShortDescr(String value) {
        this.inManipulateMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inManipulateProductIdProduct property.
     * 
     */
    public int getInManipulateProductIdProduct() {
        return inManipulateProductIdProduct;
    }

    /**
     * Sets the value of the inManipulateProductIdProduct property.
     * 
     */
    public void setInManipulateProductIdProduct(int value) {
        this.inManipulateProductIdProduct = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsAccountAccStatus() {
        return inManipulateProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsAccountAccStatus(String value) {
        this.inManipulateProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountAccountCd property.
     * 
     */
    public short getInManipulateProfitsAccountAccountCd() {
        return inManipulateProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountAccountCd property.
     * 
     */
    public void setInManipulateProfitsAccountAccountCd(short value) {
        this.inManipulateProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsAccountAccountNumber() {
        return inManipulateProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsAccountAccountNumber(String value) {
        this.inManipulateProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn1() {
        return inManipulateProfitsAccountExtsysAmn1;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn1(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn10() {
        return inManipulateProfitsAccountExtsysAmn10;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn10(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn2() {
        return inManipulateProfitsAccountExtsysAmn2;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn2(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn3() {
        return inManipulateProfitsAccountExtsysAmn3;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn3(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn4() {
        return inManipulateProfitsAccountExtsysAmn4;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn4(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn5() {
        return inManipulateProfitsAccountExtsysAmn5;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn5(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn6() {
        return inManipulateProfitsAccountExtsysAmn6;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn6(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn7() {
        return inManipulateProfitsAccountExtsysAmn7;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn7(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn8() {
        return inManipulateProfitsAccountExtsysAmn8;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn8(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysAmn9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsAccountExtsysAmn9() {
        return inManipulateProfitsAccountExtsysAmn9;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysAmn9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsAccountExtsysAmn9(BigDecimal value) {
        this.inManipulateProfitsAccountExtsysAmn9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountExtsysProcessDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsAccountExtsysProcessDt() {
        return inManipulateProfitsAccountExtsysProcessDt;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountExtsysProcessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsAccountExtsysProcessDt(XMLGregorianCalendar value) {
        this.inManipulateProfitsAccountExtsysProcessDt = value;
    }

    /**
     * Gets the value of the inManipulateProfitsAccountPrftSystem property.
     * 
     */
    public short getInManipulateProfitsAccountPrftSystem() {
        return inManipulateProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inManipulateProfitsAccountPrftSystem property.
     * 
     */
    public void setInManipulateProfitsAccountPrftSystem(short value) {
        this.inManipulateProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inManipulateUnitCode property.
     * 
     */
    public int getInManipulateUnitCode() {
        return inManipulateUnitCode;
    }

    /**
     * Sets the value of the inManipulateUnitCode property.
     * 
     */
    public void setInManipulateUnitCode(int value) {
        this.inManipulateUnitCode = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inTrxUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxUnitClearingHouseFlag() {
        return inTrxUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inTrxUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxUnitClearingHouseFlag(String value) {
        this.inTrxUnitClearingHouseFlag = value;
    }

    /**
     * Gets the value of the inTrxUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInTrxUnitCategoryGenericDetailSerialNum() {
        return inTrxUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTrxUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInTrxUnitCategoryGenericDetailSerialNum(int value) {
        this.inTrxUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inTrxWorkDatesProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrxWorkDatesProductionDate() {
        return inTrxWorkDatesProductionDate;
    }

    /**
     * Sets the value of the inTrxWorkDatesProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrxWorkDatesProductionDate(XMLGregorianCalendar value) {
        this.inTrxWorkDatesProductionDate = value;
    }

}
