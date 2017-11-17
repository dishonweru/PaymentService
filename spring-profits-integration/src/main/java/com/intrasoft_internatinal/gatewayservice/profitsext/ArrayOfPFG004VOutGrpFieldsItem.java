
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFG004VOutGrpFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFG004VOutGrpFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFG004VOutGrpFieldsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PFG004VOutGrpFieldsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFG004VOutGrpFieldsItem", propOrder = {
    "pfg004VOutGrpFieldsItem"
})
public class ArrayOfPFG004VOutGrpFieldsItem {

    @XmlElement(name = "PFG004VOutGrpFieldsItem")
    protected List<PFG004VOutGrpFieldsItem> pfg004VOutGrpFieldsItem;

    /**
     * Gets the value of the pfg004VOutGrpFieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfg004VOutGrpFieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFG004VOutGrpFieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFG004VOutGrpFieldsItem }
     * 
     * 
     */
    public List<PFG004VOutGrpFieldsItem> getPFG004VOutGrpFieldsItem() {
        if (pfg004VOutGrpFieldsItem == null) {
            pfg004VOutGrpFieldsItem = new ArrayList<PFG004VOutGrpFieldsItem>();
        }
        return this.pfg004VOutGrpFieldsItem;
    }

}
