
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2009VOutGrpActionsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2009VOutGrpActionsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2009VOutGrpActionsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2009VOutGrpActionsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2009VOutGrpActionsItem", propOrder = {
    "mc2009VOutGrpActionsItem"
})
public class ArrayOfMC2009VOutGrpActionsItem {

    @XmlElement(name = "MC2009VOutGrpActionsItem")
    protected List<MC2009VOutGrpActionsItem> mc2009VOutGrpActionsItem;

    /**
     * Gets the value of the mc2009VOutGrpActionsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2009VOutGrpActionsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2009VOutGrpActionsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2009VOutGrpActionsItem }
     * 
     * 
     */
    public List<MC2009VOutGrpActionsItem> getMC2009VOutGrpActionsItem() {
        if (mc2009VOutGrpActionsItem == null) {
            mc2009VOutGrpActionsItem = new ArrayList<MC2009VOutGrpActionsItem>();
        }
        return this.mc2009VOutGrpActionsItem;
    }

}
