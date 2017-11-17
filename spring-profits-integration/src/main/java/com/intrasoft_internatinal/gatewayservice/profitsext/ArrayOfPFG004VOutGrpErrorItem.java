
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VOutGrpErrorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VOutGrpErrorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VOutGrpErrorItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VOutGrpErrorItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VOutGrpErrorItem", propOrder = {
    "pfg004VOutGrpErrorItem"
})
public class ArrayOfPFG004VOutGrpErrorItem {

    @XmlElement(name = "PFG004VOutGrpErrorItem")
    protected List<PFG004VOutGrpErrorItem> pfg004VOutGrpErrorItem;

    /**
     * Gets the value of the pfg004VOutGrpErrorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VOutGrpErrorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VOutGrpErrorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VOutGrpErrorItem }
     * 
     * 
     */
    public List<PFG004VOutGrpErrorItem> getPFG004VOutGrpErrorItem() {
        if (pfg004VOutGrpErrorItem == null) {
            pfg004VOutGrpErrorItem = new ArrayList<PFG004VOutGrpErrorItem>();
        }
        return this.pfg004VOutGrpErrorItem;
    }

}
