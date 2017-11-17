
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X2232VSafeDepositBoxesListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2232VSafeDepositBoxesListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFromUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InToUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFromSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InToSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultSafeDepositUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterSdbRentalWorkSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPreviousSafeDepositBoxSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueSafeDepositBoxSdbStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InContinueSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2232VSafeDepositBoxesListImport", propOrder = {
    "inIefSuppliedCommand",
    "inLogMntRecordingTrxCode",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inFromUnitCode",
    "inToUnitCode",
    "inFromSafeDepositBoxSdbSn",
    "inToSafeDepositBoxSdbSn",
    "inDefaultSafeDepositUnitCode",
    "inDefaultSafeDepositBoxSdbSn",
    "inFilterSdbRentalWorkSdbStatus",
    "inSelectedUnitCode",
    "inPreviousSafeDepositBoxSdbStatus",
    "inContinueSafeDepositBoxSdbStatus",
    "inContinueSafeDepositBoxSdbSn"
})
public class X2232VSafeDepositBoxesListImport
    extends BaseImport
{

    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InFromUnitCode")
    protected int inFromUnitCode;
    @XmlElement(name = "InToUnitCode")
    protected int inToUnitCode;
    @XmlElement(name = "InFromSafeDepositBoxSdbSn")
    protected int inFromSafeDepositBoxSdbSn;
    @XmlElement(name = "InToSafeDepositBoxSdbSn")
    protected int inToSafeDepositBoxSdbSn;
    @XmlElement(name = "InDefaultSafeDepositUnitCode")
    protected int inDefaultSafeDepositUnitCode;
    @XmlElement(name = "InDefaultSafeDepositBoxSdbSn")
    protected int inDefaultSafeDepositBoxSdbSn;
    @XmlElement(name = "InFilterSdbRentalWorkSdbStatus")
    protected String inFilterSdbRentalWorkSdbStatus;
    @XmlElement(name = "InSelectedUnitCode")
    protected int inSelectedUnitCode;
    @XmlElement(name = "InPreviousSafeDepositBoxSdbStatus")
    protected String inPreviousSafeDepositBoxSdbStatus;
    @XmlElement(name = "InContinueSafeDepositBoxSdbStatus")
    protected String inContinueSafeDepositBoxSdbStatus;
    @XmlElement(name = "InContinueSafeDepositBoxSdbSn")
    protected int inContinueSafeDepositBoxSdbSn;

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
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
     * Gets the value of the inFromUnitCode property.
     * 
     */
    public int getInFromUnitCode() {
        return inFromUnitCode;
    }

    /**
     * Sets the value of the inFromUnitCode property.
     * 
     */
    public void setInFromUnitCode(int value) {
        this.inFromUnitCode = value;
    }

    /**
     * Gets the value of the inToUnitCode property.
     * 
     */
    public int getInToUnitCode() {
        return inToUnitCode;
    }

    /**
     * Sets the value of the inToUnitCode property.
     * 
     */
    public void setInToUnitCode(int value) {
        this.inToUnitCode = value;
    }

    /**
     * Gets the value of the inFromSafeDepositBoxSdbSn property.
     * 
     */
    public int getInFromSafeDepositBoxSdbSn() {
        return inFromSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the inFromSafeDepositBoxSdbSn property.
     * 
     */
    public void setInFromSafeDepositBoxSdbSn(int value) {
        this.inFromSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the inToSafeDepositBoxSdbSn property.
     * 
     */
    public int getInToSafeDepositBoxSdbSn() {
        return inToSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the inToSafeDepositBoxSdbSn property.
     * 
     */
    public void setInToSafeDepositBoxSdbSn(int value) {
        this.inToSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the inDefaultSafeDepositUnitCode property.
     * 
     */
    public int getInDefaultSafeDepositUnitCode() {
        return inDefaultSafeDepositUnitCode;
    }

    /**
     * Sets the value of the inDefaultSafeDepositUnitCode property.
     * 
     */
    public void setInDefaultSafeDepositUnitCode(int value) {
        this.inDefaultSafeDepositUnitCode = value;
    }

    /**
     * Gets the value of the inDefaultSafeDepositBoxSdbSn property.
     * 
     */
    public int getInDefaultSafeDepositBoxSdbSn() {
        return inDefaultSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the inDefaultSafeDepositBoxSdbSn property.
     * 
     */
    public void setInDefaultSafeDepositBoxSdbSn(int value) {
        this.inDefaultSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the inFilterSdbRentalWorkSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterSdbRentalWorkSdbStatus() {
        return inFilterSdbRentalWorkSdbStatus;
    }

    /**
     * Sets the value of the inFilterSdbRentalWorkSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterSdbRentalWorkSdbStatus(String value) {
        this.inFilterSdbRentalWorkSdbStatus = value;
    }

    /**
     * Gets the value of the inSelectedUnitCode property.
     * 
     */
    public int getInSelectedUnitCode() {
        return inSelectedUnitCode;
    }

    /**
     * Sets the value of the inSelectedUnitCode property.
     * 
     */
    public void setInSelectedUnitCode(int value) {
        this.inSelectedUnitCode = value;
    }

    /**
     * Gets the value of the inPreviousSafeDepositBoxSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPreviousSafeDepositBoxSdbStatus() {
        return inPreviousSafeDepositBoxSdbStatus;
    }

    /**
     * Sets the value of the inPreviousSafeDepositBoxSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPreviousSafeDepositBoxSdbStatus(String value) {
        this.inPreviousSafeDepositBoxSdbStatus = value;
    }

    /**
     * Gets the value of the inContinueSafeDepositBoxSdbStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContinueSafeDepositBoxSdbStatus() {
        return inContinueSafeDepositBoxSdbStatus;
    }

    /**
     * Sets the value of the inContinueSafeDepositBoxSdbStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContinueSafeDepositBoxSdbStatus(String value) {
        this.inContinueSafeDepositBoxSdbStatus = value;
    }

    /**
     * Gets the value of the inContinueSafeDepositBoxSdbSn property.
     * 
     */
    public int getInContinueSafeDepositBoxSdbSn() {
        return inContinueSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the inContinueSafeDepositBoxSdbSn property.
     * 
     */
    public void setInContinueSafeDepositBoxSdbSn(int value) {
        this.inContinueSafeDepositBoxSdbSn = value;
    }

}
