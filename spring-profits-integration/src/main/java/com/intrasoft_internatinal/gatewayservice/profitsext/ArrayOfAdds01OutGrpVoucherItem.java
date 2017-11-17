
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdds01OutGrpVoucherItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdds01OutGrpVoucherItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adds01OutGrpVoucherItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Adds01OutGrpVoucherItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdds01OutGrpVoucherItem", propOrder = {
    "adds01OutGrpVoucherItem"
})
public class ArrayOfAdds01OutGrpVoucherItem {

    @XmlElement(name = "Adds01OutGrpVoucherItem")
    protected List<Adds01OutGrpVoucherItem> adds01OutGrpVoucherItem;

    /**
     * Gets the value of the adds01OutGrpVoucherItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adds01OutGrpVoucherItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdds01OutGrpVoucherItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adds01OutGrpVoucherItem }
     * 
     * 
     */
    public List<Adds01OutGrpVoucherItem> getAdds01OutGrpVoucherItem() {
        if (adds01OutGrpVoucherItem == null) {
            adds01OutGrpVoucherItem = new ArrayList<Adds01OutGrpVoucherItem>();
        }
        return this.adds01OutGrpVoucherItem;
    }

}
