
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCI4100VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCI4100VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CI4100VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CI4100VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCI4100VOutGrpItem", propOrder = {
    "ci4100VOutGrpItem"
})
public class ArrayOfCI4100VOutGrpItem {

    @XmlElement(name = "CI4100VOutGrpItem")
    protected List<CI4100VOutGrpItem> ci4100VOutGrpItem;

    /**
     * Gets the value of the ci4100VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ci4100VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCI4100VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CI4100VOutGrpItem }
     * 
     * 
     */
    public List<CI4100VOutGrpItem> getCI4100VOutGrpItem() {
        if (ci4100VOutGrpItem == null) {
            ci4100VOutGrpItem = new ArrayList<CI4100VOutGrpItem>();
        }
        return this.ci4100VOutGrpItem;
    }

}
