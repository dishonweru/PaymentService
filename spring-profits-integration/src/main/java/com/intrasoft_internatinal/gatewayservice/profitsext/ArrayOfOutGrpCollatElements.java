
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpCollatElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpCollatElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCollatElements" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpCollatElements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpCollatElements", propOrder = {
    "outGrpCollatElements"
})
public class ArrayOfOutGrpCollatElements {

    @XmlElement(name = "OutGrpCollatElements")
    protected List<OutGrpCollatElements> outGrpCollatElements;

    /**
     * Gets the value of the outGrpCollatElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpCollatElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpCollatElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpCollatElements }
     * 
     * 
     */
    public List<OutGrpCollatElements> getOutGrpCollatElements() {
        if (outGrpCollatElements == null) {
            outGrpCollatElements = new ArrayList<OutGrpCollatElements>();
        }
        return this.outGrpCollatElements;
    }

}
