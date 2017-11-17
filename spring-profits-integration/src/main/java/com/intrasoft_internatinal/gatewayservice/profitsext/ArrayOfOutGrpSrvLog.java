
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutGrpSrvLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutGrpSrvLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSrvLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}OutGrpSrvLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutGrpSrvLog", propOrder = {
    "outGrpSrvLog"
})
public class ArrayOfOutGrpSrvLog {

    @XmlElement(name = "OutGrpSrvLog")
    protected List<OutGrpSrvLog> outGrpSrvLog;

    /**
     * Gets the value of the outGrpSrvLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outGrpSrvLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutGrpSrvLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutGrpSrvLog }
     * 
     * 
     */
    public List<OutGrpSrvLog> getOutGrpSrvLog() {
        if (outGrpSrvLog == null) {
            outGrpSrvLog = new ArrayList<OutGrpSrvLog>();
        }
        return this.outGrpSrvLog;
    }

}
