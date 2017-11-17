
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT094V_IbanToProfitsAccountExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT094V_IbanToProfitsAccountExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutIbanIbanWorkSetChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT094V_IbanToProfitsAccountExport", propOrder = {
    "outIbanIbanWorkSetChar37",
    "outProfitsAccountAccStatus",
    "outProfitsAccountAccountCd",
    "outProfitsAccountAccountNumber",
    "outProfitsAccountAgrMembershipSn",
    "outProfitsAccountAgrSn",
    "outProfitsAccountAgrUnit",
    "outProfitsAccountAgrYear",
    "outProfitsAccountCDigit",
    "outProfitsAccountCustId",
    "outProfitsAccountDepAccNumber",
    "outProfitsAccountDepOpenUnit",
    "outProfitsAccountLgAccSn",
    "outProfitsAccountLgOpenUnit",
    "outProfitsAccountLimitCurrency",
    "outProfitsAccountLnsOpenUnit",
    "outProfitsAccountLnsSn",
    "outProfitsAccountLnsType",
    "outProfitsAccountMonotoringUnit",
    "outProfitsAccountMovementCurrency",
    "outProfitsAccountPrftSystem",
    "outProfitsAccountProductId",
    "outProfitsAccountTrOpenUnit",
    "outProfitsAccountTrSn",
    "outProfitsAccountTrType",
    "outStatusIefSuppliedActionEntryDesc"
})
public class PRT094VIbanToProfitsAccountExport
    extends BaseExport
{

    @XmlElement(name = "OutIbanIbanWorkSetChar37")
    protected String outIbanIbanWorkSetChar37;
    @XmlElement(name = "OutProfitsAccountAccStatus")
    protected String outProfitsAccountAccStatus;
    @XmlElement(name = "OutProfitsAccountAccountCd")
    protected short outProfitsAccountAccountCd;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutProfitsAccountAgrMembershipSn")
    protected int outProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutProfitsAccountAgrSn")
    protected int outProfitsAccountAgrSn;
    @XmlElement(name = "OutProfitsAccountAgrUnit")
    protected int outProfitsAccountAgrUnit;
    @XmlElement(name = "OutProfitsAccountAgrYear")
    protected short outProfitsAccountAgrYear;
    @XmlElement(name = "OutProfitsAccountCDigit")
    protected short outProfitsAccountCDigit;
    @XmlElement(name = "OutProfitsAccountCustId")
    protected int outProfitsAccountCustId;
    @XmlElement(name = "OutProfitsAccountDepAccNumber")
    protected double outProfitsAccountDepAccNumber;
    @XmlElement(name = "OutProfitsAccountDepOpenUnit")
    protected int outProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutProfitsAccountLgAccSn")
    protected double outProfitsAccountLgAccSn;
    @XmlElement(name = "OutProfitsAccountLgOpenUnit")
    protected int outProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutProfitsAccountLimitCurrency")
    protected int outProfitsAccountLimitCurrency;
    @XmlElement(name = "OutProfitsAccountLnsOpenUnit")
    protected int outProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutProfitsAccountLnsSn")
    protected int outProfitsAccountLnsSn;
    @XmlElement(name = "OutProfitsAccountLnsType")
    protected short outProfitsAccountLnsType;
    @XmlElement(name = "OutProfitsAccountMonotoringUnit")
    protected int outProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutProfitsAccountMovementCurrency")
    protected int outProfitsAccountMovementCurrency;
    @XmlElement(name = "OutProfitsAccountPrftSystem")
    protected short outProfitsAccountPrftSystem;
    @XmlElement(name = "OutProfitsAccountProductId")
    protected int outProfitsAccountProductId;
    @XmlElement(name = "OutProfitsAccountTrOpenUnit")
    protected int outProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutProfitsAccountTrSn")
    protected int outProfitsAccountTrSn;
    @XmlElement(name = "OutProfitsAccountTrType")
    protected short outProfitsAccountTrType;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;

    /**
     * Gets the value of the outIbanIbanWorkSetChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIbanIbanWorkSetChar37() {
        return outIbanIbanWorkSetChar37;
    }

    /**
     * Sets the value of the outIbanIbanWorkSetChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIbanIbanWorkSetChar37(String value) {
        this.outIbanIbanWorkSetChar37 = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccStatus() {
        return outProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccStatus(String value) {
        this.outProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public short getOutProfitsAccountAccountCd() {
        return outProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public void setOutProfitsAccountAccountCd(short value) {
        this.outProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutProfitsAccountAgrMembershipSn() {
        return outProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutProfitsAccountAgrMembershipSn(int value) {
        this.outProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrSn property.
     * 
     */
    public int getOutProfitsAccountAgrSn() {
        return outProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outProfitsAccountAgrSn property.
     * 
     */
    public void setOutProfitsAccountAgrSn(int value) {
        this.outProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrUnit property.
     * 
     */
    public int getOutProfitsAccountAgrUnit() {
        return outProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outProfitsAccountAgrUnit property.
     * 
     */
    public void setOutProfitsAccountAgrUnit(int value) {
        this.outProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountAgrYear property.
     * 
     */
    public short getOutProfitsAccountAgrYear() {
        return outProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outProfitsAccountAgrYear property.
     * 
     */
    public void setOutProfitsAccountAgrYear(short value) {
        this.outProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outProfitsAccountCDigit property.
     * 
     */
    public short getOutProfitsAccountCDigit() {
        return outProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outProfitsAccountCDigit property.
     * 
     */
    public void setOutProfitsAccountCDigit(short value) {
        this.outProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outProfitsAccountCustId property.
     * 
     */
    public int getOutProfitsAccountCustId() {
        return outProfitsAccountCustId;
    }

    /**
     * Sets the value of the outProfitsAccountCustId property.
     * 
     */
    public void setOutProfitsAccountCustId(int value) {
        this.outProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutProfitsAccountDepAccNumber() {
        return outProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutProfitsAccountDepAccNumber(double value) {
        this.outProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutProfitsAccountDepOpenUnit() {
        return outProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutProfitsAccountDepOpenUnit(int value) {
        this.outProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountLgAccSn property.
     * 
     */
    public double getOutProfitsAccountLgAccSn() {
        return outProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outProfitsAccountLgAccSn property.
     * 
     */
    public void setOutProfitsAccountLgAccSn(double value) {
        this.outProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutProfitsAccountLgOpenUnit() {
        return outProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutProfitsAccountLgOpenUnit(int value) {
        this.outProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutProfitsAccountLimitCurrency() {
        return outProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutProfitsAccountLimitCurrency(int value) {
        this.outProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutProfitsAccountLnsOpenUnit() {
        return outProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutProfitsAccountLnsOpenUnit(int value) {
        this.outProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountLnsSn property.
     * 
     */
    public int getOutProfitsAccountLnsSn() {
        return outProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outProfitsAccountLnsSn property.
     * 
     */
    public void setOutProfitsAccountLnsSn(int value) {
        this.outProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountLnsType property.
     * 
     */
    public short getOutProfitsAccountLnsType() {
        return outProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outProfitsAccountLnsType property.
     * 
     */
    public void setOutProfitsAccountLnsType(short value) {
        this.outProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutProfitsAccountMonotoringUnit() {
        return outProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutProfitsAccountMonotoringUnit(int value) {
        this.outProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutProfitsAccountMovementCurrency() {
        return outProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutProfitsAccountMovementCurrency(int value) {
        this.outProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outProfitsAccountPrftSystem property.
     * 
     */
    public short getOutProfitsAccountPrftSystem() {
        return outProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outProfitsAccountPrftSystem property.
     * 
     */
    public void setOutProfitsAccountPrftSystem(short value) {
        this.outProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outProfitsAccountProductId property.
     * 
     */
    public int getOutProfitsAccountProductId() {
        return outProfitsAccountProductId;
    }

    /**
     * Sets the value of the outProfitsAccountProductId property.
     * 
     */
    public void setOutProfitsAccountProductId(int value) {
        this.outProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutProfitsAccountTrOpenUnit() {
        return outProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutProfitsAccountTrOpenUnit(int value) {
        this.outProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outProfitsAccountTrSn property.
     * 
     */
    public int getOutProfitsAccountTrSn() {
        return outProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outProfitsAccountTrSn property.
     * 
     */
    public void setOutProfitsAccountTrSn(int value) {
        this.outProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outProfitsAccountTrType property.
     * 
     */
    public short getOutProfitsAccountTrType() {
        return outProfitsAccountTrType;
    }

    /**
     * Sets the value of the outProfitsAccountTrType property.
     * 
     */
    public void setOutProfitsAccountTrType(short value) {
        this.outProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

}
