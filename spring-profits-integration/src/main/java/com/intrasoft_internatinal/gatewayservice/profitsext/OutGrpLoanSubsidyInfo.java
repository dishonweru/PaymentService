
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpLoanSubsidyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpLoanSubsidyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpLoanSubsidyInfoOutGrmPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpLoanSubsidyInfo", propOrder = {
    "outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt",
    "outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy",
    "outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn",
    "outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn",
    "outGrpLoanSubsidyInfoOutGrmPrftTransactionDescription",
    "outGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact"
})
public class OutGrpLoanSubsidyInfo {

    @XmlElement(name = "OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt;
    @XmlElement(name = "OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy")
    protected int outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy;
    @XmlElement(name = "OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn", required = true)
    protected BigDecimal outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn;
    @XmlElement(name = "OutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn", required = true)
    protected BigDecimal outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn;
    @XmlElement(name = "OutGrpLoanSubsidyInfoOutGrmPrftTransactionDescription")
    protected String outGrpLoanSubsidyInfoOutGrmPrftTransactionDescription;
    @XmlElement(name = "OutGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact")
    protected int outGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact;

    /**
     * Gets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt() {
        return outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt(XMLGregorianCalendar value) {
        this.outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoCreationDt = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy property.
     * 
     */
    public int getOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy() {
        return outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy property.
     * 
     */
    public void setOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy(int value) {
        this.outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoIdSubsidy = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn() {
        return outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn(BigDecimal value) {
        this.outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoSubsidyAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn() {
        return outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn(BigDecimal value) {
        this.outGrpLoanSubsidyInfoOutGrmLoanSubsidyInfoTotInterestAmn = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfoOutGrmPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLoanSubsidyInfoOutGrmPrftTransactionDescription() {
        return outGrpLoanSubsidyInfoOutGrmPrftTransactionDescription;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoOutGrmPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLoanSubsidyInfoOutGrmPrftTransactionDescription(String value) {
        this.outGrpLoanSubsidyInfoOutGrmPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact property.
     * 
     */
    public int getOutGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact() {
        return outGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact property.
     * 
     */
    public void setOutGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact(int value) {
        this.outGrpLoanSubsidyInfoOutGrmPrftTransactionIdTransact = value;
    }

}
