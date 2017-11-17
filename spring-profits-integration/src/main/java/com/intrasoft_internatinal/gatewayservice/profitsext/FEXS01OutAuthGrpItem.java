
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS01OutAuthGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS01OutAuthGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationAvailableDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationBlockTransactExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCheqAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCheqIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCheqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCrInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCrInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationDbInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationDbInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationDebitInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationDepAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationFromCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationFromCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationOverdraftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationPenaltyDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationServicePenaltySpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationSuper1TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationSuper2TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationToCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationToCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAuthGrpOutGrpTeamInformationValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS01OutAuthGrpItem", propOrder = {
    "outAuthGrpOutGrpTeamInformationAccountBenefAddressSn",
    "outAuthGrpOutGrpTeamInformationAccountCobenefSnMail",
    "outAuthGrpOutGrpTeamInformationAccountCode",
    "outAuthGrpOutGrpTeamInformationAccountHomeBranch",
    "outAuthGrpOutGrpTeamInformationAccountPsbSn",
    "outAuthGrpOutGrpTeamInformationAuthorizationResult",
    "outAuthGrpOutGrpTeamInformationAuthorizationType",
    "outAuthGrpOutGrpTeamInformationAvailableDateSpread",
    "outAuthGrpOutGrpTeamInformationBlockTransactExpDate",
    "outAuthGrpOutGrpTeamInformationChargeDiscount",
    "outAuthGrpOutGrpTeamInformationCheqAmount",
    "outAuthGrpOutGrpTeamInformationCheqIssueDate",
    "outAuthGrpOutGrpTeamInformationCheqStatus",
    "outAuthGrpOutGrpTeamInformationCommissionDiscount",
    "outAuthGrpOutGrpTeamInformationCrInterestId",
    "outAuthGrpOutGrpTeamInformationCrInterestPer",
    "outAuthGrpOutGrpTeamInformationCreditInterestRateSpread",
    "outAuthGrpOutGrpTeamInformationCustomerCode",
    "outAuthGrpOutGrpTeamInformationCustomerSurname",
    "outAuthGrpOutGrpTeamInformationDbInterestId",
    "outAuthGrpOutGrpTeamInformationDbInterestPer",
    "outAuthGrpOutGrpTeamInformationDebitInterestRateSpread",
    "outAuthGrpOutGrpTeamInformationDepAccStatus",
    "outAuthGrpOutGrpTeamInformationEncroachTolerance",
    "outAuthGrpOutGrpTeamInformationEvaluationResult",
    "outAuthGrpOutGrpTeamInformationFromCheqCd",
    "outAuthGrpOutGrpTeamInformationFromCheqItemSerialNum",
    "outAuthGrpOutGrpTeamInformationInterestRate",
    "outAuthGrpOutGrpTeamInformationJustificationDescription",
    "outAuthGrpOutGrpTeamInformationJustificationId",
    "outAuthGrpOutGrpTeamInformationOverdraftAmount",
    "outAuthGrpOutGrpTeamInformationOverdraftSpread",
    "outAuthGrpOutGrpTeamInformationPenaltyDiscount",
    "outAuthGrpOutGrpTeamInformationPenaltyRate",
    "outAuthGrpOutGrpTeamInformationProductDescription",
    "outAuthGrpOutGrpTeamInformationProductId",
    "outAuthGrpOutGrpTeamInformationRequiredProfile1",
    "outAuthGrpOutGrpTeamInformationRequiredProfile2",
    "outAuthGrpOutGrpTeamInformationServicePenaltySpread",
    "outAuthGrpOutGrpTeamInformationSuper1Code",
    "outAuthGrpOutGrpTeamInformationSuper1TerminalId",
    "outAuthGrpOutGrpTeamInformationSuper2Code",
    "outAuthGrpOutGrpTeamInformationSuper2TerminalId",
    "outAuthGrpOutGrpTeamInformationToCheqCd",
    "outAuthGrpOutGrpTeamInformationToCheqItemSerialNum",
    "outAuthGrpOutGrpTeamInformationTransactionDescription",
    "outAuthGrpOutGrpTeamInformationTransactionId",
    "outAuthGrpOutGrpTeamInformationTrsAmount",
    "outAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag",
    "outAuthGrpOutGrpTeamInformationUnitCode",
    "outAuthGrpOutGrpTeamInformationUserCode",
    "outAuthGrpOutGrpTeamInformationUserProfile1",
    "outAuthGrpOutGrpTeamInformationUserProfile2",
    "outAuthGrpOutGrpTeamInformationUserProfile3",
    "outAuthGrpOutGrpTeamInformationUserSurname",
    "outAuthGrpOutGrpTeamInformationUserTerminalId",
    "outAuthGrpOutGrpTeamInformationValueDateSpread"
})
public class FEXS01OutAuthGrpItem {

    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAccountBenefAddressSn")
    protected short outAuthGrpOutGrpTeamInformationAccountBenefAddressSn;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAccountCobenefSnMail")
    protected short outAuthGrpOutGrpTeamInformationAccountCobenefSnMail;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAccountCode")
    protected double outAuthGrpOutGrpTeamInformationAccountCode;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAccountHomeBranch")
    protected String outAuthGrpOutGrpTeamInformationAccountHomeBranch;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAccountPsbSn")
    protected int outAuthGrpOutGrpTeamInformationAccountPsbSn;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAuthorizationResult")
    protected String outAuthGrpOutGrpTeamInformationAuthorizationResult;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAuthorizationType")
    protected String outAuthGrpOutGrpTeamInformationAuthorizationType;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationAvailableDateSpread")
    protected short outAuthGrpOutGrpTeamInformationAvailableDateSpread;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationBlockTransactExpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAuthGrpOutGrpTeamInformationBlockTransactExpDate;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationChargeDiscount", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationChargeDiscount;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCheqAmount", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationCheqAmount;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCheqIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAuthGrpOutGrpTeamInformationCheqIssueDate;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCheqStatus")
    protected String outAuthGrpOutGrpTeamInformationCheqStatus;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationCommissionDiscount;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCrInterestId")
    protected int outAuthGrpOutGrpTeamInformationCrInterestId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCrInterestPer", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationCrInterestPer;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCustomerCode")
    protected int outAuthGrpOutGrpTeamInformationCustomerCode;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationCustomerSurname")
    protected String outAuthGrpOutGrpTeamInformationCustomerSurname;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationDbInterestId")
    protected int outAuthGrpOutGrpTeamInformationDbInterestId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationDbInterestPer", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationDbInterestPer;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationDebitInterestRateSpread", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationDebitInterestRateSpread;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationDepAccStatus")
    protected String outAuthGrpOutGrpTeamInformationDepAccStatus;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationEncroachTolerance", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationEncroachTolerance;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationEvaluationResult")
    protected String outAuthGrpOutGrpTeamInformationEvaluationResult;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationFromCheqCd")
    protected short outAuthGrpOutGrpTeamInformationFromCheqCd;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationFromCheqItemSerialNum")
    protected double outAuthGrpOutGrpTeamInformationFromCheqItemSerialNum;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationInterestRate", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationInterestRate;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationJustificationDescription")
    protected String outAuthGrpOutGrpTeamInformationJustificationDescription;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationJustificationId")
    protected int outAuthGrpOutGrpTeamInformationJustificationId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationOverdraftAmount", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationOverdraftAmount;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationOverdraftSpread", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationOverdraftSpread;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationPenaltyDiscount", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationPenaltyDiscount;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationPenaltyRate", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationPenaltyRate;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationProductDescription")
    protected String outAuthGrpOutGrpTeamInformationProductDescription;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationProductId")
    protected int outAuthGrpOutGrpTeamInformationProductId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationRequiredProfile1")
    protected String outAuthGrpOutGrpTeamInformationRequiredProfile1;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationRequiredProfile2")
    protected String outAuthGrpOutGrpTeamInformationRequiredProfile2;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationServicePenaltySpread", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationServicePenaltySpread;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationSuper1Code")
    protected String outAuthGrpOutGrpTeamInformationSuper1Code;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationSuper1TerminalId")
    protected String outAuthGrpOutGrpTeamInformationSuper1TerminalId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationSuper2Code")
    protected String outAuthGrpOutGrpTeamInformationSuper2Code;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationSuper2TerminalId")
    protected String outAuthGrpOutGrpTeamInformationSuper2TerminalId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationToCheqCd")
    protected short outAuthGrpOutGrpTeamInformationToCheqCd;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationToCheqItemSerialNum")
    protected double outAuthGrpOutGrpTeamInformationToCheqItemSerialNum;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationTransactionDescription")
    protected String outAuthGrpOutGrpTeamInformationTransactionDescription;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationTransactionId")
    protected int outAuthGrpOutGrpTeamInformationTransactionId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationTrsAmount", required = true)
    protected BigDecimal outAuthGrpOutGrpTeamInformationTrsAmount;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag")
    protected String outAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUnitCode")
    protected int outAuthGrpOutGrpTeamInformationUnitCode;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUserCode")
    protected String outAuthGrpOutGrpTeamInformationUserCode;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUserProfile1")
    protected String outAuthGrpOutGrpTeamInformationUserProfile1;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUserProfile2")
    protected String outAuthGrpOutGrpTeamInformationUserProfile2;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUserProfile3")
    protected String outAuthGrpOutGrpTeamInformationUserProfile3;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUserSurname")
    protected String outAuthGrpOutGrpTeamInformationUserSurname;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationUserTerminalId")
    protected String outAuthGrpOutGrpTeamInformationUserTerminalId;
    @XmlElement(name = "OutAuthGrpOutGrpTeamInformationValueDateSpread")
    protected short outAuthGrpOutGrpTeamInformationValueDateSpread;

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAccountBenefAddressSn property.
     * 
     */
    public short getOutAuthGrpOutGrpTeamInformationAccountBenefAddressSn() {
        return outAuthGrpOutGrpTeamInformationAccountBenefAddressSn;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAccountBenefAddressSn property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationAccountBenefAddressSn(short value) {
        this.outAuthGrpOutGrpTeamInformationAccountBenefAddressSn = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAccountCobenefSnMail property.
     * 
     */
    public short getOutAuthGrpOutGrpTeamInformationAccountCobenefSnMail() {
        return outAuthGrpOutGrpTeamInformationAccountCobenefSnMail;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAccountCobenefSnMail property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationAccountCobenefSnMail(short value) {
        this.outAuthGrpOutGrpTeamInformationAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAccountCode property.
     * 
     */
    public double getOutAuthGrpOutGrpTeamInformationAccountCode() {
        return outAuthGrpOutGrpTeamInformationAccountCode;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAccountCode property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationAccountCode(double value) {
        this.outAuthGrpOutGrpTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationAccountHomeBranch() {
        return outAuthGrpOutGrpTeamInformationAccountHomeBranch;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationAccountHomeBranch(String value) {
        this.outAuthGrpOutGrpTeamInformationAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAccountPsbSn property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationAccountPsbSn() {
        return outAuthGrpOutGrpTeamInformationAccountPsbSn;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAccountPsbSn property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationAccountPsbSn(int value) {
        this.outAuthGrpOutGrpTeamInformationAccountPsbSn = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationAuthorizationResult() {
        return outAuthGrpOutGrpTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationAuthorizationResult(String value) {
        this.outAuthGrpOutGrpTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationAuthorizationType() {
        return outAuthGrpOutGrpTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationAuthorizationType(String value) {
        this.outAuthGrpOutGrpTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationAvailableDateSpread property.
     * 
     */
    public short getOutAuthGrpOutGrpTeamInformationAvailableDateSpread() {
        return outAuthGrpOutGrpTeamInformationAvailableDateSpread;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationAvailableDateSpread property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationAvailableDateSpread(short value) {
        this.outAuthGrpOutGrpTeamInformationAvailableDateSpread = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationBlockTransactExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAuthGrpOutGrpTeamInformationBlockTransactExpDate() {
        return outAuthGrpOutGrpTeamInformationBlockTransactExpDate;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationBlockTransactExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationBlockTransactExpDate(XMLGregorianCalendar value) {
        this.outAuthGrpOutGrpTeamInformationBlockTransactExpDate = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationChargeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationChargeDiscount() {
        return outAuthGrpOutGrpTeamInformationChargeDiscount;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationChargeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationChargeDiscount(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationChargeDiscount = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCheqAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationCheqAmount() {
        return outAuthGrpOutGrpTeamInformationCheqAmount;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCheqAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCheqAmount(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationCheqAmount = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCheqIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAuthGrpOutGrpTeamInformationCheqIssueDate() {
        return outAuthGrpOutGrpTeamInformationCheqIssueDate;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCheqIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCheqIssueDate(XMLGregorianCalendar value) {
        this.outAuthGrpOutGrpTeamInformationCheqIssueDate = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCheqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationCheqStatus() {
        return outAuthGrpOutGrpTeamInformationCheqStatus;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCheqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCheqStatus(String value) {
        this.outAuthGrpOutGrpTeamInformationCheqStatus = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationCommissionDiscount() {
        return outAuthGrpOutGrpTeamInformationCommissionDiscount;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCommissionDiscount(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationCommissionDiscount = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCrInterestId property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationCrInterestId() {
        return outAuthGrpOutGrpTeamInformationCrInterestId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCrInterestId property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationCrInterestId(int value) {
        this.outAuthGrpOutGrpTeamInformationCrInterestId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCrInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationCrInterestPer() {
        return outAuthGrpOutGrpTeamInformationCrInterestPer;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCrInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCrInterestPer(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationCrInterestPer = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCreditInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationCreditInterestRateSpread() {
        return outAuthGrpOutGrpTeamInformationCreditInterestRateSpread;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCreditInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCreditInterestRateSpread(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationCreditInterestRateSpread = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCustomerCode property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationCustomerCode() {
        return outAuthGrpOutGrpTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCustomerCode property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationCustomerCode(int value) {
        this.outAuthGrpOutGrpTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationCustomerSurname() {
        return outAuthGrpOutGrpTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationCustomerSurname(String value) {
        this.outAuthGrpOutGrpTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationDbInterestId property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationDbInterestId() {
        return outAuthGrpOutGrpTeamInformationDbInterestId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationDbInterestId property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationDbInterestId(int value) {
        this.outAuthGrpOutGrpTeamInformationDbInterestId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationDbInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationDbInterestPer() {
        return outAuthGrpOutGrpTeamInformationDbInterestPer;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationDbInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationDbInterestPer(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationDbInterestPer = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationDebitInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationDebitInterestRateSpread() {
        return outAuthGrpOutGrpTeamInformationDebitInterestRateSpread;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationDebitInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationDebitInterestRateSpread(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationDebitInterestRateSpread = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationDepAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationDepAccStatus() {
        return outAuthGrpOutGrpTeamInformationDepAccStatus;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationDepAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationDepAccStatus(String value) {
        this.outAuthGrpOutGrpTeamInformationDepAccStatus = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationEncroachTolerance() {
        return outAuthGrpOutGrpTeamInformationEncroachTolerance;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationEncroachTolerance(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationEncroachTolerance = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationEvaluationResult() {
        return outAuthGrpOutGrpTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationEvaluationResult(String value) {
        this.outAuthGrpOutGrpTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationFromCheqCd property.
     * 
     */
    public short getOutAuthGrpOutGrpTeamInformationFromCheqCd() {
        return outAuthGrpOutGrpTeamInformationFromCheqCd;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationFromCheqCd property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationFromCheqCd(short value) {
        this.outAuthGrpOutGrpTeamInformationFromCheqCd = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public double getOutAuthGrpOutGrpTeamInformationFromCheqItemSerialNum() {
        return outAuthGrpOutGrpTeamInformationFromCheqItemSerialNum;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationFromCheqItemSerialNum(double value) {
        this.outAuthGrpOutGrpTeamInformationFromCheqItemSerialNum = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationInterestRate() {
        return outAuthGrpOutGrpTeamInformationInterestRate;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationInterestRate(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationInterestRate = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationJustificationDescription() {
        return outAuthGrpOutGrpTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationJustificationDescription(String value) {
        this.outAuthGrpOutGrpTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationJustificationId property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationJustificationId() {
        return outAuthGrpOutGrpTeamInformationJustificationId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationJustificationId property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationJustificationId(int value) {
        this.outAuthGrpOutGrpTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationOverdraftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationOverdraftAmount() {
        return outAuthGrpOutGrpTeamInformationOverdraftAmount;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationOverdraftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationOverdraftAmount(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationOverdraftAmount = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationOverdraftSpread() {
        return outAuthGrpOutGrpTeamInformationOverdraftSpread;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationOverdraftSpread(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationOverdraftSpread = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationPenaltyDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationPenaltyDiscount() {
        return outAuthGrpOutGrpTeamInformationPenaltyDiscount;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationPenaltyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationPenaltyDiscount(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationPenaltyDiscount = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationPenaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationPenaltyRate() {
        return outAuthGrpOutGrpTeamInformationPenaltyRate;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationPenaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationPenaltyRate(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationPenaltyRate = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationProductDescription() {
        return outAuthGrpOutGrpTeamInformationProductDescription;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationProductDescription(String value) {
        this.outAuthGrpOutGrpTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationProductId property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationProductId() {
        return outAuthGrpOutGrpTeamInformationProductId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationProductId property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationProductId(int value) {
        this.outAuthGrpOutGrpTeamInformationProductId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationRequiredProfile1() {
        return outAuthGrpOutGrpTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationRequiredProfile1(String value) {
        this.outAuthGrpOutGrpTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationRequiredProfile2() {
        return outAuthGrpOutGrpTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationRequiredProfile2(String value) {
        this.outAuthGrpOutGrpTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationServicePenaltySpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationServicePenaltySpread() {
        return outAuthGrpOutGrpTeamInformationServicePenaltySpread;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationServicePenaltySpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationServicePenaltySpread(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationServicePenaltySpread = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationSuper1Code() {
        return outAuthGrpOutGrpTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationSuper1Code(String value) {
        this.outAuthGrpOutGrpTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationSuper1TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationSuper1TerminalId() {
        return outAuthGrpOutGrpTeamInformationSuper1TerminalId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationSuper1TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationSuper1TerminalId(String value) {
        this.outAuthGrpOutGrpTeamInformationSuper1TerminalId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationSuper2Code() {
        return outAuthGrpOutGrpTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationSuper2Code(String value) {
        this.outAuthGrpOutGrpTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationSuper2TerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationSuper2TerminalId() {
        return outAuthGrpOutGrpTeamInformationSuper2TerminalId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationSuper2TerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationSuper2TerminalId(String value) {
        this.outAuthGrpOutGrpTeamInformationSuper2TerminalId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationToCheqCd property.
     * 
     */
    public short getOutAuthGrpOutGrpTeamInformationToCheqCd() {
        return outAuthGrpOutGrpTeamInformationToCheqCd;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationToCheqCd property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationToCheqCd(short value) {
        this.outAuthGrpOutGrpTeamInformationToCheqCd = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationToCheqItemSerialNum property.
     * 
     */
    public double getOutAuthGrpOutGrpTeamInformationToCheqItemSerialNum() {
        return outAuthGrpOutGrpTeamInformationToCheqItemSerialNum;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationToCheqItemSerialNum property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationToCheqItemSerialNum(double value) {
        this.outAuthGrpOutGrpTeamInformationToCheqItemSerialNum = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationTransactionDescription() {
        return outAuthGrpOutGrpTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationTransactionDescription(String value) {
        this.outAuthGrpOutGrpTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationTransactionId property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationTransactionId() {
        return outAuthGrpOutGrpTeamInformationTransactionId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationTransactionId property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationTransactionId(int value) {
        this.outAuthGrpOutGrpTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationTrsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAuthGrpOutGrpTeamInformationTrsAmount() {
        return outAuthGrpOutGrpTeamInformationTrsAmount;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationTrsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationTrsAmount(BigDecimal value) {
        this.outAuthGrpOutGrpTeamInformationTrsAmount = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag() {
        return outAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag(String value) {
        this.outAuthGrpOutGrpTeamInformationUnclearWithdrawalFlag = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUnitCode property.
     * 
     */
    public int getOutAuthGrpOutGrpTeamInformationUnitCode() {
        return outAuthGrpOutGrpTeamInformationUnitCode;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUnitCode property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationUnitCode(int value) {
        this.outAuthGrpOutGrpTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUserCode() {
        return outAuthGrpOutGrpTeamInformationUserCode;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUserCode(String value) {
        this.outAuthGrpOutGrpTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUserProfile1() {
        return outAuthGrpOutGrpTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUserProfile1(String value) {
        this.outAuthGrpOutGrpTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUserProfile2() {
        return outAuthGrpOutGrpTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUserProfile2(String value) {
        this.outAuthGrpOutGrpTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUserProfile3() {
        return outAuthGrpOutGrpTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUserProfile3(String value) {
        this.outAuthGrpOutGrpTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUserSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUserSurname() {
        return outAuthGrpOutGrpTeamInformationUserSurname;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUserSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUserSurname(String value) {
        this.outAuthGrpOutGrpTeamInformationUserSurname = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAuthGrpOutGrpTeamInformationUserTerminalId() {
        return outAuthGrpOutGrpTeamInformationUserTerminalId;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAuthGrpOutGrpTeamInformationUserTerminalId(String value) {
        this.outAuthGrpOutGrpTeamInformationUserTerminalId = value;
    }

    /**
     * Gets the value of the outAuthGrpOutGrpTeamInformationValueDateSpread property.
     * 
     */
    public short getOutAuthGrpOutGrpTeamInformationValueDateSpread() {
        return outAuthGrpOutGrpTeamInformationValueDateSpread;
    }

    /**
     * Sets the value of the outAuthGrpOutGrpTeamInformationValueDateSpread property.
     * 
     */
    public void setOutAuthGrpOutGrpTeamInformationValueDateSpread(short value) {
        this.outAuthGrpOutGrpTeamInformationValueDateSpread = value;
    }

}
