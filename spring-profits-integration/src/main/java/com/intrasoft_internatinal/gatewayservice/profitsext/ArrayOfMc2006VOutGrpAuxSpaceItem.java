
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2006VOutGrpAuxSpaceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2006VOutGrpAuxSpaceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2006VOutGrpAuxSpaceItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2006VOutGrpAuxSpaceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2006VOutGrpAuxSpaceItem", propOrder = {
    "mc2006VOutGrpAuxSpaceItem"
})
public class ArrayOfMc2006VOutGrpAuxSpaceItem {

    @XmlElement(name = "Mc2006VOutGrpAuxSpaceItem")
    protected List<Mc2006VOutGrpAuxSpaceItem> mc2006VOutGrpAuxSpaceItem;

    /**
     * Gets the value of the mc2006VOutGrpAuxSpaceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2006VOutGrpAuxSpaceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2006VOutGrpAuxSpaceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2006VOutGrpAuxSpaceItem }
     * 
     * 
     */
    public List<Mc2006VOutGrpAuxSpaceItem> getMc2006VOutGrpAuxSpaceItem() {
        if (mc2006VOutGrpAuxSpaceItem == null) {
            mc2006VOutGrpAuxSpaceItem = new ArrayList<Mc2006VOutGrpAuxSpaceItem>();
        }
        return this.mc2006VOutGrpAuxSpaceItem;
    }

}
