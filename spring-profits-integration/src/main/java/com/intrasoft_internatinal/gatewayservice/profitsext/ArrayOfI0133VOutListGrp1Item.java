
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0133VOutListGrp1Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0133VOutListGrp1Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0133VOutListGrp1Item" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0133VOutListGrp1Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0133VOutListGrp1Item", propOrder = {
    "i0133VOutListGrp1Item"
})
public class ArrayOfI0133VOutListGrp1Item {

    @XmlElement(name = "I0133VOutListGrp1Item")
    protected List<I0133VOutListGrp1Item> i0133VOutListGrp1Item;

    /**
     * Gets the value of the i0133VOutListGrp1Item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0133VOutListGrp1Item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0133VOutListGrp1Item().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0133VOutListGrp1Item }
     * 
     * 
     */
    public List<I0133VOutListGrp1Item> getI0133VOutListGrp1Item() {
        if (i0133VOutListGrp1Item == null) {
            i0133VOutListGrp1Item = new ArrayList<I0133VOutListGrp1Item>();
        }
        return this.i0133VOutListGrp1Item;
    }

}
