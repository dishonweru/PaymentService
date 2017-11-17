
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD0357VOutGrpMntExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD0357VOutGrpMntExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D0357VOutGrpMntExtraitItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0357VOutGrpMntExtraitItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD0357VOutGrpMntExtraitItem", propOrder = {
    "d0357VOutGrpMntExtraitItem"
})
public class ArrayOfD0357VOutGrpMntExtraitItem {

    @XmlElement(name = "D0357VOutGrpMntExtraitItem")
    protected List<D0357VOutGrpMntExtraitItem> d0357VOutGrpMntExtraitItem;

    /**
     * Gets the value of the d0357VOutGrpMntExtraitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d0357VOutGrpMntExtraitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD0357VOutGrpMntExtraitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D0357VOutGrpMntExtraitItem }
     * 
     * 
     */
    public List<D0357VOutGrpMntExtraitItem> getD0357VOutGrpMntExtraitItem() {
        if (d0357VOutGrpMntExtraitItem == null) {
            d0357VOutGrpMntExtraitItem = new ArrayList<D0357VOutGrpMntExtraitItem>();
        }
        return this.d0357VOutGrpMntExtraitItem;
    }

}
