
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFEXS01OutGrpCustomerActApprItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFEXS01OutGrpCustomerActApprItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXS01OutGrpCustomerActApprItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}FEXS01OutGrpCustomerActApprItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFEXS01OutGrpCustomerActApprItem", propOrder = {
    "fexs01OutGrpCustomerActApprItem"
})
public class ArrayOfFEXS01OutGrpCustomerActApprItem {

    @XmlElement(name = "FEXS01OutGrpCustomerActApprItem")
    protected List<FEXS01OutGrpCustomerActApprItem> fexs01OutGrpCustomerActApprItem;

    /**
     * Gets the value of the fexs01OutGrpCustomerActApprItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fexs01OutGrpCustomerActApprItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEXS01OutGrpCustomerActApprItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEXS01OutGrpCustomerActApprItem }
     * 
     * 
     */
    public List<FEXS01OutGrpCustomerActApprItem> getFEXS01OutGrpCustomerActApprItem() {
        if (fexs01OutGrpCustomerActApprItem == null) {
            fexs01OutGrpCustomerActApprItem = new ArrayList<FEXS01OutGrpCustomerActApprItem>();
        }
        return this.fexs01OutGrpCustomerActApprItem;
    }

}
