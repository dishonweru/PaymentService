
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TF3718VLc_TfStatementExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TF3718VLc_TfStatementExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutTradeFinanceBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrinicipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfTF3718VOutGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TF3718VLc_TfStatementExport", propOrder = {
    "outTradeFinanceBeneficiaryName",
    "outTradeFinancePrinicipalName",
    "outTradeFinanceRefNo",
    "outGrp"
})
public class TF3718VLcTfStatementExport
    extends BaseExport
{

    @XmlElement(name = "OutTradeFinanceBeneficiaryName")
    protected String outTradeFinanceBeneficiaryName;
    @XmlElement(name = "OutTradeFinancePrinicipalName")
    protected String outTradeFinancePrinicipalName;
    @XmlElement(name = "OutTradeFinanceRefNo")
    protected String outTradeFinanceRefNo;
    @XmlElement(name = "OutGrp")
    protected ArrayOfTF3718VOutGrpItem outGrp;

    /**
     * Gets the value of the outTradeFinanceBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBeneficiaryName() {
        return outTradeFinanceBeneficiaryName;
    }

    /**
     * Sets the value of the outTradeFinanceBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBeneficiaryName(String value) {
        this.outTradeFinanceBeneficiaryName = value;
    }

    /**
     * Gets the value of the outTradeFinancePrinicipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrinicipalName() {
        return outTradeFinancePrinicipalName;
    }

    /**
     * Sets the value of the outTradeFinancePrinicipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrinicipalName(String value) {
        this.outTradeFinancePrinicipalName = value;
    }

    /**
     * Gets the value of the outTradeFinanceRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceRefNo() {
        return outTradeFinanceRefNo;
    }

    /**
     * Sets the value of the outTradeFinanceRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceRefNo(String value) {
        this.outTradeFinanceRefNo = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTF3718VOutGrpItem }
     *     
     */
    public ArrayOfTF3718VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTF3718VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfTF3718VOutGrpItem value) {
        this.outGrp = value;
    }

}
