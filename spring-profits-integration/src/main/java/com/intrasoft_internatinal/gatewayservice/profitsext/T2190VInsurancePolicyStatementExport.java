
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T2190VInsurancePolicyStatementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2190VInsurancePolicyStatementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssStatusDescrIefSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2190VOutGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2190VInsurancePolicyStatementExport", propOrder = {
    "outCurrencyShortDescr",
    "outCustNameListSetDescription",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outIssStatusDescrIefSuppliedChar40",
    "outProductDescription",
    "outProductIdProduct",
    "outProfitsAccountAccountCd",
    "outProfitsAccountAccountNumber",
    "outUnitCode",
    "outUnitUnitName",
    "outGrp"
})
public class T2190VInsurancePolicyStatementExport
    extends BaseExport
{

    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustNameListSetDescription")
    protected String outCustNameListSetDescription;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutIssStatusDescrIefSuppliedChar40")
    protected String outIssStatusDescrIefSuppliedChar40;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProfitsAccountAccountCd")
    protected short outProfitsAccountAccountCd;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutUnitCode")
    protected int outUnitCode;
    @XmlElement(name = "OutUnitUnitName")
    protected String outUnitUnitName;
    @XmlElement(name = "OutGrp")
    protected ArrayOfT2190VOutGrpItem outGrp;

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCustNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustNameListSetDescription() {
        return outCustNameListSetDescription;
    }

    /**
     * Sets the value of the outCustNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustNameListSetDescription(String value) {
        this.outCustNameListSetDescription = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outIssStatusDescrIefSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssStatusDescrIefSuppliedChar40() {
        return outIssStatusDescrIefSuppliedChar40;
    }

    /**
     * Sets the value of the outIssStatusDescrIefSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssStatusDescrIefSuppliedChar40(String value) {
        this.outIssStatusDescrIefSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductDescription() {
        return outProductDescription;
    }

    /**
     * Sets the value of the outProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductDescription(String value) {
        this.outProductDescription = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public short getOutProfitsAccountAccountCd() {
        return outProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public void setOutProfitsAccountAccountCd(short value) {
        this.outProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outUnitCode property.
     * 
     */
    public int getOutUnitCode() {
        return outUnitCode;
    }

    /**
     * Sets the value of the outUnitCode property.
     * 
     */
    public void setOutUnitCode(int value) {
        this.outUnitCode = value;
    }

    /**
     * Gets the value of the outUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUnitUnitName() {
        return outUnitUnitName;
    }

    /**
     * Sets the value of the outUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUnitUnitName(String value) {
        this.outUnitUnitName = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2190VOutGrpItem }
     *     
     */
    public ArrayOfT2190VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2190VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfT2190VOutGrpItem value) {
        this.outGrp = value;
    }

}
