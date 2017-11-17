
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSL705VOutListboxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSL705VOutListboxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SL705VOutListboxItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SL705VOutListboxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSL705VOutListboxItem", propOrder = {
    "sl705VOutListboxItem"
})
public class ArrayOfSL705VOutListboxItem {

    @XmlElement(name = "SL705VOutListboxItem")
    protected List<SL705VOutListboxItem> sl705VOutListboxItem;

    /**
     * Gets the value of the sl705VOutListboxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sl705VOutListboxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSL705VOutListboxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SL705VOutListboxItem }
     * 
     * 
     */
    public List<SL705VOutListboxItem> getSL705VOutListboxItem() {
        if (sl705VOutListboxItem == null) {
            sl705VOutListboxItem = new ArrayList<SL705VOutListboxItem>();
        }
        return this.sl705VOutListboxItem;
    }

}
