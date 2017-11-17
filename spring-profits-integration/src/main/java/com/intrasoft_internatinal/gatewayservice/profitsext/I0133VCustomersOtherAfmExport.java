
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0133VCustomersOtherAfmExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0133VCustomersOtherAfmExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyOtherCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyOtherCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutResidentCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServerStatusReturnFromSrv" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0133VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSameAfm" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0133VOutGrpSameAfmItem" minOccurs="0"/>
 *         &lt;element name="OutListGrp1" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0133VOutListGrp1Item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0133VCustomersOtherAfmExport", propOrder = {
    "outCustListSetDescription",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outKeyCustomerCDigit",
    "outKeyCustomerCustId",
    "outKeyOtherCustomerCDigit",
    "outKeyOtherCustomerCustId",
    "outResidentCustomerNonResident",
    "outServerStatusReturnFromSrv",
    "outGrpLog",
    "outGrpSameAfm",
    "outListGrp1"
})
public class I0133VCustomersOtherAfmExport
    extends BaseExport
{

    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutKeyCustomerCDigit")
    protected short outKeyCustomerCDigit;
    @XmlElement(name = "OutKeyCustomerCustId")
    protected int outKeyCustomerCustId;
    @XmlElement(name = "OutKeyOtherCustomerCDigit")
    protected short outKeyOtherCustomerCDigit;
    @XmlElement(name = "OutKeyOtherCustomerCustId")
    protected int outKeyOtherCustomerCustId;
    @XmlElement(name = "OutResidentCustomerNonResident")
    protected String outResidentCustomerNonResident;
    @XmlElement(name = "OutServerStatusReturnFromSrv")
    protected short outServerStatusReturnFromSrv;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfI0133VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutGrpSameAfm")
    protected ArrayOfI0133VOutGrpSameAfmItem outGrpSameAfm;
    @XmlElement(name = "OutListGrp1")
    protected ArrayOfI0133VOutListGrp1Item outListGrp1;

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFirstName() {
        return outCustomerFirstName;
    }

    /**
     * Sets the value of the outCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFirstName(String value) {
        this.outCustomerFirstName = value;
    }

    /**
     * Gets the value of the outCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSurname() {
        return outCustomerSurname;
    }

    /**
     * Sets the value of the outCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSurname(String value) {
        this.outCustomerSurname = value;
    }

    /**
     * Gets the value of the outKeyCustomerCDigit property.
     * 
     */
    public short getOutKeyCustomerCDigit() {
        return outKeyCustomerCDigit;
    }

    /**
     * Sets the value of the outKeyCustomerCDigit property.
     * 
     */
    public void setOutKeyCustomerCDigit(short value) {
        this.outKeyCustomerCDigit = value;
    }

    /**
     * Gets the value of the outKeyCustomerCustId property.
     * 
     */
    public int getOutKeyCustomerCustId() {
        return outKeyCustomerCustId;
    }

    /**
     * Sets the value of the outKeyCustomerCustId property.
     * 
     */
    public void setOutKeyCustomerCustId(int value) {
        this.outKeyCustomerCustId = value;
    }

    /**
     * Gets the value of the outKeyOtherCustomerCDigit property.
     * 
     */
    public short getOutKeyOtherCustomerCDigit() {
        return outKeyOtherCustomerCDigit;
    }

    /**
     * Sets the value of the outKeyOtherCustomerCDigit property.
     * 
     */
    public void setOutKeyOtherCustomerCDigit(short value) {
        this.outKeyOtherCustomerCDigit = value;
    }

    /**
     * Gets the value of the outKeyOtherCustomerCustId property.
     * 
     */
    public int getOutKeyOtherCustomerCustId() {
        return outKeyOtherCustomerCustId;
    }

    /**
     * Sets the value of the outKeyOtherCustomerCustId property.
     * 
     */
    public void setOutKeyOtherCustomerCustId(int value) {
        this.outKeyOtherCustomerCustId = value;
    }

    /**
     * Gets the value of the outResidentCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResidentCustomerNonResident() {
        return outResidentCustomerNonResident;
    }

    /**
     * Sets the value of the outResidentCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResidentCustomerNonResident(String value) {
        this.outResidentCustomerNonResident = value;
    }

    /**
     * Gets the value of the outServerStatusReturnFromSrv property.
     * 
     */
    public short getOutServerStatusReturnFromSrv() {
        return outServerStatusReturnFromSrv;
    }

    /**
     * Sets the value of the outServerStatusReturnFromSrv property.
     * 
     */
    public void setOutServerStatusReturnFromSrv(short value) {
        this.outServerStatusReturnFromSrv = value;
    }

    /**
     * Gets the value of the outGrpLog property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0133VOutGrpLogItem }
     *     
     */
    public ArrayOfI0133VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0133VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfI0133VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpSameAfm property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0133VOutGrpSameAfmItem }
     *     
     */
    public ArrayOfI0133VOutGrpSameAfmItem getOutGrpSameAfm() {
        return outGrpSameAfm;
    }

    /**
     * Sets the value of the outGrpSameAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0133VOutGrpSameAfmItem }
     *     
     */
    public void setOutGrpSameAfm(ArrayOfI0133VOutGrpSameAfmItem value) {
        this.outGrpSameAfm = value;
    }

    /**
     * Gets the value of the outListGrp1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0133VOutListGrp1Item }
     *     
     */
    public ArrayOfI0133VOutListGrp1Item getOutListGrp1() {
        return outListGrp1;
    }

    /**
     * Sets the value of the outListGrp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0133VOutListGrp1Item }
     *     
     */
    public void setOutListGrp1(ArrayOfI0133VOutListGrp1Item value) {
        this.outListGrp1 = value;
    }

}
