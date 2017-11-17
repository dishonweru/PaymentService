
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInRegSegmGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInRegSegmGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InRegSegmGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InRegSegmGrp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInRegSegmGrp", propOrder = {
    "inRegSegmGrp"
})
public class ArrayOfInRegSegmGrp {

    @XmlElement(name = "InRegSegmGrp")
    protected List<InRegSegmGrp> inRegSegmGrp;

    /**
     * Gets the value of the inRegSegmGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inRegSegmGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInRegSegmGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InRegSegmGrp }
     * 
     * 
     */
    public List<InRegSegmGrp> getInRegSegmGrp() {
        if (inRegSegmGrp == null) {
            inRegSegmGrp = new ArrayList<InRegSegmGrp>();
        }
        return this.inRegSegmGrp;
    }

}
