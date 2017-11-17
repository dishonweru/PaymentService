
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3605VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3605VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3605VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3605VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3605VOutGrpItem", propOrder = {
    "cms3605VOutGrpItem"
})
public class ArrayOfCMS3605VOutGrpItem {

    @XmlElement(name = "CMS3605VOutGrpItem")
    protected List<CMS3605VOutGrpItem> cms3605VOutGrpItem;

    /**
     * Gets the value of the cms3605VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3605VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3605VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3605VOutGrpItem }
     * 
     * 
     */
    public List<CMS3605VOutGrpItem> getCMS3605VOutGrpItem() {
        if (cms3605VOutGrpItem == null) {
            cms3605VOutGrpItem = new ArrayList<CMS3605VOutGrpItem>();
        }
        return this.cms3605VOutGrpItem;
    }

}
