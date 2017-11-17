
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationWithExternalSystemsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationWithExternalSystemsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxRecoveryGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxRecoveryPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTrxRecoveryReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxRecoveryTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxRecoveryTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationWithExternalSystemsImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inTrxRecoveryGrpSubscript",
    "inTrxRecoveryPrftSystem",
    "inTrxRecoveryReferenceNumber",
    "inTrxRecoveryTrxUsrSn",
    "inTrxRecoveryTunInternalSn"
})
public class ReconciliationWithExternalSystemsImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTrxRecoveryGrpSubscript")
    protected short inTrxRecoveryGrpSubscript;
    @XmlElement(name = "InTrxRecoveryPrftSystem")
    protected short inTrxRecoveryPrftSystem;
    @XmlElement(name = "InTrxRecoveryReferenceNumber")
    protected String inTrxRecoveryReferenceNumber;
    @XmlElement(name = "InTrxRecoveryTrxUsrSn")
    protected int inTrxRecoveryTrxUsrSn;
    @XmlElement(name = "InTrxRecoveryTunInternalSn")
    protected short inTrxRecoveryTunInternalSn;

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
     * Gets the value of the inTrxRecoveryGrpSubscript property.
     * 
     */
    public short getInTrxRecoveryGrpSubscript() {
        return inTrxRecoveryGrpSubscript;
    }

    /**
     * Sets the value of the inTrxRecoveryGrpSubscript property.
     * 
     */
    public void setInTrxRecoveryGrpSubscript(short value) {
        this.inTrxRecoveryGrpSubscript = value;
    }

    /**
     * Gets the value of the inTrxRecoveryPrftSystem property.
     * 
     */
    public short getInTrxRecoveryPrftSystem() {
        return inTrxRecoveryPrftSystem;
    }

    /**
     * Sets the value of the inTrxRecoveryPrftSystem property.
     * 
     */
    public void setInTrxRecoveryPrftSystem(short value) {
        this.inTrxRecoveryPrftSystem = value;
    }

    /**
     * Gets the value of the inTrxRecoveryReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxRecoveryReferenceNumber() {
        return inTrxRecoveryReferenceNumber;
    }

    /**
     * Sets the value of the inTrxRecoveryReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxRecoveryReferenceNumber(String value) {
        this.inTrxRecoveryReferenceNumber = value;
    }

    /**
     * Gets the value of the inTrxRecoveryTrxUsrSn property.
     * 
     */
    public int getInTrxRecoveryTrxUsrSn() {
        return inTrxRecoveryTrxUsrSn;
    }

    /**
     * Sets the value of the inTrxRecoveryTrxUsrSn property.
     * 
     */
    public void setInTrxRecoveryTrxUsrSn(int value) {
        this.inTrxRecoveryTrxUsrSn = value;
    }

    /**
     * Gets the value of the inTrxRecoveryTunInternalSn property.
     * 
     */
    public short getInTrxRecoveryTunInternalSn() {
        return inTrxRecoveryTunInternalSn;
    }

    /**
     * Sets the value of the inTrxRecoveryTunInternalSn property.
     * 
     */
    public void setInTrxRecoveryTunInternalSn(short value) {
        this.inTrxRecoveryTunInternalSn = value;
    }

}
