
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfA1904VOutGrpAdviceDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfA1904VOutGrpAdviceDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A1904VOutGrpAdviceDetailItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}A1904VOutGrpAdviceDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfA1904VOutGrpAdviceDetailItem", propOrder = {
    "a1904VOutGrpAdviceDetailItem"
})
public class ArrayOfA1904VOutGrpAdviceDetailItem {

    @XmlElement(name = "A1904VOutGrpAdviceDetailItem")
    protected List<A1904VOutGrpAdviceDetailItem> a1904VOutGrpAdviceDetailItem;

    /**
     * Gets the value of the a1904VOutGrpAdviceDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a1904VOutGrpAdviceDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA1904VOutGrpAdviceDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link A1904VOutGrpAdviceDetailItem }
     * 
     * 
     */
    public List<A1904VOutGrpAdviceDetailItem> getA1904VOutGrpAdviceDetailItem() {
        if (a1904VOutGrpAdviceDetailItem == null) {
            a1904VOutGrpAdviceDetailItem = new ArrayList<A1904VOutGrpAdviceDetailItem>();
        }
        return this.a1904VOutGrpAdviceDetailItem;
    }

}
