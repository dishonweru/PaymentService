
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD0303VOutGrpBalancesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD0303VOutGrpBalancesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D0303VOutGrpBalancesItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0303VOutGrpBalancesItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD0303VOutGrpBalancesItem", propOrder = {
    "d0303VOutGrpBalancesItem"
})
public class ArrayOfD0303VOutGrpBalancesItem {

    @XmlElement(name = "D0303VOutGrpBalancesItem")
    protected List<D0303VOutGrpBalancesItem> d0303VOutGrpBalancesItem;

    /**
     * Gets the value of the d0303VOutGrpBalancesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d0303VOutGrpBalancesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD0303VOutGrpBalancesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D0303VOutGrpBalancesItem }
     * 
     * 
     */
    public List<D0303VOutGrpBalancesItem> getD0303VOutGrpBalancesItem() {
        if (d0303VOutGrpBalancesItem == null) {
            d0303VOutGrpBalancesItem = new ArrayList<D0303VOutGrpBalancesItem>();
        }
        return this.d0303VOutGrpBalancesItem;
    }

}
