
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0437VOutGrpIssuanceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0437VOutGrpIssuanceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0437VOutGrpIssuanceItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0437VOutGrpIssuanceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0437VOutGrpIssuanceItem", propOrder = {
    "l0437VOutGrpIssuanceItem"
})
public class ArrayOfL0437VOutGrpIssuanceItem {

    @XmlElement(name = "L0437VOutGrpIssuanceItem")
    protected List<L0437VOutGrpIssuanceItem> l0437VOutGrpIssuanceItem;

    /**
     * Gets the value of the l0437VOutGrpIssuanceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0437VOutGrpIssuanceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0437VOutGrpIssuanceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0437VOutGrpIssuanceItem }
     * 
     * 
     */
    public List<L0437VOutGrpIssuanceItem> getL0437VOutGrpIssuanceItem() {
        if (l0437VOutGrpIssuanceItem == null) {
            l0437VOutGrpIssuanceItem = new ArrayList<L0437VOutGrpIssuanceItem>();
        }
        return this.l0437VOutGrpIssuanceItem;
    }

}
