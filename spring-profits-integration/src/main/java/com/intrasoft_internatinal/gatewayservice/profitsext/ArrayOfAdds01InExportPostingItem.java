
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdds01InExportPostingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdds01InExportPostingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adds01InExportPostingItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Adds01InExportPostingItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdds01InExportPostingItem", propOrder = {
    "adds01InExportPostingItem"
})
public class ArrayOfAdds01InExportPostingItem {

    @XmlElement(name = "Adds01InExportPostingItem")
    protected List<Adds01InExportPostingItem> adds01InExportPostingItem;

    /**
     * Gets the value of the adds01InExportPostingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adds01InExportPostingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdds01InExportPostingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adds01InExportPostingItem }
     * 
     * 
     */
    public List<Adds01InExportPostingItem> getAdds01InExportPostingItem() {
        if (adds01InExportPostingItem == null) {
            adds01InExportPostingItem = new ArrayList<Adds01InExportPostingItem>();
        }
        return this.adds01InExportPostingItem;
    }

}
