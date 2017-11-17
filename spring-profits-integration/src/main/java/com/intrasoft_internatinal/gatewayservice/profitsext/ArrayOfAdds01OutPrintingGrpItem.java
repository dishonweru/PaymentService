
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdds01OutPrintingGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdds01OutPrintingGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adds01OutPrintingGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Adds01OutPrintingGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdds01OutPrintingGrpItem", propOrder = {
    "adds01OutPrintingGrpItem"
})
public class ArrayOfAdds01OutPrintingGrpItem {

    @XmlElement(name = "Adds01OutPrintingGrpItem")
    protected List<Adds01OutPrintingGrpItem> adds01OutPrintingGrpItem;

    /**
     * Gets the value of the adds01OutPrintingGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adds01OutPrintingGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdds01OutPrintingGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adds01OutPrintingGrpItem }
     * 
     * 
     */
    public List<Adds01OutPrintingGrpItem> getAdds01OutPrintingGrpItem() {
        if (adds01OutPrintingGrpItem == null) {
            adds01OutPrintingGrpItem = new ArrayList<Adds01OutPrintingGrpItem>();
        }
        return this.adds01OutPrintingGrpItem;
    }

}
