
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJ2115VOutDrGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJ2115VOutDrGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="J2115VOutDrGrpItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}J2115VOutDrGrpItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJ2115VOutDrGrpItem", propOrder = {
    "j2115VOutDrGrpItem"
})
public class ArrayOfJ2115VOutDrGrpItem {

    @XmlElement(name = "J2115VOutDrGrpItem")
    protected List<J2115VOutDrGrpItem> j2115VOutDrGrpItem;

    /**
     * Gets the value of the j2115VOutDrGrpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the j2115VOutDrGrpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJ2115VOutDrGrpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J2115VOutDrGrpItem }
     * 
     * 
     */
    public List<J2115VOutDrGrpItem> getJ2115VOutDrGrpItem() {
        if (j2115VOutDrGrpItem == null) {
            j2115VOutDrGrpItem = new ArrayList<J2115VOutDrGrpItem>();
        }
        return this.j2115VOutDrGrpItem;
    }

}
