
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0160VOutGrpCustDocsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0160VOutGrpCustDocsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0160VOutGrpCustDocsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0160VOutGrpCustDocsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0160VOutGrpCustDocsItem", propOrder = {
    "i0160VOutGrpCustDocsItem"
})
public class ArrayOfI0160VOutGrpCustDocsItem {

    @XmlElement(name = "I0160VOutGrpCustDocsItem")
    protected List<I0160VOutGrpCustDocsItem> i0160VOutGrpCustDocsItem;

    /**
     * Gets the value of the i0160VOutGrpCustDocsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0160VOutGrpCustDocsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0160VOutGrpCustDocsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0160VOutGrpCustDocsItem }
     * 
     * 
     */
    public List<I0160VOutGrpCustDocsItem> getI0160VOutGrpCustDocsItem() {
        if (i0160VOutGrpCustDocsItem == null) {
            i0160VOutGrpCustDocsItem = new ArrayList<I0160VOutGrpCustDocsItem>();
        }
        return this.i0160VOutGrpCustDocsItem;
    }

}
