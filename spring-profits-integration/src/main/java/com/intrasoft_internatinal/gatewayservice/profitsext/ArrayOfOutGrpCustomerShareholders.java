
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpCustomerShareholders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpCustomerShareholders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomerShareholders" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpCustomerShareholders" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpCustomerShareholders", propOrder = {
    "outGrpCustomerShareholders"
})
public class ArrayOfOutGrpCustomerShareholders {

    @XmlElement(name = "OutGrpCustomerShareholders")
    protected List<OutGrpCustomerShareholders> outGrpCustomerShareholders;

    /**
     * Gets the value of the outGrpCustomerShareholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpCustomerShareholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpCustomerShareholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpCustomerShareholders }
     * 
     * 
     */
    public List<OutGrpCustomerShareholders> getOutGrpCustomerShareholders() {
        if (outGrpCustomerShareholders == null) {
            outGrpCustomerShareholders = new ArrayList<OutGrpCustomerShareholders>();
        }
        return this.outGrpCustomerShareholders;
    }

}
