
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0160VOutGrpDocumentsReqItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0160VOutGrpDocumentsReqItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0160VOutGrpDocumentsReqItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0160VOutGrpDocumentsReqItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0160VOutGrpDocumentsReqItem", propOrder = {
    "i0160VOutGrpDocumentsReqItem"
})
public class ArrayOfI0160VOutGrpDocumentsReqItem {

    @XmlElement(name = "I0160VOutGrpDocumentsReqItem")
    protected List<I0160VOutGrpDocumentsReqItem> i0160VOutGrpDocumentsReqItem;

    /**
     * Gets the value of the i0160VOutGrpDocumentsReqItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0160VOutGrpDocumentsReqItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0160VOutGrpDocumentsReqItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0160VOutGrpDocumentsReqItem }
     * 
     * 
     */
    public List<I0160VOutGrpDocumentsReqItem> getI0160VOutGrpDocumentsReqItem() {
        if (i0160VOutGrpDocumentsReqItem == null) {
            i0160VOutGrpDocumentsReqItem = new ArrayList<I0160VOutGrpDocumentsReqItem>();
        }
        return this.i0160VOutGrpDocumentsReqItem;
    }

}
