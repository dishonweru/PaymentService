
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpAdviceTotalT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpAdviceTotalT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAdviceTotalT" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpAdviceTotalT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpAdviceTotalT", propOrder = {
    "outGrpAdviceTotalT"
})
public class ArrayOfOutGrpAdviceTotalT {

    @XmlElement(name = "OutGrpAdviceTotalT")
    protected List<OutGrpAdviceTotalT> outGrpAdviceTotalT;

    /**
     * Gets the value of the outGrpAdviceTotalT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpAdviceTotalT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpAdviceTotalT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpAdviceTotalT }
     * 
     * 
     */
    public List<OutGrpAdviceTotalT> getOutGrpAdviceTotalT() {
        if (outGrpAdviceTotalT == null) {
            outGrpAdviceTotalT = new ArrayList<OutGrpAdviceTotalT>();
        }
        return this.outGrpAdviceTotalT;
    }

}
