
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2032VOutGrpValuersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2032VOutGrpValuersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2032VOutGrpValuersItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2032VOutGrpValuersItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2032VOutGrpValuersItem", propOrder = {
    "mc2032VOutGrpValuersItem"
})
public class ArrayOfMc2032VOutGrpValuersItem {

    @XmlElement(name = "Mc2032VOutGrpValuersItem")
    protected List<Mc2032VOutGrpValuersItem> mc2032VOutGrpValuersItem;

    /**
     * Gets the value of the mc2032VOutGrpValuersItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2032VOutGrpValuersItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2032VOutGrpValuersItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2032VOutGrpValuersItem }
     * 
     * 
     */
    public List<Mc2032VOutGrpValuersItem> getMc2032VOutGrpValuersItem() {
        if (mc2032VOutGrpValuersItem == null) {
            mc2032VOutGrpValuersItem = new ArrayList<Mc2032VOutGrpValuersItem>();
        }
        return this.mc2032VOutGrpValuersItem;
    }

}
