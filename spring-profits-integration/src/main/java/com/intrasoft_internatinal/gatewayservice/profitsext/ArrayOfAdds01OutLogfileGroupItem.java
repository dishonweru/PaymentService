
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdds01OutLogfileGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdds01OutLogfileGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adds01OutLogfileGroupItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Adds01OutLogfileGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdds01OutLogfileGroupItem", propOrder = {
    "adds01OutLogfileGroupItem"
})
public class ArrayOfAdds01OutLogfileGroupItem {

    @XmlElement(name = "Adds01OutLogfileGroupItem")
    protected List<Adds01OutLogfileGroupItem> adds01OutLogfileGroupItem;

    /**
     * Gets the value of the adds01OutLogfileGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adds01OutLogfileGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdds01OutLogfileGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adds01OutLogfileGroupItem }
     * 
     * 
     */
    public List<Adds01OutLogfileGroupItem> getAdds01OutLogfileGroupItem() {
        if (adds01OutLogfileGroupItem == null) {
            adds01OutLogfileGroupItem = new ArrayList<Adds01OutLogfileGroupItem>();
        }
        return this.adds01OutLogfileGroupItem;
    }

}
