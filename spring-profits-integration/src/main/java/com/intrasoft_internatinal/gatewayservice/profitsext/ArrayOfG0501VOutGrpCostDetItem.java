
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfG0501VOutGrpCostDetItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfG0501VOutGrpCostDetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="G0501VOutGrpCostDetItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}G0501VOutGrpCostDetItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfG0501VOutGrpCostDetItem", propOrder = {
    "g0501VOutGrpCostDetItem"
})
public class ArrayOfG0501VOutGrpCostDetItem {

    @XmlElement(name = "G0501VOutGrpCostDetItem")
    protected List<G0501VOutGrpCostDetItem> g0501VOutGrpCostDetItem;

    /**
     * Gets the value of the g0501VOutGrpCostDetItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the g0501VOutGrpCostDetItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getG0501VOutGrpCostDetItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link G0501VOutGrpCostDetItem }
     * 
     * 
     */
    public List<G0501VOutGrpCostDetItem> getG0501VOutGrpCostDetItem() {
        if (g0501VOutGrpCostDetItem == null) {
            g0501VOutGrpCostDetItem = new ArrayList<G0501VOutGrpCostDetItem>();
        }
        return this.g0501VOutGrpCostDetItem;
    }

}
