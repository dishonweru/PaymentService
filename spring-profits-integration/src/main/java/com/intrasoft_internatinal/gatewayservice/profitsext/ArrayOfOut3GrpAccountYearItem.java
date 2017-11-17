
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOut3GrpAccountYearItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOut3GrpAccountYearItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out3GrpAccountYearItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Out3GrpAccountYearItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOut3GrpAccountYearItem", propOrder = {
    "out3GrpAccountYearItem"
})
public class ArrayOfOut3GrpAccountYearItem {

    @XmlElement(name = "Out3GrpAccountYearItem")
    protected List<Out3GrpAccountYearItem> out3GrpAccountYearItem;

    /**
     * Gets the value of the out3GrpAccountYearItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the out3GrpAccountYearItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOut3GrpAccountYearItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Out3GrpAccountYearItem }
     * 
     * 
     */
    public List<Out3GrpAccountYearItem> getOut3GrpAccountYearItem() {
        if (out3GrpAccountYearItem == null) {
            out3GrpAccountYearItem = new ArrayList<Out3GrpAccountYearItem>();
        }
        return this.out3GrpAccountYearItem;
    }

}
