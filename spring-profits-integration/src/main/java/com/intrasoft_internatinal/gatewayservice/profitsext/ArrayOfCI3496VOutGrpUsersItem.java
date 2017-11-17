
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCI3496VOutGrpUsersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCI3496VOutGrpUsersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CI3496VOutGrpUsersItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI3496VOutGrpUsersItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCI3496VOutGrpUsersItem", propOrder = {
    "ci3496VOutGrpUsersItem"
})
public class ArrayOfCI3496VOutGrpUsersItem {

    @XmlElement(name = "CI3496VOutGrpUsersItem")
    protected List<CI3496VOutGrpUsersItem> ci3496VOutGrpUsersItem;

    /**
     * Gets the value of the ci3496VOutGrpUsersItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ci3496VOutGrpUsersItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCI3496VOutGrpUsersItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CI3496VOutGrpUsersItem }
     * 
     * 
     */
    public List<CI3496VOutGrpUsersItem> getCI3496VOutGrpUsersItem() {
        if (ci3496VOutGrpUsersItem == null) {
            ci3496VOutGrpUsersItem = new ArrayList<CI3496VOutGrpUsersItem>();
        }
        return this.ci3496VOutGrpUsersItem;
    }

}
