
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3604VInCrdtypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3604VInCrdtypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3604VInCrdtypGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3604VInCrdtypGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3604VInCrdtypGrpItem", propOrder = {
    "cms3604VInCrdtypGrpItem"
})
public class ArrayOfCMS3604VInCrdtypGrpItem {

    @XmlElement(name = "CMS3604VInCrdtypGrpItem")
    protected List<CMS3604VInCrdtypGrpItem> cms3604VInCrdtypGrpItem;

    /**
     * Gets the value of the cms3604VInCrdtypGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3604VInCrdtypGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3604VInCrdtypGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3604VInCrdtypGrpItem }
     * 
     * 
     */
    public List<CMS3604VInCrdtypGrpItem> getCMS3604VInCrdtypGrpItem() {
        if (cms3604VInCrdtypGrpItem == null) {
            cms3604VInCrdtypGrpItem = new ArrayList<CMS3604VInCrdtypGrpItem>();
        }
        return this.cms3604VInCrdtypGrpItem;
    }

}
