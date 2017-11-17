
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T1462VlgBeneficiariesExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1462VlgBeneficiariesExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT1462VOutListGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1462VlgBeneficiariesExport", propOrder = {
    "outListGrp"
})
public class T1462VlgBeneficiariesExport
    extends BaseExport
{

    @XmlElement(name = "OutListGrp")
    protected ArrayOfT1462VOutListGrpItem outListGrp;

    /**
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT1462VOutListGrpItem }
     *     
     */
    public ArrayOfT1462VOutListGrpItem getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT1462VOutListGrpItem }
     *     
     */
    public void setOutListGrp(ArrayOfT1462VOutListGrpItem value) {
        this.outListGrp = value;
    }

}
