
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpHousingTheftItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpHousingTheftItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpHousingTheftItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpHousingTheftItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpHousingTheftItem", propOrder = {
    "outGrpHousingTheftItem"
})
public class ArrayOfOutGrpHousingTheftItem {

    @XmlElement(name = "OutGrpHousingTheftItem")
    protected List<OutGrpHousingTheftItem> outGrpHousingTheftItem;

    /**
     * Gets the value of the outGrpHousingTheftItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpHousingTheftItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpHousingTheftItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpHousingTheftItem }
     * 
     * 
     */
    public List<OutGrpHousingTheftItem> getOutGrpHousingTheftItem() {
        if (outGrpHousingTheftItem == null) {
            outGrpHousingTheftItem = new ArrayList<OutGrpHousingTheftItem>();
        }
        return this.outGrpHousingTheftItem;
    }

}
