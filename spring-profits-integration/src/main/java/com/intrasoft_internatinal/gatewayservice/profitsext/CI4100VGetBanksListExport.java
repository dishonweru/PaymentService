
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI4100V_GetBanksListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI4100V_GetBanksListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutIsMoreIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCI4100VOutGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI4100V_GetBanksListExport", propOrder = {
    "outIsMoreIefSuppliedFlag",
    "outGrp"
})
public class CI4100VGetBanksListExport
    extends BaseExport
{

    @XmlElement(name = "OutIsMoreIefSuppliedFlag")
    protected String outIsMoreIefSuppliedFlag;
    @XmlElement(name = "OutGrp")
    protected ArrayOfCI4100VOutGrpItem outGrp;

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
     *     {@link ArrayOfCI4100VOutGrpItem }
     *     
     */
    public ArrayOfCI4100VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCI4100VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfCI4100VOutGrpItem value) {
        this.outGrp = value;
    }

}
