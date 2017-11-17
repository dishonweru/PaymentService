
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VOutGrpValuesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VOutGrpValuesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VOutGrpValuesItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VOutGrpValuesItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VOutGrpValuesItem", propOrder = {
    "pfg004VOutGrpValuesItem"
})
public class ArrayOfPFG004VOutGrpValuesItem {

    @XmlElement(name = "PFG004VOutGrpValuesItem")
    protected List<PFG004VOutGrpValuesItem> pfg004VOutGrpValuesItem;

    /**
     * Gets the value of the pfg004VOutGrpValuesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VOutGrpValuesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VOutGrpValuesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VOutGrpValuesItem }
     * 
     * 
     */
    public List<PFG004VOutGrpValuesItem> getPFG004VOutGrpValuesItem() {
        if (pfg004VOutGrpValuesItem == null) {
            pfg004VOutGrpValuesItem = new ArrayList<PFG004VOutGrpValuesItem>();
        }
        return this.pfg004VOutGrpValuesItem;
    }

}
