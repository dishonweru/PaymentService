
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0130VCustomerCategoriesListImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0130VCustomerCategoriesListImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfI0130VInListGrpItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0130VCustomerCategoriesListImport", propOrder = {
    "command",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inDefaultCategoryCategoryCode",
    "inIefSuppliedCommand",
    "inIefSuppliedFlag",
    "inJustificIdJustific",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inListGrp"
})
public class I0130VCustomerCategoriesListImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InDefaultCategoryCategoryCode")
    protected String inDefaultCategoryCategoryCode;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InIefSuppliedFlag")
    protected String inIefSuppliedFlag;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InListGrp")
    protected ArrayOfI0130VInListGrpItem inListGrp;

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
     * Gets the value of the inDefaultCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultCategoryCategoryCode() {
        return inDefaultCategoryCategoryCode;
    }

    /**
     * Sets the value of the inDefaultCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultCategoryCategoryCode(String value) {
        this.inDefaultCategoryCategoryCode = value;
    }

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
     * Gets the value of the inListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfI0130VInListGrpItem }
     *     
     */
    public ArrayOfI0130VInListGrpItem getInListGrp() {
        return inListGrp;
    }

    /**
     * Sets the value of the inListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfI0130VInListGrpItem }
     *     
     */
    public void setInListGrp(ArrayOfI0130VInListGrpItem value) {
        this.inListGrp = value;
    }

}
