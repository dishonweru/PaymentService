
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSL702VOutListboxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSL702VOutListboxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SL702VOutListboxItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SL702VOutListboxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSL702VOutListboxItem", propOrder = {
    "sl702VOutListboxItem"
})
public class ArrayOfSL702VOutListboxItem {

    @XmlElement(name = "SL702VOutListboxItem")
    protected List<SL702VOutListboxItem> sl702VOutListboxItem;

    /**
     * Gets the value of the sl702VOutListboxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sl702VOutListboxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSL702VOutListboxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SL702VOutListboxItem }
     * 
     * 
     */
    public List<SL702VOutListboxItem> getSL702VOutListboxItem() {
        if (sl702VOutListboxItem == null) {
            sl702VOutListboxItem = new ArrayList<SL702VOutListboxItem>();
        }
        return this.sl702VOutListboxItem;
    }

}
