
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2009VAdditionalCollateralDetailInformationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2009VAdditionalCollateralDetailInformationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTblDtlAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTblDtlCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTblDtlCDigit2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTblDtlCurrencyId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlCurrencyId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlCurrencyId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlCustId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDtlRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdParType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdParType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdParType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdParType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdParType5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdParType6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdSerialNum1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdSerialNum2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdSerialNum3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdSerialNum4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdSerialNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlGdSerialNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlHdrInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlHdrRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlInsertTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlInsertUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlLagreDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlLargeDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlLargeDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTblDtlPrftSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTblDtlPrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTblDtlProfitsAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTblDtlUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlUpdateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTblDtlUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTblDtlUpdateUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCollateralTblDtlDtlRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDynamicCollateralPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDynamicCollateralPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2009VAdditionalCollateralDetailInformationImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inContinueCollateralTblDtlDtlSerialNumber",
    "inManipulateCollateralTblDtlAccountCd1",
    "inManipulateCollateralTblDtlAccountCd2",
    "inManipulateCollateralTblDtlAmount1",
    "inManipulateCollateralTblDtlAmount10",
    "inManipulateCollateralTblDtlAmount1841",
    "inManipulateCollateralTblDtlAmount1842",
    "inManipulateCollateralTblDtlAmount1843",
    "inManipulateCollateralTblDtlAmount2",
    "inManipulateCollateralTblDtlAmount3",
    "inManipulateCollateralTblDtlAmount4",
    "inManipulateCollateralTblDtlAmount5",
    "inManipulateCollateralTblDtlAmount6",
    "inManipulateCollateralTblDtlAmount7",
    "inManipulateCollateralTblDtlAmount8",
    "inManipulateCollateralTblDtlAmount9",
    "inManipulateCollateralTblDtlCDigit1",
    "inManipulateCollateralTblDtlCDigit2",
    "inManipulateCollateralTblDtlCurrencyId1",
    "inManipulateCollateralTblDtlCurrencyId2",
    "inManipulateCollateralTblDtlCurrencyId3",
    "inManipulateCollateralTblDtlCustId1",
    "inManipulateCollateralTblDtlCustId2",
    "inManipulateCollateralTblDtlDate1",
    "inManipulateCollateralTblDtlDate10",
    "inManipulateCollateralTblDtlDate2",
    "inManipulateCollateralTblDtlDate3",
    "inManipulateCollateralTblDtlDate4",
    "inManipulateCollateralTblDtlDate5",
    "inManipulateCollateralTblDtlDate6",
    "inManipulateCollateralTblDtlDate7",
    "inManipulateCollateralTblDtlDate8",
    "inManipulateCollateralTblDtlDate9",
    "inManipulateCollateralTblDtlDescr1",
    "inManipulateCollateralTblDtlDescr10",
    "inManipulateCollateralTblDtlDescr11",
    "inManipulateCollateralTblDtlDescr12",
    "inManipulateCollateralTblDtlDescr13",
    "inManipulateCollateralTblDtlDescr14",
    "inManipulateCollateralTblDtlDescr15",
    "inManipulateCollateralTblDtlDescr16",
    "inManipulateCollateralTblDtlDescr17",
    "inManipulateCollateralTblDtlDescr18",
    "inManipulateCollateralTblDtlDescr19",
    "inManipulateCollateralTblDtlDescr2",
    "inManipulateCollateralTblDtlDescr20",
    "inManipulateCollateralTblDtlDescr3",
    "inManipulateCollateralTblDtlDescr4",
    "inManipulateCollateralTblDtlDescr5",
    "inManipulateCollateralTblDtlDescr6",
    "inManipulateCollateralTblDtlDescr7",
    "inManipulateCollateralTblDtlDescr8",
    "inManipulateCollateralTblDtlDescr9",
    "inManipulateCollateralTblDtlDtlRecordType",
    "inManipulateCollateralTblDtlDtlSerialNumber",
    "inManipulateCollateralTblDtlEntryComments",
    "inManipulateCollateralTblDtlEntryStatus",
    "inManipulateCollateralTblDtlFlag1",
    "inManipulateCollateralTblDtlFlag10",
    "inManipulateCollateralTblDtlFlag2",
    "inManipulateCollateralTblDtlFlag3",
    "inManipulateCollateralTblDtlFlag4",
    "inManipulateCollateralTblDtlFlag5",
    "inManipulateCollateralTblDtlFlag6",
    "inManipulateCollateralTblDtlFlag7",
    "inManipulateCollateralTblDtlFlag8",
    "inManipulateCollateralTblDtlFlag9",
    "inManipulateCollateralTblDtlGdParType1",
    "inManipulateCollateralTblDtlGdParType2",
    "inManipulateCollateralTblDtlGdParType3",
    "inManipulateCollateralTblDtlGdParType4",
    "inManipulateCollateralTblDtlGdParType5",
    "inManipulateCollateralTblDtlGdParType6",
    "inManipulateCollateralTblDtlGdSerialNum1",
    "inManipulateCollateralTblDtlGdSerialNum2",
    "inManipulateCollateralTblDtlGdSerialNum3",
    "inManipulateCollateralTblDtlGdSerialNum4",
    "inManipulateCollateralTblDtlGdSerialNum5",
    "inManipulateCollateralTblDtlGdSerialNum6",
    "inManipulateCollateralTblDtlHdrInternalSn",
    "inManipulateCollateralTblDtlHdrRecordType",
    "inManipulateCollateralTblDtlInsertDate",
    "inManipulateCollateralTblDtlInsertTimestamp",
    "inManipulateCollateralTblDtlInsertUnit",
    "inManipulateCollateralTblDtlInsertUsr",
    "inManipulateCollateralTblDtlLagreDescr2",
    "inManipulateCollateralTblDtlLargeDescr1",
    "inManipulateCollateralTblDtlLargeDescr3",
    "inManipulateCollateralTblDtlNumber1",
    "inManipulateCollateralTblDtlNumber10",
    "inManipulateCollateralTblDtlNumber2",
    "inManipulateCollateralTblDtlNumber3",
    "inManipulateCollateralTblDtlNumber4",
    "inManipulateCollateralTblDtlNumber5",
    "inManipulateCollateralTblDtlNumber6",
    "inManipulateCollateralTblDtlNumber7",
    "inManipulateCollateralTblDtlNumber8",
    "inManipulateCollateralTblDtlNumber9",
    "inManipulateCollateralTblDtlPrftSystem1",
    "inManipulateCollateralTblDtlPrftSystem2",
    "inManipulateCollateralTblDtlProfitsAccount1",
    "inManipulateCollateralTblDtlProfitsAccount2",
    "inManipulateCollateralTblDtlUpdateDate",
    "inManipulateCollateralTblDtlUpdateTimestamp",
    "inManipulateCollateralTblDtlUpdateUnit",
    "inManipulateCollateralTblDtlUpdateUsr",
    "inSelectedCollateralTableInternalSn",
    "inSelectedCollateralTableRecordDescr",
    "inSelectedCollateralTableRecordType",
    "inSelectedCollateralTblDtlDtlRecordType",
    "inSelectedCollateralTblDtlDtlSerialNumber",
    "inSelectedCustomerCDigit",
    "inSelectedCustomerCustId",
    "inTrxDefaultJustificIdJustific",
    "inTrxDefaultProductIdProduct",
    "inTrxLogMntRecordingAuthorizer1",
    "inTrxLogMntRecordingAuthorizer2",
    "inTrxLogMntRecordingPrftSystem",
    "inTrxLogMntRecordingReversalFlag",
    "inTrxLogMntRecordingTerminalNumber",
    "inTrxLogMntRecordingTrxCode",
    "inDynamicCollateralPfgTagSetSetupTagSetCode",
    "inDynamicCollateralPfgTagSetSetupDescription"
})
public class MC2009VAdditionalCollateralDetailInformationImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueCollateralTblDtlDtlSerialNumber")
    protected double inContinueCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "InManipulateCollateralTblDtlAccountCd1")
    protected short inManipulateCollateralTblDtlAccountCd1;
    @XmlElement(name = "InManipulateCollateralTblDtlAccountCd2")
    protected short inManipulateCollateralTblDtlAccountCd2;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount1", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount1;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount10", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount10;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount1841", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount1841;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount1842", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount1842;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount1843", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount1843;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount2", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount2;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount3", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount3;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount4", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount4;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount5", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount5;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount6", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount6;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount7", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount7;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount8", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount8;
    @XmlElement(name = "InManipulateCollateralTblDtlAmount9", required = true)
    protected BigDecimal inManipulateCollateralTblDtlAmount9;
    @XmlElement(name = "InManipulateCollateralTblDtlCDigit1")
    protected short inManipulateCollateralTblDtlCDigit1;
    @XmlElement(name = "InManipulateCollateralTblDtlCDigit2")
    protected short inManipulateCollateralTblDtlCDigit2;
    @XmlElement(name = "InManipulateCollateralTblDtlCurrencyId1")
    protected int inManipulateCollateralTblDtlCurrencyId1;
    @XmlElement(name = "InManipulateCollateralTblDtlCurrencyId2")
    protected int inManipulateCollateralTblDtlCurrencyId2;
    @XmlElement(name = "InManipulateCollateralTblDtlCurrencyId3")
    protected int inManipulateCollateralTblDtlCurrencyId3;
    @XmlElement(name = "InManipulateCollateralTblDtlCustId1")
    protected int inManipulateCollateralTblDtlCustId1;
    @XmlElement(name = "InManipulateCollateralTblDtlCustId2")
    protected int inManipulateCollateralTblDtlCustId2;
    @XmlElement(name = "InManipulateCollateralTblDtlDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate1;
    @XmlElement(name = "InManipulateCollateralTblDtlDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate10;
    @XmlElement(name = "InManipulateCollateralTblDtlDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate2;
    @XmlElement(name = "InManipulateCollateralTblDtlDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate3;
    @XmlElement(name = "InManipulateCollateralTblDtlDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate4;
    @XmlElement(name = "InManipulateCollateralTblDtlDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate5;
    @XmlElement(name = "InManipulateCollateralTblDtlDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate6;
    @XmlElement(name = "InManipulateCollateralTblDtlDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate7;
    @XmlElement(name = "InManipulateCollateralTblDtlDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate8;
    @XmlElement(name = "InManipulateCollateralTblDtlDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlDate9;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr1")
    protected String inManipulateCollateralTblDtlDescr1;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr10")
    protected String inManipulateCollateralTblDtlDescr10;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr11")
    protected String inManipulateCollateralTblDtlDescr11;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr12")
    protected String inManipulateCollateralTblDtlDescr12;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr13")
    protected String inManipulateCollateralTblDtlDescr13;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr14")
    protected String inManipulateCollateralTblDtlDescr14;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr15")
    protected String inManipulateCollateralTblDtlDescr15;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr16")
    protected String inManipulateCollateralTblDtlDescr16;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr17")
    protected String inManipulateCollateralTblDtlDescr17;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr18")
    protected String inManipulateCollateralTblDtlDescr18;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr19")
    protected String inManipulateCollateralTblDtlDescr19;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr2")
    protected String inManipulateCollateralTblDtlDescr2;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr20")
    protected String inManipulateCollateralTblDtlDescr20;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr3")
    protected String inManipulateCollateralTblDtlDescr3;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr4")
    protected String inManipulateCollateralTblDtlDescr4;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr5")
    protected String inManipulateCollateralTblDtlDescr5;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr6")
    protected String inManipulateCollateralTblDtlDescr6;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr7")
    protected String inManipulateCollateralTblDtlDescr7;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr8")
    protected String inManipulateCollateralTblDtlDescr8;
    @XmlElement(name = "InManipulateCollateralTblDtlDescr9")
    protected String inManipulateCollateralTblDtlDescr9;
    @XmlElement(name = "InManipulateCollateralTblDtlDtlRecordType")
    protected String inManipulateCollateralTblDtlDtlRecordType;
    @XmlElement(name = "InManipulateCollateralTblDtlDtlSerialNumber")
    protected double inManipulateCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "InManipulateCollateralTblDtlEntryComments")
    protected String inManipulateCollateralTblDtlEntryComments;
    @XmlElement(name = "InManipulateCollateralTblDtlEntryStatus")
    protected String inManipulateCollateralTblDtlEntryStatus;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag1")
    protected String inManipulateCollateralTblDtlFlag1;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag10")
    protected String inManipulateCollateralTblDtlFlag10;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag2")
    protected String inManipulateCollateralTblDtlFlag2;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag3")
    protected String inManipulateCollateralTblDtlFlag3;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag4")
    protected String inManipulateCollateralTblDtlFlag4;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag5")
    protected String inManipulateCollateralTblDtlFlag5;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag6")
    protected String inManipulateCollateralTblDtlFlag6;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag7")
    protected String inManipulateCollateralTblDtlFlag7;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag8")
    protected String inManipulateCollateralTblDtlFlag8;
    @XmlElement(name = "InManipulateCollateralTblDtlFlag9")
    protected String inManipulateCollateralTblDtlFlag9;
    @XmlElement(name = "InManipulateCollateralTblDtlGdParType1")
    protected String inManipulateCollateralTblDtlGdParType1;
    @XmlElement(name = "InManipulateCollateralTblDtlGdParType2")
    protected String inManipulateCollateralTblDtlGdParType2;
    @XmlElement(name = "InManipulateCollateralTblDtlGdParType3")
    protected String inManipulateCollateralTblDtlGdParType3;
    @XmlElement(name = "InManipulateCollateralTblDtlGdParType4")
    protected String inManipulateCollateralTblDtlGdParType4;
    @XmlElement(name = "InManipulateCollateralTblDtlGdParType5")
    protected String inManipulateCollateralTblDtlGdParType5;
    @XmlElement(name = "InManipulateCollateralTblDtlGdParType6")
    protected String inManipulateCollateralTblDtlGdParType6;
    @XmlElement(name = "InManipulateCollateralTblDtlGdSerialNum1")
    protected int inManipulateCollateralTblDtlGdSerialNum1;
    @XmlElement(name = "InManipulateCollateralTblDtlGdSerialNum2")
    protected int inManipulateCollateralTblDtlGdSerialNum2;
    @XmlElement(name = "InManipulateCollateralTblDtlGdSerialNum3")
    protected int inManipulateCollateralTblDtlGdSerialNum3;
    @XmlElement(name = "InManipulateCollateralTblDtlGdSerialNum4")
    protected int inManipulateCollateralTblDtlGdSerialNum4;
    @XmlElement(name = "InManipulateCollateralTblDtlGdSerialNum5")
    protected int inManipulateCollateralTblDtlGdSerialNum5;
    @XmlElement(name = "InManipulateCollateralTblDtlGdSerialNum6")
    protected int inManipulateCollateralTblDtlGdSerialNum6;
    @XmlElement(name = "InManipulateCollateralTblDtlHdrInternalSn")
    protected double inManipulateCollateralTblDtlHdrInternalSn;
    @XmlElement(name = "InManipulateCollateralTblDtlHdrRecordType")
    protected String inManipulateCollateralTblDtlHdrRecordType;
    @XmlElement(name = "InManipulateCollateralTblDtlInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlInsertDate;
    @XmlElement(name = "InManipulateCollateralTblDtlInsertTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlInsertTimestamp;
    @XmlElement(name = "InManipulateCollateralTblDtlInsertUnit")
    protected int inManipulateCollateralTblDtlInsertUnit;
    @XmlElement(name = "InManipulateCollateralTblDtlInsertUsr")
    protected String inManipulateCollateralTblDtlInsertUsr;
    @XmlElement(name = "InManipulateCollateralTblDtlLagreDescr2")
    protected String inManipulateCollateralTblDtlLagreDescr2;
    @XmlElement(name = "InManipulateCollateralTblDtlLargeDescr1")
    protected String inManipulateCollateralTblDtlLargeDescr1;
    @XmlElement(name = "InManipulateCollateralTblDtlLargeDescr3")
    protected String inManipulateCollateralTblDtlLargeDescr3;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber1")
    protected double inManipulateCollateralTblDtlNumber1;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber10")
    protected double inManipulateCollateralTblDtlNumber10;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber2")
    protected double inManipulateCollateralTblDtlNumber2;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber3")
    protected double inManipulateCollateralTblDtlNumber3;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber4")
    protected double inManipulateCollateralTblDtlNumber4;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber5")
    protected double inManipulateCollateralTblDtlNumber5;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber6")
    protected double inManipulateCollateralTblDtlNumber6;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber7")
    protected double inManipulateCollateralTblDtlNumber7;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber8")
    protected double inManipulateCollateralTblDtlNumber8;
    @XmlElement(name = "InManipulateCollateralTblDtlNumber9")
    protected double inManipulateCollateralTblDtlNumber9;
    @XmlElement(name = "InManipulateCollateralTblDtlPrftSystem1")
    protected short inManipulateCollateralTblDtlPrftSystem1;
    @XmlElement(name = "InManipulateCollateralTblDtlPrftSystem2")
    protected short inManipulateCollateralTblDtlPrftSystem2;
    @XmlElement(name = "InManipulateCollateralTblDtlProfitsAccount1")
    protected String inManipulateCollateralTblDtlProfitsAccount1;
    @XmlElement(name = "InManipulateCollateralTblDtlProfitsAccount2")
    protected String inManipulateCollateralTblDtlProfitsAccount2;
    @XmlElement(name = "InManipulateCollateralTblDtlUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlUpdateDate;
    @XmlElement(name = "InManipulateCollateralTblDtlUpdateTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTblDtlUpdateTimestamp;
    @XmlElement(name = "InManipulateCollateralTblDtlUpdateUnit")
    protected int inManipulateCollateralTblDtlUpdateUnit;
    @XmlElement(name = "InManipulateCollateralTblDtlUpdateUsr")
    protected String inManipulateCollateralTblDtlUpdateUsr;
    @XmlElement(name = "InSelectedCollateralTableInternalSn")
    protected double inSelectedCollateralTableInternalSn;
    @XmlElement(name = "InSelectedCollateralTableRecordDescr")
    protected String inSelectedCollateralTableRecordDescr;
    @XmlElement(name = "InSelectedCollateralTableRecordType")
    protected String inSelectedCollateralTableRecordType;
    @XmlElement(name = "InSelectedCollateralTblDtlDtlRecordType")
    protected String inSelectedCollateralTblDtlDtlRecordType;
    @XmlElement(name = "InSelectedCollateralTblDtlDtlSerialNumber")
    protected double inSelectedCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "InSelectedCustomerCDigit")
    protected short inSelectedCustomerCDigit;
    @XmlElement(name = "InSelectedCustomerCustId")
    protected int inSelectedCustomerCustId;
    @XmlElement(name = "InTrxDefaultJustificIdJustific")
    protected int inTrxDefaultJustificIdJustific;
    @XmlElement(name = "InTrxDefaultProductIdProduct")
    protected int inTrxDefaultProductIdProduct;
    @XmlElement(name = "InTrxLogMntRecordingAuthorizer1")
    protected String inTrxLogMntRecordingAuthorizer1;
    @XmlElement(name = "InTrxLogMntRecordingAuthorizer2")
    protected String inTrxLogMntRecordingAuthorizer2;
    @XmlElement(name = "InTrxLogMntRecordingPrftSystem")
    protected short inTrxLogMntRecordingPrftSystem;
    @XmlElement(name = "InTrxLogMntRecordingReversalFlag")
    protected String inTrxLogMntRecordingReversalFlag;
    @XmlElement(name = "InTrxLogMntRecordingTerminalNumber")
    protected String inTrxLogMntRecordingTerminalNumber;
    @XmlElement(name = "InTrxLogMntRecordingTrxCode")
    protected int inTrxLogMntRecordingTrxCode;
    @XmlElement(name = "InDynamicCollateralPfgTagSetSetupTagSetCode")
    protected String inDynamicCollateralPfgTagSetSetupTagSetCode;
    @XmlElement(name = "InDynamicCollateralPfgTagSetSetupDescription")
    protected String inDynamicCollateralPfgTagSetSetupDescription;

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
     * Gets the value of the inContinueCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getInContinueCollateralTblDtlDtlSerialNumber() {
        return inContinueCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the inContinueCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setInContinueCollateralTblDtlDtlSerialNumber(double value) {
        this.inContinueCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAccountCd1 property.
     * 
     */
    public short getInManipulateCollateralTblDtlAccountCd1() {
        return inManipulateCollateralTblDtlAccountCd1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAccountCd1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlAccountCd1(short value) {
        this.inManipulateCollateralTblDtlAccountCd1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAccountCd2 property.
     * 
     */
    public short getInManipulateCollateralTblDtlAccountCd2() {
        return inManipulateCollateralTblDtlAccountCd2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAccountCd2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlAccountCd2(short value) {
        this.inManipulateCollateralTblDtlAccountCd2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount1() {
        return inManipulateCollateralTblDtlAmount1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount1(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount10() {
        return inManipulateCollateralTblDtlAmount10;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount10(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount1841() {
        return inManipulateCollateralTblDtlAmount1841;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount1841(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount1841 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount1842() {
        return inManipulateCollateralTblDtlAmount1842;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount1842(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount1842 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount1843() {
        return inManipulateCollateralTblDtlAmount1843;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount1843(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount1843 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount2() {
        return inManipulateCollateralTblDtlAmount2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount2(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount3() {
        return inManipulateCollateralTblDtlAmount3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount3(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount4() {
        return inManipulateCollateralTblDtlAmount4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount4(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount5() {
        return inManipulateCollateralTblDtlAmount5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount5(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount6() {
        return inManipulateCollateralTblDtlAmount6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount6(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount7() {
        return inManipulateCollateralTblDtlAmount7;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount7(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount8() {
        return inManipulateCollateralTblDtlAmount8;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount8(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTblDtlAmount9() {
        return inManipulateCollateralTblDtlAmount9;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTblDtlAmount9(BigDecimal value) {
        this.inManipulateCollateralTblDtlAmount9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCDigit1 property.
     * 
     */
    public short getInManipulateCollateralTblDtlCDigit1() {
        return inManipulateCollateralTblDtlCDigit1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCDigit1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCDigit1(short value) {
        this.inManipulateCollateralTblDtlCDigit1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCDigit2 property.
     * 
     */
    public short getInManipulateCollateralTblDtlCDigit2() {
        return inManipulateCollateralTblDtlCDigit2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCDigit2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCDigit2(short value) {
        this.inManipulateCollateralTblDtlCDigit2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCurrencyId1 property.
     * 
     */
    public int getInManipulateCollateralTblDtlCurrencyId1() {
        return inManipulateCollateralTblDtlCurrencyId1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCurrencyId1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCurrencyId1(int value) {
        this.inManipulateCollateralTblDtlCurrencyId1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCurrencyId2 property.
     * 
     */
    public int getInManipulateCollateralTblDtlCurrencyId2() {
        return inManipulateCollateralTblDtlCurrencyId2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCurrencyId2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCurrencyId2(int value) {
        this.inManipulateCollateralTblDtlCurrencyId2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCurrencyId3 property.
     * 
     */
    public int getInManipulateCollateralTblDtlCurrencyId3() {
        return inManipulateCollateralTblDtlCurrencyId3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCurrencyId3 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCurrencyId3(int value) {
        this.inManipulateCollateralTblDtlCurrencyId3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCustId1 property.
     * 
     */
    public int getInManipulateCollateralTblDtlCustId1() {
        return inManipulateCollateralTblDtlCustId1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCustId1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCustId1(int value) {
        this.inManipulateCollateralTblDtlCustId1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlCustId2 property.
     * 
     */
    public int getInManipulateCollateralTblDtlCustId2() {
        return inManipulateCollateralTblDtlCustId2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlCustId2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlCustId2(int value) {
        this.inManipulateCollateralTblDtlCustId2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate1() {
        return inManipulateCollateralTblDtlDate1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate1(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate10() {
        return inManipulateCollateralTblDtlDate10;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate10(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate2() {
        return inManipulateCollateralTblDtlDate2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate2(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate3() {
        return inManipulateCollateralTblDtlDate3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate3(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate4() {
        return inManipulateCollateralTblDtlDate4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate4(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate5() {
        return inManipulateCollateralTblDtlDate5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate5(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate6() {
        return inManipulateCollateralTblDtlDate6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate6(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate7() {
        return inManipulateCollateralTblDtlDate7;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate7(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate8() {
        return inManipulateCollateralTblDtlDate8;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate8(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlDate9() {
        return inManipulateCollateralTblDtlDate9;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlDate9(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlDate9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr1() {
        return inManipulateCollateralTblDtlDescr1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr1(String value) {
        this.inManipulateCollateralTblDtlDescr1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr10() {
        return inManipulateCollateralTblDtlDescr10;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr10(String value) {
        this.inManipulateCollateralTblDtlDescr10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr11() {
        return inManipulateCollateralTblDtlDescr11;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr11(String value) {
        this.inManipulateCollateralTblDtlDescr11 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr12() {
        return inManipulateCollateralTblDtlDescr12;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr12(String value) {
        this.inManipulateCollateralTblDtlDescr12 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr13() {
        return inManipulateCollateralTblDtlDescr13;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr13(String value) {
        this.inManipulateCollateralTblDtlDescr13 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr14() {
        return inManipulateCollateralTblDtlDescr14;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr14(String value) {
        this.inManipulateCollateralTblDtlDescr14 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr15() {
        return inManipulateCollateralTblDtlDescr15;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr15(String value) {
        this.inManipulateCollateralTblDtlDescr15 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr16() {
        return inManipulateCollateralTblDtlDescr16;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr16(String value) {
        this.inManipulateCollateralTblDtlDescr16 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr17() {
        return inManipulateCollateralTblDtlDescr17;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr17(String value) {
        this.inManipulateCollateralTblDtlDescr17 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr18() {
        return inManipulateCollateralTblDtlDescr18;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr18(String value) {
        this.inManipulateCollateralTblDtlDescr18 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr19() {
        return inManipulateCollateralTblDtlDescr19;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr19(String value) {
        this.inManipulateCollateralTblDtlDescr19 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr2() {
        return inManipulateCollateralTblDtlDescr2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr2(String value) {
        this.inManipulateCollateralTblDtlDescr2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr20() {
        return inManipulateCollateralTblDtlDescr20;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr20(String value) {
        this.inManipulateCollateralTblDtlDescr20 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr3() {
        return inManipulateCollateralTblDtlDescr3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr3(String value) {
        this.inManipulateCollateralTblDtlDescr3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr4() {
        return inManipulateCollateralTblDtlDescr4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr4(String value) {
        this.inManipulateCollateralTblDtlDescr4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr5() {
        return inManipulateCollateralTblDtlDescr5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr5(String value) {
        this.inManipulateCollateralTblDtlDescr5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr6() {
        return inManipulateCollateralTblDtlDescr6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr6(String value) {
        this.inManipulateCollateralTblDtlDescr6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr7() {
        return inManipulateCollateralTblDtlDescr7;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr7(String value) {
        this.inManipulateCollateralTblDtlDescr7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr8() {
        return inManipulateCollateralTblDtlDescr8;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr8(String value) {
        this.inManipulateCollateralTblDtlDescr8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDescr9() {
        return inManipulateCollateralTblDtlDescr9;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDescr9(String value) {
        this.inManipulateCollateralTblDtlDescr9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDtlRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlDtlRecordType() {
        return inManipulateCollateralTblDtlDtlRecordType;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDtlRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlDtlRecordType(String value) {
        this.inManipulateCollateralTblDtlDtlRecordType = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getInManipulateCollateralTblDtlDtlSerialNumber() {
        return inManipulateCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setInManipulateCollateralTblDtlDtlSerialNumber(double value) {
        this.inManipulateCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlEntryComments() {
        return inManipulateCollateralTblDtlEntryComments;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlEntryComments(String value) {
        this.inManipulateCollateralTblDtlEntryComments = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlEntryStatus() {
        return inManipulateCollateralTblDtlEntryStatus;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlEntryStatus(String value) {
        this.inManipulateCollateralTblDtlEntryStatus = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag1() {
        return inManipulateCollateralTblDtlFlag1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag1(String value) {
        this.inManipulateCollateralTblDtlFlag1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag10() {
        return inManipulateCollateralTblDtlFlag10;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag10(String value) {
        this.inManipulateCollateralTblDtlFlag10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag2() {
        return inManipulateCollateralTblDtlFlag2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag2(String value) {
        this.inManipulateCollateralTblDtlFlag2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag3() {
        return inManipulateCollateralTblDtlFlag3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag3(String value) {
        this.inManipulateCollateralTblDtlFlag3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag4() {
        return inManipulateCollateralTblDtlFlag4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag4(String value) {
        this.inManipulateCollateralTblDtlFlag4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag5() {
        return inManipulateCollateralTblDtlFlag5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag5(String value) {
        this.inManipulateCollateralTblDtlFlag5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag6() {
        return inManipulateCollateralTblDtlFlag6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag6(String value) {
        this.inManipulateCollateralTblDtlFlag6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag7() {
        return inManipulateCollateralTblDtlFlag7;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag7(String value) {
        this.inManipulateCollateralTblDtlFlag7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag8() {
        return inManipulateCollateralTblDtlFlag8;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag8(String value) {
        this.inManipulateCollateralTblDtlFlag8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlFlag9() {
        return inManipulateCollateralTblDtlFlag9;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlFlag9(String value) {
        this.inManipulateCollateralTblDtlFlag9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdParType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlGdParType1() {
        return inManipulateCollateralTblDtlGdParType1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdParType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlGdParType1(String value) {
        this.inManipulateCollateralTblDtlGdParType1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdParType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlGdParType2() {
        return inManipulateCollateralTblDtlGdParType2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdParType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlGdParType2(String value) {
        this.inManipulateCollateralTblDtlGdParType2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdParType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlGdParType3() {
        return inManipulateCollateralTblDtlGdParType3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdParType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlGdParType3(String value) {
        this.inManipulateCollateralTblDtlGdParType3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdParType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlGdParType4() {
        return inManipulateCollateralTblDtlGdParType4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdParType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlGdParType4(String value) {
        this.inManipulateCollateralTblDtlGdParType4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdParType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlGdParType5() {
        return inManipulateCollateralTblDtlGdParType5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdParType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlGdParType5(String value) {
        this.inManipulateCollateralTblDtlGdParType5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdParType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlGdParType6() {
        return inManipulateCollateralTblDtlGdParType6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdParType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlGdParType6(String value) {
        this.inManipulateCollateralTblDtlGdParType6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public int getInManipulateCollateralTblDtlGdSerialNum1() {
        return inManipulateCollateralTblDtlGdSerialNum1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlGdSerialNum1(int value) {
        this.inManipulateCollateralTblDtlGdSerialNum1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public int getInManipulateCollateralTblDtlGdSerialNum2() {
        return inManipulateCollateralTblDtlGdSerialNum2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlGdSerialNum2(int value) {
        this.inManipulateCollateralTblDtlGdSerialNum2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public int getInManipulateCollateralTblDtlGdSerialNum3() {
        return inManipulateCollateralTblDtlGdSerialNum3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public void setInManipulateCollateralTblDtlGdSerialNum3(int value) {
        this.inManipulateCollateralTblDtlGdSerialNum3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public int getInManipulateCollateralTblDtlGdSerialNum4() {
        return inManipulateCollateralTblDtlGdSerialNum4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public void setInManipulateCollateralTblDtlGdSerialNum4(int value) {
        this.inManipulateCollateralTblDtlGdSerialNum4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public int getInManipulateCollateralTblDtlGdSerialNum5() {
        return inManipulateCollateralTblDtlGdSerialNum5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public void setInManipulateCollateralTblDtlGdSerialNum5(int value) {
        this.inManipulateCollateralTblDtlGdSerialNum5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public int getInManipulateCollateralTblDtlGdSerialNum6() {
        return inManipulateCollateralTblDtlGdSerialNum6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public void setInManipulateCollateralTblDtlGdSerialNum6(int value) {
        this.inManipulateCollateralTblDtlGdSerialNum6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlHdrInternalSn property.
     * 
     */
    public double getInManipulateCollateralTblDtlHdrInternalSn() {
        return inManipulateCollateralTblDtlHdrInternalSn;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlHdrInternalSn property.
     * 
     */
    public void setInManipulateCollateralTblDtlHdrInternalSn(double value) {
        this.inManipulateCollateralTblDtlHdrInternalSn = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlHdrRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlHdrRecordType() {
        return inManipulateCollateralTblDtlHdrRecordType;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlHdrRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlHdrRecordType(String value) {
        this.inManipulateCollateralTblDtlHdrRecordType = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlInsertDate() {
        return inManipulateCollateralTblDtlInsertDate;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlInsertDate(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlInsertDate = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlInsertTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlInsertTimestamp() {
        return inManipulateCollateralTblDtlInsertTimestamp;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlInsertTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlInsertTimestamp(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlInsertTimestamp = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlInsertUnit property.
     * 
     */
    public int getInManipulateCollateralTblDtlInsertUnit() {
        return inManipulateCollateralTblDtlInsertUnit;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlInsertUnit property.
     * 
     */
    public void setInManipulateCollateralTblDtlInsertUnit(int value) {
        this.inManipulateCollateralTblDtlInsertUnit = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlInsertUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlInsertUsr() {
        return inManipulateCollateralTblDtlInsertUsr;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlInsertUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlInsertUsr(String value) {
        this.inManipulateCollateralTblDtlInsertUsr = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlLagreDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlLagreDescr2() {
        return inManipulateCollateralTblDtlLagreDescr2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlLagreDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlLagreDescr2(String value) {
        this.inManipulateCollateralTblDtlLagreDescr2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlLargeDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlLargeDescr1() {
        return inManipulateCollateralTblDtlLargeDescr1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlLargeDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlLargeDescr1(String value) {
        this.inManipulateCollateralTblDtlLargeDescr1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlLargeDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlLargeDescr3() {
        return inManipulateCollateralTblDtlLargeDescr3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlLargeDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlLargeDescr3(String value) {
        this.inManipulateCollateralTblDtlLargeDescr3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber1 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber1() {
        return inManipulateCollateralTblDtlNumber1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber1(double value) {
        this.inManipulateCollateralTblDtlNumber1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber10 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber10() {
        return inManipulateCollateralTblDtlNumber10;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber10 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber10(double value) {
        this.inManipulateCollateralTblDtlNumber10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber2 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber2() {
        return inManipulateCollateralTblDtlNumber2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber2(double value) {
        this.inManipulateCollateralTblDtlNumber2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber3 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber3() {
        return inManipulateCollateralTblDtlNumber3;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber3 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber3(double value) {
        this.inManipulateCollateralTblDtlNumber3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber4 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber4() {
        return inManipulateCollateralTblDtlNumber4;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber4 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber4(double value) {
        this.inManipulateCollateralTblDtlNumber4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber5 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber5() {
        return inManipulateCollateralTblDtlNumber5;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber5 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber5(double value) {
        this.inManipulateCollateralTblDtlNumber5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber6 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber6() {
        return inManipulateCollateralTblDtlNumber6;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber6 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber6(double value) {
        this.inManipulateCollateralTblDtlNumber6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber7 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber7() {
        return inManipulateCollateralTblDtlNumber7;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber7 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber7(double value) {
        this.inManipulateCollateralTblDtlNumber7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber8 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber8() {
        return inManipulateCollateralTblDtlNumber8;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber8 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber8(double value) {
        this.inManipulateCollateralTblDtlNumber8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlNumber9 property.
     * 
     */
    public double getInManipulateCollateralTblDtlNumber9() {
        return inManipulateCollateralTblDtlNumber9;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlNumber9 property.
     * 
     */
    public void setInManipulateCollateralTblDtlNumber9(double value) {
        this.inManipulateCollateralTblDtlNumber9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlPrftSystem1 property.
     * 
     */
    public short getInManipulateCollateralTblDtlPrftSystem1() {
        return inManipulateCollateralTblDtlPrftSystem1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlPrftSystem1 property.
     * 
     */
    public void setInManipulateCollateralTblDtlPrftSystem1(short value) {
        this.inManipulateCollateralTblDtlPrftSystem1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlPrftSystem2 property.
     * 
     */
    public short getInManipulateCollateralTblDtlPrftSystem2() {
        return inManipulateCollateralTblDtlPrftSystem2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlPrftSystem2 property.
     * 
     */
    public void setInManipulateCollateralTblDtlPrftSystem2(short value) {
        this.inManipulateCollateralTblDtlPrftSystem2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlProfitsAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlProfitsAccount1() {
        return inManipulateCollateralTblDtlProfitsAccount1;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlProfitsAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlProfitsAccount1(String value) {
        this.inManipulateCollateralTblDtlProfitsAccount1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlProfitsAccount2() {
        return inManipulateCollateralTblDtlProfitsAccount2;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlProfitsAccount2(String value) {
        this.inManipulateCollateralTblDtlProfitsAccount2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlUpdateDate() {
        return inManipulateCollateralTblDtlUpdateDate;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlUpdateDate(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlUpdateDate = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTblDtlUpdateTimestamp() {
        return inManipulateCollateralTblDtlUpdateTimestamp;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTblDtlUpdateTimestamp(XMLGregorianCalendar value) {
        this.inManipulateCollateralTblDtlUpdateTimestamp = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlUpdateUnit property.
     * 
     */
    public int getInManipulateCollateralTblDtlUpdateUnit() {
        return inManipulateCollateralTblDtlUpdateUnit;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlUpdateUnit property.
     * 
     */
    public void setInManipulateCollateralTblDtlUpdateUnit(int value) {
        this.inManipulateCollateralTblDtlUpdateUnit = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTblDtlUpdateUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTblDtlUpdateUsr() {
        return inManipulateCollateralTblDtlUpdateUsr;
    }

    /**
     * Sets the value of the inManipulateCollateralTblDtlUpdateUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTblDtlUpdateUsr(String value) {
        this.inManipulateCollateralTblDtlUpdateUsr = value;
    }

    /**
     * Gets the value of the inSelectedCollateralTableInternalSn property.
     * 
     */
    public double getInSelectedCollateralTableInternalSn() {
        return inSelectedCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inSelectedCollateralTableInternalSn property.
     * 
     */
    public void setInSelectedCollateralTableInternalSn(double value) {
        this.inSelectedCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inSelectedCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedCollateralTableRecordDescr() {
        return inSelectedCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the inSelectedCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedCollateralTableRecordDescr(String value) {
        this.inSelectedCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the inSelectedCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedCollateralTableRecordType() {
        return inSelectedCollateralTableRecordType;
    }

    /**
     * Sets the value of the inSelectedCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedCollateralTableRecordType(String value) {
        this.inSelectedCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inSelectedCollateralTblDtlDtlRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedCollateralTblDtlDtlRecordType() {
        return inSelectedCollateralTblDtlDtlRecordType;
    }

    /**
     * Sets the value of the inSelectedCollateralTblDtlDtlRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedCollateralTblDtlDtlRecordType(String value) {
        this.inSelectedCollateralTblDtlDtlRecordType = value;
    }

    /**
     * Gets the value of the inSelectedCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getInSelectedCollateralTblDtlDtlSerialNumber() {
        return inSelectedCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the inSelectedCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setInSelectedCollateralTblDtlDtlSerialNumber(double value) {
        this.inSelectedCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public short getInSelectedCustomerCDigit() {
        return inSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the inSelectedCustomerCDigit property.
     * 
     */
    public void setInSelectedCustomerCDigit(short value) {
        this.inSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the inSelectedCustomerCustId property.
     * 
     */
    public int getInSelectedCustomerCustId() {
        return inSelectedCustomerCustId;
    }

    /**
     * Sets the value of the inSelectedCustomerCustId property.
     * 
     */
    public void setInSelectedCustomerCustId(int value) {
        this.inSelectedCustomerCustId = value;
    }

    /**
     * Gets the value of the inTrxDefaultJustificIdJustific property.
     * 
     */
    public int getInTrxDefaultJustificIdJustific() {
        return inTrxDefaultJustificIdJustific;
    }

    /**
     * Sets the value of the inTrxDefaultJustificIdJustific property.
     * 
     */
    public void setInTrxDefaultJustificIdJustific(int value) {
        this.inTrxDefaultJustificIdJustific = value;
    }

    /**
     * Gets the value of the inTrxDefaultProductIdProduct property.
     * 
     */
    public int getInTrxDefaultProductIdProduct() {
        return inTrxDefaultProductIdProduct;
    }

    /**
     * Sets the value of the inTrxDefaultProductIdProduct property.
     * 
     */
    public void setInTrxDefaultProductIdProduct(int value) {
        this.inTrxDefaultProductIdProduct = value;
    }

    /**
     * Gets the value of the inTrxLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogMntRecordingAuthorizer1() {
        return inTrxLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inTrxLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogMntRecordingAuthorizer1(String value) {
        this.inTrxLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inTrxLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogMntRecordingAuthorizer2() {
        return inTrxLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inTrxLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogMntRecordingAuthorizer2(String value) {
        this.inTrxLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inTrxLogMntRecordingPrftSystem property.
     * 
     */
    public short getInTrxLogMntRecordingPrftSystem() {
        return inTrxLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inTrxLogMntRecordingPrftSystem property.
     * 
     */
    public void setInTrxLogMntRecordingPrftSystem(short value) {
        this.inTrxLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogMntRecordingReversalFlag() {
        return inTrxLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inTrxLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogMntRecordingReversalFlag(String value) {
        this.inTrxLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inTrxLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxLogMntRecordingTerminalNumber() {
        return inTrxLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inTrxLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxLogMntRecordingTerminalNumber(String value) {
        this.inTrxLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inTrxLogMntRecordingTrxCode property.
     * 
     */
    public int getInTrxLogMntRecordingTrxCode() {
        return inTrxLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inTrxLogMntRecordingTrxCode property.
     * 
     */
    public void setInTrxLogMntRecordingTrxCode(int value) {
        this.inTrxLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inDynamicCollateralPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDynamicCollateralPfgTagSetSetupTagSetCode() {
        return inDynamicCollateralPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inDynamicCollateralPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDynamicCollateralPfgTagSetSetupTagSetCode(String value) {
        this.inDynamicCollateralPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the inDynamicCollateralPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDynamicCollateralPfgTagSetSetupDescription() {
        return inDynamicCollateralPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the inDynamicCollateralPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDynamicCollateralPfgTagSetSetupDescription(String value) {
        this.inDynamicCollateralPfgTagSetSetupDescription = value;
    }

}
