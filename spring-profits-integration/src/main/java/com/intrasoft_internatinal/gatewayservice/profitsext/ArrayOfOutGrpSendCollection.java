
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpSendCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpSendCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSendCollection" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpSendCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpSendCollection", propOrder = {
    "outGrpSendCollection"
})
public class ArrayOfOutGrpSendCollection {

    @XmlElement(name = "OutGrpSendCollection")
    protected List<OutGrpSendCollection> outGrpSendCollection;

    /**
     * Gets the value of the outGrpSendCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpSendCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpSendCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpSendCollection }
     * 
     * 
     */
    public List<OutGrpSendCollection> getOutGrpSendCollection() {
        if (outGrpSendCollection == null) {
            outGrpSendCollection = new ArrayList<OutGrpSendCollection>();
        }
        return this.outGrpSendCollection;
    }

}
