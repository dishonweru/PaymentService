
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0336VMultilineReversalImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0336VMultilineReversalImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCallCenterFlagIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepTrxRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepTrxRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InDepTrxRecordingTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepTrxRecordingIComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthorGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfD0336VInAuthorGroupItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0336VMultilineReversalImport", propOrder = {
    "command",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inAuthorGrantedIefSuppliedFlag",
    "inCallCenterFlagIefSuppliedChar1",
    "inDepTrxRecordingTrxUnit",
    "inDepTrxRecordingTrxDate",
    "inDepTrxRecordingTrxUsr",
    "inDepTrxRecordingTrxUsrSn",
    "inDepTrxRecordingIComments",
    "inDepTrxRecordingUUserTotalsAmn",
    "inParametersInTerminalTerminalNumber",
    "inPrftTransactionIdTransact",
    "inAuthorGroup"
})
public class D0336VMultilineReversalImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCallCenterFlagIefSuppliedChar1")
    protected String inCallCenterFlagIefSuppliedChar1;
    @XmlElement(name = "InDepTrxRecordingTrxUnit")
    protected int inDepTrxRecordingTrxUnit;
    @XmlElement(name = "InDepTrxRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDepTrxRecordingTrxDate;
    @XmlElement(name = "InDepTrxRecordingTrxUsr")
    protected String inDepTrxRecordingTrxUsr;
    @XmlElement(name = "InDepTrxRecordingTrxUsrSn")
    protected int inDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "InDepTrxRecordingIComments")
    protected String inDepTrxRecordingIComments;
    @XmlElement(name = "InDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal inDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InAuthorGroup")
    protected ArrayOfD0336VInAuthorGroupItem inAuthorGroup;

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
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCallCenterFlagIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCallCenterFlagIefSuppliedChar1() {
        return inCallCenterFlagIefSuppliedChar1;
    }

    /**
     * Sets the value of the inCallCenterFlagIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCallCenterFlagIefSuppliedChar1(String value) {
        this.inCallCenterFlagIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingTrxUnit property.
     * 
     */
    public int getInDepTrxRecordingTrxUnit() {
        return inDepTrxRecordingTrxUnit;
    }

    /**
     * Sets the value of the inDepTrxRecordingTrxUnit property.
     * 
     */
    public void setInDepTrxRecordingTrxUnit(int value) {
        this.inDepTrxRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDepTrxRecordingTrxDate() {
        return inDepTrxRecordingTrxDate;
    }

    /**
     * Sets the value of the inDepTrxRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDepTrxRecordingTrxDate(XMLGregorianCalendar value) {
        this.inDepTrxRecordingTrxDate = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepTrxRecordingTrxUsr() {
        return inDepTrxRecordingTrxUsr;
    }

    /**
     * Sets the value of the inDepTrxRecordingTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepTrxRecordingTrxUsr(String value) {
        this.inDepTrxRecordingTrxUsr = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingTrxUsrSn property.
     * 
     */
    public int getInDepTrxRecordingTrxUsrSn() {
        return inDepTrxRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the inDepTrxRecordingTrxUsrSn property.
     * 
     */
    public void setInDepTrxRecordingTrxUsrSn(int value) {
        this.inDepTrxRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingIComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDepTrxRecordingIComments() {
        return inDepTrxRecordingIComments;
    }

    /**
     * Sets the value of the inDepTrxRecordingIComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDepTrxRecordingIComments(String value) {
        this.inDepTrxRecordingIComments = value;
    }

    /**
     * Gets the value of the inDepTrxRecordingUUserTotalsAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDepTrxRecordingUUserTotalsAmn() {
        return inDepTrxRecordingUUserTotalsAmn;
    }

    /**
     * Sets the value of the inDepTrxRecordingUUserTotalsAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDepTrxRecordingUUserTotalsAmn(BigDecimal value) {
        this.inDepTrxRecordingUUserTotalsAmn = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inAuthorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfD0336VInAuthorGroupItem }
     *     
     */
    public ArrayOfD0336VInAuthorGroupItem getInAuthorGroup() {
        return inAuthorGroup;
    }

    /**
     * Sets the value of the inAuthorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfD0336VInAuthorGroupItem }
     *     
     */
    public void setInAuthorGroup(ArrayOfD0336VInAuthorGroupItem value) {
        this.inAuthorGroup = value;
    }

}
