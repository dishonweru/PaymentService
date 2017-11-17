
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prt099VCustomerAccountsListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt099VCustomerAccountsListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutSelectedGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfPrt099VOutSelectedGrpItem" minOccurs="0"/>
 *         &lt;element name="NotFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt099VCustomerAccountsListExport", propOrder = {
    "outSelectedGrp",
    "notFound"
})
public class Prt099VCustomerAccountsListExport
    extends BaseExport
{

    @XmlElement(name = "OutSelectedGrp")
    protected ArrayOfPrt099VOutSelectedGrpItem outSelectedGrp;
    @XmlElement(name = "NotFound")
    protected boolean notFound;

    /**
     * Gets the value of the outSelectedGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrt099VOutSelectedGrpItem }
     *     
     */
    public ArrayOfPrt099VOutSelectedGrpItem getOutSelectedGrp() {
        return outSelectedGrp;
    }

    /**
     * Sets the value of the outSelectedGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrt099VOutSelectedGrpItem }
     *     
     */
    public void setOutSelectedGrp(ArrayOfPrt099VOutSelectedGrpItem value) {
        this.outSelectedGrp = value;
    }

    /**
     * Gets the value of the notFound property.
     * 
     */
    public boolean isNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     * 
     */
    public void setNotFound(boolean value) {
        this.notFound = value;
    }

}
