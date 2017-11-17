
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL702VProfitsBankEmployeeListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL702VProfitsBankEmployeeListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultBankemployeeStaffNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL702VProfitsBankEmployeeListImport", propOrder = {
    "command",
    "inDefaultBankemployeeStaffNo",
    "inFilterBankemployeeLastName",
    "inFilterUnitCode"
})
public class SL702VProfitsBankEmployeeListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InDefaultBankemployeeStaffNo")
    protected String inDefaultBankemployeeStaffNo;
    @XmlElement(name = "InFilterBankemployeeLastName")
    protected String inFilterBankemployeeLastName;
    @XmlElement(name = "InFilterUnitCode")
    protected int inFilterUnitCode;

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
     * Gets the value of the inDefaultBankemployeeStaffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultBankemployeeStaffNo() {
        return inDefaultBankemployeeStaffNo;
    }

    /**
     * Sets the value of the inDefaultBankemployeeStaffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultBankemployeeStaffNo(String value) {
        this.inDefaultBankemployeeStaffNo = value;
    }

    /**
     * Gets the value of the inFilterBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterBankemployeeLastName() {
        return inFilterBankemployeeLastName;
    }

    /**
     * Sets the value of the inFilterBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterBankemployeeLastName(String value) {
        this.inFilterBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inFilterUnitCode property.
     * 
     */
    public int getInFilterUnitCode() {
        return inFilterUnitCode;
    }

    /**
     * Sets the value of the inFilterUnitCode property.
     * 
     */
    public void setInFilterUnitCode(int value) {
        this.inFilterUnitCode = value;
    }

}
