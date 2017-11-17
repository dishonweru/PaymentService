
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2004VOutGrpAccountCollateralsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2004VOutGrpAccountCollateralsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2004VOutGrpAccountCollateralsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2004VOutGrpAccountCollateralsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2004VOutGrpAccountCollateralsItem", propOrder = {
    "mc2004VOutGrpAccountCollateralsItem"
})
public class ArrayOfMC2004VOutGrpAccountCollateralsItem {

    @XmlElement(name = "MC2004VOutGrpAccountCollateralsItem")
    protected List<MC2004VOutGrpAccountCollateralsItem> mc2004VOutGrpAccountCollateralsItem;

    /**
     * Gets the value of the mc2004VOutGrpAccountCollateralsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2004VOutGrpAccountCollateralsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2004VOutGrpAccountCollateralsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2004VOutGrpAccountCollateralsItem }
     * 
     * 
     */
    public List<MC2004VOutGrpAccountCollateralsItem> getMC2004VOutGrpAccountCollateralsItem() {
        if (mc2004VOutGrpAccountCollateralsItem == null) {
            mc2004VOutGrpAccountCollateralsItem = new ArrayList<MC2004VOutGrpAccountCollateralsItem>();
        }
        return this.mc2004VOutGrpAccountCollateralsItem;
    }

}
