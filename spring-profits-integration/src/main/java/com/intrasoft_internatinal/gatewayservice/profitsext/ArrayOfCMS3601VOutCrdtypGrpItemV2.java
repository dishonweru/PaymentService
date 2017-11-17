
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCMS3601VOutCrdtypGrpItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCMS3601VOutCrdtypGrpItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMS3601VOutCrdtypGrpItem_V2" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CMS3601VOutCrdtypGrpItem_V2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCMS3601VOutCrdtypGrpItem_V2", propOrder = {
    "cms3601VOutCrdtypGrpItemV2"
})
public class ArrayOfCMS3601VOutCrdtypGrpItemV2 {

    @XmlElement(name = "CMS3601VOutCrdtypGrpItem_V2")
    protected List<CMS3601VOutCrdtypGrpItemV2> cms3601VOutCrdtypGrpItemV2;

    /**
     * Gets the value of the cms3601VOutCrdtypGrpItemV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cms3601VOutCrdtypGrpItemV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCMS3601VOutCrdtypGrpItemV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMS3601VOutCrdtypGrpItemV2 }
     * 
     * 
     */
    public List<CMS3601VOutCrdtypGrpItemV2> getCMS3601VOutCrdtypGrpItemV2() {
        if (cms3601VOutCrdtypGrpItemV2 == null) {
            cms3601VOutCrdtypGrpItemV2 = new ArrayList<CMS3601VOutCrdtypGrpItemV2>();
        }
        return this.cms3601VOutCrdtypGrpItemV2;
    }

}
