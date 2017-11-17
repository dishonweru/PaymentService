
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DGR0001V_UserTransactionDiaryImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DGR0001V_UserTransactionDiaryImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InTransidIefSuppliedCounter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InTakeUserTransactionDiaryTraCounter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDateUserTransactionDiaryTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUserTransactionDiaryTraRecordMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DGR0001V_UserTransactionDiaryImport", propOrder = {
    "inTransidIefSuppliedCounter",
    "inTakeUserTransactionDiaryTraCounter",
    "inDateUserTransactionDiaryTrxDate",
    "inUserTransactionDiaryTraRecordMethod"
})
public class DGR0001VUserTransactionDiaryImport
    extends BaseImport
{

    @XmlElement(name = "InTransidIefSuppliedCounter")
    protected double inTransidIefSuppliedCounter;
    @XmlElement(name = "InTakeUserTransactionDiaryTraCounter")
    protected double inTakeUserTransactionDiaryTraCounter;
    @XmlElement(name = "InDateUserTransactionDiaryTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateUserTransactionDiaryTrxDate;
    @XmlElement(name = "InUserTransactionDiaryTraRecordMethod")
    protected String inUserTransactionDiaryTraRecordMethod;

    /**
     * Gets the value of the inTransidIefSuppliedCounter property.
     * 
     */
    public double getInTransidIefSuppliedCounter() {
        return inTransidIefSuppliedCounter;
    }

    /**
     * Sets the value of the inTransidIefSuppliedCounter property.
     * 
     */
    public void setInTransidIefSuppliedCounter(double value) {
        this.inTransidIefSuppliedCounter = value;
    }

    /**
     * Gets the value of the inTakeUserTransactionDiaryTraCounter property.
     * 
     */
    public double getInTakeUserTransactionDiaryTraCounter() {
        return inTakeUserTransactionDiaryTraCounter;
    }

    /**
     * Sets the value of the inTakeUserTransactionDiaryTraCounter property.
     * 
     */
    public void setInTakeUserTransactionDiaryTraCounter(double value) {
        this.inTakeUserTransactionDiaryTraCounter = value;
    }

    /**
     * Gets the value of the inDateUserTransactionDiaryTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateUserTransactionDiaryTrxDate() {
        return inDateUserTransactionDiaryTrxDate;
    }

    /**
     * Sets the value of the inDateUserTransactionDiaryTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateUserTransactionDiaryTrxDate(XMLGregorianCalendar value) {
        this.inDateUserTransactionDiaryTrxDate = value;
    }

    /**
     * Gets the value of the inUserTransactionDiaryTraRecordMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUserTransactionDiaryTraRecordMethod() {
        return inUserTransactionDiaryTraRecordMethod;
    }

    /**
     * Sets the value of the inUserTransactionDiaryTraRecordMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUserTransactionDiaryTraRecordMethod(String value) {
        this.inUserTransactionDiaryTraRecordMethod = value;
    }

}
