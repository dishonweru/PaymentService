
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VFormFieldListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VFormFieldListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinuePfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueTagPfgSetupDetailTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueTagPfgSetupDetailTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueTagPfgSetupDetailSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InContinueTagPfgSetupDetailSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterPfgTagSetSetupDcdPrftSysPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterPfgTagSetSetupDcdPrftSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOnlyTagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetreivePfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetreivePfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetreivePfgTagSetSetupSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetreivePfgTagSetSetupDefaultTagSetup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetreivePfgTagSetSetupSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRetreivePfgTagSetSetupInactiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgTagSetSetupSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgTagSetSetupDefaultTagSetup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgTagSetSetupSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedPfgTagSetSetupInactiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelMsgCategIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTableIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParamatersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VFormFieldListImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inContinuePfgTagSetSetupTagSetCode",
    "inContinueTagPfgSetupDetailTagSetCode",
    "inContinueTagPfgSetupDetailTag",
    "inContinueTagPfgSetupDetailSetSn",
    "inContinueTagPfgSetupDetailSetCategory",
    "inFilterPfgTagSetSetupDcdPrftSysPar",
    "inFilterPfgTagSetSetupDcdPrftSystem",
    "inOnlyTagIefSuppliedFlag",
    "inRetreivePfgTagSetSetupTagSetCode",
    "inRetreivePfgTagSetSetupDescription",
    "inRetreivePfgTagSetSetupSetDescription",
    "inRetreivePfgTagSetSetupDefaultTagSetup",
    "inRetreivePfgTagSetSetupSetType",
    "inRetreivePfgTagSetSetupInactiveStatus",
    "inSelectedPfgTagSetSetupTagSetCode",
    "inSelectedPfgTagSetSetupDescription",
    "inSelectedPfgTagSetSetupSetDescription",
    "inSelectedPfgTagSetSetupDefaultTagSetup",
    "inSelectedPfgTagSetSetupSetType",
    "inSelectedPfgTagSetSetupInactiveStatus",
    "inSelMsgCategIefSuppliedChar1",
    "inTableIefSuppliedChar5",
    "inGrpParamatersInGrmTerminalTerminalNumber"
})
public class PFG004VFormFieldListImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinuePfgTagSetSetupTagSetCode")
    protected String inContinuePfgTagSetSetupTagSetCode;
    @XmlElement(name = "InContinueTagPfgSetupDetailTagSetCode")
    protected String inContinueTagPfgSetupDetailTagSetCode;
    @XmlElement(name = "InContinueTagPfgSetupDetailTag")
    protected String inContinueTagPfgSetupDetailTag;
    @XmlElement(name = "InContinueTagPfgSetupDetailSetSn")
    protected int inContinueTagPfgSetupDetailSetSn;
    @XmlElement(name = "InContinueTagPfgSetupDetailSetCategory")
    protected String inContinueTagPfgSetupDetailSetCategory;
    @XmlElement(name = "InFilterPfgTagSetSetupDcdPrftSysPar")
    protected String inFilterPfgTagSetSetupDcdPrftSysPar;
    @XmlElement(name = "InFilterPfgTagSetSetupDcdPrftSystem")
    protected int inFilterPfgTagSetSetupDcdPrftSystem;
    @XmlElement(name = "InOnlyTagIefSuppliedFlag")
    protected String inOnlyTagIefSuppliedFlag;
    @XmlElement(name = "InRetreivePfgTagSetSetupTagSetCode")
    protected String inRetreivePfgTagSetSetupTagSetCode;
    @XmlElement(name = "InRetreivePfgTagSetSetupDescription")
    protected String inRetreivePfgTagSetSetupDescription;
    @XmlElement(name = "InRetreivePfgTagSetSetupSetDescription")
    protected String inRetreivePfgTagSetSetupSetDescription;
    @XmlElement(name = "InRetreivePfgTagSetSetupDefaultTagSetup")
    protected String inRetreivePfgTagSetSetupDefaultTagSetup;
    @XmlElement(name = "InRetreivePfgTagSetSetupSetType")
    protected String inRetreivePfgTagSetSetupSetType;
    @XmlElement(name = "InRetreivePfgTagSetSetupInactiveStatus")
    protected String inRetreivePfgTagSetSetupInactiveStatus;
    @XmlElement(name = "InSelectedPfgTagSetSetupTagSetCode")
    protected String inSelectedPfgTagSetSetupTagSetCode;
    @XmlElement(name = "InSelectedPfgTagSetSetupDescription")
    protected String inSelectedPfgTagSetSetupDescription;
    @XmlElement(name = "InSelectedPfgTagSetSetupSetDescription")
    protected String inSelectedPfgTagSetSetupSetDescription;
    @XmlElement(name = "InSelectedPfgTagSetSetupDefaultTagSetup")
    protected String inSelectedPfgTagSetSetupDefaultTagSetup;
    @XmlElement(name = "InSelectedPfgTagSetSetupSetType")
    protected String inSelectedPfgTagSetSetupSetType;
    @XmlElement(name = "InSelectedPfgTagSetSetupInactiveStatus")
    protected String inSelectedPfgTagSetSetupInactiveStatus;
    @XmlElement(name = "InSelMsgCategIefSuppliedChar1")
    protected String inSelMsgCategIefSuppliedChar1;
    @XmlElement(name = "InTableIefSuppliedChar5")
    protected String inTableIefSuppliedChar5;
    @XmlElement(name = "InGrpParamatersInGrmTerminalTerminalNumber")
    protected String inGrpParamatersInGrmTerminalTerminalNumber;

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inContinuePfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinuePfgTagSetSetupTagSetCode() {
        return inContinuePfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inContinuePfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinuePfgTagSetSetupTagSetCode(String value) {
        this.inContinuePfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the inContinueTagPfgSetupDetailTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueTagPfgSetupDetailTagSetCode() {
        return inContinueTagPfgSetupDetailTagSetCode;
    }

    /**
     * Sets the value of the inContinueTagPfgSetupDetailTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueTagPfgSetupDetailTagSetCode(String value) {
        this.inContinueTagPfgSetupDetailTagSetCode = value;
    }

    /**
     * Gets the value of the inContinueTagPfgSetupDetailTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueTagPfgSetupDetailTag() {
        return inContinueTagPfgSetupDetailTag;
    }

    /**
     * Sets the value of the inContinueTagPfgSetupDetailTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueTagPfgSetupDetailTag(String value) {
        this.inContinueTagPfgSetupDetailTag = value;
    }

    /**
     * Gets the value of the inContinueTagPfgSetupDetailSetSn property.
     * 
     */
    public int getInContinueTagPfgSetupDetailSetSn() {
        return inContinueTagPfgSetupDetailSetSn;
    }

    /**
     * Sets the value of the inContinueTagPfgSetupDetailSetSn property.
     * 
     */
    public void setInContinueTagPfgSetupDetailSetSn(int value) {
        this.inContinueTagPfgSetupDetailSetSn = value;
    }

    /**
     * Gets the value of the inContinueTagPfgSetupDetailSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueTagPfgSetupDetailSetCategory() {
        return inContinueTagPfgSetupDetailSetCategory;
    }

    /**
     * Sets the value of the inContinueTagPfgSetupDetailSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueTagPfgSetupDetailSetCategory(String value) {
        this.inContinueTagPfgSetupDetailSetCategory = value;
    }

    /**
     * Gets the value of the inFilterPfgTagSetSetupDcdPrftSysPar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterPfgTagSetSetupDcdPrftSysPar() {
        return inFilterPfgTagSetSetupDcdPrftSysPar;
    }

    /**
     * Sets the value of the inFilterPfgTagSetSetupDcdPrftSysPar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterPfgTagSetSetupDcdPrftSysPar(String value) {
        this.inFilterPfgTagSetSetupDcdPrftSysPar = value;
    }

    /**
     * Gets the value of the inFilterPfgTagSetSetupDcdPrftSystem property.
     * 
     */
    public int getInFilterPfgTagSetSetupDcdPrftSystem() {
        return inFilterPfgTagSetSetupDcdPrftSystem;
    }

    /**
     * Sets the value of the inFilterPfgTagSetSetupDcdPrftSystem property.
     * 
     */
    public void setInFilterPfgTagSetSetupDcdPrftSystem(int value) {
        this.inFilterPfgTagSetSetupDcdPrftSystem = value;
    }

    /**
     * Gets the value of the inOnlyTagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOnlyTagIefSuppliedFlag() {
        return inOnlyTagIefSuppliedFlag;
    }

    /**
     * Sets the value of the inOnlyTagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOnlyTagIefSuppliedFlag(String value) {
        this.inOnlyTagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inRetreivePfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetreivePfgTagSetSetupTagSetCode() {
        return inRetreivePfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inRetreivePfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetreivePfgTagSetSetupTagSetCode(String value) {
        this.inRetreivePfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the inRetreivePfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetreivePfgTagSetSetupDescription() {
        return inRetreivePfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the inRetreivePfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetreivePfgTagSetSetupDescription(String value) {
        this.inRetreivePfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the inRetreivePfgTagSetSetupSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetreivePfgTagSetSetupSetDescription() {
        return inRetreivePfgTagSetSetupSetDescription;
    }

    /**
     * Sets the value of the inRetreivePfgTagSetSetupSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetreivePfgTagSetSetupSetDescription(String value) {
        this.inRetreivePfgTagSetSetupSetDescription = value;
    }

    /**
     * Gets the value of the inRetreivePfgTagSetSetupDefaultTagSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetreivePfgTagSetSetupDefaultTagSetup() {
        return inRetreivePfgTagSetSetupDefaultTagSetup;
    }

    /**
     * Sets the value of the inRetreivePfgTagSetSetupDefaultTagSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetreivePfgTagSetSetupDefaultTagSetup(String value) {
        this.inRetreivePfgTagSetSetupDefaultTagSetup = value;
    }

    /**
     * Gets the value of the inRetreivePfgTagSetSetupSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetreivePfgTagSetSetupSetType() {
        return inRetreivePfgTagSetSetupSetType;
    }

    /**
     * Sets the value of the inRetreivePfgTagSetSetupSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetreivePfgTagSetSetupSetType(String value) {
        this.inRetreivePfgTagSetSetupSetType = value;
    }

    /**
     * Gets the value of the inRetreivePfgTagSetSetupInactiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRetreivePfgTagSetSetupInactiveStatus() {
        return inRetreivePfgTagSetSetupInactiveStatus;
    }

    /**
     * Sets the value of the inRetreivePfgTagSetSetupInactiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRetreivePfgTagSetSetupInactiveStatus(String value) {
        this.inRetreivePfgTagSetSetupInactiveStatus = value;
    }

    /**
     * Gets the value of the inSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupTagSetCode() {
        return inSelectedPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupTagSetCode(String value) {
        this.inSelectedPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the inSelectedPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupDescription() {
        return inSelectedPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupDescription(String value) {
        this.inSelectedPfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the inSelectedPfgTagSetSetupSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupSetDescription() {
        return inSelectedPfgTagSetSetupSetDescription;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupSetDescription(String value) {
        this.inSelectedPfgTagSetSetupSetDescription = value;
    }

    /**
     * Gets the value of the inSelectedPfgTagSetSetupDefaultTagSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupDefaultTagSetup() {
        return inSelectedPfgTagSetSetupDefaultTagSetup;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupDefaultTagSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupDefaultTagSetup(String value) {
        this.inSelectedPfgTagSetSetupDefaultTagSetup = value;
    }

    /**
     * Gets the value of the inSelectedPfgTagSetSetupSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupSetType() {
        return inSelectedPfgTagSetSetupSetType;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupSetType(String value) {
        this.inSelectedPfgTagSetSetupSetType = value;
    }

    /**
     * Gets the value of the inSelectedPfgTagSetSetupInactiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedPfgTagSetSetupInactiveStatus() {
        return inSelectedPfgTagSetSetupInactiveStatus;
    }

    /**
     * Sets the value of the inSelectedPfgTagSetSetupInactiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedPfgTagSetSetupInactiveStatus(String value) {
        this.inSelectedPfgTagSetSetupInactiveStatus = value;
    }

    /**
     * Gets the value of the inSelMsgCategIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelMsgCategIefSuppliedChar1() {
        return inSelMsgCategIefSuppliedChar1;
    }

    /**
     * Sets the value of the inSelMsgCategIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelMsgCategIefSuppliedChar1(String value) {
        this.inSelMsgCategIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inTableIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTableIefSuppliedChar5() {
        return inTableIefSuppliedChar5;
    }

    /**
     * Sets the value of the inTableIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTableIefSuppliedChar5(String value) {
        this.inTableIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inGrpParamatersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParamatersInGrmTerminalTerminalNumber() {
        return inGrpParamatersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParamatersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParamatersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParamatersInGrmTerminalTerminalNumber = value;
    }

}
