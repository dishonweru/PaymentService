
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0160VOutGrpCustDocsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0160VOutGrpCustDocsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCustDocsOutGrmCustomerDocCmntsEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDocsOutGrmCustomerDocCmntsTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpCustDocsOutGrmCustomerDocCmntsTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpCustDocsOutGrmCustomerDocCmntsTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCustDocsOutGrmSelIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0160VOutGrpCustDocsItem", propOrder = {
    "outGrpCustDocsOutGrmCustomerDocCmntsEntryComments",
    "outGrpCustDocsOutGrmCustomerDocCmntsTrxDate",
    "outGrpCustDocsOutGrmCustomerDocCmntsTrxUnit",
    "outGrpCustDocsOutGrmCustomerDocCmntsTrxUser",
    "outGrpCustDocsOutGrmSelIefSuppliedSelectChar"
})
public class I0160VOutGrpCustDocsItem {

    @XmlElement(name = "OutGrpCustDocsOutGrmCustomerDocCmntsEntryComments")
    protected String outGrpCustDocsOutGrmCustomerDocCmntsEntryComments;
    @XmlElement(name = "OutGrpCustDocsOutGrmCustomerDocCmntsTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpCustDocsOutGrmCustomerDocCmntsTrxDate;
    @XmlElement(name = "OutGrpCustDocsOutGrmCustomerDocCmntsTrxUnit")
    protected int outGrpCustDocsOutGrmCustomerDocCmntsTrxUnit;
    @XmlElement(name = "OutGrpCustDocsOutGrmCustomerDocCmntsTrxUser")
    protected String outGrpCustDocsOutGrmCustomerDocCmntsTrxUser;
    @XmlElement(name = "OutGrpCustDocsOutGrmSelIefSuppliedSelectChar")
    protected String outGrpCustDocsOutGrmSelIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpCustDocsOutGrmCustomerDocCmntsEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDocsOutGrmCustomerDocCmntsEntryComments() {
        return outGrpCustDocsOutGrmCustomerDocCmntsEntryComments;
    }

    /**
     * Sets the value of the outGrpCustDocsOutGrmCustomerDocCmntsEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDocsOutGrmCustomerDocCmntsEntryComments(String value) {
        this.outGrpCustDocsOutGrmCustomerDocCmntsEntryComments = value;
    }

    /**
     * Gets the value of the outGrpCustDocsOutGrmCustomerDocCmntsTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpCustDocsOutGrmCustomerDocCmntsTrxDate() {
        return outGrpCustDocsOutGrmCustomerDocCmntsTrxDate;
    }

    /**
     * Sets the value of the outGrpCustDocsOutGrmCustomerDocCmntsTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpCustDocsOutGrmCustomerDocCmntsTrxDate(XMLGregorianCalendar value) {
        this.outGrpCustDocsOutGrmCustomerDocCmntsTrxDate = value;
    }

    /**
     * Gets the value of the outGrpCustDocsOutGrmCustomerDocCmntsTrxUnit property.
     * 
     */
    public int getOutGrpCustDocsOutGrmCustomerDocCmntsTrxUnit() {
        return outGrpCustDocsOutGrmCustomerDocCmntsTrxUnit;
    }

    /**
     * Sets the value of the outGrpCustDocsOutGrmCustomerDocCmntsTrxUnit property.
     * 
     */
    public void setOutGrpCustDocsOutGrmCustomerDocCmntsTrxUnit(int value) {
        this.outGrpCustDocsOutGrmCustomerDocCmntsTrxUnit = value;
    }

    /**
     * Gets the value of the outGrpCustDocsOutGrmCustomerDocCmntsTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDocsOutGrmCustomerDocCmntsTrxUser() {
        return outGrpCustDocsOutGrmCustomerDocCmntsTrxUser;
    }

    /**
     * Sets the value of the outGrpCustDocsOutGrmCustomerDocCmntsTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDocsOutGrmCustomerDocCmntsTrxUser(String value) {
        this.outGrpCustDocsOutGrmCustomerDocCmntsTrxUser = value;
    }

    /**
     * Gets the value of the outGrpCustDocsOutGrmSelIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCustDocsOutGrmSelIefSuppliedSelectChar() {
        return outGrpCustDocsOutGrmSelIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpCustDocsOutGrmSelIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCustDocsOutGrmSelIefSuppliedSelectChar(String value) {
        this.outGrpCustDocsOutGrmSelIefSuppliedSelectChar = value;
    }

}
