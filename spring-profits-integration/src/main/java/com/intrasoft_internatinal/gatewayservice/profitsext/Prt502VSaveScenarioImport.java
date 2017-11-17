
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prt502vSaveScenarioImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt502vSaveScenarioImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountCd3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountNumber3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountSystem3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount13" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount14" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateProfitsScenarioApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioCurrencyId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCurrencyId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCurrencyId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate11" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate12" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate13" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate14" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate15" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInteger9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioKeySystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateProfitsScenarioProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRetrieveProfitsScenarioKeySn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRetrieveProfitsScenarioKeySystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRetrieveProfitsScenarioKeyTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRtrvApplicationProfitsScenarioApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRtrvApplicationProfitsScenarioKeySn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRtrvApplicationProfitsScenarioKeySystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRtrvApplicationProfitsScenarioKeyTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateProfitsScenarioUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioScenarioSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioScenarioAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioScenarioAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd6" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd7" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd8" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd9" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerId10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateProfitsScenarioCustomerCd10" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountNumber4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountCd4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountSystem4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountNumber5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountCd5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioAccountSystem5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateProfitsScenarioLargeDesc10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForProfitsProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InForProfitsProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForProfitsProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InForProfitsProfitsScenarioKeyTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InForProfitsProfitsScenarioKeySystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InForProfitsProfitsScenarioKeySn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InForProfitsProfitsScenarioApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt502vSaveScenarioImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inManipulateProfitsScenarioAccountCd1",
    "inManipulateProfitsScenarioAccountCd2",
    "inManipulateProfitsScenarioAccountCd3",
    "inManipulateProfitsScenarioAccountNumber1",
    "inManipulateProfitsScenarioAccountNumber2",
    "inManipulateProfitsScenarioAccountNumber3",
    "inManipulateProfitsScenarioAccountSystem1",
    "inManipulateProfitsScenarioAccountSystem2",
    "inManipulateProfitsScenarioAccountSystem3",
    "inManipulateProfitsScenarioAmount1",
    "inManipulateProfitsScenarioAmount10",
    "inManipulateProfitsScenarioAmount11",
    "inManipulateProfitsScenarioAmount12",
    "inManipulateProfitsScenarioAmount13",
    "inManipulateProfitsScenarioAmount14",
    "inManipulateProfitsScenarioAmount15",
    "inManipulateProfitsScenarioAmount1841",
    "inManipulateProfitsScenarioAmount1842",
    "inManipulateProfitsScenarioAmount1843",
    "inManipulateProfitsScenarioAmount2",
    "inManipulateProfitsScenarioAmount3",
    "inManipulateProfitsScenarioAmount4",
    "inManipulateProfitsScenarioAmount5",
    "inManipulateProfitsScenarioAmount6",
    "inManipulateProfitsScenarioAmount7",
    "inManipulateProfitsScenarioAmount8",
    "inManipulateProfitsScenarioAmount9",
    "inManipulateProfitsScenarioApplicationId",
    "inManipulateProfitsScenarioApplicationSts",
    "inManipulateProfitsScenarioCurrencyId1",
    "inManipulateProfitsScenarioCurrencyId2",
    "inManipulateProfitsScenarioCurrencyId3",
    "inManipulateProfitsScenarioCustomerCd1",
    "inManipulateProfitsScenarioCustomerCd2",
    "inManipulateProfitsScenarioCustomerCd3",
    "inManipulateProfitsScenarioCustomerId1",
    "inManipulateProfitsScenarioCustomerId2",
    "inManipulateProfitsScenarioCustomerId3",
    "inManipulateProfitsScenarioDate1",
    "inManipulateProfitsScenarioDate10",
    "inManipulateProfitsScenarioDate11",
    "inManipulateProfitsScenarioDate12",
    "inManipulateProfitsScenarioDate13",
    "inManipulateProfitsScenarioDate14",
    "inManipulateProfitsScenarioDate15",
    "inManipulateProfitsScenarioDate2",
    "inManipulateProfitsScenarioDate3",
    "inManipulateProfitsScenarioDate4",
    "inManipulateProfitsScenarioDate5",
    "inManipulateProfitsScenarioDate6",
    "inManipulateProfitsScenarioDate7",
    "inManipulateProfitsScenarioDate8",
    "inManipulateProfitsScenarioDate9",
    "inManipulateProfitsScenarioDescr1",
    "inManipulateProfitsScenarioDescr10",
    "inManipulateProfitsScenarioDescr2",
    "inManipulateProfitsScenarioDescr3",
    "inManipulateProfitsScenarioDescr4",
    "inManipulateProfitsScenarioDescr5",
    "inManipulateProfitsScenarioDescr6",
    "inManipulateProfitsScenarioDescr7",
    "inManipulateProfitsScenarioDescr8",
    "inManipulateProfitsScenarioDescr9",
    "inManipulateProfitsScenarioFlag1",
    "inManipulateProfitsScenarioFlag10",
    "inManipulateProfitsScenarioFlag2",
    "inManipulateProfitsScenarioFlag3",
    "inManipulateProfitsScenarioFlag4",
    "inManipulateProfitsScenarioFlag5",
    "inManipulateProfitsScenarioFlag6",
    "inManipulateProfitsScenarioFlag7",
    "inManipulateProfitsScenarioFlag8",
    "inManipulateProfitsScenarioFlag9",
    "inManipulateProfitsScenarioInteger1",
    "inManipulateProfitsScenarioInteger10",
    "inManipulateProfitsScenarioInteger2",
    "inManipulateProfitsScenarioInteger3",
    "inManipulateProfitsScenarioInteger4",
    "inManipulateProfitsScenarioInteger5",
    "inManipulateProfitsScenarioInteger6",
    "inManipulateProfitsScenarioInteger7",
    "inManipulateProfitsScenarioInteger8",
    "inManipulateProfitsScenarioInteger9",
    "inManipulateProfitsScenarioKeySystem",
    "inManipulateProfitsScenarioLargeDesc1",
    "inManipulateProfitsScenarioLargeDesc2",
    "inManipulateProfitsScenarioLargeDesc3",
    "inManipulateProfitsScenarioNumber1",
    "inManipulateProfitsScenarioNumber10",
    "inManipulateProfitsScenarioNumber2",
    "inManipulateProfitsScenarioNumber3",
    "inManipulateProfitsScenarioNumber4",
    "inManipulateProfitsScenarioNumber5",
    "inManipulateProfitsScenarioNumber6",
    "inManipulateProfitsScenarioNumber7",
    "inManipulateProfitsScenarioNumber8",
    "inManipulateProfitsScenarioNumber9",
    "inManipulateProfitsScenarioProductId",
    "inRetrieveProfitsScenarioKeySn",
    "inRetrieveProfitsScenarioKeySystem",
    "inRetrieveProfitsScenarioKeyTmstamp",
    "inRtrvApplicationProfitsScenarioApplicationId",
    "inRtrvApplicationProfitsScenarioKeySn",
    "inRtrvApplicationProfitsScenarioKeySystem",
    "inRtrvApplicationProfitsScenarioKeyTmstamp",
    "inTrxTerminalTerminalNumber",
    "inManipulateProfitsScenarioInsertDate",
    "inManipulateProfitsScenarioInsertUnit",
    "inManipulateProfitsScenarioInsertUser",
    "inManipulateProfitsScenarioUpdateDate",
    "inManipulateProfitsScenarioUpdateUnit",
    "inManipulateProfitsScenarioUpdateUser",
    "inManipulateProfitsScenarioScenarioSts",
    "inManipulateProfitsScenarioScenarioAccount",
    "inManipulateProfitsScenarioScenarioAccountCd",
    "inManipulateProfitsScenarioCustomerId4",
    "inManipulateProfitsScenarioCustomerCd4",
    "inManipulateProfitsScenarioCustomerId5",
    "inManipulateProfitsScenarioCustomerCd5",
    "inManipulateProfitsScenarioCustomerId6",
    "inManipulateProfitsScenarioCustomerCd6",
    "inManipulateProfitsScenarioCustomerId7",
    "inManipulateProfitsScenarioCustomerCd7",
    "inManipulateProfitsScenarioCustomerId8",
    "inManipulateProfitsScenarioCustomerCd8",
    "inManipulateProfitsScenarioCustomerId9",
    "inManipulateProfitsScenarioCustomerCd9",
    "inManipulateProfitsScenarioCustomerId10",
    "inManipulateProfitsScenarioCustomerCd10",
    "inManipulateProfitsScenarioAccountNumber4",
    "inManipulateProfitsScenarioAccountCd4",
    "inManipulateProfitsScenarioAccountSystem4",
    "inManipulateProfitsScenarioAccountNumber5",
    "inManipulateProfitsScenarioAccountCd5",
    "inManipulateProfitsScenarioAccountSystem5",
    "inManipulateProfitsScenarioDescr11",
    "inManipulateProfitsScenarioDescr12",
    "inManipulateProfitsScenarioDescr13",
    "inManipulateProfitsScenarioDescr14",
    "inManipulateProfitsScenarioDescr15",
    "inManipulateProfitsScenarioDescr16",
    "inManipulateProfitsScenarioDescr17",
    "inManipulateProfitsScenarioDescr18",
    "inManipulateProfitsScenarioDescr19",
    "inManipulateProfitsScenarioDescr20",
    "inManipulateProfitsScenarioLargeDesc4",
    "inManipulateProfitsScenarioLargeDesc5",
    "inManipulateProfitsScenarioLargeDesc6",
    "inManipulateProfitsScenarioLargeDesc7",
    "inManipulateProfitsScenarioLargeDesc8",
    "inManipulateProfitsScenarioLargeDesc9",
    "inManipulateProfitsScenarioLargeDesc10",
    "inForProfitsProfitsAccountPrftSystem",
    "inForProfitsProfitsAccountAccountNumber",
    "inForProfitsProfitsAccountAccountCd",
    "inForProfitsProfitsScenarioKeyTmstamp",
    "inForProfitsProfitsScenarioKeySystem",
    "inForProfitsProfitsScenarioKeySn",
    "inForProfitsProfitsScenarioApplicationId"
})
public class Prt502VSaveScenarioImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InManipulateProfitsScenarioAccountCd1")
    protected short inManipulateProfitsScenarioAccountCd1;
    @XmlElement(name = "InManipulateProfitsScenarioAccountCd2")
    protected short inManipulateProfitsScenarioAccountCd2;
    @XmlElement(name = "InManipulateProfitsScenarioAccountCd3")
    protected short inManipulateProfitsScenarioAccountCd3;
    @XmlElement(name = "InManipulateProfitsScenarioAccountNumber1")
    protected String inManipulateProfitsScenarioAccountNumber1;
    @XmlElement(name = "InManipulateProfitsScenarioAccountNumber2")
    protected String inManipulateProfitsScenarioAccountNumber2;
    @XmlElement(name = "InManipulateProfitsScenarioAccountNumber3")
    protected String inManipulateProfitsScenarioAccountNumber3;
    @XmlElement(name = "InManipulateProfitsScenarioAccountSystem1")
    protected short inManipulateProfitsScenarioAccountSystem1;
    @XmlElement(name = "InManipulateProfitsScenarioAccountSystem2")
    protected short inManipulateProfitsScenarioAccountSystem2;
    @XmlElement(name = "InManipulateProfitsScenarioAccountSystem3")
    protected short inManipulateProfitsScenarioAccountSystem3;
    @XmlElement(name = "InManipulateProfitsScenarioAmount1", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount1;
    @XmlElement(name = "InManipulateProfitsScenarioAmount10", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount10;
    @XmlElement(name = "InManipulateProfitsScenarioAmount11", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount11;
    @XmlElement(name = "InManipulateProfitsScenarioAmount12", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount12;
    @XmlElement(name = "InManipulateProfitsScenarioAmount13", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount13;
    @XmlElement(name = "InManipulateProfitsScenarioAmount14", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount14;
    @XmlElement(name = "InManipulateProfitsScenarioAmount15", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount15;
    @XmlElement(name = "InManipulateProfitsScenarioAmount1841", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount1841;
    @XmlElement(name = "InManipulateProfitsScenarioAmount1842", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount1842;
    @XmlElement(name = "InManipulateProfitsScenarioAmount1843", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount1843;
    @XmlElement(name = "InManipulateProfitsScenarioAmount2", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount2;
    @XmlElement(name = "InManipulateProfitsScenarioAmount3", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount3;
    @XmlElement(name = "InManipulateProfitsScenarioAmount4", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount4;
    @XmlElement(name = "InManipulateProfitsScenarioAmount5", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount5;
    @XmlElement(name = "InManipulateProfitsScenarioAmount6", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount6;
    @XmlElement(name = "InManipulateProfitsScenarioAmount7", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount7;
    @XmlElement(name = "InManipulateProfitsScenarioAmount8", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount8;
    @XmlElement(name = "InManipulateProfitsScenarioAmount9", required = true)
    protected BigDecimal inManipulateProfitsScenarioAmount9;
    @XmlElement(name = "InManipulateProfitsScenarioApplicationId")
    protected String inManipulateProfitsScenarioApplicationId;
    @XmlElement(name = "InManipulateProfitsScenarioApplicationSts")
    protected String inManipulateProfitsScenarioApplicationSts;
    @XmlElement(name = "InManipulateProfitsScenarioCurrencyId1")
    protected int inManipulateProfitsScenarioCurrencyId1;
    @XmlElement(name = "InManipulateProfitsScenarioCurrencyId2")
    protected int inManipulateProfitsScenarioCurrencyId2;
    @XmlElement(name = "InManipulateProfitsScenarioCurrencyId3")
    protected int inManipulateProfitsScenarioCurrencyId3;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd1")
    protected short inManipulateProfitsScenarioCustomerCd1;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd2")
    protected short inManipulateProfitsScenarioCustomerCd2;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd3")
    protected short inManipulateProfitsScenarioCustomerCd3;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId1")
    protected int inManipulateProfitsScenarioCustomerId1;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId2")
    protected int inManipulateProfitsScenarioCustomerId2;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId3")
    protected int inManipulateProfitsScenarioCustomerId3;
    @XmlElement(name = "InManipulateProfitsScenarioDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate1;
    @XmlElement(name = "InManipulateProfitsScenarioDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate10;
    @XmlElement(name = "InManipulateProfitsScenarioDate11", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate11;
    @XmlElement(name = "InManipulateProfitsScenarioDate12", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate12;
    @XmlElement(name = "InManipulateProfitsScenarioDate13", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate13;
    @XmlElement(name = "InManipulateProfitsScenarioDate14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate14;
    @XmlElement(name = "InManipulateProfitsScenarioDate15", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate15;
    @XmlElement(name = "InManipulateProfitsScenarioDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate2;
    @XmlElement(name = "InManipulateProfitsScenarioDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate3;
    @XmlElement(name = "InManipulateProfitsScenarioDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate4;
    @XmlElement(name = "InManipulateProfitsScenarioDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate5;
    @XmlElement(name = "InManipulateProfitsScenarioDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate6;
    @XmlElement(name = "InManipulateProfitsScenarioDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate7;
    @XmlElement(name = "InManipulateProfitsScenarioDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate8;
    @XmlElement(name = "InManipulateProfitsScenarioDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioDate9;
    @XmlElement(name = "InManipulateProfitsScenarioDescr1")
    protected String inManipulateProfitsScenarioDescr1;
    @XmlElement(name = "InManipulateProfitsScenarioDescr10")
    protected String inManipulateProfitsScenarioDescr10;
    @XmlElement(name = "InManipulateProfitsScenarioDescr2")
    protected String inManipulateProfitsScenarioDescr2;
    @XmlElement(name = "InManipulateProfitsScenarioDescr3")
    protected String inManipulateProfitsScenarioDescr3;
    @XmlElement(name = "InManipulateProfitsScenarioDescr4")
    protected String inManipulateProfitsScenarioDescr4;
    @XmlElement(name = "InManipulateProfitsScenarioDescr5")
    protected String inManipulateProfitsScenarioDescr5;
    @XmlElement(name = "InManipulateProfitsScenarioDescr6")
    protected String inManipulateProfitsScenarioDescr6;
    @XmlElement(name = "InManipulateProfitsScenarioDescr7")
    protected String inManipulateProfitsScenarioDescr7;
    @XmlElement(name = "InManipulateProfitsScenarioDescr8")
    protected String inManipulateProfitsScenarioDescr8;
    @XmlElement(name = "InManipulateProfitsScenarioDescr9")
    protected String inManipulateProfitsScenarioDescr9;
    @XmlElement(name = "InManipulateProfitsScenarioFlag1")
    protected String inManipulateProfitsScenarioFlag1;
    @XmlElement(name = "InManipulateProfitsScenarioFlag10")
    protected String inManipulateProfitsScenarioFlag10;
    @XmlElement(name = "InManipulateProfitsScenarioFlag2")
    protected String inManipulateProfitsScenarioFlag2;
    @XmlElement(name = "InManipulateProfitsScenarioFlag3")
    protected String inManipulateProfitsScenarioFlag3;
    @XmlElement(name = "InManipulateProfitsScenarioFlag4")
    protected String inManipulateProfitsScenarioFlag4;
    @XmlElement(name = "InManipulateProfitsScenarioFlag5")
    protected String inManipulateProfitsScenarioFlag5;
    @XmlElement(name = "InManipulateProfitsScenarioFlag6")
    protected String inManipulateProfitsScenarioFlag6;
    @XmlElement(name = "InManipulateProfitsScenarioFlag7")
    protected String inManipulateProfitsScenarioFlag7;
    @XmlElement(name = "InManipulateProfitsScenarioFlag8")
    protected String inManipulateProfitsScenarioFlag8;
    @XmlElement(name = "InManipulateProfitsScenarioFlag9")
    protected String inManipulateProfitsScenarioFlag9;
    @XmlElement(name = "InManipulateProfitsScenarioInteger1")
    protected int inManipulateProfitsScenarioInteger1;
    @XmlElement(name = "InManipulateProfitsScenarioInteger10")
    protected int inManipulateProfitsScenarioInteger10;
    @XmlElement(name = "InManipulateProfitsScenarioInteger2")
    protected int inManipulateProfitsScenarioInteger2;
    @XmlElement(name = "InManipulateProfitsScenarioInteger3")
    protected int inManipulateProfitsScenarioInteger3;
    @XmlElement(name = "InManipulateProfitsScenarioInteger4")
    protected int inManipulateProfitsScenarioInteger4;
    @XmlElement(name = "InManipulateProfitsScenarioInteger5")
    protected int inManipulateProfitsScenarioInteger5;
    @XmlElement(name = "InManipulateProfitsScenarioInteger6")
    protected int inManipulateProfitsScenarioInteger6;
    @XmlElement(name = "InManipulateProfitsScenarioInteger7")
    protected int inManipulateProfitsScenarioInteger7;
    @XmlElement(name = "InManipulateProfitsScenarioInteger8")
    protected int inManipulateProfitsScenarioInteger8;
    @XmlElement(name = "InManipulateProfitsScenarioInteger9")
    protected int inManipulateProfitsScenarioInteger9;
    @XmlElement(name = "InManipulateProfitsScenarioKeySystem")
    protected short inManipulateProfitsScenarioKeySystem;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc1")
    protected String inManipulateProfitsScenarioLargeDesc1;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc2")
    protected String inManipulateProfitsScenarioLargeDesc2;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc3")
    protected String inManipulateProfitsScenarioLargeDesc3;
    @XmlElement(name = "InManipulateProfitsScenarioNumber1")
    protected double inManipulateProfitsScenarioNumber1;
    @XmlElement(name = "InManipulateProfitsScenarioNumber10")
    protected double inManipulateProfitsScenarioNumber10;
    @XmlElement(name = "InManipulateProfitsScenarioNumber2")
    protected double inManipulateProfitsScenarioNumber2;
    @XmlElement(name = "InManipulateProfitsScenarioNumber3")
    protected double inManipulateProfitsScenarioNumber3;
    @XmlElement(name = "InManipulateProfitsScenarioNumber4")
    protected double inManipulateProfitsScenarioNumber4;
    @XmlElement(name = "InManipulateProfitsScenarioNumber5")
    protected double inManipulateProfitsScenarioNumber5;
    @XmlElement(name = "InManipulateProfitsScenarioNumber6")
    protected double inManipulateProfitsScenarioNumber6;
    @XmlElement(name = "InManipulateProfitsScenarioNumber7")
    protected double inManipulateProfitsScenarioNumber7;
    @XmlElement(name = "InManipulateProfitsScenarioNumber8")
    protected double inManipulateProfitsScenarioNumber8;
    @XmlElement(name = "InManipulateProfitsScenarioNumber9")
    protected double inManipulateProfitsScenarioNumber9;
    @XmlElement(name = "InManipulateProfitsScenarioProductId")
    protected int inManipulateProfitsScenarioProductId;
    @XmlElement(name = "InRetrieveProfitsScenarioKeySn")
    protected double inRetrieveProfitsScenarioKeySn;
    @XmlElement(name = "InRetrieveProfitsScenarioKeySystem")
    protected short inRetrieveProfitsScenarioKeySystem;
    @XmlElement(name = "InRetrieveProfitsScenarioKeyTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRetrieveProfitsScenarioKeyTmstamp;
    @XmlElement(name = "InRtrvApplicationProfitsScenarioApplicationId")
    protected String inRtrvApplicationProfitsScenarioApplicationId;
    @XmlElement(name = "InRtrvApplicationProfitsScenarioKeySn")
    protected double inRtrvApplicationProfitsScenarioKeySn;
    @XmlElement(name = "InRtrvApplicationProfitsScenarioKeySystem")
    protected short inRtrvApplicationProfitsScenarioKeySystem;
    @XmlElement(name = "InRtrvApplicationProfitsScenarioKeyTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRtrvApplicationProfitsScenarioKeyTmstamp;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;
    @XmlElement(name = "InManipulateProfitsScenarioInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioInsertDate;
    @XmlElement(name = "InManipulateProfitsScenarioInsertUnit")
    protected int inManipulateProfitsScenarioInsertUnit;
    @XmlElement(name = "InManipulateProfitsScenarioInsertUser")
    protected String inManipulateProfitsScenarioInsertUser;
    @XmlElement(name = "InManipulateProfitsScenarioUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateProfitsScenarioUpdateDate;
    @XmlElement(name = "InManipulateProfitsScenarioUpdateUnit")
    protected int inManipulateProfitsScenarioUpdateUnit;
    @XmlElement(name = "InManipulateProfitsScenarioUpdateUser")
    protected String inManipulateProfitsScenarioUpdateUser;
    @XmlElement(name = "InManipulateProfitsScenarioScenarioSts")
    protected String inManipulateProfitsScenarioScenarioSts;
    @XmlElement(name = "InManipulateProfitsScenarioScenarioAccount")
    protected String inManipulateProfitsScenarioScenarioAccount;
    @XmlElement(name = "InManipulateProfitsScenarioScenarioAccountCd")
    protected short inManipulateProfitsScenarioScenarioAccountCd;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId4")
    protected int inManipulateProfitsScenarioCustomerId4;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd4")
    protected short inManipulateProfitsScenarioCustomerCd4;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId5")
    protected int inManipulateProfitsScenarioCustomerId5;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd5")
    protected short inManipulateProfitsScenarioCustomerCd5;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId6")
    protected int inManipulateProfitsScenarioCustomerId6;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd6")
    protected short inManipulateProfitsScenarioCustomerCd6;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId7")
    protected int inManipulateProfitsScenarioCustomerId7;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd7")
    protected short inManipulateProfitsScenarioCustomerCd7;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId8")
    protected int inManipulateProfitsScenarioCustomerId8;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd8")
    protected short inManipulateProfitsScenarioCustomerCd8;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId9")
    protected int inManipulateProfitsScenarioCustomerId9;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd9")
    protected short inManipulateProfitsScenarioCustomerCd9;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerId10")
    protected int inManipulateProfitsScenarioCustomerId10;
    @XmlElement(name = "InManipulateProfitsScenarioCustomerCd10")
    protected short inManipulateProfitsScenarioCustomerCd10;
    @XmlElement(name = "InManipulateProfitsScenarioAccountNumber4")
    protected String inManipulateProfitsScenarioAccountNumber4;
    @XmlElement(name = "InManipulateProfitsScenarioAccountCd4")
    protected short inManipulateProfitsScenarioAccountCd4;
    @XmlElement(name = "InManipulateProfitsScenarioAccountSystem4")
    protected short inManipulateProfitsScenarioAccountSystem4;
    @XmlElement(name = "InManipulateProfitsScenarioAccountNumber5")
    protected String inManipulateProfitsScenarioAccountNumber5;
    @XmlElement(name = "InManipulateProfitsScenarioAccountCd5")
    protected short inManipulateProfitsScenarioAccountCd5;
    @XmlElement(name = "InManipulateProfitsScenarioAccountSystem5")
    protected short inManipulateProfitsScenarioAccountSystem5;
    @XmlElement(name = "InManipulateProfitsScenarioDescr11")
    protected String inManipulateProfitsScenarioDescr11;
    @XmlElement(name = "InManipulateProfitsScenarioDescr12")
    protected String inManipulateProfitsScenarioDescr12;
    @XmlElement(name = "InManipulateProfitsScenarioDescr13")
    protected String inManipulateProfitsScenarioDescr13;
    @XmlElement(name = "InManipulateProfitsScenarioDescr14")
    protected String inManipulateProfitsScenarioDescr14;
    @XmlElement(name = "InManipulateProfitsScenarioDescr15")
    protected String inManipulateProfitsScenarioDescr15;
    @XmlElement(name = "InManipulateProfitsScenarioDescr16")
    protected String inManipulateProfitsScenarioDescr16;
    @XmlElement(name = "InManipulateProfitsScenarioDescr17")
    protected String inManipulateProfitsScenarioDescr17;
    @XmlElement(name = "InManipulateProfitsScenarioDescr18")
    protected String inManipulateProfitsScenarioDescr18;
    @XmlElement(name = "InManipulateProfitsScenarioDescr19")
    protected String inManipulateProfitsScenarioDescr19;
    @XmlElement(name = "InManipulateProfitsScenarioDescr20")
    protected String inManipulateProfitsScenarioDescr20;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc4")
    protected String inManipulateProfitsScenarioLargeDesc4;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc5")
    protected String inManipulateProfitsScenarioLargeDesc5;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc6")
    protected String inManipulateProfitsScenarioLargeDesc6;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc7")
    protected String inManipulateProfitsScenarioLargeDesc7;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc8")
    protected String inManipulateProfitsScenarioLargeDesc8;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc9")
    protected String inManipulateProfitsScenarioLargeDesc9;
    @XmlElement(name = "InManipulateProfitsScenarioLargeDesc10")
    protected String inManipulateProfitsScenarioLargeDesc10;
    @XmlElement(name = "InForProfitsProfitsAccountPrftSystem")
    protected short inForProfitsProfitsAccountPrftSystem;
    @XmlElement(name = "InForProfitsProfitsAccountAccountNumber")
    protected String inForProfitsProfitsAccountAccountNumber;
    @XmlElement(name = "InForProfitsProfitsAccountAccountCd")
    protected short inForProfitsProfitsAccountAccountCd;
    @XmlElement(name = "InForProfitsProfitsScenarioKeyTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inForProfitsProfitsScenarioKeyTmstamp;
    @XmlElement(name = "InForProfitsProfitsScenarioKeySystem")
    protected short inForProfitsProfitsScenarioKeySystem;
    @XmlElement(name = "InForProfitsProfitsScenarioKeySn")
    protected double inForProfitsProfitsScenarioKeySn;
    @XmlElement(name = "InForProfitsProfitsScenarioApplicationId")
    protected String inForProfitsProfitsScenarioApplicationId;

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
     * Gets the value of the inManipulateProfitsScenarioAccountCd1 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountCd1() {
        return inManipulateProfitsScenarioAccountCd1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountCd1 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountCd1(short value) {
        this.inManipulateProfitsScenarioAccountCd1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountCd2 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountCd2() {
        return inManipulateProfitsScenarioAccountCd2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountCd2 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountCd2(short value) {
        this.inManipulateProfitsScenarioAccountCd2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountCd3 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountCd3() {
        return inManipulateProfitsScenarioAccountCd3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountCd3 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountCd3(short value) {
        this.inManipulateProfitsScenarioAccountCd3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioAccountNumber1() {
        return inManipulateProfitsScenarioAccountNumber1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioAccountNumber1(String value) {
        this.inManipulateProfitsScenarioAccountNumber1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioAccountNumber2() {
        return inManipulateProfitsScenarioAccountNumber2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioAccountNumber2(String value) {
        this.inManipulateProfitsScenarioAccountNumber2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioAccountNumber3() {
        return inManipulateProfitsScenarioAccountNumber3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioAccountNumber3(String value) {
        this.inManipulateProfitsScenarioAccountNumber3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountSystem1 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountSystem1() {
        return inManipulateProfitsScenarioAccountSystem1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountSystem1 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountSystem1(short value) {
        this.inManipulateProfitsScenarioAccountSystem1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountSystem2 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountSystem2() {
        return inManipulateProfitsScenarioAccountSystem2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountSystem2 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountSystem2(short value) {
        this.inManipulateProfitsScenarioAccountSystem2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountSystem3 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountSystem3() {
        return inManipulateProfitsScenarioAccountSystem3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountSystem3 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountSystem3(short value) {
        this.inManipulateProfitsScenarioAccountSystem3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount1() {
        return inManipulateProfitsScenarioAmount1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount1(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount10() {
        return inManipulateProfitsScenarioAmount10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount10(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount11() {
        return inManipulateProfitsScenarioAmount11;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount11(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount11 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount12() {
        return inManipulateProfitsScenarioAmount12;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount12(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount12 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount13() {
        return inManipulateProfitsScenarioAmount13;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount13(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount13 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount14() {
        return inManipulateProfitsScenarioAmount14;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount14(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount14 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount15() {
        return inManipulateProfitsScenarioAmount15;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount15(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount15 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount1841() {
        return inManipulateProfitsScenarioAmount1841;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount1841(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount1841 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount1842() {
        return inManipulateProfitsScenarioAmount1842;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount1842(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount1842 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount1843() {
        return inManipulateProfitsScenarioAmount1843;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount1843(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount1843 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount2() {
        return inManipulateProfitsScenarioAmount2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount2(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount3() {
        return inManipulateProfitsScenarioAmount3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount3(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount4() {
        return inManipulateProfitsScenarioAmount4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount4(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount5() {
        return inManipulateProfitsScenarioAmount5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount5(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount6() {
        return inManipulateProfitsScenarioAmount6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount6(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount7() {
        return inManipulateProfitsScenarioAmount7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount7(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount8() {
        return inManipulateProfitsScenarioAmount8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount8(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateProfitsScenarioAmount9() {
        return inManipulateProfitsScenarioAmount9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateProfitsScenarioAmount9(BigDecimal value) {
        this.inManipulateProfitsScenarioAmount9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioApplicationId() {
        return inManipulateProfitsScenarioApplicationId;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioApplicationId(String value) {
        this.inManipulateProfitsScenarioApplicationId = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioApplicationSts() {
        return inManipulateProfitsScenarioApplicationSts;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioApplicationSts(String value) {
        this.inManipulateProfitsScenarioApplicationSts = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCurrencyId1 property.
     * 
     */
    public int getInManipulateProfitsScenarioCurrencyId1() {
        return inManipulateProfitsScenarioCurrencyId1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCurrencyId1 property.
     * 
     */
    public void setInManipulateProfitsScenarioCurrencyId1(int value) {
        this.inManipulateProfitsScenarioCurrencyId1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCurrencyId2 property.
     * 
     */
    public int getInManipulateProfitsScenarioCurrencyId2() {
        return inManipulateProfitsScenarioCurrencyId2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCurrencyId2 property.
     * 
     */
    public void setInManipulateProfitsScenarioCurrencyId2(int value) {
        this.inManipulateProfitsScenarioCurrencyId2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCurrencyId3 property.
     * 
     */
    public int getInManipulateProfitsScenarioCurrencyId3() {
        return inManipulateProfitsScenarioCurrencyId3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCurrencyId3 property.
     * 
     */
    public void setInManipulateProfitsScenarioCurrencyId3(int value) {
        this.inManipulateProfitsScenarioCurrencyId3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd1 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd1() {
        return inManipulateProfitsScenarioCustomerCd1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd1 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd1(short value) {
        this.inManipulateProfitsScenarioCustomerCd1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd2 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd2() {
        return inManipulateProfitsScenarioCustomerCd2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd2 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd2(short value) {
        this.inManipulateProfitsScenarioCustomerCd2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd3 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd3() {
        return inManipulateProfitsScenarioCustomerCd3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd3 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd3(short value) {
        this.inManipulateProfitsScenarioCustomerCd3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId1 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId1() {
        return inManipulateProfitsScenarioCustomerId1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId1 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId1(int value) {
        this.inManipulateProfitsScenarioCustomerId1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId2 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId2() {
        return inManipulateProfitsScenarioCustomerId2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId2 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId2(int value) {
        this.inManipulateProfitsScenarioCustomerId2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId3 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId3() {
        return inManipulateProfitsScenarioCustomerId3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId3 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId3(int value) {
        this.inManipulateProfitsScenarioCustomerId3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate1() {
        return inManipulateProfitsScenarioDate1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate1(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate10() {
        return inManipulateProfitsScenarioDate10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate10(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate11() {
        return inManipulateProfitsScenarioDate11;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate11(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate11 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate12() {
        return inManipulateProfitsScenarioDate12;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate12(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate12 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate13() {
        return inManipulateProfitsScenarioDate13;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate13(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate13 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate14() {
        return inManipulateProfitsScenarioDate14;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate14(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate14 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate15() {
        return inManipulateProfitsScenarioDate15;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate15(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate15 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate2() {
        return inManipulateProfitsScenarioDate2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate2(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate3() {
        return inManipulateProfitsScenarioDate3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate3(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate4() {
        return inManipulateProfitsScenarioDate4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate4(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate5() {
        return inManipulateProfitsScenarioDate5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate5(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate6() {
        return inManipulateProfitsScenarioDate6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate6(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate7() {
        return inManipulateProfitsScenarioDate7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate7(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate8() {
        return inManipulateProfitsScenarioDate8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate8(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioDate9() {
        return inManipulateProfitsScenarioDate9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioDate9(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioDate9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr1() {
        return inManipulateProfitsScenarioDescr1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr1(String value) {
        this.inManipulateProfitsScenarioDescr1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr10() {
        return inManipulateProfitsScenarioDescr10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr10(String value) {
        this.inManipulateProfitsScenarioDescr10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr2() {
        return inManipulateProfitsScenarioDescr2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr2(String value) {
        this.inManipulateProfitsScenarioDescr2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr3() {
        return inManipulateProfitsScenarioDescr3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr3(String value) {
        this.inManipulateProfitsScenarioDescr3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr4() {
        return inManipulateProfitsScenarioDescr4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr4(String value) {
        this.inManipulateProfitsScenarioDescr4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr5() {
        return inManipulateProfitsScenarioDescr5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr5(String value) {
        this.inManipulateProfitsScenarioDescr5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr6() {
        return inManipulateProfitsScenarioDescr6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr6(String value) {
        this.inManipulateProfitsScenarioDescr6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr7() {
        return inManipulateProfitsScenarioDescr7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr7(String value) {
        this.inManipulateProfitsScenarioDescr7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr8() {
        return inManipulateProfitsScenarioDescr8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr8(String value) {
        this.inManipulateProfitsScenarioDescr8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr9() {
        return inManipulateProfitsScenarioDescr9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr9(String value) {
        this.inManipulateProfitsScenarioDescr9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag1() {
        return inManipulateProfitsScenarioFlag1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag1(String value) {
        this.inManipulateProfitsScenarioFlag1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag10() {
        return inManipulateProfitsScenarioFlag10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag10(String value) {
        this.inManipulateProfitsScenarioFlag10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag2() {
        return inManipulateProfitsScenarioFlag2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag2(String value) {
        this.inManipulateProfitsScenarioFlag2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag3() {
        return inManipulateProfitsScenarioFlag3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag3(String value) {
        this.inManipulateProfitsScenarioFlag3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag4() {
        return inManipulateProfitsScenarioFlag4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag4(String value) {
        this.inManipulateProfitsScenarioFlag4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag5() {
        return inManipulateProfitsScenarioFlag5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag5(String value) {
        this.inManipulateProfitsScenarioFlag5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag6() {
        return inManipulateProfitsScenarioFlag6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag6(String value) {
        this.inManipulateProfitsScenarioFlag6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag7() {
        return inManipulateProfitsScenarioFlag7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag7(String value) {
        this.inManipulateProfitsScenarioFlag7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag8() {
        return inManipulateProfitsScenarioFlag8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag8(String value) {
        this.inManipulateProfitsScenarioFlag8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioFlag9() {
        return inManipulateProfitsScenarioFlag9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioFlag9(String value) {
        this.inManipulateProfitsScenarioFlag9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger1 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger1() {
        return inManipulateProfitsScenarioInteger1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger1 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger1(int value) {
        this.inManipulateProfitsScenarioInteger1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger10 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger10() {
        return inManipulateProfitsScenarioInteger10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger10 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger10(int value) {
        this.inManipulateProfitsScenarioInteger10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger2 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger2() {
        return inManipulateProfitsScenarioInteger2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger2 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger2(int value) {
        this.inManipulateProfitsScenarioInteger2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger3 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger3() {
        return inManipulateProfitsScenarioInteger3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger3 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger3(int value) {
        this.inManipulateProfitsScenarioInteger3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger4 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger4() {
        return inManipulateProfitsScenarioInteger4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger4 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger4(int value) {
        this.inManipulateProfitsScenarioInteger4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger5 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger5() {
        return inManipulateProfitsScenarioInteger5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger5 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger5(int value) {
        this.inManipulateProfitsScenarioInteger5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger6 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger6() {
        return inManipulateProfitsScenarioInteger6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger6 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger6(int value) {
        this.inManipulateProfitsScenarioInteger6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger7 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger7() {
        return inManipulateProfitsScenarioInteger7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger7 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger7(int value) {
        this.inManipulateProfitsScenarioInteger7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger8 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger8() {
        return inManipulateProfitsScenarioInteger8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger8 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger8(int value) {
        this.inManipulateProfitsScenarioInteger8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInteger9 property.
     * 
     */
    public int getInManipulateProfitsScenarioInteger9() {
        return inManipulateProfitsScenarioInteger9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInteger9 property.
     * 
     */
    public void setInManipulateProfitsScenarioInteger9(int value) {
        this.inManipulateProfitsScenarioInteger9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioKeySystem property.
     * 
     */
    public short getInManipulateProfitsScenarioKeySystem() {
        return inManipulateProfitsScenarioKeySystem;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioKeySystem property.
     * 
     */
    public void setInManipulateProfitsScenarioKeySystem(short value) {
        this.inManipulateProfitsScenarioKeySystem = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc1() {
        return inManipulateProfitsScenarioLargeDesc1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc1(String value) {
        this.inManipulateProfitsScenarioLargeDesc1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc2() {
        return inManipulateProfitsScenarioLargeDesc2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc2(String value) {
        this.inManipulateProfitsScenarioLargeDesc2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc3() {
        return inManipulateProfitsScenarioLargeDesc3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc3(String value) {
        this.inManipulateProfitsScenarioLargeDesc3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber1 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber1() {
        return inManipulateProfitsScenarioNumber1;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber1 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber1(double value) {
        this.inManipulateProfitsScenarioNumber1 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber10 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber10() {
        return inManipulateProfitsScenarioNumber10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber10 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber10(double value) {
        this.inManipulateProfitsScenarioNumber10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber2 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber2() {
        return inManipulateProfitsScenarioNumber2;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber2 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber2(double value) {
        this.inManipulateProfitsScenarioNumber2 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber3 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber3() {
        return inManipulateProfitsScenarioNumber3;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber3 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber3(double value) {
        this.inManipulateProfitsScenarioNumber3 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber4 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber4() {
        return inManipulateProfitsScenarioNumber4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber4 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber4(double value) {
        this.inManipulateProfitsScenarioNumber4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber5 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber5() {
        return inManipulateProfitsScenarioNumber5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber5 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber5(double value) {
        this.inManipulateProfitsScenarioNumber5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber6 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber6() {
        return inManipulateProfitsScenarioNumber6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber6 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber6(double value) {
        this.inManipulateProfitsScenarioNumber6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber7 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber7() {
        return inManipulateProfitsScenarioNumber7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber7 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber7(double value) {
        this.inManipulateProfitsScenarioNumber7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber8 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber8() {
        return inManipulateProfitsScenarioNumber8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber8 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber8(double value) {
        this.inManipulateProfitsScenarioNumber8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioNumber9 property.
     * 
     */
    public double getInManipulateProfitsScenarioNumber9() {
        return inManipulateProfitsScenarioNumber9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioNumber9 property.
     * 
     */
    public void setInManipulateProfitsScenarioNumber9(double value) {
        this.inManipulateProfitsScenarioNumber9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioProductId property.
     * 
     */
    public int getInManipulateProfitsScenarioProductId() {
        return inManipulateProfitsScenarioProductId;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioProductId property.
     * 
     */
    public void setInManipulateProfitsScenarioProductId(int value) {
        this.inManipulateProfitsScenarioProductId = value;
    }

    /**
     * Gets the value of the inRetrieveProfitsScenarioKeySn property.
     * 
     */
    public double getInRetrieveProfitsScenarioKeySn() {
        return inRetrieveProfitsScenarioKeySn;
    }

    /**
     * Sets the value of the inRetrieveProfitsScenarioKeySn property.
     * 
     */
    public void setInRetrieveProfitsScenarioKeySn(double value) {
        this.inRetrieveProfitsScenarioKeySn = value;
    }

    /**
     * Gets the value of the inRetrieveProfitsScenarioKeySystem property.
     * 
     */
    public short getInRetrieveProfitsScenarioKeySystem() {
        return inRetrieveProfitsScenarioKeySystem;
    }

    /**
     * Sets the value of the inRetrieveProfitsScenarioKeySystem property.
     * 
     */
    public void setInRetrieveProfitsScenarioKeySystem(short value) {
        this.inRetrieveProfitsScenarioKeySystem = value;
    }

    /**
     * Gets the value of the inRetrieveProfitsScenarioKeyTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRetrieveProfitsScenarioKeyTmstamp() {
        return inRetrieveProfitsScenarioKeyTmstamp;
    }

    /**
     * Sets the value of the inRetrieveProfitsScenarioKeyTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRetrieveProfitsScenarioKeyTmstamp(XMLGregorianCalendar value) {
        this.inRetrieveProfitsScenarioKeyTmstamp = value;
    }

    /**
     * Gets the value of the inRtrvApplicationProfitsScenarioApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRtrvApplicationProfitsScenarioApplicationId() {
        return inRtrvApplicationProfitsScenarioApplicationId;
    }

    /**
     * Sets the value of the inRtrvApplicationProfitsScenarioApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRtrvApplicationProfitsScenarioApplicationId(String value) {
        this.inRtrvApplicationProfitsScenarioApplicationId = value;
    }

    /**
     * Gets the value of the inRtrvApplicationProfitsScenarioKeySn property.
     * 
     */
    public double getInRtrvApplicationProfitsScenarioKeySn() {
        return inRtrvApplicationProfitsScenarioKeySn;
    }

    /**
     * Sets the value of the inRtrvApplicationProfitsScenarioKeySn property.
     * 
     */
    public void setInRtrvApplicationProfitsScenarioKeySn(double value) {
        this.inRtrvApplicationProfitsScenarioKeySn = value;
    }

    /**
     * Gets the value of the inRtrvApplicationProfitsScenarioKeySystem property.
     * 
     */
    public short getInRtrvApplicationProfitsScenarioKeySystem() {
        return inRtrvApplicationProfitsScenarioKeySystem;
    }

    /**
     * Sets the value of the inRtrvApplicationProfitsScenarioKeySystem property.
     * 
     */
    public void setInRtrvApplicationProfitsScenarioKeySystem(short value) {
        this.inRtrvApplicationProfitsScenarioKeySystem = value;
    }

    /**
     * Gets the value of the inRtrvApplicationProfitsScenarioKeyTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRtrvApplicationProfitsScenarioKeyTmstamp() {
        return inRtrvApplicationProfitsScenarioKeyTmstamp;
    }

    /**
     * Sets the value of the inRtrvApplicationProfitsScenarioKeyTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRtrvApplicationProfitsScenarioKeyTmstamp(XMLGregorianCalendar value) {
        this.inRtrvApplicationProfitsScenarioKeyTmstamp = value;
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
     * Gets the value of the inManipulateProfitsScenarioInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioInsertDate() {
        return inManipulateProfitsScenarioInsertDate;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioInsertDate(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioInsertDate = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInsertUnit property.
     * 
     */
    public int getInManipulateProfitsScenarioInsertUnit() {
        return inManipulateProfitsScenarioInsertUnit;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInsertUnit property.
     * 
     */
    public void setInManipulateProfitsScenarioInsertUnit(int value) {
        this.inManipulateProfitsScenarioInsertUnit = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioInsertUser() {
        return inManipulateProfitsScenarioInsertUser;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioInsertUser(String value) {
        this.inManipulateProfitsScenarioInsertUser = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateProfitsScenarioUpdateDate() {
        return inManipulateProfitsScenarioUpdateDate;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateProfitsScenarioUpdateDate(XMLGregorianCalendar value) {
        this.inManipulateProfitsScenarioUpdateDate = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioUpdateUnit property.
     * 
     */
    public int getInManipulateProfitsScenarioUpdateUnit() {
        return inManipulateProfitsScenarioUpdateUnit;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioUpdateUnit property.
     * 
     */
    public void setInManipulateProfitsScenarioUpdateUnit(int value) {
        this.inManipulateProfitsScenarioUpdateUnit = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioUpdateUser() {
        return inManipulateProfitsScenarioUpdateUser;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioUpdateUser(String value) {
        this.inManipulateProfitsScenarioUpdateUser = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioScenarioSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioScenarioSts() {
        return inManipulateProfitsScenarioScenarioSts;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioScenarioSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioScenarioSts(String value) {
        this.inManipulateProfitsScenarioScenarioSts = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioScenarioAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioScenarioAccount() {
        return inManipulateProfitsScenarioScenarioAccount;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioScenarioAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioScenarioAccount(String value) {
        this.inManipulateProfitsScenarioScenarioAccount = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioScenarioAccountCd property.
     * 
     */
    public short getInManipulateProfitsScenarioScenarioAccountCd() {
        return inManipulateProfitsScenarioScenarioAccountCd;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioScenarioAccountCd property.
     * 
     */
    public void setInManipulateProfitsScenarioScenarioAccountCd(short value) {
        this.inManipulateProfitsScenarioScenarioAccountCd = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId4 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId4() {
        return inManipulateProfitsScenarioCustomerId4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId4 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId4(int value) {
        this.inManipulateProfitsScenarioCustomerId4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd4 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd4() {
        return inManipulateProfitsScenarioCustomerCd4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd4 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd4(short value) {
        this.inManipulateProfitsScenarioCustomerCd4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId5 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId5() {
        return inManipulateProfitsScenarioCustomerId5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId5 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId5(int value) {
        this.inManipulateProfitsScenarioCustomerId5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd5 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd5() {
        return inManipulateProfitsScenarioCustomerCd5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd5 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd5(short value) {
        this.inManipulateProfitsScenarioCustomerCd5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId6 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId6() {
        return inManipulateProfitsScenarioCustomerId6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId6 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId6(int value) {
        this.inManipulateProfitsScenarioCustomerId6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd6 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd6() {
        return inManipulateProfitsScenarioCustomerCd6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd6 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd6(short value) {
        this.inManipulateProfitsScenarioCustomerCd6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId7 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId7() {
        return inManipulateProfitsScenarioCustomerId7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId7 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId7(int value) {
        this.inManipulateProfitsScenarioCustomerId7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd7 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd7() {
        return inManipulateProfitsScenarioCustomerCd7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd7 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd7(short value) {
        this.inManipulateProfitsScenarioCustomerCd7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId8 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId8() {
        return inManipulateProfitsScenarioCustomerId8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId8 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId8(int value) {
        this.inManipulateProfitsScenarioCustomerId8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd8 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd8() {
        return inManipulateProfitsScenarioCustomerCd8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd8 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd8(short value) {
        this.inManipulateProfitsScenarioCustomerCd8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId9 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId9() {
        return inManipulateProfitsScenarioCustomerId9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId9 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId9(int value) {
        this.inManipulateProfitsScenarioCustomerId9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd9 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd9() {
        return inManipulateProfitsScenarioCustomerCd9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd9 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd9(short value) {
        this.inManipulateProfitsScenarioCustomerCd9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerId10 property.
     * 
     */
    public int getInManipulateProfitsScenarioCustomerId10() {
        return inManipulateProfitsScenarioCustomerId10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerId10 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerId10(int value) {
        this.inManipulateProfitsScenarioCustomerId10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioCustomerCd10 property.
     * 
     */
    public short getInManipulateProfitsScenarioCustomerCd10() {
        return inManipulateProfitsScenarioCustomerCd10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioCustomerCd10 property.
     * 
     */
    public void setInManipulateProfitsScenarioCustomerCd10(short value) {
        this.inManipulateProfitsScenarioCustomerCd10 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioAccountNumber4() {
        return inManipulateProfitsScenarioAccountNumber4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioAccountNumber4(String value) {
        this.inManipulateProfitsScenarioAccountNumber4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountCd4 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountCd4() {
        return inManipulateProfitsScenarioAccountCd4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountCd4 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountCd4(short value) {
        this.inManipulateProfitsScenarioAccountCd4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountSystem4 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountSystem4() {
        return inManipulateProfitsScenarioAccountSystem4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountSystem4 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountSystem4(short value) {
        this.inManipulateProfitsScenarioAccountSystem4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountNumber5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioAccountNumber5() {
        return inManipulateProfitsScenarioAccountNumber5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountNumber5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioAccountNumber5(String value) {
        this.inManipulateProfitsScenarioAccountNumber5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountCd5 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountCd5() {
        return inManipulateProfitsScenarioAccountCd5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountCd5 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountCd5(short value) {
        this.inManipulateProfitsScenarioAccountCd5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioAccountSystem5 property.
     * 
     */
    public short getInManipulateProfitsScenarioAccountSystem5() {
        return inManipulateProfitsScenarioAccountSystem5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioAccountSystem5 property.
     * 
     */
    public void setInManipulateProfitsScenarioAccountSystem5(short value) {
        this.inManipulateProfitsScenarioAccountSystem5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr11() {
        return inManipulateProfitsScenarioDescr11;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr11(String value) {
        this.inManipulateProfitsScenarioDescr11 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr12() {
        return inManipulateProfitsScenarioDescr12;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr12(String value) {
        this.inManipulateProfitsScenarioDescr12 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr13() {
        return inManipulateProfitsScenarioDescr13;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr13(String value) {
        this.inManipulateProfitsScenarioDescr13 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr14() {
        return inManipulateProfitsScenarioDescr14;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr14(String value) {
        this.inManipulateProfitsScenarioDescr14 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr15() {
        return inManipulateProfitsScenarioDescr15;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr15(String value) {
        this.inManipulateProfitsScenarioDescr15 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr16() {
        return inManipulateProfitsScenarioDescr16;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr16(String value) {
        this.inManipulateProfitsScenarioDescr16 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr17() {
        return inManipulateProfitsScenarioDescr17;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr17(String value) {
        this.inManipulateProfitsScenarioDescr17 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr18() {
        return inManipulateProfitsScenarioDescr18;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr18(String value) {
        this.inManipulateProfitsScenarioDescr18 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr19() {
        return inManipulateProfitsScenarioDescr19;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr19(String value) {
        this.inManipulateProfitsScenarioDescr19 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioDescr20() {
        return inManipulateProfitsScenarioDescr20;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioDescr20(String value) {
        this.inManipulateProfitsScenarioDescr20 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc4() {
        return inManipulateProfitsScenarioLargeDesc4;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc4(String value) {
        this.inManipulateProfitsScenarioLargeDesc4 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc5() {
        return inManipulateProfitsScenarioLargeDesc5;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc5(String value) {
        this.inManipulateProfitsScenarioLargeDesc5 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc6() {
        return inManipulateProfitsScenarioLargeDesc6;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc6(String value) {
        this.inManipulateProfitsScenarioLargeDesc6 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc7() {
        return inManipulateProfitsScenarioLargeDesc7;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc7(String value) {
        this.inManipulateProfitsScenarioLargeDesc7 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc8() {
        return inManipulateProfitsScenarioLargeDesc8;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc8(String value) {
        this.inManipulateProfitsScenarioLargeDesc8 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc9() {
        return inManipulateProfitsScenarioLargeDesc9;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc9(String value) {
        this.inManipulateProfitsScenarioLargeDesc9 = value;
    }

    /**
     * Gets the value of the inManipulateProfitsScenarioLargeDesc10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateProfitsScenarioLargeDesc10() {
        return inManipulateProfitsScenarioLargeDesc10;
    }

    /**
     * Sets the value of the inManipulateProfitsScenarioLargeDesc10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateProfitsScenarioLargeDesc10(String value) {
        this.inManipulateProfitsScenarioLargeDesc10 = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsAccountPrftSystem property.
     * 
     */
    public short getInForProfitsProfitsAccountPrftSystem() {
        return inForProfitsProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inForProfitsProfitsAccountPrftSystem property.
     * 
     */
    public void setInForProfitsProfitsAccountPrftSystem(short value) {
        this.inForProfitsProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForProfitsProfitsAccountAccountNumber() {
        return inForProfitsProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inForProfitsProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForProfitsProfitsAccountAccountNumber(String value) {
        this.inForProfitsProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsAccountAccountCd property.
     * 
     */
    public short getInForProfitsProfitsAccountAccountCd() {
        return inForProfitsProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inForProfitsProfitsAccountAccountCd property.
     * 
     */
    public void setInForProfitsProfitsAccountAccountCd(short value) {
        this.inForProfitsProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsScenarioKeyTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInForProfitsProfitsScenarioKeyTmstamp() {
        return inForProfitsProfitsScenarioKeyTmstamp;
    }

    /**
     * Sets the value of the inForProfitsProfitsScenarioKeyTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInForProfitsProfitsScenarioKeyTmstamp(XMLGregorianCalendar value) {
        this.inForProfitsProfitsScenarioKeyTmstamp = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsScenarioKeySystem property.
     * 
     */
    public short getInForProfitsProfitsScenarioKeySystem() {
        return inForProfitsProfitsScenarioKeySystem;
    }

    /**
     * Sets the value of the inForProfitsProfitsScenarioKeySystem property.
     * 
     */
    public void setInForProfitsProfitsScenarioKeySystem(short value) {
        this.inForProfitsProfitsScenarioKeySystem = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsScenarioKeySn property.
     * 
     */
    public double getInForProfitsProfitsScenarioKeySn() {
        return inForProfitsProfitsScenarioKeySn;
    }

    /**
     * Sets the value of the inForProfitsProfitsScenarioKeySn property.
     * 
     */
    public void setInForProfitsProfitsScenarioKeySn(double value) {
        this.inForProfitsProfitsScenarioKeySn = value;
    }

    /**
     * Gets the value of the inForProfitsProfitsScenarioApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForProfitsProfitsScenarioApplicationId() {
        return inForProfitsProfitsScenarioApplicationId;
    }

    /**
     * Sets the value of the inForProfitsProfitsScenarioApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForProfitsProfitsScenarioApplicationId(String value) {
        this.inForProfitsProfitsScenarioApplicationId = value;
    }

}
