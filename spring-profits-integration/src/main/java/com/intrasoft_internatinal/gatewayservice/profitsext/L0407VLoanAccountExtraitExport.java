
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for L0407VLoanAccountExtraitExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0407VLoanAccountExtraitExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAuthName1CharSuppliedChar80" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthName2CharSuppliedChar80" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBaseCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBaseIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBenefCardCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBenefCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLoanAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLoanAccountLoanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountNrmAcrIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmRlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountNrmUrlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOldAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLoanAccountOldAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanAccountOvAcrNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvAcrPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvCapBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvComBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvExpBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvRlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvRlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvSubsidyBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlNrmIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountOvUrlPnlIntBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkNrmAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountDrvWorkOvAccountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoDormantAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoNrmAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoOvAccrualAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanAccountInfoPositiveAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLoanParametersWordExtraitPrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLoanProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovedCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMovedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrLoanLstPrintTransDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrLoanNxtPrintTransDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTotIssPremIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTrxCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUrlDefTotalIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutUrlTotalIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Q11111111111111outAuthLoanTrxRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Q11111111111111outAuthLoanTrxRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanAccExtrait" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0407VOutGrpLoanAccExtraitItem" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0407VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0407VLoanAccountExtraitExport", propOrder = {
    "outAuthName1CharSuppliedChar80",
    "outAuthName2CharSuppliedChar80",
    "outBaseCurrencyIdCurrency",
    "outBaseIefSuppliedAmount",
    "outBenefCardCustCardInfoCardNo",
    "outBenefCustomerCustId",
    "outBenefCustomerShortName",
    "outBenefNameListSetDescription",
    "outLoanAccountAccCd",
    "outLoanAccountAccLimitAmn",
    "outLoanAccountAccSn",
    "outLoanAccountAccStatus",
    "outLoanAccountAccType",
    "outLoanAccountCusStmLstTrnDt",
    "outLoanAccountCusStmNxtTrnDt",
    "outLoanAccountLoanStatus",
    "outLoanAccountNrmAcrIntBal",
    "outLoanAccountNrmCapBal",
    "outLoanAccountNrmComBal",
    "outLoanAccountNrmExpBal",
    "outLoanAccountNrmRlIntBal",
    "outLoanAccountNrmSubsidyBal",
    "outLoanAccountNrmUrlIntBal",
    "outLoanAccountOldAccountCd",
    "outLoanAccountOldAccountNum",
    "outLoanAccountOvAcrNrmIntBal",
    "outLoanAccountOvAcrPnlIntBal",
    "outLoanAccountOvCapBal",
    "outLoanAccountOvComBal",
    "outLoanAccountOvExpBal",
    "outLoanAccountOvRlNrmIntBal",
    "outLoanAccountOvRlPnlIntBal",
    "outLoanAccountOvSubsidyBal",
    "outLoanAccountOvUrlNrmIntBal",
    "outLoanAccountOvUrlPnlIntBal",
    "outLoanAccountDrvWorkAccountBal",
    "outLoanAccountDrvWorkNrmAccountBal",
    "outLoanAccountDrvWorkOvAccountBal",
    "outLoanAccountInfoDormantAmn",
    "outLoanAccountInfoNrmAccrualAmn",
    "outLoanAccountInfoOvAccrualAmn",
    "outLoanAccountInfoPositiveAmn",
    "outLoanParametersWordExtraitPrint",
    "outLoanProductDescription",
    "outLoanProductIdProduct",
    "outMovedCurrencyDisplayedDecimalPlaces",
    "outMovedCurrencyIdCurrency",
    "outMovedCurrencyShortDescr",
    "outPrLoanLstPrintTransDt",
    "outPrLoanNxtPrintTransDt",
    "outTotIssPremIefSuppliedNumber152",
    "outTrxCurrencyIdCurrency",
    "outTrxCurrencyShortDescr",
    "outUrlDefTotalIefSuppliedNumber152",
    "outUrlTotalIefSuppliedNumber152",
    "q11111111111111OutAuthLoanTrxRecordingAuthorizer1",
    "q11111111111111OutAuthLoanTrxRecordingAuthorizer2",
    "outGrpLoanAccExtrait",
    "outGrpLog",
    "isMore"
})
public class L0407VLoanAccountExtraitExport
    extends BaseExport
{

    @XmlElement(name = "OutAuthName1CharSuppliedChar80")
    protected String outAuthName1CharSuppliedChar80;
    @XmlElement(name = "OutAuthName2CharSuppliedChar80")
    protected String outAuthName2CharSuppliedChar80;
    @XmlElement(name = "OutBaseCurrencyIdCurrency")
    protected int outBaseCurrencyIdCurrency;
    @XmlElement(name = "OutBaseIefSuppliedAmount", required = true)
    protected BigDecimal outBaseIefSuppliedAmount;
    @XmlElement(name = "OutBenefCardCustCardInfoCardNo")
    protected String outBenefCardCustCardInfoCardNo;
    @XmlElement(name = "OutBenefCustomerCustId")
    protected int outBenefCustomerCustId;
    @XmlElement(name = "OutBenefCustomerShortName")
    protected String outBenefCustomerShortName;
    @XmlElement(name = "OutBenefNameListSetDescription")
    protected String outBenefNameListSetDescription;
    @XmlElement(name = "OutLoanAccountAccCd")
    protected short outLoanAccountAccCd;
    @XmlElement(name = "OutLoanAccountAccLimitAmn", required = true)
    protected BigDecimal outLoanAccountAccLimitAmn;
    @XmlElement(name = "OutLoanAccountAccSn")
    protected int outLoanAccountAccSn;
    @XmlElement(name = "OutLoanAccountAccStatus")
    protected String outLoanAccountAccStatus;
    @XmlElement(name = "OutLoanAccountAccType")
    protected short outLoanAccountAccType;
    @XmlElement(name = "OutLoanAccountCusStmLstTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCusStmLstTrnDt;
    @XmlElement(name = "OutLoanAccountCusStmNxtTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLoanAccountCusStmNxtTrnDt;
    @XmlElement(name = "OutLoanAccountLoanStatus")
    protected String outLoanAccountLoanStatus;
    @XmlElement(name = "OutLoanAccountNrmAcrIntBal", required = true)
    protected BigDecimal outLoanAccountNrmAcrIntBal;
    @XmlElement(name = "OutLoanAccountNrmCapBal", required = true)
    protected BigDecimal outLoanAccountNrmCapBal;
    @XmlElement(name = "OutLoanAccountNrmComBal", required = true)
    protected BigDecimal outLoanAccountNrmComBal;
    @XmlElement(name = "OutLoanAccountNrmExpBal", required = true)
    protected BigDecimal outLoanAccountNrmExpBal;
    @XmlElement(name = "OutLoanAccountNrmRlIntBal", required = true)
    protected BigDecimal outLoanAccountNrmRlIntBal;
    @XmlElement(name = "OutLoanAccountNrmSubsidyBal", required = true)
    protected BigDecimal outLoanAccountNrmSubsidyBal;
    @XmlElement(name = "OutLoanAccountNrmUrlIntBal", required = true)
    protected BigDecimal outLoanAccountNrmUrlIntBal;
    @XmlElement(name = "OutLoanAccountOldAccountCd")
    protected short outLoanAccountOldAccountCd;
    @XmlElement(name = "OutLoanAccountOldAccountNum")
    protected String outLoanAccountOldAccountNum;
    @XmlElement(name = "OutLoanAccountOvAcrNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvAcrNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvAcrPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvAcrPnlIntBal;
    @XmlElement(name = "OutLoanAccountOvCapBal", required = true)
    protected BigDecimal outLoanAccountOvCapBal;
    @XmlElement(name = "OutLoanAccountOvComBal", required = true)
    protected BigDecimal outLoanAccountOvComBal;
    @XmlElement(name = "OutLoanAccountOvExpBal", required = true)
    protected BigDecimal outLoanAccountOvExpBal;
    @XmlElement(name = "OutLoanAccountOvRlNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvRlNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvRlPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvRlPnlIntBal;
    @XmlElement(name = "OutLoanAccountOvSubsidyBal", required = true)
    protected BigDecimal outLoanAccountOvSubsidyBal;
    @XmlElement(name = "OutLoanAccountOvUrlNrmIntBal", required = true)
    protected BigDecimal outLoanAccountOvUrlNrmIntBal;
    @XmlElement(name = "OutLoanAccountOvUrlPnlIntBal", required = true)
    protected BigDecimal outLoanAccountOvUrlPnlIntBal;
    @XmlElement(name = "OutLoanAccountDrvWorkAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkNrmAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkNrmAccountBal;
    @XmlElement(name = "OutLoanAccountDrvWorkOvAccountBal", required = true)
    protected BigDecimal outLoanAccountDrvWorkOvAccountBal;
    @XmlElement(name = "OutLoanAccountInfoDormantAmn", required = true)
    protected BigDecimal outLoanAccountInfoDormantAmn;
    @XmlElement(name = "OutLoanAccountInfoNrmAccrualAmn", required = true)
    protected BigDecimal outLoanAccountInfoNrmAccrualAmn;
    @XmlElement(name = "OutLoanAccountInfoOvAccrualAmn", required = true)
    protected BigDecimal outLoanAccountInfoOvAccrualAmn;
    @XmlElement(name = "OutLoanAccountInfoPositiveAmn", required = true)
    protected BigDecimal outLoanAccountInfoPositiveAmn;
    @XmlElement(name = "OutLoanParametersWordExtraitPrint")
    protected String outLoanParametersWordExtraitPrint;
    @XmlElement(name = "OutLoanProductDescription")
    protected String outLoanProductDescription;
    @XmlElement(name = "OutLoanProductIdProduct")
    protected int outLoanProductIdProduct;
    @XmlElement(name = "OutMovedCurrencyDisplayedDecimalPlaces")
    protected short outMovedCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutMovedCurrencyIdCurrency")
    protected int outMovedCurrencyIdCurrency;
    @XmlElement(name = "OutMovedCurrencyShortDescr")
    protected String outMovedCurrencyShortDescr;
    @XmlElement(name = "OutPrLoanLstPrintTransDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrLoanLstPrintTransDt;
    @XmlElement(name = "OutPrLoanNxtPrintTransDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrLoanNxtPrintTransDt;
    @XmlElement(name = "OutTotIssPremIefSuppliedNumber152", required = true)
    protected BigDecimal outTotIssPremIefSuppliedNumber152;
    @XmlElement(name = "OutTrxCurrencyIdCurrency")
    protected int outTrxCurrencyIdCurrency;
    @XmlElement(name = "OutTrxCurrencyShortDescr")
    protected String outTrxCurrencyShortDescr;
    @XmlElement(name = "OutUrlDefTotalIefSuppliedNumber152", required = true)
    protected BigDecimal outUrlDefTotalIefSuppliedNumber152;
    @XmlElement(name = "OutUrlTotalIefSuppliedNumber152", required = true)
    protected BigDecimal outUrlTotalIefSuppliedNumber152;
    @XmlElement(name = "Q11111111111111outAuthLoanTrxRecordingAuthorizer1")
    protected String q11111111111111OutAuthLoanTrxRecordingAuthorizer1;
    @XmlElement(name = "Q11111111111111outAuthLoanTrxRecordingAuthorizer2")
    protected String q11111111111111OutAuthLoanTrxRecordingAuthorizer2;
    @XmlElement(name = "OutGrpLoanAccExtrait")
    protected ArrayOfL0407VOutGrpLoanAccExtraitItem outGrpLoanAccExtrait;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfL0407VOutGrpLogItem outGrpLog;
    @XmlElement(name = "IsMore")
    protected boolean isMore;

    /**
     * Gets the value of the outAuthName1CharSuppliedChar80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthName1CharSuppliedChar80() {
        return outAuthName1CharSuppliedChar80;
    }

    /**
     * Sets the value of the outAuthName1CharSuppliedChar80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthName1CharSuppliedChar80(String value) {
        this.outAuthName1CharSuppliedChar80 = value;
    }

    /**
     * Gets the value of the outAuthName2CharSuppliedChar80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthName2CharSuppliedChar80() {
        return outAuthName2CharSuppliedChar80;
    }

    /**
     * Sets the value of the outAuthName2CharSuppliedChar80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthName2CharSuppliedChar80(String value) {
        this.outAuthName2CharSuppliedChar80 = value;
    }

    /**
     * Gets the value of the outBaseCurrencyIdCurrency property.
     * 
     */
    public int getOutBaseCurrencyIdCurrency() {
        return outBaseCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outBaseCurrencyIdCurrency property.
     * 
     */
    public void setOutBaseCurrencyIdCurrency(int value) {
        this.outBaseCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outBaseIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBaseIefSuppliedAmount() {
        return outBaseIefSuppliedAmount;
    }

    /**
     * Sets the value of the outBaseIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBaseIefSuppliedAmount(BigDecimal value) {
        this.outBaseIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outBenefCardCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCardCustCardInfoCardNo() {
        return outBenefCardCustCardInfoCardNo;
    }

    /**
     * Sets the value of the outBenefCardCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCardCustCardInfoCardNo(String value) {
        this.outBenefCardCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the outBenefCustomerCustId property.
     * 
     */
    public int getOutBenefCustomerCustId() {
        return outBenefCustomerCustId;
    }

    /**
     * Sets the value of the outBenefCustomerCustId property.
     * 
     */
    public void setOutBenefCustomerCustId(int value) {
        this.outBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the outBenefCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefCustomerShortName() {
        return outBenefCustomerShortName;
    }

    /**
     * Sets the value of the outBenefCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefCustomerShortName(String value) {
        this.outBenefCustomerShortName = value;
    }

    /**
     * Gets the value of the outBenefNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefNameListSetDescription() {
        return outBenefNameListSetDescription;
    }

    /**
     * Sets the value of the outBenefNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefNameListSetDescription(String value) {
        this.outBenefNameListSetDescription = value;
    }

    /**
     * Gets the value of the outLoanAccountAccCd property.
     * 
     */
    public short getOutLoanAccountAccCd() {
        return outLoanAccountAccCd;
    }

    /**
     * Sets the value of the outLoanAccountAccCd property.
     * 
     */
    public void setOutLoanAccountAccCd(short value) {
        this.outLoanAccountAccCd = value;
    }

    /**
     * Gets the value of the outLoanAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountAccLimitAmn() {
        return outLoanAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outLoanAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountAccLimitAmn(BigDecimal value) {
        this.outLoanAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountAccSn property.
     * 
     */
    public int getOutLoanAccountAccSn() {
        return outLoanAccountAccSn;
    }

    /**
     * Sets the value of the outLoanAccountAccSn property.
     * 
     */
    public void setOutLoanAccountAccSn(int value) {
        this.outLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outLoanAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountAccStatus() {
        return outLoanAccountAccStatus;
    }

    /**
     * Sets the value of the outLoanAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountAccStatus(String value) {
        this.outLoanAccountAccStatus = value;
    }

    /**
     * Gets the value of the outLoanAccountAccType property.
     * 
     */
    public short getOutLoanAccountAccType() {
        return outLoanAccountAccType;
    }

    /**
     * Sets the value of the outLoanAccountAccType property.
     * 
     */
    public void setOutLoanAccountAccType(short value) {
        this.outLoanAccountAccType = value;
    }

    /**
     * Gets the value of the outLoanAccountCusStmLstTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCusStmLstTrnDt() {
        return outLoanAccountCusStmLstTrnDt;
    }

    /**
     * Sets the value of the outLoanAccountCusStmLstTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCusStmLstTrnDt(XMLGregorianCalendar value) {
        this.outLoanAccountCusStmLstTrnDt = value;
    }

    /**
     * Gets the value of the outLoanAccountCusStmNxtTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLoanAccountCusStmNxtTrnDt() {
        return outLoanAccountCusStmNxtTrnDt;
    }

    /**
     * Sets the value of the outLoanAccountCusStmNxtTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLoanAccountCusStmNxtTrnDt(XMLGregorianCalendar value) {
        this.outLoanAccountCusStmNxtTrnDt = value;
    }

    /**
     * Gets the value of the outLoanAccountLoanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountLoanStatus() {
        return outLoanAccountLoanStatus;
    }

    /**
     * Sets the value of the outLoanAccountLoanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountLoanStatus(String value) {
        this.outLoanAccountLoanStatus = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmAcrIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmAcrIntBal() {
        return outLoanAccountNrmAcrIntBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmAcrIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmAcrIntBal(BigDecimal value) {
        this.outLoanAccountNrmAcrIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmCapBal() {
        return outLoanAccountNrmCapBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmCapBal(BigDecimal value) {
        this.outLoanAccountNrmCapBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmComBal() {
        return outLoanAccountNrmComBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmComBal(BigDecimal value) {
        this.outLoanAccountNrmComBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmExpBal() {
        return outLoanAccountNrmExpBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmExpBal(BigDecimal value) {
        this.outLoanAccountNrmExpBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmRlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmRlIntBal() {
        return outLoanAccountNrmRlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmRlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmRlIntBal(BigDecimal value) {
        this.outLoanAccountNrmRlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmSubsidyBal() {
        return outLoanAccountNrmSubsidyBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmSubsidyBal(BigDecimal value) {
        this.outLoanAccountNrmSubsidyBal = value;
    }

    /**
     * Gets the value of the outLoanAccountNrmUrlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountNrmUrlIntBal() {
        return outLoanAccountNrmUrlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountNrmUrlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountNrmUrlIntBal(BigDecimal value) {
        this.outLoanAccountNrmUrlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOldAccountCd property.
     * 
     */
    public short getOutLoanAccountOldAccountCd() {
        return outLoanAccountOldAccountCd;
    }

    /**
     * Sets the value of the outLoanAccountOldAccountCd property.
     * 
     */
    public void setOutLoanAccountOldAccountCd(short value) {
        this.outLoanAccountOldAccountCd = value;
    }

    /**
     * Gets the value of the outLoanAccountOldAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanAccountOldAccountNum() {
        return outLoanAccountOldAccountNum;
    }

    /**
     * Sets the value of the outLoanAccountOldAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanAccountOldAccountNum(String value) {
        this.outLoanAccountOldAccountNum = value;
    }

    /**
     * Gets the value of the outLoanAccountOvAcrNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvAcrNrmIntBal() {
        return outLoanAccountOvAcrNrmIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvAcrNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvAcrNrmIntBal(BigDecimal value) {
        this.outLoanAccountOvAcrNrmIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvAcrPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvAcrPnlIntBal() {
        return outLoanAccountOvAcrPnlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvAcrPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvAcrPnlIntBal(BigDecimal value) {
        this.outLoanAccountOvAcrPnlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvCapBal() {
        return outLoanAccountOvCapBal;
    }

    /**
     * Sets the value of the outLoanAccountOvCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvCapBal(BigDecimal value) {
        this.outLoanAccountOvCapBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvComBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvComBal() {
        return outLoanAccountOvComBal;
    }

    /**
     * Sets the value of the outLoanAccountOvComBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvComBal(BigDecimal value) {
        this.outLoanAccountOvComBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvExpBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvExpBal() {
        return outLoanAccountOvExpBal;
    }

    /**
     * Sets the value of the outLoanAccountOvExpBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvExpBal(BigDecimal value) {
        this.outLoanAccountOvExpBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvRlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvRlNrmIntBal() {
        return outLoanAccountOvRlNrmIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvRlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvRlNrmIntBal(BigDecimal value) {
        this.outLoanAccountOvRlNrmIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvRlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvRlPnlIntBal() {
        return outLoanAccountOvRlPnlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvRlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvRlPnlIntBal(BigDecimal value) {
        this.outLoanAccountOvRlPnlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvSubsidyBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvSubsidyBal() {
        return outLoanAccountOvSubsidyBal;
    }

    /**
     * Sets the value of the outLoanAccountOvSubsidyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvSubsidyBal(BigDecimal value) {
        this.outLoanAccountOvSubsidyBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvUrlNrmIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvUrlNrmIntBal() {
        return outLoanAccountOvUrlNrmIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvUrlNrmIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvUrlNrmIntBal(BigDecimal value) {
        this.outLoanAccountOvUrlNrmIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountOvUrlPnlIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountOvUrlPnlIntBal() {
        return outLoanAccountOvUrlPnlIntBal;
    }

    /**
     * Sets the value of the outLoanAccountOvUrlPnlIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountOvUrlPnlIntBal(BigDecimal value) {
        this.outLoanAccountOvUrlPnlIntBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkAccountBal() {
        return outLoanAccountDrvWorkAccountBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkAccountBal(BigDecimal value) {
        this.outLoanAccountDrvWorkAccountBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkNrmAccountBal() {
        return outLoanAccountDrvWorkNrmAccountBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkNrmAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkNrmAccountBal(BigDecimal value) {
        this.outLoanAccountDrvWorkNrmAccountBal = value;
    }

    /**
     * Gets the value of the outLoanAccountDrvWorkOvAccountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountDrvWorkOvAccountBal() {
        return outLoanAccountDrvWorkOvAccountBal;
    }

    /**
     * Sets the value of the outLoanAccountDrvWorkOvAccountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountDrvWorkOvAccountBal(BigDecimal value) {
        this.outLoanAccountDrvWorkOvAccountBal = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoDormantAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoDormantAmn() {
        return outLoanAccountInfoDormantAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoDormantAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoDormantAmn(BigDecimal value) {
        this.outLoanAccountInfoDormantAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoNrmAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoNrmAccrualAmn() {
        return outLoanAccountInfoNrmAccrualAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoNrmAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoNrmAccrualAmn(BigDecimal value) {
        this.outLoanAccountInfoNrmAccrualAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoOvAccrualAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoOvAccrualAmn() {
        return outLoanAccountInfoOvAccrualAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoOvAccrualAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoOvAccrualAmn(BigDecimal value) {
        this.outLoanAccountInfoOvAccrualAmn = value;
    }

    /**
     * Gets the value of the outLoanAccountInfoPositiveAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLoanAccountInfoPositiveAmn() {
        return outLoanAccountInfoPositiveAmn;
    }

    /**
     * Sets the value of the outLoanAccountInfoPositiveAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLoanAccountInfoPositiveAmn(BigDecimal value) {
        this.outLoanAccountInfoPositiveAmn = value;
    }

    /**
     * Gets the value of the outLoanParametersWordExtraitPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanParametersWordExtraitPrint() {
        return outLoanParametersWordExtraitPrint;
    }

    /**
     * Sets the value of the outLoanParametersWordExtraitPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanParametersWordExtraitPrint(String value) {
        this.outLoanParametersWordExtraitPrint = value;
    }

    /**
     * Gets the value of the outLoanProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLoanProductDescription() {
        return outLoanProductDescription;
    }

    /**
     * Sets the value of the outLoanProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLoanProductDescription(String value) {
        this.outLoanProductDescription = value;
    }

    /**
     * Gets the value of the outLoanProductIdProduct property.
     * 
     */
    public int getOutLoanProductIdProduct() {
        return outLoanProductIdProduct;
    }

    /**
     * Sets the value of the outLoanProductIdProduct property.
     * 
     */
    public void setOutLoanProductIdProduct(int value) {
        this.outLoanProductIdProduct = value;
    }

    /**
     * Gets the value of the outMovedCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutMovedCurrencyDisplayedDecimalPlaces() {
        return outMovedCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outMovedCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutMovedCurrencyDisplayedDecimalPlaces(short value) {
        this.outMovedCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outMovedCurrencyIdCurrency property.
     * 
     */
    public int getOutMovedCurrencyIdCurrency() {
        return outMovedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovedCurrencyIdCurrency property.
     * 
     */
    public void setOutMovedCurrencyIdCurrency(int value) {
        this.outMovedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovedCurrencyShortDescr() {
        return outMovedCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovedCurrencyShortDescr(String value) {
        this.outMovedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outPrLoanLstPrintTransDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrLoanLstPrintTransDt() {
        return outPrLoanLstPrintTransDt;
    }

    /**
     * Sets the value of the outPrLoanLstPrintTransDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrLoanLstPrintTransDt(XMLGregorianCalendar value) {
        this.outPrLoanLstPrintTransDt = value;
    }

    /**
     * Gets the value of the outPrLoanNxtPrintTransDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrLoanNxtPrintTransDt() {
        return outPrLoanNxtPrintTransDt;
    }

    /**
     * Sets the value of the outPrLoanNxtPrintTransDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrLoanNxtPrintTransDt(XMLGregorianCalendar value) {
        this.outPrLoanNxtPrintTransDt = value;
    }

    /**
     * Gets the value of the outTotIssPremIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotIssPremIefSuppliedNumber152() {
        return outTotIssPremIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotIssPremIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotIssPremIefSuppliedNumber152(BigDecimal value) {
        this.outTotIssPremIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTrxCurrencyIdCurrency property.
     * 
     */
    public int getOutTrxCurrencyIdCurrency() {
        return outTrxCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outTrxCurrencyIdCurrency property.
     * 
     */
    public void setOutTrxCurrencyIdCurrency(int value) {
        this.outTrxCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outTrxCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTrxCurrencyShortDescr() {
        return outTrxCurrencyShortDescr;
    }

    /**
     * Sets the value of the outTrxCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTrxCurrencyShortDescr(String value) {
        this.outTrxCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outUrlDefTotalIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutUrlDefTotalIefSuppliedNumber152() {
        return outUrlDefTotalIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outUrlDefTotalIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutUrlDefTotalIefSuppliedNumber152(BigDecimal value) {
        this.outUrlDefTotalIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outUrlTotalIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutUrlTotalIefSuppliedNumber152() {
        return outUrlTotalIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outUrlTotalIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutUrlTotalIefSuppliedNumber152(BigDecimal value) {
        this.outUrlTotalIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the q11111111111111OutAuthLoanTrxRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ11111111111111OutAuthLoanTrxRecordingAuthorizer1() {
        return q11111111111111OutAuthLoanTrxRecordingAuthorizer1;
    }

    /**
     * Sets the value of the q11111111111111OutAuthLoanTrxRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ11111111111111OutAuthLoanTrxRecordingAuthorizer1(String value) {
        this.q11111111111111OutAuthLoanTrxRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the q11111111111111OutAuthLoanTrxRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ11111111111111OutAuthLoanTrxRecordingAuthorizer2() {
        return q11111111111111OutAuthLoanTrxRecordingAuthorizer2;
    }

    /**
     * Sets the value of the q11111111111111OutAuthLoanTrxRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ11111111111111OutAuthLoanTrxRecordingAuthorizer2(String value) {
        this.q11111111111111OutAuthLoanTrxRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the outGrpLoanAccExtrait property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0407VOutGrpLoanAccExtraitItem }
     *     
     */
    public ArrayOfL0407VOutGrpLoanAccExtraitItem getOutGrpLoanAccExtrait() {
        return outGrpLoanAccExtrait;
    }

    /**
     * Sets the value of the outGrpLoanAccExtrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0407VOutGrpLoanAccExtraitItem }
     *     
     */
    public void setOutGrpLoanAccExtrait(ArrayOfL0407VOutGrpLoanAccExtraitItem value) {
        this.outGrpLoanAccExtrait = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0407VOutGrpLogItem }
     *     
     */
    public ArrayOfL0407VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0407VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfL0407VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the isMore property.
     * 
     */
    public boolean isIsMore() {
        return isMore;
    }

    /**
     * Sets the value of the isMore property.
     * 
     */
    public void setIsMore(boolean value) {
        this.isMore = value;
    }

}
