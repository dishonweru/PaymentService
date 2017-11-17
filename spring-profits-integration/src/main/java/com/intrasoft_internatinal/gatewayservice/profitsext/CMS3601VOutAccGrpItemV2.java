
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMS3601VOutAccGrpItem_V2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMS3601VOutAccGrpItem_V2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutAccGrpOutAccGrmAaIefSuppliedNum2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAccGrpOutAccGrmCardAccCmsCardAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAccGrpOutAccGrmCreditIndIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrpOutAccGrmDefaultIndIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrpOutAccGrmPrftSysCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccGrpOutAccGrmSelectionIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMS3601VOutAccGrpItem_V2", propOrder = {
    "outAccGrpOutAccGrmAaIefSuppliedNum2",
    "outAccGrpOutAccGrmCardAccCmsCardAccountAccountCd",
    "outAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber",
    "outAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg",
    "outAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg",
    "outAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem",
    "outAccGrpOutAccGrmCreditIndIefSuppliedFlag",
    "outAccGrpOutAccGrmDefaultIndIefSuppliedFlag",
    "outAccGrpOutAccGrmPrftSysCharSuppliedChar20",
    "outAccGrpOutAccGrmSelectionIefSuppliedSelectChar"
})
public class CMS3601VOutAccGrpItemV2 {

    @XmlElement(name = "OutAccGrpOutAccGrmAaIefSuppliedNum2")
    protected short outAccGrpOutAccGrmAaIefSuppliedNum2;
    @XmlElement(name = "OutAccGrpOutAccGrmCardAccCmsCardAccountAccountCd")
    protected short outAccGrpOutAccGrmCardAccCmsCardAccountAccountCd;
    @XmlElement(name = "OutAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber")
    protected String outAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber;
    @XmlElement(name = "OutAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg")
    protected String outAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg;
    @XmlElement(name = "OutAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg")
    protected String outAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg;
    @XmlElement(name = "OutAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem")
    protected short outAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem;
    @XmlElement(name = "OutAccGrpOutAccGrmCreditIndIefSuppliedFlag")
    protected String outAccGrpOutAccGrmCreditIndIefSuppliedFlag;
    @XmlElement(name = "OutAccGrpOutAccGrmDefaultIndIefSuppliedFlag")
    protected String outAccGrpOutAccGrmDefaultIndIefSuppliedFlag;
    @XmlElement(name = "OutAccGrpOutAccGrmPrftSysCharSuppliedChar20")
    protected String outAccGrpOutAccGrmPrftSysCharSuppliedChar20;
    @XmlElement(name = "OutAccGrpOutAccGrmSelectionIefSuppliedSelectChar")
    protected String outAccGrpOutAccGrmSelectionIefSuppliedSelectChar;

    /**
     * Gets the value of the outAccGrpOutAccGrmAaIefSuppliedNum2 property.
     * 
     */
    public short getOutAccGrpOutAccGrmAaIefSuppliedNum2() {
        return outAccGrpOutAccGrmAaIefSuppliedNum2;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmAaIefSuppliedNum2 property.
     * 
     */
    public void setOutAccGrpOutAccGrmAaIefSuppliedNum2(short value) {
        this.outAccGrpOutAccGrmAaIefSuppliedNum2 = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountAccountCd property.
     * 
     */
    public short getOutAccGrpOutAccGrmCardAccCmsCardAccountAccountCd() {
        return outAccGrpOutAccGrmCardAccCmsCardAccountAccountCd;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountAccountCd property.
     * 
     */
    public void setOutAccGrpOutAccGrmCardAccCmsCardAccountAccountCd(short value) {
        this.outAccGrpOutAccGrmCardAccCmsCardAccountAccountCd = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber() {
        return outAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber(String value) {
        this.outAccGrpOutAccGrmCardAccCmsCardAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg() {
        return outAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg(String value) {
        this.outAccGrpOutAccGrmCardAccCmsCardAccountCreditCardFlg = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg() {
        return outAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg(String value) {
        this.outAccGrpOutAccGrmCardAccCmsCardAccountDefaultFlg = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem property.
     * 
     */
    public short getOutAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem() {
        return outAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem property.
     * 
     */
    public void setOutAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem(short value) {
        this.outAccGrpOutAccGrmCardAccCmsCardAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmCreditIndIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmCreditIndIefSuppliedFlag() {
        return outAccGrpOutAccGrmCreditIndIefSuppliedFlag;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmCreditIndIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmCreditIndIefSuppliedFlag(String value) {
        this.outAccGrpOutAccGrmCreditIndIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmDefaultIndIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmDefaultIndIefSuppliedFlag() {
        return outAccGrpOutAccGrmDefaultIndIefSuppliedFlag;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmDefaultIndIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmDefaultIndIefSuppliedFlag(String value) {
        this.outAccGrpOutAccGrmDefaultIndIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmPrftSysCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmPrftSysCharSuppliedChar20() {
        return outAccGrpOutAccGrmPrftSysCharSuppliedChar20;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmPrftSysCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmPrftSysCharSuppliedChar20(String value) {
        this.outAccGrpOutAccGrmPrftSysCharSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outAccGrpOutAccGrmSelectionIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccGrpOutAccGrmSelectionIefSuppliedSelectChar() {
        return outAccGrpOutAccGrmSelectionIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outAccGrpOutAccGrmSelectionIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccGrpOutAccGrmSelectionIefSuppliedSelectChar(String value) {
        this.outAccGrpOutAccGrmSelectionIefSuppliedSelectChar = value;
    }

}
