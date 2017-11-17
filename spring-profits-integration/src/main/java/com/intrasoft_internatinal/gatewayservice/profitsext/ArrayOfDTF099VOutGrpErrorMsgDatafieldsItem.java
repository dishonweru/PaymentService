
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTF099VOutGrpErrorMsgDatafieldsItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DTF099VOutGrpErrorMsgDatafieldsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem", propOrder = {
    "dtf099VOutGrpErrorMsgDatafieldsItem"
})
public class ArrayOfDTF099VOutGrpErrorMsgDatafieldsItem {

    @XmlElement(name = "DTF099VOutGrpErrorMsgDatafieldsItem")
    protected List<DTF099VOutGrpErrorMsgDatafieldsItem> dtf099VOutGrpErrorMsgDatafieldsItem;

    /**
     * Gets the value of the dtf099VOutGrpErrorMsgDatafieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtf099VOutGrpErrorMsgDatafieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTF099VOutGrpErrorMsgDatafieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTF099VOutGrpErrorMsgDatafieldsItem }
     * 
     * 
     */
    public List<DTF099VOutGrpErrorMsgDatafieldsItem> getDTF099VOutGrpErrorMsgDatafieldsItem() {
        if (dtf099VOutGrpErrorMsgDatafieldsItem == null) {
            dtf099VOutGrpErrorMsgDatafieldsItem = new ArrayList<DTF099VOutGrpErrorMsgDatafieldsItem>();
        }
        return this.dtf099VOutGrpErrorMsgDatafieldsItem;
    }

}
