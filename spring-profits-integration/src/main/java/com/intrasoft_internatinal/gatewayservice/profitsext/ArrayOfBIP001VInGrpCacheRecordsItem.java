
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBIP001VInGrpCacheRecordsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBIP001VInGrpCacheRecordsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIP001VInGrpCacheRecordsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BIP001VInGrpCacheRecordsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBIP001VInGrpCacheRecordsItem", propOrder = {
    "bip001VInGrpCacheRecordsItem"
})
public class ArrayOfBIP001VInGrpCacheRecordsItem {

    @XmlElement(name = "BIP001VInGrpCacheRecordsItem")
    protected List<BIP001VInGrpCacheRecordsItem> bip001VInGrpCacheRecordsItem;

    /**
     * Gets the value of the bip001VInGrpCacheRecordsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bip001VInGrpCacheRecordsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBIP001VInGrpCacheRecordsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BIP001VInGrpCacheRecordsItem }
     * 
     * 
     */
    public List<BIP001VInGrpCacheRecordsItem> getBIP001VInGrpCacheRecordsItem() {
        if (bip001VInGrpCacheRecordsItem == null) {
            bip001VInGrpCacheRecordsItem = new ArrayList<BIP001VInGrpCacheRecordsItem>();
        }
        return this.bip001VInGrpCacheRecordsItem;
    }

}
