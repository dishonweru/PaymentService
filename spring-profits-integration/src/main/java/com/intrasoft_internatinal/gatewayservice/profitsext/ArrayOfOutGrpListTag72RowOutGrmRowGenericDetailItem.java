
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpListTag72RowOutGrmRowGenericDetailItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpListTag72RowOutGrmRowGenericDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem", propOrder = {
    "outGrpListTag72RowOutGrmRowGenericDetailItem"
})
public class ArrayOfOutGrpListTag72RowOutGrmRowGenericDetailItem {

    @XmlElement(name = "OutGrpListTag72RowOutGrmRowGenericDetailItem")
    protected List<OutGrpListTag72RowOutGrmRowGenericDetailItem> outGrpListTag72RowOutGrmRowGenericDetailItem;

    /**
     * Gets the value of the outGrpListTag72RowOutGrmRowGenericDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpListTag72RowOutGrmRowGenericDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpListTag72RowOutGrmRowGenericDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpListTag72RowOutGrmRowGenericDetailItem }
     * 
     * 
     */
    public List<OutGrpListTag72RowOutGrmRowGenericDetailItem> getOutGrpListTag72RowOutGrmRowGenericDetailItem() {
        if (outGrpListTag72RowOutGrmRowGenericDetailItem == null) {
            outGrpListTag72RowOutGrmRowGenericDetailItem = new ArrayList<OutGrpListTag72RowOutGrmRowGenericDetailItem>();
        }
        return this.outGrpListTag72RowOutGrmRowGenericDetailItem;
    }

}
