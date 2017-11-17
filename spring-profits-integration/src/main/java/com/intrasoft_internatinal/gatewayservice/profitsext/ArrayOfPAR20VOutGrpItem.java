
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPAR20VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPAR20VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAR20VOutGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PAR20VOutGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPAR20VOutGrpItem", propOrder = {
    "par20VOutGrpItem"
})
public class ArrayOfPAR20VOutGrpItem {

    @XmlElement(name = "PAR20VOutGrpItem")
    protected List<PAR20VOutGrpItem> par20VOutGrpItem;

    /**
     * Gets the value of the par20VOutGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the par20VOutGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAR20VOutGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAR20VOutGrpItem }
     * 
     * 
     */
    public List<PAR20VOutGrpItem> getPAR20VOutGrpItem() {
        if (par20VOutGrpItem == null) {
            par20VOutGrpItem = new ArrayList<PAR20VOutGrpItem>();
        }
        return this.par20VOutGrpItem;
    }

}
