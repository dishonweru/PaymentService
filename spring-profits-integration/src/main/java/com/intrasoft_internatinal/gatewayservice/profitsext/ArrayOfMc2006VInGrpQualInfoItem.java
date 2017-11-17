
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2006VInGrpQualInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2006VInGrpQualInfoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2006VInGrpQualInfoItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2006VInGrpQualInfoItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2006VInGrpQualInfoItem", propOrder = {
    "mc2006VInGrpQualInfoItem"
})
public class ArrayOfMc2006VInGrpQualInfoItem {

    @XmlElement(name = "Mc2006VInGrpQualInfoItem")
    protected List<Mc2006VInGrpQualInfoItem> mc2006VInGrpQualInfoItem;

    /**
     * Gets the value of the mc2006VInGrpQualInfoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2006VInGrpQualInfoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2006VInGrpQualInfoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2006VInGrpQualInfoItem }
     * 
     * 
     */
    public List<Mc2006VInGrpQualInfoItem> getMc2006VInGrpQualInfoItem() {
        if (mc2006VInGrpQualInfoItem == null) {
            mc2006VInGrpQualInfoItem = new ArrayList<Mc2006VInGrpQualInfoItem>();
        }
        return this.mc2006VInGrpQualInfoItem;
    }

}
