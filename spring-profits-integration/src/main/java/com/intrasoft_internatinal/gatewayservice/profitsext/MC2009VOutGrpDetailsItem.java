
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2009VOutGrpDetailsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2009VOutGrpDetailsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDetailsOutGrmDetailCurr1CurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailCurr2CurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailCurr3CurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlCustId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2009VOutGrpDetailsItem", propOrder = {
    "outGrpDetailsOutGrmDetailCurr1CurrencyShortDescr",
    "outGrpDetailsOutGrmDetailCurr2CurrencyShortDescr",
    "outGrpDetailsOutGrmDetailCurr3CurrencyShortDescr",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount10",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount7",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount8",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlAmount9",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCustId1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlCustId2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate10",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate7",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate8",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDate9",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr10",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr11",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr12",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr13",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr14",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr15",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr16",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr17",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr18",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr19",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr20",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr7",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr8",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDescr9",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag10",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag7",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag8",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlFlag9",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber10",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber3",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber4",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber5",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber6",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber7",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber8",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlNumber9",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit",
    "outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr"
})
public class MC2009VOutGrpDetailsItem {

    @XmlElement(name = "OutGrpDetailsOutGrmDetailCurr1CurrencyShortDescr")
    protected String outGrpDetailsOutGrmDetailCurr1CurrencyShortDescr;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailCurr2CurrencyShortDescr")
    protected String outGrpDetailsOutGrmDetailCurr2CurrencyShortDescr;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailCurr3CurrencyShortDescr")
    protected String outGrpDetailsOutGrmDetailCurr3CurrencyShortDescr;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1")
    protected short outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2")
    protected short outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount10", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount10;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount2", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount3", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount4", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount5", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount6", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount7", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount7;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount8", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount8;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlAmount9", required = true)
    protected BigDecimal outGrpDetailsOutGrmDetailsCollateralTblDtlAmount9;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1")
    protected short outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2")
    protected short outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCustId1")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlCustId1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlCustId2")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlCustId2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate10;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate7;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate8;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlDate9;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr1")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr10")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr10;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr11")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr11;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr12")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr12;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr13")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr13;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr14")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr14;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr15")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr15;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr16")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr16;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr17")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr17;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr18")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr18;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr19")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr19;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr2")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr20")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr20;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr3")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr4")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr5")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr6")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr7")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr7;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr8")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr8;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDescr9")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDescr9;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag1")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag10")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag10;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag2")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag3")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag4")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag5")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag6")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag7")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag7;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag8")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag8;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlFlag9")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlFlag9;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber1")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber10")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber10;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber2")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber3")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber3;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber4")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber4;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber5")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber5;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber6")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber6;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber7")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber7;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber8")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber8;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlNumber9")
    protected double outGrpDetailsOutGrmDetailsCollateralTblDtlNumber9;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1")
    protected short outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2")
    protected short outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit")
    protected int outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit;
    @XmlElement(name = "OutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr")
    protected String outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr;

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailCurr1CurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailCurr1CurrencyShortDescr() {
        return outGrpDetailsOutGrmDetailCurr1CurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailCurr1CurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailCurr1CurrencyShortDescr(String value) {
        this.outGrpDetailsOutGrmDetailCurr1CurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailCurr2CurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailCurr2CurrencyShortDescr() {
        return outGrpDetailsOutGrmDetailCurr2CurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailCurr2CurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailCurr2CurrencyShortDescr(String value) {
        this.outGrpDetailsOutGrmDetailCurr2CurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailCurr3CurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailCurr3CurrencyShortDescr() {
        return outGrpDetailsOutGrmDetailCurr3CurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailCurr3CurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailCurr3CurrencyShortDescr(String value) {
        this.outGrpDetailsOutGrmDetailCurr3CurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1 property.
     * 
     */
    public short getOutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1(short value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2 property.
     * 
     */
    public short getOutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2(short value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAccountCd2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount10() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount10;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount10(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount10 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1841 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1842 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount1843 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount2(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount3(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount4(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount5(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount6(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount7() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount7;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount7(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount7 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount8() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount8;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount8(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount8 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount9() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlAmount9;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlAmount9(BigDecimal value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlAmount9 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1 property.
     * 
     */
    public short getOutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1(short value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2 property.
     * 
     */
    public short getOutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2(short value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCDigit2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCurrencyId3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCustId1 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlCustId1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCustId1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCustId1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCustId1(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCustId1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCustId2 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlCustId2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlCustId2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlCustId2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlCustId2(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlCustId2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate1(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate10() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate10;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate10(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate10 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate2(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate3(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate4(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate5(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate6(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate7() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate7;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate7(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate7 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate8() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate8;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate8(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate8 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlDate9() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDate9;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDate9(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDate9 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr1(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr10() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr10;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr10(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr10 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr11() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr11;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr11(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr11 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr12() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr12;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr12(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr12 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr13() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr13;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr13(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr13 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr14() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr14;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr14(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr14 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr15() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr15;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr15(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr15 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr16() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr16;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr16(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr16 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr17() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr17;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr17(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr17 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr18() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr18;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr18(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr18 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr19() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr19;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr19(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr19 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr2(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr20() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr20;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr20(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr20 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr3(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr4(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr5(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr6(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr7() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr7;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr7(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr7 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr8() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr8;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr8(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr8 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr9() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDescr9;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDescr9(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDescr9 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDtlRecordType = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlEntryComments = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag1(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag10() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag10;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag10(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag10 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag2(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag3(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag4(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag5(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag6(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag7() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag7;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag7(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag7 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag8() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag8;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag8(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag8 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag9() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlFlag9;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlFlag9(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlFlag9 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdParType6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlGdSerialNum6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlHdrInternalSn = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlHdrRecordType = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlInsertDate = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlInsertTimestamp = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUnit = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlInsertUsr = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlLagreDescr2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlLargeDescr3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber1 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber1(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber10 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber10() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber10;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber10 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber10(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber10 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber2 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber2(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber3 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber3() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber3;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber3 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber3(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber3 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber4 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber4() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber4;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber4 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber4(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber4 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber5 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber5() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber5;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber5 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber5(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber5 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber6 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber6() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber6;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber6 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber6(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber6 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber7 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber7() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber7;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber7 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber7(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber7 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber8 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber8() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber8;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber8 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber8(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber8 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber9 property.
     * 
     */
    public double getOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber9() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlNumber9;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlNumber9 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlNumber9(double value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlNumber9 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1 property.
     * 
     */
    public short getOutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1(short value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2 property.
     * 
     */
    public short getOutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2 property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2(short value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlPrftSystem2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount1 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlProfitsAccount2 = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateDate = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp(XMLGregorianCalendar value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateTimestamp = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit property.
     * 
     */
    public int getOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit property.
     * 
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit(int value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUnit = value;
    }

    /**
     * Gets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr() {
        return outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr;
    }

    /**
     * Sets the value of the outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr(String value) {
        this.outGrpDetailsOutGrmDetailsCollateralTblDtlUpdateUsr = value;
    }

}
