
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0494VMediatorsMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0494VMediatorsMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueLoanAddInfoAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueLoanAddInfoAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutContinueLoanAddInfoAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsMediatorAddInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLnsMediatorEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLnsMediatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMediatorProfGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMediatorProfGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMediatorProfGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMediatorProfGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutToContinueLnsMediatorAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0494VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpAccounts" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfL0494VOutGrpAccountsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0494VMediatorsMaintenanceExport", propOrder = {
    "outContinueLoanAddInfoAccSn",
    "outContinueLoanAddInfoAccType",
    "outContinueLoanAddInfoAccUnit",
    "outCustListSetDescription",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outLnsMediatorAddInfo",
    "outLnsMediatorAgreementNo",
    "outLnsMediatorEntryStatus",
    "outLnsMediatorName",
    "outMediatorProfGenericDetailDescription",
    "outMediatorProfGenericDetailParameterType",
    "outMediatorProfGenericDetailSerialNum",
    "outMediatorProfGenericDetailShortDescription",
    "outSelectedDepProfitsAccountAccountCd",
    "outSelectedDepProfitsAccountAccountNumber",
    "outToContinueLnsMediatorAgreementNo",
    "outGrp",
    "outGrpAccounts"
})
public class L0494VMediatorsMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueLoanAddInfoAccSn")
    protected double outContinueLoanAddInfoAccSn;
    @XmlElement(name = "OutContinueLoanAddInfoAccType")
    protected short outContinueLoanAddInfoAccType;
    @XmlElement(name = "OutContinueLoanAddInfoAccUnit")
    protected int outContinueLoanAddInfoAccUnit;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutLnsMediatorAddInfo")
    protected String outLnsMediatorAddInfo;
    @XmlElement(name = "OutLnsMediatorAgreementNo")
    protected int outLnsMediatorAgreementNo;
    @XmlElement(name = "OutLnsMediatorEntryStatus")
    protected String outLnsMediatorEntryStatus;
    @XmlElement(name = "OutLnsMediatorName")
    protected String outLnsMediatorName;
    @XmlElement(name = "OutMediatorProfGenericDetailDescription")
    protected String outMediatorProfGenericDetailDescription;
    @XmlElement(name = "OutMediatorProfGenericDetailParameterType")
    protected String outMediatorProfGenericDetailParameterType;
    @XmlElement(name = "OutMediatorProfGenericDetailSerialNum")
    protected int outMediatorProfGenericDetailSerialNum;
    @XmlElement(name = "OutMediatorProfGenericDetailShortDescription")
    protected String outMediatorProfGenericDetailShortDescription;
    @XmlElement(name = "OutSelectedDepProfitsAccountAccountCd")
    protected short outSelectedDepProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedDepProfitsAccountAccountNumber")
    protected String outSelectedDepProfitsAccountAccountNumber;
    @XmlElement(name = "OutToContinueLnsMediatorAgreementNo")
    protected int outToContinueLnsMediatorAgreementNo;
    @XmlElement(name = "OutGrp")
    protected ArrayOfL0494VOutGrpItem outGrp;
    @XmlElement(name = "OutGrpAccounts")
    protected ArrayOfL0494VOutGrpAccountsItem outGrpAccounts;

    /**
     * Gets the value of the outContinueLoanAddInfoAccSn property.
     * 
     */
    public double getOutContinueLoanAddInfoAccSn() {
        return outContinueLoanAddInfoAccSn;
    }

    /**
     * Sets the value of the outContinueLoanAddInfoAccSn property.
     * 
     */
    public void setOutContinueLoanAddInfoAccSn(double value) {
        this.outContinueLoanAddInfoAccSn = value;
    }

    /**
     * Gets the value of the outContinueLoanAddInfoAccType property.
     * 
     */
    public short getOutContinueLoanAddInfoAccType() {
        return outContinueLoanAddInfoAccType;
    }

    /**
     * Sets the value of the outContinueLoanAddInfoAccType property.
     * 
     */
    public void setOutContinueLoanAddInfoAccType(short value) {
        this.outContinueLoanAddInfoAccType = value;
    }

    /**
     * Gets the value of the outContinueLoanAddInfoAccUnit property.
     * 
     */
    public int getOutContinueLoanAddInfoAccUnit() {
        return outContinueLoanAddInfoAccUnit;
    }

    /**
     * Sets the value of the outContinueLoanAddInfoAccUnit property.
     * 
     */
    public void setOutContinueLoanAddInfoAccUnit(int value) {
        this.outContinueLoanAddInfoAccUnit = value;
    }

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outLnsMediatorAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsMediatorAddInfo() {
        return outLnsMediatorAddInfo;
    }

    /**
     * Sets the value of the outLnsMediatorAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsMediatorAddInfo(String value) {
        this.outLnsMediatorAddInfo = value;
    }

    /**
     * Gets the value of the outLnsMediatorAgreementNo property.
     * 
     */
    public int getOutLnsMediatorAgreementNo() {
        return outLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the outLnsMediatorAgreementNo property.
     * 
     */
    public void setOutLnsMediatorAgreementNo(int value) {
        this.outLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the outLnsMediatorEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsMediatorEntryStatus() {
        return outLnsMediatorEntryStatus;
    }

    /**
     * Sets the value of the outLnsMediatorEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsMediatorEntryStatus(String value) {
        this.outLnsMediatorEntryStatus = value;
    }

    /**
     * Gets the value of the outLnsMediatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLnsMediatorName() {
        return outLnsMediatorName;
    }

    /**
     * Sets the value of the outLnsMediatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLnsMediatorName(String value) {
        this.outLnsMediatorName = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMediatorProfGenericDetailDescription() {
        return outMediatorProfGenericDetailDescription;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMediatorProfGenericDetailDescription(String value) {
        this.outMediatorProfGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMediatorProfGenericDetailParameterType() {
        return outMediatorProfGenericDetailParameterType;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMediatorProfGenericDetailParameterType(String value) {
        this.outMediatorProfGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailSerialNum property.
     * 
     */
    public int getOutMediatorProfGenericDetailSerialNum() {
        return outMediatorProfGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailSerialNum property.
     * 
     */
    public void setOutMediatorProfGenericDetailSerialNum(int value) {
        this.outMediatorProfGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMediatorProfGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMediatorProfGenericDetailShortDescription() {
        return outMediatorProfGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outMediatorProfGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMediatorProfGenericDetailShortDescription(String value) {
        this.outMediatorProfGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedDepProfitsAccountAccountCd() {
        return outSelectedDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedDepProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedDepProfitsAccountAccountCd(short value) {
        this.outSelectedDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedDepProfitsAccountAccountNumber() {
        return outSelectedDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedDepProfitsAccountAccountNumber(String value) {
        this.outSelectedDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outToContinueLnsMediatorAgreementNo property.
     * 
     */
    public int getOutToContinueLnsMediatorAgreementNo() {
        return outToContinueLnsMediatorAgreementNo;
    }

    /**
     * Sets the value of the outToContinueLnsMediatorAgreementNo property.
     * 
     */
    public void setOutToContinueLnsMediatorAgreementNo(int value) {
        this.outToContinueLnsMediatorAgreementNo = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0494VOutGrpItem }
     *     
     */
    public ArrayOfL0494VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0494VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfL0494VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfL0494VOutGrpAccountsItem }
     *     
     */
    public ArrayOfL0494VOutGrpAccountsItem getOutGrpAccounts() {
        return outGrpAccounts;
    }

    /**
     * Sets the value of the outGrpAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfL0494VOutGrpAccountsItem }
     *     
     */
    public void setOutGrpAccounts(ArrayOfL0494VOutGrpAccountsItem value) {
        this.outGrpAccounts = value;
    }

}
