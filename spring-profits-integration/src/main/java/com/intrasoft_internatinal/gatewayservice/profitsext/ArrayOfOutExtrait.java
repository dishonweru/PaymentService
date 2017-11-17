
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutExtrait complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutExtrait">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutExtrait" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutExtrait" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutExtrait", propOrder = {
    "outExtrait"
})
public class ArrayOfOutExtrait {

    @XmlElement(name = "OutExtrait")
    protected List<OutExtrait> outExtrait;

    /**
     * Gets the value of the outExtrait property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outExtrait property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutExtrait().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutExtrait }
     * 
     * 
     */
    public List<OutExtrait> getOutExtrait() {
        if (outExtrait == null) {
            outExtrait = new ArrayList<OutExtrait>();
        }
        return this.outExtrait;
    }

}
