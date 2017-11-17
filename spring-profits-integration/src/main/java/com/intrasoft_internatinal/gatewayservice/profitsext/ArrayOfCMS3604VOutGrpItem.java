
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3604VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3604VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3604VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3604VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3604VOutGrpItem", propOrder = {
    "cms3604VOutGrpItem"
})
public class ArrayOfCMS3604VOutGrpItem {

    @XmlElement(name = "CMS3604VOutGrpItem")
    protected List<CMS3604VOutGrpItem> cms3604VOutGrpItem;

    /**
     * Gets the value of the cms3604VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3604VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3604VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3604VOutGrpItem }
     * 
     * 
     */
    public List<CMS3604VOutGrpItem> getCMS3604VOutGrpItem() {
        if (cms3604VOutGrpItem == null) {
            cms3604VOutGrpItem = new ArrayList<CMS3604VOutGrpItem>();
        }
        return this.cms3604VOutGrpItem;
    }

}
