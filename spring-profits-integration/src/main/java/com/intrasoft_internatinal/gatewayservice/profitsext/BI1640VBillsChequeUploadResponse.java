
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BI1640V_BillsChequeUploadResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BillsChequeUploadExport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bi1640VBillsChequeUploadResult"
})
@XmlRootElement(name = "BI1640V_BillsChequeUploadResponse")
public class BI1640VBillsChequeUploadResponse {

    @XmlElement(name = "BI1640V_BillsChequeUploadResult")
    protected BillsChequeUploadExport bi1640VBillsChequeUploadResult;

    /**
     * Gets the value of the bi1640VBillsChequeUploadResult property.
     * 
     * @return
     *     possible object is
     *     {@link BillsChequeUploadExport }
     *     
     */
    public BillsChequeUploadExport getBI1640VBillsChequeUploadResult() {
        return bi1640VBillsChequeUploadResult;
    }

    /**
     * Sets the value of the bi1640VBillsChequeUploadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillsChequeUploadExport }
     *     
     */
    public void setBI1640VBillsChequeUploadResult(BillsChequeUploadExport value) {
        this.bi1640VBillsChequeUploadResult = value;
    }

}
