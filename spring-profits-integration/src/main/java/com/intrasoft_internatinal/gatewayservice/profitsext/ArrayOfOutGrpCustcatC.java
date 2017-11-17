
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpCustcatC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpCustcatC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustcatC" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpCustcatC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpCustcatC", propOrder = {
    "outGrpCustcatC"
})
public class ArrayOfOutGrpCustcatC {

    @XmlElement(name = "OutGrpCustcatC")
    protected List<OutGrpCustcatC> outGrpCustcatC;

    /**
     * Gets the value of the outGrpCustcatC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpCustcatC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpCustcatC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpCustcatC }
     * 
     * 
     */
    public List<OutGrpCustcatC> getOutGrpCustcatC() {
        if (outGrpCustcatC == null) {
            outGrpCustcatC = new ArrayList<OutGrpCustcatC>();
        }
        return this.outGrpCustcatC;
    }

}
