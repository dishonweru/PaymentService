
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTF3718VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTF3718VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TF3718VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}TF3718VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTF3718VOutGrpItem", propOrder = {
    "tf3718VOutGrpItem"
})
public class ArrayOfTF3718VOutGrpItem {

    @XmlElement(name = "TF3718VOutGrpItem")
    protected List<TF3718VOutGrpItem> tf3718VOutGrpItem;

    /**
     * Gets the value of the tf3718VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tf3718VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTF3718VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TF3718VOutGrpItem }
     * 
     * 
     */
    public List<TF3718VOutGrpItem> getTF3718VOutGrpItem() {
        if (tf3718VOutGrpItem == null) {
            tf3718VOutGrpItem = new ArrayList<TF3718VOutGrpItem>();
        }
        return this.tf3718VOutGrpItem;
    }

}
