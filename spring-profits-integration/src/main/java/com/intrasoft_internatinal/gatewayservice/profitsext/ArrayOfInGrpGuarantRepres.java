
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInGrpGuarantRepres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInGrpGuarantRepres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpGuarantRepres" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InGrpGuarantRepres" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInGrpGuarantRepres", propOrder = {
    "inGrpGuarantRepres"
})
public class ArrayOfInGrpGuarantRepres {

    @XmlElement(name = "InGrpGuarantRepres")
    protected List<InGrpGuarantRepres> inGrpGuarantRepres;

    /**
     * Gets the value of the inGrpGuarantRepres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inGrpGuarantRepres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInGrpGuarantRepres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InGrpGuarantRepres }
     * 
     * 
     */
    public List<InGrpGuarantRepres> getInGrpGuarantRepres() {
        if (inGrpGuarantRepres == null) {
            inGrpGuarantRepres = new ArrayList<InGrpGuarantRepres>();
        }
        return this.inGrpGuarantRepres;
    }

}
