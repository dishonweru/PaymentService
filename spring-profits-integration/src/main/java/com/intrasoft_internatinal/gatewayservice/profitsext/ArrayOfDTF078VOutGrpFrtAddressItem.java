
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDTF078VOutGrpFrtAddressItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDTF078VOutGrpFrtAddressItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTF078VOutGrpFrtAddressItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DTF078VOutGrpFrtAddressItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDTF078VOutGrpFrtAddressItem", propOrder = {
    "dtf078VOutGrpFrtAddressItem"
})
public class ArrayOfDTF078VOutGrpFrtAddressItem {

    @XmlElement(name = "DTF078VOutGrpFrtAddressItem")
    protected List<DTF078VOutGrpFrtAddressItem> dtf078VOutGrpFrtAddressItem;

    /**
     * Gets the value of the dtf078VOutGrpFrtAddressItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtf078VOutGrpFrtAddressItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTF078VOutGrpFrtAddressItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTF078VOutGrpFrtAddressItem }
     * 
     * 
     */
    public List<DTF078VOutGrpFrtAddressItem> getDTF078VOutGrpFrtAddressItem() {
        if (dtf078VOutGrpFrtAddressItem == null) {
            dtf078VOutGrpFrtAddressItem = new ArrayList<DTF078VOutGrpFrtAddressItem>();
        }
        return this.dtf078VOutGrpFrtAddressItem;
    }

}
