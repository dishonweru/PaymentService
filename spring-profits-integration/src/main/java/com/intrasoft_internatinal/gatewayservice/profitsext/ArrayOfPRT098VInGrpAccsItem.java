
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPRT098VInGrpAccsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPRT098VInGrpAccsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRT098VInGrpAccsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PRT098VInGrpAccsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPRT098VInGrpAccsItem", propOrder = {
    "prt098VInGrpAccsItem"
})
public class ArrayOfPRT098VInGrpAccsItem {

    @XmlElement(name = "PRT098VInGrpAccsItem")
    protected List<PRT098VInGrpAccsItem> prt098VInGrpAccsItem;

    /**
     * Gets the value of the prt098VInGrpAccsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prt098VInGrpAccsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRT098VInGrpAccsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRT098VInGrpAccsItem }
     * 
     * 
     */
    public List<PRT098VInGrpAccsItem> getPRT098VInGrpAccsItem() {
        if (prt098VInGrpAccsItem == null) {
            prt098VInGrpAccsItem = new ArrayList<PRT098VInGrpAccsItem>();
        }
        return this.prt098VInGrpAccsItem;
    }

}
