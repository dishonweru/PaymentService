
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2152VInsuranceCommitmentForecastExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2152VInsuranceCommitmentForecastExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAdditionalInstallmentAmntIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAnnualPremiumIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutMonthlyPremiumIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProrataPremiumIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTmstampIefSuppliedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutFailureDetailsKeyval1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsKeyval2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsKeyval3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFailureDetailsComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2152VInsuranceCommitmentForecastExport", propOrder = {
    "outAdditionalInstallmentAmntIefSuppliedNum152",
    "outAnnualPremiumIefSuppliedNum152",
    "outMonthlyPremiumIefSuppliedNum152",
    "outProrataPremiumIefSuppliedNum152",
    "outStatusIefSuppliedActionEntryDesc",
    "outStatusIefSuppliedActionEntryMsg",
    "outTmstampIefSuppliedTimestamp",
    "outFailureDetailsKeyval1",
    "outFailureDetailsKeyval2",
    "outFailureDetailsKeyval3",
    "outFailureDetailsComment"
})
public class T2152VInsuranceCommitmentForecastExport
    extends BaseExport
{

    @XmlElement(name = "OutAdditionalInstallmentAmntIefSuppliedNum152", required = true)
    protected BigDecimal outAdditionalInstallmentAmntIefSuppliedNum152;
    @XmlElement(name = "OutAnnualPremiumIefSuppliedNum152", required = true)
    protected BigDecimal outAnnualPremiumIefSuppliedNum152;
    @XmlElement(name = "OutMonthlyPremiumIefSuppliedNum152", required = true)
    protected BigDecimal outMonthlyPremiumIefSuppliedNum152;
    @XmlElement(name = "OutProrataPremiumIefSuppliedNum152", required = true)
    protected BigDecimal outProrataPremiumIefSuppliedNum152;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryMsg")
    protected String outStatusIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutTmstampIefSuppliedTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTmstampIefSuppliedTimestamp;
    @XmlElement(name = "OutFailureDetailsKeyval1")
    protected String outFailureDetailsKeyval1;
    @XmlElement(name = "OutFailureDetailsKeyval2")
    protected String outFailureDetailsKeyval2;
    @XmlElement(name = "OutFailureDetailsKeyval3")
    protected String outFailureDetailsKeyval3;
    @XmlElement(name = "OutFailureDetailsComment")
    protected String outFailureDetailsComment;

    /**
     * Gets the value of the outAdditionalInstallmentAmntIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAdditionalInstallmentAmntIefSuppliedNum152() {
        return outAdditionalInstallmentAmntIefSuppliedNum152;
    }

    /**
     * Sets the value of the outAdditionalInstallmentAmntIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAdditionalInstallmentAmntIefSuppliedNum152(BigDecimal value) {
        this.outAdditionalInstallmentAmntIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outAnnualPremiumIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAnnualPremiumIefSuppliedNum152() {
        return outAnnualPremiumIefSuppliedNum152;
    }

    /**
     * Sets the value of the outAnnualPremiumIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAnnualPremiumIefSuppliedNum152(BigDecimal value) {
        this.outAnnualPremiumIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outMonthlyPremiumIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMonthlyPremiumIefSuppliedNum152() {
        return outMonthlyPremiumIefSuppliedNum152;
    }

    /**
     * Sets the value of the outMonthlyPremiumIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMonthlyPremiumIefSuppliedNum152(BigDecimal value) {
        this.outMonthlyPremiumIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outProrataPremiumIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProrataPremiumIefSuppliedNum152() {
        return outProrataPremiumIefSuppliedNum152;
    }

    /**
     * Sets the value of the outProrataPremiumIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProrataPremiumIefSuppliedNum152(BigDecimal value) {
        this.outProrataPremiumIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryMsg() {
        return outStatusIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryMsg(String value) {
        this.outStatusIefSuppliedActionEntryMsg = value;
    }

    /**
     * Gets the value of the outTmstampIefSuppliedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTmstampIefSuppliedTimestamp() {
        return outTmstampIefSuppliedTimestamp;
    }

    /**
     * Sets the value of the outTmstampIefSuppliedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTmstampIefSuppliedTimestamp(XMLGregorianCalendar value) {
        this.outTmstampIefSuppliedTimestamp = value;
    }

    /**
     * Gets the value of the outFailureDetailsKeyval1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsKeyval1() {
        return outFailureDetailsKeyval1;
    }

    /**
     * Sets the value of the outFailureDetailsKeyval1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsKeyval1(String value) {
        this.outFailureDetailsKeyval1 = value;
    }

    /**
     * Gets the value of the outFailureDetailsKeyval2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsKeyval2() {
        return outFailureDetailsKeyval2;
    }

    /**
     * Sets the value of the outFailureDetailsKeyval2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsKeyval2(String value) {
        this.outFailureDetailsKeyval2 = value;
    }

    /**
     * Gets the value of the outFailureDetailsKeyval3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsKeyval3() {
        return outFailureDetailsKeyval3;
    }

    /**
     * Sets the value of the outFailureDetailsKeyval3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsKeyval3(String value) {
        this.outFailureDetailsKeyval3 = value;
    }

    /**
     * Gets the value of the outFailureDetailsComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFailureDetailsComment() {
        return outFailureDetailsComment;
    }

    /**
     * Sets the value of the outFailureDetailsComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFailureDetailsComment(String value) {
        this.outFailureDetailsComment = value;
    }

}
