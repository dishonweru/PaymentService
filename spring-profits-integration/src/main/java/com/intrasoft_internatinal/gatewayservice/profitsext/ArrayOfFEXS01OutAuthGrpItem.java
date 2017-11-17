
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS01OutAuthGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS01OutAuthGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS01OutAuthGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01OutAuthGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS01OutAuthGrpItem", propOrder = {
    "fexs01OutAuthGrpItem"
})
public class ArrayOfFEXS01OutAuthGrpItem {

    @XmlElement(name = "FEXS01OutAuthGrpItem")
    protected List<FEXS01OutAuthGrpItem> fexs01OutAuthGrpItem;

    /**
     * Gets the value of the fexs01OutAuthGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs01OutAuthGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS01OutAuthGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS01OutAuthGrpItem }
     * 
     * 
     */
    public List<FEXS01OutAuthGrpItem> getFEXS01OutAuthGrpItem() {
        if (fexs01OutAuthGrpItem == null) {
            fexs01OutAuthGrpItem = new ArrayList<FEXS01OutAuthGrpItem>();
        }
        return this.fexs01OutAuthGrpItem;
    }

}
