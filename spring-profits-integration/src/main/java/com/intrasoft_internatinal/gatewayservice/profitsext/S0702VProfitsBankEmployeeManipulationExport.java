
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for S0702VProfitsBankEmployeeManipulationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S0702VProfitsBankEmployeeManipulationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutBankemployeeCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeEmplStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeSignatureLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeStaffNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBankemployeeTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBankemployeeWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCodeBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGradeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGradeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPositionGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPositionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfS0702VOutGrpLogItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S0702VProfitsBankEmployeeManipulationExport", propOrder = {
    "outBankemployeeCardId",
    "outBankemployeeEmail",
    "outBankemployeeEmplStatus",
    "outBankemployeeFatherName",
    "outBankemployeeFirstName",
    "outBankemployeeLastName",
    "outBankemployeeMobilePhone",
    "outBankemployeeSex",
    "outBankemployeeSignatureLevel",
    "outBankemployeeStaffNo",
    "outBankemployeeTmstamp",
    "outBankemployeeWorkPhone",
    "outCodeBankemployeeId",
    "outGradeGenericDetailDescription",
    "outGradeGenericDetailSerialNum",
    "outPositionGenericDetailDescription",
    "outPositionGenericDetailSerialNum",
    "outGrpLog"
})
public class S0702VProfitsBankEmployeeManipulationExport
    extends BaseExport
{

    @XmlElement(name = "OutBankemployeeCardId")
    protected String outBankemployeeCardId;
    @XmlElement(name = "OutBankemployeeEmail")
    protected String outBankemployeeEmail;
    @XmlElement(name = "OutBankemployeeEmplStatus")
    protected String outBankemployeeEmplStatus;
    @XmlElement(name = "OutBankemployeeFatherName")
    protected String outBankemployeeFatherName;
    @XmlElement(name = "OutBankemployeeFirstName")
    protected String outBankemployeeFirstName;
    @XmlElement(name = "OutBankemployeeLastName")
    protected String outBankemployeeLastName;
    @XmlElement(name = "OutBankemployeeMobilePhone")
    protected String outBankemployeeMobilePhone;
    @XmlElement(name = "OutBankemployeeSex")
    protected String outBankemployeeSex;
    @XmlElement(name = "OutBankemployeeSignatureLevel")
    protected String outBankemployeeSignatureLevel;
    @XmlElement(name = "OutBankemployeeStaffNo")
    protected String outBankemployeeStaffNo;
    @XmlElement(name = "OutBankemployeeTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBankemployeeTmstamp;
    @XmlElement(name = "OutBankemployeeWorkPhone")
    protected String outBankemployeeWorkPhone;
    @XmlElement(name = "OutCodeBankemployeeId")
    protected String outCodeBankemployeeId;
    @XmlElement(name = "OutGradeGenericDetailDescription")
    protected String outGradeGenericDetailDescription;
    @XmlElement(name = "OutGradeGenericDetailSerialNum")
    protected int outGradeGenericDetailSerialNum;
    @XmlElement(name = "OutPositionGenericDetailDescription")
    protected String outPositionGenericDetailDescription;
    @XmlElement(name = "OutPositionGenericDetailSerialNum")
    protected int outPositionGenericDetailSerialNum;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfS0702VOutGrpLogItem outGrpLog;

    /**
     * Gets the value of the outBankemployeeCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeCardId() {
        return outBankemployeeCardId;
    }

    /**
     * Sets the value of the outBankemployeeCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeCardId(String value) {
        this.outBankemployeeCardId = value;
    }

    /**
     * Gets the value of the outBankemployeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeEmail() {
        return outBankemployeeEmail;
    }

    /**
     * Sets the value of the outBankemployeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeEmail(String value) {
        this.outBankemployeeEmail = value;
    }

    /**
     * Gets the value of the outBankemployeeEmplStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeEmplStatus() {
        return outBankemployeeEmplStatus;
    }

    /**
     * Sets the value of the outBankemployeeEmplStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeEmplStatus(String value) {
        this.outBankemployeeEmplStatus = value;
    }

    /**
     * Gets the value of the outBankemployeeFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeFatherName() {
        return outBankemployeeFatherName;
    }

    /**
     * Sets the value of the outBankemployeeFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeFatherName(String value) {
        this.outBankemployeeFatherName = value;
    }

    /**
     * Gets the value of the outBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeFirstName() {
        return outBankemployeeFirstName;
    }

    /**
     * Sets the value of the outBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeFirstName(String value) {
        this.outBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeLastName() {
        return outBankemployeeLastName;
    }

    /**
     * Sets the value of the outBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeLastName(String value) {
        this.outBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outBankemployeeMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeMobilePhone() {
        return outBankemployeeMobilePhone;
    }

    /**
     * Sets the value of the outBankemployeeMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeMobilePhone(String value) {
        this.outBankemployeeMobilePhone = value;
    }

    /**
     * Gets the value of the outBankemployeeSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeSex() {
        return outBankemployeeSex;
    }

    /**
     * Sets the value of the outBankemployeeSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeSex(String value) {
        this.outBankemployeeSex = value;
    }

    /**
     * Gets the value of the outBankemployeeSignatureLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeSignatureLevel() {
        return outBankemployeeSignatureLevel;
    }

    /**
     * Sets the value of the outBankemployeeSignatureLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeSignatureLevel(String value) {
        this.outBankemployeeSignatureLevel = value;
    }

    /**
     * Gets the value of the outBankemployeeStaffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeStaffNo() {
        return outBankemployeeStaffNo;
    }

    /**
     * Sets the value of the outBankemployeeStaffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeStaffNo(String value) {
        this.outBankemployeeStaffNo = value;
    }

    /**
     * Gets the value of the outBankemployeeTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBankemployeeTmstamp() {
        return outBankemployeeTmstamp;
    }

    /**
     * Sets the value of the outBankemployeeTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBankemployeeTmstamp(XMLGregorianCalendar value) {
        this.outBankemployeeTmstamp = value;
    }

    /**
     * Gets the value of the outBankemployeeWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBankemployeeWorkPhone() {
        return outBankemployeeWorkPhone;
    }

    /**
     * Sets the value of the outBankemployeeWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBankemployeeWorkPhone(String value) {
        this.outBankemployeeWorkPhone = value;
    }

    /**
     * Gets the value of the outCodeBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCodeBankemployeeId() {
        return outCodeBankemployeeId;
    }

    /**
     * Sets the value of the outCodeBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCodeBankemployeeId(String value) {
        this.outCodeBankemployeeId = value;
    }

    /**
     * Gets the value of the outGradeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGradeGenericDetailDescription() {
        return outGradeGenericDetailDescription;
    }

    /**
     * Sets the value of the outGradeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGradeGenericDetailDescription(String value) {
        this.outGradeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGradeGenericDetailSerialNum property.
     * 
     */
    public int getOutGradeGenericDetailSerialNum() {
        return outGradeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGradeGenericDetailSerialNum property.
     * 
     */
    public void setOutGradeGenericDetailSerialNum(int value) {
        this.outGradeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outPositionGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPositionGenericDetailDescription() {
        return outPositionGenericDetailDescription;
    }

    /**
     * Sets the value of the outPositionGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPositionGenericDetailDescription(String value) {
        this.outPositionGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outPositionGenericDetailSerialNum property.
     * 
     */
    public int getOutPositionGenericDetailSerialNum() {
        return outPositionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outPositionGenericDetailSerialNum property.
     * 
     */
    public void setOutPositionGenericDetailSerialNum(int value) {
        this.outPositionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfS0702VOutGrpLogItem }
     *     
     */
    public ArrayOfS0702VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfS0702VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfS0702VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

}
