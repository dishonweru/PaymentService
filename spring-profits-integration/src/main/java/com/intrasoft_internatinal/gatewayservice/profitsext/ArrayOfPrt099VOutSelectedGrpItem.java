
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrt099VOutSelectedGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrt099VOutSelectedGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prt099VOutSelectedGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Prt099VOutSelectedGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrt099VOutSelectedGrpItem", propOrder = {
    "prt099VOutSelectedGrpItem"
})
public class ArrayOfPrt099VOutSelectedGrpItem {

    @XmlElement(name = "Prt099VOutSelectedGrpItem")
    protected List<Prt099VOutSelectedGrpItem> prt099VOutSelectedGrpItem;

    /**
     * Gets the value of the prt099VOutSelectedGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prt099VOutSelectedGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrt099VOutSelectedGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prt099VOutSelectedGrpItem }
     * 
     * 
     */
    public List<Prt099VOutSelectedGrpItem> getPrt099VOutSelectedGrpItem() {
        if (prt099VOutSelectedGrpItem == null) {
            prt099VOutSelectedGrpItem = new ArrayList<Prt099VOutSelectedGrpItem>();
        }
        return this.prt099VOutSelectedGrpItem;
    }

}
