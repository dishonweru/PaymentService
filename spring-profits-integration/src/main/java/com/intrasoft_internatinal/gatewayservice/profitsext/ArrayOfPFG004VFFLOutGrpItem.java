
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VFFLOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VFFLOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VFFLOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VFFLOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VFFLOutGrpItem", propOrder = {
    "pfg004VFFLOutGrpItem"
})
public class ArrayOfPFG004VFFLOutGrpItem {

    @XmlElement(name = "PFG004VFFLOutGrpItem")
    protected List<PFG004VFFLOutGrpItem> pfg004VFFLOutGrpItem;

    /**
     * Gets the value of the pfg004VFFLOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VFFLOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VFFLOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VFFLOutGrpItem }
     * 
     * 
     */
    public List<PFG004VFFLOutGrpItem> getPFG004VFFLOutGrpItem() {
        if (pfg004VFFLOutGrpItem == null) {
            pfg004VFFLOutGrpItem = new ArrayList<PFG004VFFLOutGrpItem>();
        }
        return this.pfg004VFFLOutGrpItem;
    }

}
