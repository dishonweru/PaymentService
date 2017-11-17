
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRI200VIOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRI200VIOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RI200VIOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RI200VIOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRI200VIOutGrpItem", propOrder = {
    "ri200VIOutGrpItem"
})
public class ArrayOfRI200VIOutGrpItem {

    @XmlElement(name = "RI200VIOutGrpItem")
    protected List<RI200VIOutGrpItem> ri200VIOutGrpItem;

    /**
     * Gets the value of the ri200VIOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ri200VIOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRI200VIOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RI200VIOutGrpItem }
     * 
     * 
     */
    public List<RI200VIOutGrpItem> getRI200VIOutGrpItem() {
        if (ri200VIOutGrpItem == null) {
            ri200VIOutGrpItem = new ArrayList<RI200VIOutGrpItem>();
        }
        return this.ri200VIOutGrpItem;
    }

}
