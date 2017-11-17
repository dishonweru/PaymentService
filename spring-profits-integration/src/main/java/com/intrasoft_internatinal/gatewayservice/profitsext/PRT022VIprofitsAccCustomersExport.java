
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT022V_IprofitsAccCustomersExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT022V_IprofitsAccCustomersExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomers" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPRT022VOutGrpCustomersIACItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT022V_IprofitsAccCustomersExport", propOrder = {
    "outGrpCustomers"
})
public class PRT022VIprofitsAccCustomersExport
    extends BaseExport
{

    @XmlElement(name = "OutGrpCustomers")
    protected ArrayOfPRT022VOutGrpCustomersIACItem outGrpCustomers;

    /**
     * Gets the value of the outGrpCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRT022VOutGrpCustomersIACItem }
     *     
     */
    public ArrayOfPRT022VOutGrpCustomersIACItem getOutGrpCustomers() {
        return outGrpCustomers;
    }

    /**
     * Sets the value of the outGrpCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRT022VOutGrpCustomersIACItem }
     *     
     */
    public void setOutGrpCustomers(ArrayOfPRT022VOutGrpCustomersIACItem value) {
        this.outGrpCustomers = value;
    }

}
