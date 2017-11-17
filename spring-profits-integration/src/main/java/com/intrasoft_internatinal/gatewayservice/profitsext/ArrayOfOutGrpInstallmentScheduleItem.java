
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpInstallmentScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpInstallmentScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpInstallmentScheduleItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpInstallmentScheduleItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpInstallmentScheduleItem", propOrder = {
    "outGrpInstallmentScheduleItem"
})
public class ArrayOfOutGrpInstallmentScheduleItem {

    @XmlElement(name = "OutGrpInstallmentScheduleItem")
    protected List<OutGrpInstallmentScheduleItem> outGrpInstallmentScheduleItem;

    /**
     * Gets the value of the outGrpInstallmentScheduleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpInstallmentScheduleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpInstallmentScheduleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpInstallmentScheduleItem }
     * 
     * 
     */
    public List<OutGrpInstallmentScheduleItem> getOutGrpInstallmentScheduleItem() {
        if (outGrpInstallmentScheduleItem == null) {
            outGrpInstallmentScheduleItem = new ArrayList<OutGrpInstallmentScheduleItem>();
        }
        return this.outGrpInstallmentScheduleItem;
    }

}
