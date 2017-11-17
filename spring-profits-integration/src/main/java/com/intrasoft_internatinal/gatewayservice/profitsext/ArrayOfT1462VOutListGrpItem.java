
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfT1462VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfT1462VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T1462VOutListGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1462VOutListGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfT1462VOutListGrpItem", propOrder = {
    "t1462VOutListGrpItem"
})
public class ArrayOfT1462VOutListGrpItem {

    @XmlElement(name = "T1462VOutListGrpItem")
    protected List<T1462VOutListGrpItem> t1462VOutListGrpItem;

    /**
     * Gets the value of the t1462VOutListGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t1462VOutListGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT1462VOutListGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T1462VOutListGrpItem }
     * 
     * 
     */
    public List<T1462VOutListGrpItem> getT1462VOutListGrpItem() {
        if (t1462VOutListGrpItem == null) {
            t1462VOutListGrpItem = new ArrayList<T1462VOutListGrpItem>();
        }
        return this.t1462VOutListGrpItem;
    }

}
