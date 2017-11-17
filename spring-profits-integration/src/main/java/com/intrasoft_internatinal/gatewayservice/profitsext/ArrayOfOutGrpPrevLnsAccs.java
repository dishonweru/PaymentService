
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpPrevLnsAccs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpPrevLnsAccs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPrevLnsAccs" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpPrevLnsAccs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpPrevLnsAccs", propOrder = {
    "outGrpPrevLnsAccs"
})
public class ArrayOfOutGrpPrevLnsAccs {

    @XmlElement(name = "OutGrpPrevLnsAccs")
    protected List<OutGrpPrevLnsAccs> outGrpPrevLnsAccs;

    /**
     * Gets the value of the outGrpPrevLnsAccs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpPrevLnsAccs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpPrevLnsAccs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpPrevLnsAccs }
     * 
     * 
     */
    public List<OutGrpPrevLnsAccs> getOutGrpPrevLnsAccs() {
        if (outGrpPrevLnsAccs == null) {
            outGrpPrevLnsAccs = new ArrayList<OutGrpPrevLnsAccs>();
        }
        return this.outGrpPrevLnsAccs;
    }

}
