
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpUserTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpUserTotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpUserTotal" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpUserTotal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpUserTotal", propOrder = {
    "outGrpUserTotal"
})
public class ArrayOfOutGrpUserTotal {

    @XmlElement(name = "OutGrpUserTotal")
    protected List<OutGrpUserTotal> outGrpUserTotal;

    /**
     * Gets the value of the outGrpUserTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpUserTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpUserTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpUserTotal }
     * 
     * 
     */
    public List<OutGrpUserTotal> getOutGrpUserTotal() {
        if (outGrpUserTotal == null) {
            outGrpUserTotal = new ArrayList<OutGrpUserTotal>();
        }
        return this.outGrpUserTotal;
    }

}
