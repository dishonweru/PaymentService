
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0130VCustomerCategoriesListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0130VCustomerCategoriesListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0130VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0130VOutListGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0130VCustomerCategoriesListExport", propOrder = {
    "outCustListSetDescription",
    "outGrpLog",
    "outListGrp"
})
public class I0130VCustomerCategoriesListExport
    extends BaseExport
{

    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfI0130VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutListGrp")
    protected ArrayOfI0130VOutListGrpItem outListGrp;

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0130VOutGrpLogItem }
     *     
     */
    public ArrayOfI0130VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0130VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfI0130VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0130VOutListGrpItem }
     *     
     */
    public ArrayOfI0130VOutListGrpItem getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0130VOutListGrpItem }
     *     
     */
    public void setOutListGrp(ArrayOfI0130VOutListGrpItem value) {
        this.outListGrp = value;
    }

}
