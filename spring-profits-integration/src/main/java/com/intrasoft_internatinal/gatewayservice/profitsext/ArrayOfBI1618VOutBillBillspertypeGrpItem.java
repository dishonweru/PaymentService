
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBI1618VOutBillBillspertypeGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBI1618VOutBillBillspertypeGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BI1618VOutBillBillspertypeGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BI1618VOutBillBillspertypeGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBI1618VOutBillBillspertypeGrpItem", propOrder = {
    "bi1618VOutBillBillspertypeGrpItem"
})
public class ArrayOfBI1618VOutBillBillspertypeGrpItem {

    @XmlElement(name = "BI1618VOutBillBillspertypeGrpItem")
    protected List<BI1618VOutBillBillspertypeGrpItem> bi1618VOutBillBillspertypeGrpItem;

    /**
     * Gets the value of the bi1618VOutBillBillspertypeGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bi1618VOutBillBillspertypeGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBI1618VOutBillBillspertypeGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BI1618VOutBillBillspertypeGrpItem }
     * 
     * 
     */
    public List<BI1618VOutBillBillspertypeGrpItem> getBI1618VOutBillBillspertypeGrpItem() {
        if (bi1618VOutBillBillspertypeGrpItem == null) {
            bi1618VOutBillBillspertypeGrpItem = new ArrayList<BI1618VOutBillBillspertypeGrpItem>();
        }
        return this.bi1618VOutBillBillspertypeGrpItem;
    }

}
