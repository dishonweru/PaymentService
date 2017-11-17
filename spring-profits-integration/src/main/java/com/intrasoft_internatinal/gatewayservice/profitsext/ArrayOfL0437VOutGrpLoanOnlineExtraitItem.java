
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0437VOutGrpLoanOnlineExtraitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0437VOutGrpLoanOnlineExtraitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0437VOutGrpLoanOnlineExtraitItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0437VOutGrpLoanOnlineExtraitItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0437VOutGrpLoanOnlineExtraitItem", propOrder = {
    "l0437VOutGrpLoanOnlineExtraitItem"
})
public class ArrayOfL0437VOutGrpLoanOnlineExtraitItem {

    @XmlElement(name = "L0437VOutGrpLoanOnlineExtraitItem")
    protected List<L0437VOutGrpLoanOnlineExtraitItem> l0437VOutGrpLoanOnlineExtraitItem;

    /**
     * Gets the value of the l0437VOutGrpLoanOnlineExtraitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0437VOutGrpLoanOnlineExtraitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0437VOutGrpLoanOnlineExtraitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0437VOutGrpLoanOnlineExtraitItem }
     * 
     * 
     */
    public List<L0437VOutGrpLoanOnlineExtraitItem> getL0437VOutGrpLoanOnlineExtraitItem() {
        if (l0437VOutGrpLoanOnlineExtraitItem == null) {
            l0437VOutGrpLoanOnlineExtraitItem = new ArrayList<L0437VOutGrpLoanOnlineExtraitItem>();
        }
        return this.l0437VOutGrpLoanOnlineExtraitItem;
    }

}
