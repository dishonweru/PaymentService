
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0135VCardMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0135VCardMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0135VInListGrpItem" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustCardInfoCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCardInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustCardInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustCardInfoTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustCardInfoEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCardInfoCardComnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCardInfoCardRenewal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustCardInfoDisableReasonCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDisreasGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDisreasGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0135VCardMaintenanceImport", propOrder = {
    "inIefSuppliedCommand",
    "inIefSuppliedFlag",
    "inCustomerCustId",
    "inCustomerCDigit",
    "inListGrp",
    "inMntRecordingAuthorizer1",
    "inMntRecordingAuthorizer2",
    "inMntRecordingPrftSystem",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode",
    "inJustificIdJustific",
    "inProductIdProduct",
    "inCustCardInfoCardNo",
    "inCustCardInfoStartDate",
    "inCustCardInfoEndDate",
    "inCustCardInfoTmstamp",
    "inCustCardInfoEntryStatus",
    "inCustCardInfoCardComnts",
    "inCustCardInfoCardRenewal",
    "inCustCardInfoDisableReasonCom",
    "inPrftTransactionIdTransact",
    "inAuthGrantedIefSuppliedFlag",
    "inDisreasGenericDetailSerialNum",
    "inDisreasGenericDetailDescription"
})
public class I0135VCardMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InListGrp")
    protected ArrayOfI0135VInListGrpItem inListGrp;
    @XmlElement(name = "InMntRecordingAuthorizer1")
    protected String inMntRecordingAuthorizer1;
    @XmlElement(name = "InMntRecordingAuthorizer2")
    protected String inMntRecordingAuthorizer2;
    @XmlElement(name = "InMntRecordingPrftSystem")
    protected short inMntRecordingPrftSystem;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InCustCardInfoCardNo")
    protected String inCustCardInfoCardNo;
    @XmlElement(name = "InCustCardInfoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustCardInfoStartDate;
    @XmlElement(name = "InCustCardInfoEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustCardInfoEndDate;
    @XmlElement(name = "InCustCardInfoTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustCardInfoTmstamp;
    @XmlElement(name = "InCustCardInfoEntryStatus")
    protected String inCustCardInfoEntryStatus;
    @XmlElement(name = "InCustCardInfoCardComnts")
    protected String inCustCardInfoCardComnts;
    @XmlElement(name = "InCustCardInfoCardRenewal")
    protected String inCustCardInfoCardRenewal;
    @XmlElement(name = "InCustCardInfoDisableReasonCom")
    protected String inCustCardInfoDisableReasonCom;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InDisreasGenericDetailSerialNum")
    protected int inDisreasGenericDetailSerialNum;
    @XmlElement(name = "InDisreasGenericDetailDescription")
    protected String inDisreasGenericDetailDescription;

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedFlag() {
        return inIefSuppliedFlag;
    }

    /**
     * Sets the value of the inIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedFlag(String value) {
        this.inIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
    }

    /**
     * Gets the value of the inListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0135VInListGrpItem }
     *     
     */
    public ArrayOfI0135VInListGrpItem getInListGrp() {
        return inListGrp;
    }

    /**
     * Sets the value of the inListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0135VInListGrpItem }
     *     
     */
    public void setInListGrp(ArrayOfI0135VInListGrpItem value) {
        this.inListGrp = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer1() {
        return inMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer1(String value) {
        this.inMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer2() {
        return inMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer2(String value) {
        this.inMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public short getInMntRecordingPrftSystem() {
        return inMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public void setInMntRecordingPrftSystem(short value) {
        this.inMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingReversalFlag() {
        return inMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingReversalFlag(String value) {
        this.inMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingTerminalNumber() {
        return inMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingTerminalNumber(String value) {
        this.inMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inMntRecordingTrxCode property.
     * 
     */
    public int getInMntRecordingTrxCode() {
        return inMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inMntRecordingTrxCode property.
     * 
     */
    public void setInMntRecordingTrxCode(int value) {
        this.inMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inCustCardInfoCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCardInfoCardNo() {
        return inCustCardInfoCardNo;
    }

    /**
     * Sets the value of the inCustCardInfoCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCardInfoCardNo(String value) {
        this.inCustCardInfoCardNo = value;
    }

    /**
     * Gets the value of the inCustCardInfoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustCardInfoStartDate() {
        return inCustCardInfoStartDate;
    }

    /**
     * Sets the value of the inCustCardInfoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustCardInfoStartDate(XMLGregorianCalendar value) {
        this.inCustCardInfoStartDate = value;
    }

    /**
     * Gets the value of the inCustCardInfoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustCardInfoEndDate() {
        return inCustCardInfoEndDate;
    }

    /**
     * Sets the value of the inCustCardInfoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustCardInfoEndDate(XMLGregorianCalendar value) {
        this.inCustCardInfoEndDate = value;
    }

    /**
     * Gets the value of the inCustCardInfoTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustCardInfoTmstamp() {
        return inCustCardInfoTmstamp;
    }

    /**
     * Sets the value of the inCustCardInfoTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustCardInfoTmstamp(XMLGregorianCalendar value) {
        this.inCustCardInfoTmstamp = value;
    }

    /**
     * Gets the value of the inCustCardInfoEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCardInfoEntryStatus() {
        return inCustCardInfoEntryStatus;
    }

    /**
     * Sets the value of the inCustCardInfoEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCardInfoEntryStatus(String value) {
        this.inCustCardInfoEntryStatus = value;
    }

    /**
     * Gets the value of the inCustCardInfoCardComnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCardInfoCardComnts() {
        return inCustCardInfoCardComnts;
    }

    /**
     * Sets the value of the inCustCardInfoCardComnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCardInfoCardComnts(String value) {
        this.inCustCardInfoCardComnts = value;
    }

    /**
     * Gets the value of the inCustCardInfoCardRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCardInfoCardRenewal() {
        return inCustCardInfoCardRenewal;
    }

    /**
     * Sets the value of the inCustCardInfoCardRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCardInfoCardRenewal(String value) {
        this.inCustCardInfoCardRenewal = value;
    }

    /**
     * Gets the value of the inCustCardInfoDisableReasonCom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustCardInfoDisableReasonCom() {
        return inCustCardInfoDisableReasonCom;
    }

    /**
     * Sets the value of the inCustCardInfoDisableReasonCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustCardInfoDisableReasonCom(String value) {
        this.inCustCardInfoDisableReasonCom = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthGrantedIefSuppliedFlag() {
        return inAuthGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthGrantedIefSuppliedFlag(String value) {
        this.inAuthGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDisreasGenericDetailSerialNum property.
     * 
     */
    public int getInDisreasGenericDetailSerialNum() {
        return inDisreasGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDisreasGenericDetailSerialNum property.
     * 
     */
    public void setInDisreasGenericDetailSerialNum(int value) {
        this.inDisreasGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDisreasGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDisreasGenericDetailDescription() {
        return inDisreasGenericDetailDescription;
    }

    /**
     * Sets the value of the inDisreasGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDisreasGenericDetailDescription(String value) {
        this.inDisreasGenericDetailDescription = value;
    }

}
