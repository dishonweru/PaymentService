
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MC2027VShipMortgageImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2027VShipMortgageImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGetCollateralTableInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGetCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableAccountCd1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTableAccountCd2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTableAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InManipulateCollateralTableBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableCDigit1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTableCDigit2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTableCollaborationBank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableCountryCourt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableCustId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableCustId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableDescr9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdParType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdParType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdParType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdParType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdParType5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdParType6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableGdSerialNum1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableGdSerialNum2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableGdSerialNum3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableGdSerialNum4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableGdSerialNum5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableGdSerialNum6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InManipulateCollateralTableInsertionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableInsertionUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableLagreDescr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableLargeDescr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableLargeDescr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableModificationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InManipulateCollateralTableModificationUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableMortgageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTablePrftSystem1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTablePrftSystem2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InManipulateCollateralTableProfitsAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableProfitsAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableRealEstateId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InManipulateCollateralTableRecordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableRequiredInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InManipulateCollateralTableTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedShipId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedShipShipDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpShips" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfMC2027VInGrpShipsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2027VShipMortgageImport", propOrder = {
    "command",
    "inGetCollateralTableInternalSn",
    "inGetCollateralTableRecordType",
    "inIefSuppliedCommand",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inManipulateCollateralTableAccountCd1",
    "inManipulateCollateralTableAccountCd2",
    "inManipulateCollateralTableAmount1",
    "inManipulateCollateralTableAmount10",
    "inManipulateCollateralTableAmount2",
    "inManipulateCollateralTableAmount3",
    "inManipulateCollateralTableAmount4",
    "inManipulateCollateralTableAmount5",
    "inManipulateCollateralTableAmount6",
    "inManipulateCollateralTableAmount7",
    "inManipulateCollateralTableAmount8",
    "inManipulateCollateralTableAmount9",
    "inManipulateCollateralTableBondCode",
    "inManipulateCollateralTableCDigit1",
    "inManipulateCollateralTableCDigit2",
    "inManipulateCollateralTableCollaborationBank",
    "inManipulateCollateralTableComments",
    "inManipulateCollateralTableCountryCourt",
    "inManipulateCollateralTableCurrencyId",
    "inManipulateCollateralTableCustId1",
    "inManipulateCollateralTableCustId2",
    "inManipulateCollateralTableDate1",
    "inManipulateCollateralTableDate10",
    "inManipulateCollateralTableDate2",
    "inManipulateCollateralTableDate3",
    "inManipulateCollateralTableDate4",
    "inManipulateCollateralTableDate5",
    "inManipulateCollateralTableDate6",
    "inManipulateCollateralTableDate7",
    "inManipulateCollateralTableDate8",
    "inManipulateCollateralTableDate9",
    "inManipulateCollateralTableDescr1",
    "inManipulateCollateralTableDescr10",
    "inManipulateCollateralTableDescr2",
    "inManipulateCollateralTableDescr3",
    "inManipulateCollateralTableDescr4",
    "inManipulateCollateralTableDescr5",
    "inManipulateCollateralTableDescr6",
    "inManipulateCollateralTableDescr7",
    "inManipulateCollateralTableDescr8",
    "inManipulateCollateralTableDescr9",
    "inManipulateCollateralTableFlag1",
    "inManipulateCollateralTableFlag10",
    "inManipulateCollateralTableFlag2",
    "inManipulateCollateralTableFlag3",
    "inManipulateCollateralTableFlag4",
    "inManipulateCollateralTableFlag5",
    "inManipulateCollateralTableFlag6",
    "inManipulateCollateralTableFlag7",
    "inManipulateCollateralTableFlag8",
    "inManipulateCollateralTableFlag9",
    "inManipulateCollateralTableGdParType1",
    "inManipulateCollateralTableGdParType2",
    "inManipulateCollateralTableGdParType3",
    "inManipulateCollateralTableGdParType4",
    "inManipulateCollateralTableGdParType5",
    "inManipulateCollateralTableGdParType6",
    "inManipulateCollateralTableGdSerialNum1",
    "inManipulateCollateralTableGdSerialNum2",
    "inManipulateCollateralTableGdSerialNum3",
    "inManipulateCollateralTableGdSerialNum4",
    "inManipulateCollateralTableGdSerialNum5",
    "inManipulateCollateralTableGdSerialNum6",
    "inManipulateCollateralTableInsertionDt",
    "inManipulateCollateralTableInsertionUsr",
    "inManipulateCollateralTableLagreDescr2",
    "inManipulateCollateralTableLargeDescr1",
    "inManipulateCollateralTableLargeDescr3",
    "inManipulateCollateralTableModificationDt",
    "inManipulateCollateralTableModificationUsr",
    "inManipulateCollateralTableMortgageInd",
    "inManipulateCollateralTableNumber1",
    "inManipulateCollateralTableNumber10",
    "inManipulateCollateralTableNumber2",
    "inManipulateCollateralTableNumber3",
    "inManipulateCollateralTableNumber4",
    "inManipulateCollateralTableNumber5",
    "inManipulateCollateralTableNumber6",
    "inManipulateCollateralTableNumber7",
    "inManipulateCollateralTableNumber8",
    "inManipulateCollateralTableNumber9",
    "inManipulateCollateralTablePrftSystem1",
    "inManipulateCollateralTablePrftSystem2",
    "inManipulateCollateralTableProfitsAccount1",
    "inManipulateCollateralTableProfitsAccount2",
    "inManipulateCollateralTableRealEstateId",
    "inManipulateCollateralTableRecordDescr",
    "inManipulateCollateralTableRecordType",
    "inManipulateCollateralTableRequiredInd",
    "inManipulateCollateralTableTrxUnit",
    "inSelectedShipId",
    "inSelectedShipShipDescription",
    "inTrxDefaultJustificIdJustific",
    "inTrxDefaultProductIdProduct",
    "inGrpShips"
})
public class MC2027VShipMortgageImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InGetCollateralTableInternalSn")
    protected double inGetCollateralTableInternalSn;
    @XmlElement(name = "InGetCollateralTableRecordType")
    protected String inGetCollateralTableRecordType;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InManipulateCollateralTableAccountCd1")
    protected short inManipulateCollateralTableAccountCd1;
    @XmlElement(name = "InManipulateCollateralTableAccountCd2")
    protected short inManipulateCollateralTableAccountCd2;
    @XmlElement(name = "InManipulateCollateralTableAmount1", required = true)
    protected BigDecimal inManipulateCollateralTableAmount1;
    @XmlElement(name = "InManipulateCollateralTableAmount10", required = true)
    protected BigDecimal inManipulateCollateralTableAmount10;
    @XmlElement(name = "InManipulateCollateralTableAmount2", required = true)
    protected BigDecimal inManipulateCollateralTableAmount2;
    @XmlElement(name = "InManipulateCollateralTableAmount3", required = true)
    protected BigDecimal inManipulateCollateralTableAmount3;
    @XmlElement(name = "InManipulateCollateralTableAmount4", required = true)
    protected BigDecimal inManipulateCollateralTableAmount4;
    @XmlElement(name = "InManipulateCollateralTableAmount5", required = true)
    protected BigDecimal inManipulateCollateralTableAmount5;
    @XmlElement(name = "InManipulateCollateralTableAmount6", required = true)
    protected BigDecimal inManipulateCollateralTableAmount6;
    @XmlElement(name = "InManipulateCollateralTableAmount7", required = true)
    protected BigDecimal inManipulateCollateralTableAmount7;
    @XmlElement(name = "InManipulateCollateralTableAmount8", required = true)
    protected BigDecimal inManipulateCollateralTableAmount8;
    @XmlElement(name = "InManipulateCollateralTableAmount9", required = true)
    protected BigDecimal inManipulateCollateralTableAmount9;
    @XmlElement(name = "InManipulateCollateralTableBondCode")
    protected String inManipulateCollateralTableBondCode;
    @XmlElement(name = "InManipulateCollateralTableCDigit1")
    protected short inManipulateCollateralTableCDigit1;
    @XmlElement(name = "InManipulateCollateralTableCDigit2")
    protected short inManipulateCollateralTableCDigit2;
    @XmlElement(name = "InManipulateCollateralTableCollaborationBank")
    protected int inManipulateCollateralTableCollaborationBank;
    @XmlElement(name = "InManipulateCollateralTableComments")
    protected String inManipulateCollateralTableComments;
    @XmlElement(name = "InManipulateCollateralTableCountryCourt")
    protected String inManipulateCollateralTableCountryCourt;
    @XmlElement(name = "InManipulateCollateralTableCurrencyId")
    protected int inManipulateCollateralTableCurrencyId;
    @XmlElement(name = "InManipulateCollateralTableCustId1")
    protected int inManipulateCollateralTableCustId1;
    @XmlElement(name = "InManipulateCollateralTableCustId2")
    protected int inManipulateCollateralTableCustId2;
    @XmlElement(name = "InManipulateCollateralTableDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate1;
    @XmlElement(name = "InManipulateCollateralTableDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate10;
    @XmlElement(name = "InManipulateCollateralTableDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate2;
    @XmlElement(name = "InManipulateCollateralTableDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate3;
    @XmlElement(name = "InManipulateCollateralTableDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate4;
    @XmlElement(name = "InManipulateCollateralTableDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate5;
    @XmlElement(name = "InManipulateCollateralTableDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate6;
    @XmlElement(name = "InManipulateCollateralTableDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate7;
    @XmlElement(name = "InManipulateCollateralTableDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate8;
    @XmlElement(name = "InManipulateCollateralTableDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableDate9;
    @XmlElement(name = "InManipulateCollateralTableDescr1")
    protected String inManipulateCollateralTableDescr1;
    @XmlElement(name = "InManipulateCollateralTableDescr10")
    protected String inManipulateCollateralTableDescr10;
    @XmlElement(name = "InManipulateCollateralTableDescr2")
    protected String inManipulateCollateralTableDescr2;
    @XmlElement(name = "InManipulateCollateralTableDescr3")
    protected String inManipulateCollateralTableDescr3;
    @XmlElement(name = "InManipulateCollateralTableDescr4")
    protected String inManipulateCollateralTableDescr4;
    @XmlElement(name = "InManipulateCollateralTableDescr5")
    protected String inManipulateCollateralTableDescr5;
    @XmlElement(name = "InManipulateCollateralTableDescr6")
    protected String inManipulateCollateralTableDescr6;
    @XmlElement(name = "InManipulateCollateralTableDescr7")
    protected String inManipulateCollateralTableDescr7;
    @XmlElement(name = "InManipulateCollateralTableDescr8")
    protected String inManipulateCollateralTableDescr8;
    @XmlElement(name = "InManipulateCollateralTableDescr9")
    protected String inManipulateCollateralTableDescr9;
    @XmlElement(name = "InManipulateCollateralTableFlag1")
    protected String inManipulateCollateralTableFlag1;
    @XmlElement(name = "InManipulateCollateralTableFlag10")
    protected String inManipulateCollateralTableFlag10;
    @XmlElement(name = "InManipulateCollateralTableFlag2")
    protected String inManipulateCollateralTableFlag2;
    @XmlElement(name = "InManipulateCollateralTableFlag3")
    protected String inManipulateCollateralTableFlag3;
    @XmlElement(name = "InManipulateCollateralTableFlag4")
    protected String inManipulateCollateralTableFlag4;
    @XmlElement(name = "InManipulateCollateralTableFlag5")
    protected String inManipulateCollateralTableFlag5;
    @XmlElement(name = "InManipulateCollateralTableFlag6")
    protected String inManipulateCollateralTableFlag6;
    @XmlElement(name = "InManipulateCollateralTableFlag7")
    protected String inManipulateCollateralTableFlag7;
    @XmlElement(name = "InManipulateCollateralTableFlag8")
    protected String inManipulateCollateralTableFlag8;
    @XmlElement(name = "InManipulateCollateralTableFlag9")
    protected String inManipulateCollateralTableFlag9;
    @XmlElement(name = "InManipulateCollateralTableGdParType1")
    protected String inManipulateCollateralTableGdParType1;
    @XmlElement(name = "InManipulateCollateralTableGdParType2")
    protected String inManipulateCollateralTableGdParType2;
    @XmlElement(name = "InManipulateCollateralTableGdParType3")
    protected String inManipulateCollateralTableGdParType3;
    @XmlElement(name = "InManipulateCollateralTableGdParType4")
    protected String inManipulateCollateralTableGdParType4;
    @XmlElement(name = "InManipulateCollateralTableGdParType5")
    protected String inManipulateCollateralTableGdParType5;
    @XmlElement(name = "InManipulateCollateralTableGdParType6")
    protected String inManipulateCollateralTableGdParType6;
    @XmlElement(name = "InManipulateCollateralTableGdSerialNum1")
    protected int inManipulateCollateralTableGdSerialNum1;
    @XmlElement(name = "InManipulateCollateralTableGdSerialNum2")
    protected int inManipulateCollateralTableGdSerialNum2;
    @XmlElement(name = "InManipulateCollateralTableGdSerialNum3")
    protected int inManipulateCollateralTableGdSerialNum3;
    @XmlElement(name = "InManipulateCollateralTableGdSerialNum4")
    protected int inManipulateCollateralTableGdSerialNum4;
    @XmlElement(name = "InManipulateCollateralTableGdSerialNum5")
    protected int inManipulateCollateralTableGdSerialNum5;
    @XmlElement(name = "InManipulateCollateralTableGdSerialNum6")
    protected int inManipulateCollateralTableGdSerialNum6;
    @XmlElement(name = "InManipulateCollateralTableInsertionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableInsertionDt;
    @XmlElement(name = "InManipulateCollateralTableInsertionUsr")
    protected String inManipulateCollateralTableInsertionUsr;
    @XmlElement(name = "InManipulateCollateralTableLagreDescr2")
    protected String inManipulateCollateralTableLagreDescr2;
    @XmlElement(name = "InManipulateCollateralTableLargeDescr1")
    protected String inManipulateCollateralTableLargeDescr1;
    @XmlElement(name = "InManipulateCollateralTableLargeDescr3")
    protected String inManipulateCollateralTableLargeDescr3;
    @XmlElement(name = "InManipulateCollateralTableModificationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inManipulateCollateralTableModificationDt;
    @XmlElement(name = "InManipulateCollateralTableModificationUsr")
    protected String inManipulateCollateralTableModificationUsr;
    @XmlElement(name = "InManipulateCollateralTableMortgageInd")
    protected String inManipulateCollateralTableMortgageInd;
    @XmlElement(name = "InManipulateCollateralTableNumber1")
    protected double inManipulateCollateralTableNumber1;
    @XmlElement(name = "InManipulateCollateralTableNumber10")
    protected double inManipulateCollateralTableNumber10;
    @XmlElement(name = "InManipulateCollateralTableNumber2")
    protected double inManipulateCollateralTableNumber2;
    @XmlElement(name = "InManipulateCollateralTableNumber3")
    protected double inManipulateCollateralTableNumber3;
    @XmlElement(name = "InManipulateCollateralTableNumber4")
    protected double inManipulateCollateralTableNumber4;
    @XmlElement(name = "InManipulateCollateralTableNumber5")
    protected double inManipulateCollateralTableNumber5;
    @XmlElement(name = "InManipulateCollateralTableNumber6")
    protected double inManipulateCollateralTableNumber6;
    @XmlElement(name = "InManipulateCollateralTableNumber7")
    protected double inManipulateCollateralTableNumber7;
    @XmlElement(name = "InManipulateCollateralTableNumber8")
    protected double inManipulateCollateralTableNumber8;
    @XmlElement(name = "InManipulateCollateralTableNumber9")
    protected double inManipulateCollateralTableNumber9;
    @XmlElement(name = "InManipulateCollateralTablePrftSystem1")
    protected short inManipulateCollateralTablePrftSystem1;
    @XmlElement(name = "InManipulateCollateralTablePrftSystem2")
    protected short inManipulateCollateralTablePrftSystem2;
    @XmlElement(name = "InManipulateCollateralTableProfitsAccount1")
    protected String inManipulateCollateralTableProfitsAccount1;
    @XmlElement(name = "InManipulateCollateralTableProfitsAccount2")
    protected String inManipulateCollateralTableProfitsAccount2;
    @XmlElement(name = "InManipulateCollateralTableRealEstateId")
    protected double inManipulateCollateralTableRealEstateId;
    @XmlElement(name = "InManipulateCollateralTableRecordDescr")
    protected String inManipulateCollateralTableRecordDescr;
    @XmlElement(name = "InManipulateCollateralTableRecordType")
    protected String inManipulateCollateralTableRecordType;
    @XmlElement(name = "InManipulateCollateralTableRequiredInd")
    protected String inManipulateCollateralTableRequiredInd;
    @XmlElement(name = "InManipulateCollateralTableTrxUnit")
    protected int inManipulateCollateralTableTrxUnit;
    @XmlElement(name = "InSelectedShipId")
    protected double inSelectedShipId;
    @XmlElement(name = "InSelectedShipShipDescription")
    protected String inSelectedShipShipDescription;
    @XmlElement(name = "InTrxDefaultJustificIdJustific")
    protected int inTrxDefaultJustificIdJustific;
    @XmlElement(name = "InTrxDefaultProductIdProduct")
    protected int inTrxDefaultProductIdProduct;
    @XmlElement(name = "InGrpShips")
    protected ArrayOfMC2027VInGrpShipsItem inGrpShips;

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
     * Gets the value of the inGetCollateralTableInternalSn property.
     * 
     */
    public double getInGetCollateralTableInternalSn() {
        return inGetCollateralTableInternalSn;
    }

    /**
     * Sets the value of the inGetCollateralTableInternalSn property.
     * 
     */
    public void setInGetCollateralTableInternalSn(double value) {
        this.inGetCollateralTableInternalSn = value;
    }

    /**
     * Gets the value of the inGetCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGetCollateralTableRecordType() {
        return inGetCollateralTableRecordType;
    }

    /**
     * Sets the value of the inGetCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGetCollateralTableRecordType(String value) {
        this.inGetCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAccountCd1 property.
     * 
     */
    public short getInManipulateCollateralTableAccountCd1() {
        return inManipulateCollateralTableAccountCd1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAccountCd1 property.
     * 
     */
    public void setInManipulateCollateralTableAccountCd1(short value) {
        this.inManipulateCollateralTableAccountCd1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAccountCd2 property.
     * 
     */
    public short getInManipulateCollateralTableAccountCd2() {
        return inManipulateCollateralTableAccountCd2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAccountCd2 property.
     * 
     */
    public void setInManipulateCollateralTableAccountCd2(short value) {
        this.inManipulateCollateralTableAccountCd2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount1() {
        return inManipulateCollateralTableAmount1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount1(BigDecimal value) {
        this.inManipulateCollateralTableAmount1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount10() {
        return inManipulateCollateralTableAmount10;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount10(BigDecimal value) {
        this.inManipulateCollateralTableAmount10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount2() {
        return inManipulateCollateralTableAmount2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount2(BigDecimal value) {
        this.inManipulateCollateralTableAmount2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount3() {
        return inManipulateCollateralTableAmount3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount3(BigDecimal value) {
        this.inManipulateCollateralTableAmount3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount4() {
        return inManipulateCollateralTableAmount4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount4(BigDecimal value) {
        this.inManipulateCollateralTableAmount4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount5() {
        return inManipulateCollateralTableAmount5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount5(BigDecimal value) {
        this.inManipulateCollateralTableAmount5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount6() {
        return inManipulateCollateralTableAmount6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount6(BigDecimal value) {
        this.inManipulateCollateralTableAmount6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount7() {
        return inManipulateCollateralTableAmount7;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount7(BigDecimal value) {
        this.inManipulateCollateralTableAmount7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount8() {
        return inManipulateCollateralTableAmount8;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount8(BigDecimal value) {
        this.inManipulateCollateralTableAmount8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInManipulateCollateralTableAmount9() {
        return inManipulateCollateralTableAmount9;
    }

    /**
     * Sets the value of the inManipulateCollateralTableAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInManipulateCollateralTableAmount9(BigDecimal value) {
        this.inManipulateCollateralTableAmount9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableBondCode() {
        return inManipulateCollateralTableBondCode;
    }

    /**
     * Sets the value of the inManipulateCollateralTableBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableBondCode(String value) {
        this.inManipulateCollateralTableBondCode = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCDigit1 property.
     * 
     */
    public short getInManipulateCollateralTableCDigit1() {
        return inManipulateCollateralTableCDigit1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCDigit1 property.
     * 
     */
    public void setInManipulateCollateralTableCDigit1(short value) {
        this.inManipulateCollateralTableCDigit1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCDigit2 property.
     * 
     */
    public short getInManipulateCollateralTableCDigit2() {
        return inManipulateCollateralTableCDigit2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCDigit2 property.
     * 
     */
    public void setInManipulateCollateralTableCDigit2(short value) {
        this.inManipulateCollateralTableCDigit2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCollaborationBank property.
     * 
     */
    public int getInManipulateCollateralTableCollaborationBank() {
        return inManipulateCollateralTableCollaborationBank;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCollaborationBank property.
     * 
     */
    public void setInManipulateCollateralTableCollaborationBank(int value) {
        this.inManipulateCollateralTableCollaborationBank = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableComments() {
        return inManipulateCollateralTableComments;
    }

    /**
     * Sets the value of the inManipulateCollateralTableComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableComments(String value) {
        this.inManipulateCollateralTableComments = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCountryCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableCountryCourt() {
        return inManipulateCollateralTableCountryCourt;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCountryCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableCountryCourt(String value) {
        this.inManipulateCollateralTableCountryCourt = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCurrencyId property.
     * 
     */
    public int getInManipulateCollateralTableCurrencyId() {
        return inManipulateCollateralTableCurrencyId;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCurrencyId property.
     * 
     */
    public void setInManipulateCollateralTableCurrencyId(int value) {
        this.inManipulateCollateralTableCurrencyId = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCustId1 property.
     * 
     */
    public int getInManipulateCollateralTableCustId1() {
        return inManipulateCollateralTableCustId1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCustId1 property.
     * 
     */
    public void setInManipulateCollateralTableCustId1(int value) {
        this.inManipulateCollateralTableCustId1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableCustId2 property.
     * 
     */
    public int getInManipulateCollateralTableCustId2() {
        return inManipulateCollateralTableCustId2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableCustId2 property.
     * 
     */
    public void setInManipulateCollateralTableCustId2(int value) {
        this.inManipulateCollateralTableCustId2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate1() {
        return inManipulateCollateralTableDate1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate1(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate10() {
        return inManipulateCollateralTableDate10;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate10(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate2() {
        return inManipulateCollateralTableDate2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate2(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate3() {
        return inManipulateCollateralTableDate3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate3(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate4() {
        return inManipulateCollateralTableDate4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate4(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate5() {
        return inManipulateCollateralTableDate5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate5(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate6() {
        return inManipulateCollateralTableDate6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate6(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate7() {
        return inManipulateCollateralTableDate7;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate7(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate8() {
        return inManipulateCollateralTableDate8;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate8(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableDate9() {
        return inManipulateCollateralTableDate9;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableDate9(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableDate9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr1() {
        return inManipulateCollateralTableDescr1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr1(String value) {
        this.inManipulateCollateralTableDescr1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr10() {
        return inManipulateCollateralTableDescr10;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr10(String value) {
        this.inManipulateCollateralTableDescr10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr2() {
        return inManipulateCollateralTableDescr2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr2(String value) {
        this.inManipulateCollateralTableDescr2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr3() {
        return inManipulateCollateralTableDescr3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr3(String value) {
        this.inManipulateCollateralTableDescr3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr4() {
        return inManipulateCollateralTableDescr4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr4(String value) {
        this.inManipulateCollateralTableDescr4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr5() {
        return inManipulateCollateralTableDescr5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr5(String value) {
        this.inManipulateCollateralTableDescr5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr6() {
        return inManipulateCollateralTableDescr6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr6(String value) {
        this.inManipulateCollateralTableDescr6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr7() {
        return inManipulateCollateralTableDescr7;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr7(String value) {
        this.inManipulateCollateralTableDescr7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr8() {
        return inManipulateCollateralTableDescr8;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr8(String value) {
        this.inManipulateCollateralTableDescr8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableDescr9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableDescr9() {
        return inManipulateCollateralTableDescr9;
    }

    /**
     * Sets the value of the inManipulateCollateralTableDescr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableDescr9(String value) {
        this.inManipulateCollateralTableDescr9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag1() {
        return inManipulateCollateralTableFlag1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag1(String value) {
        this.inManipulateCollateralTableFlag1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag10() {
        return inManipulateCollateralTableFlag10;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag10(String value) {
        this.inManipulateCollateralTableFlag10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag2() {
        return inManipulateCollateralTableFlag2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag2(String value) {
        this.inManipulateCollateralTableFlag2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag3() {
        return inManipulateCollateralTableFlag3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag3(String value) {
        this.inManipulateCollateralTableFlag3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag4() {
        return inManipulateCollateralTableFlag4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag4(String value) {
        this.inManipulateCollateralTableFlag4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag5() {
        return inManipulateCollateralTableFlag5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag5(String value) {
        this.inManipulateCollateralTableFlag5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag6() {
        return inManipulateCollateralTableFlag6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag6(String value) {
        this.inManipulateCollateralTableFlag6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag7() {
        return inManipulateCollateralTableFlag7;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag7(String value) {
        this.inManipulateCollateralTableFlag7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag8() {
        return inManipulateCollateralTableFlag8;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag8(String value) {
        this.inManipulateCollateralTableFlag8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableFlag9() {
        return inManipulateCollateralTableFlag9;
    }

    /**
     * Sets the value of the inManipulateCollateralTableFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableFlag9(String value) {
        this.inManipulateCollateralTableFlag9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdParType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableGdParType1() {
        return inManipulateCollateralTableGdParType1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdParType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableGdParType1(String value) {
        this.inManipulateCollateralTableGdParType1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdParType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableGdParType2() {
        return inManipulateCollateralTableGdParType2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdParType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableGdParType2(String value) {
        this.inManipulateCollateralTableGdParType2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdParType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableGdParType3() {
        return inManipulateCollateralTableGdParType3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdParType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableGdParType3(String value) {
        this.inManipulateCollateralTableGdParType3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdParType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableGdParType4() {
        return inManipulateCollateralTableGdParType4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdParType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableGdParType4(String value) {
        this.inManipulateCollateralTableGdParType4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdParType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableGdParType5() {
        return inManipulateCollateralTableGdParType5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdParType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableGdParType5(String value) {
        this.inManipulateCollateralTableGdParType5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdParType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableGdParType6() {
        return inManipulateCollateralTableGdParType6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdParType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableGdParType6(String value) {
        this.inManipulateCollateralTableGdParType6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdSerialNum1 property.
     * 
     */
    public int getInManipulateCollateralTableGdSerialNum1() {
        return inManipulateCollateralTableGdSerialNum1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdSerialNum1 property.
     * 
     */
    public void setInManipulateCollateralTableGdSerialNum1(int value) {
        this.inManipulateCollateralTableGdSerialNum1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdSerialNum2 property.
     * 
     */
    public int getInManipulateCollateralTableGdSerialNum2() {
        return inManipulateCollateralTableGdSerialNum2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdSerialNum2 property.
     * 
     */
    public void setInManipulateCollateralTableGdSerialNum2(int value) {
        this.inManipulateCollateralTableGdSerialNum2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdSerialNum3 property.
     * 
     */
    public int getInManipulateCollateralTableGdSerialNum3() {
        return inManipulateCollateralTableGdSerialNum3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdSerialNum3 property.
     * 
     */
    public void setInManipulateCollateralTableGdSerialNum3(int value) {
        this.inManipulateCollateralTableGdSerialNum3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdSerialNum4 property.
     * 
     */
    public int getInManipulateCollateralTableGdSerialNum4() {
        return inManipulateCollateralTableGdSerialNum4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdSerialNum4 property.
     * 
     */
    public void setInManipulateCollateralTableGdSerialNum4(int value) {
        this.inManipulateCollateralTableGdSerialNum4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdSerialNum5 property.
     * 
     */
    public int getInManipulateCollateralTableGdSerialNum5() {
        return inManipulateCollateralTableGdSerialNum5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdSerialNum5 property.
     * 
     */
    public void setInManipulateCollateralTableGdSerialNum5(int value) {
        this.inManipulateCollateralTableGdSerialNum5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableGdSerialNum6 property.
     * 
     */
    public int getInManipulateCollateralTableGdSerialNum6() {
        return inManipulateCollateralTableGdSerialNum6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableGdSerialNum6 property.
     * 
     */
    public void setInManipulateCollateralTableGdSerialNum6(int value) {
        this.inManipulateCollateralTableGdSerialNum6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableInsertionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableInsertionDt() {
        return inManipulateCollateralTableInsertionDt;
    }

    /**
     * Sets the value of the inManipulateCollateralTableInsertionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableInsertionDt(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableInsertionDt = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableInsertionUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableInsertionUsr() {
        return inManipulateCollateralTableInsertionUsr;
    }

    /**
     * Sets the value of the inManipulateCollateralTableInsertionUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableInsertionUsr(String value) {
        this.inManipulateCollateralTableInsertionUsr = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableLagreDescr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableLagreDescr2() {
        return inManipulateCollateralTableLagreDescr2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableLagreDescr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableLagreDescr2(String value) {
        this.inManipulateCollateralTableLagreDescr2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableLargeDescr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableLargeDescr1() {
        return inManipulateCollateralTableLargeDescr1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableLargeDescr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableLargeDescr1(String value) {
        this.inManipulateCollateralTableLargeDescr1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableLargeDescr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableLargeDescr3() {
        return inManipulateCollateralTableLargeDescr3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableLargeDescr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableLargeDescr3(String value) {
        this.inManipulateCollateralTableLargeDescr3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableModificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInManipulateCollateralTableModificationDt() {
        return inManipulateCollateralTableModificationDt;
    }

    /**
     * Sets the value of the inManipulateCollateralTableModificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInManipulateCollateralTableModificationDt(XMLGregorianCalendar value) {
        this.inManipulateCollateralTableModificationDt = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableModificationUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableModificationUsr() {
        return inManipulateCollateralTableModificationUsr;
    }

    /**
     * Sets the value of the inManipulateCollateralTableModificationUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableModificationUsr(String value) {
        this.inManipulateCollateralTableModificationUsr = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableMortgageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableMortgageInd() {
        return inManipulateCollateralTableMortgageInd;
    }

    /**
     * Sets the value of the inManipulateCollateralTableMortgageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableMortgageInd(String value) {
        this.inManipulateCollateralTableMortgageInd = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber1 property.
     * 
     */
    public double getInManipulateCollateralTableNumber1() {
        return inManipulateCollateralTableNumber1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber1 property.
     * 
     */
    public void setInManipulateCollateralTableNumber1(double value) {
        this.inManipulateCollateralTableNumber1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber10 property.
     * 
     */
    public double getInManipulateCollateralTableNumber10() {
        return inManipulateCollateralTableNumber10;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber10 property.
     * 
     */
    public void setInManipulateCollateralTableNumber10(double value) {
        this.inManipulateCollateralTableNumber10 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber2 property.
     * 
     */
    public double getInManipulateCollateralTableNumber2() {
        return inManipulateCollateralTableNumber2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber2 property.
     * 
     */
    public void setInManipulateCollateralTableNumber2(double value) {
        this.inManipulateCollateralTableNumber2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber3 property.
     * 
     */
    public double getInManipulateCollateralTableNumber3() {
        return inManipulateCollateralTableNumber3;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber3 property.
     * 
     */
    public void setInManipulateCollateralTableNumber3(double value) {
        this.inManipulateCollateralTableNumber3 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber4 property.
     * 
     */
    public double getInManipulateCollateralTableNumber4() {
        return inManipulateCollateralTableNumber4;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber4 property.
     * 
     */
    public void setInManipulateCollateralTableNumber4(double value) {
        this.inManipulateCollateralTableNumber4 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber5 property.
     * 
     */
    public double getInManipulateCollateralTableNumber5() {
        return inManipulateCollateralTableNumber5;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber5 property.
     * 
     */
    public void setInManipulateCollateralTableNumber5(double value) {
        this.inManipulateCollateralTableNumber5 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber6 property.
     * 
     */
    public double getInManipulateCollateralTableNumber6() {
        return inManipulateCollateralTableNumber6;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber6 property.
     * 
     */
    public void setInManipulateCollateralTableNumber6(double value) {
        this.inManipulateCollateralTableNumber6 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber7 property.
     * 
     */
    public double getInManipulateCollateralTableNumber7() {
        return inManipulateCollateralTableNumber7;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber7 property.
     * 
     */
    public void setInManipulateCollateralTableNumber7(double value) {
        this.inManipulateCollateralTableNumber7 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber8 property.
     * 
     */
    public double getInManipulateCollateralTableNumber8() {
        return inManipulateCollateralTableNumber8;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber8 property.
     * 
     */
    public void setInManipulateCollateralTableNumber8(double value) {
        this.inManipulateCollateralTableNumber8 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableNumber9 property.
     * 
     */
    public double getInManipulateCollateralTableNumber9() {
        return inManipulateCollateralTableNumber9;
    }

    /**
     * Sets the value of the inManipulateCollateralTableNumber9 property.
     * 
     */
    public void setInManipulateCollateralTableNumber9(double value) {
        this.inManipulateCollateralTableNumber9 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTablePrftSystem1 property.
     * 
     */
    public short getInManipulateCollateralTablePrftSystem1() {
        return inManipulateCollateralTablePrftSystem1;
    }

    /**
     * Sets the value of the inManipulateCollateralTablePrftSystem1 property.
     * 
     */
    public void setInManipulateCollateralTablePrftSystem1(short value) {
        this.inManipulateCollateralTablePrftSystem1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTablePrftSystem2 property.
     * 
     */
    public short getInManipulateCollateralTablePrftSystem2() {
        return inManipulateCollateralTablePrftSystem2;
    }

    /**
     * Sets the value of the inManipulateCollateralTablePrftSystem2 property.
     * 
     */
    public void setInManipulateCollateralTablePrftSystem2(short value) {
        this.inManipulateCollateralTablePrftSystem2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableProfitsAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableProfitsAccount1() {
        return inManipulateCollateralTableProfitsAccount1;
    }

    /**
     * Sets the value of the inManipulateCollateralTableProfitsAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableProfitsAccount1(String value) {
        this.inManipulateCollateralTableProfitsAccount1 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableProfitsAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableProfitsAccount2() {
        return inManipulateCollateralTableProfitsAccount2;
    }

    /**
     * Sets the value of the inManipulateCollateralTableProfitsAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableProfitsAccount2(String value) {
        this.inManipulateCollateralTableProfitsAccount2 = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableRealEstateId property.
     * 
     */
    public double getInManipulateCollateralTableRealEstateId() {
        return inManipulateCollateralTableRealEstateId;
    }

    /**
     * Sets the value of the inManipulateCollateralTableRealEstateId property.
     * 
     */
    public void setInManipulateCollateralTableRealEstateId(double value) {
        this.inManipulateCollateralTableRealEstateId = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableRecordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableRecordDescr() {
        return inManipulateCollateralTableRecordDescr;
    }

    /**
     * Sets the value of the inManipulateCollateralTableRecordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableRecordDescr(String value) {
        this.inManipulateCollateralTableRecordDescr = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableRecordType() {
        return inManipulateCollateralTableRecordType;
    }

    /**
     * Sets the value of the inManipulateCollateralTableRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableRecordType(String value) {
        this.inManipulateCollateralTableRecordType = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableRequiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInManipulateCollateralTableRequiredInd() {
        return inManipulateCollateralTableRequiredInd;
    }

    /**
     * Sets the value of the inManipulateCollateralTableRequiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInManipulateCollateralTableRequiredInd(String value) {
        this.inManipulateCollateralTableRequiredInd = value;
    }

    /**
     * Gets the value of the inManipulateCollateralTableTrxUnit property.
     * 
     */
    public int getInManipulateCollateralTableTrxUnit() {
        return inManipulateCollateralTableTrxUnit;
    }

    /**
     * Sets the value of the inManipulateCollateralTableTrxUnit property.
     * 
     */
    public void setInManipulateCollateralTableTrxUnit(int value) {
        this.inManipulateCollateralTableTrxUnit = value;
    }

    /**
     * Gets the value of the inSelectedShipId property.
     * 
     */
    public double getInSelectedShipId() {
        return inSelectedShipId;
    }

    /**
     * Sets the value of the inSelectedShipId property.
     * 
     */
    public void setInSelectedShipId(double value) {
        this.inSelectedShipId = value;
    }

    /**
     * Gets the value of the inSelectedShipShipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedShipShipDescription() {
        return inSelectedShipShipDescription;
    }

    /**
     * Sets the value of the inSelectedShipShipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedShipShipDescription(String value) {
        this.inSelectedShipShipDescription = value;
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
     * Gets the value of the inGrpShips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMC2027VInGrpShipsItem }
     *     
     */
    public ArrayOfMC2027VInGrpShipsItem getInGrpShips() {
        return inGrpShips;
    }

    /**
     * Sets the value of the inGrpShips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMC2027VInGrpShipsItem }
     *     
     */
    public void setInGrpShips(ArrayOfMC2027VInGrpShipsItem value) {
        this.inGrpShips = value;
    }

}
