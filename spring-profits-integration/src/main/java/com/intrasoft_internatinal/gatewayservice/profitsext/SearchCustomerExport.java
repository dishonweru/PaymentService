
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCustomerExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCustomerExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutGrpList" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpListCustomer" minOccurs="0"/>
 *         &lt;element name="NotFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutMoreCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMoreCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMsgCharSuppliedChar80" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCustomerExport", propOrder = {
    "outGrpList",
    "notFound",
    "isMore",
    "outMoreCustomerCustId",
    "outMoreCustomerSurname",
    "outMsgCharSuppliedChar80",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr"
})
public class SearchCustomerExport
    extends BaseExport
{

    @XmlElement(name = "OutGrpList")
    protected ArrayOfOutGrpListCustomer outGrpList;
    @XmlElement(name = "NotFound")
    protected boolean notFound;
    @XmlElement(name = "IsMore")
    protected boolean isMore;
    @XmlElement(name = "OutMoreCustomerCustId")
    protected int outMoreCustomerCustId;
    @XmlElement(name = "OutMoreCustomerSurname")
    protected String outMoreCustomerSurname;
    @XmlElement(name = "OutMsgCharSuppliedChar80")
    protected String outMsgCharSuppliedChar80;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;

    /**
     * Gets the value of the outGrpList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpListCustomer }
     *     
     */
    public ArrayOfOutGrpListCustomer getOutGrpList() {
        return outGrpList;
    }

    /**
     * Sets the value of the outGrpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpListCustomer }
     *     
     */
    public void setOutGrpList(ArrayOfOutGrpListCustomer value) {
        this.outGrpList = value;
    }

    /**
     * Gets the value of the notFound property.
     * 
     */
    public boolean isNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     * 
     */
    public void setNotFound(boolean value) {
        this.notFound = value;
    }

    /**
     * Gets the value of the isMore property.
     * 
     */
    public boolean isIsMore() {
        return isMore;
    }

    /**
     * Sets the value of the isMore property.
     * 
     */
    public void setIsMore(boolean value) {
        this.isMore = value;
    }

    /**
     * Gets the value of the outMoreCustomerCustId property.
     * 
     */
    public int getOutMoreCustomerCustId() {
        return outMoreCustomerCustId;
    }

    /**
     * Sets the value of the outMoreCustomerCustId property.
     * 
     */
    public void setOutMoreCustomerCustId(int value) {
        this.outMoreCustomerCustId = value;
    }

    /**
     * Gets the value of the outMoreCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMoreCustomerSurname() {
        return outMoreCustomerSurname;
    }

    /**
     * Sets the value of the outMoreCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMoreCustomerSurname(String value) {
        this.outMoreCustomerSurname = value;
    }

    /**
     * Gets the value of the outMsgCharSuppliedChar80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMsgCharSuppliedChar80() {
        return outMsgCharSuppliedChar80;
    }

    /**
     * Sets the value of the outMsgCharSuppliedChar80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMsgCharSuppliedChar80(String value) {
        this.outMsgCharSuppliedChar80 = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

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

}
