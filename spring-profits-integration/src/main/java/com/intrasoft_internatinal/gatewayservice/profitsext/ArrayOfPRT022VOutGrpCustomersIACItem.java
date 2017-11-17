
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPRT022VOutGrpCustomersIACItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPRT022VOutGrpCustomersIACItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRT022VOutGrpCustomersIACItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PRT022VOutGrpCustomersIACItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPRT022VOutGrpCustomersIACItem", propOrder = {
    "prt022VOutGrpCustomersIACItem"
})
public class ArrayOfPRT022VOutGrpCustomersIACItem {

    @XmlElement(name = "PRT022VOutGrpCustomersIACItem")
    protected List<PRT022VOutGrpCustomersIACItem> prt022VOutGrpCustomersIACItem;

    /**
     * Gets the value of the prt022VOutGrpCustomersIACItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prt022VOutGrpCustomersIACItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRT022VOutGrpCustomersIACItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRT022VOutGrpCustomersIACItem }
     * 
     * 
     */
    public List<PRT022VOutGrpCustomersIACItem> getPRT022VOutGrpCustomersIACItem() {
        if (prt022VOutGrpCustomersIACItem == null) {
            prt022VOutGrpCustomersIACItem = new ArrayList<PRT022VOutGrpCustomersIACItem>();
        }
        return this.prt022VOutGrpCustomersIACItem;
    }

}
