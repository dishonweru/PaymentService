
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS01InGrpChargesRecordingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS01InGrpChargesRecordingItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS01InGrpChargesRecordingItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01InGrpChargesRecordingItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS01InGrpChargesRecordingItem", propOrder = {
    "fexs01InGrpChargesRecordingItem"
})
public class ArrayOfFEXS01InGrpChargesRecordingItem {

    @XmlElement(name = "FEXS01InGrpChargesRecordingItem")
    protected List<FEXS01InGrpChargesRecordingItem> fexs01InGrpChargesRecordingItem;

    /**
     * Gets the value of the fexs01InGrpChargesRecordingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs01InGrpChargesRecordingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS01InGrpChargesRecordingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS01InGrpChargesRecordingItem }
     * 
     * 
     */
    public List<FEXS01InGrpChargesRecordingItem> getFEXS01InGrpChargesRecordingItem() {
        if (fexs01InGrpChargesRecordingItem == null) {
            fexs01InGrpChargesRecordingItem = new ArrayList<FEXS01InGrpChargesRecordingItem>();
        }
        return this.fexs01InGrpChargesRecordingItem;
    }

}
