
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOut1GrpYearItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOut1GrpYearItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out1GrpYearItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Out1GrpYearItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOut1GrpYearItem", propOrder = {
    "out1GrpYearItem"
})
public class ArrayOfOut1GrpYearItem {

    @XmlElement(name = "Out1GrpYearItem")
    protected List<Out1GrpYearItem> out1GrpYearItem;

    /**
     * Gets the value of the out1GrpYearItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the out1GrpYearItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOut1GrpYearItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Out1GrpYearItem }
     * 
     * 
     */
    public List<Out1GrpYearItem> getOut1GrpYearItem() {
        if (out1GrpYearItem == null) {
            out1GrpYearItem = new ArrayList<Out1GrpYearItem>();
        }
        return this.out1GrpYearItem;
    }

}
