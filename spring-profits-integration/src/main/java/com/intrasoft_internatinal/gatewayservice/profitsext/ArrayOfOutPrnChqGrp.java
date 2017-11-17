
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutPrnChqGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutPrnChqGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutPrnChqGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutPrnChqGrp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutPrnChqGrp", propOrder = {
    "outPrnChqGrp"
})
public class ArrayOfOutPrnChqGrp {

    @XmlElement(name = "OutPrnChqGrp")
    protected List<OutPrnChqGrp> outPrnChqGrp;

    /**
     * Gets the value of the outPrnChqGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outPrnChqGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutPrnChqGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutPrnChqGrp }
     * 
     * 
     */
    public List<OutPrnChqGrp> getOutPrnChqGrp() {
        if (outPrnChqGrp == null) {
            outPrnChqGrp = new ArrayList<OutPrnChqGrp>();
        }
        return this.outPrnChqGrp;
    }

}
