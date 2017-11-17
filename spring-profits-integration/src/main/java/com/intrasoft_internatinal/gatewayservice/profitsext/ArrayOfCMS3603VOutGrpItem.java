
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3603VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3603VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3603VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3603VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3603VOutGrpItem", propOrder = {
    "cms3603VOutGrpItem"
})
public class ArrayOfCMS3603VOutGrpItem {

    @XmlElement(name = "CMS3603VOutGrpItem")
    protected List<CMS3603VOutGrpItem> cms3603VOutGrpItem;

    /**
     * Gets the value of the cms3603VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3603VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3603VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3603VOutGrpItem }
     * 
     * 
     */
    public List<CMS3603VOutGrpItem> getCMS3603VOutGrpItem() {
        if (cms3603VOutGrpItem == null) {
            cms3603VOutGrpItem = new ArrayList<CMS3603VOutGrpItem>();
        }
        return this.cms3603VOutGrpItem;
    }

}
