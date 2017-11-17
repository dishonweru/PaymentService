
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS03InGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS03InGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS03InGroupItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS03InGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS03InGroupItem", propOrder = {
    "fexs03InGroupItem"
})
public class ArrayOfFEXS03InGroupItem {

    @XmlElement(name = "FEXS03InGroupItem")
    protected List<FEXS03InGroupItem> fexs03InGroupItem;

    /**
     * Gets the value of the fexs03InGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs03InGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS03InGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS03InGroupItem }
     * 
     * 
     */
    public List<FEXS03InGroupItem> getFEXS03InGroupItem() {
        if (fexs03InGroupItem == null) {
            fexs03InGroupItem = new ArrayList<FEXS03InGroupItem>();
        }
        return this.fexs03InGroupItem;
    }

}
