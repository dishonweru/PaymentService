
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIA0008VOutGrpCustMessagesProfileItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0008VOutGrpCustMessagesProfileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0008VOutGrpCustMessagesProfileItem", propOrder = {
    "outGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar",
    "outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription",
    "outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId"
})
public class CIA0008VOutGrpCustMessagesProfileItem {

    @XmlElement(name = "OutGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar")
    protected String outGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription")
    protected String outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription;
    @XmlElement(name = "OutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId")
    protected String outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId;

    /**
     * Gets the value of the outGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar() {
        return outGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar(String value) {
        this.outGrpCustMessagesProfileOutGrmCustMessagesProfileIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription() {
        return outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription;
    }

    /**
     * Sets the value of the outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription(String value) {
        this.outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleDescription = value;
    }

    /**
     * Gets the value of the outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId() {
        return outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId(String value) {
        this.outGrpCustMessagesProfileOutGrmCustMessagesProfileUnitCategoryPerRoleId = value;
    }

}
