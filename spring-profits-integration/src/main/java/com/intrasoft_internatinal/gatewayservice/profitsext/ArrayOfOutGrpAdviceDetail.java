
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpAdviceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpAdviceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAdviceDetail" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpAdviceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpAdviceDetail", propOrder = {
    "outGrpAdviceDetail"
})
public class ArrayOfOutGrpAdviceDetail {

    @XmlElement(name = "OutGrpAdviceDetail")
    protected List<OutGrpAdviceDetail> outGrpAdviceDetail;

    /**
     * Gets the value of the outGrpAdviceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpAdviceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpAdviceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpAdviceDetail }
     * 
     * 
     */
    public List<OutGrpAdviceDetail> getOutGrpAdviceDetail() {
        if (outGrpAdviceDetail == null) {
            outGrpAdviceDetail = new ArrayList<OutGrpAdviceDetail>();
        }
        return this.outGrpAdviceDetail;
    }

}
