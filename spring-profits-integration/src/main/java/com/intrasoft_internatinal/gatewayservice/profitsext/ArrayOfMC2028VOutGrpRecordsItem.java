
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2028VOutGrpRecordsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2028VOutGrpRecordsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2028VOutGrpRecordsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2028VOutGrpRecordsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2028VOutGrpRecordsItem", propOrder = {
    "mc2028VOutGrpRecordsItem"
})
public class ArrayOfMC2028VOutGrpRecordsItem {

    @XmlElement(name = "MC2028VOutGrpRecordsItem")
    protected List<MC2028VOutGrpRecordsItem> mc2028VOutGrpRecordsItem;

    /**
     * Gets the value of the mc2028VOutGrpRecordsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2028VOutGrpRecordsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2028VOutGrpRecordsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2028VOutGrpRecordsItem }
     * 
     * 
     */
    public List<MC2028VOutGrpRecordsItem> getMC2028VOutGrpRecordsItem() {
        if (mc2028VOutGrpRecordsItem == null) {
            mc2028VOutGrpRecordsItem = new ArrayList<MC2028VOutGrpRecordsItem>();
        }
        return this.mc2028VOutGrpRecordsItem;
    }

}
