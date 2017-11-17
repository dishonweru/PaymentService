
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpBalancesFdTd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpBalancesFdTd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBalancesFdTd" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpBalancesFdTd" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpBalancesFdTd", propOrder = {
    "outGrpBalancesFdTd"
})
public class ArrayOfOutGrpBalancesFdTd {

    @XmlElement(name = "OutGrpBalancesFdTd")
    protected List<OutGrpBalancesFdTd> outGrpBalancesFdTd;

    /**
     * Gets the value of the outGrpBalancesFdTd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpBalancesFdTd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpBalancesFdTd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpBalancesFdTd }
     * 
     * 
     */
    public List<OutGrpBalancesFdTd> getOutGrpBalancesFdTd() {
        if (outGrpBalancesFdTd == null) {
            outGrpBalancesFdTd = new ArrayList<OutGrpBalancesFdTd>();
        }
        return this.outGrpBalancesFdTd;
    }

}
