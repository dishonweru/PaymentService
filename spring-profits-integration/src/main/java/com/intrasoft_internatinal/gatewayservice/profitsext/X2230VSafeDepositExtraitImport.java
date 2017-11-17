
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for X2230VSafeDepositExtraitImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2230VSafeDepositExtraitImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultSdbExtraitTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDefaultSdbExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDetailsSdbExtraitJustificationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDetailsSdbExtraitTransactionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDetailsSdbExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDetailsSdbExtraitTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSafeDepositUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSdbRentalRentalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2230VSafeDepositExtraitImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inDefaultSdbExtraitTmstamp",
    "inDefaultSdbExtraitTrxInternalSn",
    "inDetailsSdbExtraitJustificationCode",
    "inDetailsSdbExtraitTransactionCode",
    "inDetailsSdbExtraitTrxUnit",
    "inDetailsSdbExtraitTrxUsr",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inSafeDepositBoxSdbSn",
    "inSafeDepositUnitCode",
    "inSdbRentalRentalDt"
})
public class X2230VSafeDepositExtraitImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InDefaultSdbExtraitTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDefaultSdbExtraitTmstamp;
    @XmlElement(name = "InDefaultSdbExtraitTrxInternalSn")
    protected short inDefaultSdbExtraitTrxInternalSn;
    @XmlElement(name = "InDetailsSdbExtraitJustificationCode")
    protected int inDetailsSdbExtraitJustificationCode;
    @XmlElement(name = "InDetailsSdbExtraitTransactionCode")
    protected int inDetailsSdbExtraitTransactionCode;
    @XmlElement(name = "InDetailsSdbExtraitTrxUnit")
    protected int inDetailsSdbExtraitTrxUnit;
    @XmlElement(name = "InDetailsSdbExtraitTrxUsr")
    protected String inDetailsSdbExtraitTrxUsr;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingPrftSystem")
    protected short inLogMntRecordingPrftSystem;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InSafeDepositBoxSdbSn")
    protected int inSafeDepositBoxSdbSn;
    @XmlElement(name = "InSafeDepositUnitCode")
    protected int inSafeDepositUnitCode;
    @XmlElement(name = "InSdbRentalRentalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSdbRentalRentalDt;

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
     * Gets the value of the inDefaultSdbExtraitTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDefaultSdbExtraitTmstamp() {
        return inDefaultSdbExtraitTmstamp;
    }

    /**
     * Sets the value of the inDefaultSdbExtraitTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDefaultSdbExtraitTmstamp(XMLGregorianCalendar value) {
        this.inDefaultSdbExtraitTmstamp = value;
    }

    /**
     * Gets the value of the inDefaultSdbExtraitTrxInternalSn property.
     * 
     */
    public short getInDefaultSdbExtraitTrxInternalSn() {
        return inDefaultSdbExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the inDefaultSdbExtraitTrxInternalSn property.
     * 
     */
    public void setInDefaultSdbExtraitTrxInternalSn(short value) {
        this.inDefaultSdbExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the inDetailsSdbExtraitJustificationCode property.
     * 
     */
    public int getInDetailsSdbExtraitJustificationCode() {
        return inDetailsSdbExtraitJustificationCode;
    }

    /**
     * Sets the value of the inDetailsSdbExtraitJustificationCode property.
     * 
     */
    public void setInDetailsSdbExtraitJustificationCode(int value) {
        this.inDetailsSdbExtraitJustificationCode = value;
    }

    /**
     * Gets the value of the inDetailsSdbExtraitTransactionCode property.
     * 
     */
    public int getInDetailsSdbExtraitTransactionCode() {
        return inDetailsSdbExtraitTransactionCode;
    }

    /**
     * Sets the value of the inDetailsSdbExtraitTransactionCode property.
     * 
     */
    public void setInDetailsSdbExtraitTransactionCode(int value) {
        this.inDetailsSdbExtraitTransactionCode = value;
    }

    /**
     * Gets the value of the inDetailsSdbExtraitTrxUnit property.
     * 
     */
    public int getInDetailsSdbExtraitTrxUnit() {
        return inDetailsSdbExtraitTrxUnit;
    }

    /**
     * Sets the value of the inDetailsSdbExtraitTrxUnit property.
     * 
     */
    public void setInDetailsSdbExtraitTrxUnit(int value) {
        this.inDetailsSdbExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the inDetailsSdbExtraitTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDetailsSdbExtraitTrxUsr() {
        return inDetailsSdbExtraitTrxUsr;
    }

    /**
     * Sets the value of the inDetailsSdbExtraitTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDetailsSdbExtraitTrxUsr(String value) {
        this.inDetailsSdbExtraitTrxUsr = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public short getInLogMntRecordingPrftSystem() {
        return inLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public void setInLogMntRecordingPrftSystem(short value) {
        this.inLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inSafeDepositBoxSdbSn property.
     * 
     */
    public int getInSafeDepositBoxSdbSn() {
        return inSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the inSafeDepositBoxSdbSn property.
     * 
     */
    public void setInSafeDepositBoxSdbSn(int value) {
        this.inSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the inSafeDepositUnitCode property.
     * 
     */
    public int getInSafeDepositUnitCode() {
        return inSafeDepositUnitCode;
    }

    /**
     * Sets the value of the inSafeDepositUnitCode property.
     * 
     */
    public void setInSafeDepositUnitCode(int value) {
        this.inSafeDepositUnitCode = value;
    }

    /**
     * Gets the value of the inSdbRentalRentalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSdbRentalRentalDt() {
        return inSdbRentalRentalDt;
    }

    /**
     * Sets the value of the inSdbRentalRentalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSdbRentalRentalDt(XMLGregorianCalendar value) {
        this.inSdbRentalRentalDt = value;
    }

}
