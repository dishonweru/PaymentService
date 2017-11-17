
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3601VOutTransGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3601VOutTransGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3601VOutTransGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601VOutTransGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3601VOutTransGrpItem", propOrder = {
    "cms3601VOutTransGrpItem"
})
public class ArrayOfCMS3601VOutTransGrpItem {

    @XmlElement(name = "CMS3601VOutTransGrpItem")
    protected List<CMS3601VOutTransGrpItem> cms3601VOutTransGrpItem;

    /**
     * Gets the value of the cms3601VOutTransGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3601VOutTransGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3601VOutTransGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3601VOutTransGrpItem }
     * 
     * 
     */
    public List<CMS3601VOutTransGrpItem> getCMS3601VOutTransGrpItem() {
        if (cms3601VOutTransGrpItem == null) {
            cms3601VOutTransGrpItem = new ArrayList<CMS3601VOutTransGrpItem>();
        }
        return this.cms3601VOutTransGrpItem;
    }

}
