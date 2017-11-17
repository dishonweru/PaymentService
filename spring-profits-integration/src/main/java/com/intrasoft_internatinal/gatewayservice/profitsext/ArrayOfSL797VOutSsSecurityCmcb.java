
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSL797VOutSsSecurityCmcb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSL797VOutSsSecurityCmcb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SL797VOutSsSecurityCmcb" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}SL797VOutSsSecurityCmcb" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSL797VOutSsSecurityCmcb", propOrder = {
    "sl797VOutSsSecurityCmcb"
})
public class ArrayOfSL797VOutSsSecurityCmcb {

    @XmlElement(name = "SL797VOutSsSecurityCmcb")
    protected List<SL797VOutSsSecurityCmcb> sl797VOutSsSecurityCmcb;

    /**
     * Gets the value of the sl797VOutSsSecurityCmcb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sl797VOutSsSecurityCmcb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSL797VOutSsSecurityCmcb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SL797VOutSsSecurityCmcb }
     * 
     * 
     */
    public List<SL797VOutSsSecurityCmcb> getSL797VOutSsSecurityCmcb() {
        if (sl797VOutSsSecurityCmcb == null) {
            sl797VOutSsSecurityCmcb = new ArrayList<SL797VOutSsSecurityCmcb>();
        }
        return this.sl797VOutSsSecurityCmcb;
    }

}
