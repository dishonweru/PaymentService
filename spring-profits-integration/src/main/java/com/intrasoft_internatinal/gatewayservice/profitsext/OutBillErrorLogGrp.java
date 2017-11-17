
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutBillErrorLogGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutBillErrorLogGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutBillErrorLogGrp", propOrder = {
    "outBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25",
    "outBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine",
    "outBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp"
})
public class OutBillErrorLogGrp {

    @XmlElement(name = "OutBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25")
    protected String outBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25;
    @XmlElement(name = "OutBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine")
    protected String outBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine;
    @XmlElement(name = "OutBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp;

    /**
     * Gets the value of the outBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25() {
        return outBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25;
    }

    /**
     * Sets the value of the outBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25(String value) {
        this.outBillErrorLogGrpOutBillErrlogGrmIefSuppliedChar25 = value;
    }

    /**
     * Gets the value of the outBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine() {
        return outBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine;
    }

    /**
     * Sets the value of the outBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine(String value) {
        this.outBillErrorLogGrpOutBillErrlogGrmIefSuppliedOutLine = value;
    }

    /**
     * Gets the value of the outBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp() {
        return outBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp;
    }

    /**
     * Sets the value of the outBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp(XMLGregorianCalendar value) {
        this.outBillErrorLogGrpOutBillErrlogGrmIefSuppliedTmstamp = value;
    }

}
