
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2009OutGrpAllDetailsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2009OutGrpAllDetailsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2009OutGrpAllDetailsItem", propOrder = {
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments",
    "outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus",
    "outGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr",
    "outGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr",
    "outGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr"
})
public class MC2009OutGrpAllDetailsItem {

    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1")
    protected short outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1")
    protected short outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2")
    protected short outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2")
    protected short outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1")
    protected short outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2")
    protected short outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843", required = true)
    protected BigDecimal outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10")
    protected double outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit")
    protected int outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus")
    protected String outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr")
    protected String outGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr")
    protected String outGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr;
    @XmlElement(name = "OutGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr")
    protected String outGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr;

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrInternalSn = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlHdrRecordType = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlRecordType = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1 property.
     * 
     */
    public short getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1(short value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1 property.
     * 
     */
    public short getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1(short value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlProfitsAccount2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2 property.
     * 
     */
    public short getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2(short value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAccountCd2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2 property.
     * 
     */
    public short getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2(short value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlPrftSystem2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1 property.
     * 
     */
    public short getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1(short value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCustId2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2 property.
     * 
     */
    public short getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2(short value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCDigit2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlCurrencyId3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate7 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate8 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate9 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDate10 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount7 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount8 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount9 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount10 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1841 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1842 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843(BigDecimal value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlAmount1843 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber7 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber8 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber9 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10 property.
     * 
     */
    public double getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10(double value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlNumber10 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr7 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr8 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr9 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr10 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr11 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr12 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr13 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr14 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr15 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr16 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr17 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr18 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr19 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlDescr20 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag7 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag8 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag9 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlFlag10 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum4 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum5 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdParType6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlGdSerialNum6 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr1 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLagreDescr2 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlLargeDescr3 = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUnit = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertUsr = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertDate = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlInsertTimestamp = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit property.
     * 
     */
    public int getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit property.
     * 
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit(int value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUnit = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateUsr = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateDate = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp(XMLGregorianCalendar value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlUpdateTimestamp = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryComments = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus() {
        return outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus(String value) {
        this.outGrpAllDetailsOutGrmAllDetailsCollateralTblDtlEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr() {
        return outGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr(String value) {
        this.outGrpAllDetailsOutGrmAllDetailCurr1CurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr() {
        return outGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr(String value) {
        this.outGrpAllDetailsOutGrmAllDetailCurr2CurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr() {
        return outGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr(String value) {
        this.outGrpAllDetailsOutGrmAllDetailCurr3CurrencyShortDescr = value;
    }

}
