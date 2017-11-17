
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpTfDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpTfDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpTfDestination" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpTfDestination" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpTfDestination", propOrder = {
    "outGrpTfDestination"
})
public class ArrayOfOutGrpTfDestination {

    @XmlElement(name = "OutGrpTfDestination")
    protected List<OutGrpTfDestination> outGrpTfDestination;

    /**
     * Gets the value of the outGrpTfDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpTfDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpTfDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpTfDestination }
     * 
     * 
     */
    public List<OutGrpTfDestination> getOutGrpTfDestination() {
        if (outGrpTfDestination == null) {
            outGrpTfDestination = new ArrayList<OutGrpTfDestination>();
        }
        return this.outGrpTfDestination;
    }

}
