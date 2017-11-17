
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD0301VInGrpOwnersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD0301VInGrpOwnersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D0301VInGrpOwnersItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0301VInGrpOwnersItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD0301VInGrpOwnersItem", propOrder = {
    "d0301VInGrpOwnersItem"
})
public class ArrayOfD0301VInGrpOwnersItem {

    @XmlElement(name = "D0301VInGrpOwnersItem")
    protected List<D0301VInGrpOwnersItem> d0301VInGrpOwnersItem;

    /**
     * Gets the value of the d0301VInGrpOwnersItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d0301VInGrpOwnersItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD0301VInGrpOwnersItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D0301VInGrpOwnersItem }
     * 
     * 
     */
    public List<D0301VInGrpOwnersItem> getD0301VInGrpOwnersItem() {
        if (d0301VInGrpOwnersItem == null) {
            d0301VInGrpOwnersItem = new ArrayList<D0301VInGrpOwnersItem>();
        }
        return this.d0301VInGrpOwnersItem;
    }

}
