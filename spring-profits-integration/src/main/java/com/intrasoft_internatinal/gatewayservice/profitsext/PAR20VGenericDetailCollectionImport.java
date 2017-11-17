
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAR20V_GenericDetailCollectionImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAR20V_GenericDetailCollectionImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAR20V_GenericDetailCollectionImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inContinueGenericDetailSerialNum",
    "inFilterGenericDetailDescription",
    "inFilterGenericDetailParameterType"
})
public class PAR20VGenericDetailCollectionImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueGenericDetailSerialNum")
    protected int inContinueGenericDetailSerialNum;
    @XmlElement(name = "InFilterGenericDetailDescription")
    protected String inFilterGenericDetailDescription;
    @XmlElement(name = "InFilterGenericDetailParameterType")
    protected String inFilterGenericDetailParameterType;

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
     * Gets the value of the inContinueGenericDetailSerialNum property.
     * 
     */
    public int getInContinueGenericDetailSerialNum() {
        return inContinueGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inContinueGenericDetailSerialNum property.
     * 
     */
    public void setInContinueGenericDetailSerialNum(int value) {
        this.inContinueGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inFilterGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterGenericDetailDescription() {
        return inFilterGenericDetailDescription;
    }

    /**
     * Sets the value of the inFilterGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterGenericDetailDescription(String value) {
        this.inFilterGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inFilterGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterGenericDetailParameterType() {
        return inFilterGenericDetailParameterType;
    }

    /**
     * Sets the value of the inFilterGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterGenericDetailParameterType(String value) {
        this.inFilterGenericDetailParameterType = value;
    }

}
