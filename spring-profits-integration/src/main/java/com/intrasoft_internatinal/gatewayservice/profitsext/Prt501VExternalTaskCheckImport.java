
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prt501VExternalTaskCheckImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prt501VExternalTaskCheckImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessExtTaskSendExtTaskId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InProcessExtTaskSendExtTaskDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InProcessExtTaskSendAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProcessExtTaskSendAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessExtTaskSendCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProcessExtTaskSendCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InProcessProfitsExtTaskAskSendByProfits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prt501VExternalTaskCheckImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inProcessExtTaskSendExtTaskId",
    "inProcessExtTaskSendExtTaskDt",
    "inProcessExtTaskSendAccountNumber",
    "inProcessExtTaskSendAccountCd",
    "inProcessExtTaskSendCustId",
    "inProcessExtTaskSendCDigit",
    "inProcessProfitsExtTaskAskSendByProfits",
    "inTrxTerminalTerminalNumber"
})
public class Prt501VExternalTaskCheckImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InProcessExtTaskSendExtTaskId")
    protected double inProcessExtTaskSendExtTaskId;
    @XmlElement(name = "InProcessExtTaskSendExtTaskDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProcessExtTaskSendExtTaskDt;
    @XmlElement(name = "InProcessExtTaskSendAccountNumber")
    protected String inProcessExtTaskSendAccountNumber;
    @XmlElement(name = "InProcessExtTaskSendAccountCd")
    protected short inProcessExtTaskSendAccountCd;
    @XmlElement(name = "InProcessExtTaskSendCustId")
    protected int inProcessExtTaskSendCustId;
    @XmlElement(name = "InProcessExtTaskSendCDigit")
    protected short inProcessExtTaskSendCDigit;
    @XmlElement(name = "InProcessProfitsExtTaskAskSendByProfits")
    protected String inProcessProfitsExtTaskAskSendByProfits;
    @XmlElement(name = "InTrxTerminalTerminalNumber")
    protected String inTrxTerminalTerminalNumber;

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
     * Gets the value of the inProcessExtTaskSendExtTaskId property.
     * 
     */
    public double getInProcessExtTaskSendExtTaskId() {
        return inProcessExtTaskSendExtTaskId;
    }

    /**
     * Sets the value of the inProcessExtTaskSendExtTaskId property.
     * 
     */
    public void setInProcessExtTaskSendExtTaskId(double value) {
        this.inProcessExtTaskSendExtTaskId = value;
    }

    /**
     * Gets the value of the inProcessExtTaskSendExtTaskDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProcessExtTaskSendExtTaskDt() {
        return inProcessExtTaskSendExtTaskDt;
    }

    /**
     * Sets the value of the inProcessExtTaskSendExtTaskDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProcessExtTaskSendExtTaskDt(XMLGregorianCalendar value) {
        this.inProcessExtTaskSendExtTaskDt = value;
    }

    /**
     * Gets the value of the inProcessExtTaskSendAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessExtTaskSendAccountNumber() {
        return inProcessExtTaskSendAccountNumber;
    }

    /**
     * Sets the value of the inProcessExtTaskSendAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessExtTaskSendAccountNumber(String value) {
        this.inProcessExtTaskSendAccountNumber = value;
    }

    /**
     * Gets the value of the inProcessExtTaskSendAccountCd property.
     * 
     */
    public short getInProcessExtTaskSendAccountCd() {
        return inProcessExtTaskSendAccountCd;
    }

    /**
     * Sets the value of the inProcessExtTaskSendAccountCd property.
     * 
     */
    public void setInProcessExtTaskSendAccountCd(short value) {
        this.inProcessExtTaskSendAccountCd = value;
    }

    /**
     * Gets the value of the inProcessExtTaskSendCustId property.
     * 
     */
    public int getInProcessExtTaskSendCustId() {
        return inProcessExtTaskSendCustId;
    }

    /**
     * Sets the value of the inProcessExtTaskSendCustId property.
     * 
     */
    public void setInProcessExtTaskSendCustId(int value) {
        this.inProcessExtTaskSendCustId = value;
    }

    /**
     * Gets the value of the inProcessExtTaskSendCDigit property.
     * 
     */
    public short getInProcessExtTaskSendCDigit() {
        return inProcessExtTaskSendCDigit;
    }

    /**
     * Sets the value of the inProcessExtTaskSendCDigit property.
     * 
     */
    public void setInProcessExtTaskSendCDigit(short value) {
        this.inProcessExtTaskSendCDigit = value;
    }

    /**
     * Gets the value of the inProcessProfitsExtTaskAskSendByProfits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProcessProfitsExtTaskAskSendByProfits() {
        return inProcessProfitsExtTaskAskSendByProfits;
    }

    /**
     * Sets the value of the inProcessProfitsExtTaskAskSendByProfits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProcessProfitsExtTaskAskSendByProfits(String value) {
        this.inProcessProfitsExtTaskAskSendByProfits = value;
    }

    /**
     * Gets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxTerminalTerminalNumber() {
        return inTrxTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inTrxTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxTerminalTerminalNumber(String value) {
        this.inTrxTerminalTerminalNumber = value;
    }

}
