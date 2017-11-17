
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutBillErrorLogGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutBillErrorLogGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutBillErrorLogGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutBillErrorLogGrp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutBillErrorLogGrp", propOrder = {
    "outBillErrorLogGrp"
})
public class ArrayOfOutBillErrorLogGrp {

    @XmlElement(name = "OutBillErrorLogGrp")
    protected List<OutBillErrorLogGrp> outBillErrorLogGrp;

    /**
     * Gets the value of the outBillErrorLogGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outBillErrorLogGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutBillErrorLogGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutBillErrorLogGrp }
     * 
     * 
     */
    public List<OutBillErrorLogGrp> getOutBillErrorLogGrp() {
        if (outBillErrorLogGrp == null) {
            outBillErrorLogGrp = new ArrayList<OutBillErrorLogGrp>();
        }
        return this.outBillErrorLogGrp;
    }

}
