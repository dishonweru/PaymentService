
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD0325VOutCobGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD0325VOutCobGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D0325VOutCobGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0325VOutCobGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD0325VOutCobGrpItem", propOrder = {
    "d0325VOutCobGrpItem"
})
public class ArrayOfD0325VOutCobGrpItem {

    @XmlElement(name = "D0325VOutCobGrpItem")
    protected List<D0325VOutCobGrpItem> d0325VOutCobGrpItem;

    /**
     * Gets the value of the d0325VOutCobGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d0325VOutCobGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD0325VOutCobGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D0325VOutCobGrpItem }
     * 
     * 
     */
    public List<D0325VOutCobGrpItem> getD0325VOutCobGrpItem() {
        if (d0325VOutCobGrpItem == null) {
            d0325VOutCobGrpItem = new ArrayList<D0325VOutCobGrpItem>();
        }
        return this.d0325VOutCobGrpItem;
    }

}
