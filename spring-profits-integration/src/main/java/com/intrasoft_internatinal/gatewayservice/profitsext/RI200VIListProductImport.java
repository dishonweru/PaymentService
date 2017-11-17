
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RI200VI_ListProductImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RI200VI_ListProductImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterProductProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI200VI_ListProductImport", propOrder = {
    "command",
    "inFilterProductDescription",
    "inFilterProductProductType",
    "inTrxBankParametersCurrTrxDate"
})
public class RI200VIListProductImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InFilterProductDescription")
    protected String inFilterProductDescription;
    @XmlElement(name = "InFilterProductProductType")
    protected String inFilterProductProductType;
    @XmlElement(name = "InTrxBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrxBankParametersCurrTrxDate;

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
     * Gets the value of the inFilterProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterProductDescription() {
        return inFilterProductDescription;
    }

    /**
     * Sets the value of the inFilterProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterProductDescription(String value) {
        this.inFilterProductDescription = value;
    }

    /**
     * Gets the value of the inFilterProductProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterProductProductType() {
        return inFilterProductProductType;
    }

    /**
     * Sets the value of the inFilterProductProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterProductProductType(String value) {
        this.inFilterProductProductType = value;
    }

    /**
     * Gets the value of the inTrxBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrxBankParametersCurrTrxDate() {
        return inTrxBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inTrxBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrxBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inTrxBankParametersCurrTrxDate = value;
    }

}
