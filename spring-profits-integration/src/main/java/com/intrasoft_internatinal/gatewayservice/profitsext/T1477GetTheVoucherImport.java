
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T1477_GetTheVoucherImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1477_GetTheVoucherImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxDcdVoucherRunTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InTrxDcdVoucherRunTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxDcdVoucherRunTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxDcdVoucherRunTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1477_GetTheVoucherImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inTrxDcdVoucherRunTrxDate",
    "inTrxDcdVoucherRunTrxUnit",
    "inTrxDcdVoucherRunTrxUser",
    "inTrxDcdVoucherRunTrxUsrSn"
})
public class T1477GetTheVoucherImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTrxDcdVoucherRunTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTrxDcdVoucherRunTrxDate;
    @XmlElement(name = "InTrxDcdVoucherRunTrxUnit")
    protected int inTrxDcdVoucherRunTrxUnit;
    @XmlElement(name = "InTrxDcdVoucherRunTrxUser")
    protected String inTrxDcdVoucherRunTrxUser;
    @XmlElement(name = "InTrxDcdVoucherRunTrxUsrSn")
    protected int inTrxDcdVoucherRunTrxUsrSn;

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
     * Gets the value of the inTrxDcdVoucherRunTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTrxDcdVoucherRunTrxDate() {
        return inTrxDcdVoucherRunTrxDate;
    }

    /**
     * Sets the value of the inTrxDcdVoucherRunTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTrxDcdVoucherRunTrxDate(XMLGregorianCalendar value) {
        this.inTrxDcdVoucherRunTrxDate = value;
    }

    /**
     * Gets the value of the inTrxDcdVoucherRunTrxUnit property.
     * 
     */
    public int getInTrxDcdVoucherRunTrxUnit() {
        return inTrxDcdVoucherRunTrxUnit;
    }

    /**
     * Sets the value of the inTrxDcdVoucherRunTrxUnit property.
     * 
     */
    public void setInTrxDcdVoucherRunTrxUnit(int value) {
        this.inTrxDcdVoucherRunTrxUnit = value;
    }

    /**
     * Gets the value of the inTrxDcdVoucherRunTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxDcdVoucherRunTrxUser() {
        return inTrxDcdVoucherRunTrxUser;
    }

    /**
     * Sets the value of the inTrxDcdVoucherRunTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxDcdVoucherRunTrxUser(String value) {
        this.inTrxDcdVoucherRunTrxUser = value;
    }

    /**
     * Gets the value of the inTrxDcdVoucherRunTrxUsrSn property.
     * 
     */
    public int getInTrxDcdVoucherRunTrxUsrSn() {
        return inTrxDcdVoucherRunTrxUsrSn;
    }

    /**
     * Sets the value of the inTrxDcdVoucherRunTrxUsrSn property.
     * 
     */
    public void setInTrxDcdVoucherRunTrxUsrSn(int value) {
        this.inTrxDcdVoucherRunTrxUsrSn = value;
    }

}
