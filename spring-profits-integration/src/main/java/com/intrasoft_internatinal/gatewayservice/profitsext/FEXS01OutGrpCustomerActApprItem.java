
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXS01OutGrpCustomerActApprItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01OutGrpCustomerActApprItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01OutGrpCustomerActApprItem", propOrder = {
    "outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId",
    "outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId",
    "outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn",
    "outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn",
    "outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode",
    "outGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar"
})
public class FEXS01OutGrpCustomerActApprItem {

    @XmlElement(name = "OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId")
    protected String outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId;
    @XmlElement(name = "OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId")
    protected int outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId;
    @XmlElement(name = "OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn")
    protected double outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn;
    @XmlElement(name = "OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn", required = true)
    protected BigDecimal outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn;
    @XmlElement(name = "OutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode")
    protected int outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode;
    @XmlElement(name = "OutGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar")
    protected String outGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId() {
        return outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId;
    }

    /**
     * Sets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId(String value) {
        this.outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationApplicationId = value;
    }

    /**
     * Gets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId property.
     * 
     */
    public int getOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId() {
        return outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId;
    }

    /**
     * Sets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId property.
     * 
     */
    public void setOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId(int value) {
        this.outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationCustId = value;
    }

    /**
     * Gets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn property.
     * 
     */
    public double getOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn() {
        return outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn property.
     * 
     */
    public void setOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn(double value) {
        this.outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationInternalSn = value;
    }

    /**
     * Gets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn() {
        return outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn;
    }

    /**
     * Sets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn(BigDecimal value) {
        this.outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationRequestAmn = value;
    }

    /**
     * Gets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode property.
     * 
     */
    public int getOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode() {
        return outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode;
    }

    /**
     * Sets the value of the outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode property.
     * 
     */
    public void setOutGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode(int value) {
        this.outGrpCustomerActApprOutGrmCustActApprActCustomerApplicationUnitCode = value;
    }

    /**
     * Gets the value of the outGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar() {
        return outGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar(String value) {
        this.outGrpCustomerActApprOutGrmCustActSelectionIefSuppliedSelectChar = value;
    }

}
