
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRT098V_MultiProfitsAccountValidationExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRT098V_MultiProfitsAccountValidationExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPRT098VOutGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRT098V_MultiProfitsAccountValidationExport", propOrder = {
    "outGrp"
})
public class PRT098VMultiProfitsAccountValidationExport
    extends BaseExport
{

    @XmlElement(name = "OutGrp")
    protected ArrayOfPRT098VOutGrpItem outGrp;

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRT098VOutGrpItem }
     *     
     */
    public ArrayOfPRT098VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRT098VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfPRT098VOutGrpItem value) {
        this.outGrp = value;
    }

}
