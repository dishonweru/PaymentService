
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUDF002VOutGrpFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUDF002VOutGrpFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDF002VOutGrpFieldsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}UDF002VOutGrpFieldsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUDF002VOutGrpFieldsItem", propOrder = {
    "udf002VOutGrpFieldsItem"
})
public class ArrayOfUDF002VOutGrpFieldsItem {

    @XmlElement(name = "UDF002VOutGrpFieldsItem")
    protected List<UDF002VOutGrpFieldsItem> udf002VOutGrpFieldsItem;

    /**
     * Gets the value of the udf002VOutGrpFieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf002VOutGrpFieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDF002VOutGrpFieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDF002VOutGrpFieldsItem }
     * 
     * 
     */
    public List<UDF002VOutGrpFieldsItem> getUDF002VOutGrpFieldsItem() {
        if (udf002VOutGrpFieldsItem == null) {
            udf002VOutGrpFieldsItem = new ArrayList<UDF002VOutGrpFieldsItem>();
        }
        return this.udf002VOutGrpFieldsItem;
    }

}
