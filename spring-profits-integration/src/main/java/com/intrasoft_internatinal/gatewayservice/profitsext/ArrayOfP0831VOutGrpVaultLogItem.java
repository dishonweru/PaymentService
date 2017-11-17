
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfP0831VOutGrpVaultLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfP0831VOutGrpVaultLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P0831VOutGrpVaultLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}P0831VOutGrpVaultLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfP0831VOutGrpVaultLogItem", propOrder = {
    "p0831VOutGrpVaultLogItem"
})
public class ArrayOfP0831VOutGrpVaultLogItem {

    @XmlElement(name = "P0831VOutGrpVaultLogItem")
    protected List<P0831VOutGrpVaultLogItem> p0831VOutGrpVaultLogItem;

    /**
     * Gets the value of the p0831VOutGrpVaultLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p0831VOutGrpVaultLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP0831VOutGrpVaultLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P0831VOutGrpVaultLogItem }
     * 
     * 
     */
    public List<P0831VOutGrpVaultLogItem> getP0831VOutGrpVaultLogItem() {
        if (p0831VOutGrpVaultLogItem == null) {
            p0831VOutGrpVaultLogItem = new ArrayList<P0831VOutGrpVaultLogItem>();
        }
        return this.p0831VOutGrpVaultLogItem;
    }

}
