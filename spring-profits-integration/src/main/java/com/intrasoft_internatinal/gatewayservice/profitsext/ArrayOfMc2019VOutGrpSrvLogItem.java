
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2019VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2019VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2019VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2019VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2019VOutGrpSrvLogItem", propOrder = {
    "mc2019VOutGrpSrvLogItem"
})
public class ArrayOfMc2019VOutGrpSrvLogItem {

    @XmlElement(name = "Mc2019VOutGrpSrvLogItem")
    protected List<Mc2019VOutGrpSrvLogItem> mc2019VOutGrpSrvLogItem;

    /**
     * Gets the value of the mc2019VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2019VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2019VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2019VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<Mc2019VOutGrpSrvLogItem> getMc2019VOutGrpSrvLogItem() {
        if (mc2019VOutGrpSrvLogItem == null) {
            mc2019VOutGrpSrvLogItem = new ArrayList<Mc2019VOutGrpSrvLogItem>();
        }
        return this.mc2019VOutGrpSrvLogItem;
    }

}
