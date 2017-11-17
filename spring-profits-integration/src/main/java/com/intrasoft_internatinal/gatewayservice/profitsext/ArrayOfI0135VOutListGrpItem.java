
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfI0135VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfI0135VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I0135VOutListGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0135VOutListGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfI0135VOutListGrpItem", propOrder = {
    "i0135VOutListGrpItem"
})
public class ArrayOfI0135VOutListGrpItem {

    @XmlElement(name = "I0135VOutListGrpItem")
    protected List<I0135VOutListGrpItem> i0135VOutListGrpItem;

    /**
     * Gets the value of the i0135VOutListGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i0135VOutListGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI0135VOutListGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I0135VOutListGrpItem }
     * 
     * 
     */
    public List<I0135VOutListGrpItem> getI0135VOutListGrpItem() {
        if (i0135VOutListGrpItem == null) {
            i0135VOutListGrpItem = new ArrayList<I0135VOutListGrpItem>();
        }
        return this.i0135VOutListGrpItem;
    }

}
