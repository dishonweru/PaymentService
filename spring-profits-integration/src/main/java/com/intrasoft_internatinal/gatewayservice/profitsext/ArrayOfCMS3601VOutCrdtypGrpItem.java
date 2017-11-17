
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3601VOutCrdtypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3601VOutCrdtypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3601VOutCrdtypGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601VOutCrdtypGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3601VOutCrdtypGrpItem", propOrder = {
    "cms3601VOutCrdtypGrpItem"
})
public class ArrayOfCMS3601VOutCrdtypGrpItem {

    @XmlElement(name = "CMS3601VOutCrdtypGrpItem")
    protected List<CMS3601VOutCrdtypGrpItem> cms3601VOutCrdtypGrpItem;

    /**
     * Gets the value of the cms3601VOutCrdtypGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3601VOutCrdtypGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3601VOutCrdtypGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3601VOutCrdtypGrpItem }
     * 
     * 
     */
    public List<CMS3601VOutCrdtypGrpItem> getCMS3601VOutCrdtypGrpItem() {
        if (cms3601VOutCrdtypGrpItem == null) {
            cms3601VOutCrdtypGrpItem = new ArrayList<CMS3601VOutCrdtypGrpItem>();
        }
        return this.cms3601VOutCrdtypGrpItem;
    }

}
