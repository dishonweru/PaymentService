
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOut2GrpMonthItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOut2GrpMonthItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out2GrpMonthItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Out2GrpMonthItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOut2GrpMonthItem", propOrder = {
    "out2GrpMonthItem"
})
public class ArrayOfOut2GrpMonthItem {

    @XmlElement(name = "Out2GrpMonthItem")
    protected List<Out2GrpMonthItem> out2GrpMonthItem;

    /**
     * Gets the value of the out2GrpMonthItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the out2GrpMonthItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOut2GrpMonthItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Out2GrpMonthItem }
     * 
     * 
     */
    public List<Out2GrpMonthItem> getOut2GrpMonthItem() {
        if (out2GrpMonthItem == null) {
            out2GrpMonthItem = new ArrayList<Out2GrpMonthItem>();
        }
        return this.out2GrpMonthItem;
    }

}
