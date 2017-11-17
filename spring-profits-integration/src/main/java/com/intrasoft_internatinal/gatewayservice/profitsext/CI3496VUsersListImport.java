
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_UsersListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_UsersListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOmitAtmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOmitBatchIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOmitVirtualIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSpecificChannelDistrChannelIdChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_UsersListImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inContinueUsrCode",
    "inOmitAtmIefSuppliedFlag",
    "inOmitBatchIefSuppliedFlag",
    "inOmitVirtualIefSuppliedFlag",
    "inSpecificChannelDistrChannelIdChannel"
})
public class CI3496VUsersListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InContinueUsrCode")
    protected String inContinueUsrCode;
    @XmlElement(name = "InOmitAtmIefSuppliedFlag")
    protected String inOmitAtmIefSuppliedFlag;
    @XmlElement(name = "InOmitBatchIefSuppliedFlag")
    protected String inOmitBatchIefSuppliedFlag;
    @XmlElement(name = "InOmitVirtualIefSuppliedFlag")
    protected String inOmitVirtualIefSuppliedFlag;
    @XmlElement(name = "InSpecificChannelDistrChannelIdChannel")
    protected int inSpecificChannelDistrChannelIdChannel;

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
     * Gets the value of the inContinueUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueUsrCode() {
        return inContinueUsrCode;
    }

    /**
     * Sets the value of the inContinueUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueUsrCode(String value) {
        this.inContinueUsrCode = value;
    }

    /**
     * Gets the value of the inOmitAtmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOmitAtmIefSuppliedFlag() {
        return inOmitAtmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inOmitAtmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOmitAtmIefSuppliedFlag(String value) {
        this.inOmitAtmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inOmitBatchIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOmitBatchIefSuppliedFlag() {
        return inOmitBatchIefSuppliedFlag;
    }

    /**
     * Sets the value of the inOmitBatchIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOmitBatchIefSuppliedFlag(String value) {
        this.inOmitBatchIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inOmitVirtualIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOmitVirtualIefSuppliedFlag() {
        return inOmitVirtualIefSuppliedFlag;
    }

    /**
     * Sets the value of the inOmitVirtualIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOmitVirtualIefSuppliedFlag(String value) {
        this.inOmitVirtualIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inSpecificChannelDistrChannelIdChannel property.
     * 
     */
    public int getInSpecificChannelDistrChannelIdChannel() {
        return inSpecificChannelDistrChannelIdChannel;
    }

    /**
     * Sets the value of the inSpecificChannelDistrChannelIdChannel property.
     * 
     */
    public void setInSpecificChannelDistrChannelIdChannel(int value) {
        this.inSpecificChannelDistrChannelIdChannel = value;
    }

}
