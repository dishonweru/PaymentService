
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VOutGrpDocAttachedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VOutGrpDocAttachedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VOutGrpDocAttachedItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VOutGrpDocAttachedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VOutGrpDocAttachedItem", propOrder = {
    "pfg004VOutGrpDocAttachedItem"
})
public class ArrayOfPFG004VOutGrpDocAttachedItem {

    @XmlElement(name = "PFG004VOutGrpDocAttachedItem")
    protected List<PFG004VOutGrpDocAttachedItem> pfg004VOutGrpDocAttachedItem;

    /**
     * Gets the value of the pfg004VOutGrpDocAttachedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VOutGrpDocAttachedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VOutGrpDocAttachedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VOutGrpDocAttachedItem }
     * 
     * 
     */
    public List<PFG004VOutGrpDocAttachedItem> getPFG004VOutGrpDocAttachedItem() {
        if (pfg004VOutGrpDocAttachedItem == null) {
            pfg004VOutGrpDocAttachedItem = new ArrayList<PFG004VOutGrpDocAttachedItem>();
        }
        return this.pfg004VOutGrpDocAttachedItem;
    }

}
