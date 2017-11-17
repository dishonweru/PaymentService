
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendBulkMessageAlertExtExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendBulkMessageAlertExtExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="BulkExportMessageAlertList" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfExportMessageAlertExtItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendBulkMessageAlertExtExport", propOrder = {
    "bulkExportMessageAlertList"
})
public class SendBulkMessageAlertExtExport
    extends BaseExport
{

    @XmlElement(name = "BulkExportMessageAlertList")
    protected ArrayOfExportMessageAlertExtItem bulkExportMessageAlertList;

    /**
     * Gets the value of the bulkExportMessageAlertList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExportMessageAlertExtItem }
     *     
     */
    public ArrayOfExportMessageAlertExtItem getBulkExportMessageAlertList() {
        return bulkExportMessageAlertList;
    }

    /**
     * Sets the value of the bulkExportMessageAlertList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExportMessageAlertExtItem }
     *     
     */
    public void setBulkExportMessageAlertList(ArrayOfExportMessageAlertExtItem value) {
        this.bulkExportMessageAlertList = value;
    }

}
