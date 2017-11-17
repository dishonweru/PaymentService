
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2104V_StandingOrdersInquiryExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2104V_StandingOrdersInquiryExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCountIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCriteriaProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCriteriaProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDateFromIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDateToIefSuppliedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutJunctionFromGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutJunctionToGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMoreGrmDrCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMoreGrmTpSoCommitmentActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMoreGrmTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutMoreIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutReplyIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReplyIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRmUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutScreenTpSoCommitmentEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutUnitFromUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUnitToUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpProduct" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2104VOutGrpProductItem" minOccurs="0"/>
 *         &lt;element name="OutGrpUnpaidStandingOrders" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2104VOutGrpUnpaidStandingOrdersItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2104V_StandingOrdersInquiryExport", propOrder = {
    "outCountIefSuppliedCount",
    "outCriteriaProductDescription",
    "outCriteriaProductIdProduct",
    "outDateFromIefSuppliedDate",
    "outDateToIefSuppliedDate",
    "outJunctionFromGenericDetailSerialNum",
    "outJunctionToGenericDetailSerialNum",
    "outMoreGrmDrCustomerCustId",
    "outMoreGrmTpSoCommitmentActivationDate",
    "outMoreGrmTpSoCommitmentTpSoIdentifier",
    "outMoreIefSuppliedCount",
    "outPrintLineDate",
    "outPrintLineTime",
    "outReplyIefSuppliedActionEntryDesc",
    "outReplyIefSuppliedSrvStatus",
    "outRmUsrCode",
    "outScreenTpSoCommitmentEntryStatus",
    "outUnitFromUnitCode",
    "outUnitToUnitCode",
    "outGrpProduct",
    "outGrpUnpaidStandingOrders"
})
public class T2104VStandingOrdersInquiryExport
    extends BaseExport
{

    @XmlElement(name = "OutCountIefSuppliedCount")
    protected int outCountIefSuppliedCount;
    @XmlElement(name = "OutCriteriaProductDescription")
    protected String outCriteriaProductDescription;
    @XmlElement(name = "OutCriteriaProductIdProduct")
    protected int outCriteriaProductIdProduct;
    @XmlElement(name = "OutDateFromIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDateFromIefSuppliedDate;
    @XmlElement(name = "OutDateToIefSuppliedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDateToIefSuppliedDate;
    @XmlElement(name = "OutJunctionFromGenericDetailSerialNum")
    protected int outJunctionFromGenericDetailSerialNum;
    @XmlElement(name = "OutJunctionToGenericDetailSerialNum")
    protected int outJunctionToGenericDetailSerialNum;
    @XmlElement(name = "OutMoreGrmDrCustomerCustId")
    protected int outMoreGrmDrCustomerCustId;
    @XmlElement(name = "OutMoreGrmTpSoCommitmentActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outMoreGrmTpSoCommitmentActivationDate;
    @XmlElement(name = "OutMoreGrmTpSoCommitmentTpSoIdentifier")
    protected double outMoreGrmTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "OutMoreIefSuppliedCount")
    protected int outMoreIefSuppliedCount;
    @XmlElement(name = "OutPrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineDate;
    @XmlElement(name = "OutPrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outPrintLineTime;
    @XmlElement(name = "OutReplyIefSuppliedActionEntryDesc")
    protected String outReplyIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutReplyIefSuppliedSrvStatus")
    protected String outReplyIefSuppliedSrvStatus;
    @XmlElement(name = "OutRmUsrCode")
    protected String outRmUsrCode;
    @XmlElement(name = "OutScreenTpSoCommitmentEntryStatus")
    protected String outScreenTpSoCommitmentEntryStatus;
    @XmlElement(name = "OutUnitFromUnitCode")
    protected int outUnitFromUnitCode;
    @XmlElement(name = "OutUnitToUnitCode")
    protected int outUnitToUnitCode;
    @XmlElement(name = "OutGrpProduct")
    protected ArrayOfT2104VOutGrpProductItem outGrpProduct;
    @XmlElement(name = "OutGrpUnpaidStandingOrders")
    protected ArrayOfT2104VOutGrpUnpaidStandingOrdersItem outGrpUnpaidStandingOrders;

    /**
     * Gets the value of the outCountIefSuppliedCount property.
     * 
     */
    public int getOutCountIefSuppliedCount() {
        return outCountIefSuppliedCount;
    }

    /**
     * Sets the value of the outCountIefSuppliedCount property.
     * 
     */
    public void setOutCountIefSuppliedCount(int value) {
        this.outCountIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outCriteriaProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCriteriaProductDescription() {
        return outCriteriaProductDescription;
    }

    /**
     * Sets the value of the outCriteriaProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCriteriaProductDescription(String value) {
        this.outCriteriaProductDescription = value;
    }

    /**
     * Gets the value of the outCriteriaProductIdProduct property.
     * 
     */
    public int getOutCriteriaProductIdProduct() {
        return outCriteriaProductIdProduct;
    }

    /**
     * Sets the value of the outCriteriaProductIdProduct property.
     * 
     */
    public void setOutCriteriaProductIdProduct(int value) {
        this.outCriteriaProductIdProduct = value;
    }

    /**
     * Gets the value of the outDateFromIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDateFromIefSuppliedDate() {
        return outDateFromIefSuppliedDate;
    }

    /**
     * Sets the value of the outDateFromIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDateFromIefSuppliedDate(XMLGregorianCalendar value) {
        this.outDateFromIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outDateToIefSuppliedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDateToIefSuppliedDate() {
        return outDateToIefSuppliedDate;
    }

    /**
     * Sets the value of the outDateToIefSuppliedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDateToIefSuppliedDate(XMLGregorianCalendar value) {
        this.outDateToIefSuppliedDate = value;
    }

    /**
     * Gets the value of the outJunctionFromGenericDetailSerialNum property.
     * 
     */
    public int getOutJunctionFromGenericDetailSerialNum() {
        return outJunctionFromGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outJunctionFromGenericDetailSerialNum property.
     * 
     */
    public void setOutJunctionFromGenericDetailSerialNum(int value) {
        this.outJunctionFromGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outJunctionToGenericDetailSerialNum property.
     * 
     */
    public int getOutJunctionToGenericDetailSerialNum() {
        return outJunctionToGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outJunctionToGenericDetailSerialNum property.
     * 
     */
    public void setOutJunctionToGenericDetailSerialNum(int value) {
        this.outJunctionToGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outMoreGrmDrCustomerCustId property.
     * 
     */
    public int getOutMoreGrmDrCustomerCustId() {
        return outMoreGrmDrCustomerCustId;
    }

    /**
     * Sets the value of the outMoreGrmDrCustomerCustId property.
     * 
     */
    public void setOutMoreGrmDrCustomerCustId(int value) {
        this.outMoreGrmDrCustomerCustId = value;
    }

    /**
     * Gets the value of the outMoreGrmTpSoCommitmentActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutMoreGrmTpSoCommitmentActivationDate() {
        return outMoreGrmTpSoCommitmentActivationDate;
    }

    /**
     * Sets the value of the outMoreGrmTpSoCommitmentActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutMoreGrmTpSoCommitmentActivationDate(XMLGregorianCalendar value) {
        this.outMoreGrmTpSoCommitmentActivationDate = value;
    }

    /**
     * Gets the value of the outMoreGrmTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutMoreGrmTpSoCommitmentTpSoIdentifier() {
        return outMoreGrmTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outMoreGrmTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutMoreGrmTpSoCommitmentTpSoIdentifier(double value) {
        this.outMoreGrmTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outMoreIefSuppliedCount property.
     * 
     */
    public int getOutMoreIefSuppliedCount() {
        return outMoreIefSuppliedCount;
    }

    /**
     * Sets the value of the outMoreIefSuppliedCount property.
     * 
     */
    public void setOutMoreIefSuppliedCount(int value) {
        this.outMoreIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outPrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineDate() {
        return outPrintLineDate;
    }

    /**
     * Sets the value of the outPrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineDate(XMLGregorianCalendar value) {
        this.outPrintLineDate = value;
    }

    /**
     * Gets the value of the outPrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutPrintLineTime() {
        return outPrintLineTime;
    }

    /**
     * Sets the value of the outPrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutPrintLineTime(XMLGregorianCalendar value) {
        this.outPrintLineTime = value;
    }

    /**
     * Gets the value of the outReplyIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReplyIefSuppliedActionEntryDesc() {
        return outReplyIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outReplyIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReplyIefSuppliedActionEntryDesc(String value) {
        this.outReplyIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outReplyIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutReplyIefSuppliedSrvStatus() {
        return outReplyIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outReplyIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutReplyIefSuppliedSrvStatus(String value) {
        this.outReplyIefSuppliedSrvStatus = value;
    }

    /**
     * Gets the value of the outRmUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRmUsrCode() {
        return outRmUsrCode;
    }

    /**
     * Sets the value of the outRmUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRmUsrCode(String value) {
        this.outRmUsrCode = value;
    }

    /**
     * Gets the value of the outScreenTpSoCommitmentEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutScreenTpSoCommitmentEntryStatus() {
        return outScreenTpSoCommitmentEntryStatus;
    }

    /**
     * Sets the value of the outScreenTpSoCommitmentEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutScreenTpSoCommitmentEntryStatus(String value) {
        this.outScreenTpSoCommitmentEntryStatus = value;
    }

    /**
     * Gets the value of the outUnitFromUnitCode property.
     * 
     */
    public int getOutUnitFromUnitCode() {
        return outUnitFromUnitCode;
    }

    /**
     * Sets the value of the outUnitFromUnitCode property.
     * 
     */
    public void setOutUnitFromUnitCode(int value) {
        this.outUnitFromUnitCode = value;
    }

    /**
     * Gets the value of the outUnitToUnitCode property.
     * 
     */
    public int getOutUnitToUnitCode() {
        return outUnitToUnitCode;
    }

    /**
     * Sets the value of the outUnitToUnitCode property.
     * 
     */
    public void setOutUnitToUnitCode(int value) {
        this.outUnitToUnitCode = value;
    }

    /**
     * Gets the value of the outGrpProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2104VOutGrpProductItem }
     *     
     */
    public ArrayOfT2104VOutGrpProductItem getOutGrpProduct() {
        return outGrpProduct;
    }

    /**
     * Sets the value of the outGrpProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2104VOutGrpProductItem }
     *     
     */
    public void setOutGrpProduct(ArrayOfT2104VOutGrpProductItem value) {
        this.outGrpProduct = value;
    }

    /**
     * Gets the value of the outGrpUnpaidStandingOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2104VOutGrpUnpaidStandingOrdersItem }
     *     
     */
    public ArrayOfT2104VOutGrpUnpaidStandingOrdersItem getOutGrpUnpaidStandingOrders() {
        return outGrpUnpaidStandingOrders;
    }

    /**
     * Sets the value of the outGrpUnpaidStandingOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2104VOutGrpUnpaidStandingOrdersItem }
     *     
     */
    public void setOutGrpUnpaidStandingOrders(ArrayOfT2104VOutGrpUnpaidStandingOrdersItem value) {
        this.outGrpUnpaidStandingOrders = value;
    }

}
