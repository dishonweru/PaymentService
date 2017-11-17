
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpBillCustPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpBillCustPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpBillCustPosition" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpBillCustPosition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpBillCustPosition", propOrder = {
    "outGrpBillCustPosition"
})
public class ArrayOfOutGrpBillCustPosition {

    @XmlElement(name = "OutGrpBillCustPosition")
    protected List<OutGrpBillCustPosition> outGrpBillCustPosition;

    /**
     * Gets the value of the outGrpBillCustPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpBillCustPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpBillCustPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpBillCustPosition }
     * 
     * 
     */
    public List<OutGrpBillCustPosition> getOutGrpBillCustPosition() {
        if (outGrpBillCustPosition == null) {
            outGrpBillCustPosition = new ArrayList<OutGrpBillCustPosition>();
        }
        return this.outGrpBillCustPosition;
    }

}
