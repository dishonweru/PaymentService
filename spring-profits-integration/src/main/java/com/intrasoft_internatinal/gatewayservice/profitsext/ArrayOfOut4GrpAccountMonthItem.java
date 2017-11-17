
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOut4GrpAccountMonthItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOut4GrpAccountMonthItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out4GrpAccountMonthItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Out4GrpAccountMonthItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOut4GrpAccountMonthItem", propOrder = {
    "out4GrpAccountMonthItem"
})
public class ArrayOfOut4GrpAccountMonthItem {

    @XmlElement(name = "Out4GrpAccountMonthItem")
    protected List<Out4GrpAccountMonthItem> out4GrpAccountMonthItem;

    /**
     * Gets the value of the out4GrpAccountMonthItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the out4GrpAccountMonthItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOut4GrpAccountMonthItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Out4GrpAccountMonthItem }
     * 
     * 
     */
    public List<Out4GrpAccountMonthItem> getOut4GrpAccountMonthItem() {
        if (out4GrpAccountMonthItem == null) {
            out4GrpAccountMonthItem = new ArrayList<Out4GrpAccountMonthItem>();
        }
        return this.out4GrpAccountMonthItem;
    }

}
