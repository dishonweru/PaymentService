
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfX2230VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfX2230VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X2230VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2230VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfX2230VOutGrpItem", propOrder = {
    "x2230VOutGrpItem"
})
public class ArrayOfX2230VOutGrpItem {

    @XmlElement(name = "X2230VOutGrpItem")
    protected List<X2230VOutGrpItem> x2230VOutGrpItem;

    /**
     * Gets the value of the x2230VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x2230VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX2230VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X2230VOutGrpItem }
     * 
     * 
     */
    public List<X2230VOutGrpItem> getX2230VOutGrpItem() {
        if (x2230VOutGrpItem == null) {
            x2230VOutGrpItem = new ArrayList<X2230VOutGrpItem>();
        }
        return this.x2230VOutGrpItem;
    }

}
