
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUDF002VOutGrpErrorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUDF002VOutGrpErrorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDF002VOutGrpErrorItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}UDF002VOutGrpErrorItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUDF002VOutGrpErrorItem", propOrder = {
    "udf002VOutGrpErrorItem"
})
public class ArrayOfUDF002VOutGrpErrorItem {

    @XmlElement(name = "UDF002VOutGrpErrorItem")
    protected List<UDF002VOutGrpErrorItem> udf002VOutGrpErrorItem;

    /**
     * Gets the value of the udf002VOutGrpErrorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf002VOutGrpErrorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDF002VOutGrpErrorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDF002VOutGrpErrorItem }
     * 
     * 
     */
    public List<UDF002VOutGrpErrorItem> getUDF002VOutGrpErrorItem() {
        if (udf002VOutGrpErrorItem == null) {
            udf002VOutGrpErrorItem = new ArrayList<UDF002VOutGrpErrorItem>();
        }
        return this.udf002VOutGrpErrorItem;
    }

}
