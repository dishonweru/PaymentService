
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBulkMessageAlertStatusExtImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBulkMessageAlertStatusExtImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="UniqueMessageIdList" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfUniqueMessageIdItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBulkMessageAlertStatusExtImport", propOrder = {
    "uniqueMessageIdList"
})
public class GetBulkMessageAlertStatusExtImport
    extends BaseImport
{

    @XmlElement(name = "UniqueMessageIdList")
    protected ArrayOfUniqueMessageIdItem uniqueMessageIdList;

    /**
     * Gets the value of the uniqueMessageIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUniqueMessageIdItem }
     *     
     */
    public ArrayOfUniqueMessageIdItem getUniqueMessageIdList() {
        return uniqueMessageIdList;
    }

    /**
     * Sets the value of the uniqueMessageIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUniqueMessageIdItem }
     *     
     */
    public void setUniqueMessageIdList(ArrayOfUniqueMessageIdItem value) {
        this.uniqueMessageIdList = value;
    }

}
