
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI4000V_GetUnitsListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI4000V_GetUnitsListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutIsMoreIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCI4000VOutGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI4000V_GetUnitsListExport", propOrder = {
    "outIsMoreIefSuppliedFlag",
    "outGrp"
})
public class CI4000VGetUnitsListExport
    extends BaseExport
{

    @XmlElement(name = "OutIsMoreIefSuppliedFlag")
    protected String outIsMoreIefSuppliedFlag;
    @XmlElement(name = "OutGrp")
    protected ArrayOfCI4000VOutGrpItem outGrp;

    /**
     * Gets the value of the outIsMoreIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIsMoreIefSuppliedFlag() {
        return outIsMoreIefSuppliedFlag;
    }

    /**
     * Sets the value of the outIsMoreIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIsMoreIefSuppliedFlag(String value) {
        this.outIsMoreIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCI4000VOutGrpItem }
     *     
     */
    public ArrayOfCI4000VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCI4000VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfCI4000VOutGrpItem value) {
        this.outGrp = value;
    }

}
