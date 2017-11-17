
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS03OutRateTable1Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS03OutRateTable1Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS03OutRateTable1Item" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS03OutRateTable1Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS03OutRateTable1Item", propOrder = {
    "fexs03OutRateTable1Item"
})
public class ArrayOfFEXS03OutRateTable1Item {

    @XmlElement(name = "FEXS03OutRateTable1Item")
    protected List<FEXS03OutRateTable1Item> fexs03OutRateTable1Item;

    /**
     * Gets the value of the fexs03OutRateTable1Item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs03OutRateTable1Item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS03OutRateTable1Item().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS03OutRateTable1Item }
     * 
     * 
     */
    public List<FEXS03OutRateTable1Item> getFEXS03OutRateTable1Item() {
        if (fexs03OutRateTable1Item == null) {
            fexs03OutRateTable1Item = new ArrayList<FEXS03OutRateTable1Item>();
        }
        return this.fexs03OutRateTable1Item;
    }

}
