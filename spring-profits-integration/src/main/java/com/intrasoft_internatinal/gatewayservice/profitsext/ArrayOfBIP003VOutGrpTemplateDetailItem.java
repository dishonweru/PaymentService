
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBIP003VOutGrpTemplateDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBIP003VOutGrpTemplateDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIP003VOutGrpTemplateDetailItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BIP003VOutGrpTemplateDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBIP003VOutGrpTemplateDetailItem", propOrder = {
    "bip003VOutGrpTemplateDetailItem"
})
public class ArrayOfBIP003VOutGrpTemplateDetailItem {

    @XmlElement(name = "BIP003VOutGrpTemplateDetailItem")
    protected List<BIP003VOutGrpTemplateDetailItem> bip003VOutGrpTemplateDetailItem;

    /**
     * Gets the value of the bip003VOutGrpTemplateDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bip003VOutGrpTemplateDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBIP003VOutGrpTemplateDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BIP003VOutGrpTemplateDetailItem }
     * 
     * 
     */
    public List<BIP003VOutGrpTemplateDetailItem> getBIP003VOutGrpTemplateDetailItem() {
        if (bip003VOutGrpTemplateDetailItem == null) {
            bip003VOutGrpTemplateDetailItem = new ArrayList<BIP003VOutGrpTemplateDetailItem>();
        }
        return this.bip003VOutGrpTemplateDetailItem;
    }

}
