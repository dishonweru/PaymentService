
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInGrpTfDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInGrpTfDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpTfDestination" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InGrpTfDestination" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInGrpTfDestination", propOrder = {
    "inGrpTfDestination"
})
public class ArrayOfInGrpTfDestination {

    @XmlElement(name = "InGrpTfDestination")
    protected List<InGrpTfDestination> inGrpTfDestination;

    /**
     * Gets the value of the inGrpTfDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inGrpTfDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInGrpTfDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InGrpTfDestination }
     * 
     * 
     */
    public List<InGrpTfDestination> getInGrpTfDestination() {
        if (inGrpTfDestination == null) {
            inGrpTfDestination = new ArrayList<InGrpTfDestination>();
        }
        return this.inGrpTfDestination;
    }

}
