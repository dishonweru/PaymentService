
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExportMessageAlertExtItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExportMessageAlertExtItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportMessageAlertExtItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ExportMessageAlertExtItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExportMessageAlertExtItem", propOrder = {
    "exportMessageAlertExtItem"
})
public class ArrayOfExportMessageAlertExtItem {

    @XmlElement(name = "ExportMessageAlertExtItem")
    protected List<ExportMessageAlertExtItem> exportMessageAlertExtItem;

    /**
     * Gets the value of the exportMessageAlertExtItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportMessageAlertExtItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportMessageAlertExtItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportMessageAlertExtItem }
     * 
     * 
     */
    public List<ExportMessageAlertExtItem> getExportMessageAlertExtItem() {
        if (exportMessageAlertExtItem == null) {
            exportMessageAlertExtItem = new ArrayList<ExportMessageAlertExtItem>();
        }
        return this.exportMessageAlertExtItem;
    }

}
