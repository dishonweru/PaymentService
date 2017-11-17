
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUDF002VOutGrpHistoryFieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUDF002VOutGrpHistoryFieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDF002VOutGrpHistoryFieldsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}UDF002VOutGrpHistoryFieldsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUDF002VOutGrpHistoryFieldsItem", propOrder = {
    "udf002VOutGrpHistoryFieldsItem"
})
public class ArrayOfUDF002VOutGrpHistoryFieldsItem {

    @XmlElement(name = "UDF002VOutGrpHistoryFieldsItem")
    protected List<UDF002VOutGrpHistoryFieldsItem> udf002VOutGrpHistoryFieldsItem;

    /**
     * Gets the value of the udf002VOutGrpHistoryFieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udf002VOutGrpHistoryFieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDF002VOutGrpHistoryFieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDF002VOutGrpHistoryFieldsItem }
     * 
     * 
     */
    public List<UDF002VOutGrpHistoryFieldsItem> getUDF002VOutGrpHistoryFieldsItem() {
        if (udf002VOutGrpHistoryFieldsItem == null) {
            udf002VOutGrpHistoryFieldsItem = new ArrayList<UDF002VOutGrpHistoryFieldsItem>();
        }
        return this.udf002VOutGrpHistoryFieldsItem;
    }

}
