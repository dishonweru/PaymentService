
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0130VInListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0130VInListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0130VInListGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0130VInListGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0130VInListGrpItem", propOrder = {
    "i0130VInListGrpItem"
})
public class ArrayOfI0130VInListGrpItem {

    @XmlElement(name = "I0130VInListGrpItem")
    protected List<I0130VInListGrpItem> i0130VInListGrpItem;

    /**
     * Gets the value of the i0130VInListGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0130VInListGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0130VInListGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0130VInListGrpItem }
     * 
     * 
     */
    public List<I0130VInListGrpItem> getI0130VInListGrpItem() {
        if (i0130VInListGrpItem == null) {
            i0130VInListGrpItem = new ArrayList<I0130VInListGrpItem>();
        }
        return this.i0130VInListGrpItem;
    }

}
