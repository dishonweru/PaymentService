
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfA1954VOutGrpLimitInformationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfA1954VOutGrpLimitInformationItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A1954VOutGrpLimitInformationItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1954VOutGrpLimitInformationItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfA1954VOutGrpLimitInformationItem", propOrder = {
    "a1954VOutGrpLimitInformationItem"
})
public class ArrayOfA1954VOutGrpLimitInformationItem {

    @XmlElement(name = "A1954VOutGrpLimitInformationItem")
    protected List<A1954VOutGrpLimitInformationItem> a1954VOutGrpLimitInformationItem;

    /**
     * Gets the value of the a1954VOutGrpLimitInformationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a1954VOutGrpLimitInformationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA1954VOutGrpLimitInformationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link A1954VOutGrpLimitInformationItem }
     * 
     * 
     */
    public List<A1954VOutGrpLimitInformationItem> getA1954VOutGrpLimitInformationItem() {
        if (a1954VOutGrpLimitInformationItem == null) {
            a1954VOutGrpLimitInformationItem = new ArrayList<A1954VOutGrpLimitInformationItem>();
        }
        return this.a1954VOutGrpLimitInformationItem;
    }

}
