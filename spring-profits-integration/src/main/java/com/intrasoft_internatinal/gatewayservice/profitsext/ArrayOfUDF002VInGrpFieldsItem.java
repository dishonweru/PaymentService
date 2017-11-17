
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUDF002VInGrpFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUDF002VInGrpFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDF002VInGrpFieldsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}UDF002VInGrpFieldsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUDF002VInGrpFieldsItem", propOrder = {
    "udf002VInGrpFieldsItem"
})
public class ArrayOfUDF002VInGrpFieldsItem {

    @XmlElement(name = "UDF002VInGrpFieldsItem")
    protected List<UDF002VInGrpFieldsItem> udf002VInGrpFieldsItem;

    /**
     * Gets the value of the udf002VInGrpFieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf002VInGrpFieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDF002VInGrpFieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDF002VInGrpFieldsItem }
     * 
     * 
     */
    public List<UDF002VInGrpFieldsItem> getUDF002VInGrpFieldsItem() {
        if (udf002VInGrpFieldsItem == null) {
            udf002VInGrpFieldsItem = new ArrayList<UDF002VInGrpFieldsItem>();
        }
        return this.udf002VInGrpFieldsItem;
    }

}
