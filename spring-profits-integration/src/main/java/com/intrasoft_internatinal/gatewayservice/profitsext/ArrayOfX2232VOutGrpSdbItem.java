
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfX2232VOutGrpSdbItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfX2232VOutGrpSdbItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X2232VOutGrpSdbItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2232VOutGrpSdbItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfX2232VOutGrpSdbItem", propOrder = {
    "x2232VOutGrpSdbItem"
})
public class ArrayOfX2232VOutGrpSdbItem {

    @XmlElement(name = "X2232VOutGrpSdbItem")
    protected List<X2232VOutGrpSdbItem> x2232VOutGrpSdbItem;

    /**
     * Gets the value of the x2232VOutGrpSdbItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x2232VOutGrpSdbItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX2232VOutGrpSdbItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X2232VOutGrpSdbItem }
     * 
     * 
     */
    public List<X2232VOutGrpSdbItem> getX2232VOutGrpSdbItem() {
        if (x2232VOutGrpSdbItem == null) {
            x2232VOutGrpSdbItem = new ArrayList<X2232VOutGrpSdbItem>();
        }
        return this.x2232VOutGrpSdbItem;
    }

}
