
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpGuarantor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpGuarantor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpGuarantor" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpGuarantor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpGuarantor", propOrder = {
    "outGrpGuarantor"
})
public class ArrayOfOutGrpGuarantor {

    @XmlElement(name = "OutGrpGuarantor")
    protected List<OutGrpGuarantor> outGrpGuarantor;

    /**
     * Gets the value of the outGrpGuarantor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpGuarantor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpGuarantor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpGuarantor }
     * 
     * 
     */
    public List<OutGrpGuarantor> getOutGrpGuarantor() {
        if (outGrpGuarantor == null) {
            outGrpGuarantor = new ArrayList<OutGrpGuarantor>();
        }
        return this.outGrpGuarantor;
    }

}
