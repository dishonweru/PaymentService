
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountRepaymentScheduleImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRepaymentScheduleImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpParametersInGrmUnitCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InClientMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InClientMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InInsuranceCustomerIssCommitmentDrAccCustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLoanInstallmentsTrxUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSaveResultsInDbIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "AccountRepaymentScheduleImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGrpParametersInGrmUnitCategoryGenericDetailSerialNum",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inClientMntRecordingAuthorizer1",
    "inClientMntRecordingAuthorizer2",
    "inClientMntRecordingReversalFlag",
    "inClientMntRecordingTerminalNumber",
    "inClientMntRecordingTrxCode",
    "inIefSuppliedCommand",
    "inInsuranceCustomerIssCommitmentDrAccCustomerId",
    "inLoanInstallmentsTrxUser",
    "inSaveResultsInDbIefSuppliedFlag",
    "inTrxJustificIdJustific",
    "inTrxPrftTransactionIdTransact"
})
public class AccountRepaymentScheduleImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGrpParametersInGrmUnitCategoryGenericDetailSerialNum")
    protected int inGrpParametersInGrmUnitCategoryGenericDetailSerialNum;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InClientMntRecordingAuthorizer1")
    protected String inClientMntRecordingAuthorizer1;
    @XmlElement(name = "InClientMntRecordingAuthorizer2")
    protected String inClientMntRecordingAuthorizer2;
    @XmlElement(name = "InClientMntRecordingReversalFlag")
    protected String inClientMntRecordingReversalFlag;
    @XmlElement(name = "InClientMntRecordingTerminalNumber")
    protected String inClientMntRecordingTerminalNumber;
    @XmlElement(name = "InClientMntRecordingTrxCode")
    protected int inClientMntRecordingTrxCode;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InInsuranceCustomerIssCommitmentDrAccCustomerId")
    protected int inInsuranceCustomerIssCommitmentDrAccCustomerId;
    @XmlElement(name = "InLoanInstallmentsTrxUser")
    protected String inLoanInstallmentsTrxUser;
    @XmlElement(name = "InSaveResultsInDbIefSuppliedFlag")
    protected String inSaveResultsInDbIefSuppliedFlag;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInGrpParametersInGrmUnitCategoryGenericDetailSerialNum() {
        return inGrpParametersInGrmUnitCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGrpParametersInGrmUnitCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInGrpParametersInGrmUnitCategoryGenericDetailSerialNum(int value) {
        this.inGrpParametersInGrmUnitCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpParametersInGrmTerminalTerminalNumber() {
        return inGrpParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpParametersInGrmTerminalTerminalNumber(String value) {
        this.inGrpParametersInGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public int getInGrpParametersInGrmTrxCountTrxCounter() {
        return inGrpParametersInGrmTrxCountTrxCounter;
    }

    /**
     * Sets the value of the inGrpParametersInGrmTrxCountTrxCounter property.
     * 
     */
    public void setInGrpParametersInGrmTrxCountTrxCounter(int value) {
        this.inGrpParametersInGrmTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the inClientMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingAuthorizer1() {
        return inClientMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inClientMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingAuthorizer1(String value) {
        this.inClientMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inClientMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingAuthorizer2() {
        return inClientMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inClientMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingAuthorizer2(String value) {
        this.inClientMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inClientMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingReversalFlag() {
        return inClientMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inClientMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingReversalFlag(String value) {
        this.inClientMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inClientMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInClientMntRecordingTerminalNumber() {
        return inClientMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inClientMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInClientMntRecordingTerminalNumber(String value) {
        this.inClientMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inClientMntRecordingTrxCode property.
     * 
     */
    public int getInClientMntRecordingTrxCode() {
        return inClientMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inClientMntRecordingTrxCode property.
     * 
     */
    public void setInClientMntRecordingTrxCode(int value) {
        this.inClientMntRecordingTrxCode = value;
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
     * Gets the value of the inInsuranceCustomerIssCommitmentDrAccCustomerId property.
     * 
     */
    public int getInInsuranceCustomerIssCommitmentDrAccCustomerId() {
        return inInsuranceCustomerIssCommitmentDrAccCustomerId;
    }

    /**
     * Sets the value of the inInsuranceCustomerIssCommitmentDrAccCustomerId property.
     * 
     */
    public void setInInsuranceCustomerIssCommitmentDrAccCustomerId(int value) {
        this.inInsuranceCustomerIssCommitmentDrAccCustomerId = value;
    }

    /**
     * Gets the value of the inLoanInstallmentsTrxUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLoanInstallmentsTrxUser() {
        return inLoanInstallmentsTrxUser;
    }

    /**
     * Sets the value of the inLoanInstallmentsTrxUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLoanInstallmentsTrxUser(String value) {
        this.inLoanInstallmentsTrxUser = value;
    }

    /**
     * Gets the value of the inSaveResultsInDbIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSaveResultsInDbIefSuppliedFlag() {
        return inSaveResultsInDbIefSuppliedFlag;
    }

    /**
     * Sets the value of the inSaveResultsInDbIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSaveResultsInDbIefSuppliedFlag(String value) {
        this.inSaveResultsInDbIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTrxJustificIdJustific property.
     * 
     */
    public int getInTrxJustificIdJustific() {
        return inTrxJustificIdJustific;
    }

    /**
     * Sets the value of the inTrxJustificIdJustific property.
     * 
     */
    public void setInTrxJustificIdJustific(int value) {
        this.inTrxJustificIdJustific = value;
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
