
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CI3496V_ProfitsOtpUserProcessExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_ProfitsOtpUserProcessExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutInfoOtpUserChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInfoOtpUserExtUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserExtKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserLstSystemDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoOtpUserLstTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoOtpUserLstKeyCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserLstKeyUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserUsrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserRegisterDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoOtpUserRegisterFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserRegisterEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserRegisterMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserRegisterFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserRegisterSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInfoOtpUserRegisterDob" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutInfoOtpUserRegisterUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutResultOtpUserLogLogAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpUserLogLogResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpUserLogLogErrorAb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultOtpWorkTrxSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_ProfitsOtpUserProcessExport", propOrder = {
    "outInfoOtpUserChannelId",
    "outInfoOtpUserExtUser",
    "outInfoOtpUserExtKey",
    "outInfoOtpUserLstSystemDt",
    "outInfoOtpUserLstTmstamp",
    "outInfoOtpUserLstKeyCreated",
    "outInfoOtpUserLstKeyUsed",
    "outInfoOtpUserUsrStatus",
    "outInfoOtpUserRegisterDt",
    "outInfoOtpUserRegisterFlg",
    "outInfoOtpUserRegisterEmail",
    "outInfoOtpUserRegisterMobile",
    "outInfoOtpUserRegisterFirstName",
    "outInfoOtpUserRegisterSurname",
    "outInfoOtpUserRegisterDob",
    "outInfoOtpUserRegisterUpdate",
    "outResultOtpUserLogLogAction",
    "outResultOtpUserLogLogResult",
    "outResultOtpUserLogLogErrorAb",
    "outResultOtpWorkTrxSuccess"
})
public class CI3496VProfitsOtpUserProcessExport
    extends BaseExport
{

    @XmlElement(name = "OutInfoOtpUserChannelId")
    protected int outInfoOtpUserChannelId;
    @XmlElement(name = "OutInfoOtpUserExtUser")
    protected String outInfoOtpUserExtUser;
    @XmlElement(name = "OutInfoOtpUserExtKey")
    protected String outInfoOtpUserExtKey;
    @XmlElement(name = "OutInfoOtpUserLstSystemDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoOtpUserLstSystemDt;
    @XmlElement(name = "OutInfoOtpUserLstTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoOtpUserLstTmstamp;
    @XmlElement(name = "OutInfoOtpUserLstKeyCreated")
    protected String outInfoOtpUserLstKeyCreated;
    @XmlElement(name = "OutInfoOtpUserLstKeyUsed")
    protected String outInfoOtpUserLstKeyUsed;
    @XmlElement(name = "OutInfoOtpUserUsrStatus")
    protected String outInfoOtpUserUsrStatus;
    @XmlElement(name = "OutInfoOtpUserRegisterDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoOtpUserRegisterDt;
    @XmlElement(name = "OutInfoOtpUserRegisterFlg")
    protected String outInfoOtpUserRegisterFlg;
    @XmlElement(name = "OutInfoOtpUserRegisterEmail")
    protected String outInfoOtpUserRegisterEmail;
    @XmlElement(name = "OutInfoOtpUserRegisterMobile")
    protected String outInfoOtpUserRegisterMobile;
    @XmlElement(name = "OutInfoOtpUserRegisterFirstName")
    protected String outInfoOtpUserRegisterFirstName;
    @XmlElement(name = "OutInfoOtpUserRegisterSurname")
    protected String outInfoOtpUserRegisterSurname;
    @XmlElement(name = "OutInfoOtpUserRegisterDob", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoOtpUserRegisterDob;
    @XmlElement(name = "OutInfoOtpUserRegisterUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outInfoOtpUserRegisterUpdate;
    @XmlElement(name = "OutResultOtpUserLogLogAction")
    protected String outResultOtpUserLogLogAction;
    @XmlElement(name = "OutResultOtpUserLogLogResult")
    protected String outResultOtpUserLogLogResult;
    @XmlElement(name = "OutResultOtpUserLogLogErrorAb")
    protected String outResultOtpUserLogLogErrorAb;
    @XmlElement(name = "OutResultOtpWorkTrxSuccess")
    protected String outResultOtpWorkTrxSuccess;

    /**
     * Gets the value of the outInfoOtpUserChannelId property.
     * 
     */
    public int getOutInfoOtpUserChannelId() {
        return outInfoOtpUserChannelId;
    }

    /**
     * Sets the value of the outInfoOtpUserChannelId property.
     * 
     */
    public void setOutInfoOtpUserChannelId(int value) {
        this.outInfoOtpUserChannelId = value;
    }

    /**
     * Gets the value of the outInfoOtpUserExtUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserExtUser() {
        return outInfoOtpUserExtUser;
    }

    /**
     * Sets the value of the outInfoOtpUserExtUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserExtUser(String value) {
        this.outInfoOtpUserExtUser = value;
    }

    /**
     * Gets the value of the outInfoOtpUserExtKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserExtKey() {
        return outInfoOtpUserExtKey;
    }

    /**
     * Sets the value of the outInfoOtpUserExtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserExtKey(String value) {
        this.outInfoOtpUserExtKey = value;
    }

    /**
     * Gets the value of the outInfoOtpUserLstSystemDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoOtpUserLstSystemDt() {
        return outInfoOtpUserLstSystemDt;
    }

    /**
     * Sets the value of the outInfoOtpUserLstSystemDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoOtpUserLstSystemDt(XMLGregorianCalendar value) {
        this.outInfoOtpUserLstSystemDt = value;
    }

    /**
     * Gets the value of the outInfoOtpUserLstTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoOtpUserLstTmstamp() {
        return outInfoOtpUserLstTmstamp;
    }

    /**
     * Sets the value of the outInfoOtpUserLstTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoOtpUserLstTmstamp(XMLGregorianCalendar value) {
        this.outInfoOtpUserLstTmstamp = value;
    }

    /**
     * Gets the value of the outInfoOtpUserLstKeyCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserLstKeyCreated() {
        return outInfoOtpUserLstKeyCreated;
    }

    /**
     * Sets the value of the outInfoOtpUserLstKeyCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserLstKeyCreated(String value) {
        this.outInfoOtpUserLstKeyCreated = value;
    }

    /**
     * Gets the value of the outInfoOtpUserLstKeyUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserLstKeyUsed() {
        return outInfoOtpUserLstKeyUsed;
    }

    /**
     * Sets the value of the outInfoOtpUserLstKeyUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserLstKeyUsed(String value) {
        this.outInfoOtpUserLstKeyUsed = value;
    }

    /**
     * Gets the value of the outInfoOtpUserUsrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserUsrStatus() {
        return outInfoOtpUserUsrStatus;
    }

    /**
     * Sets the value of the outInfoOtpUserUsrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserUsrStatus(String value) {
        this.outInfoOtpUserUsrStatus = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoOtpUserRegisterDt() {
        return outInfoOtpUserRegisterDt;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoOtpUserRegisterDt(XMLGregorianCalendar value) {
        this.outInfoOtpUserRegisterDt = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserRegisterFlg() {
        return outInfoOtpUserRegisterFlg;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserRegisterFlg(String value) {
        this.outInfoOtpUserRegisterFlg = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserRegisterEmail() {
        return outInfoOtpUserRegisterEmail;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserRegisterEmail(String value) {
        this.outInfoOtpUserRegisterEmail = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserRegisterMobile() {
        return outInfoOtpUserRegisterMobile;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserRegisterMobile(String value) {
        this.outInfoOtpUserRegisterMobile = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserRegisterFirstName() {
        return outInfoOtpUserRegisterFirstName;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserRegisterFirstName(String value) {
        this.outInfoOtpUserRegisterFirstName = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInfoOtpUserRegisterSurname() {
        return outInfoOtpUserRegisterSurname;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInfoOtpUserRegisterSurname(String value) {
        this.outInfoOtpUserRegisterSurname = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterDob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoOtpUserRegisterDob() {
        return outInfoOtpUserRegisterDob;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoOtpUserRegisterDob(XMLGregorianCalendar value) {
        this.outInfoOtpUserRegisterDob = value;
    }

    /**
     * Gets the value of the outInfoOtpUserRegisterUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutInfoOtpUserRegisterUpdate() {
        return outInfoOtpUserRegisterUpdate;
    }

    /**
     * Sets the value of the outInfoOtpUserRegisterUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutInfoOtpUserRegisterUpdate(XMLGregorianCalendar value) {
        this.outInfoOtpUserRegisterUpdate = value;
    }

    /**
     * Gets the value of the outResultOtpUserLogLogAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpUserLogLogAction() {
        return outResultOtpUserLogLogAction;
    }

    /**
     * Sets the value of the outResultOtpUserLogLogAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpUserLogLogAction(String value) {
        this.outResultOtpUserLogLogAction = value;
    }

    /**
     * Gets the value of the outResultOtpUserLogLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpUserLogLogResult() {
        return outResultOtpUserLogLogResult;
    }

    /**
     * Sets the value of the outResultOtpUserLogLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpUserLogLogResult(String value) {
        this.outResultOtpUserLogLogResult = value;
    }

    /**
     * Gets the value of the outResultOtpUserLogLogErrorAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpUserLogLogErrorAb() {
        return outResultOtpUserLogLogErrorAb;
    }

    /**
     * Sets the value of the outResultOtpUserLogLogErrorAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpUserLogLogErrorAb(String value) {
        this.outResultOtpUserLogLogErrorAb = value;
    }

    /**
     * Gets the value of the outResultOtpWorkTrxSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultOtpWorkTrxSuccess() {
        return outResultOtpWorkTrxSuccess;
    }

    /**
     * Sets the value of the outResultOtpWorkTrxSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultOtpWorkTrxSuccess(String value) {
        this.outResultOtpWorkTrxSuccess = value;
    }

}
