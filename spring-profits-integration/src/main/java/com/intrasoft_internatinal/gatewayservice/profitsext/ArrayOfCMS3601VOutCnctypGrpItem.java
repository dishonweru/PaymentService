
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3601VOutCnctypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3601VOutCnctypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3601VOutCnctypGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601VOutCnctypGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3601VOutCnctypGrpItem", propOrder = {
    "cms3601VOutCnctypGrpItem"
})
public class ArrayOfCMS3601VOutCnctypGrpItem {

    @XmlElement(name = "CMS3601VOutCnctypGrpItem")
    protected List<CMS3601VOutCnctypGrpItem> cms3601VOutCnctypGrpItem;

    /**
     * Gets the value of the cms3601VOutCnctypGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3601VOutCnctypGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3601VOutCnctypGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3601VOutCnctypGrpItem }
     * 
     * 
     */
    public List<CMS3601VOutCnctypGrpItem> getCMS3601VOutCnctypGrpItem() {
        if (cms3601VOutCnctypGrpItem == null) {
            cms3601VOutCnctypGrpItem = new ArrayList<CMS3601VOutCnctypGrpItem>();
        }
        return this.cms3601VOutCnctypGrpItem;
    }

}
