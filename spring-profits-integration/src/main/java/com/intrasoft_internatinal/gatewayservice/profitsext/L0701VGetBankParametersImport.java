
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0701VGetBankParametersImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0701VGetBankParametersImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTrxRecoveryGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTrxRecoveryPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxTrxRecoveryTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxTrxRecoveryTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0701VGetBankParametersImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inTrxTrxRecoveryGrpSubscript",
    "inTrxTrxRecoveryPrftSystem",
    "inTrxTrxRecoveryTrxUsrSn",
    "inTrxTrxRecoveryTunInternalSn"
})
public class L0701VGetBankParametersImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTrxTrxRecoveryGrpSubscript")
    protected short inTrxTrxRecoveryGrpSubscript;
    @XmlElement(name = "InTrxTrxRecoveryPrftSystem")
    protected short inTrxTrxRecoveryPrftSystem;
    @XmlElement(name = "InTrxTrxRecoveryTrxUsrSn")
    protected int inTrxTrxRecoveryTrxUsrSn;
    @XmlElement(name = "InTrxTrxRecoveryTunInternalSn")
    protected short inTrxTrxRecoveryTunInternalSn;

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
     * Gets the value of the inTrxTrxRecoveryGrpSubscript property.
     * 
     */
    public short getInTrxTrxRecoveryGrpSubscript() {
        return inTrxTrxRecoveryGrpSubscript;
    }

    /**
     * Sets the value of the inTrxTrxRecoveryGrpSubscript property.
     * 
     */
    public void setInTrxTrxRecoveryGrpSubscript(short value) {
        this.inTrxTrxRecoveryGrpSubscript = value;
    }

    /**
     * Gets the value of the inTrxTrxRecoveryPrftSystem property.
     * 
     */
    public short getInTrxTrxRecoveryPrftSystem() {
        return inTrxTrxRecoveryPrftSystem;
    }

    /**
     * Sets the value of the inTrxTrxRecoveryPrftSystem property.
     * 
     */
    public void setInTrxTrxRecoveryPrftSystem(short value) {
        this.inTrxTrxRecoveryPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxTrxRecoveryTrxUsrSn property.
     * 
     */
    public int getInTrxTrxRecoveryTrxUsrSn() {
        return inTrxTrxRecoveryTrxUsrSn;
    }

    /**
     * Sets the value of the inTrxTrxRecoveryTrxUsrSn property.
     * 
     */
    public void setInTrxTrxRecoveryTrxUsrSn(int value) {
        this.inTrxTrxRecoveryTrxUsrSn = value;
    }

    /**
     * Gets the value of the inTrxTrxRecoveryTunInternalSn property.
     * 
     */
    public short getInTrxTrxRecoveryTunInternalSn() {
        return inTrxTrxRecoveryTunInternalSn;
    }

    /**
     * Sets the value of the inTrxTrxRecoveryTunInternalSn property.
     * 
     */
    public void setInTrxTrxRecoveryTunInternalSn(short value) {
        this.inTrxTrxRecoveryTunInternalSn = value;
    }

}
