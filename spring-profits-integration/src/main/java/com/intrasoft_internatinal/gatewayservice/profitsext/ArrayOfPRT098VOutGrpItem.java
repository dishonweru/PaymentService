
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPRT098VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPRT098VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRT098VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PRT098VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPRT098VOutGrpItem", propOrder = {
    "prt098VOutGrpItem"
})
public class ArrayOfPRT098VOutGrpItem {

    @XmlElement(name = "PRT098VOutGrpItem")
    protected List<PRT098VOutGrpItem> prt098VOutGrpItem;

    /**
     * Gets the value of the prt098VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prt098VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRT098VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRT098VOutGrpItem }
     * 
     * 
     */
    public List<PRT098VOutGrpItem> getPRT098VOutGrpItem() {
        if (prt098VOutGrpItem == null) {
            prt098VOutGrpItem = new ArrayList<PRT098VOutGrpItem>();
        }
        return this.prt098VOutGrpItem;
    }

}
