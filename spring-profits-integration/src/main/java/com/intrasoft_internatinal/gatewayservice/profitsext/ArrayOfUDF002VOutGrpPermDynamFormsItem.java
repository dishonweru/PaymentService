
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUDF002VOutGrpPermDynamFormsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUDF002VOutGrpPermDynamFormsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDF002VOutGrpPermDynamFormsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}UDF002VOutGrpPermDynamFormsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUDF002VOutGrpPermDynamFormsItem", propOrder = {
    "udf002VOutGrpPermDynamFormsItem"
})
public class ArrayOfUDF002VOutGrpPermDynamFormsItem {

    @XmlElement(name = "UDF002VOutGrpPermDynamFormsItem")
    protected List<UDF002VOutGrpPermDynamFormsItem> udf002VOutGrpPermDynamFormsItem;

    /**
     * Gets the value of the udf002VOutGrpPermDynamFormsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf002VOutGrpPermDynamFormsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDF002VOutGrpPermDynamFormsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDF002VOutGrpPermDynamFormsItem }
     * 
     * 
     */
    public List<UDF002VOutGrpPermDynamFormsItem> getUDF002VOutGrpPermDynamFormsItem() {
        if (udf002VOutGrpPermDynamFormsItem == null) {
            udf002VOutGrpPermDynamFormsItem = new ArrayList<UDF002VOutGrpPermDynamFormsItem>();
        }
        return this.udf002VOutGrpPermDynamFormsItem;
    }

}
