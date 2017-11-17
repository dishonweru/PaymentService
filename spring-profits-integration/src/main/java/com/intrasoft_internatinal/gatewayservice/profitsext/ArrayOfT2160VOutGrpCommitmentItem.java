
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT2160VOutGrpCommitmentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT2160VOutGrpCommitmentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T2160VOutGrpCommitmentItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T2160VOutGrpCommitmentItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT2160VOutGrpCommitmentItem", propOrder = {
    "t2160VOutGrpCommitmentItem"
})
public class ArrayOfT2160VOutGrpCommitmentItem {

    @XmlElement(name = "T2160VOutGrpCommitmentItem")
    protected List<T2160VOutGrpCommitmentItem> t2160VOutGrpCommitmentItem;

    /**
     * Gets the value of the t2160VOutGrpCommitmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t2160VOutGrpCommitmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT2160VOutGrpCommitmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T2160VOutGrpCommitmentItem }
     * 
     * 
     */
    public List<T2160VOutGrpCommitmentItem> getT2160VOutGrpCommitmentItem() {
        if (t2160VOutGrpCommitmentItem == null) {
            t2160VOutGrpCommitmentItem = new ArrayList<T2160VOutGrpCommitmentItem>();
        }
        return this.t2160VOutGrpCommitmentItem;
    }

}
