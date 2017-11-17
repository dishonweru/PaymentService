
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Adds01AdditionalTransactionPostingExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adds01AdditionalTransactionPostingExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutDuplicateFxFtRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDuplicateFxFtRecordingTrxSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDuplicateFxFtRecordingTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDuplicateFxFtRecordingTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDuplicateFxFtRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutErrorInLineNumberIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutFixingRateRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGlgAccountSecLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutInputFxftJustificJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInputFxftJustificJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileHeaderLogChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileHeaderLogProductionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLogfileHeaderLogProductionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLogfileHeaderLogTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLogfileHeaderLogTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLogfileHeaderLogTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultAmountIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSystemPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutglevelUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutglevelUsrGlLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TrustClients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutGrpVoucher" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfAdds01OutGrpVoucherItem" minOccurs="0"/>
 *         &lt;element name="OutLogfileGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfAdds01OutLogfileGroupItem" minOccurs="0"/>
 *         &lt;element name="OutPrintingGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfAdds01OutPrintingGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adds01AdditionalTransactionPostingExport", propOrder = {
    "outDuplicateFxFtRecordingTrxDate",
    "outDuplicateFxFtRecordingTrxSn",
    "outDuplicateFxFtRecordingTrxUnit",
    "outDuplicateFxFtRecordingTrxUsr",
    "outDuplicateFxFtRecordingTunInternalSn",
    "outErrorInLineNumberIefSuppliedCount",
    "outFixingRateRate",
    "outGlgAccountAccountId",
    "outGlgAccountSecLevel",
    "outInputFxftJustificJustificDescription",
    "outInputFxftJustificJustificIdJustific",
    "outLogfileHeaderLogChannelId",
    "outLogfileHeaderLogProductionDate",
    "outLogfileHeaderLogProductionTime",
    "outLogfileHeaderLogTrxDate",
    "outLogfileHeaderLogTrxUnit",
    "outLogfileHeaderLogTrxUsr",
    "outResultAmountIefSuppliedAmount",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedSrvStatus",
    "outSystemPrintLineDate",
    "outglevelUsrCode",
    "outglevelUsrGlLevel",
    "trustClients",
    "outGrpVoucher",
    "outLogfileGroup",
    "outPrintingGrp"
})
public class Adds01AdditionalTransactionPostingExport
    extends BaseExport
{

    @XmlElement(name = "OutDuplicateFxFtRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDuplicateFxFtRecordingTrxDate;
    @XmlElement(name = "OutDuplicateFxFtRecordingTrxSn")
    protected int outDuplicateFxFtRecordingTrxSn;
    @XmlElement(name = "OutDuplicateFxFtRecordingTrxUnit")
    protected int outDuplicateFxFtRecordingTrxUnit;
    @XmlElement(name = "OutDuplicateFxFtRecordingTrxUsr")
    protected String outDuplicateFxFtRecordingTrxUsr;
    @XmlElement(name = "OutDuplicateFxFtRecordingTunInternalSn")
    protected short outDuplicateFxFtRecordingTunInternalSn;
    @XmlElement(name = "OutErrorInLineNumberIefSuppliedCount")
    protected int outErrorInLineNumberIefSuppliedCount;
    @XmlElement(name = "OutFixingRateRate", required = true)
    protected BigDecimal outFixingRateRate;
    @XmlElement(name = "OutGlgAccountAccountId")
    protected String outGlgAccountAccountId;
    @XmlElement(name = "OutGlgAccountSecLevel")
    protected short outGlgAccountSecLevel;
    @XmlElement(name = "OutInputFxftJustificJustificDescription")
    protected String outInputFxftJustificJustificDescription;
    @XmlElement(name = "OutInputFxftJustificJustificIdJustific")
    protected int outInputFxftJustificJustificIdJustific;
    @XmlElement(name = "OutLogfileHeaderLogChannelId")
    protected int outLogfileHeaderLogChannelId;
    @XmlElement(name = "OutLogfileHeaderLogProductionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLogfileHeaderLogProductionDate;
    @XmlElement(name = "OutLogfileHeaderLogProductionTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLogfileHeaderLogProductionTime;
    @XmlElement(name = "OutLogfileHeaderLogTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLogfileHeaderLogTrxDate;
    @XmlElement(name = "OutLogfileHeaderLogTrxUnit")
    protected int outLogfileHeaderLogTrxUnit;
    @XmlElement(name = "OutLogfileHeaderLogTrxUsr")
    protected String outLogfileHeaderLogTrxUsr;
    @XmlElement(name = "OutResultAmountIefSuppliedAmount", required = true)
    protected BigDecimal outResultAmountIefSuppliedAmount;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutSystemPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSystemPrintLineDate;
    @XmlElement(name = "OutglevelUsrCode")
    protected String outglevelUsrCode;
    @XmlElement(name = "OutglevelUsrGlLevel")
    protected short outglevelUsrGlLevel;
    @XmlElement(name = "TrustClients")
    protected boolean trustClients;
    @XmlElement(name = "OutGrpVoucher")
    protected ArrayOfAdds01OutGrpVoucherItem outGrpVoucher;
    @XmlElement(name = "OutLogfileGroup")
    protected ArrayOfAdds01OutLogfileGroupItem outLogfileGroup;
    @XmlElement(name = "OutPrintingGrp")
    protected ArrayOfAdds01OutPrintingGrpItem outPrintingGrp;

    /**
     * Gets the value of the outDuplicateFxFtRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDuplicateFxFtRecordingTrxDate() {
        return outDuplicateFxFtRecordingTrxDate;
    }

    /**
     * Sets the value of the outDuplicateFxFtRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDuplicateFxFtRecordingTrxDate(XMLGregorianCalendar value) {
        this.outDuplicateFxFtRecordingTrxDate = value;
    }

    /**
     * Gets the value of the outDuplicateFxFtRecordingTrxSn property.
     * 
     */
    public int getOutDuplicateFxFtRecordingTrxSn() {
        return outDuplicateFxFtRecordingTrxSn;
    }

    /**
     * Sets the value of the outDuplicateFxFtRecordingTrxSn property.
     * 
     */
    public void setOutDuplicateFxFtRecordingTrxSn(int value) {
        this.outDuplicateFxFtRecordingTrxSn = value;
    }

    /**
     * Gets the value of the outDuplicateFxFtRecordingTrxUnit property.
     * 
     */
    public int getOutDuplicateFxFtRecordingTrxUnit() {
        return outDuplicateFxFtRecordingTrxUnit;
    }

    /**
     * Sets the value of the outDuplicateFxFtRecordingTrxUnit property.
     * 
     */
    public void setOutDuplicateFxFtRecordingTrxUnit(int value) {
        this.outDuplicateFxFtRecordingTrxUnit = value;
    }

    /**
     * Gets the value of the outDuplicateFxFtRecordingTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDuplicateFxFtRecordingTrxUsr() {
        return outDuplicateFxFtRecordingTrxUsr;
    }

    /**
     * Sets the value of the outDuplicateFxFtRecordingTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDuplicateFxFtRecordingTrxUsr(String value) {
        this.outDuplicateFxFtRecordingTrxUsr = value;
    }

    /**
     * Gets the value of the outDuplicateFxFtRecordingTunInternalSn property.
     * 
     */
    public short getOutDuplicateFxFtRecordingTunInternalSn() {
        return outDuplicateFxFtRecordingTunInternalSn;
    }

    /**
     * Sets the value of the outDuplicateFxFtRecordingTunInternalSn property.
     * 
     */
    public void setOutDuplicateFxFtRecordingTunInternalSn(short value) {
        this.outDuplicateFxFtRecordingTunInternalSn = value;
    }

    /**
     * Gets the value of the outErrorInLineNumberIefSuppliedCount property.
     * 
     */
    public int getOutErrorInLineNumberIefSuppliedCount() {
        return outErrorInLineNumberIefSuppliedCount;
    }

    /**
     * Sets the value of the outErrorInLineNumberIefSuppliedCount property.
     * 
     */
    public void setOutErrorInLineNumberIefSuppliedCount(int value) {
        this.outErrorInLineNumberIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outFixingRateRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutFixingRateRate() {
        return outFixingRateRate;
    }

    /**
     * Sets the value of the outFixingRateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutFixingRateRate(BigDecimal value) {
        this.outFixingRateRate = value;
    }

    /**
     * Gets the value of the outGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlgAccountAccountId() {
        return outGlgAccountAccountId;
    }

    /**
     * Sets the value of the outGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlgAccountAccountId(String value) {
        this.outGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the outGlgAccountSecLevel property.
     * 
     */
    public short getOutGlgAccountSecLevel() {
        return outGlgAccountSecLevel;
    }

    /**
     * Sets the value of the outGlgAccountSecLevel property.
     * 
     */
    public void setOutGlgAccountSecLevel(short value) {
        this.outGlgAccountSecLevel = value;
    }

    /**
     * Gets the value of the outInputFxftJustificJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInputFxftJustificJustificDescription() {
        return outInputFxftJustificJustificDescription;
    }

    /**
     * Sets the value of the outInputFxftJustificJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInputFxftJustificJustificDescription(String value) {
        this.outInputFxftJustificJustificDescription = value;
    }

    /**
     * Gets the value of the outInputFxftJustificJustificIdJustific property.
     * 
     */
    public int getOutInputFxftJustificJustificIdJustific() {
        return outInputFxftJustificJustificIdJustific;
    }

    /**
     * Sets the value of the outInputFxftJustificJustificIdJustific property.
     * 
     */
    public void setOutInputFxftJustificJustificIdJustific(int value) {
        this.outInputFxftJustificJustificIdJustific = value;
    }

    /**
     * Gets the value of the outLogfileHeaderLogChannelId property.
     * 
     */
    public int getOutLogfileHeaderLogChannelId() {
        return outLogfileHeaderLogChannelId;
    }

    /**
     * Sets the value of the outLogfileHeaderLogChannelId property.
     * 
     */
    public void setOutLogfileHeaderLogChannelId(int value) {
        this.outLogfileHeaderLogChannelId = value;
    }

    /**
     * Gets the value of the outLogfileHeaderLogProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLogfileHeaderLogProductionDate() {
        return outLogfileHeaderLogProductionDate;
    }

    /**
     * Sets the value of the outLogfileHeaderLogProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLogfileHeaderLogProductionDate(XMLGregorianCalendar value) {
        this.outLogfileHeaderLogProductionDate = value;
    }

    /**
     * Gets the value of the outLogfileHeaderLogProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLogfileHeaderLogProductionTime() {
        return outLogfileHeaderLogProductionTime;
    }

    /**
     * Sets the value of the outLogfileHeaderLogProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLogfileHeaderLogProductionTime(XMLGregorianCalendar value) {
        this.outLogfileHeaderLogProductionTime = value;
    }

    /**
     * Gets the value of the outLogfileHeaderLogTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLogfileHeaderLogTrxDate() {
        return outLogfileHeaderLogTrxDate;
    }

    /**
     * Sets the value of the outLogfileHeaderLogTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLogfileHeaderLogTrxDate(XMLGregorianCalendar value) {
        this.outLogfileHeaderLogTrxDate = value;
    }

    /**
     * Gets the value of the outLogfileHeaderLogTrxUnit property.
     * 
     */
    public int getOutLogfileHeaderLogTrxUnit() {
        return outLogfileHeaderLogTrxUnit;
    }

    /**
     * Sets the value of the outLogfileHeaderLogTrxUnit property.
     * 
     */
    public void setOutLogfileHeaderLogTrxUnit(int value) {
        this.outLogfileHeaderLogTrxUnit = value;
    }

    /**
     * Gets the value of the outLogfileHeaderLogTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLogfileHeaderLogTrxUsr() {
        return outLogfileHeaderLogTrxUsr;
    }

    /**
     * Sets the value of the outLogfileHeaderLogTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLogfileHeaderLogTrxUsr(String value) {
        this.outLogfileHeaderLogTrxUsr = value;
    }

    /**
     * Gets the value of the outResultAmountIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutResultAmountIefSuppliedAmount() {
        return outResultAmountIefSuppliedAmount;
    }

    /**
     * Sets the value of the outResultAmountIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutResultAmountIefSuppliedAmount(BigDecimal value) {
        this.outResultAmountIefSuppliedAmount = value;
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

    /**
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outSystemPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSystemPrintLineDate() {
        return outSystemPrintLineDate;
    }

    /**
     * Sets the value of the outSystemPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSystemPrintLineDate(XMLGregorianCalendar value) {
        this.outSystemPrintLineDate = value;
    }

    /**
     * Gets the value of the outglevelUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutglevelUsrCode() {
        return outglevelUsrCode;
    }

    /**
     * Sets the value of the outglevelUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutglevelUsrCode(String value) {
        this.outglevelUsrCode = value;
    }

    /**
     * Gets the value of the outglevelUsrGlLevel property.
     * 
     */
    public short getOutglevelUsrGlLevel() {
        return outglevelUsrGlLevel;
    }

    /**
     * Sets the value of the outglevelUsrGlLevel property.
     * 
     */
    public void setOutglevelUsrGlLevel(short value) {
        this.outglevelUsrGlLevel = value;
    }

    /**
     * Gets the value of the trustClients property.
     * 
     */
    public boolean isTrustClients() {
        return trustClients;
    }

    /**
     * Sets the value of the trustClients property.
     * 
     */
    public void setTrustClients(boolean value) {
        this.trustClients = value;
    }

    /**
     * Gets the value of the outGrpVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdds01OutGrpVoucherItem }
     *     
     */
    public ArrayOfAdds01OutGrpVoucherItem getOutGrpVoucher() {
        return outGrpVoucher;
    }

    /**
     * Sets the value of the outGrpVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdds01OutGrpVoucherItem }
     *     
     */
    public void setOutGrpVoucher(ArrayOfAdds01OutGrpVoucherItem value) {
        this.outGrpVoucher = value;
    }

    /**
     * Gets the value of the outLogfileGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdds01OutLogfileGroupItem }
     *     
     */
    public ArrayOfAdds01OutLogfileGroupItem getOutLogfileGroup() {
        return outLogfileGroup;
    }

    /**
     * Sets the value of the outLogfileGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdds01OutLogfileGroupItem }
     *     
     */
    public void setOutLogfileGroup(ArrayOfAdds01OutLogfileGroupItem value) {
        this.outLogfileGroup = value;
    }

    /**
     * Gets the value of the outPrintingGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdds01OutPrintingGrpItem }
     *     
     */
    public ArrayOfAdds01OutPrintingGrpItem getOutPrintingGrp() {
        return outPrintingGrp;
    }

    /**
     * Sets the value of the outPrintingGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdds01OutPrintingGrpItem }
     *     
     */
    public void setOutPrintingGrp(ArrayOfAdds01OutPrintingGrpItem value) {
        this.outPrintingGrp = value;
    }

}
