
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CI4100VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI4100VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCollaborationBanksTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI4100VOutGrpItem", propOrder = {
    "outGrpOutGrmCollaborationBanksBankId",
    "outGrpOutGrmCollaborationBanksBankName",
    "outGrpOutGrmCollaborationBanksTmstamp"
})
public class CI4100VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmCollaborationBanksBankId")
    protected int outGrpOutGrmCollaborationBanksBankId;
    @XmlElement(name = "OutGrpOutGrmCollaborationBanksBankName")
    protected String outGrpOutGrmCollaborationBanksBankName;
    @XmlElement(name = "OutGrpOutGrmCollaborationBanksTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmCollaborationBanksTmstamp;

    /**
     * Gets the value of the outGrpOutGrmCollaborationBanksBankId property.
     * 
     */
    public int getOutGrpOutGrmCollaborationBanksBankId() {
        return outGrpOutGrmCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outGrpOutGrmCollaborationBanksBankId property.
     * 
     */
    public void setOutGrpOutGrmCollaborationBanksBankId(int value) {
        this.outGrpOutGrmCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCollaborationBanksBankName() {
        return outGrpOutGrmCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outGrpOutGrmCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCollaborationBanksBankName(String value) {
        this.outGrpOutGrmCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCollaborationBanksTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmCollaborationBanksTmstamp() {
        return outGrpOutGrmCollaborationBanksTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmCollaborationBanksTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmCollaborationBanksTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmCollaborationBanksTmstamp = value;
    }

}
