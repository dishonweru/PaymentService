
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCI4000VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCI4000VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CI4000VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI4000VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCI4000VOutGrpItem", propOrder = {
    "ci4000VOutGrpItem"
})
public class ArrayOfCI4000VOutGrpItem {

    @XmlElement(name = "CI4000VOutGrpItem")
    protected List<CI4000VOutGrpItem> ci4000VOutGrpItem;

    /**
     * Gets the value of the ci4000VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ci4000VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCI4000VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CI4000VOutGrpItem }
     * 
     * 
     */
    public List<CI4000VOutGrpItem> getCI4000VOutGrpItem() {
        if (ci4000VOutGrpItem == null) {
            ci4000VOutGrpItem = new ArrayList<CI4000VOutGrpItem>();
        }
        return this.ci4000VOutGrpItem;
    }

}
