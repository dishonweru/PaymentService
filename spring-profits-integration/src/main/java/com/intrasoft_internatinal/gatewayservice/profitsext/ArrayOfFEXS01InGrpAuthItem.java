
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS01InGrpAuthItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS01InGrpAuthItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS01InGrpAuthItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01InGrpAuthItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS01InGrpAuthItem", propOrder = {
    "fexs01InGrpAuthItem"
})
public class ArrayOfFEXS01InGrpAuthItem {

    @XmlElement(name = "FEXS01InGrpAuthItem")
    protected List<FEXS01InGrpAuthItem> fexs01InGrpAuthItem;

    /**
     * Gets the value of the fexs01InGrpAuthItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs01InGrpAuthItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS01InGrpAuthItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS01InGrpAuthItem }
     * 
     * 
     */
    public List<FEXS01InGrpAuthItem> getFEXS01InGrpAuthItem() {
        if (fexs01InGrpAuthItem == null) {
            fexs01InGrpAuthItem = new ArrayList<FEXS01InGrpAuthItem>();
        }
        return this.fexs01InGrpAuthItem;
    }

}
