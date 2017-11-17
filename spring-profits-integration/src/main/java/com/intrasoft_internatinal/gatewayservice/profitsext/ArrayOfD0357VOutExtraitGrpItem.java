
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD0357VOutExtraitGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD0357VOutExtraitGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D0357VOutExtraitGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0357VOutExtraitGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD0357VOutExtraitGrpItem", propOrder = {
    "d0357VOutExtraitGrpItem"
})
public class ArrayOfD0357VOutExtraitGrpItem {

    @XmlElement(name = "D0357VOutExtraitGrpItem")
    protected List<D0357VOutExtraitGrpItem> d0357VOutExtraitGrpItem;

    /**
     * Gets the value of the d0357VOutExtraitGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d0357VOutExtraitGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD0357VOutExtraitGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D0357VOutExtraitGrpItem }
     * 
     * 
     */
    public List<D0357VOutExtraitGrpItem> getD0357VOutExtraitGrpItem() {
        if (d0357VOutExtraitGrpItem == null) {
            d0357VOutExtraitGrpItem = new ArrayList<D0357VOutExtraitGrpItem>();
        }
        return this.d0357VOutExtraitGrpItem;
    }

}
