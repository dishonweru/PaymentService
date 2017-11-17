
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SWT3501V_SwiftAllianceMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501V_SwiftAllianceMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutChannelInGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChannelInGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChannelOutGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutChannelOutGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFxFtRecordingProductionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutMoreEntriesIefSuppliedNumber8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSWT3501VOutGrpItem" minOccurs="0"/>
 *         &lt;element name="OutGrpRma" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfSWT3501VOutGrpRmaItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501V_SwiftAllianceMaintenanceExport", propOrder = {
    "outChannelInGenericDetailDescription",
    "outChannelInGenericDetailShortDescription",
    "outChannelOutGenericDetailDescription",
    "outChannelOutGenericDetailShortDescription",
    "outFxFtRecordingProductionTime",
    "outMoreEntriesIefSuppliedNumber8",
    "outStatusIefSuppliedActionEntryMsg",
    "outStatusIefSuppliedSrvStatus",
    "outTrxCountTrxCounter",
    "outGrp",
    "outGrpRma"
})
public class SWT3501VSwiftAllianceMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutChannelInGenericDetailDescription")
    protected String outChannelInGenericDetailDescription;
    @XmlElement(name = "OutChannelInGenericDetailShortDescription")
    protected String outChannelInGenericDetailShortDescription;
    @XmlElement(name = "OutChannelOutGenericDetailDescription")
    protected String outChannelOutGenericDetailDescription;
    @XmlElement(name = "OutChannelOutGenericDetailShortDescription")
    protected String outChannelOutGenericDetailShortDescription;
    @XmlElement(name = "OutFxFtRecordingProductionTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outFxFtRecordingProductionTime;
    @XmlElement(name = "OutMoreEntriesIefSuppliedNumber8")
    protected int outMoreEntriesIefSuppliedNumber8;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryMsg")
    protected String outStatusIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutStatusIefSuppliedSrvStatus")
    protected String outStatusIefSuppliedSrvStatus;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutGrp")
    protected ArrayOfSWT3501VOutGrpItem outGrp;
    @XmlElement(name = "OutGrpRma")
    protected ArrayOfSWT3501VOutGrpRmaItem outGrpRma;

    /**
     * Gets the value of the outChannelInGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChannelInGenericDetailDescription() {
        return outChannelInGenericDetailDescription;
    }

    /**
     * Sets the value of the outChannelInGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChannelInGenericDetailDescription(String value) {
        this.outChannelInGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outChannelInGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChannelInGenericDetailShortDescription() {
        return outChannelInGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outChannelInGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChannelInGenericDetailShortDescription(String value) {
        this.outChannelInGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outChannelOutGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChannelOutGenericDetailDescription() {
        return outChannelOutGenericDetailDescription;
    }

    /**
     * Sets the value of the outChannelOutGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChannelOutGenericDetailDescription(String value) {
        this.outChannelOutGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outChannelOutGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChannelOutGenericDetailShortDescription() {
        return outChannelOutGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outChannelOutGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChannelOutGenericDetailShortDescription(String value) {
        this.outChannelOutGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outFxFtRecordingProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutFxFtRecordingProductionTime() {
        return outFxFtRecordingProductionTime;
    }

    /**
     * Sets the value of the outFxFtRecordingProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutFxFtRecordingProductionTime(XMLGregorianCalendar value) {
        this.outFxFtRecordingProductionTime = value;
    }

    /**
     * Gets the value of the outMoreEntriesIefSuppliedNumber8 property.
     * 
     */
    public int getOutMoreEntriesIefSuppliedNumber8() {
        return outMoreEntriesIefSuppliedNumber8;
    }

    /**
     * Sets the value of the outMoreEntriesIefSuppliedNumber8 property.
     * 
     */
    public void setOutMoreEntriesIefSuppliedNumber8(int value) {
        this.outMoreEntriesIefSuppliedNumber8 = value;
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
     * Gets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedSrvStatus() {
        return outStatusIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outStatusIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedSrvStatus(String value) {
        this.outStatusIefSuppliedSrvStatus = value;
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
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSWT3501VOutGrpItem }
     *     
     */
    public ArrayOfSWT3501VOutGrpItem getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSWT3501VOutGrpItem }
     *     
     */
    public void setOutGrp(ArrayOfSWT3501VOutGrpItem value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpRma property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSWT3501VOutGrpRmaItem }
     *     
     */
    public ArrayOfSWT3501VOutGrpRmaItem getOutGrpRma() {
        return outGrpRma;
    }

    /**
     * Sets the value of the outGrpRma property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSWT3501VOutGrpRmaItem }
     *     
     */
    public void setOutGrpRma(ArrayOfSWT3501VOutGrpRmaItem value) {
        this.outGrpRma = value;
    }

}
