
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0117VCustomersOtherIdExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0117VCustomersOtherIdExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutKeyCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutKeyOtherCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutKeyOtherCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServerStatusReturnFromSrv" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpLog" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0117VOutGrpLogItem" minOccurs="0"/>
 *         &lt;element name="OutGrpSameId" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0117VOutGrpSameIdItem" minOccurs="0"/>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0117VOutListGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0117VCustomersOtherIdExport", propOrder = {
    "outCustListSetDescription",
    "outCustomerDateOfBirth",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outKeyCustomerCDigit",
    "outKeyCustomerCustId",
    "outKeyOtherCustomerCDigit",
    "outKeyOtherCustomerCustId",
    "outServerStatusReturnFromSrv",
    "outGrpLog",
    "outGrpSameId",
    "outListGrp"
})
public class I0117VCustomersOtherIdExport
    extends BaseExport
{

    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustomerDateOfBirth;
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
    @XmlElement(name = "OutServerStatusReturnFromSrv")
    protected short outServerStatusReturnFromSrv;
    @XmlElement(name = "OutGrpLog")
    protected ArrayOfI0117VOutGrpLogItem outGrpLog;
    @XmlElement(name = "OutGrpSameId")
    protected ArrayOfI0117VOutGrpSameIdItem outGrpSameId;
    @XmlElement(name = "OutListGrp")
    protected ArrayOfI0117VOutListGrpItem outListGrp;

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
     * Gets the value of the outCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustomerDateOfBirth() {
        return outCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outCustomerDateOfBirth = value;
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
     *     {@link ArrayOfI0117VOutGrpLogItem }
     *     
     */
    public ArrayOfI0117VOutGrpLogItem getOutGrpLog() {
        return outGrpLog;
    }

    /**
     * Sets the value of the outGrpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0117VOutGrpLogItem }
     *     
     */
    public void setOutGrpLog(ArrayOfI0117VOutGrpLogItem value) {
        this.outGrpLog = value;
    }

    /**
     * Gets the value of the outGrpSameId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0117VOutGrpSameIdItem }
     *     
     */
    public ArrayOfI0117VOutGrpSameIdItem getOutGrpSameId() {
        return outGrpSameId;
    }

    /**
     * Sets the value of the outGrpSameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0117VOutGrpSameIdItem }
     *     
     */
    public void setOutGrpSameId(ArrayOfI0117VOutGrpSameIdItem value) {
        this.outGrpSameId = value;
    }

    /**
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0117VOutListGrpItem }
     *     
     */
    public ArrayOfI0117VOutListGrpItem getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0117VOutListGrpItem }
     *     
     */
    public void setOutListGrp(ArrayOfI0117VOutListGrpItem value) {
        this.outListGrp = value;
    }

}
