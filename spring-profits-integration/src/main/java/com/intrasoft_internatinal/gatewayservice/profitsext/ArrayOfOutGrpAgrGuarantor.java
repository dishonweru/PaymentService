
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpAgrGuarantor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpAgrGuarantor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAgrGuarantor" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpAgrGuarantor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpAgrGuarantor", propOrder = {
    "outGrpAgrGuarantor"
})
public class ArrayOfOutGrpAgrGuarantor {

    @XmlElement(name = "OutGrpAgrGuarantor")
    protected List<OutGrpAgrGuarantor> outGrpAgrGuarantor;

    /**
     * Gets the value of the outGrpAgrGuarantor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpAgrGuarantor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpAgrGuarantor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpAgrGuarantor }
     * 
     * 
     */
    public List<OutGrpAgrGuarantor> getOutGrpAgrGuarantor() {
        if (outGrpAgrGuarantor == null) {
            outGrpAgrGuarantor = new ArrayList<OutGrpAgrGuarantor>();
        }
        return this.outGrpAgrGuarantor;
    }

}
