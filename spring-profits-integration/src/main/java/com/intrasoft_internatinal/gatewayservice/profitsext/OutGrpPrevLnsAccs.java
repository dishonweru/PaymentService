
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpPrevLnsAccs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpPrevLnsAccs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpPrevLnsAccsOutGrmPrevLnsProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPrevLnsAccsOutGrmPrevLnsUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpPrevLnsAccsOutGrmPrevLoanAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpPrevLnsAccs", propOrder = {
    "outGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate",
    "outGrpPrevLnsAccsOutGrmPrevLnsProductDescription",
    "outGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct",
    "outGrpPrevLnsAccsOutGrmPrevLnsUnitCode",
    "outGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn",
    "outGrpPrevLnsAccsOutGrmPrevLoanAccountAccType"
})
public class OutGrpPrevLnsAccs {

    @XmlElement(name = "OutGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate;
    @XmlElement(name = "OutGrpPrevLnsAccsOutGrmPrevLnsProductDescription")
    protected String outGrpPrevLnsAccsOutGrmPrevLnsProductDescription;
    @XmlElement(name = "OutGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct")
    protected int outGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct;
    @XmlElement(name = "OutGrpPrevLnsAccsOutGrmPrevLnsUnitCode")
    protected int outGrpPrevLnsAccsOutGrmPrevLnsUnitCode;
    @XmlElement(name = "OutGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn")
    protected int outGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn;
    @XmlElement(name = "OutGrpPrevLnsAccsOutGrmPrevLoanAccountAccType")
    protected short outGrpPrevLnsAccsOutGrmPrevLoanAccountAccType;

    /**
     * Gets the value of the outGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate() {
        return outGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate(XMLGregorianCalendar value) {
        this.outGrpPrevLnsAccsOutGrmPrevLnsMntRecordingTrxDate = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccsOutGrmPrevLnsProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPrevLnsAccsOutGrmPrevLnsProductDescription() {
        return outGrpPrevLnsAccsOutGrmPrevLnsProductDescription;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsOutGrmPrevLnsProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPrevLnsAccsOutGrmPrevLnsProductDescription(String value) {
        this.outGrpPrevLnsAccsOutGrmPrevLnsProductDescription = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct property.
     * 
     */
    public int getOutGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct() {
        return outGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct property.
     * 
     */
    public void setOutGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct(int value) {
        this.outGrpPrevLnsAccsOutGrmPrevLnsProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccsOutGrmPrevLnsUnitCode property.
     * 
     */
    public int getOutGrpPrevLnsAccsOutGrmPrevLnsUnitCode() {
        return outGrpPrevLnsAccsOutGrmPrevLnsUnitCode;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsOutGrmPrevLnsUnitCode property.
     * 
     */
    public void setOutGrpPrevLnsAccsOutGrmPrevLnsUnitCode(int value) {
        this.outGrpPrevLnsAccsOutGrmPrevLnsUnitCode = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn property.
     * 
     */
    public int getOutGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn() {
        return outGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn property.
     * 
     */
    public void setOutGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn(int value) {
        this.outGrpPrevLnsAccsOutGrmPrevLoanAccountAccSn = value;
    }

    /**
     * Gets the value of the outGrpPrevLnsAccsOutGrmPrevLoanAccountAccType property.
     * 
     */
    public short getOutGrpPrevLnsAccsOutGrmPrevLoanAccountAccType() {
        return outGrpPrevLnsAccsOutGrmPrevLoanAccountAccType;
    }

    /**
     * Sets the value of the outGrpPrevLnsAccsOutGrmPrevLoanAccountAccType property.
     * 
     */
    public void setOutGrpPrevLnsAccsOutGrmPrevLoanAccountAccType(short value) {
        this.outGrpPrevLnsAccsOutGrmPrevLoanAccountAccType = value;
    }

}
