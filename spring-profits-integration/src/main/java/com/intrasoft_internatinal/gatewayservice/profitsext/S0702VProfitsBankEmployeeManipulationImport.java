
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for S0702VProfitsBankEmployeeManipulationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S0702VProfitsBankEmployeeManipulationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeSignatureLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeStaffNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBankemployeeTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBankemployeeWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCodeBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCodeGradeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCodePositionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S0702VProfitsBankEmployeeManipulationImport", propOrder = {
    "command",
    "inBankemployeeCardId",
    "inBankemployeeEmail",
    "inBankemployeeFatherName",
    "inBankemployeeFirstName",
    "inBankemployeeId",
    "inBankemployeeLastName",
    "inBankemployeeMobilePhone",
    "inBankemployeeSex",
    "inBankemployeeSignatureLevel",
    "inBankemployeeStaffNo",
    "inBankemployeeTmstamp",
    "inBankemployeeWorkPhone",
    "inCodeBankemployeeId",
    "inCodeGradeGenericDetailSerialNum",
    "inCodePositionGenericDetailSerialNum",
    "inIefSuppliedFlag",
    "inJustificIdJustific",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode"
})
public class S0702VProfitsBankEmployeeManipulationImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InBankemployeeCardId")
    protected String inBankemployeeCardId;
    @XmlElement(name = "InBankemployeeEmail")
    protected String inBankemployeeEmail;
    @XmlElement(name = "InBankemployeeFatherName")
    protected String inBankemployeeFatherName;
    @XmlElement(name = "InBankemployeeFirstName")
    protected String inBankemployeeFirstName;
    @XmlElement(name = "InBankemployeeId")
    protected String inBankemployeeId;
    @XmlElement(name = "InBankemployeeLastName")
    protected String inBankemployeeLastName;
    @XmlElement(name = "InBankemployeeMobilePhone")
    protected String inBankemployeeMobilePhone;
    @XmlElement(name = "InBankemployeeSex")
    protected String inBankemployeeSex;
    @XmlElement(name = "InBankemployeeSignatureLevel")
    protected String inBankemployeeSignatureLevel;
    @XmlElement(name = "InBankemployeeStaffNo")
    protected String inBankemployeeStaffNo;
    @XmlElement(name = "InBankemployeeTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBankemployeeTmstamp;
    @XmlElement(name = "InBankemployeeWorkPhone")
    protected String inBankemployeeWorkPhone;
    @XmlElement(name = "InCodeBankemployeeId")
    protected String inCodeBankemployeeId;
    @XmlElement(name = "InCodeGradeGenericDetailSerialNum")
    protected int inCodeGradeGenericDetailSerialNum;
    @XmlElement(name = "InCodePositionGenericDetailSerialNum")
    protected int inCodePositionGenericDetailSerialNum;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;

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
     * Gets the value of the inBankemployeeCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeCardId() {
        return inBankemployeeCardId;
    }

    /**
     * Sets the value of the inBankemployeeCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeCardId(String value) {
        this.inBankemployeeCardId = value;
    }

    /**
     * Gets the value of the inBankemployeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeEmail() {
        return inBankemployeeEmail;
    }

    /**
     * Sets the value of the inBankemployeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeEmail(String value) {
        this.inBankemployeeEmail = value;
    }

    /**
     * Gets the value of the inBankemployeeFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeFatherName() {
        return inBankemployeeFatherName;
    }

    /**
     * Sets the value of the inBankemployeeFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeFatherName(String value) {
        this.inBankemployeeFatherName = value;
    }

    /**
     * Gets the value of the inBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeFirstName() {
        return inBankemployeeFirstName;
    }

    /**
     * Sets the value of the inBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeFirstName(String value) {
        this.inBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the inBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeId() {
        return inBankemployeeId;
    }

    /**
     * Sets the value of the inBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeId(String value) {
        this.inBankemployeeId = value;
    }

    /**
     * Gets the value of the inBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeLastName() {
        return inBankemployeeLastName;
    }

    /**
     * Sets the value of the inBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeLastName(String value) {
        this.inBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inBankemployeeMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeMobilePhone() {
        return inBankemployeeMobilePhone;
    }

    /**
     * Sets the value of the inBankemployeeMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeMobilePhone(String value) {
        this.inBankemployeeMobilePhone = value;
    }

    /**
     * Gets the value of the inBankemployeeSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeSex() {
        return inBankemployeeSex;
    }

    /**
     * Sets the value of the inBankemployeeSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeSex(String value) {
        this.inBankemployeeSex = value;
    }

    /**
     * Gets the value of the inBankemployeeSignatureLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeSignatureLevel() {
        return inBankemployeeSignatureLevel;
    }

    /**
     * Sets the value of the inBankemployeeSignatureLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeSignatureLevel(String value) {
        this.inBankemployeeSignatureLevel = value;
    }

    /**
     * Gets the value of the inBankemployeeStaffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeStaffNo() {
        return inBankemployeeStaffNo;
    }

    /**
     * Sets the value of the inBankemployeeStaffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeStaffNo(String value) {
        this.inBankemployeeStaffNo = value;
    }

    /**
     * Gets the value of the inBankemployeeTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBankemployeeTmstamp() {
        return inBankemployeeTmstamp;
    }

    /**
     * Sets the value of the inBankemployeeTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBankemployeeTmstamp(XMLGregorianCalendar value) {
        this.inBankemployeeTmstamp = value;
    }

    /**
     * Gets the value of the inBankemployeeWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeWorkPhone() {
        return inBankemployeeWorkPhone;
    }

    /**
     * Sets the value of the inBankemployeeWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeWorkPhone(String value) {
        this.inBankemployeeWorkPhone = value;
    }

    /**
     * Gets the value of the inCodeBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCodeBankemployeeId() {
        return inCodeBankemployeeId;
    }

    /**
     * Sets the value of the inCodeBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCodeBankemployeeId(String value) {
        this.inCodeBankemployeeId = value;
    }

    /**
     * Gets the value of the inCodeGradeGenericDetailSerialNum property.
     * 
     */
    public int getInCodeGradeGenericDetailSerialNum() {
        return inCodeGradeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCodeGradeGenericDetailSerialNum property.
     * 
     */
    public void setInCodeGradeGenericDetailSerialNum(int value) {
        this.inCodeGradeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCodePositionGenericDetailSerialNum property.
     * 
     */
    public int getInCodePositionGenericDetailSerialNum() {
        return inCodePositionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCodePositionGenericDetailSerialNum property.
     * 
     */
    public void setInCodePositionGenericDetailSerialNum(int value) {
        this.inCodePositionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedFlag() {
        return inIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedFlag(String value) {
        this.inIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
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

}
