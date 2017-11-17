
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGR0001VOutGetTransactionDiaryGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGR0001VOutGetTransactionDiaryGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DGR0001VOutGetTransactionDiaryGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DGR0001VOutGetTransactionDiaryGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGR0001VOutGetTransactionDiaryGrpItem", propOrder = {
    "dgr0001VOutGetTransactionDiaryGrpItem"
})
public class ArrayOfDGR0001VOutGetTransactionDiaryGrpItem {

    @XmlElement(name = "DGR0001VOutGetTransactionDiaryGrpItem")
    protected List<DGR0001VOutGetTransactionDiaryGrpItem> dgr0001VOutGetTransactionDiaryGrpItem;

    /**
     * Gets the value of the dgr0001VOutGetTransactionDiaryGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgr0001VOutGetTransactionDiaryGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGR0001VOutGetTransactionDiaryGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGR0001VOutGetTransactionDiaryGrpItem }
     * 
     * 
     */
    public List<DGR0001VOutGetTransactionDiaryGrpItem> getDGR0001VOutGetTransactionDiaryGrpItem() {
        if (dgr0001VOutGetTransactionDiaryGrpItem == null) {
            dgr0001VOutGetTransactionDiaryGrpItem = new ArrayList<DGR0001VOutGetTransactionDiaryGrpItem>();
        }
        return this.dgr0001VOutGetTransactionDiaryGrpItem;
    }

}
