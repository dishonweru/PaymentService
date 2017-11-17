
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2009VOutGrpDetailsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2009VOutGrpDetailsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2009VOutGrpDetailsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2009VOutGrpDetailsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2009VOutGrpDetailsItem", propOrder = {
    "mc2009VOutGrpDetailsItem"
})
public class ArrayOfMC2009VOutGrpDetailsItem {

    @XmlElement(name = "MC2009VOutGrpDetailsItem")
    protected List<MC2009VOutGrpDetailsItem> mc2009VOutGrpDetailsItem;

    /**
     * Gets the value of the mc2009VOutGrpDetailsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2009VOutGrpDetailsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2009VOutGrpDetailsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2009VOutGrpDetailsItem }
     * 
     * 
     */
    public List<MC2009VOutGrpDetailsItem> getMC2009VOutGrpDetailsItem() {
        if (mc2009VOutGrpDetailsItem == null) {
            mc2009VOutGrpDetailsItem = new ArrayList<MC2009VOutGrpDetailsItem>();
        }
        return this.mc2009VOutGrpDetailsItem;
    }

}
