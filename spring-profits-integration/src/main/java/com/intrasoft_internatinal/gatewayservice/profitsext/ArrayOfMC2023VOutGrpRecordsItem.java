
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMC2023VOutGrpRecordsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMC2023VOutGrpRecordsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MC2023VOutGrpRecordsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2023VOutGrpRecordsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMC2023VOutGrpRecordsItem", propOrder = {
    "mc2023VOutGrpRecordsItem"
})
public class ArrayOfMC2023VOutGrpRecordsItem {

    @XmlElement(name = "MC2023VOutGrpRecordsItem")
    protected List<MC2023VOutGrpRecordsItem> mc2023VOutGrpRecordsItem;

    /**
     * Gets the value of the mc2023VOutGrpRecordsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2023VOutGrpRecordsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMC2023VOutGrpRecordsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MC2023VOutGrpRecordsItem }
     * 
     * 
     */
    public List<MC2023VOutGrpRecordsItem> getMC2023VOutGrpRecordsItem() {
        if (mc2023VOutGrpRecordsItem == null) {
            mc2023VOutGrpRecordsItem = new ArrayList<MC2023VOutGrpRecordsItem>();
        }
        return this.mc2023VOutGrpRecordsItem;
    }

}
