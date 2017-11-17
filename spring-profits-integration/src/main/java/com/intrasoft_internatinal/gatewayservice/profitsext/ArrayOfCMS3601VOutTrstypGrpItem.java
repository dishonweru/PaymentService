
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3601VOutTrstypGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3601VOutTrstypGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3601VOutTrstypGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601VOutTrstypGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3601VOutTrstypGrpItem", propOrder = {
    "cms3601VOutTrstypGrpItem"
})
public class ArrayOfCMS3601VOutTrstypGrpItem {

    @XmlElement(name = "CMS3601VOutTrstypGrpItem")
    protected List<CMS3601VOutTrstypGrpItem> cms3601VOutTrstypGrpItem;

    /**
     * Gets the value of the cms3601VOutTrstypGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3601VOutTrstypGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3601VOutTrstypGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3601VOutTrstypGrpItem }
     * 
     * 
     */
    public List<CMS3601VOutTrstypGrpItem> getCMS3601VOutTrstypGrpItem() {
        if (cms3601VOutTrstypGrpItem == null) {
            cms3601VOutTrstypGrpItem = new ArrayList<CMS3601VOutTrstypGrpItem>();
        }
        return this.cms3601VOutTrstypGrpItem;
    }

}
