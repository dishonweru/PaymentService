
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CIA0013VThirdPartyReferenceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIA0013VThirdPartyReferenceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTunTrxRecoveryThirdPartyRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTunTrxRecoveryTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTunTrxRecoveryTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTunTrxRecoveryTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTunTrxRecoveryTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIA0013VThirdPartyReferenceImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inTunTrxRecoveryThirdPartyRefNo",
    "inTunTrxRecoveryTrxDate",
    "inTunTrxRecoveryTrxUnit",
    "inTunTrxRecoveryTrxUsr",
    "inTunTrxRecoveryTrxUsrSn"
})
public class CIA0013VThirdPartyReferenceImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTunTrxRecoveryThirdPartyRefNo")
    protected String inTunTrxRecoveryThirdPartyRefNo;
    @XmlElement(name = "InTunTrxRecoveryTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTunTrxRecoveryTrxDate;
    @XmlElement(name = "InTunTrxRecoveryTrxUnit")
    protected int inTunTrxRecoveryTrxUnit;
    @XmlElement(name = "InTunTrxRecoveryTrxUsr")
    protected String inTunTrxRecoveryTrxUsr;
    @XmlElement(name = "InTunTrxRecoveryTrxUsrSn")
    protected int inTunTrxRecoveryTrxUsrSn;

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
     * Gets the value of the inTunTrxRecoveryThirdPartyRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTunTrxRecoveryThirdPartyRefNo() {
        return inTunTrxRecoveryThirdPartyRefNo;
    }

    /**
     * Sets the value of the inTunTrxRecoveryThirdPartyRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTunTrxRecoveryThirdPartyRefNo(String value) {
        this.inTunTrxRecoveryThirdPartyRefNo = value;
    }

    /**
     * Gets the value of the inTunTrxRecoveryTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTunTrxRecoveryTrxDate() {
        return inTunTrxRecoveryTrxDate;
    }

    /**
     * Sets the value of the inTunTrxRecoveryTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTunTrxRecoveryTrxDate(XMLGregorianCalendar value) {
        this.inTunTrxRecoveryTrxDate = value;
    }

    /**
     * Gets the value of the inTunTrxRecoveryTrxUnit property.
     * 
     */
    public int getInTunTrxRecoveryTrxUnit() {
        return inTunTrxRecoveryTrxUnit;
    }

    /**
     * Sets the value of the inTunTrxRecoveryTrxUnit property.
     * 
     */
    public void setInTunTrxRecoveryTrxUnit(int value) {
        this.inTunTrxRecoveryTrxUnit = value;
    }

    /**
     * Gets the value of the inTunTrxRecoveryTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTunTrxRecoveryTrxUsr() {
        return inTunTrxRecoveryTrxUsr;
    }

    /**
     * Sets the value of the inTunTrxRecoveryTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTunTrxRecoveryTrxUsr(String value) {
        this.inTunTrxRecoveryTrxUsr = value;
    }

    /**
     * Gets the value of the inTunTrxRecoveryTrxUsrSn property.
     * 
     */
    public int getInTunTrxRecoveryTrxUsrSn() {
        return inTunTrxRecoveryTrxUsrSn;
    }

    /**
     * Sets the value of the inTunTrxRecoveryTrxUsrSn property.
     * 
     */
    public void setInTunTrxRecoveryTrxUsrSn(int value) {
        this.inTunTrxRecoveryTrxUsrSn = value;
    }

}
