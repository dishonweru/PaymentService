
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfX2232VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfX2232VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X2232VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}X2232VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfX2232VOutGrpSrvLogItem", propOrder = {
    "x2232VOutGrpSrvLogItem"
})
public class ArrayOfX2232VOutGrpSrvLogItem {

    @XmlElement(name = "X2232VOutGrpSrvLogItem")
    protected List<X2232VOutGrpSrvLogItem> x2232VOutGrpSrvLogItem;

    /**
     * Gets the value of the x2232VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x2232VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX2232VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X2232VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<X2232VOutGrpSrvLogItem> getX2232VOutGrpSrvLogItem() {
        if (x2232VOutGrpSrvLogItem == null) {
            x2232VOutGrpSrvLogItem = new ArrayList<X2232VOutGrpSrvLogItem>();
        }
        return this.x2232VOutGrpSrvLogItem;
    }

}
