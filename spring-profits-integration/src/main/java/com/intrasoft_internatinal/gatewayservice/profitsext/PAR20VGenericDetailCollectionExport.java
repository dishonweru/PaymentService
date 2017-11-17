
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAR20V_GenericDetailCollectionExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAR20V_GenericDetailCollectionExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPAR20VOutGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAR20V_GenericDetailCollectionExport", propOrder = {
    "outContinueGenericDetailSerialNum",
    "outGrp"
})
public class PAR20VGenericDetailCollectionExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueGenericDetailSerialNum")
    protected int outContinueGenericDetailSerialNum;
    @XmlElement(name = "OutGrp")
    protected ArrayOfPAR20VOutGrpItem outGrp;

    /**
     * Gets the value of the outContinueGenericDetailSerialNum property.
     * 
     */
    public int getOutContinueGenericDetailSerialNum() {
        return outContinueGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outContinueGenericDetailSerialNum property.
     * 
     */
    public void setOutContinueGenericDetailSerialNum(int value) {
        this.outContinueGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPAR20VOutGrpItem }
     *     
     */
    public ArrayOfPAR20VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPAR20VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfPAR20VOutGrpItem value) {
        this.outGrp = value;
    }

}
