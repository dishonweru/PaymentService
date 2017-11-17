
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for R0236VL_RepaymentScheduleScenarioImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VL_RepaymentScheduleScenarioImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAllInstancesIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGenericHeaderParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHloanIntCapitalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHloanLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHproductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InHproductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InHproductValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLastCodeIefSuppliedNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPermRestrIndProductsNText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductsPermissionRestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpPermittedValues" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfR0236VLInGrpPermittedValuesItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VL_RepaymentScheduleScenarioImport", propOrder = {
    "command",
    "inAllInstancesIefSuppliedFlag",
    "inCategoryCategoryCode",
    "inCategoryDescription",
    "inGenericDetailSerialNum",
    "inGenericHeaderParameterType",
    "inHloanIntCapitalFlg",
    "inHloanLoanType",
    "inHproductDescription",
    "inHproductIdProduct",
    "inHproductValidityDate",
    "inIefSuppliedCommand",
    "inLastCodeIefSuppliedNumber",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inPermRestrIndProductsNText1",
    "inProductsPermissionRestrictionType",
    "inGrpPermittedValues"
})
public class R0236VLRepaymentScheduleScenarioImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAllInstancesIefSuppliedFlag")
    protected String inAllInstancesIefSuppliedFlag;
    @XmlElement(name = "InCategoryCategoryCode")
    protected String inCategoryCategoryCode;
    @XmlElement(name = "InCategoryDescription")
    protected String inCategoryDescription;
    @XmlElement(name = "InGenericDetailSerialNum")
    protected int inGenericDetailSerialNum;
    @XmlElement(name = "InGenericHeaderParameterType")
    protected String inGenericHeaderParameterType;
    @XmlElement(name = "InHloanIntCapitalFlg")
    protected String inHloanIntCapitalFlg;
    @XmlElement(name = "InHloanLoanType")
    protected String inHloanLoanType;
    @XmlElement(name = "InHproductDescription")
    protected String inHproductDescription;
    @XmlElement(name = "InHproductIdProduct")
    protected int inHproductIdProduct;
    @XmlElement(name = "InHproductValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inHproductValidityDate;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLastCodeIefSuppliedNumber")
    protected int inLastCodeIefSuppliedNumber;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingPrftSystem")
    protected short inLogMntRecordingPrftSystem;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InPermRestrIndProductsNText1")
    protected String inPermRestrIndProductsNText1;
    @XmlElement(name = "InProductsPermissionRestrictionType")
    protected String inProductsPermissionRestrictionType;
    @XmlElement(name = "InGrpPermittedValues")
    protected ArrayOfR0236VLInGrpPermittedValuesItem inGrpPermittedValues;

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
     * Gets the value of the inAllInstancesIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAllInstancesIefSuppliedFlag() {
        return inAllInstancesIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAllInstancesIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAllInstancesIefSuppliedFlag(String value) {
        this.inAllInstancesIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCategoryCategoryCode() {
        return inCategoryCategoryCode;
    }

    /**
     * Sets the value of the inCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCategoryCategoryCode(String value) {
        this.inCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the inCategoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCategoryDescription() {
        return inCategoryDescription;
    }

    /**
     * Sets the value of the inCategoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCategoryDescription(String value) {
        this.inCategoryDescription = value;
    }

    /**
     * Gets the value of the inGenericDetailSerialNum property.
     * 
     */
    public int getInGenericDetailSerialNum() {
        return inGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGenericDetailSerialNum property.
     * 
     */
    public void setInGenericDetailSerialNum(int value) {
        this.inGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGenericHeaderParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericHeaderParameterType() {
        return inGenericHeaderParameterType;
    }

    /**
     * Sets the value of the inGenericHeaderParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericHeaderParameterType(String value) {
        this.inGenericHeaderParameterType = value;
    }

    /**
     * Gets the value of the inHloanIntCapitalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHloanIntCapitalFlg() {
        return inHloanIntCapitalFlg;
    }

    /**
     * Sets the value of the inHloanIntCapitalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHloanIntCapitalFlg(String value) {
        this.inHloanIntCapitalFlg = value;
    }

    /**
     * Gets the value of the inHloanLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHloanLoanType() {
        return inHloanLoanType;
    }

    /**
     * Sets the value of the inHloanLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHloanLoanType(String value) {
        this.inHloanLoanType = value;
    }

    /**
     * Gets the value of the inHproductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHproductDescription() {
        return inHproductDescription;
    }

    /**
     * Sets the value of the inHproductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHproductDescription(String value) {
        this.inHproductDescription = value;
    }

    /**
     * Gets the value of the inHproductIdProduct property.
     * 
     */
    public int getInHproductIdProduct() {
        return inHproductIdProduct;
    }

    /**
     * Sets the value of the inHproductIdProduct property.
     * 
     */
    public void setInHproductIdProduct(int value) {
        this.inHproductIdProduct = value;
    }

    /**
     * Gets the value of the inHproductValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInHproductValidityDate() {
        return inHproductValidityDate;
    }

    /**
     * Sets the value of the inHproductValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInHproductValidityDate(XMLGregorianCalendar value) {
        this.inHproductValidityDate = value;
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
     * Gets the value of the inLastCodeIefSuppliedNumber property.
     * 
     */
    public int getInLastCodeIefSuppliedNumber() {
        return inLastCodeIefSuppliedNumber;
    }

    /**
     * Sets the value of the inLastCodeIefSuppliedNumber property.
     * 
     */
    public void setInLastCodeIefSuppliedNumber(int value) {
        this.inLastCodeIefSuppliedNumber = value;
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
     * Gets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public short getInLogMntRecordingPrftSystem() {
        return inLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public void setInLogMntRecordingPrftSystem(short value) {
        this.inLogMntRecordingPrftSystem = value;
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
     * Gets the value of the inPermRestrIndProductsNText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPermRestrIndProductsNText1() {
        return inPermRestrIndProductsNText1;
    }

    /**
     * Sets the value of the inPermRestrIndProductsNText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPermRestrIndProductsNText1(String value) {
        this.inPermRestrIndProductsNText1 = value;
    }

    /**
     * Gets the value of the inProductsPermissionRestrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProductsPermissionRestrictionType() {
        return inProductsPermissionRestrictionType;
    }

    /**
     * Sets the value of the inProductsPermissionRestrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProductsPermissionRestrictionType(String value) {
        this.inProductsPermissionRestrictionType = value;
    }

    /**
     * Gets the value of the inGrpPermittedValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfR0236VLInGrpPermittedValuesItem }
     *     
     */
    public ArrayOfR0236VLInGrpPermittedValuesItem getInGrpPermittedValues() {
        return inGrpPermittedValues;
    }

    /**
     * Sets the value of the inGrpPermittedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfR0236VLInGrpPermittedValuesItem }
     *     
     */
    public void setInGrpPermittedValues(ArrayOfR0236VLInGrpPermittedValuesItem value) {
        this.inGrpPermittedValues = value;
    }

}
