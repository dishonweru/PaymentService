
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInAgreementBeneficiaryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInAgreementBeneficiaryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InAgreementBeneficiaryItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InAgreementBeneficiaryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInAgreementBeneficiaryItem", propOrder = {
    "inAgreementBeneficiaryItem"
})
public class ArrayOfInAgreementBeneficiaryItem {

    @XmlElement(name = "InAgreementBeneficiaryItem")
    protected List<InAgreementBeneficiaryItem> inAgreementBeneficiaryItem;

    /**
     * Gets the value of the inAgreementBeneficiaryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inAgreementBeneficiaryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInAgreementBeneficiaryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InAgreementBeneficiaryItem }
     * 
     * 
     */
    public List<InAgreementBeneficiaryItem> getInAgreementBeneficiaryItem() {
        if (inAgreementBeneficiaryItem == null) {
            inAgreementBeneficiaryItem = new ArrayList<InAgreementBeneficiaryItem>();
        }
        return this.inAgreementBeneficiaryItem;
    }

}
