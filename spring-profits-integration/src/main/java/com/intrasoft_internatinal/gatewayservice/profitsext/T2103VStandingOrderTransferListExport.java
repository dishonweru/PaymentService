
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T2103V_StandingOrderTransferListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T2103V_StandingOrderTransferListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutMoreTpSoCommitmentTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutPrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutReplyIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReplyIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2103VOutGroupItem" minOccurs="0"/>
 *         &lt;element name="OutGrpDays" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT2103VOutGrpDaysItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T2103V_StandingOrderTransferListExport", propOrder = {
    "outMoreTpSoCommitmentTpSoIdentifier",
    "outPrftTransactionDescription",
    "outPrintLineDate",
    "outPrintLineTime",
    "outReplyIefSuppliedActionEntryDesc",
    "outReplyIefSuppliedSrvStatus",
    "outGroup",
    "outGrpDays"
})
public class T2103VStandingOrderTransferListExport
    extends BaseExport
{

    @XmlElement(name = "OutMoreTpSoCommitmentTpSoIdentifier")
    protected double outMoreTpSoCommitmentTpSoIdentifier;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
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
    @XmlElement(name = "OutGroup")
    protected ArrayOfT2103VOutGroupItem outGroup;
    @XmlElement(name = "OutGrpDays")
    protected ArrayOfT2103VOutGrpDaysItem outGrpDays;

    /**
     * Gets the value of the outMoreTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public double getOutMoreTpSoCommitmentTpSoIdentifier() {
        return outMoreTpSoCommitmentTpSoIdentifier;
    }

    /**
     * Sets the value of the outMoreTpSoCommitmentTpSoIdentifier property.
     * 
     */
    public void setOutMoreTpSoCommitmentTpSoIdentifier(double value) {
        this.outMoreTpSoCommitmentTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrftTransactionDescription() {
        return outPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrftTransactionDescription(String value) {
        this.outPrftTransactionDescription = value;
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
     * Gets the value of the outGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2103VOutGroupItem }
     *     
     */
    public ArrayOfT2103VOutGroupItem getOutGroup() {
        return outGroup;
    }

    /**
     * Sets the value of the outGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2103VOutGroupItem }
     *     
     */
    public void setOutGroup(ArrayOfT2103VOutGroupItem value) {
        this.outGroup = value;
    }

    /**
     * Gets the value of the outGrpDays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT2103VOutGrpDaysItem }
     *     
     */
    public ArrayOfT2103VOutGrpDaysItem getOutGrpDays() {
        return outGrpDays;
    }

    /**
     * Sets the value of the outGrpDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT2103VOutGrpDaysItem }
     *     
     */
    public void setOutGrpDays(ArrayOfT2103VOutGrpDaysItem value) {
        this.outGrpDays = value;
    }

}
