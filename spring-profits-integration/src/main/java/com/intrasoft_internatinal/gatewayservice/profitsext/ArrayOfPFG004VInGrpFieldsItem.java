
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VInGrpFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VInGrpFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VInGrpFieldsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VInGrpFieldsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VInGrpFieldsItem", propOrder = {
    "pfg004VInGrpFieldsItem"
})
public class ArrayOfPFG004VInGrpFieldsItem {

    @XmlElement(name = "PFG004VInGrpFieldsItem")
    protected List<PFG004VInGrpFieldsItem> pfg004VInGrpFieldsItem;

    /**
     * Gets the value of the pfg004VInGrpFieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VInGrpFieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VInGrpFieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VInGrpFieldsItem }
     * 
     * 
     */
    public List<PFG004VInGrpFieldsItem> getPFG004VInGrpFieldsItem() {
        if (pfg004VInGrpFieldsItem == null) {
            pfg004VInGrpFieldsItem = new ArrayList<PFG004VInGrpFieldsItem>();
        }
        return this.pfg004VInGrpFieldsItem;
    }

}
