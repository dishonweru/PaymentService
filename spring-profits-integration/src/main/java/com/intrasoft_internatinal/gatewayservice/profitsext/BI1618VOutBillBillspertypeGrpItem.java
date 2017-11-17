
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BI1618VOutBillBillspertypeGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI1618VOutBillBillspertypeGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI1618VOutBillBillspertypeGrpItem", propOrder = {
    "outBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName",
    "outBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15",
    "outBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20",
    "outBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40",
    "outBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20",
    "outBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20",
    "outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40",
    "outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3",
    "outBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit",
    "outBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle",
    "outBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF",
    "outBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments",
    "outBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold"
})
public class BI1618VOutBillBillspertypeGrpItem {

    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum")
    protected double outBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId")
    protected int outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15")
    protected String outBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20")
    protected String outBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40")
    protected String outBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20")
    protected String outBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20")
    protected String outBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40")
    protected String outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3")
    protected String outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag")
    protected String outBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode")
    protected int outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode")
    protected int outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit")
    protected short outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId")
    protected int outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit")
    protected short outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum")
    protected double outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount", required = true)
    protected BigDecimal outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn")
    protected double outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd")
    protected short outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments")
    protected String outBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments;
    @XmlElement(name = "OutBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold")
    protected String outBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold;

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum property.
     * 
     */
    public double getOutBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum(double value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeRegistBillRegisterBregSerialNum = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId property.
     * 
     */
    public int getOutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId(int value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankId = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustCollaborationBankBankName = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15() {
        return outBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15(String value) {
        this.outBillBillspertypeGrpOutGrpBillRejectedFlagDescIefSuppliedChar15 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20() {
        return outBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20(String value) {
        this.outBillBillspertypeGrpOutGrpGetBillTypeFlagIefSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40() {
        return outBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40(String value) {
        this.outBillBillspertypeGrpOutGrpGetBillStatusFlagIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20() {
        return outBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20(String value) {
        this.outBillBillspertypeGrpOutGrpGetBillClrTypeFlagIefSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20() {
        return outBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20(String value) {
        this.outBillBillspertypeGrpOutGrpGetBillOvdTypeFlagIefSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40() {
        return outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40(String value) {
        this.outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3() {
        return outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3(String value) {
        this.outBillBillspertypeGrpOutGrpGetBillPurchTypeFlagIefSuppliedChar3 = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag() {
        return outBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag(String value) {
        this.outBillBillspertypeGrpOutGrpSelectedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode property.
     * 
     */
    public int getOutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode(int value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitCode = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustUnitUnitName = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode property.
     * 
     */
    public int getOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode(int value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCode = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit property.
     * 
     */
    public short getOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit(short value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissCdigit = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustBillIssuerBissAfmNo = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillRejectedFlag = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate(XMLGregorianCalendar value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustBillBillFinalDate = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerSurname = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId property.
     * 
     */
    public int getOutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId(int value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCustId = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit property.
     * 
     */
    public short getOutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit(short value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCustCustomerCDigit = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeIssuerBillIssuerBissTitle = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum property.
     * 
     */
    public double getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum(double value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillSerialNum = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillNumber = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate(XMLGregorianCalendar value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillIssueDate = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAccountNumb = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount(BigDecimal value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillAmount = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillTypeFlag = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillClrtypeFlag = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillStatusFlag = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn property.
     * 
     */
    public double getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn(double value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCollSn = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccNumber = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd property.
     * 
     */
    public short getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd property.
     * 
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd(short value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillCrAccCd = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillOverdueFlg = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate(XMLGregorianCalendar value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseDate = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillBillPurchaseHold = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillTempBillStatusF = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments() {
        return outBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments(String value) {
        this.outBillBillspertypeGrpOutGrpBillBillspertypeBillBillComments = value;
    }

    /**
     * Gets the value of the outBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold() {
        return outBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold;
    }

    /**
     * Sets the value of the outBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold(String value) {
        this.outBillBillspertypeGrpOutGrpBillPurchHoldBillBillPurchaseHold = value;
    }

}
