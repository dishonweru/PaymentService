
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VFormFieldListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VFormFieldListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutTableIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinuePfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueTagPfgSetupDetailTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueTagPfgSetupDetailTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueTagPfgSetupDetailSetSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutContinueTagPfgSetupDetailSetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupDefaultTagSetup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedPfgTagSetSetupInactiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VFFLOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpHeader" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VFFLOutGrpHeaderItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPFG004VFFLOutGrpDetailItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VFormFieldListExport", propOrder = {
    "outTableIefSuppliedChar5",
    "outContinuePfgTagSetSetupTagSetCode",
    "outContinueTagPfgSetupDetailTagSetCode",
    "outContinueTagPfgSetupDetailTag",
    "outContinueTagPfgSetupDetailSetSn",
    "outContinueTagPfgSetupDetailSetCategory",
    "outSelectedPfgTagSetSetupTagSetCode",
    "outSelectedPfgTagSetSetupDescription",
    "outSelectedPfgTagSetSetupSetDescription",
    "outSelectedPfgTagSetSetupDefaultTagSetup",
    "outSelectedPfgTagSetSetupSetType",
    "outSelectedPfgTagSetSetupInactiveStatus",
    "outGrp",
    "outGrpHeader",
    "outGrpDetail"
})
public class PFG004VFormFieldListExport
    extends BaseExport
{

    @XmlElement(name = "OutTableIefSuppliedChar5")
    protected String outTableIefSuppliedChar5;
    @XmlElement(name = "OutContinuePfgTagSetSetupTagSetCode")
    protected String outContinuePfgTagSetSetupTagSetCode;
    @XmlElement(name = "OutContinueTagPfgSetupDetailTagSetCode")
    protected String outContinueTagPfgSetupDetailTagSetCode;
    @XmlElement(name = "OutContinueTagPfgSetupDetailTag")
    protected String outContinueTagPfgSetupDetailTag;
    @XmlElement(name = "OutContinueTagPfgSetupDetailSetSn")
    protected int outContinueTagPfgSetupDetailSetSn;
    @XmlElement(name = "OutContinueTagPfgSetupDetailSetCategory")
    protected String outContinueTagPfgSetupDetailSetCategory;
    @XmlElement(name = "OutSelectedPfgTagSetSetupTagSetCode")
    protected String outSelectedPfgTagSetSetupTagSetCode;
    @XmlElement(name = "OutSelectedPfgTagSetSetupDescription")
    protected String outSelectedPfgTagSetSetupDescription;
    @XmlElement(name = "OutSelectedPfgTagSetSetupSetDescription")
    protected String outSelectedPfgTagSetSetupSetDescription;
    @XmlElement(name = "OutSelectedPfgTagSetSetupDefaultTagSetup")
    protected String outSelectedPfgTagSetSetupDefaultTagSetup;
    @XmlElement(name = "OutSelectedPfgTagSetSetupSetType")
    protected String outSelectedPfgTagSetSetupSetType;
    @XmlElement(name = "OutSelectedPfgTagSetSetupInactiveStatus")
    protected String outSelectedPfgTagSetSetupInactiveStatus;
    @XmlElement(name = "OutGrp")
    protected ArrayOfPFG004VFFLOutGrpItem outGrp;
    @XmlElement(name = "OutGrpHeader")
    protected ArrayOfPFG004VFFLOutGrpHeaderItem outGrpHeader;
    @XmlElement(name = "OutGrpDetail")
    protected ArrayOfPFG004VFFLOutGrpDetailItem outGrpDetail;

    /**
     * Gets the value of the outTableIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTableIefSuppliedChar5() {
        return outTableIefSuppliedChar5;
    }

    /**
     * Sets the value of the outTableIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTableIefSuppliedChar5(String value) {
        this.outTableIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the outContinuePfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinuePfgTagSetSetupTagSetCode() {
        return outContinuePfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the outContinuePfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinuePfgTagSetSetupTagSetCode(String value) {
        this.outContinuePfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the outContinueTagPfgSetupDetailTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueTagPfgSetupDetailTagSetCode() {
        return outContinueTagPfgSetupDetailTagSetCode;
    }

    /**
     * Sets the value of the outContinueTagPfgSetupDetailTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueTagPfgSetupDetailTagSetCode(String value) {
        this.outContinueTagPfgSetupDetailTagSetCode = value;
    }

    /**
     * Gets the value of the outContinueTagPfgSetupDetailTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueTagPfgSetupDetailTag() {
        return outContinueTagPfgSetupDetailTag;
    }

    /**
     * Sets the value of the outContinueTagPfgSetupDetailTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueTagPfgSetupDetailTag(String value) {
        this.outContinueTagPfgSetupDetailTag = value;
    }

    /**
     * Gets the value of the outContinueTagPfgSetupDetailSetSn property.
     * 
     */
    public int getOutContinueTagPfgSetupDetailSetSn() {
        return outContinueTagPfgSetupDetailSetSn;
    }

    /**
     * Sets the value of the outContinueTagPfgSetupDetailSetSn property.
     * 
     */
    public void setOutContinueTagPfgSetupDetailSetSn(int value) {
        this.outContinueTagPfgSetupDetailSetSn = value;
    }

    /**
     * Gets the value of the outContinueTagPfgSetupDetailSetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueTagPfgSetupDetailSetCategory() {
        return outContinueTagPfgSetupDetailSetCategory;
    }

    /**
     * Sets the value of the outContinueTagPfgSetupDetailSetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueTagPfgSetupDetailSetCategory(String value) {
        this.outContinueTagPfgSetupDetailSetCategory = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupTagSetCode() {
        return outSelectedPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupTagSetCode(String value) {
        this.outSelectedPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupDescription() {
        return outSelectedPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupDescription(String value) {
        this.outSelectedPfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupSetDescription() {
        return outSelectedPfgTagSetSetupSetDescription;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupSetDescription(String value) {
        this.outSelectedPfgTagSetSetupSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupDefaultTagSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupDefaultTagSetup() {
        return outSelectedPfgTagSetSetupDefaultTagSetup;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupDefaultTagSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupDefaultTagSetup(String value) {
        this.outSelectedPfgTagSetSetupDefaultTagSetup = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupSetType() {
        return outSelectedPfgTagSetSetupSetType;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupSetType(String value) {
        this.outSelectedPfgTagSetSetupSetType = value;
    }

    /**
     * Gets the value of the outSelectedPfgTagSetSetupInactiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedPfgTagSetSetupInactiveStatus() {
        return outSelectedPfgTagSetSetupInactiveStatus;
    }

    /**
     * Sets the value of the outSelectedPfgTagSetSetupInactiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedPfgTagSetSetupInactiveStatus(String value) {
        this.outSelectedPfgTagSetSetupInactiveStatus = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VFFLOutGrpItem }
     *     
     */
    public ArrayOfPFG004VFFLOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VFFLOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfPFG004VFFLOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VFFLOutGrpHeaderItem }
     *     
     */
    public ArrayOfPFG004VFFLOutGrpHeaderItem getOutGrpHeader() {
        return outGrpHeader;
    }

    /**
     * Sets the value of the outGrpHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VFFLOutGrpHeaderItem }
     *     
     */
    public void setOutGrpHeader(ArrayOfPFG004VFFLOutGrpHeaderItem value) {
        this.outGrpHeader = value;
    }

    /**
     * Gets the value of the outGrpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFG004VFFLOutGrpDetailItem }
     *     
     */
    public ArrayOfPFG004VFFLOutGrpDetailItem getOutGrpDetail() {
        return outGrpDetail;
    }

    /**
     * Sets the value of the outGrpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFG004VFFLOutGrpDetailItem }
     *     
     */
    public void setOutGrpDetail(ArrayOfPFG004VFFLOutGrpDetailItem value) {
        this.outGrpDetail = value;
    }

}
