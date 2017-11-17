
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLna0405VInCoinsuredGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLna0405VInCoinsuredGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lna0405VInCoinsuredGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Lna0405VInCoinsuredGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLna0405VInCoinsuredGrpItem", propOrder = {
    "lna0405VInCoinsuredGrpItem"
})
public class ArrayOfLna0405VInCoinsuredGrpItem {

    @XmlElement(name = "Lna0405VInCoinsuredGrpItem")
    protected List<Lna0405VInCoinsuredGrpItem> lna0405VInCoinsuredGrpItem;

    /**
     * Gets the value of the lna0405VInCoinsuredGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lna0405VInCoinsuredGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLna0405VInCoinsuredGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lna0405VInCoinsuredGrpItem }
     * 
     * 
     */
    public List<Lna0405VInCoinsuredGrpItem> getLna0405VInCoinsuredGrpItem() {
        if (lna0405VInCoinsuredGrpItem == null) {
            lna0405VInCoinsuredGrpItem = new ArrayList<Lna0405VInCoinsuredGrpItem>();
        }
        return this.lna0405VInCoinsuredGrpItem;
    }

}
