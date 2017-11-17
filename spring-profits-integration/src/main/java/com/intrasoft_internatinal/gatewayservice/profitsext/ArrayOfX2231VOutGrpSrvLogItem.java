
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfX2231VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfX2231VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X2231VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2231VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfX2231VOutGrpSrvLogItem", propOrder = {
    "x2231VOutGrpSrvLogItem"
})
public class ArrayOfX2231VOutGrpSrvLogItem {

    @XmlElement(name = "X2231VOutGrpSrvLogItem")
    protected List<X2231VOutGrpSrvLogItem> x2231VOutGrpSrvLogItem;

    /**
     * Gets the value of the x2231VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x2231VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX2231VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X2231VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<X2231VOutGrpSrvLogItem> getX2231VOutGrpSrvLogItem() {
        if (x2231VOutGrpSrvLogItem == null) {
            x2231VOutGrpSrvLogItem = new ArrayList<X2231VOutGrpSrvLogItem>();
        }
        return this.x2231VOutGrpSrvLogItem;
    }

}
