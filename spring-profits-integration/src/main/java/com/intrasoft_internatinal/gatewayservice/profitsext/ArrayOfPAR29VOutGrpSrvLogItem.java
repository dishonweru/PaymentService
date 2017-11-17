
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPAR29VOutGrpSrvLogItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPAR29VOutGrpSrvLogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAR29VOutGrpSrvLogItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PAR29VOutGrpSrvLogItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPAR29VOutGrpSrvLogItem", propOrder = {
    "par29VOutGrpSrvLogItem"
})
public class ArrayOfPAR29VOutGrpSrvLogItem {

    @XmlElement(name = "PAR29VOutGrpSrvLogItem")
    protected List<PAR29VOutGrpSrvLogItem> par29VOutGrpSrvLogItem;

    /**
     * Gets the value of the par29VOutGrpSrvLogItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the par29VOutGrpSrvLogItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAR29VOutGrpSrvLogItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAR29VOutGrpSrvLogItem }
     * 
     * 
     */
    public List<PAR29VOutGrpSrvLogItem> getPAR29VOutGrpSrvLogItem() {
        if (par29VOutGrpSrvLogItem == null) {
            par29VOutGrpSrvLogItem = new ArrayList<PAR29VOutGrpSrvLogItem>();
        }
        return this.par29VOutGrpSrvLogItem;
    }

}
