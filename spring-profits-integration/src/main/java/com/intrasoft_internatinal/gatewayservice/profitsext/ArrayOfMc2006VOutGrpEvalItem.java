
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2006VOutGrpEvalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2006VOutGrpEvalItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2006VOutGrpEvalItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2006VOutGrpEvalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2006VOutGrpEvalItem", propOrder = {
    "mc2006VOutGrpEvalItem"
})
public class ArrayOfMc2006VOutGrpEvalItem {

    @XmlElement(name = "Mc2006VOutGrpEvalItem")
    protected List<Mc2006VOutGrpEvalItem> mc2006VOutGrpEvalItem;

    /**
     * Gets the value of the mc2006VOutGrpEvalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2006VOutGrpEvalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2006VOutGrpEvalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2006VOutGrpEvalItem }
     * 
     * 
     */
    public List<Mc2006VOutGrpEvalItem> getMc2006VOutGrpEvalItem() {
        if (mc2006VOutGrpEvalItem == null) {
            mc2006VOutGrpEvalItem = new ArrayList<Mc2006VOutGrpEvalItem>();
        }
        return this.mc2006VOutGrpEvalItem;
    }

}
