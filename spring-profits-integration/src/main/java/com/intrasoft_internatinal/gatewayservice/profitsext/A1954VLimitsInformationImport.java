
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for A1954VLimitsInformationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="A1954VLimitsInformationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAvailableAmntCheckIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAvailableAmntFromIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InAvailableAmntToIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBankParametersCurrTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InExpireCheckIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExpireDtFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InExpireDtToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGenericLimitActiveAccCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGenericLimitCoveredAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGenericLimitEntityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericLimitEntityKeyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericLimitExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGenericLimitIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGenericLimitLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGenericLimitLimitComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericLimitLimitHistCnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGenericLimitLimitId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGenericLimitLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGenericLimitMaxAccNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InGenericLimitUsedCoveredAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGenericLimitUsedLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGrpFromIefSuppliedChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpToIefSuppliedChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLimitAmntCheckIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLimitAmntFromIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLimitAmntToIefSuppliedNum152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLimitTypeDescIefSuppliedLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMaxNumCheckIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMaxNumFromIefSuppliedNum10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMaxNumToIefSuppliedNum10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreRecordsGenericLimitActiveAccCnt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreRecordsGenericLimitCoveredAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InMoreRecordsGenericLimitEntityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreRecordsGenericLimitEntityKeyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreRecordsGenericLimitExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InMoreRecordsGenericLimitIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMoreRecordsGenericLimitLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InMoreRecordsGenericLimitLimitComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreRecordsGenericLimitLimitId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreRecordsGenericLimitLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMoreRecordsGenericLimitMaxAccNo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InMoreRecordsGenericLimitUsedCoveredAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InMoreRecordsGenericLimitUsedLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InMoreRecordsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNumAvailAccCheckIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InNumAvailAccFromIefSuppliedNum10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InNumAvailAccToIefSuppliedNum10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProductFromIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductToIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitFromIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUnitToIefSuppliedChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A1954VLimitsInformationImport", propOrder = {
    "command",
    "inAvailableAmntCheckIefSuppliedFlag",
    "inAvailableAmntFromIefSuppliedNum152",
    "inAvailableAmntToIefSuppliedNum152",
    "inBankParametersCurrTrxDate",
    "inExpireCheckIefSuppliedFlag",
    "inExpireDtFromIefSuppliedDate",
    "inExpireDtToIefSuppliedDate",
    "inGenericLimitActiveAccCnt",
    "inGenericLimitCoveredAmn",
    "inGenericLimitEntityKey",
    "inGenericLimitEntityKeyDesc",
    "inGenericLimitExpireDate",
    "inGenericLimitIdCurrency",
    "inGenericLimitLimitAmn",
    "inGenericLimitLimitComment",
    "inGenericLimitLimitHistCnt",
    "inGenericLimitLimitId",
    "inGenericLimitLimitType",
    "inGenericLimitMaxAccNo",
    "inGenericLimitUsedCoveredAmn",
    "inGenericLimitUsedLimitAmn",
    "inGrpFromIefSuppliedChar10",
    "inGrpToIefSuppliedChar10",
    "inLimitAmntCheckIefSuppliedFlag",
    "inLimitAmntFromIefSuppliedNum152",
    "inLimitAmntToIefSuppliedNum152",
    "inLimitTypeDescIefSuppliedLimitType",
    "inMaxNumCheckIefSuppliedFlag",
    "inMaxNumFromIefSuppliedNum10",
    "inMaxNumToIefSuppliedNum10",
    "inMoreRecordsGenericLimitActiveAccCnt",
    "inMoreRecordsGenericLimitCoveredAmn",
    "inMoreRecordsGenericLimitEntityKey",
    "inMoreRecordsGenericLimitEntityKeyDesc",
    "inMoreRecordsGenericLimitExpireDate",
    "inMoreRecordsGenericLimitIdCurrency",
    "inMoreRecordsGenericLimitLimitAmn",
    "inMoreRecordsGenericLimitLimitComment",
    "inMoreRecordsGenericLimitLimitId",
    "inMoreRecordsGenericLimitLimitType",
    "inMoreRecordsGenericLimitMaxAccNo",
    "inMoreRecordsGenericLimitUsedCoveredAmn",
    "inMoreRecordsGenericLimitUsedLimitAmn",
    "inMoreRecordsIefSuppliedFlag",
    "inNumAvailAccCheckIefSuppliedFlag",
    "inNumAvailAccFromIefSuppliedNum10",
    "inNumAvailAccToIefSuppliedNum10",
    "inProductFromIefSuppliedChar5",
    "inProductToIefSuppliedChar5",
    "inUnitFromIefSuppliedChar5",
    "inUnitToIefSuppliedChar5"
})
public class A1954VLimitsInformationImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAvailableAmntCheckIefSuppliedFlag")
    protected String inAvailableAmntCheckIefSuppliedFlag;
    @XmlElement(name = "InAvailableAmntFromIefSuppliedNum152", required = true)
    protected BigDecimal inAvailableAmntFromIefSuppliedNum152;
    @XmlElement(name = "InAvailableAmntToIefSuppliedNum152", required = true)
    protected BigDecimal inAvailableAmntToIefSuppliedNum152;
    @XmlElement(name = "InBankParametersCurrTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBankParametersCurrTrxDate;
    @XmlElement(name = "InExpireCheckIefSuppliedFlag")
    protected String inExpireCheckIefSuppliedFlag;
    @XmlElement(name = "InExpireDtFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inExpireDtFromIefSuppliedDate;
    @XmlElement(name = "InExpireDtToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inExpireDtToIefSuppliedDate;
    @XmlElement(name = "InGenericLimitActiveAccCnt")
    protected double inGenericLimitActiveAccCnt;
    @XmlElement(name = "InGenericLimitCoveredAmn", required = true)
    protected BigDecimal inGenericLimitCoveredAmn;
    @XmlElement(name = "InGenericLimitEntityKey")
    protected String inGenericLimitEntityKey;
    @XmlElement(name = "InGenericLimitEntityKeyDesc")
    protected String inGenericLimitEntityKeyDesc;
    @XmlElement(name = "InGenericLimitExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGenericLimitExpireDate;
    @XmlElement(name = "InGenericLimitIdCurrency")
    protected int inGenericLimitIdCurrency;
    @XmlElement(name = "InGenericLimitLimitAmn", required = true)
    protected BigDecimal inGenericLimitLimitAmn;
    @XmlElement(name = "InGenericLimitLimitComment")
    protected String inGenericLimitLimitComment;
    @XmlElement(name = "InGenericLimitLimitHistCnt", required = true)
    protected BigDecimal inGenericLimitLimitHistCnt;
    @XmlElement(name = "InGenericLimitLimitId")
    protected double inGenericLimitLimitId;
    @XmlElement(name = "InGenericLimitLimitType")
    protected String inGenericLimitLimitType;
    @XmlElement(name = "InGenericLimitMaxAccNo")
    protected double inGenericLimitMaxAccNo;
    @XmlElement(name = "InGenericLimitUsedCoveredAmn", required = true)
    protected BigDecimal inGenericLimitUsedCoveredAmn;
    @XmlElement(name = "InGenericLimitUsedLimitAmn", required = true)
    protected BigDecimal inGenericLimitUsedLimitAmn;
    @XmlElement(name = "InGrpFromIefSuppliedChar10")
    protected String inGrpFromIefSuppliedChar10;
    @XmlElement(name = "InGrpToIefSuppliedChar10")
    protected String inGrpToIefSuppliedChar10;
    @XmlElement(name = "InLimitAmntCheckIefSuppliedFlag")
    protected String inLimitAmntCheckIefSuppliedFlag;
    @XmlElement(name = "InLimitAmntFromIefSuppliedNum152", required = true)
    protected BigDecimal inLimitAmntFromIefSuppliedNum152;
    @XmlElement(name = "InLimitAmntToIefSuppliedNum152", required = true)
    protected BigDecimal inLimitAmntToIefSuppliedNum152;
    @XmlElement(name = "InLimitTypeDescIefSuppliedLimitType")
    protected String inLimitTypeDescIefSuppliedLimitType;
    @XmlElement(name = "InMaxNumCheckIefSuppliedFlag")
    protected String inMaxNumCheckIefSuppliedFlag;
    @XmlElement(name = "InMaxNumFromIefSuppliedNum10")
    protected double inMaxNumFromIefSuppliedNum10;
    @XmlElement(name = "InMaxNumToIefSuppliedNum10")
    protected double inMaxNumToIefSuppliedNum10;
    @XmlElement(name = "InMoreRecordsGenericLimitActiveAccCnt")
    protected double inMoreRecordsGenericLimitActiveAccCnt;
    @XmlElement(name = "InMoreRecordsGenericLimitCoveredAmn", required = true)
    protected BigDecimal inMoreRecordsGenericLimitCoveredAmn;
    @XmlElement(name = "InMoreRecordsGenericLimitEntityKey")
    protected String inMoreRecordsGenericLimitEntityKey;
    @XmlElement(name = "InMoreRecordsGenericLimitEntityKeyDesc")
    protected String inMoreRecordsGenericLimitEntityKeyDesc;
    @XmlElement(name = "InMoreRecordsGenericLimitExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inMoreRecordsGenericLimitExpireDate;
    @XmlElement(name = "InMoreRecordsGenericLimitIdCurrency")
    protected int inMoreRecordsGenericLimitIdCurrency;
    @XmlElement(name = "InMoreRecordsGenericLimitLimitAmn", required = true)
    protected BigDecimal inMoreRecordsGenericLimitLimitAmn;
    @XmlElement(name = "InMoreRecordsGenericLimitLimitComment")
    protected String inMoreRecordsGenericLimitLimitComment;
    @XmlElement(name = "InMoreRecordsGenericLimitLimitId")
    protected double inMoreRecordsGenericLimitLimitId;
    @XmlElement(name = "InMoreRecordsGenericLimitLimitType")
    protected String inMoreRecordsGenericLimitLimitType;
    @XmlElement(name = "InMoreRecordsGenericLimitMaxAccNo")
    protected double inMoreRecordsGenericLimitMaxAccNo;
    @XmlElement(name = "InMoreRecordsGenericLimitUsedCoveredAmn", required = true)
    protected BigDecimal inMoreRecordsGenericLimitUsedCoveredAmn;
    @XmlElement(name = "InMoreRecordsGenericLimitUsedLimitAmn", required = true)
    protected BigDecimal inMoreRecordsGenericLimitUsedLimitAmn;
    @XmlElement(name = "InMoreRecordsIefSuppliedFlag")
    protected String inMoreRecordsIefSuppliedFlag;
    @XmlElement(name = "InNumAvailAccCheckIefSuppliedFlag")
    protected String inNumAvailAccCheckIefSuppliedFlag;
    @XmlElement(name = "InNumAvailAccFromIefSuppliedNum10")
    protected double inNumAvailAccFromIefSuppliedNum10;
    @XmlElement(name = "InNumAvailAccToIefSuppliedNum10")
    protected double inNumAvailAccToIefSuppliedNum10;
    @XmlElement(name = "InProductFromIefSuppliedChar5")
    protected String inProductFromIefSuppliedChar5;
    @XmlElement(name = "InProductToIefSuppliedChar5")
    protected String inProductToIefSuppliedChar5;
    @XmlElement(name = "InUnitFromIefSuppliedChar5")
    protected String inUnitFromIefSuppliedChar5;
    @XmlElement(name = "InUnitToIefSuppliedChar5")
    protected String inUnitToIefSuppliedChar5;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inAvailableAmntCheckIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAvailableAmntCheckIefSuppliedFlag() {
        return inAvailableAmntCheckIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAvailableAmntCheckIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAvailableAmntCheckIefSuppliedFlag(String value) {
        this.inAvailableAmntCheckIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inAvailableAmntFromIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAvailableAmntFromIefSuppliedNum152() {
        return inAvailableAmntFromIefSuppliedNum152;
    }

    /**
     * Sets the value of the inAvailableAmntFromIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAvailableAmntFromIefSuppliedNum152(BigDecimal value) {
        this.inAvailableAmntFromIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the inAvailableAmntToIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInAvailableAmntToIefSuppliedNum152() {
        return inAvailableAmntToIefSuppliedNum152;
    }

    /**
     * Sets the value of the inAvailableAmntToIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInAvailableAmntToIefSuppliedNum152(BigDecimal value) {
        this.inAvailableAmntToIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the inBankParametersCurrTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBankParametersCurrTrxDate() {
        return inBankParametersCurrTrxDate;
    }

    /**
     * Sets the value of the inBankParametersCurrTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBankParametersCurrTrxDate(XMLGregorianCalendar value) {
        this.inBankParametersCurrTrxDate = value;
    }

    /**
     * Gets the value of the inExpireCheckIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExpireCheckIefSuppliedFlag() {
        return inExpireCheckIefSuppliedFlag;
    }

    /**
     * Sets the value of the inExpireCheckIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExpireCheckIefSuppliedFlag(String value) {
        this.inExpireCheckIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inExpireDtFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInExpireDtFromIefSuppliedDate() {
        return inExpireDtFromIefSuppliedDate;
    }

    /**
     * Sets the value of the inExpireDtFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInExpireDtFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.inExpireDtFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inExpireDtToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInExpireDtToIefSuppliedDate() {
        return inExpireDtToIefSuppliedDate;
    }

    /**
     * Sets the value of the inExpireDtToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInExpireDtToIefSuppliedDate(XMLGregorianCalendar value) {
        this.inExpireDtToIefSuppliedDate = value;
    }

    /**
     * Gets the value of the inGenericLimitActiveAccCnt property.
     * 
     */
    public double getInGenericLimitActiveAccCnt() {
        return inGenericLimitActiveAccCnt;
    }

    /**
     * Sets the value of the inGenericLimitActiveAccCnt property.
     * 
     */
    public void setInGenericLimitActiveAccCnt(double value) {
        this.inGenericLimitActiveAccCnt = value;
    }

    /**
     * Gets the value of the inGenericLimitCoveredAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGenericLimitCoveredAmn() {
        return inGenericLimitCoveredAmn;
    }

    /**
     * Sets the value of the inGenericLimitCoveredAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGenericLimitCoveredAmn(BigDecimal value) {
        this.inGenericLimitCoveredAmn = value;
    }

    /**
     * Gets the value of the inGenericLimitEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericLimitEntityKey() {
        return inGenericLimitEntityKey;
    }

    /**
     * Sets the value of the inGenericLimitEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericLimitEntityKey(String value) {
        this.inGenericLimitEntityKey = value;
    }

    /**
     * Gets the value of the inGenericLimitEntityKeyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericLimitEntityKeyDesc() {
        return inGenericLimitEntityKeyDesc;
    }

    /**
     * Sets the value of the inGenericLimitEntityKeyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericLimitEntityKeyDesc(String value) {
        this.inGenericLimitEntityKeyDesc = value;
    }

    /**
     * Gets the value of the inGenericLimitExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGenericLimitExpireDate() {
        return inGenericLimitExpireDate;
    }

    /**
     * Sets the value of the inGenericLimitExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGenericLimitExpireDate(XMLGregorianCalendar value) {
        this.inGenericLimitExpireDate = value;
    }

    /**
     * Gets the value of the inGenericLimitIdCurrency property.
     * 
     */
    public int getInGenericLimitIdCurrency() {
        return inGenericLimitIdCurrency;
    }

    /**
     * Sets the value of the inGenericLimitIdCurrency property.
     * 
     */
    public void setInGenericLimitIdCurrency(int value) {
        this.inGenericLimitIdCurrency = value;
    }

    /**
     * Gets the value of the inGenericLimitLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGenericLimitLimitAmn() {
        return inGenericLimitLimitAmn;
    }

    /**
     * Sets the value of the inGenericLimitLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGenericLimitLimitAmn(BigDecimal value) {
        this.inGenericLimitLimitAmn = value;
    }

    /**
     * Gets the value of the inGenericLimitLimitComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericLimitLimitComment() {
        return inGenericLimitLimitComment;
    }

    /**
     * Sets the value of the inGenericLimitLimitComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericLimitLimitComment(String value) {
        this.inGenericLimitLimitComment = value;
    }

    /**
     * Gets the value of the inGenericLimitLimitHistCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGenericLimitLimitHistCnt() {
        return inGenericLimitLimitHistCnt;
    }

    /**
     * Sets the value of the inGenericLimitLimitHistCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGenericLimitLimitHistCnt(BigDecimal value) {
        this.inGenericLimitLimitHistCnt = value;
    }

    /**
     * Gets the value of the inGenericLimitLimitId property.
     * 
     */
    public double getInGenericLimitLimitId() {
        return inGenericLimitLimitId;
    }

    /**
     * Sets the value of the inGenericLimitLimitId property.
     * 
     */
    public void setInGenericLimitLimitId(double value) {
        this.inGenericLimitLimitId = value;
    }

    /**
     * Gets the value of the inGenericLimitLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGenericLimitLimitType() {
        return inGenericLimitLimitType;
    }

    /**
     * Sets the value of the inGenericLimitLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGenericLimitLimitType(String value) {
        this.inGenericLimitLimitType = value;
    }

    /**
     * Gets the value of the inGenericLimitMaxAccNo property.
     * 
     */
    public double getInGenericLimitMaxAccNo() {
        return inGenericLimitMaxAccNo;
    }

    /**
     * Sets the value of the inGenericLimitMaxAccNo property.
     * 
     */
    public void setInGenericLimitMaxAccNo(double value) {
        this.inGenericLimitMaxAccNo = value;
    }

    /**
     * Gets the value of the inGenericLimitUsedCoveredAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGenericLimitUsedCoveredAmn() {
        return inGenericLimitUsedCoveredAmn;
    }

    /**
     * Sets the value of the inGenericLimitUsedCoveredAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGenericLimitUsedCoveredAmn(BigDecimal value) {
        this.inGenericLimitUsedCoveredAmn = value;
    }

    /**
     * Gets the value of the inGenericLimitUsedLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGenericLimitUsedLimitAmn() {
        return inGenericLimitUsedLimitAmn;
    }

    /**
     * Sets the value of the inGenericLimitUsedLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGenericLimitUsedLimitAmn(BigDecimal value) {
        this.inGenericLimitUsedLimitAmn = value;
    }

    /**
     * Gets the value of the inGrpFromIefSuppliedChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpFromIefSuppliedChar10() {
        return inGrpFromIefSuppliedChar10;
    }

    /**
     * Sets the value of the inGrpFromIefSuppliedChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpFromIefSuppliedChar10(String value) {
        this.inGrpFromIefSuppliedChar10 = value;
    }

    /**
     * Gets the value of the inGrpToIefSuppliedChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpToIefSuppliedChar10() {
        return inGrpToIefSuppliedChar10;
    }

    /**
     * Sets the value of the inGrpToIefSuppliedChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpToIefSuppliedChar10(String value) {
        this.inGrpToIefSuppliedChar10 = value;
    }

    /**
     * Gets the value of the inLimitAmntCheckIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLimitAmntCheckIefSuppliedFlag() {
        return inLimitAmntCheckIefSuppliedFlag;
    }

    /**
     * Sets the value of the inLimitAmntCheckIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLimitAmntCheckIefSuppliedFlag(String value) {
        this.inLimitAmntCheckIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inLimitAmntFromIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLimitAmntFromIefSuppliedNum152() {
        return inLimitAmntFromIefSuppliedNum152;
    }

    /**
     * Sets the value of the inLimitAmntFromIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLimitAmntFromIefSuppliedNum152(BigDecimal value) {
        this.inLimitAmntFromIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the inLimitAmntToIefSuppliedNum152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLimitAmntToIefSuppliedNum152() {
        return inLimitAmntToIefSuppliedNum152;
    }

    /**
     * Sets the value of the inLimitAmntToIefSuppliedNum152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLimitAmntToIefSuppliedNum152(BigDecimal value) {
        this.inLimitAmntToIefSuppliedNum152 = value;
    }

    /**
     * Gets the value of the inLimitTypeDescIefSuppliedLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLimitTypeDescIefSuppliedLimitType() {
        return inLimitTypeDescIefSuppliedLimitType;
    }

    /**
     * Sets the value of the inLimitTypeDescIefSuppliedLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLimitTypeDescIefSuppliedLimitType(String value) {
        this.inLimitTypeDescIefSuppliedLimitType = value;
    }

    /**
     * Gets the value of the inMaxNumCheckIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMaxNumCheckIefSuppliedFlag() {
        return inMaxNumCheckIefSuppliedFlag;
    }

    /**
     * Sets the value of the inMaxNumCheckIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMaxNumCheckIefSuppliedFlag(String value) {
        this.inMaxNumCheckIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inMaxNumFromIefSuppliedNum10 property.
     * 
     */
    public double getInMaxNumFromIefSuppliedNum10() {
        return inMaxNumFromIefSuppliedNum10;
    }

    /**
     * Sets the value of the inMaxNumFromIefSuppliedNum10 property.
     * 
     */
    public void setInMaxNumFromIefSuppliedNum10(double value) {
        this.inMaxNumFromIefSuppliedNum10 = value;
    }

    /**
     * Gets the value of the inMaxNumToIefSuppliedNum10 property.
     * 
     */
    public double getInMaxNumToIefSuppliedNum10() {
        return inMaxNumToIefSuppliedNum10;
    }

    /**
     * Sets the value of the inMaxNumToIefSuppliedNum10 property.
     * 
     */
    public void setInMaxNumToIefSuppliedNum10(double value) {
        this.inMaxNumToIefSuppliedNum10 = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitActiveAccCnt property.
     * 
     */
    public double getInMoreRecordsGenericLimitActiveAccCnt() {
        return inMoreRecordsGenericLimitActiveAccCnt;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitActiveAccCnt property.
     * 
     */
    public void setInMoreRecordsGenericLimitActiveAccCnt(double value) {
        this.inMoreRecordsGenericLimitActiveAccCnt = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitCoveredAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMoreRecordsGenericLimitCoveredAmn() {
        return inMoreRecordsGenericLimitCoveredAmn;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitCoveredAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMoreRecordsGenericLimitCoveredAmn(BigDecimal value) {
        this.inMoreRecordsGenericLimitCoveredAmn = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitEntityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMoreRecordsGenericLimitEntityKey() {
        return inMoreRecordsGenericLimitEntityKey;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitEntityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMoreRecordsGenericLimitEntityKey(String value) {
        this.inMoreRecordsGenericLimitEntityKey = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitEntityKeyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMoreRecordsGenericLimitEntityKeyDesc() {
        return inMoreRecordsGenericLimitEntityKeyDesc;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitEntityKeyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMoreRecordsGenericLimitEntityKeyDesc(String value) {
        this.inMoreRecordsGenericLimitEntityKeyDesc = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInMoreRecordsGenericLimitExpireDate() {
        return inMoreRecordsGenericLimitExpireDate;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInMoreRecordsGenericLimitExpireDate(XMLGregorianCalendar value) {
        this.inMoreRecordsGenericLimitExpireDate = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitIdCurrency property.
     * 
     */
    public int getInMoreRecordsGenericLimitIdCurrency() {
        return inMoreRecordsGenericLimitIdCurrency;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitIdCurrency property.
     * 
     */
    public void setInMoreRecordsGenericLimitIdCurrency(int value) {
        this.inMoreRecordsGenericLimitIdCurrency = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMoreRecordsGenericLimitLimitAmn() {
        return inMoreRecordsGenericLimitLimitAmn;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMoreRecordsGenericLimitLimitAmn(BigDecimal value) {
        this.inMoreRecordsGenericLimitLimitAmn = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitLimitComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMoreRecordsGenericLimitLimitComment() {
        return inMoreRecordsGenericLimitLimitComment;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitLimitComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMoreRecordsGenericLimitLimitComment(String value) {
        this.inMoreRecordsGenericLimitLimitComment = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitLimitId property.
     * 
     */
    public double getInMoreRecordsGenericLimitLimitId() {
        return inMoreRecordsGenericLimitLimitId;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitLimitId property.
     * 
     */
    public void setInMoreRecordsGenericLimitLimitId(double value) {
        this.inMoreRecordsGenericLimitLimitId = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMoreRecordsGenericLimitLimitType() {
        return inMoreRecordsGenericLimitLimitType;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMoreRecordsGenericLimitLimitType(String value) {
        this.inMoreRecordsGenericLimitLimitType = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitMaxAccNo property.
     * 
     */
    public double getInMoreRecordsGenericLimitMaxAccNo() {
        return inMoreRecordsGenericLimitMaxAccNo;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitMaxAccNo property.
     * 
     */
    public void setInMoreRecordsGenericLimitMaxAccNo(double value) {
        this.inMoreRecordsGenericLimitMaxAccNo = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitUsedCoveredAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMoreRecordsGenericLimitUsedCoveredAmn() {
        return inMoreRecordsGenericLimitUsedCoveredAmn;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitUsedCoveredAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMoreRecordsGenericLimitUsedCoveredAmn(BigDecimal value) {
        this.inMoreRecordsGenericLimitUsedCoveredAmn = value;
    }

    /**
     * Gets the value of the inMoreRecordsGenericLimitUsedLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMoreRecordsGenericLimitUsedLimitAmn() {
        return inMoreRecordsGenericLimitUsedLimitAmn;
    }

    /**
     * Sets the value of the inMoreRecordsGenericLimitUsedLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMoreRecordsGenericLimitUsedLimitAmn(BigDecimal value) {
        this.inMoreRecordsGenericLimitUsedLimitAmn = value;
    }

    /**
     * Gets the value of the inMoreRecordsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMoreRecordsIefSuppliedFlag() {
        return inMoreRecordsIefSuppliedFlag;
    }

    /**
     * Sets the value of the inMoreRecordsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMoreRecordsIefSuppliedFlag(String value) {
        this.inMoreRecordsIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inNumAvailAccCheckIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNumAvailAccCheckIefSuppliedFlag() {
        return inNumAvailAccCheckIefSuppliedFlag;
    }

    /**
     * Sets the value of the inNumAvailAccCheckIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNumAvailAccCheckIefSuppliedFlag(String value) {
        this.inNumAvailAccCheckIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inNumAvailAccFromIefSuppliedNum10 property.
     * 
     */
    public double getInNumAvailAccFromIefSuppliedNum10() {
        return inNumAvailAccFromIefSuppliedNum10;
    }

    /**
     * Sets the value of the inNumAvailAccFromIefSuppliedNum10 property.
     * 
     */
    public void setInNumAvailAccFromIefSuppliedNum10(double value) {
        this.inNumAvailAccFromIefSuppliedNum10 = value;
    }

    /**
     * Gets the value of the inNumAvailAccToIefSuppliedNum10 property.
     * 
     */
    public double getInNumAvailAccToIefSuppliedNum10() {
        return inNumAvailAccToIefSuppliedNum10;
    }

    /**
     * Sets the value of the inNumAvailAccToIefSuppliedNum10 property.
     * 
     */
    public void setInNumAvailAccToIefSuppliedNum10(double value) {
        this.inNumAvailAccToIefSuppliedNum10 = value;
    }

    /**
     * Gets the value of the inProductFromIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProductFromIefSuppliedChar5() {
        return inProductFromIefSuppliedChar5;
    }

    /**
     * Sets the value of the inProductFromIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProductFromIefSuppliedChar5(String value) {
        this.inProductFromIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inProductToIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProductToIefSuppliedChar5() {
        return inProductToIefSuppliedChar5;
    }

    /**
     * Sets the value of the inProductToIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProductToIefSuppliedChar5(String value) {
        this.inProductToIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inUnitFromIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUnitFromIefSuppliedChar5() {
        return inUnitFromIefSuppliedChar5;
    }

    /**
     * Sets the value of the inUnitFromIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUnitFromIefSuppliedChar5(String value) {
        this.inUnitFromIefSuppliedChar5 = value;
    }

    /**
     * Gets the value of the inUnitToIefSuppliedChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUnitToIefSuppliedChar5() {
        return inUnitToIefSuppliedChar5;
    }

    /**
     * Sets the value of the inUnitToIefSuppliedChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUnitToIefSuppliedChar5(String value) {
        this.inUnitToIefSuppliedChar5 = value;
    }

}
