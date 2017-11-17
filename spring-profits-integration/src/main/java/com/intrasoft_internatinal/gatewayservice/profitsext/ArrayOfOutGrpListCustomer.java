
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpListCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpListCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpListCustomer" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpListCustomer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpListCustomer", propOrder = {
    "outGrpListCustomer"
})
public class ArrayOfOutGrpListCustomer {

    @XmlElement(name = "OutGrpListCustomer")
    protected List<OutGrpListCustomer> outGrpListCustomer;

    /**
     * Gets the value of the outGrpListCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpListCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpListCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpListCustomer }
     * 
     * 
     */
    public List<OutGrpListCustomer> getOutGrpListCustomer() {
        if (outGrpListCustomer == null) {
            outGrpListCustomer = new ArrayList<OutGrpListCustomer>();
        }
        return this.outGrpListCustomer;
    }

}
