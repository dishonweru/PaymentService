
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0135VInListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0135VInListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0135VInListGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0135VInListGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0135VInListGrpItem", propOrder = {
    "i0135VInListGrpItem"
})
public class ArrayOfI0135VInListGrpItem {

    @XmlElement(name = "I0135VInListGrpItem")
    protected List<I0135VInListGrpItem> i0135VInListGrpItem;

    /**
     * Gets the value of the i0135VInListGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0135VInListGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0135VInListGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0135VInListGrpItem }
     * 
     * 
     */
    public List<I0135VInListGrpItem> getI0135VInListGrpItem() {
        if (i0135VInListGrpItem == null) {
            i0135VInListGrpItem = new ArrayList<I0135VInListGrpItem>();
        }
        return this.i0135VInListGrpItem;
    }

}
