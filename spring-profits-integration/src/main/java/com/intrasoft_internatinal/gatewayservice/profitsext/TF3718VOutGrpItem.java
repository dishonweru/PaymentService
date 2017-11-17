
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TF3718VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TF3718VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitDocLotSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitLcAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitPaymSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitSettlSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTfExtraitSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTrxInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTfExtraitTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TF3718VOutGrpItem", propOrder = {
    "outGrpOutGrmIefSuppliedAmount",
    "outGrpOutGrmJustificDescription",
    "outGrpOutGrmPrftTransactionDescription",
    "outGrpOutGrmTfExtraitDocLotSn",
    "outGrpOutGrmTfExtraitJustific",
    "outGrpOutGrmTfExtraitLcAccountNumber",
    "outGrpOutGrmTfExtraitPaymSn",
    "outGrpOutGrmTfExtraitReversalFlag",
    "outGrpOutGrmTfExtraitSettlSn",
    "outGrpOutGrmTfExtraitTfExtraitSn",
    "outGrpOutGrmTfExtraitTfNumber",
    "outGrpOutGrmTfExtraitTrxCode",
    "outGrpOutGrmTfExtraitTrxDate",
    "outGrpOutGrmTfExtraitTrxInternalSn",
    "outGrpOutGrmTfExtraitTrxSn",
    "outGrpOutGrmTfExtraitTrxUnit",
    "outGrpOutGrmTfExtraitTrxUser"
})
public class TF3718VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmIefSuppliedAmount", required = true)
    protected BigDecimal outGrpOutGrmIefSuppliedAmount;
    @XmlElement(name = "OutGrpOutGrmJustificDescription")
    protected String outGrpOutGrmJustificDescription;
    @XmlElement(name = "OutGrpOutGrmPrftTransactionDescription")
    protected String outGrpOutGrmPrftTransactionDescription;
    @XmlElement(name = "OutGrpOutGrmTfExtraitDocLotSn")
    protected short outGrpOutGrmTfExtraitDocLotSn;
    @XmlElement(name = "OutGrpOutGrmTfExtraitJustific")
    protected int outGrpOutGrmTfExtraitJustific;
    @XmlElement(name = "OutGrpOutGrmTfExtraitLcAccountNumber")
    protected String outGrpOutGrmTfExtraitLcAccountNumber;
    @XmlElement(name = "OutGrpOutGrmTfExtraitPaymSn")
    protected short outGrpOutGrmTfExtraitPaymSn;
    @XmlElement(name = "OutGrpOutGrmTfExtraitReversalFlag")
    protected String outGrpOutGrmTfExtraitReversalFlag;
    @XmlElement(name = "OutGrpOutGrmTfExtraitSettlSn")
    protected short outGrpOutGrmTfExtraitSettlSn;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTfExtraitSn")
    protected int outGrpOutGrmTfExtraitTfExtraitSn;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTfNumber")
    protected String outGrpOutGrmTfExtraitTfNumber;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTrxCode")
    protected int outGrpOutGrmTfExtraitTrxCode;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTfExtraitTrxDate;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTrxInternalSn")
    protected short outGrpOutGrmTfExtraitTrxInternalSn;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTrxSn")
    protected int outGrpOutGrmTfExtraitTrxSn;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTrxUnit")
    protected int outGrpOutGrmTfExtraitTrxUnit;
    @XmlElement(name = "OutGrpOutGrmTfExtraitTrxUser")
    protected String outGrpOutGrmTfExtraitTrxUser;

    /**
     * Gets the value of the outGrpOutGrmIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmIefSuppliedAmount() {
        return outGrpOutGrmIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGrpOutGrmIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmIefSuppliedAmount(BigDecimal value) {
        this.outGrpOutGrmIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpOutGrmJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmJustificDescription() {
        return outGrpOutGrmJustificDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmJustificDescription(String value) {
        this.outGrpOutGrmJustificDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPrftTransactionDescription() {
        return outGrpOutGrmPrftTransactionDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPrftTransactionDescription(String value) {
        this.outGrpOutGrmPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitDocLotSn property.
     * 
     */
    public short getOutGrpOutGrmTfExtraitDocLotSn() {
        return outGrpOutGrmTfExtraitDocLotSn;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitDocLotSn property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitDocLotSn(short value) {
        this.outGrpOutGrmTfExtraitDocLotSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitJustific property.
     * 
     */
    public int getOutGrpOutGrmTfExtraitJustific() {
        return outGrpOutGrmTfExtraitJustific;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitJustific property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitJustific(int value) {
        this.outGrpOutGrmTfExtraitJustific = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitLcAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTfExtraitLcAccountNumber() {
        return outGrpOutGrmTfExtraitLcAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitLcAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTfExtraitLcAccountNumber(String value) {
        this.outGrpOutGrmTfExtraitLcAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitPaymSn property.
     * 
     */
    public short getOutGrpOutGrmTfExtraitPaymSn() {
        return outGrpOutGrmTfExtraitPaymSn;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitPaymSn property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitPaymSn(short value) {
        this.outGrpOutGrmTfExtraitPaymSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTfExtraitReversalFlag() {
        return outGrpOutGrmTfExtraitReversalFlag;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTfExtraitReversalFlag(String value) {
        this.outGrpOutGrmTfExtraitReversalFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitSettlSn property.
     * 
     */
    public short getOutGrpOutGrmTfExtraitSettlSn() {
        return outGrpOutGrmTfExtraitSettlSn;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitSettlSn property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitSettlSn(short value) {
        this.outGrpOutGrmTfExtraitSettlSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTfExtraitSn property.
     * 
     */
    public int getOutGrpOutGrmTfExtraitTfExtraitSn() {
        return outGrpOutGrmTfExtraitTfExtraitSn;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTfExtraitSn property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitTfExtraitSn(int value) {
        this.outGrpOutGrmTfExtraitTfExtraitSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTfExtraitTfNumber() {
        return outGrpOutGrmTfExtraitTfNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTfExtraitTfNumber(String value) {
        this.outGrpOutGrmTfExtraitTfNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTrxCode property.
     * 
     */
    public int getOutGrpOutGrmTfExtraitTrxCode() {
        return outGrpOutGrmTfExtraitTrxCode;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTrxCode property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitTrxCode(int value) {
        this.outGrpOutGrmTfExtraitTrxCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTfExtraitTrxDate() {
        return outGrpOutGrmTfExtraitTrxDate;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTfExtraitTrxDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmTfExtraitTrxDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTrxInternalSn property.
     * 
     */
    public short getOutGrpOutGrmTfExtraitTrxInternalSn() {
        return outGrpOutGrmTfExtraitTrxInternalSn;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTrxInternalSn property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitTrxInternalSn(short value) {
        this.outGrpOutGrmTfExtraitTrxInternalSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTrxSn property.
     * 
     */
    public int getOutGrpOutGrmTfExtraitTrxSn() {
        return outGrpOutGrmTfExtraitTrxSn;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTrxSn property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitTrxSn(int value) {
        this.outGrpOutGrmTfExtraitTrxSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTrxUnit property.
     * 
     */
    public int getOutGrpOutGrmTfExtraitTrxUnit() {
        return outGrpOutGrmTfExtraitTrxUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTrxUnit property.
     * 
     */
    public void setOutGrpOutGrmTfExtraitTrxUnit(int value) {
        this.outGrpOutGrmTfExtraitTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTfExtraitTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTfExtraitTrxUser() {
        return outGrpOutGrmTfExtraitTrxUser;
    }

    /**
     * Sets the value of the outGrpOutGrmTfExtraitTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTfExtraitTrxUser(String value) {
        this.outGrpOutGrmTfExtraitTrxUser = value;
    }

}
