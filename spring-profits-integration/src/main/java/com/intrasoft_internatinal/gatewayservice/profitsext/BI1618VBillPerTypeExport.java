
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BI1618V_BillPerTypeExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BI1618V_BillPerTypeExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="IsMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutDiaerCharSuppliedChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDiaerCharSuppliedChar40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrmLogMntRecordingGrpSubscript" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrmLogMntRecordingIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrmLogMntRecordingIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrmLogMntRecordingTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrmLogMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOwnbankCodeBankParametersBankCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BI1618VOutBillBillspertypeGrpList" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfBI1618VOutBillBillspertypeGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BI1618V_BillPerTypeExport", propOrder = {
    "isMore",
    "outDiaerCharSuppliedChar3",
    "outDiaerCharSuppliedChar40",
    "outGrmLogMntRecordingGrpSubscript",
    "outGrmLogMntRecordingIdJustific",
    "outGrmLogMntRecordingIdProduct",
    "outGrmLogMntRecordingTmstamp",
    "outGrmLogMntRecordingTrxUsrSn",
    "outOwnbankCodeBankParametersBankCode",
    "outTrxCountTrxCounter",
    "bi1618VOutBillBillspertypeGrpList"
})
public class BI1618VBillPerTypeExport
    extends BaseExport
{

    @XmlElement(name = "IsMore")
    protected boolean isMore;
    @XmlElement(name = "OutDiaerCharSuppliedChar3")
    protected String outDiaerCharSuppliedChar3;
    @XmlElement(name = "OutDiaerCharSuppliedChar40")
    protected String outDiaerCharSuppliedChar40;
    @XmlElement(name = "OutGrmLogMntRecordingGrpSubscript")
    protected short outGrmLogMntRecordingGrpSubscript;
    @XmlElement(name = "OutGrmLogMntRecordingIdJustific")
    protected int outGrmLogMntRecordingIdJustific;
    @XmlElement(name = "OutGrmLogMntRecordingIdProduct")
    protected int outGrmLogMntRecordingIdProduct;
    @XmlElement(name = "OutGrmLogMntRecordingTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrmLogMntRecordingTmstamp;
    @XmlElement(name = "OutGrmLogMntRecordingTrxUsrSn")
    protected int outGrmLogMntRecordingTrxUsrSn;
    @XmlElement(name = "OutOwnbankCodeBankParametersBankCode")
    protected short outOwnbankCodeBankParametersBankCode;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "BI1618VOutBillBillspertypeGrpList")
    protected ArrayOfBI1618VOutBillBillspertypeGrpItem bi1618VOutBillBillspertypeGrpList;

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
     * Gets the value of the outDiaerCharSuppliedChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDiaerCharSuppliedChar3() {
        return outDiaerCharSuppliedChar3;
    }

    /**
     * Sets the value of the outDiaerCharSuppliedChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDiaerCharSuppliedChar3(String value) {
        this.outDiaerCharSuppliedChar3 = value;
    }

    /**
     * Gets the value of the outDiaerCharSuppliedChar40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDiaerCharSuppliedChar40() {
        return outDiaerCharSuppliedChar40;
    }

    /**
     * Sets the value of the outDiaerCharSuppliedChar40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDiaerCharSuppliedChar40(String value) {
        this.outDiaerCharSuppliedChar40 = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public short getOutGrmLogMntRecordingGrpSubscript() {
        return outGrmLogMntRecordingGrpSubscript;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingGrpSubscript property.
     * 
     */
    public void setOutGrmLogMntRecordingGrpSubscript(short value) {
        this.outGrmLogMntRecordingGrpSubscript = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingIdJustific property.
     * 
     */
    public int getOutGrmLogMntRecordingIdJustific() {
        return outGrmLogMntRecordingIdJustific;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingIdJustific property.
     * 
     */
    public void setOutGrmLogMntRecordingIdJustific(int value) {
        this.outGrmLogMntRecordingIdJustific = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingIdProduct property.
     * 
     */
    public int getOutGrmLogMntRecordingIdProduct() {
        return outGrmLogMntRecordingIdProduct;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingIdProduct property.
     * 
     */
    public void setOutGrmLogMntRecordingIdProduct(int value) {
        this.outGrmLogMntRecordingIdProduct = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrmLogMntRecordingTmstamp() {
        return outGrmLogMntRecordingTmstamp;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrmLogMntRecordingTmstamp(XMLGregorianCalendar value) {
        this.outGrmLogMntRecordingTmstamp = value;
    }

    /**
     * Gets the value of the outGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrmLogMntRecordingTrxUsrSn() {
        return outGrmLogMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrmLogMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrmLogMntRecordingTrxUsrSn(int value) {
        this.outGrmLogMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outOwnbankCodeBankParametersBankCode property.
     * 
     */
    public short getOutOwnbankCodeBankParametersBankCode() {
        return outOwnbankCodeBankParametersBankCode;
    }

    /**
     * Sets the value of the outOwnbankCodeBankParametersBankCode property.
     * 
     */
    public void setOutOwnbankCodeBankParametersBankCode(short value) {
        this.outOwnbankCodeBankParametersBankCode = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the bi1618VOutBillBillspertypeGrpList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBI1618VOutBillBillspertypeGrpItem }
     *     
     */
    public ArrayOfBI1618VOutBillBillspertypeGrpItem getBI1618VOutBillBillspertypeGrpList() {
        return bi1618VOutBillBillspertypeGrpList;
    }

    /**
     * Sets the value of the bi1618VOutBillBillspertypeGrpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBI1618VOutBillBillspertypeGrpItem }
     *     
     */
    public void setBI1618VOutBillBillspertypeGrpList(ArrayOfBI1618VOutBillBillspertypeGrpItem value) {
        this.bi1618VOutBillBillspertypeGrpList = value;
    }

}
