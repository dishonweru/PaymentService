
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDTF099VOutGrpMessageErrorsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDTF099VOutGrpMessageErrorsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTF099VOutGrpMessageErrorsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DTF099VOutGrpMessageErrorsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDTF099VOutGrpMessageErrorsItem", propOrder = {
    "dtf099VOutGrpMessageErrorsItem"
})
public class ArrayOfDTF099VOutGrpMessageErrorsItem {

    @XmlElement(name = "DTF099VOutGrpMessageErrorsItem")
    protected List<DTF099VOutGrpMessageErrorsItem> dtf099VOutGrpMessageErrorsItem;

    /**
     * Gets the value of the dtf099VOutGrpMessageErrorsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtf099VOutGrpMessageErrorsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTF099VOutGrpMessageErrorsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTF099VOutGrpMessageErrorsItem }
     * 
     * 
     */
    public List<DTF099VOutGrpMessageErrorsItem> getDTF099VOutGrpMessageErrorsItem() {
        if (dtf099VOutGrpMessageErrorsItem == null) {
            dtf099VOutGrpMessageErrorsItem = new ArrayList<DTF099VOutGrpMessageErrorsItem>();
        }
        return this.dtf099VOutGrpMessageErrorsItem;
    }

}
