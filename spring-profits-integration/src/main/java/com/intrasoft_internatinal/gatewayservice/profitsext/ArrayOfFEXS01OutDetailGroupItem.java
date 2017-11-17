
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS01OutDetailGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS01OutDetailGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS01OutDetailGroupItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01OutDetailGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS01OutDetailGroupItem", propOrder = {
    "fexs01OutDetailGroupItem"
})
public class ArrayOfFEXS01OutDetailGroupItem {

    @XmlElement(name = "FEXS01OutDetailGroupItem")
    protected List<FEXS01OutDetailGroupItem> fexs01OutDetailGroupItem;

    /**
     * Gets the value of the fexs01OutDetailGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs01OutDetailGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS01OutDetailGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS01OutDetailGroupItem }
     * 
     * 
     */
    public List<FEXS01OutDetailGroupItem> getFEXS01OutDetailGroupItem() {
        if (fexs01OutDetailGroupItem == null) {
            fexs01OutDetailGroupItem = new ArrayList<FEXS01OutDetailGroupItem>();
        }
        return this.fexs01OutDetailGroupItem;
    }

}
