
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0407VOutGrpLoanAccExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0407VOutGrpLoanAccExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmJustDescrJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0407VOutGrpLoanAccExtraitItem", propOrder = {
    "outGrpLoanAccExtraitOutGrmIefSuppliedSelectChar",
    "outGrpLoanAccExtraitOutGrmJustDescrJustificDescription",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn",
    "outGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt",
    "outGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription"
})
public class L0407VOutGrpLoanAccExtraitItem {

    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmIefSuppliedSelectChar")
    protected String outGrpLoanAccExtraitOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmJustDescrJustificDescription")
    protected String outGrpLoanAccExtraitOutGrmJustDescrJustificDescription;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus")
    protected String outGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments")
    protected String outGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts")
    protected String outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn")
    protected short outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType")
    protected String outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg")
    protected String outGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn")
    protected short outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit")
    protected int outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr")
    protected String outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn", required = true)
    protected BigDecimal outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt;
    @XmlElement(name = "OutGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription")
    protected String outGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription;

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmIefSuppliedSelectChar() {
        return outGrpLoanAccExtraitOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpLoanAccExtraitOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmJustDescrJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmJustDescrJustificDescription() {
        return outGrpLoanAccExtraitOutGrmJustDescrJustificDescription;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmJustDescrJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmJustDescrJustificDescription(String value) {
        this.outGrpLoanAccExtraitOutGrmJustDescrJustificDescription = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitAccCurr = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrNrmIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPnlIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitAcrPubIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt(XMLGregorianCalendar value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitAvailDt = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitBlockedAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitCapitalAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitChrCurr = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitComInCcAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitCommissionAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitDormantAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus(String value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpInCcAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitExpenseAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments(String value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitExtraitComments = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitJustificationCode = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitPositiveAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccBankBal = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvAccountBal = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvNrmAccBal = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitPrvOvAccBal = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitPublicCommAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts(String value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestLoanSts = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn property.
     * 
     */
    public short getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn(short value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestSn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType(String value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitRequestType = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg(String value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitReversedFlg = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlNrmIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitRlPnlIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitSubsidyAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitThrdprtAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp(XMLGregorianCalendar value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTmstamp = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTransactionCode = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxCurr = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate(XMLGregorianCalendar value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn property.
     * 
     */
    public short getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn(short value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxSn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit property.
     * 
     */
    public int getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit property.
     * 
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit(int value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr(String value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitUnclearAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlNrmIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPnlIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn(BigDecimal value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitUrlPubIntAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt() {
        return outGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt(XMLGregorianCalendar value) {
        this.outGrpLoanAccExtraitOutGrmLoanAccountExtraitValeurDt = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription() {
        return outGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription;
    }

    /**
     * Sets the value of the outGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription(String value) {
        this.outGrpLoanAccExtraitOutGrmTransDescrPrftTransactionDescription = value;
    }

}
