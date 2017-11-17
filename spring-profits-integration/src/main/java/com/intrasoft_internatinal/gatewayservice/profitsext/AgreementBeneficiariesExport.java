
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgreementBeneficiariesExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementBeneficiariesExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAddressCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBenefAgreementBenefBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefAgreementBenefMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBenefAgreementBenefRemovalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBenefAgreementBenefTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBenefListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutEvalResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvalResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInsertedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInsertedCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutAgreementBeneficiaryItem" minOccurs="0"/>
 *         &lt;element name="NotFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "AgreementBeneficiariesExport", propOrder = {
    "outAddressCustomerCustId",
    "outAgreementAccKind",
    "outAgreementAgrStatus",
    "outAgreementTmstamp",
    "outBenefAgreementBenefBenefStatus",
    "outBenefAgreementBenefMainBenefFlg",
    "outBenefAgreementBenefRemovalDt",
    "outBenefAgreementBenefTmstamp",
    "outBenefListSetDescription",
    "outCustAddressSerialNum",
    "outEvalResultTeamInformationAuthorizationType",
    "outEvalResultTeamInformationEvaluationResult",
    "outEvalResultTeamInformationRequiredProfile1",
    "outEvalResultTeamInformationRequiredProfile2",
    "outInsertedCustomerCustId",
    "outInsertedCustomerShortName",
    "outProductIdProduct",
    "outListGrp",
    "notFound",
    "isMore"
})
public class AgreementBeneficiariesExport
    extends BaseExport
{

    @XmlElement(name = "OutAddressCustomerCustId")
    protected int outAddressCustomerCustId;
    @XmlElement(name = "OutAgreementAccKind")
    protected String outAgreementAccKind;
    @XmlElement(name = "OutAgreementAgrStatus")
    protected String outAgreementAgrStatus;
    @XmlElement(name = "OutAgreementTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementTmstamp;
    @XmlElement(name = "OutBenefAgreementBenefBenefStatus")
    protected String outBenefAgreementBenefBenefStatus;
    @XmlElement(name = "OutBenefAgreementBenefMainBenefFlg")
    protected String outBenefAgreementBenefMainBenefFlg;
    @XmlElement(name = "OutBenefAgreementBenefRemovalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBenefAgreementBenefRemovalDt;
    @XmlElement(name = "OutBenefAgreementBenefTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBenefAgreementBenefTmstamp;
    @XmlElement(name = "OutBenefListSetDescription")
    protected String outBenefListSetDescription;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutEvalResultTeamInformationAuthorizationType")
    protected String outEvalResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvalResultTeamInformationEvaluationResult")
    protected String outEvalResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile1")
    protected String outEvalResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvalResultTeamInformationRequiredProfile2")
    protected String outEvalResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutInsertedCustomerCustId")
    protected int outInsertedCustomerCustId;
    @XmlElement(name = "OutInsertedCustomerShortName")
    protected String outInsertedCustomerShortName;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutListGrp")
    protected ArrayOfOutAgreementBeneficiaryItem outListGrp;
    @XmlElement(name = "NotFound")
    protected boolean notFound;
    @XmlElement(name = "IsMore")
    protected boolean isMore;

    /**
     * Gets the value of the outAddressCustomerCustId property.
     * 
     */
    public int getOutAddressCustomerCustId() {
        return outAddressCustomerCustId;
    }

    /**
     * Sets the value of the outAddressCustomerCustId property.
     * 
     */
    public void setOutAddressCustomerCustId(int value) {
        this.outAddressCustomerCustId = value;
    }

    /**
     * Gets the value of the outAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAccKind() {
        return outAgreementAccKind;
    }

    /**
     * Sets the value of the outAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAccKind(String value) {
        this.outAgreementAccKind = value;
    }

    /**
     * Gets the value of the outAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrStatus() {
        return outAgreementAgrStatus;
    }

    /**
     * Sets the value of the outAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrStatus(String value) {
        this.outAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the outAgreementTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementTmstamp() {
        return outAgreementTmstamp;
    }

    /**
     * Sets the value of the outAgreementTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementTmstamp(XMLGregorianCalendar value) {
        this.outAgreementTmstamp = value;
    }

    /**
     * Gets the value of the outBenefAgreementBenefBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefAgreementBenefBenefStatus() {
        return outBenefAgreementBenefBenefStatus;
    }

    /**
     * Sets the value of the outBenefAgreementBenefBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefAgreementBenefBenefStatus(String value) {
        this.outBenefAgreementBenefBenefStatus = value;
    }

    /**
     * Gets the value of the outBenefAgreementBenefMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefAgreementBenefMainBenefFlg() {
        return outBenefAgreementBenefMainBenefFlg;
    }

    /**
     * Sets the value of the outBenefAgreementBenefMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefAgreementBenefMainBenefFlg(String value) {
        this.outBenefAgreementBenefMainBenefFlg = value;
    }

    /**
     * Gets the value of the outBenefAgreementBenefRemovalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBenefAgreementBenefRemovalDt() {
        return outBenefAgreementBenefRemovalDt;
    }

    /**
     * Sets the value of the outBenefAgreementBenefRemovalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBenefAgreementBenefRemovalDt(XMLGregorianCalendar value) {
        this.outBenefAgreementBenefRemovalDt = value;
    }

    /**
     * Gets the value of the outBenefAgreementBenefTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBenefAgreementBenefTmstamp() {
        return outBenefAgreementBenefTmstamp;
    }

    /**
     * Sets the value of the outBenefAgreementBenefTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBenefAgreementBenefTmstamp(XMLGregorianCalendar value) {
        this.outBenefAgreementBenefTmstamp = value;
    }

    /**
     * Gets the value of the outBenefListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBenefListSetDescription() {
        return outBenefListSetDescription;
    }

    /**
     * Sets the value of the outBenefListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBenefListSetDescription(String value) {
        this.outBenefListSetDescription = value;
    }

    /**
     * Gets the value of the outCustAddressSerialNum property.
     * 
     */
    public short getOutCustAddressSerialNum() {
        return outCustAddressSerialNum;
    }

    /**
     * Sets the value of the outCustAddressSerialNum property.
     * 
     */
    public void setOutCustAddressSerialNum(short value) {
        this.outCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationAuthorizationType() {
        return outEvalResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationAuthorizationType(String value) {
        this.outEvalResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationEvaluationResult() {
        return outEvalResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationEvaluationResult(String value) {
        this.outEvalResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile1() {
        return outEvalResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile1(String value) {
        this.outEvalResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvalResultTeamInformationRequiredProfile2() {
        return outEvalResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvalResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvalResultTeamInformationRequiredProfile2(String value) {
        this.outEvalResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outInsertedCustomerCustId property.
     * 
     */
    public int getOutInsertedCustomerCustId() {
        return outInsertedCustomerCustId;
    }

    /**
     * Sets the value of the outInsertedCustomerCustId property.
     * 
     */
    public void setOutInsertedCustomerCustId(int value) {
        this.outInsertedCustomerCustId = value;
    }

    /**
     * Gets the value of the outInsertedCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInsertedCustomerShortName() {
        return outInsertedCustomerShortName;
    }

    /**
     * Sets the value of the outInsertedCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInsertedCustomerShortName(String value) {
        this.outInsertedCustomerShortName = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutAgreementBeneficiaryItem }
     *     
     */
    public ArrayOfOutAgreementBeneficiaryItem getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutAgreementBeneficiaryItem }
     *     
     */
    public void setOutListGrp(ArrayOfOutAgreementBeneficiaryItem value) {
        this.outListGrp = value;
    }

    /**
     * Gets the value of the notFound property.
     * 
     */
    public boolean isNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     * 
     */
    public void setNotFound(boolean value) {
        this.notFound = value;
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
