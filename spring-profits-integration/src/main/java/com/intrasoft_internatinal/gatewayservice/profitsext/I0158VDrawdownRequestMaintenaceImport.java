
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0158VDrawdownRequestMaintenaceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0158VDrawdownRequestMaintenaceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InKeyCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InForUpdateCustomerApplicationCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InForUpdateCustomerApplicationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InForUpdateCustomerApplicationApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForUpdateCustomerApplicationApplicationSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InForUpdateCustomerApplicationConfirmCmnts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In5NewApplicationsIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In4FinalizedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In3RejectedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In2DrawdownIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In1AllIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCreateDtToCustomerApplicationRequestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCreateDtFromCustomerApplicationRequestDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InUnitToCustomerApplicationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUnitFromCustomerApplicationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerToCustomerApplicationCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerFromCustomerApplicationCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRequestAmountToCustomerApplicationRequestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRequestAmountFromCustomerApplicationRequestAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InContinueCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InFirstTimeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0158VDrawdownRequestMaintenaceImport", propOrder = {
    "command",
    "inJustificIdJustific",
    "inProductIdProduct",
    "inAuthGrantedIefSuppliedFlag",
    "inKeyCustomerCustId",
    "inForUpdateCustomerApplicationCustId",
    "inForUpdateCustomerApplicationUnitCode",
    "inForUpdateCustomerApplicationApplicationId",
    "inForUpdateCustomerApplicationApplicationSts",
    "inForUpdateCustomerApplicationConfirmCmnts",
    "in5NewApplicationsIefSuppliedFlag",
    "in4FinalizedIefSuppliedFlag",
    "in3RejectedIefSuppliedFlag",
    "in2DrawdownIefSuppliedFlag",
    "in1AllIefSuppliedFlag",
    "inCreateDtToCustomerApplicationRequestDt",
    "inCreateDtFromCustomerApplicationRequestDt",
    "inUnitToCustomerApplicationUnitCode",
    "inUnitFromCustomerApplicationUnitCode",
    "inCustomerToCustomerApplicationCustId",
    "inCustomerFromCustomerApplicationCustId",
    "inRequestAmountToCustomerApplicationRequestAmn",
    "inRequestAmountFromCustomerApplicationRequestAmn",
    "inContinueCustomerApplicationInternalSn",
    "inFirstTimeIefSuppliedFlag",
    "inCommandIefSuppliedCommand",
    "inTrxPrftTransactionIdTransact"
})
public class I0158VDrawdownRequestMaintenaceImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;
    @XmlElement(name = "InKeyCustomerCustId")
    protected int inKeyCustomerCustId;
    @XmlElement(name = "InForUpdateCustomerApplicationCustId")
    protected int inForUpdateCustomerApplicationCustId;
    @XmlElement(name = "InForUpdateCustomerApplicationUnitCode")
    protected int inForUpdateCustomerApplicationUnitCode;
    @XmlElement(name = "InForUpdateCustomerApplicationApplicationId")
    protected String inForUpdateCustomerApplicationApplicationId;
    @XmlElement(name = "InForUpdateCustomerApplicationApplicationSts")
    protected String inForUpdateCustomerApplicationApplicationSts;
    @XmlElement(name = "InForUpdateCustomerApplicationConfirmCmnts")
    protected String inForUpdateCustomerApplicationConfirmCmnts;
    @XmlElement(name = "In5NewApplicationsIefSuppliedFlag")
    protected String in5NewApplicationsIefSuppliedFlag;
    @XmlElement(name = "In4FinalizedIefSuppliedFlag")
    protected String in4FinalizedIefSuppliedFlag;
    @XmlElement(name = "In3RejectedIefSuppliedFlag")
    protected String in3RejectedIefSuppliedFlag;
    @XmlElement(name = "In2DrawdownIefSuppliedFlag")
    protected String in2DrawdownIefSuppliedFlag;
    @XmlElement(name = "In1AllIefSuppliedFlag")
    protected String in1AllIefSuppliedFlag;
    @XmlElement(name = "InCreateDtToCustomerApplicationRequestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreateDtToCustomerApplicationRequestDt;
    @XmlElement(name = "InCreateDtFromCustomerApplicationRequestDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCreateDtFromCustomerApplicationRequestDt;
    @XmlElement(name = "InUnitToCustomerApplicationUnitCode")
    protected int inUnitToCustomerApplicationUnitCode;
    @XmlElement(name = "InUnitFromCustomerApplicationUnitCode")
    protected int inUnitFromCustomerApplicationUnitCode;
    @XmlElement(name = "InCustomerToCustomerApplicationCustId")
    protected int inCustomerToCustomerApplicationCustId;
    @XmlElement(name = "InCustomerFromCustomerApplicationCustId")
    protected int inCustomerFromCustomerApplicationCustId;
    @XmlElement(name = "InRequestAmountToCustomerApplicationRequestAmn", required = true)
    protected BigDecimal inRequestAmountToCustomerApplicationRequestAmn;
    @XmlElement(name = "InRequestAmountFromCustomerApplicationRequestAmn", required = true)
    protected BigDecimal inRequestAmountFromCustomerApplicationRequestAmn;
    @XmlElement(name = "InContinueCustomerApplicationInternalSn")
    protected double inContinueCustomerApplicationInternalSn;
    @XmlElement(name = "InFirstTimeIefSuppliedFlag")
    protected String inFirstTimeIefSuppliedFlag;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;

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
     * Gets the value of the inKeyCustomerCustId property.
     * 
     */
    public int getInKeyCustomerCustId() {
        return inKeyCustomerCustId;
    }

    /**
     * Sets the value of the inKeyCustomerCustId property.
     * 
     */
    public void setInKeyCustomerCustId(int value) {
        this.inKeyCustomerCustId = value;
    }

    /**
     * Gets the value of the inForUpdateCustomerApplicationCustId property.
     * 
     */
    public int getInForUpdateCustomerApplicationCustId() {
        return inForUpdateCustomerApplicationCustId;
    }

    /**
     * Sets the value of the inForUpdateCustomerApplicationCustId property.
     * 
     */
    public void setInForUpdateCustomerApplicationCustId(int value) {
        this.inForUpdateCustomerApplicationCustId = value;
    }

    /**
     * Gets the value of the inForUpdateCustomerApplicationUnitCode property.
     * 
     */
    public int getInForUpdateCustomerApplicationUnitCode() {
        return inForUpdateCustomerApplicationUnitCode;
    }

    /**
     * Sets the value of the inForUpdateCustomerApplicationUnitCode property.
     * 
     */
    public void setInForUpdateCustomerApplicationUnitCode(int value) {
        this.inForUpdateCustomerApplicationUnitCode = value;
    }

    /**
     * Gets the value of the inForUpdateCustomerApplicationApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForUpdateCustomerApplicationApplicationId() {
        return inForUpdateCustomerApplicationApplicationId;
    }

    /**
     * Sets the value of the inForUpdateCustomerApplicationApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForUpdateCustomerApplicationApplicationId(String value) {
        this.inForUpdateCustomerApplicationApplicationId = value;
    }

    /**
     * Gets the value of the inForUpdateCustomerApplicationApplicationSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForUpdateCustomerApplicationApplicationSts() {
        return inForUpdateCustomerApplicationApplicationSts;
    }

    /**
     * Sets the value of the inForUpdateCustomerApplicationApplicationSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForUpdateCustomerApplicationApplicationSts(String value) {
        this.inForUpdateCustomerApplicationApplicationSts = value;
    }

    /**
     * Gets the value of the inForUpdateCustomerApplicationConfirmCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInForUpdateCustomerApplicationConfirmCmnts() {
        return inForUpdateCustomerApplicationConfirmCmnts;
    }

    /**
     * Sets the value of the inForUpdateCustomerApplicationConfirmCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInForUpdateCustomerApplicationConfirmCmnts(String value) {
        this.inForUpdateCustomerApplicationConfirmCmnts = value;
    }

    /**
     * Gets the value of the in5NewApplicationsIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn5NewApplicationsIefSuppliedFlag() {
        return in5NewApplicationsIefSuppliedFlag;
    }

    /**
     * Sets the value of the in5NewApplicationsIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn5NewApplicationsIefSuppliedFlag(String value) {
        this.in5NewApplicationsIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the in4FinalizedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn4FinalizedIefSuppliedFlag() {
        return in4FinalizedIefSuppliedFlag;
    }

    /**
     * Sets the value of the in4FinalizedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn4FinalizedIefSuppliedFlag(String value) {
        this.in4FinalizedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the in3RejectedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn3RejectedIefSuppliedFlag() {
        return in3RejectedIefSuppliedFlag;
    }

    /**
     * Sets the value of the in3RejectedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn3RejectedIefSuppliedFlag(String value) {
        this.in3RejectedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the in2DrawdownIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn2DrawdownIefSuppliedFlag() {
        return in2DrawdownIefSuppliedFlag;
    }

    /**
     * Sets the value of the in2DrawdownIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn2DrawdownIefSuppliedFlag(String value) {
        this.in2DrawdownIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the in1AllIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIn1AllIefSuppliedFlag() {
        return in1AllIefSuppliedFlag;
    }

    /**
     * Sets the value of the in1AllIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIn1AllIefSuppliedFlag(String value) {
        this.in1AllIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCreateDtToCustomerApplicationRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreateDtToCustomerApplicationRequestDt() {
        return inCreateDtToCustomerApplicationRequestDt;
    }

    /**
     * Sets the value of the inCreateDtToCustomerApplicationRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreateDtToCustomerApplicationRequestDt(XMLGregorianCalendar value) {
        this.inCreateDtToCustomerApplicationRequestDt = value;
    }

    /**
     * Gets the value of the inCreateDtFromCustomerApplicationRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCreateDtFromCustomerApplicationRequestDt() {
        return inCreateDtFromCustomerApplicationRequestDt;
    }

    /**
     * Sets the value of the inCreateDtFromCustomerApplicationRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCreateDtFromCustomerApplicationRequestDt(XMLGregorianCalendar value) {
        this.inCreateDtFromCustomerApplicationRequestDt = value;
    }

    /**
     * Gets the value of the inUnitToCustomerApplicationUnitCode property.
     * 
     */
    public int getInUnitToCustomerApplicationUnitCode() {
        return inUnitToCustomerApplicationUnitCode;
    }

    /**
     * Sets the value of the inUnitToCustomerApplicationUnitCode property.
     * 
     */
    public void setInUnitToCustomerApplicationUnitCode(int value) {
        this.inUnitToCustomerApplicationUnitCode = value;
    }

    /**
     * Gets the value of the inUnitFromCustomerApplicationUnitCode property.
     * 
     */
    public int getInUnitFromCustomerApplicationUnitCode() {
        return inUnitFromCustomerApplicationUnitCode;
    }

    /**
     * Sets the value of the inUnitFromCustomerApplicationUnitCode property.
     * 
     */
    public void setInUnitFromCustomerApplicationUnitCode(int value) {
        this.inUnitFromCustomerApplicationUnitCode = value;
    }

    /**
     * Gets the value of the inCustomerToCustomerApplicationCustId property.
     * 
     */
    public int getInCustomerToCustomerApplicationCustId() {
        return inCustomerToCustomerApplicationCustId;
    }

    /**
     * Sets the value of the inCustomerToCustomerApplicationCustId property.
     * 
     */
    public void setInCustomerToCustomerApplicationCustId(int value) {
        this.inCustomerToCustomerApplicationCustId = value;
    }

    /**
     * Gets the value of the inCustomerFromCustomerApplicationCustId property.
     * 
     */
    public int getInCustomerFromCustomerApplicationCustId() {
        return inCustomerFromCustomerApplicationCustId;
    }

    /**
     * Sets the value of the inCustomerFromCustomerApplicationCustId property.
     * 
     */
    public void setInCustomerFromCustomerApplicationCustId(int value) {
        this.inCustomerFromCustomerApplicationCustId = value;
    }

    /**
     * Gets the value of the inRequestAmountToCustomerApplicationRequestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRequestAmountToCustomerApplicationRequestAmn() {
        return inRequestAmountToCustomerApplicationRequestAmn;
    }

    /**
     * Sets the value of the inRequestAmountToCustomerApplicationRequestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRequestAmountToCustomerApplicationRequestAmn(BigDecimal value) {
        this.inRequestAmountToCustomerApplicationRequestAmn = value;
    }

    /**
     * Gets the value of the inRequestAmountFromCustomerApplicationRequestAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRequestAmountFromCustomerApplicationRequestAmn() {
        return inRequestAmountFromCustomerApplicationRequestAmn;
    }

    /**
     * Sets the value of the inRequestAmountFromCustomerApplicationRequestAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRequestAmountFromCustomerApplicationRequestAmn(BigDecimal value) {
        this.inRequestAmountFromCustomerApplicationRequestAmn = value;
    }

    /**
     * Gets the value of the inContinueCustomerApplicationInternalSn property.
     * 
     */
    public double getInContinueCustomerApplicationInternalSn() {
        return inContinueCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the inContinueCustomerApplicationInternalSn property.
     * 
     */
    public void setInContinueCustomerApplicationInternalSn(double value) {
        this.inContinueCustomerApplicationInternalSn = value;
    }

    /**
     * Gets the value of the inFirstTimeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFirstTimeIefSuppliedFlag() {
        return inFirstTimeIefSuppliedFlag;
    }

    /**
     * Sets the value of the inFirstTimeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFirstTimeIefSuppliedFlag(String value) {
        this.inFirstTimeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

}
