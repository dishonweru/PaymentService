
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMc2032VOutGrpSrvLogitem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMc2032VOutGrpSrvLogitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mc2032VOutGrpSrvLogitem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2032VOutGrpSrvLogitem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMc2032VOutGrpSrvLogitem", propOrder = {
    "mc2032VOutGrpSrvLogitem"
})
public class ArrayOfMc2032VOutGrpSrvLogitem {

    @XmlElement(name = "Mc2032VOutGrpSrvLogitem")
    protected List<Mc2032VOutGrpSrvLogitem> mc2032VOutGrpSrvLogitem;

    /**
     * Gets the value of the mc2032VOutGrpSrvLogitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mc2032VOutGrpSrvLogitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMc2032VOutGrpSrvLogitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mc2032VOutGrpSrvLogitem }
     * 
     * 
     */
    public List<Mc2032VOutGrpSrvLogitem> getMc2032VOutGrpSrvLogitem() {
        if (mc2032VOutGrpSrvLogitem == null) {
            mc2032VOutGrpSrvLogitem = new ArrayList<Mc2032VOutGrpSrvLogitem>();
        }
        return this.mc2032VOutGrpSrvLogitem;
    }

}
