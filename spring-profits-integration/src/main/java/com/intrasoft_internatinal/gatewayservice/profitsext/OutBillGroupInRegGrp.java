
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutBillGroupInRegGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutBillGroupInRegGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGroupInRegGrpOutSelectedIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutBillGroupInRegGrp", propOrder = {
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt",
    "outBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag",
    "outBillGroupInRegGrpOutSelectedIefSuppliedSelectChar"
})
public class OutBillGroupInRegGrp {

    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc", required = true)
    protected BigDecimal outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc", required = true)
    protected BigDecimal outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc", required = true)
    protected BigDecimal outBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum")
    protected short outBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn", required = true)
    protected BigDecimal outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt")
    protected int outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt;
    @XmlElement(name = "OutBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag")
    protected String outBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag;
    @XmlElement(name = "OutBillGroupInRegGrpOutSelectedIefSuppliedSelectChar")
    protected String outBillGroupInRegGrpOutSelectedIefSuppliedSelectChar;

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc(BigDecimal value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesDisc = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpChargesOnacc = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccCd = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollAccNumb = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollJustif = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollPrfsys = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc(BigDecimal value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCollYieldPerc = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc(BigDecimal value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCommDisc = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccAvldays = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccCd = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccIntdays = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccJustif = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCrAccNumber = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpCraccPrfsys = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpDescr = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccCd = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccNumber = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpaccPrfsys = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpDbJust = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate(XMLGregorianCalendar value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdate = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpExpInterdays = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpJustificId = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpPrftTransId = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpProductId = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum property.
     * 
     */
    public short getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum(short value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpSerialNum = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpStatusFlg = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp(XMLGregorianCalendar value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpTmstamp = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn(BigDecimal value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilAmn = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt property.
     * 
     */
    public int getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt property.
     * 
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt(int value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpTotbilCnt = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag() {
        return outBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag(String value) {
        this.outBillGroupInRegGrpOutBigGrmBillGroupBgrpTypeFlag = value;
    }

    /**
     * Gets the value of the outBillGroupInRegGrpOutSelectedIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillGroupInRegGrpOutSelectedIefSuppliedSelectChar() {
        return outBillGroupInRegGrpOutSelectedIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outBillGroupInRegGrpOutSelectedIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillGroupInRegGrpOutSelectedIefSuppliedSelectChar(String value) {
        this.outBillGroupInRegGrpOutSelectedIefSuppliedSelectChar = value;
    }

}
