
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VFFLOutGrpDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VFFLOutGrpDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VFFLOutGrpDetailItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VFFLOutGrpDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VFFLOutGrpDetailItem", propOrder = {
    "pfg004VFFLOutGrpDetailItem"
})
public class ArrayOfPFG004VFFLOutGrpDetailItem {

    @XmlElement(name = "PFG004VFFLOutGrpDetailItem")
    protected List<PFG004VFFLOutGrpDetailItem> pfg004VFFLOutGrpDetailItem;

    /**
     * Gets the value of the pfg004VFFLOutGrpDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VFFLOutGrpDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VFFLOutGrpDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VFFLOutGrpDetailItem }
     * 
     * 
     */
    public List<PFG004VFFLOutGrpDetailItem> getPFG004VFFLOutGrpDetailItem() {
        if (pfg004VFFLOutGrpDetailItem == null) {
            pfg004VFFLOutGrpDetailItem = new ArrayList<PFG004VFFLOutGrpDetailItem>();
        }
        return this.pfg004VFFLOutGrpDetailItem;
    }

}
