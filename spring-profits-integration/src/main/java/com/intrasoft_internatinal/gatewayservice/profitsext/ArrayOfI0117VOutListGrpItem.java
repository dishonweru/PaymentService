
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0117VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0117VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0117VOutListGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0117VOutListGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0117VOutListGrpItem", propOrder = {
    "i0117VOutListGrpItem"
})
public class ArrayOfI0117VOutListGrpItem {

    @XmlElement(name = "I0117VOutListGrpItem")
    protected List<I0117VOutListGrpItem> i0117VOutListGrpItem;

    /**
     * Gets the value of the i0117VOutListGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0117VOutListGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0117VOutListGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0117VOutListGrpItem }
     * 
     * 
     */
    public List<I0117VOutListGrpItem> getI0117VOutListGrpItem() {
        if (i0117VOutListGrpItem == null) {
            i0117VOutListGrpItem = new ArrayList<I0117VOutListGrpItem>();
        }
        return this.i0117VOutListGrpItem;
    }

}
