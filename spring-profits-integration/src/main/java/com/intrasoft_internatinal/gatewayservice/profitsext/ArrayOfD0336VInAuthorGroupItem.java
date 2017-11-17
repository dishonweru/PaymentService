
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD0336VInAuthorGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD0336VInAuthorGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D0336VInAuthorGroupItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}D0336VInAuthorGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD0336VInAuthorGroupItem", propOrder = {
    "d0336VInAuthorGroupItem"
})
public class ArrayOfD0336VInAuthorGroupItem {

    @XmlElement(name = "D0336VInAuthorGroupItem")
    protected List<D0336VInAuthorGroupItem> d0336VInAuthorGroupItem;

    /**
     * Gets the value of the d0336VInAuthorGroupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d0336VInAuthorGroupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD0336VInAuthorGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D0336VInAuthorGroupItem }
     * 
     * 
     */
    public List<D0336VInAuthorGroupItem> getD0336VInAuthorGroupItem() {
        if (d0336VInAuthorGroupItem == null) {
            d0336VInAuthorGroupItem = new ArrayList<D0336VInAuthorGroupItem>();
        }
        return this.d0336VInAuthorGroupItem;
    }

}
