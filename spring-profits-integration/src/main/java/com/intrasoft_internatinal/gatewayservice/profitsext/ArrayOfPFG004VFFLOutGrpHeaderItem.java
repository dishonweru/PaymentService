
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VFFLOutGrpHeaderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VFFLOutGrpHeaderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VFFLOutGrpHeaderItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VFFLOutGrpHeaderItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VFFLOutGrpHeaderItem", propOrder = {
    "pfg004VFFLOutGrpHeaderItem"
})
public class ArrayOfPFG004VFFLOutGrpHeaderItem {

    @XmlElement(name = "PFG004VFFLOutGrpHeaderItem")
    protected List<PFG004VFFLOutGrpHeaderItem> pfg004VFFLOutGrpHeaderItem;

    /**
     * Gets the value of the pfg004VFFLOutGrpHeaderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VFFLOutGrpHeaderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VFFLOutGrpHeaderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VFFLOutGrpHeaderItem }
     * 
     * 
     */
    public List<PFG004VFFLOutGrpHeaderItem> getPFG004VFFLOutGrpHeaderItem() {
        if (pfg004VFFLOutGrpHeaderItem == null) {
            pfg004VFFLOutGrpHeaderItem = new ArrayList<PFG004VFFLOutGrpHeaderItem>();
        }
        return this.pfg004VFFLOutGrpHeaderItem;
    }

}
