
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutExtraitJust complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutExtraitJust">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutExtraitJust" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutExtraitJust" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutExtraitJust", propOrder = {
    "outExtraitJust"
})
public class ArrayOfOutExtraitJust {

    @XmlElement(name = "OutExtraitJust")
    protected List<OutExtraitJust> outExtraitJust;

    /**
     * Gets the value of the outExtraitJust property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outExtraitJust property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutExtraitJust().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutExtraitJust }
     * 
     * 
     */
    public List<OutExtraitJust> getOutExtraitJust() {
        if (outExtraitJust == null) {
            outExtraitJust = new ArrayList<OutExtraitJust>();
        }
        return this.outExtraitJust;
    }

}
