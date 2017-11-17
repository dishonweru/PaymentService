
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL705VProfitsUserListSearchExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL705VProfitsUserListSearchExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutListbox" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSL705VOutListboxItem" minOccurs="0"/>
 *         &lt;element name="NotFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL705VProfitsUserListSearchExport", propOrder = {
    "outListbox",
    "notFound",
    "isMore"
})
public class SL705VProfitsUserListSearchExport
    extends BaseExport
{

    @XmlElement(name = "OutListbox")
    protected ArrayOfSL705VOutListboxItem outListbox;
    @XmlElement(name = "NotFound")
    protected boolean notFound;
    @XmlElement(name = "IsMore")
    protected boolean isMore;

    /**
     * Gets the value of the outListbox property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSL705VOutListboxItem }
     *     
     */
    public ArrayOfSL705VOutListboxItem getOutListbox() {
        return outListbox;
    }

    /**
     * Sets the value of the outListbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSL705VOutListboxItem }
     *     
     */
    public void setOutListbox(ArrayOfSL705VOutListboxItem value) {
        this.outListbox = value;
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

    /**
     * Gets the value of the isMore property.
     * 
     */
    public boolean isIsMore() {
        return isMore;
    }

    /**
     * Sets the value of the isMore property.
     * 
     */
    public void setIsMore(boolean value) {
        this.isMore = value;
    }

}
