
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0135VCardMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0135VCardMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0135VOutListGrpItem" minOccurs="0"/>
 *         &lt;element name="OutCustCardAccountAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCardAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCardAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCardAccountProfitsAccountNu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustCardAccountPrfAcPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustCardAccountProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0135VCardMaintenanceExport", propOrder = {
    "outCustListSetDescription",
    "outListGrp",
    "outCustCardAccountAccountNo",
    "outCustCardAccountAccountType",
    "outCustCardAccountEntryStatus",
    "outCustCardAccountProfitsAccountNu",
    "outCustCardAccountPrfAcPrftSystem",
    "outCustCardAccountProfitsAccountCd",
    "outTeamInformationEvaluationResult",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationAuthorizationType"
})
public class I0135VCardMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutListGrp")
    protected ArrayOfI0135VOutListGrpItem outListGrp;
    @XmlElement(name = "OutCustCardAccountAccountNo")
    protected String outCustCardAccountAccountNo;
    @XmlElement(name = "OutCustCardAccountAccountType")
    protected String outCustCardAccountAccountType;
    @XmlElement(name = "OutCustCardAccountEntryStatus")
    protected String outCustCardAccountEntryStatus;
    @XmlElement(name = "OutCustCardAccountProfitsAccountNu")
    protected String outCustCardAccountProfitsAccountNu;
    @XmlElement(name = "OutCustCardAccountPrfAcPrftSystem")
    protected short outCustCardAccountPrfAcPrftSystem;
    @XmlElement(name = "OutCustCardAccountProfitsAccountCd")
    protected short outCustCardAccountProfitsAccountCd;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;

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
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0135VOutListGrpItem }
     *     
     */
    public ArrayOfI0135VOutListGrpItem getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0135VOutListGrpItem }
     *     
     */
    public void setOutListGrp(ArrayOfI0135VOutListGrpItem value) {
        this.outListGrp = value;
    }

    /**
     * Gets the value of the outCustCardAccountAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCardAccountAccountNo() {
        return outCustCardAccountAccountNo;
    }

    /**
     * Sets the value of the outCustCardAccountAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCardAccountAccountNo(String value) {
        this.outCustCardAccountAccountNo = value;
    }

    /**
     * Gets the value of the outCustCardAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCardAccountAccountType() {
        return outCustCardAccountAccountType;
    }

    /**
     * Sets the value of the outCustCardAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCardAccountAccountType(String value) {
        this.outCustCardAccountAccountType = value;
    }

    /**
     * Gets the value of the outCustCardAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCardAccountEntryStatus() {
        return outCustCardAccountEntryStatus;
    }

    /**
     * Sets the value of the outCustCardAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCardAccountEntryStatus(String value) {
        this.outCustCardAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outCustCardAccountProfitsAccountNu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustCardAccountProfitsAccountNu() {
        return outCustCardAccountProfitsAccountNu;
    }

    /**
     * Sets the value of the outCustCardAccountProfitsAccountNu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustCardAccountProfitsAccountNu(String value) {
        this.outCustCardAccountProfitsAccountNu = value;
    }

    /**
     * Gets the value of the outCustCardAccountPrfAcPrftSystem property.
     * 
     */
    public short getOutCustCardAccountPrfAcPrftSystem() {
        return outCustCardAccountPrfAcPrftSystem;
    }

    /**
     * Sets the value of the outCustCardAccountPrfAcPrftSystem property.
     * 
     */
    public void setOutCustCardAccountPrfAcPrftSystem(short value) {
        this.outCustCardAccountPrfAcPrftSystem = value;
    }

    /**
     * Gets the value of the outCustCardAccountProfitsAccountCd property.
     * 
     */
    public short getOutCustCardAccountProfitsAccountCd() {
        return outCustCardAccountProfitsAccountCd;
    }

    /**
     * Sets the value of the outCustCardAccountProfitsAccountCd property.
     * 
     */
    public void setOutCustCardAccountProfitsAccountCd(short value) {
        this.outCustCardAccountProfitsAccountCd = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
    }

}
