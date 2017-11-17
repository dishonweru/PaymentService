
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DGR0001V_UserTransactionDiaryExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DGR0001V_UserTransactionDiaryExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGetTransactionDiaryGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfDGR0001VOutGetTransactionDiaryGrpItem" minOccurs="0"/>
 *         &lt;element name="OutReconcileSizeIefSuppliedCounter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDateUserTransactionDiaryTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraComAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraComAmnDom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraExpAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraExpAmnDom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraTaxAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraTaxAmnDom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraTrxAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutReconcileUserTransactionDiaryTraTrxAmnDom" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DGR0001V_UserTransactionDiaryExport", propOrder = {
    "outGetTransactionDiaryGrp",
    "outReconcileSizeIefSuppliedCounter",
    "outDateUserTransactionDiaryTrxDate",
    "outReconcileUserTransactionDiaryTraComAmn",
    "outReconcileUserTransactionDiaryTraComAmnDom",
    "outReconcileUserTransactionDiaryTraExpAmn",
    "outReconcileUserTransactionDiaryTraExpAmnDom",
    "outReconcileUserTransactionDiaryTraTaxAmn",
    "outReconcileUserTransactionDiaryTraTaxAmnDom",
    "outReconcileUserTransactionDiaryTraTrxAmn",
    "outReconcileUserTransactionDiaryTraTrxAmnDom"
})
public class DGR0001VUserTransactionDiaryExport
    extends BaseExport
{

    @XmlElement(name = "OutGetTransactionDiaryGrp")
    protected ArrayOfDGR0001VOutGetTransactionDiaryGrpItem outGetTransactionDiaryGrp;
    @XmlElement(name = "OutReconcileSizeIefSuppliedCounter")
    protected double outReconcileSizeIefSuppliedCounter;
    @XmlElement(name = "OutDateUserTransactionDiaryTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDateUserTransactionDiaryTrxDate;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraComAmn", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraComAmn;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraComAmnDom", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraComAmnDom;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraExpAmn", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraExpAmn;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraExpAmnDom", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraExpAmnDom;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraTaxAmn", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraTaxAmn;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraTaxAmnDom", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraTaxAmnDom;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraTrxAmn", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraTrxAmn;
    @XmlElement(name = "OutReconcileUserTransactionDiaryTraTrxAmnDom", required = true)
    protected BigDecimal outReconcileUserTransactionDiaryTraTrxAmnDom;

    /**
     * Gets the value of the outGetTransactionDiaryGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGR0001VOutGetTransactionDiaryGrpItem }
     *     
     */
    public ArrayOfDGR0001VOutGetTransactionDiaryGrpItem getOutGetTransactionDiaryGrp() {
        return outGetTransactionDiaryGrp;
    }

    /**
     * Sets the value of the outGetTransactionDiaryGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGR0001VOutGetTransactionDiaryGrpItem }
     *     
     */
    public void setOutGetTransactionDiaryGrp(ArrayOfDGR0001VOutGetTransactionDiaryGrpItem value) {
        this.outGetTransactionDiaryGrp = value;
    }

    /**
     * Gets the value of the outReconcileSizeIefSuppliedCounter property.
     * 
     */
    public double getOutReconcileSizeIefSuppliedCounter() {
        return outReconcileSizeIefSuppliedCounter;
    }

    /**
     * Sets the value of the outReconcileSizeIefSuppliedCounter property.
     * 
     */
    public void setOutReconcileSizeIefSuppliedCounter(double value) {
        this.outReconcileSizeIefSuppliedCounter = value;
    }

    /**
     * Gets the value of the outDateUserTransactionDiaryTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDateUserTransactionDiaryTrxDate() {
        return outDateUserTransactionDiaryTrxDate;
    }

    /**
     * Sets the value of the outDateUserTransactionDiaryTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDateUserTransactionDiaryTrxDate(XMLGregorianCalendar value) {
        this.outDateUserTransactionDiaryTrxDate = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraComAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraComAmn() {
        return outReconcileUserTransactionDiaryTraComAmn;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraComAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraComAmn(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraComAmn = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraComAmnDom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraComAmnDom() {
        return outReconcileUserTransactionDiaryTraComAmnDom;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraComAmnDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraComAmnDom(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraComAmnDom = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraExpAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraExpAmn() {
        return outReconcileUserTransactionDiaryTraExpAmn;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraExpAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraExpAmn(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraExpAmn = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraExpAmnDom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraExpAmnDom() {
        return outReconcileUserTransactionDiaryTraExpAmnDom;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraExpAmnDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraExpAmnDom(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraExpAmnDom = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraTaxAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraTaxAmn() {
        return outReconcileUserTransactionDiaryTraTaxAmn;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraTaxAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraTaxAmn(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraTaxAmn = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraTaxAmnDom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraTaxAmnDom() {
        return outReconcileUserTransactionDiaryTraTaxAmnDom;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraTaxAmnDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraTaxAmnDom(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraTaxAmnDom = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraTrxAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraTrxAmn() {
        return outReconcileUserTransactionDiaryTraTrxAmn;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraTrxAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraTrxAmn(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraTrxAmn = value;
    }

    /**
     * Gets the value of the outReconcileUserTransactionDiaryTraTrxAmnDom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutReconcileUserTransactionDiaryTraTrxAmnDom() {
        return outReconcileUserTransactionDiaryTraTrxAmnDom;
    }

    /**
     * Sets the value of the outReconcileUserTransactionDiaryTraTrxAmnDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutReconcileUserTransactionDiaryTraTrxAmnDom(BigDecimal value) {
        this.outReconcileUserTransactionDiaryTraTrxAmnDom = value;
    }

}
