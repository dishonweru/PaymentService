
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prt502vSaveScenarioExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt502vSaveScenarioExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCreatedProfitsScenarioKeySn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutCreatedProfitsScenarioKeySystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCreatedProfitsScenarioKeyTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountCd1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountCd2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountCd3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountNumber3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountSystem1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountSystem2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountSystem3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount13" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount14" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetrievedProfitsScenarioApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCurrencyId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCurrencyId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCurrencyId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd3" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate11" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate12" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate13" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate14" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate15" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioInteger9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioKeySn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioKeySystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioKeyTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetrievedProfitsScenarioProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioScenarioAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioScenarioAccountCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioScenarioSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetrievedProfitsScenarioUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd6" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd7" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd8" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd9" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerId10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetrievedProfitsScenarioCustomerCd10" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountNumber4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountCd4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountSystem4" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountNumber5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountCd5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioAccountSystem5" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetrievedProfitsScenarioLargeDesc10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt502vSaveScenarioExport", propOrder = {
    "outCreatedProfitsScenarioKeySn",
    "outCreatedProfitsScenarioKeySystem",
    "outCreatedProfitsScenarioKeyTmstamp",
    "outRetrievedProfitsScenarioAccountCd1",
    "outRetrievedProfitsScenarioAccountCd2",
    "outRetrievedProfitsScenarioAccountCd3",
    "outRetrievedProfitsScenarioAccountNumber1",
    "outRetrievedProfitsScenarioAccountNumber2",
    "outRetrievedProfitsScenarioAccountNumber3",
    "outRetrievedProfitsScenarioAccountSystem1",
    "outRetrievedProfitsScenarioAccountSystem2",
    "outRetrievedProfitsScenarioAccountSystem3",
    "outRetrievedProfitsScenarioAmount1",
    "outRetrievedProfitsScenarioAmount10",
    "outRetrievedProfitsScenarioAmount11",
    "outRetrievedProfitsScenarioAmount12",
    "outRetrievedProfitsScenarioAmount13",
    "outRetrievedProfitsScenarioAmount14",
    "outRetrievedProfitsScenarioAmount15",
    "outRetrievedProfitsScenarioAmount1841",
    "outRetrievedProfitsScenarioAmount1842",
    "outRetrievedProfitsScenarioAmount1843",
    "outRetrievedProfitsScenarioAmount2",
    "outRetrievedProfitsScenarioAmount3",
    "outRetrievedProfitsScenarioAmount4",
    "outRetrievedProfitsScenarioAmount5",
    "outRetrievedProfitsScenarioAmount6",
    "outRetrievedProfitsScenarioAmount7",
    "outRetrievedProfitsScenarioAmount8",
    "outRetrievedProfitsScenarioAmount9",
    "outRetrievedProfitsScenarioApplicationId",
    "outRetrievedProfitsScenarioApplicationSts",
    "outRetrievedProfitsScenarioCurrencyId1",
    "outRetrievedProfitsScenarioCurrencyId2",
    "outRetrievedProfitsScenarioCurrencyId3",
    "outRetrievedProfitsScenarioCustomerCd1",
    "outRetrievedProfitsScenarioCustomerCd2",
    "outRetrievedProfitsScenarioCustomerCd3",
    "outRetrievedProfitsScenarioCustomerId1",
    "outRetrievedProfitsScenarioCustomerId2",
    "outRetrievedProfitsScenarioCustomerId3",
    "outRetrievedProfitsScenarioDate1",
    "outRetrievedProfitsScenarioDate10",
    "outRetrievedProfitsScenarioDate11",
    "outRetrievedProfitsScenarioDate12",
    "outRetrievedProfitsScenarioDate13",
    "outRetrievedProfitsScenarioDate14",
    "outRetrievedProfitsScenarioDate15",
    "outRetrievedProfitsScenarioDate2",
    "outRetrievedProfitsScenarioDate3",
    "outRetrievedProfitsScenarioDate4",
    "outRetrievedProfitsScenarioDate5",
    "outRetrievedProfitsScenarioDate6",
    "outRetrievedProfitsScenarioDate7",
    "outRetrievedProfitsScenarioDate8",
    "outRetrievedProfitsScenarioDate9",
    "outRetrievedProfitsScenarioDescr1",
    "outRetrievedProfitsScenarioDescr10",
    "outRetrievedProfitsScenarioDescr2",
    "outRetrievedProfitsScenarioDescr3",
    "outRetrievedProfitsScenarioDescr4",
    "outRetrievedProfitsScenarioDescr5",
    "outRetrievedProfitsScenarioDescr6",
    "outRetrievedProfitsScenarioDescr7",
    "outRetrievedProfitsScenarioDescr8",
    "outRetrievedProfitsScenarioDescr9",
    "outRetrievedProfitsScenarioFlag1",
    "outRetrievedProfitsScenarioFlag10",
    "outRetrievedProfitsScenarioFlag2",
    "outRetrievedProfitsScenarioFlag3",
    "outRetrievedProfitsScenarioFlag4",
    "outRetrievedProfitsScenarioFlag5",
    "outRetrievedProfitsScenarioFlag6",
    "outRetrievedProfitsScenarioFlag7",
    "outRetrievedProfitsScenarioFlag8",
    "outRetrievedProfitsScenarioFlag9",
    "outRetrievedProfitsScenarioInsertDate",
    "outRetrievedProfitsScenarioInsertUnit",
    "outRetrievedProfitsScenarioInsertUser",
    "outRetrievedProfitsScenarioInteger1",
    "outRetrievedProfitsScenarioInteger10",
    "outRetrievedProfitsScenarioInteger2",
    "outRetrievedProfitsScenarioInteger3",
    "outRetrievedProfitsScenarioInteger4",
    "outRetrievedProfitsScenarioInteger5",
    "outRetrievedProfitsScenarioInteger6",
    "outRetrievedProfitsScenarioInteger7",
    "outRetrievedProfitsScenarioInteger8",
    "outRetrievedProfitsScenarioInteger9",
    "outRetrievedProfitsScenarioKeySn",
    "outRetrievedProfitsScenarioKeySystem",
    "outRetrievedProfitsScenarioKeyTmstamp",
    "outRetrievedProfitsScenarioLargeDesc1",
    "outRetrievedProfitsScenarioLargeDesc2",
    "outRetrievedProfitsScenarioLargeDesc3",
    "outRetrievedProfitsScenarioNumber1",
    "outRetrievedProfitsScenarioNumber10",
    "outRetrievedProfitsScenarioNumber2",
    "outRetrievedProfitsScenarioNumber3",
    "outRetrievedProfitsScenarioNumber4",
    "outRetrievedProfitsScenarioNumber5",
    "outRetrievedProfitsScenarioNumber6",
    "outRetrievedProfitsScenarioNumber7",
    "outRetrievedProfitsScenarioNumber8",
    "outRetrievedProfitsScenarioNumber9",
    "outRetrievedProfitsScenarioProductId",
    "outRetrievedProfitsScenarioScenarioAccount",
    "outRetrievedProfitsScenarioScenarioAccountCd",
    "outRetrievedProfitsScenarioScenarioSts",
    "outRetrievedProfitsScenarioUpdateDate",
    "outRetrievedProfitsScenarioUpdateUnit",
    "outRetrievedProfitsScenarioUpdateUser",
    "outRetrievedProfitsScenarioCustomerId4",
    "outRetrievedProfitsScenarioCustomerCd4",
    "outRetrievedProfitsScenarioCustomerId5",
    "outRetrievedProfitsScenarioCustomerCd5",
    "outRetrievedProfitsScenarioCustomerId6",
    "outRetrievedProfitsScenarioCustomerCd6",
    "outRetrievedProfitsScenarioCustomerId7",
    "outRetrievedProfitsScenarioCustomerCd7",
    "outRetrievedProfitsScenarioCustomerId8",
    "outRetrievedProfitsScenarioCustomerCd8",
    "outRetrievedProfitsScenarioCustomerId9",
    "outRetrievedProfitsScenarioCustomerCd9",
    "outRetrievedProfitsScenarioCustomerId10",
    "outRetrievedProfitsScenarioCustomerCd10",
    "outRetrievedProfitsScenarioAccountNumber4",
    "outRetrievedProfitsScenarioAccountCd4",
    "outRetrievedProfitsScenarioAccountSystem4",
    "outRetrievedProfitsScenarioAccountNumber5",
    "outRetrievedProfitsScenarioAccountCd5",
    "outRetrievedProfitsScenarioAccountSystem5",
    "outRetrievedProfitsScenarioDescr11",
    "outRetrievedProfitsScenarioDescr12",
    "outRetrievedProfitsScenarioDescr13",
    "outRetrievedProfitsScenarioDescr14",
    "outRetrievedProfitsScenarioDescr15",
    "outRetrievedProfitsScenarioDescr16",
    "outRetrievedProfitsScenarioDescr17",
    "outRetrievedProfitsScenarioDescr18",
    "outRetrievedProfitsScenarioDescr19",
    "outRetrievedProfitsScenarioDescr20",
    "outRetrievedProfitsScenarioLargeDesc4",
    "outRetrievedProfitsScenarioLargeDesc5",
    "outRetrievedProfitsScenarioLargeDesc6",
    "outRetrievedProfitsScenarioLargeDesc7",
    "outRetrievedProfitsScenarioLargeDesc8",
    "outRetrievedProfitsScenarioLargeDesc9",
    "outRetrievedProfitsScenarioLargeDesc10"
})
public class Prt502VSaveScenarioExport
    extends BaseExport
{

    @XmlElement(name = "OutCreatedProfitsScenarioKeySn")
    protected double outCreatedProfitsScenarioKeySn;
    @XmlElement(name = "OutCreatedProfitsScenarioKeySystem")
    protected int outCreatedProfitsScenarioKeySystem;
    @XmlElement(name = "OutCreatedProfitsScenarioKeyTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCreatedProfitsScenarioKeyTmstamp;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountCd1")
    protected int outRetrievedProfitsScenarioAccountCd1;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountCd2")
    protected int outRetrievedProfitsScenarioAccountCd2;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountCd3")
    protected int outRetrievedProfitsScenarioAccountCd3;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountNumber1")
    protected String outRetrievedProfitsScenarioAccountNumber1;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountNumber2")
    protected String outRetrievedProfitsScenarioAccountNumber2;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountNumber3")
    protected String outRetrievedProfitsScenarioAccountNumber3;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountSystem1")
    protected int outRetrievedProfitsScenarioAccountSystem1;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountSystem2")
    protected int outRetrievedProfitsScenarioAccountSystem2;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountSystem3")
    protected int outRetrievedProfitsScenarioAccountSystem3;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount1", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount1;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount10", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount10;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount11", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount11;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount12", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount12;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount13", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount13;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount14", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount14;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount15", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount15;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount1841", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount1841;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount1842", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount1842;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount1843", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount1843;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount2", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount2;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount3", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount3;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount4", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount4;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount5", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount5;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount6", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount6;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount7", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount7;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount8", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount8;
    @XmlElement(name = "OutRetrievedProfitsScenarioAmount9", required = true)
    protected BigDecimal outRetrievedProfitsScenarioAmount9;
    @XmlElement(name = "OutRetrievedProfitsScenarioApplicationId")
    protected String outRetrievedProfitsScenarioApplicationId;
    @XmlElement(name = "OutRetrievedProfitsScenarioApplicationSts")
    protected String outRetrievedProfitsScenarioApplicationSts;
    @XmlElement(name = "OutRetrievedProfitsScenarioCurrencyId1")
    protected int outRetrievedProfitsScenarioCurrencyId1;
    @XmlElement(name = "OutRetrievedProfitsScenarioCurrencyId2")
    protected int outRetrievedProfitsScenarioCurrencyId2;
    @XmlElement(name = "OutRetrievedProfitsScenarioCurrencyId3")
    protected int outRetrievedProfitsScenarioCurrencyId3;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd1")
    protected short outRetrievedProfitsScenarioCustomerCd1;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd2")
    protected short outRetrievedProfitsScenarioCustomerCd2;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd3")
    protected short outRetrievedProfitsScenarioCustomerCd3;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId1")
    protected int outRetrievedProfitsScenarioCustomerId1;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId2")
    protected int outRetrievedProfitsScenarioCustomerId2;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId3")
    protected int outRetrievedProfitsScenarioCustomerId3;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate1;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate10;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate11", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate11;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate12", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate12;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate13", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate13;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate14;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate15", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate15;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate2;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate3;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate4;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate5;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate6;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate7;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate8;
    @XmlElement(name = "OutRetrievedProfitsScenarioDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioDate9;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr1")
    protected String outRetrievedProfitsScenarioDescr1;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr10")
    protected String outRetrievedProfitsScenarioDescr10;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr2")
    protected String outRetrievedProfitsScenarioDescr2;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr3")
    protected String outRetrievedProfitsScenarioDescr3;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr4")
    protected String outRetrievedProfitsScenarioDescr4;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr5")
    protected String outRetrievedProfitsScenarioDescr5;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr6")
    protected String outRetrievedProfitsScenarioDescr6;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr7")
    protected String outRetrievedProfitsScenarioDescr7;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr8")
    protected String outRetrievedProfitsScenarioDescr8;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr9")
    protected String outRetrievedProfitsScenarioDescr9;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag1")
    protected String outRetrievedProfitsScenarioFlag1;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag10")
    protected String outRetrievedProfitsScenarioFlag10;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag2")
    protected String outRetrievedProfitsScenarioFlag2;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag3")
    protected String outRetrievedProfitsScenarioFlag3;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag4")
    protected String outRetrievedProfitsScenarioFlag4;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag5")
    protected String outRetrievedProfitsScenarioFlag5;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag6")
    protected String outRetrievedProfitsScenarioFlag6;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag7")
    protected String outRetrievedProfitsScenarioFlag7;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag8")
    protected String outRetrievedProfitsScenarioFlag8;
    @XmlElement(name = "OutRetrievedProfitsScenarioFlag9")
    protected String outRetrievedProfitsScenarioFlag9;
    @XmlElement(name = "OutRetrievedProfitsScenarioInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioInsertDate;
    @XmlElement(name = "OutRetrievedProfitsScenarioInsertUnit")
    protected int outRetrievedProfitsScenarioInsertUnit;
    @XmlElement(name = "OutRetrievedProfitsScenarioInsertUser")
    protected String outRetrievedProfitsScenarioInsertUser;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger1")
    protected int outRetrievedProfitsScenarioInteger1;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger10")
    protected int outRetrievedProfitsScenarioInteger10;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger2")
    protected int outRetrievedProfitsScenarioInteger2;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger3")
    protected int outRetrievedProfitsScenarioInteger3;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger4")
    protected int outRetrievedProfitsScenarioInteger4;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger5")
    protected int outRetrievedProfitsScenarioInteger5;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger6")
    protected int outRetrievedProfitsScenarioInteger6;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger7")
    protected int outRetrievedProfitsScenarioInteger7;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger8")
    protected int outRetrievedProfitsScenarioInteger8;
    @XmlElement(name = "OutRetrievedProfitsScenarioInteger9")
    protected int outRetrievedProfitsScenarioInteger9;
    @XmlElement(name = "OutRetrievedProfitsScenarioKeySn")
    protected double outRetrievedProfitsScenarioKeySn;
    @XmlElement(name = "OutRetrievedProfitsScenarioKeySystem")
    protected int outRetrievedProfitsScenarioKeySystem;
    @XmlElement(name = "OutRetrievedProfitsScenarioKeyTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioKeyTmstamp;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc1")
    protected String outRetrievedProfitsScenarioLargeDesc1;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc2")
    protected String outRetrievedProfitsScenarioLargeDesc2;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc3")
    protected String outRetrievedProfitsScenarioLargeDesc3;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber1")
    protected double outRetrievedProfitsScenarioNumber1;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber10")
    protected double outRetrievedProfitsScenarioNumber10;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber2")
    protected double outRetrievedProfitsScenarioNumber2;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber3")
    protected double outRetrievedProfitsScenarioNumber3;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber4")
    protected double outRetrievedProfitsScenarioNumber4;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber5")
    protected double outRetrievedProfitsScenarioNumber5;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber6")
    protected double outRetrievedProfitsScenarioNumber6;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber7")
    protected double outRetrievedProfitsScenarioNumber7;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber8")
    protected double outRetrievedProfitsScenarioNumber8;
    @XmlElement(name = "OutRetrievedProfitsScenarioNumber9")
    protected double outRetrievedProfitsScenarioNumber9;
    @XmlElement(name = "OutRetrievedProfitsScenarioProductId")
    protected int outRetrievedProfitsScenarioProductId;
    @XmlElement(name = "OutRetrievedProfitsScenarioScenarioAccount")
    protected String outRetrievedProfitsScenarioScenarioAccount;
    @XmlElement(name = "OutRetrievedProfitsScenarioScenarioAccountCd")
    protected int outRetrievedProfitsScenarioScenarioAccountCd;
    @XmlElement(name = "OutRetrievedProfitsScenarioScenarioSts")
    protected String outRetrievedProfitsScenarioScenarioSts;
    @XmlElement(name = "OutRetrievedProfitsScenarioUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetrievedProfitsScenarioUpdateDate;
    @XmlElement(name = "OutRetrievedProfitsScenarioUpdateUnit")
    protected int outRetrievedProfitsScenarioUpdateUnit;
    @XmlElement(name = "OutRetrievedProfitsScenarioUpdateUser")
    protected String outRetrievedProfitsScenarioUpdateUser;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId4")
    protected int outRetrievedProfitsScenarioCustomerId4;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd4")
    protected short outRetrievedProfitsScenarioCustomerCd4;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId5")
    protected int outRetrievedProfitsScenarioCustomerId5;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd5")
    protected short outRetrievedProfitsScenarioCustomerCd5;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId6")
    protected int outRetrievedProfitsScenarioCustomerId6;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd6")
    protected short outRetrievedProfitsScenarioCustomerCd6;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId7")
    protected int outRetrievedProfitsScenarioCustomerId7;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd7")
    protected short outRetrievedProfitsScenarioCustomerCd7;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId8")
    protected int outRetrievedProfitsScenarioCustomerId8;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd8")
    protected short outRetrievedProfitsScenarioCustomerCd8;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId9")
    protected int outRetrievedProfitsScenarioCustomerId9;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd9")
    protected short outRetrievedProfitsScenarioCustomerCd9;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerId10")
    protected int outRetrievedProfitsScenarioCustomerId10;
    @XmlElement(name = "OutRetrievedProfitsScenarioCustomerCd10")
    protected short outRetrievedProfitsScenarioCustomerCd10;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountNumber4")
    protected String outRetrievedProfitsScenarioAccountNumber4;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountCd4")
    protected short outRetrievedProfitsScenarioAccountCd4;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountSystem4")
    protected short outRetrievedProfitsScenarioAccountSystem4;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountNumber5")
    protected String outRetrievedProfitsScenarioAccountNumber5;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountCd5")
    protected short outRetrievedProfitsScenarioAccountCd5;
    @XmlElement(name = "OutRetrievedProfitsScenarioAccountSystem5")
    protected short outRetrievedProfitsScenarioAccountSystem5;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr11")
    protected String outRetrievedProfitsScenarioDescr11;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr12")
    protected String outRetrievedProfitsScenarioDescr12;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr13")
    protected String outRetrievedProfitsScenarioDescr13;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr14")
    protected String outRetrievedProfitsScenarioDescr14;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr15")
    protected String outRetrievedProfitsScenarioDescr15;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr16")
    protected String outRetrievedProfitsScenarioDescr16;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr17")
    protected String outRetrievedProfitsScenarioDescr17;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr18")
    protected String outRetrievedProfitsScenarioDescr18;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr19")
    protected String outRetrievedProfitsScenarioDescr19;
    @XmlElement(name = "OutRetrievedProfitsScenarioDescr20")
    protected String outRetrievedProfitsScenarioDescr20;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc4")
    protected String outRetrievedProfitsScenarioLargeDesc4;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc5")
    protected String outRetrievedProfitsScenarioLargeDesc5;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc6")
    protected String outRetrievedProfitsScenarioLargeDesc6;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc7")
    protected String outRetrievedProfitsScenarioLargeDesc7;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc8")
    protected String outRetrievedProfitsScenarioLargeDesc8;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc9")
    protected String outRetrievedProfitsScenarioLargeDesc9;
    @XmlElement(name = "OutRetrievedProfitsScenarioLargeDesc10")
    protected String outRetrievedProfitsScenarioLargeDesc10;

    /**
     * Gets the value of the outCreatedProfitsScenarioKeySn property.
     * 
     */
    public double getOutCreatedProfitsScenarioKeySn() {
        return outCreatedProfitsScenarioKeySn;
    }

    /**
     * Sets the value of the outCreatedProfitsScenarioKeySn property.
     * 
     */
    public void setOutCreatedProfitsScenarioKeySn(double value) {
        this.outCreatedProfitsScenarioKeySn = value;
    }

    /**
     * Gets the value of the outCreatedProfitsScenarioKeySystem property.
     * 
     */
    public int getOutCreatedProfitsScenarioKeySystem() {
        return outCreatedProfitsScenarioKeySystem;
    }

    /**
     * Sets the value of the outCreatedProfitsScenarioKeySystem property.
     * 
     */
    public void setOutCreatedProfitsScenarioKeySystem(int value) {
        this.outCreatedProfitsScenarioKeySystem = value;
    }

    /**
     * Gets the value of the outCreatedProfitsScenarioKeyTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCreatedProfitsScenarioKeyTmstamp() {
        return outCreatedProfitsScenarioKeyTmstamp;
    }

    /**
     * Sets the value of the outCreatedProfitsScenarioKeyTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCreatedProfitsScenarioKeyTmstamp(XMLGregorianCalendar value) {
        this.outCreatedProfitsScenarioKeyTmstamp = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountCd1 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioAccountCd1() {
        return outRetrievedProfitsScenarioAccountCd1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountCd1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountCd1(int value) {
        this.outRetrievedProfitsScenarioAccountCd1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountCd2 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioAccountCd2() {
        return outRetrievedProfitsScenarioAccountCd2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountCd2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountCd2(int value) {
        this.outRetrievedProfitsScenarioAccountCd2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountCd3 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioAccountCd3() {
        return outRetrievedProfitsScenarioAccountCd3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountCd3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountCd3(int value) {
        this.outRetrievedProfitsScenarioAccountCd3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioAccountNumber1() {
        return outRetrievedProfitsScenarioAccountNumber1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioAccountNumber1(String value) {
        this.outRetrievedProfitsScenarioAccountNumber1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioAccountNumber2() {
        return outRetrievedProfitsScenarioAccountNumber2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioAccountNumber2(String value) {
        this.outRetrievedProfitsScenarioAccountNumber2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioAccountNumber3() {
        return outRetrievedProfitsScenarioAccountNumber3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioAccountNumber3(String value) {
        this.outRetrievedProfitsScenarioAccountNumber3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountSystem1 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioAccountSystem1() {
        return outRetrievedProfitsScenarioAccountSystem1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountSystem1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountSystem1(int value) {
        this.outRetrievedProfitsScenarioAccountSystem1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountSystem2 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioAccountSystem2() {
        return outRetrievedProfitsScenarioAccountSystem2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountSystem2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountSystem2(int value) {
        this.outRetrievedProfitsScenarioAccountSystem2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountSystem3 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioAccountSystem3() {
        return outRetrievedProfitsScenarioAccountSystem3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountSystem3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountSystem3(int value) {
        this.outRetrievedProfitsScenarioAccountSystem3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount1() {
        return outRetrievedProfitsScenarioAmount1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount1(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount10() {
        return outRetrievedProfitsScenarioAmount10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount10(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount11() {
        return outRetrievedProfitsScenarioAmount11;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount11(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount11 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount12() {
        return outRetrievedProfitsScenarioAmount12;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount12(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount12 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount13() {
        return outRetrievedProfitsScenarioAmount13;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount13(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount13 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount14() {
        return outRetrievedProfitsScenarioAmount14;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount14(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount14 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount15() {
        return outRetrievedProfitsScenarioAmount15;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount15(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount15 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount1841() {
        return outRetrievedProfitsScenarioAmount1841;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount1841(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount1841 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount1842() {
        return outRetrievedProfitsScenarioAmount1842;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount1842(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount1842 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount1843() {
        return outRetrievedProfitsScenarioAmount1843;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount1843(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount1843 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount2() {
        return outRetrievedProfitsScenarioAmount2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount2(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount3() {
        return outRetrievedProfitsScenarioAmount3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount3(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount4() {
        return outRetrievedProfitsScenarioAmount4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount4(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount5() {
        return outRetrievedProfitsScenarioAmount5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount5(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount6() {
        return outRetrievedProfitsScenarioAmount6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount6(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount7() {
        return outRetrievedProfitsScenarioAmount7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount7(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount8() {
        return outRetrievedProfitsScenarioAmount8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount8(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetrievedProfitsScenarioAmount9() {
        return outRetrievedProfitsScenarioAmount9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetrievedProfitsScenarioAmount9(BigDecimal value) {
        this.outRetrievedProfitsScenarioAmount9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioApplicationId() {
        return outRetrievedProfitsScenarioApplicationId;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioApplicationId(String value) {
        this.outRetrievedProfitsScenarioApplicationId = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioApplicationSts() {
        return outRetrievedProfitsScenarioApplicationSts;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioApplicationSts(String value) {
        this.outRetrievedProfitsScenarioApplicationSts = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCurrencyId1 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCurrencyId1() {
        return outRetrievedProfitsScenarioCurrencyId1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCurrencyId1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCurrencyId1(int value) {
        this.outRetrievedProfitsScenarioCurrencyId1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCurrencyId2 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCurrencyId2() {
        return outRetrievedProfitsScenarioCurrencyId2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCurrencyId2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCurrencyId2(int value) {
        this.outRetrievedProfitsScenarioCurrencyId2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCurrencyId3 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCurrencyId3() {
        return outRetrievedProfitsScenarioCurrencyId3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCurrencyId3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCurrencyId3(int value) {
        this.outRetrievedProfitsScenarioCurrencyId3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd1 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd1() {
        return outRetrievedProfitsScenarioCustomerCd1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd1(short value) {
        this.outRetrievedProfitsScenarioCustomerCd1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd2 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd2() {
        return outRetrievedProfitsScenarioCustomerCd2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd2(short value) {
        this.outRetrievedProfitsScenarioCustomerCd2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd3 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd3() {
        return outRetrievedProfitsScenarioCustomerCd3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd3(short value) {
        this.outRetrievedProfitsScenarioCustomerCd3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId1 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId1() {
        return outRetrievedProfitsScenarioCustomerId1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId1(int value) {
        this.outRetrievedProfitsScenarioCustomerId1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId2 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId2() {
        return outRetrievedProfitsScenarioCustomerId2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId2(int value) {
        this.outRetrievedProfitsScenarioCustomerId2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId3 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId3() {
        return outRetrievedProfitsScenarioCustomerId3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId3(int value) {
        this.outRetrievedProfitsScenarioCustomerId3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate1() {
        return outRetrievedProfitsScenarioDate1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate1(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate10() {
        return outRetrievedProfitsScenarioDate10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate10(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate11() {
        return outRetrievedProfitsScenarioDate11;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate11(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate11 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate12() {
        return outRetrievedProfitsScenarioDate12;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate12(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate12 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate13() {
        return outRetrievedProfitsScenarioDate13;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate13(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate13 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate14() {
        return outRetrievedProfitsScenarioDate14;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate14(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate14 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate15() {
        return outRetrievedProfitsScenarioDate15;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate15(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate15 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate2() {
        return outRetrievedProfitsScenarioDate2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate2(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate3() {
        return outRetrievedProfitsScenarioDate3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate3(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate4() {
        return outRetrievedProfitsScenarioDate4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate4(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate5() {
        return outRetrievedProfitsScenarioDate5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate5(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate6() {
        return outRetrievedProfitsScenarioDate6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate6(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate7() {
        return outRetrievedProfitsScenarioDate7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate7(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate8() {
        return outRetrievedProfitsScenarioDate8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate8(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioDate9() {
        return outRetrievedProfitsScenarioDate9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioDate9(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioDate9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr1() {
        return outRetrievedProfitsScenarioDescr1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr1(String value) {
        this.outRetrievedProfitsScenarioDescr1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr10() {
        return outRetrievedProfitsScenarioDescr10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr10(String value) {
        this.outRetrievedProfitsScenarioDescr10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr2() {
        return outRetrievedProfitsScenarioDescr2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr2(String value) {
        this.outRetrievedProfitsScenarioDescr2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr3() {
        return outRetrievedProfitsScenarioDescr3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr3(String value) {
        this.outRetrievedProfitsScenarioDescr3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr4() {
        return outRetrievedProfitsScenarioDescr4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr4(String value) {
        this.outRetrievedProfitsScenarioDescr4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr5() {
        return outRetrievedProfitsScenarioDescr5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr5(String value) {
        this.outRetrievedProfitsScenarioDescr5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr6() {
        return outRetrievedProfitsScenarioDescr6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr6(String value) {
        this.outRetrievedProfitsScenarioDescr6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr7() {
        return outRetrievedProfitsScenarioDescr7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr7(String value) {
        this.outRetrievedProfitsScenarioDescr7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr8() {
        return outRetrievedProfitsScenarioDescr8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr8(String value) {
        this.outRetrievedProfitsScenarioDescr8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr9() {
        return outRetrievedProfitsScenarioDescr9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr9(String value) {
        this.outRetrievedProfitsScenarioDescr9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag1() {
        return outRetrievedProfitsScenarioFlag1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag1(String value) {
        this.outRetrievedProfitsScenarioFlag1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag10() {
        return outRetrievedProfitsScenarioFlag10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag10(String value) {
        this.outRetrievedProfitsScenarioFlag10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag2() {
        return outRetrievedProfitsScenarioFlag2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag2(String value) {
        this.outRetrievedProfitsScenarioFlag2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag3() {
        return outRetrievedProfitsScenarioFlag3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag3(String value) {
        this.outRetrievedProfitsScenarioFlag3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag4() {
        return outRetrievedProfitsScenarioFlag4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag4(String value) {
        this.outRetrievedProfitsScenarioFlag4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag5() {
        return outRetrievedProfitsScenarioFlag5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag5(String value) {
        this.outRetrievedProfitsScenarioFlag5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag6() {
        return outRetrievedProfitsScenarioFlag6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag6(String value) {
        this.outRetrievedProfitsScenarioFlag6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag7() {
        return outRetrievedProfitsScenarioFlag7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag7(String value) {
        this.outRetrievedProfitsScenarioFlag7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag8() {
        return outRetrievedProfitsScenarioFlag8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag8(String value) {
        this.outRetrievedProfitsScenarioFlag8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioFlag9() {
        return outRetrievedProfitsScenarioFlag9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioFlag9(String value) {
        this.outRetrievedProfitsScenarioFlag9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioInsertDate() {
        return outRetrievedProfitsScenarioInsertDate;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioInsertDate(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioInsertDate = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInsertUnit property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInsertUnit() {
        return outRetrievedProfitsScenarioInsertUnit;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInsertUnit property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInsertUnit(int value) {
        this.outRetrievedProfitsScenarioInsertUnit = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioInsertUser() {
        return outRetrievedProfitsScenarioInsertUser;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioInsertUser(String value) {
        this.outRetrievedProfitsScenarioInsertUser = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger1 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger1() {
        return outRetrievedProfitsScenarioInteger1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger1(int value) {
        this.outRetrievedProfitsScenarioInteger1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger10 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger10() {
        return outRetrievedProfitsScenarioInteger10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger10 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger10(int value) {
        this.outRetrievedProfitsScenarioInteger10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger2 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger2() {
        return outRetrievedProfitsScenarioInteger2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger2(int value) {
        this.outRetrievedProfitsScenarioInteger2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger3 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger3() {
        return outRetrievedProfitsScenarioInteger3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger3(int value) {
        this.outRetrievedProfitsScenarioInteger3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger4 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger4() {
        return outRetrievedProfitsScenarioInteger4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger4 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger4(int value) {
        this.outRetrievedProfitsScenarioInteger4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger5 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger5() {
        return outRetrievedProfitsScenarioInteger5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger5 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger5(int value) {
        this.outRetrievedProfitsScenarioInteger5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger6 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger6() {
        return outRetrievedProfitsScenarioInteger6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger6 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger6(int value) {
        this.outRetrievedProfitsScenarioInteger6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger7 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger7() {
        return outRetrievedProfitsScenarioInteger7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger7 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger7(int value) {
        this.outRetrievedProfitsScenarioInteger7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger8 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger8() {
        return outRetrievedProfitsScenarioInteger8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger8 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger8(int value) {
        this.outRetrievedProfitsScenarioInteger8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioInteger9 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioInteger9() {
        return outRetrievedProfitsScenarioInteger9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioInteger9 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioInteger9(int value) {
        this.outRetrievedProfitsScenarioInteger9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioKeySn property.
     * 
     */
    public double getOutRetrievedProfitsScenarioKeySn() {
        return outRetrievedProfitsScenarioKeySn;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioKeySn property.
     * 
     */
    public void setOutRetrievedProfitsScenarioKeySn(double value) {
        this.outRetrievedProfitsScenarioKeySn = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioKeySystem property.
     * 
     */
    public int getOutRetrievedProfitsScenarioKeySystem() {
        return outRetrievedProfitsScenarioKeySystem;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioKeySystem property.
     * 
     */
    public void setOutRetrievedProfitsScenarioKeySystem(int value) {
        this.outRetrievedProfitsScenarioKeySystem = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioKeyTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioKeyTmstamp() {
        return outRetrievedProfitsScenarioKeyTmstamp;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioKeyTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioKeyTmstamp(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioKeyTmstamp = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc1() {
        return outRetrievedProfitsScenarioLargeDesc1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc1(String value) {
        this.outRetrievedProfitsScenarioLargeDesc1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc2() {
        return outRetrievedProfitsScenarioLargeDesc2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc2(String value) {
        this.outRetrievedProfitsScenarioLargeDesc2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc3() {
        return outRetrievedProfitsScenarioLargeDesc3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc3(String value) {
        this.outRetrievedProfitsScenarioLargeDesc3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber1 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber1() {
        return outRetrievedProfitsScenarioNumber1;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber1 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber1(double value) {
        this.outRetrievedProfitsScenarioNumber1 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber10 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber10() {
        return outRetrievedProfitsScenarioNumber10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber10 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber10(double value) {
        this.outRetrievedProfitsScenarioNumber10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber2 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber2() {
        return outRetrievedProfitsScenarioNumber2;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber2 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber2(double value) {
        this.outRetrievedProfitsScenarioNumber2 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber3 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber3() {
        return outRetrievedProfitsScenarioNumber3;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber3 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber3(double value) {
        this.outRetrievedProfitsScenarioNumber3 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber4 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber4() {
        return outRetrievedProfitsScenarioNumber4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber4 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber4(double value) {
        this.outRetrievedProfitsScenarioNumber4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber5 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber5() {
        return outRetrievedProfitsScenarioNumber5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber5 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber5(double value) {
        this.outRetrievedProfitsScenarioNumber5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber6 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber6() {
        return outRetrievedProfitsScenarioNumber6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber6 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber6(double value) {
        this.outRetrievedProfitsScenarioNumber6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber7 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber7() {
        return outRetrievedProfitsScenarioNumber7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber7 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber7(double value) {
        this.outRetrievedProfitsScenarioNumber7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber8 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber8() {
        return outRetrievedProfitsScenarioNumber8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber8 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber8(double value) {
        this.outRetrievedProfitsScenarioNumber8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioNumber9 property.
     * 
     */
    public double getOutRetrievedProfitsScenarioNumber9() {
        return outRetrievedProfitsScenarioNumber9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioNumber9 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioNumber9(double value) {
        this.outRetrievedProfitsScenarioNumber9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioProductId property.
     * 
     */
    public int getOutRetrievedProfitsScenarioProductId() {
        return outRetrievedProfitsScenarioProductId;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioProductId property.
     * 
     */
    public void setOutRetrievedProfitsScenarioProductId(int value) {
        this.outRetrievedProfitsScenarioProductId = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioScenarioAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioScenarioAccount() {
        return outRetrievedProfitsScenarioScenarioAccount;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioScenarioAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioScenarioAccount(String value) {
        this.outRetrievedProfitsScenarioScenarioAccount = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioScenarioAccountCd property.
     * 
     */
    public int getOutRetrievedProfitsScenarioScenarioAccountCd() {
        return outRetrievedProfitsScenarioScenarioAccountCd;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioScenarioAccountCd property.
     * 
     */
    public void setOutRetrievedProfitsScenarioScenarioAccountCd(int value) {
        this.outRetrievedProfitsScenarioScenarioAccountCd = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioScenarioSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioScenarioSts() {
        return outRetrievedProfitsScenarioScenarioSts;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioScenarioSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioScenarioSts(String value) {
        this.outRetrievedProfitsScenarioScenarioSts = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetrievedProfitsScenarioUpdateDate() {
        return outRetrievedProfitsScenarioUpdateDate;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetrievedProfitsScenarioUpdateDate(XMLGregorianCalendar value) {
        this.outRetrievedProfitsScenarioUpdateDate = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioUpdateUnit property.
     * 
     */
    public int getOutRetrievedProfitsScenarioUpdateUnit() {
        return outRetrievedProfitsScenarioUpdateUnit;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioUpdateUnit property.
     * 
     */
    public void setOutRetrievedProfitsScenarioUpdateUnit(int value) {
        this.outRetrievedProfitsScenarioUpdateUnit = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioUpdateUser() {
        return outRetrievedProfitsScenarioUpdateUser;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioUpdateUser(String value) {
        this.outRetrievedProfitsScenarioUpdateUser = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId4 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId4() {
        return outRetrievedProfitsScenarioCustomerId4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId4 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId4(int value) {
        this.outRetrievedProfitsScenarioCustomerId4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd4 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd4() {
        return outRetrievedProfitsScenarioCustomerCd4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd4 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd4(short value) {
        this.outRetrievedProfitsScenarioCustomerCd4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId5 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId5() {
        return outRetrievedProfitsScenarioCustomerId5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId5 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId5(int value) {
        this.outRetrievedProfitsScenarioCustomerId5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd5 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd5() {
        return outRetrievedProfitsScenarioCustomerCd5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd5 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd5(short value) {
        this.outRetrievedProfitsScenarioCustomerCd5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId6 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId6() {
        return outRetrievedProfitsScenarioCustomerId6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId6 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId6(int value) {
        this.outRetrievedProfitsScenarioCustomerId6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd6 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd6() {
        return outRetrievedProfitsScenarioCustomerCd6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd6 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd6(short value) {
        this.outRetrievedProfitsScenarioCustomerCd6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId7 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId7() {
        return outRetrievedProfitsScenarioCustomerId7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId7 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId7(int value) {
        this.outRetrievedProfitsScenarioCustomerId7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd7 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd7() {
        return outRetrievedProfitsScenarioCustomerCd7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd7 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd7(short value) {
        this.outRetrievedProfitsScenarioCustomerCd7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId8 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId8() {
        return outRetrievedProfitsScenarioCustomerId8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId8 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId8(int value) {
        this.outRetrievedProfitsScenarioCustomerId8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd8 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd8() {
        return outRetrievedProfitsScenarioCustomerCd8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd8 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd8(short value) {
        this.outRetrievedProfitsScenarioCustomerCd8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId9 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId9() {
        return outRetrievedProfitsScenarioCustomerId9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId9 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId9(int value) {
        this.outRetrievedProfitsScenarioCustomerId9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd9 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd9() {
        return outRetrievedProfitsScenarioCustomerCd9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd9 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd9(short value) {
        this.outRetrievedProfitsScenarioCustomerCd9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerId10 property.
     * 
     */
    public int getOutRetrievedProfitsScenarioCustomerId10() {
        return outRetrievedProfitsScenarioCustomerId10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerId10 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerId10(int value) {
        this.outRetrievedProfitsScenarioCustomerId10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioCustomerCd10 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioCustomerCd10() {
        return outRetrievedProfitsScenarioCustomerCd10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioCustomerCd10 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioCustomerCd10(short value) {
        this.outRetrievedProfitsScenarioCustomerCd10 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioAccountNumber4() {
        return outRetrievedProfitsScenarioAccountNumber4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioAccountNumber4(String value) {
        this.outRetrievedProfitsScenarioAccountNumber4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountCd4 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioAccountCd4() {
        return outRetrievedProfitsScenarioAccountCd4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountCd4 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountCd4(short value) {
        this.outRetrievedProfitsScenarioAccountCd4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountSystem4 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioAccountSystem4() {
        return outRetrievedProfitsScenarioAccountSystem4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountSystem4 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountSystem4(short value) {
        this.outRetrievedProfitsScenarioAccountSystem4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountNumber5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioAccountNumber5() {
        return outRetrievedProfitsScenarioAccountNumber5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountNumber5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioAccountNumber5(String value) {
        this.outRetrievedProfitsScenarioAccountNumber5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountCd5 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioAccountCd5() {
        return outRetrievedProfitsScenarioAccountCd5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountCd5 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountCd5(short value) {
        this.outRetrievedProfitsScenarioAccountCd5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioAccountSystem5 property.
     * 
     */
    public short getOutRetrievedProfitsScenarioAccountSystem5() {
        return outRetrievedProfitsScenarioAccountSystem5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioAccountSystem5 property.
     * 
     */
    public void setOutRetrievedProfitsScenarioAccountSystem5(short value) {
        this.outRetrievedProfitsScenarioAccountSystem5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr11() {
        return outRetrievedProfitsScenarioDescr11;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr11(String value) {
        this.outRetrievedProfitsScenarioDescr11 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr12() {
        return outRetrievedProfitsScenarioDescr12;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr12(String value) {
        this.outRetrievedProfitsScenarioDescr12 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr13() {
        return outRetrievedProfitsScenarioDescr13;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr13(String value) {
        this.outRetrievedProfitsScenarioDescr13 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr14() {
        return outRetrievedProfitsScenarioDescr14;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr14(String value) {
        this.outRetrievedProfitsScenarioDescr14 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr15() {
        return outRetrievedProfitsScenarioDescr15;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr15(String value) {
        this.outRetrievedProfitsScenarioDescr15 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr16() {
        return outRetrievedProfitsScenarioDescr16;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr16(String value) {
        this.outRetrievedProfitsScenarioDescr16 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr17() {
        return outRetrievedProfitsScenarioDescr17;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr17(String value) {
        this.outRetrievedProfitsScenarioDescr17 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr18() {
        return outRetrievedProfitsScenarioDescr18;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr18(String value) {
        this.outRetrievedProfitsScenarioDescr18 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr19() {
        return outRetrievedProfitsScenarioDescr19;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr19(String value) {
        this.outRetrievedProfitsScenarioDescr19 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioDescr20() {
        return outRetrievedProfitsScenarioDescr20;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioDescr20(String value) {
        this.outRetrievedProfitsScenarioDescr20 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc4() {
        return outRetrievedProfitsScenarioLargeDesc4;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc4(String value) {
        this.outRetrievedProfitsScenarioLargeDesc4 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc5() {
        return outRetrievedProfitsScenarioLargeDesc5;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc5(String value) {
        this.outRetrievedProfitsScenarioLargeDesc5 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc6() {
        return outRetrievedProfitsScenarioLargeDesc6;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc6(String value) {
        this.outRetrievedProfitsScenarioLargeDesc6 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc7() {
        return outRetrievedProfitsScenarioLargeDesc7;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc7(String value) {
        this.outRetrievedProfitsScenarioLargeDesc7 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc8() {
        return outRetrievedProfitsScenarioLargeDesc8;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc8(String value) {
        this.outRetrievedProfitsScenarioLargeDesc8 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc9() {
        return outRetrievedProfitsScenarioLargeDesc9;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc9(String value) {
        this.outRetrievedProfitsScenarioLargeDesc9 = value;
    }

    /**
     * Gets the value of the outRetrievedProfitsScenarioLargeDesc10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetrievedProfitsScenarioLargeDesc10() {
        return outRetrievedProfitsScenarioLargeDesc10;
    }

    /**
     * Sets the value of the outRetrievedProfitsScenarioLargeDesc10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetrievedProfitsScenarioLargeDesc10(String value) {
        this.outRetrievedProfitsScenarioLargeDesc10 = value;
    }

}
