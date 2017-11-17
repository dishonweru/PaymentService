
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MC2004VAccountCollateralsQueryImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MC2004VAccountCollateralsQueryImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAccountUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCollateralWorkSelection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLoanAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MC2004VAccountCollateralsQueryImport", propOrder = {
    "command",
    "inAccountUnitCode",
    "inCollateralWorkSelection",
    "inDefaultJustificIdJustific",
    "inDefaultProductIdProduct",
    "inIefSuppliedCommand",
    "inLoanAccountAccCd",
    "inLoanAccountAccSn",
    "inLoanAccountAccType",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inProfitsAccountAccStatus",
    "inProfitsAccountAccountCd",
    "inProfitsAccountAccountNumber",
    "inProfitsAccountAgrMembershipSn",
    "inProfitsAccountAgrSn",
    "inProfitsAccountAgrUnit",
    "inProfitsAccountAgrYear",
    "inProfitsAccountCustId",
    "inProfitsAccountDepAccNumber",
    "inProfitsAccountDepOpenUnit",
    "inProfitsAccountLgAccSn",
    "inProfitsAccountLgOpenUnit",
    "inProfitsAccountLimitCurrency",
    "inProfitsAccountLnsOpenUnit",
    "inProfitsAccountLnsSn",
    "inProfitsAccountLnsType",
    "inProfitsAccountMonotoringUnit",
    "inProfitsAccountMovementCurrency",
    "inProfitsAccountPrftSystem",
    "inProfitsAccountProductId",
    "inProfitsAccountTrOpenUnit",
    "inProfitsAccountTrSn",
    "inProfitsAccountTrType"
})
public class MC2004VAccountCollateralsQueryImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAccountUnitCode")
    protected int inAccountUnitCode;
    @XmlElement(name = "InCollateralWorkSelection")
    protected String inCollateralWorkSelection;
    @XmlElement(name = "InDefaultJustificIdJustific")
    protected int inDefaultJustificIdJustific;
    @XmlElement(name = "InDefaultProductIdProduct")
    protected int inDefaultProductIdProduct;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InLoanAccountAccCd")
    protected short inLoanAccountAccCd;
    @XmlElement(name = "InLoanAccountAccSn")
    protected int inLoanAccountAccSn;
    @XmlElement(name = "InLoanAccountAccType")
    protected short inLoanAccountAccType;
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
    @XmlElement(name = "InProfitsAccountAccStatus")
    protected String inProfitsAccountAccStatus;
    @XmlElement(name = "InProfitsAccountAccountCd")
    protected short inProfitsAccountAccountCd;
    @XmlElement(name = "InProfitsAccountAccountNumber")
    protected String inProfitsAccountAccountNumber;
    @XmlElement(name = "InProfitsAccountAgrMembershipSn")
    protected int inProfitsAccountAgrMembershipSn;
    @XmlElement(name = "InProfitsAccountAgrSn")
    protected int inProfitsAccountAgrSn;
    @XmlElement(name = "InProfitsAccountAgrUnit")
    protected int inProfitsAccountAgrUnit;
    @XmlElement(name = "InProfitsAccountAgrYear")
    protected short inProfitsAccountAgrYear;
    @XmlElement(name = "InProfitsAccountCustId")
    protected int inProfitsAccountCustId;
    @XmlElement(name = "InProfitsAccountDepAccNumber")
    protected double inProfitsAccountDepAccNumber;
    @XmlElement(name = "InProfitsAccountDepOpenUnit")
    protected int inProfitsAccountDepOpenUnit;
    @XmlElement(name = "InProfitsAccountLgAccSn")
    protected double inProfitsAccountLgAccSn;
    @XmlElement(name = "InProfitsAccountLgOpenUnit")
    protected int inProfitsAccountLgOpenUnit;
    @XmlElement(name = "InProfitsAccountLimitCurrency")
    protected int inProfitsAccountLimitCurrency;
    @XmlElement(name = "InProfitsAccountLnsOpenUnit")
    protected int inProfitsAccountLnsOpenUnit;
    @XmlElement(name = "InProfitsAccountLnsSn")
    protected int inProfitsAccountLnsSn;
    @XmlElement(name = "InProfitsAccountLnsType")
    protected short inProfitsAccountLnsType;
    @XmlElement(name = "InProfitsAccountMonotoringUnit")
    protected int inProfitsAccountMonotoringUnit;
    @XmlElement(name = "InProfitsAccountMovementCurrency")
    protected int inProfitsAccountMovementCurrency;
    @XmlElement(name = "InProfitsAccountPrftSystem")
    protected short inProfitsAccountPrftSystem;
    @XmlElement(name = "InProfitsAccountProductId")
    protected int inProfitsAccountProductId;
    @XmlElement(name = "InProfitsAccountTrOpenUnit")
    protected int inProfitsAccountTrOpenUnit;
    @XmlElement(name = "InProfitsAccountTrSn")
    protected int inProfitsAccountTrSn;
    @XmlElement(name = "InProfitsAccountTrType")
    protected short inProfitsAccountTrType;

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
     * Gets the value of the inAccountUnitCode property.
     * 
     */
    public int getInAccountUnitCode() {
        return inAccountUnitCode;
    }

    /**
     * Sets the value of the inAccountUnitCode property.
     * 
     */
    public void setInAccountUnitCode(int value) {
        this.inAccountUnitCode = value;
    }

    /**
     * Gets the value of the inCollateralWorkSelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCollateralWorkSelection() {
        return inCollateralWorkSelection;
    }

    /**
     * Sets the value of the inCollateralWorkSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCollateralWorkSelection(String value) {
        this.inCollateralWorkSelection = value;
    }

    /**
     * Gets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public int getInDefaultJustificIdJustific() {
        return inDefaultJustificIdJustific;
    }

    /**
     * Sets the value of the inDefaultJustificIdJustific property.
     * 
     */
    public void setInDefaultJustificIdJustific(int value) {
        this.inDefaultJustificIdJustific = value;
    }

    /**
     * Gets the value of the inDefaultProductIdProduct property.
     * 
     */
    public int getInDefaultProductIdProduct() {
        return inDefaultProductIdProduct;
    }

    /**
     * Sets the value of the inDefaultProductIdProduct property.
     * 
     */
    public void setInDefaultProductIdProduct(int value) {
        this.inDefaultProductIdProduct = value;
    }

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
     * Gets the value of the inLoanAccountAccCd property.
     * 
     */
    public short getInLoanAccountAccCd() {
        return inLoanAccountAccCd;
    }

    /**
     * Sets the value of the inLoanAccountAccCd property.
     * 
     */
    public void setInLoanAccountAccCd(short value) {
        this.inLoanAccountAccCd = value;
    }

    /**
     * Gets the value of the inLoanAccountAccSn property.
     * 
     */
    public int getInLoanAccountAccSn() {
        return inLoanAccountAccSn;
    }

    /**
     * Sets the value of the inLoanAccountAccSn property.
     * 
     */
    public void setInLoanAccountAccSn(int value) {
        this.inLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the inLoanAccountAccType property.
     * 
     */
    public short getInLoanAccountAccType() {
        return inLoanAccountAccType;
    }

    /**
     * Sets the value of the inLoanAccountAccType property.
     * 
     */
    public void setInLoanAccountAccType(short value) {
        this.inLoanAccountAccType = value;
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
     * Gets the value of the inProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccStatus() {
        return inProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the inProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccStatus(String value) {
        this.inProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public short getInProfitsAccountAccountCd() {
        return inProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inProfitsAccountAccountCd property.
     * 
     */
    public void setInProfitsAccountAccountCd(short value) {
        this.inProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProfitsAccountAccountNumber() {
        return inProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProfitsAccountAccountNumber(String value) {
        this.inProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getInProfitsAccountAgrMembershipSn() {
        return inProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the inProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setInProfitsAccountAgrMembershipSn(int value) {
        this.inProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inProfitsAccountAgrSn property.
     * 
     */
    public int getInProfitsAccountAgrSn() {
        return inProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the inProfitsAccountAgrSn property.
     * 
     */
    public void setInProfitsAccountAgrSn(int value) {
        this.inProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the inProfitsAccountAgrUnit property.
     * 
     */
    public int getInProfitsAccountAgrUnit() {
        return inProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the inProfitsAccountAgrUnit property.
     * 
     */
    public void setInProfitsAccountAgrUnit(int value) {
        this.inProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the inProfitsAccountAgrYear property.
     * 
     */
    public short getInProfitsAccountAgrYear() {
        return inProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the inProfitsAccountAgrYear property.
     * 
     */
    public void setInProfitsAccountAgrYear(short value) {
        this.inProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the inProfitsAccountCustId property.
     * 
     */
    public int getInProfitsAccountCustId() {
        return inProfitsAccountCustId;
    }

    /**
     * Sets the value of the inProfitsAccountCustId property.
     * 
     */
    public void setInProfitsAccountCustId(int value) {
        this.inProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the inProfitsAccountDepAccNumber property.
     * 
     */
    public double getInProfitsAccountDepAccNumber() {
        return inProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the inProfitsAccountDepAccNumber property.
     * 
     */
    public void setInProfitsAccountDepAccNumber(double value) {
        this.inProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the inProfitsAccountDepOpenUnit property.
     * 
     */
    public int getInProfitsAccountDepOpenUnit() {
        return inProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the inProfitsAccountDepOpenUnit property.
     * 
     */
    public void setInProfitsAccountDepOpenUnit(int value) {
        this.inProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the inProfitsAccountLgAccSn property.
     * 
     */
    public double getInProfitsAccountLgAccSn() {
        return inProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the inProfitsAccountLgAccSn property.
     * 
     */
    public void setInProfitsAccountLgAccSn(double value) {
        this.inProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the inProfitsAccountLgOpenUnit property.
     * 
     */
    public int getInProfitsAccountLgOpenUnit() {
        return inProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the inProfitsAccountLgOpenUnit property.
     * 
     */
    public void setInProfitsAccountLgOpenUnit(int value) {
        this.inProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the inProfitsAccountLimitCurrency property.
     * 
     */
    public int getInProfitsAccountLimitCurrency() {
        return inProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the inProfitsAccountLimitCurrency property.
     * 
     */
    public void setInProfitsAccountLimitCurrency(int value) {
        this.inProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the inProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getInProfitsAccountLnsOpenUnit() {
        return inProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the inProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setInProfitsAccountLnsOpenUnit(int value) {
        this.inProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the inProfitsAccountLnsSn property.
     * 
     */
    public int getInProfitsAccountLnsSn() {
        return inProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the inProfitsAccountLnsSn property.
     * 
     */
    public void setInProfitsAccountLnsSn(int value) {
        this.inProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the inProfitsAccountLnsType property.
     * 
     */
    public short getInProfitsAccountLnsType() {
        return inProfitsAccountLnsType;
    }

    /**
     * Sets the value of the inProfitsAccountLnsType property.
     * 
     */
    public void setInProfitsAccountLnsType(short value) {
        this.inProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the inProfitsAccountMonotoringUnit property.
     * 
     */
    public int getInProfitsAccountMonotoringUnit() {
        return inProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the inProfitsAccountMonotoringUnit property.
     * 
     */
    public void setInProfitsAccountMonotoringUnit(int value) {
        this.inProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the inProfitsAccountMovementCurrency property.
     * 
     */
    public int getInProfitsAccountMovementCurrency() {
        return inProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the inProfitsAccountMovementCurrency property.
     * 
     */
    public void setInProfitsAccountMovementCurrency(int value) {
        this.inProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public short getInProfitsAccountPrftSystem() {
        return inProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inProfitsAccountPrftSystem property.
     * 
     */
    public void setInProfitsAccountPrftSystem(short value) {
        this.inProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inProfitsAccountProductId property.
     * 
     */
    public int getInProfitsAccountProductId() {
        return inProfitsAccountProductId;
    }

    /**
     * Sets the value of the inProfitsAccountProductId property.
     * 
     */
    public void setInProfitsAccountProductId(int value) {
        this.inProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the inProfitsAccountTrOpenUnit property.
     * 
     */
    public int getInProfitsAccountTrOpenUnit() {
        return inProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the inProfitsAccountTrOpenUnit property.
     * 
     */
    public void setInProfitsAccountTrOpenUnit(int value) {
        this.inProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the inProfitsAccountTrSn property.
     * 
     */
    public int getInProfitsAccountTrSn() {
        return inProfitsAccountTrSn;
    }

    /**
     * Sets the value of the inProfitsAccountTrSn property.
     * 
     */
    public void setInProfitsAccountTrSn(int value) {
        this.inProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the inProfitsAccountTrType property.
     * 
     */
    public short getInProfitsAccountTrType() {
        return inProfitsAccountTrType;
    }

    /**
     * Sets the value of the inProfitsAccountTrType property.
     * 
     */
    public void setInProfitsAccountTrType(short value) {
        this.inProfitsAccountTrType = value;
    }

}
