
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfP0831VOutGrpUnitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfP0831VOutGrpUnitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P0831VOutGrpUnitItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}P0831VOutGrpUnitItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfP0831VOutGrpUnitItem", propOrder = {
    "p0831VOutGrpUnitItem"
})
public class ArrayOfP0831VOutGrpUnitItem {

    @XmlElement(name = "P0831VOutGrpUnitItem")
    protected List<P0831VOutGrpUnitItem> p0831VOutGrpUnitItem;

    /**
     * Gets the value of the p0831VOutGrpUnitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p0831VOutGrpUnitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP0831VOutGrpUnitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P0831VOutGrpUnitItem }
     * 
     * 
     */
    public List<P0831VOutGrpUnitItem> getP0831VOutGrpUnitItem() {
        if (p0831VOutGrpUnitItem == null) {
            p0831VOutGrpUnitItem = new ArrayList<P0831VOutGrpUnitItem>();
        }
        return this.p0831VOutGrpUnitItem;
    }

}
