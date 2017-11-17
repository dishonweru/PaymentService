
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2027VOutGrpCustomersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2027VOutGrpCustomersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2027VOutGrpCustomersItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2027VOutGrpCustomersItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2027VOutGrpCustomersItem", propOrder = {
    "mc2027VOutGrpCustomersItem"
})
public class ArrayOfMC2027VOutGrpCustomersItem {

    @XmlElement(name = "MC2027VOutGrpCustomersItem")
    protected List<MC2027VOutGrpCustomersItem> mc2027VOutGrpCustomersItem;

    /**
     * Gets the value of the mc2027VOutGrpCustomersItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2027VOutGrpCustomersItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2027VOutGrpCustomersItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2027VOutGrpCustomersItem }
     * 
     * 
     */
    public List<MC2027VOutGrpCustomersItem> getMC2027VOutGrpCustomersItem() {
        if (mc2027VOutGrpCustomersItem == null) {
            mc2027VOutGrpCustomersItem = new ArrayList<MC2027VOutGrpCustomersItem>();
        }
        return this.mc2027VOutGrpCustomersItem;
    }

}
