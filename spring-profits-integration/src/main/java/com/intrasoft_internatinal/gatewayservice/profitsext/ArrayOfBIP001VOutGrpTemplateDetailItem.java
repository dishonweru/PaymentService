
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBIP001VOutGrpTemplateDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBIP001VOutGrpTemplateDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIP001VOutGrpTemplateDetailItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BIP001VOutGrpTemplateDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBIP001VOutGrpTemplateDetailItem", propOrder = {
    "bip001VOutGrpTemplateDetailItem"
})
public class ArrayOfBIP001VOutGrpTemplateDetailItem {

    @XmlElement(name = "BIP001VOutGrpTemplateDetailItem")
    protected List<BIP001VOutGrpTemplateDetailItem> bip001VOutGrpTemplateDetailItem;

    /**
     * Gets the value of the bip001VOutGrpTemplateDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bip001VOutGrpTemplateDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBIP001VOutGrpTemplateDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BIP001VOutGrpTemplateDetailItem }
     * 
     * 
     */
    public List<BIP001VOutGrpTemplateDetailItem> getBIP001VOutGrpTemplateDetailItem() {
        if (bip001VOutGrpTemplateDetailItem == null) {
            bip001VOutGrpTemplateDetailItem = new ArrayList<BIP001VOutGrpTemplateDetailItem>();
        }
        return this.bip001VOutGrpTemplateDetailItem;
    }

}
