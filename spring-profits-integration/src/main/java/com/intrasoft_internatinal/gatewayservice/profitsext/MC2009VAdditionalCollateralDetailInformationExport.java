
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2009VAdditionalCollateralDetailInformationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2009VAdditionalCollateralDetailInformationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount1841" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount1842" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount1843" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCDigit2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCurrencyId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCurrencyId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCurrencyId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlCustId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDtlRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlDtlSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdParType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdParType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdParType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdParType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdParType5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdParType6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdSerialNum1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdSerialNum2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdSerialNum3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdSerialNum4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdSerialNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlGdSerialNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlHdrInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlHdrRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlInsertTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlInsertUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlLagreDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlLargeDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlLargeDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedCollateralTblDtlPrftSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTblDtlPrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCollateralTblDtlProfitsAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCollateralTblDtlUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlUpdateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCollateralTblDtlUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCollateralTblDtlUpdateUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutViewInsertEmployeeCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutViewInsertUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutViewInsertUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutViewUpdateEmployeeCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutViewUpdateUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutViewUpdateUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpActions" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2009VOutGrpActionsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDetails" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2009VOutGrpDetailsItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2009VOutGrpSrvLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpAllDetails" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2009OutGrpAllDetailsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2009VAdditionalCollateralDetailInformationExport", propOrder = {
    "command",
    "outContinueCollateralTblDtlDtlSerialNumber",
    "outSelectedCollateralTblDtlAccountCd1",
    "outSelectedCollateralTblDtlAccountCd2",
    "outSelectedCollateralTblDtlAmount1",
    "outSelectedCollateralTblDtlAmount10",
    "outSelectedCollateralTblDtlAmount1841",
    "outSelectedCollateralTblDtlAmount1842",
    "outSelectedCollateralTblDtlAmount1843",
    "outSelectedCollateralTblDtlAmount2",
    "outSelectedCollateralTblDtlAmount3",
    "outSelectedCollateralTblDtlAmount4",
    "outSelectedCollateralTblDtlAmount5",
    "outSelectedCollateralTblDtlAmount6",
    "outSelectedCollateralTblDtlAmount7",
    "outSelectedCollateralTblDtlAmount8",
    "outSelectedCollateralTblDtlAmount9",
    "outSelectedCollateralTblDtlCDigit1",
    "outSelectedCollateralTblDtlCDigit2",
    "outSelectedCollateralTblDtlCurrencyId1",
    "outSelectedCollateralTblDtlCurrencyId2",
    "outSelectedCollateralTblDtlCurrencyId3",
    "outSelectedCollateralTblDtlCustId1",
    "outSelectedCollateralTblDtlCustId2",
    "outSelectedCollateralTblDtlDate1",
    "outSelectedCollateralTblDtlDate10",
    "outSelectedCollateralTblDtlDate2",
    "outSelectedCollateralTblDtlDate3",
    "outSelectedCollateralTblDtlDate4",
    "outSelectedCollateralTblDtlDate5",
    "outSelectedCollateralTblDtlDate6",
    "outSelectedCollateralTblDtlDate7",
    "outSelectedCollateralTblDtlDate8",
    "outSelectedCollateralTblDtlDate9",
    "outSelectedCollateralTblDtlDescr1",
    "outSelectedCollateralTblDtlDescr10",
    "outSelectedCollateralTblDtlDescr11",
    "outSelectedCollateralTblDtlDescr12",
    "outSelectedCollateralTblDtlDescr13",
    "outSelectedCollateralTblDtlDescr14",
    "outSelectedCollateralTblDtlDescr15",
    "outSelectedCollateralTblDtlDescr16",
    "outSelectedCollateralTblDtlDescr17",
    "outSelectedCollateralTblDtlDescr18",
    "outSelectedCollateralTblDtlDescr19",
    "outSelectedCollateralTblDtlDescr2",
    "outSelectedCollateralTblDtlDescr20",
    "outSelectedCollateralTblDtlDescr3",
    "outSelectedCollateralTblDtlDescr4",
    "outSelectedCollateralTblDtlDescr5",
    "outSelectedCollateralTblDtlDescr6",
    "outSelectedCollateralTblDtlDescr7",
    "outSelectedCollateralTblDtlDescr8",
    "outSelectedCollateralTblDtlDescr9",
    "outSelectedCollateralTblDtlDtlRecordType",
    "outSelectedCollateralTblDtlDtlSerialNumber",
    "outSelectedCollateralTblDtlEntryComments",
    "outSelectedCollateralTblDtlEntryStatus",
    "outSelectedCollateralTblDtlFlag1",
    "outSelectedCollateralTblDtlFlag10",
    "outSelectedCollateralTblDtlFlag2",
    "outSelectedCollateralTblDtlFlag3",
    "outSelectedCollateralTblDtlFlag4",
    "outSelectedCollateralTblDtlFlag5",
    "outSelectedCollateralTblDtlFlag6",
    "outSelectedCollateralTblDtlFlag7",
    "outSelectedCollateralTblDtlFlag8",
    "outSelectedCollateralTblDtlFlag9",
    "outSelectedCollateralTblDtlGdParType1",
    "outSelectedCollateralTblDtlGdParType2",
    "outSelectedCollateralTblDtlGdParType3",
    "outSelectedCollateralTblDtlGdParType4",
    "outSelectedCollateralTblDtlGdParType5",
    "outSelectedCollateralTblDtlGdParType6",
    "outSelectedCollateralTblDtlGdSerialNum1",
    "outSelectedCollateralTblDtlGdSerialNum2",
    "outSelectedCollateralTblDtlGdSerialNum3",
    "outSelectedCollateralTblDtlGdSerialNum4",
    "outSelectedCollateralTblDtlGdSerialNum5",
    "outSelectedCollateralTblDtlGdSerialNum6",
    "outSelectedCollateralTblDtlHdrInternalSn",
    "outSelectedCollateralTblDtlHdrRecordType",
    "outSelectedCollateralTblDtlInsertDate",
    "outSelectedCollateralTblDtlInsertTimestamp",
    "outSelectedCollateralTblDtlInsertUnit",
    "outSelectedCollateralTblDtlInsertUsr",
    "outSelectedCollateralTblDtlLagreDescr2",
    "outSelectedCollateralTblDtlLargeDescr1",
    "outSelectedCollateralTblDtlLargeDescr3",
    "outSelectedCollateralTblDtlNumber1",
    "outSelectedCollateralTblDtlNumber10",
    "outSelectedCollateralTblDtlNumber2",
    "outSelectedCollateralTblDtlNumber3",
    "outSelectedCollateralTblDtlNumber4",
    "outSelectedCollateralTblDtlNumber5",
    "outSelectedCollateralTblDtlNumber6",
    "outSelectedCollateralTblDtlNumber7",
    "outSelectedCollateralTblDtlNumber8",
    "outSelectedCollateralTblDtlNumber9",
    "outSelectedCollateralTblDtlPrftSystem1",
    "outSelectedCollateralTblDtlPrftSystem2",
    "outSelectedCollateralTblDtlProfitsAccount1",
    "outSelectedCollateralTblDtlProfitsAccount2",
    "outSelectedCollateralTblDtlUpdateDate",
    "outSelectedCollateralTblDtlUpdateTimestamp",
    "outSelectedCollateralTblDtlUpdateUnit",
    "outSelectedCollateralTblDtlUpdateUsr",
    "outViewInsertEmployeeCharSuppliedChar40",
    "outViewInsertUnitCode",
    "outViewInsertUnitUnitName",
    "outViewUpdateEmployeeCharSuppliedChar40",
    "outViewUpdateUnitCode",
    "outViewUpdateUnitUnitName",
    "outGrpActions",
    "outGrpDetails",
    "outGrpSrvLog",
    "outGrpAllDetails"
})
public class MC2009VAdditionalCollateralDetailInformationExport
    extends BaseExport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "OutContinueCollateralTblDtlDtlSerialNumber")
    protected double outContinueCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "OutSelectedCollateralTblDtlAccountCd1")
    protected short outSelectedCollateralTblDtlAccountCd1;
    @XmlElement(name = "OutSelectedCollateralTblDtlAccountCd2")
    protected short outSelectedCollateralTblDtlAccountCd2;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount1", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount1;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount10", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount10;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount1841", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount1841;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount1842", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount1842;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount1843", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount1843;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount2", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount2;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount3", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount3;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount4", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount4;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount5", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount5;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount6", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount6;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount7", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount7;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount8", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount8;
    @XmlElement(name = "OutSelectedCollateralTblDtlAmount9", required = true)
    protected BigDecimal outSelectedCollateralTblDtlAmount9;
    @XmlElement(name = "OutSelectedCollateralTblDtlCDigit1")
    protected short outSelectedCollateralTblDtlCDigit1;
    @XmlElement(name = "OutSelectedCollateralTblDtlCDigit2")
    protected short outSelectedCollateralTblDtlCDigit2;
    @XmlElement(name = "OutSelectedCollateralTblDtlCurrencyId1")
    protected int outSelectedCollateralTblDtlCurrencyId1;
    @XmlElement(name = "OutSelectedCollateralTblDtlCurrencyId2")
    protected int outSelectedCollateralTblDtlCurrencyId2;
    @XmlElement(name = "OutSelectedCollateralTblDtlCurrencyId3")
    protected int outSelectedCollateralTblDtlCurrencyId3;
    @XmlElement(name = "OutSelectedCollateralTblDtlCustId1")
    protected int outSelectedCollateralTblDtlCustId1;
    @XmlElement(name = "OutSelectedCollateralTblDtlCustId2")
    protected int outSelectedCollateralTblDtlCustId2;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate1;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate10;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate2;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate3;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate4;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate5;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate6;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate7;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate8;
    @XmlElement(name = "OutSelectedCollateralTblDtlDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlDate9;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr1")
    protected String outSelectedCollateralTblDtlDescr1;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr10")
    protected String outSelectedCollateralTblDtlDescr10;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr11")
    protected String outSelectedCollateralTblDtlDescr11;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr12")
    protected String outSelectedCollateralTblDtlDescr12;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr13")
    protected String outSelectedCollateralTblDtlDescr13;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr14")
    protected String outSelectedCollateralTblDtlDescr14;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr15")
    protected String outSelectedCollateralTblDtlDescr15;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr16")
    protected String outSelectedCollateralTblDtlDescr16;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr17")
    protected String outSelectedCollateralTblDtlDescr17;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr18")
    protected String outSelectedCollateralTblDtlDescr18;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr19")
    protected String outSelectedCollateralTblDtlDescr19;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr2")
    protected String outSelectedCollateralTblDtlDescr2;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr20")
    protected String outSelectedCollateralTblDtlDescr20;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr3")
    protected String outSelectedCollateralTblDtlDescr3;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr4")
    protected String outSelectedCollateralTblDtlDescr4;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr5")
    protected String outSelectedCollateralTblDtlDescr5;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr6")
    protected String outSelectedCollateralTblDtlDescr6;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr7")
    protected String outSelectedCollateralTblDtlDescr7;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr8")
    protected String outSelectedCollateralTblDtlDescr8;
    @XmlElement(name = "OutSelectedCollateralTblDtlDescr9")
    protected String outSelectedCollateralTblDtlDescr9;
    @XmlElement(name = "OutSelectedCollateralTblDtlDtlRecordType")
    protected String outSelectedCollateralTblDtlDtlRecordType;
    @XmlElement(name = "OutSelectedCollateralTblDtlDtlSerialNumber")
    protected double outSelectedCollateralTblDtlDtlSerialNumber;
    @XmlElement(name = "OutSelectedCollateralTblDtlEntryComments")
    protected String outSelectedCollateralTblDtlEntryComments;
    @XmlElement(name = "OutSelectedCollateralTblDtlEntryStatus")
    protected String outSelectedCollateralTblDtlEntryStatus;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag1")
    protected String outSelectedCollateralTblDtlFlag1;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag10")
    protected String outSelectedCollateralTblDtlFlag10;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag2")
    protected String outSelectedCollateralTblDtlFlag2;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag3")
    protected String outSelectedCollateralTblDtlFlag3;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag4")
    protected String outSelectedCollateralTblDtlFlag4;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag5")
    protected String outSelectedCollateralTblDtlFlag5;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag6")
    protected String outSelectedCollateralTblDtlFlag6;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag7")
    protected String outSelectedCollateralTblDtlFlag7;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag8")
    protected String outSelectedCollateralTblDtlFlag8;
    @XmlElement(name = "OutSelectedCollateralTblDtlFlag9")
    protected String outSelectedCollateralTblDtlFlag9;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdParType1")
    protected String outSelectedCollateralTblDtlGdParType1;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdParType2")
    protected String outSelectedCollateralTblDtlGdParType2;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdParType3")
    protected String outSelectedCollateralTblDtlGdParType3;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdParType4")
    protected String outSelectedCollateralTblDtlGdParType4;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdParType5")
    protected String outSelectedCollateralTblDtlGdParType5;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdParType6")
    protected String outSelectedCollateralTblDtlGdParType6;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdSerialNum1")
    protected int outSelectedCollateralTblDtlGdSerialNum1;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdSerialNum2")
    protected int outSelectedCollateralTblDtlGdSerialNum2;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdSerialNum3")
    protected int outSelectedCollateralTblDtlGdSerialNum3;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdSerialNum4")
    protected int outSelectedCollateralTblDtlGdSerialNum4;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdSerialNum5")
    protected int outSelectedCollateralTblDtlGdSerialNum5;
    @XmlElement(name = "OutSelectedCollateralTblDtlGdSerialNum6")
    protected int outSelectedCollateralTblDtlGdSerialNum6;
    @XmlElement(name = "OutSelectedCollateralTblDtlHdrInternalSn")
    protected double outSelectedCollateralTblDtlHdrInternalSn;
    @XmlElement(name = "OutSelectedCollateralTblDtlHdrRecordType")
    protected String outSelectedCollateralTblDtlHdrRecordType;
    @XmlElement(name = "OutSelectedCollateralTblDtlInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlInsertDate;
    @XmlElement(name = "OutSelectedCollateralTblDtlInsertTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlInsertTimestamp;
    @XmlElement(name = "OutSelectedCollateralTblDtlInsertUnit")
    protected int outSelectedCollateralTblDtlInsertUnit;
    @XmlElement(name = "OutSelectedCollateralTblDtlInsertUsr")
    protected String outSelectedCollateralTblDtlInsertUsr;
    @XmlElement(name = "OutSelectedCollateralTblDtlLagreDescr2")
    protected String outSelectedCollateralTblDtlLagreDescr2;
    @XmlElement(name = "OutSelectedCollateralTblDtlLargeDescr1")
    protected String outSelectedCollateralTblDtlLargeDescr1;
    @XmlElement(name = "OutSelectedCollateralTblDtlLargeDescr3")
    protected String outSelectedCollateralTblDtlLargeDescr3;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber1")
    protected double outSelectedCollateralTblDtlNumber1;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber10")
    protected double outSelectedCollateralTblDtlNumber10;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber2")
    protected double outSelectedCollateralTblDtlNumber2;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber3")
    protected double outSelectedCollateralTblDtlNumber3;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber4")
    protected double outSelectedCollateralTblDtlNumber4;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber5")
    protected double outSelectedCollateralTblDtlNumber5;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber6")
    protected double outSelectedCollateralTblDtlNumber6;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber7")
    protected double outSelectedCollateralTblDtlNumber7;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber8")
    protected double outSelectedCollateralTblDtlNumber8;
    @XmlElement(name = "OutSelectedCollateralTblDtlNumber9")
    protected double outSelectedCollateralTblDtlNumber9;
    @XmlElement(name = "OutSelectedCollateralTblDtlPrftSystem1")
    protected short outSelectedCollateralTblDtlPrftSystem1;
    @XmlElement(name = "OutSelectedCollateralTblDtlPrftSystem2")
    protected short outSelectedCollateralTblDtlPrftSystem2;
    @XmlElement(name = "OutSelectedCollateralTblDtlProfitsAccount1")
    protected String outSelectedCollateralTblDtlProfitsAccount1;
    @XmlElement(name = "OutSelectedCollateralTblDtlProfitsAccount2")
    protected String outSelectedCollateralTblDtlProfitsAccount2;
    @XmlElement(name = "OutSelectedCollateralTblDtlUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlUpdateDate;
    @XmlElement(name = "OutSelectedCollateralTblDtlUpdateTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCollateralTblDtlUpdateTimestamp;
    @XmlElement(name = "OutSelectedCollateralTblDtlUpdateUnit")
    protected int outSelectedCollateralTblDtlUpdateUnit;
    @XmlElement(name = "OutSelectedCollateralTblDtlUpdateUsr")
    protected String outSelectedCollateralTblDtlUpdateUsr;
    @XmlElement(name = "OutViewInsertEmployeeCharSuppliedChar40")
    protected String outViewInsertEmployeeCharSuppliedChar40;
    @XmlElement(name = "OutViewInsertUnitCode")
    protected int outViewInsertUnitCode;
    @XmlElement(name = "OutViewInsertUnitUnitName")
    protected String outViewInsertUnitUnitName;
    @XmlElement(name = "OutViewUpdateEmployeeCharSuppliedChar40")
    protected String outViewUpdateEmployeeCharSuppliedChar40;
    @XmlElement(name = "OutViewUpdateUnitCode")
    protected int outViewUpdateUnitCode;
    @XmlElement(name = "OutViewUpdateUnitUnitName")
    protected String outViewUpdateUnitUnitName;
    @XmlElement(name = "OutGrpActions")
    protected ArrayOfMC2009VOutGrpActionsItem outGrpActions;
    @XmlElement(name = "OutGrpDetails")
    protected ArrayOfMC2009VOutGrpDetailsItem outGrpDetails;
    @XmlElement(name = "OutGrpSrvLog")
    protected ArrayOfMC2009VOutGrpSrvLogItem outGrpSrvLog;
    @XmlElement(name = "OutGrpAllDetails")
    protected ArrayOfMC2009OutGrpAllDetailsItem outGrpAllDetails;

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
     * Gets the value of the outContinueCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getOutContinueCollateralTblDtlDtlSerialNumber() {
        return outContinueCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the outContinueCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setOutContinueCollateralTblDtlDtlSerialNumber(double value) {
        this.outContinueCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAccountCd1 property.
     * 
     */
    public short getOutSelectedCollateralTblDtlAccountCd1() {
        return outSelectedCollateralTblDtlAccountCd1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAccountCd1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlAccountCd1(short value) {
        this.outSelectedCollateralTblDtlAccountCd1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAccountCd2 property.
     * 
     */
    public short getOutSelectedCollateralTblDtlAccountCd2() {
        return outSelectedCollateralTblDtlAccountCd2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAccountCd2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlAccountCd2(short value) {
        this.outSelectedCollateralTblDtlAccountCd2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount1() {
        return outSelectedCollateralTblDtlAmount1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount1(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount10() {
        return outSelectedCollateralTblDtlAmount10;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount10(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount1841 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount1841() {
        return outSelectedCollateralTblDtlAmount1841;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount1841 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount1841(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount1841 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount1842 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount1842() {
        return outSelectedCollateralTblDtlAmount1842;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount1842 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount1842(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount1842 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount1843 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount1843() {
        return outSelectedCollateralTblDtlAmount1843;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount1843 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount1843(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount1843 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount2() {
        return outSelectedCollateralTblDtlAmount2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount2(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount3() {
        return outSelectedCollateralTblDtlAmount3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount3(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount4() {
        return outSelectedCollateralTblDtlAmount4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount4(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount5() {
        return outSelectedCollateralTblDtlAmount5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount5(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount6() {
        return outSelectedCollateralTblDtlAmount6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount6(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount7() {
        return outSelectedCollateralTblDtlAmount7;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount7(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount8() {
        return outSelectedCollateralTblDtlAmount8;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount8(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutSelectedCollateralTblDtlAmount9() {
        return outSelectedCollateralTblDtlAmount9;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutSelectedCollateralTblDtlAmount9(BigDecimal value) {
        this.outSelectedCollateralTblDtlAmount9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCDigit1 property.
     * 
     */
    public short getOutSelectedCollateralTblDtlCDigit1() {
        return outSelectedCollateralTblDtlCDigit1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCDigit1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCDigit1(short value) {
        this.outSelectedCollateralTblDtlCDigit1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCDigit2 property.
     * 
     */
    public short getOutSelectedCollateralTblDtlCDigit2() {
        return outSelectedCollateralTblDtlCDigit2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCDigit2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCDigit2(short value) {
        this.outSelectedCollateralTblDtlCDigit2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCurrencyId1 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlCurrencyId1() {
        return outSelectedCollateralTblDtlCurrencyId1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCurrencyId1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCurrencyId1(int value) {
        this.outSelectedCollateralTblDtlCurrencyId1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCurrencyId2 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlCurrencyId2() {
        return outSelectedCollateralTblDtlCurrencyId2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCurrencyId2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCurrencyId2(int value) {
        this.outSelectedCollateralTblDtlCurrencyId2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCurrencyId3 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlCurrencyId3() {
        return outSelectedCollateralTblDtlCurrencyId3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCurrencyId3 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCurrencyId3(int value) {
        this.outSelectedCollateralTblDtlCurrencyId3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCustId1 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlCustId1() {
        return outSelectedCollateralTblDtlCustId1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCustId1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCustId1(int value) {
        this.outSelectedCollateralTblDtlCustId1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlCustId2 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlCustId2() {
        return outSelectedCollateralTblDtlCustId2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlCustId2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlCustId2(int value) {
        this.outSelectedCollateralTblDtlCustId2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate1() {
        return outSelectedCollateralTblDtlDate1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate1(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate10() {
        return outSelectedCollateralTblDtlDate10;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate10(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate2() {
        return outSelectedCollateralTblDtlDate2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate2(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate3() {
        return outSelectedCollateralTblDtlDate3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate3(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate4() {
        return outSelectedCollateralTblDtlDate4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate4(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate5() {
        return outSelectedCollateralTblDtlDate5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate5(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate6() {
        return outSelectedCollateralTblDtlDate6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate6(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate7() {
        return outSelectedCollateralTblDtlDate7;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate7(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate8() {
        return outSelectedCollateralTblDtlDate8;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate8(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlDate9() {
        return outSelectedCollateralTblDtlDate9;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlDate9(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlDate9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr1() {
        return outSelectedCollateralTblDtlDescr1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr1(String value) {
        this.outSelectedCollateralTblDtlDescr1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr10() {
        return outSelectedCollateralTblDtlDescr10;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr10(String value) {
        this.outSelectedCollateralTblDtlDescr10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr11() {
        return outSelectedCollateralTblDtlDescr11;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr11(String value) {
        this.outSelectedCollateralTblDtlDescr11 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr12() {
        return outSelectedCollateralTblDtlDescr12;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr12(String value) {
        this.outSelectedCollateralTblDtlDescr12 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr13() {
        return outSelectedCollateralTblDtlDescr13;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr13(String value) {
        this.outSelectedCollateralTblDtlDescr13 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr14() {
        return outSelectedCollateralTblDtlDescr14;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr14(String value) {
        this.outSelectedCollateralTblDtlDescr14 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr15() {
        return outSelectedCollateralTblDtlDescr15;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr15(String value) {
        this.outSelectedCollateralTblDtlDescr15 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr16() {
        return outSelectedCollateralTblDtlDescr16;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr16(String value) {
        this.outSelectedCollateralTblDtlDescr16 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr17() {
        return outSelectedCollateralTblDtlDescr17;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr17(String value) {
        this.outSelectedCollateralTblDtlDescr17 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr18() {
        return outSelectedCollateralTblDtlDescr18;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr18(String value) {
        this.outSelectedCollateralTblDtlDescr18 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr19() {
        return outSelectedCollateralTblDtlDescr19;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr19(String value) {
        this.outSelectedCollateralTblDtlDescr19 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr2() {
        return outSelectedCollateralTblDtlDescr2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr2(String value) {
        this.outSelectedCollateralTblDtlDescr2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr20() {
        return outSelectedCollateralTblDtlDescr20;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr20(String value) {
        this.outSelectedCollateralTblDtlDescr20 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr3() {
        return outSelectedCollateralTblDtlDescr3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr3(String value) {
        this.outSelectedCollateralTblDtlDescr3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr4() {
        return outSelectedCollateralTblDtlDescr4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr4(String value) {
        this.outSelectedCollateralTblDtlDescr4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr5() {
        return outSelectedCollateralTblDtlDescr5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr5(String value) {
        this.outSelectedCollateralTblDtlDescr5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr6() {
        return outSelectedCollateralTblDtlDescr6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr6(String value) {
        this.outSelectedCollateralTblDtlDescr6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr7() {
        return outSelectedCollateralTblDtlDescr7;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr7(String value) {
        this.outSelectedCollateralTblDtlDescr7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr8() {
        return outSelectedCollateralTblDtlDescr8;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr8(String value) {
        this.outSelectedCollateralTblDtlDescr8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDescr9() {
        return outSelectedCollateralTblDtlDescr9;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDescr9(String value) {
        this.outSelectedCollateralTblDtlDescr9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDtlRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlDtlRecordType() {
        return outSelectedCollateralTblDtlDtlRecordType;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDtlRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlDtlRecordType(String value) {
        this.outSelectedCollateralTblDtlDtlRecordType = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public double getOutSelectedCollateralTblDtlDtlSerialNumber() {
        return outSelectedCollateralTblDtlDtlSerialNumber;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlDtlSerialNumber property.
     * 
     */
    public void setOutSelectedCollateralTblDtlDtlSerialNumber(double value) {
        this.outSelectedCollateralTblDtlDtlSerialNumber = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlEntryComments() {
        return outSelectedCollateralTblDtlEntryComments;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlEntryComments(String value) {
        this.outSelectedCollateralTblDtlEntryComments = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlEntryStatus() {
        return outSelectedCollateralTblDtlEntryStatus;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlEntryStatus(String value) {
        this.outSelectedCollateralTblDtlEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag1() {
        return outSelectedCollateralTblDtlFlag1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag1(String value) {
        this.outSelectedCollateralTblDtlFlag1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag10() {
        return outSelectedCollateralTblDtlFlag10;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag10(String value) {
        this.outSelectedCollateralTblDtlFlag10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag2() {
        return outSelectedCollateralTblDtlFlag2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag2(String value) {
        this.outSelectedCollateralTblDtlFlag2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag3() {
        return outSelectedCollateralTblDtlFlag3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag3(String value) {
        this.outSelectedCollateralTblDtlFlag3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag4() {
        return outSelectedCollateralTblDtlFlag4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag4(String value) {
        this.outSelectedCollateralTblDtlFlag4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag5() {
        return outSelectedCollateralTblDtlFlag5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag5(String value) {
        this.outSelectedCollateralTblDtlFlag5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag6() {
        return outSelectedCollateralTblDtlFlag6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag6(String value) {
        this.outSelectedCollateralTblDtlFlag6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag7() {
        return outSelectedCollateralTblDtlFlag7;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag7(String value) {
        this.outSelectedCollateralTblDtlFlag7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag8() {
        return outSelectedCollateralTblDtlFlag8;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag8(String value) {
        this.outSelectedCollateralTblDtlFlag8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlFlag9() {
        return outSelectedCollateralTblDtlFlag9;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlFlag9(String value) {
        this.outSelectedCollateralTblDtlFlag9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdParType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlGdParType1() {
        return outSelectedCollateralTblDtlGdParType1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdParType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlGdParType1(String value) {
        this.outSelectedCollateralTblDtlGdParType1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdParType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlGdParType2() {
        return outSelectedCollateralTblDtlGdParType2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdParType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlGdParType2(String value) {
        this.outSelectedCollateralTblDtlGdParType2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdParType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlGdParType3() {
        return outSelectedCollateralTblDtlGdParType3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdParType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlGdParType3(String value) {
        this.outSelectedCollateralTblDtlGdParType3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdParType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlGdParType4() {
        return outSelectedCollateralTblDtlGdParType4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdParType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlGdParType4(String value) {
        this.outSelectedCollateralTblDtlGdParType4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdParType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlGdParType5() {
        return outSelectedCollateralTblDtlGdParType5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdParType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlGdParType5(String value) {
        this.outSelectedCollateralTblDtlGdParType5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdParType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlGdParType6() {
        return outSelectedCollateralTblDtlGdParType6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdParType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlGdParType6(String value) {
        this.outSelectedCollateralTblDtlGdParType6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlGdSerialNum1() {
        return outSelectedCollateralTblDtlGdSerialNum1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdSerialNum1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlGdSerialNum1(int value) {
        this.outSelectedCollateralTblDtlGdSerialNum1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlGdSerialNum2() {
        return outSelectedCollateralTblDtlGdSerialNum2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdSerialNum2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlGdSerialNum2(int value) {
        this.outSelectedCollateralTblDtlGdSerialNum2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlGdSerialNum3() {
        return outSelectedCollateralTblDtlGdSerialNum3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdSerialNum3 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlGdSerialNum3(int value) {
        this.outSelectedCollateralTblDtlGdSerialNum3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlGdSerialNum4() {
        return outSelectedCollateralTblDtlGdSerialNum4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdSerialNum4 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlGdSerialNum4(int value) {
        this.outSelectedCollateralTblDtlGdSerialNum4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlGdSerialNum5() {
        return outSelectedCollateralTblDtlGdSerialNum5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdSerialNum5 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlGdSerialNum5(int value) {
        this.outSelectedCollateralTblDtlGdSerialNum5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public int getOutSelectedCollateralTblDtlGdSerialNum6() {
        return outSelectedCollateralTblDtlGdSerialNum6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlGdSerialNum6 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlGdSerialNum6(int value) {
        this.outSelectedCollateralTblDtlGdSerialNum6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlHdrInternalSn property.
     * 
     */
    public double getOutSelectedCollateralTblDtlHdrInternalSn() {
        return outSelectedCollateralTblDtlHdrInternalSn;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlHdrInternalSn property.
     * 
     */
    public void setOutSelectedCollateralTblDtlHdrInternalSn(double value) {
        this.outSelectedCollateralTblDtlHdrInternalSn = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlHdrRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlHdrRecordType() {
        return outSelectedCollateralTblDtlHdrRecordType;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlHdrRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlHdrRecordType(String value) {
        this.outSelectedCollateralTblDtlHdrRecordType = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlInsertDate() {
        return outSelectedCollateralTblDtlInsertDate;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlInsertDate(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlInsertDate = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlInsertTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlInsertTimestamp() {
        return outSelectedCollateralTblDtlInsertTimestamp;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlInsertTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlInsertTimestamp(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlInsertTimestamp = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlInsertUnit property.
     * 
     */
    public int getOutSelectedCollateralTblDtlInsertUnit() {
        return outSelectedCollateralTblDtlInsertUnit;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlInsertUnit property.
     * 
     */
    public void setOutSelectedCollateralTblDtlInsertUnit(int value) {
        this.outSelectedCollateralTblDtlInsertUnit = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlInsertUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlInsertUsr() {
        return outSelectedCollateralTblDtlInsertUsr;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlInsertUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlInsertUsr(String value) {
        this.outSelectedCollateralTblDtlInsertUsr = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlLagreDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlLagreDescr2() {
        return outSelectedCollateralTblDtlLagreDescr2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlLagreDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlLagreDescr2(String value) {
        this.outSelectedCollateralTblDtlLagreDescr2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlLargeDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlLargeDescr1() {
        return outSelectedCollateralTblDtlLargeDescr1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlLargeDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlLargeDescr1(String value) {
        this.outSelectedCollateralTblDtlLargeDescr1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlLargeDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlLargeDescr3() {
        return outSelectedCollateralTblDtlLargeDescr3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlLargeDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlLargeDescr3(String value) {
        this.outSelectedCollateralTblDtlLargeDescr3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber1 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber1() {
        return outSelectedCollateralTblDtlNumber1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber1(double value) {
        this.outSelectedCollateralTblDtlNumber1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber10 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber10() {
        return outSelectedCollateralTblDtlNumber10;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber10 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber10(double value) {
        this.outSelectedCollateralTblDtlNumber10 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber2 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber2() {
        return outSelectedCollateralTblDtlNumber2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber2(double value) {
        this.outSelectedCollateralTblDtlNumber2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber3 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber3() {
        return outSelectedCollateralTblDtlNumber3;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber3 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber3(double value) {
        this.outSelectedCollateralTblDtlNumber3 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber4 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber4() {
        return outSelectedCollateralTblDtlNumber4;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber4 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber4(double value) {
        this.outSelectedCollateralTblDtlNumber4 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber5 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber5() {
        return outSelectedCollateralTblDtlNumber5;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber5 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber5(double value) {
        this.outSelectedCollateralTblDtlNumber5 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber6 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber6() {
        return outSelectedCollateralTblDtlNumber6;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber6 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber6(double value) {
        this.outSelectedCollateralTblDtlNumber6 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber7 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber7() {
        return outSelectedCollateralTblDtlNumber7;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber7 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber7(double value) {
        this.outSelectedCollateralTblDtlNumber7 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber8 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber8() {
        return outSelectedCollateralTblDtlNumber8;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber8 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber8(double value) {
        this.outSelectedCollateralTblDtlNumber8 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlNumber9 property.
     * 
     */
    public double getOutSelectedCollateralTblDtlNumber9() {
        return outSelectedCollateralTblDtlNumber9;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlNumber9 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlNumber9(double value) {
        this.outSelectedCollateralTblDtlNumber9 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlPrftSystem1 property.
     * 
     */
    public short getOutSelectedCollateralTblDtlPrftSystem1() {
        return outSelectedCollateralTblDtlPrftSystem1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlPrftSystem1 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlPrftSystem1(short value) {
        this.outSelectedCollateralTblDtlPrftSystem1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlPrftSystem2 property.
     * 
     */
    public short getOutSelectedCollateralTblDtlPrftSystem2() {
        return outSelectedCollateralTblDtlPrftSystem2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlPrftSystem2 property.
     * 
     */
    public void setOutSelectedCollateralTblDtlPrftSystem2(short value) {
        this.outSelectedCollateralTblDtlPrftSystem2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlProfitsAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlProfitsAccount1() {
        return outSelectedCollateralTblDtlProfitsAccount1;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlProfitsAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlProfitsAccount1(String value) {
        this.outSelectedCollateralTblDtlProfitsAccount1 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlProfitsAccount2() {
        return outSelectedCollateralTblDtlProfitsAccount2;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlProfitsAccount2(String value) {
        this.outSelectedCollateralTblDtlProfitsAccount2 = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlUpdateDate() {
        return outSelectedCollateralTblDtlUpdateDate;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlUpdateDate(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlUpdateDate = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCollateralTblDtlUpdateTimestamp() {
        return outSelectedCollateralTblDtlUpdateTimestamp;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCollateralTblDtlUpdateTimestamp(XMLGregorianCalendar value) {
        this.outSelectedCollateralTblDtlUpdateTimestamp = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlUpdateUnit property.
     * 
     */
    public int getOutSelectedCollateralTblDtlUpdateUnit() {
        return outSelectedCollateralTblDtlUpdateUnit;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlUpdateUnit property.
     * 
     */
    public void setOutSelectedCollateralTblDtlUpdateUnit(int value) {
        this.outSelectedCollateralTblDtlUpdateUnit = value;
    }

    /**
     * Gets the value of the outSelectedCollateralTblDtlUpdateUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCollateralTblDtlUpdateUsr() {
        return outSelectedCollateralTblDtlUpdateUsr;
    }

    /**
     * Sets the value of the outSelectedCollateralTblDtlUpdateUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCollateralTblDtlUpdateUsr(String value) {
        this.outSelectedCollateralTblDtlUpdateUsr = value;
    }

    /**
     * Gets the value of the outViewInsertEmployeeCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutViewInsertEmployeeCharSuppliedChar40() {
        return outViewInsertEmployeeCharSuppliedChar40;
    }

    /**
     * Sets the value of the outViewInsertEmployeeCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutViewInsertEmployeeCharSuppliedChar40(String value) {
        this.outViewInsertEmployeeCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outViewInsertUnitCode property.
     * 
     */
    public int getOutViewInsertUnitCode() {
        return outViewInsertUnitCode;
    }

    /**
     * Sets the value of the outViewInsertUnitCode property.
     * 
     */
    public void setOutViewInsertUnitCode(int value) {
        this.outViewInsertUnitCode = value;
    }

    /**
     * Gets the value of the outViewInsertUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutViewInsertUnitUnitName() {
        return outViewInsertUnitUnitName;
    }

    /**
     * Sets the value of the outViewInsertUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutViewInsertUnitUnitName(String value) {
        this.outViewInsertUnitUnitName = value;
    }

    /**
     * Gets the value of the outViewUpdateEmployeeCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutViewUpdateEmployeeCharSuppliedChar40() {
        return outViewUpdateEmployeeCharSuppliedChar40;
    }

    /**
     * Sets the value of the outViewUpdateEmployeeCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutViewUpdateEmployeeCharSuppliedChar40(String value) {
        this.outViewUpdateEmployeeCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outViewUpdateUnitCode property.
     * 
     */
    public int getOutViewUpdateUnitCode() {
        return outViewUpdateUnitCode;
    }

    /**
     * Sets the value of the outViewUpdateUnitCode property.
     * 
     */
    public void setOutViewUpdateUnitCode(int value) {
        this.outViewUpdateUnitCode = value;
    }

    /**
     * Gets the value of the outViewUpdateUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutViewUpdateUnitUnitName() {
        return outViewUpdateUnitUnitName;
    }

    /**
     * Sets the value of the outViewUpdateUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutViewUpdateUnitUnitName(String value) {
        this.outViewUpdateUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrpActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2009VOutGrpActionsItem }
     *     
     */
    public ArrayOfMC2009VOutGrpActionsItem getOutGrpActions() {
        return outGrpActions;
    }

    /**
     * Sets the value of the outGrpActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2009VOutGrpActionsItem }
     *     
     */
    public void setOutGrpActions(ArrayOfMC2009VOutGrpActionsItem value) {
        this.outGrpActions = value;
    }

    /**
     * Gets the value of the outGrpDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2009VOutGrpDetailsItem }
     *     
     */
    public ArrayOfMC2009VOutGrpDetailsItem getOutGrpDetails() {
        return outGrpDetails;
    }

    /**
     * Sets the value of the outGrpDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2009VOutGrpDetailsItem }
     *     
     */
    public void setOutGrpDetails(ArrayOfMC2009VOutGrpDetailsItem value) {
        this.outGrpDetails = value;
    }

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2009VOutGrpSrvLogItem }
     *     
     */
    public ArrayOfMC2009VOutGrpSrvLogItem getOutGrpSrvLog() {
        return outGrpSrvLog;
    }

    /**
     * Sets the value of the outGrpSrvLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2009VOutGrpSrvLogItem }
     *     
     */
    public void setOutGrpSrvLog(ArrayOfMC2009VOutGrpSrvLogItem value) {
        this.outGrpSrvLog = value;
    }

    /**
     * Gets the value of the outGrpAllDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2009OutGrpAllDetailsItem }
     *     
     */
    public ArrayOfMC2009OutGrpAllDetailsItem getOutGrpAllDetails() {
        return outGrpAllDetails;
    }

    /**
     * Sets the value of the outGrpAllDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2009OutGrpAllDetailsItem }
     *     
     */
    public void setOutGrpAllDetails(ArrayOfMC2009OutGrpAllDetailsItem value) {
        this.outGrpAllDetails = value;
    }

}
