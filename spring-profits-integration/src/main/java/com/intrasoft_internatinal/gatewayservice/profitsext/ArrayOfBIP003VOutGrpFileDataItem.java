
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBIP003VOutGrpFileDataItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBIP003VOutGrpFileDataItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIP003VOutGrpFileDataItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BIP003VOutGrpFileDataItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBIP003VOutGrpFileDataItem", propOrder = {
    "bip003VOutGrpFileDataItem"
})
public class ArrayOfBIP003VOutGrpFileDataItem {

    @XmlElement(name = "BIP003VOutGrpFileDataItem")
    protected List<BIP003VOutGrpFileDataItem> bip003VOutGrpFileDataItem;

    /**
     * Gets the value of the bip003VOutGrpFileDataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bip003VOutGrpFileDataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBIP003VOutGrpFileDataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BIP003VOutGrpFileDataItem }
     * 
     * 
     */
    public List<BIP003VOutGrpFileDataItem> getBIP003VOutGrpFileDataItem() {
        if (bip003VOutGrpFileDataItem == null) {
            bip003VOutGrpFileDataItem = new ArrayList<BIP003VOutGrpFileDataItem>();
        }
        return this.bip003VOutGrpFileDataItem;
    }

}
