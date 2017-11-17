
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerPositionAndDrawdownExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPositionAndDrawdownExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OurErrorCustomerApplicationRequestForecast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBillGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutPositionBillGrp" minOccurs="0"/>
 *         &lt;element name="OutConfirmCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutConfirmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutConfirmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutConfirmCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutContinueCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutContinueCustomerApplicationInternalSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutContinueSearchCustPositionEntrySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutContinueSearchCustPositionTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCreatedTmstampSearchCustPositionTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMarketingReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupAvailableIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupCustGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupCustGroupGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupGenericLimitLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupGenericLimitUsedLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrmSearchCustPosition" minOccurs="0"/>
 *         &lt;element name="OutGrpAccBalTotals" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAccBalTotalsCustPosition" minOccurs="0"/>
 *         &lt;element name="OutGrpApplication" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpApplicationCustPosition" minOccurs="0"/>
 *         &lt;element name="OutGrpBill" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpBillCustPosition" minOccurs="0"/>
 *         &lt;element name="OutGrpShares" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpSharesCustPosition" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIncludeAccsAsCobenefIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIncludeAccsOfGrpCompanyIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutResultApplicationCustomerApplicationApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedAgrProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedAgrProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedAgrProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedAgrProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedLoanProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSelectedProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutThinkingCurCurrencyDisplayedDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutThinkingCurCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutThinkingCurCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutThinkingCurCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalAvailableIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpApplicDetails" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpApplicDetailsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPositionAndDrawdownExport", propOrder = {
    "ourErrorCustomerApplicationRequestForecast",
    "outBillGrp",
    "outConfirmCustListSetDescription",
    "outConfirmCustomerCDigit",
    "outConfirmCustomerCustId",
    "outConfirmCustomerCustType",
    "outContinueCustomerCustId",
    "outContinueCustomerApplicationInternalSn",
    "outContinueSearchCustPositionEntrySn",
    "outContinueSearchCustPositionTmstamp",
    "outCreatedTmstampSearchCustPositionTmstamp",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerFirstName",
    "outCustomerMarketingReminder",
    "outCustomerSurname",
    "outGroupAvailableIefSuppliedAmount",
    "outGroupCustGroupDescription",
    "outGroupCustGroupGroupId",
    "outGroupGenericLimitLimitAmn",
    "outGroupGenericLimitUsedLimitAmn",
    "outGroupLimitCurrencyShortDescr",
    "outGrp",
    "outGrpAccBalTotals",
    "outGrpApplication",
    "outGrpBill",
    "outGrpShares",
    "outIefSuppliedFlag",
    "outIncludeAccsAsCobenefIefSuppliedFlag",
    "outIncludeAccsOfGrpCompanyIefSuppliedFlag",
    "outListSetDescription",
    "outResultApplicationCustomerApplicationApplicationId",
    "outSelectedAgrProfitsAccountAccountCd",
    "outSelectedAgrProfitsAccountAccountNumber",
    "outSelectedAgrProfitsAccountCDigit",
    "outSelectedAgrProfitsAccountCustId",
    "outSelectedAgrProfitsAccountMonotoringUnit",
    "outSelectedAgrProfitsAccountPrftSystem",
    "outSelectedLoanProfitsAccountAccStatus",
    "outSelectedLoanProfitsAccountAccountCd",
    "outSelectedLoanProfitsAccountAccountNumber",
    "outSelectedLoanProfitsAccountAgrMembershipSn",
    "outSelectedLoanProfitsAccountAgrSn",
    "outSelectedLoanProfitsAccountAgrUnit",
    "outSelectedLoanProfitsAccountAgrYear",
    "outSelectedLoanProfitsAccountCDigit",
    "outSelectedLoanProfitsAccountCustId",
    "outSelectedLoanProfitsAccountDepAccNumber",
    "outSelectedLoanProfitsAccountDepOpenUnit",
    "outSelectedLoanProfitsAccountLgAccSn",
    "outSelectedLoanProfitsAccountLgOpenUnit",
    "outSelectedLoanProfitsAccountLimitCurrency",
    "outSelectedLoanProfitsAccountLnsOpenUnit",
    "outSelectedLoanProfitsAccountLnsSn",
    "outSelectedLoanProfitsAccountLnsType",
    "outSelectedLoanProfitsAccountMonotoringUnit",
    "outSelectedLoanProfitsAccountMovementCurrency",
    "outSelectedLoanProfitsAccountPrftSystem",
    "outSelectedLoanProfitsAccountProductId",
    "outSelectedLoanProfitsAccountTrOpenUnit",
    "outSelectedLoanProfitsAccountTrSn",
    "outSelectedLoanProfitsAccountTrType",
    "outSelectedProfitsAccountAccStatus",
    "outSelectedProfitsAccountAccountCd",
    "outSelectedProfitsAccountAccountNumber",
    "outSelectedProfitsAccountAgrMembershipSn",
    "outSelectedProfitsAccountAgrSn",
    "outSelectedProfitsAccountAgrUnit",
    "outSelectedProfitsAccountAgrYear",
    "outSelectedProfitsAccountCDigit",
    "outSelectedProfitsAccountCustId",
    "outSelectedProfitsAccountDepAccNumber",
    "outSelectedProfitsAccountDepOpenUnit",
    "outSelectedProfitsAccountLgAccSn",
    "outSelectedProfitsAccountLgOpenUnit",
    "outSelectedProfitsAccountLimitCurrency",
    "outSelectedProfitsAccountLnsOpenUnit",
    "outSelectedProfitsAccountLnsSn",
    "outSelectedProfitsAccountLnsType",
    "outSelectedProfitsAccountMonotoringUnit",
    "outSelectedProfitsAccountMovementCurrency",
    "outSelectedProfitsAccountPrftSystem",
    "outSelectedProfitsAccountProductId",
    "outSelectedProfitsAccountTrOpenUnit",
    "outSelectedProfitsAccountTrSn",
    "outSelectedProfitsAccountTrType",
    "outThinkingCurCurrencyDisplayedDecimalPlaces",
    "outThinkingCurCurrencyIdCurrency",
    "outThinkingCurCurrencyNationalFlag",
    "outThinkingCurCurrencyShortDescr",
    "outTotalAvailableIefSuppliedAmount",
    "outGrpApplicDetails"
})
public class CustomerPositionAndDrawdownExport
    extends BaseExport
{

    @XmlElement(name = "OurErrorCustomerApplicationRequestForecast")
    protected String ourErrorCustomerApplicationRequestForecast;
    @XmlElement(name = "OutBillGrp")
    protected ArrayOfOutPositionBillGrp outBillGrp;
    @XmlElement(name = "OutConfirmCustListSetDescription")
    protected String outConfirmCustListSetDescription;
    @XmlElement(name = "OutConfirmCustomerCDigit")
    protected short outConfirmCustomerCDigit;
    @XmlElement(name = "OutConfirmCustomerCustId")
    protected int outConfirmCustomerCustId;
    @XmlElement(name = "OutConfirmCustomerCustType")
    protected String outConfirmCustomerCustType;
    @XmlElement(name = "OutContinueCustomerCustId")
    protected int outContinueCustomerCustId;
    @XmlElement(name = "OutContinueCustomerApplicationInternalSn")
    protected double outContinueCustomerApplicationInternalSn;
    @XmlElement(name = "OutContinueSearchCustPositionEntrySn")
    protected int outContinueSearchCustPositionEntrySn;
    @XmlElement(name = "OutContinueSearchCustPositionTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outContinueSearchCustPositionTmstamp;
    @XmlElement(name = "OutCreatedTmstampSearchCustPositionTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCreatedTmstampSearchCustPositionTmstamp;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerMarketingReminder")
    protected String outCustomerMarketingReminder;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutGroupAvailableIefSuppliedAmount", required = true)
    protected BigDecimal outGroupAvailableIefSuppliedAmount;
    @XmlElement(name = "OutGroupCustGroupDescription")
    protected String outGroupCustGroupDescription;
    @XmlElement(name = "OutGroupCustGroupGroupId")
    protected int outGroupCustGroupGroupId;
    @XmlElement(name = "OutGroupGenericLimitLimitAmn", required = true)
    protected BigDecimal outGroupGenericLimitLimitAmn;
    @XmlElement(name = "OutGroupGenericLimitUsedLimitAmn", required = true)
    protected BigDecimal outGroupGenericLimitUsedLimitAmn;
    @XmlElement(name = "OutGroupLimitCurrencyShortDescr")
    protected String outGroupLimitCurrencyShortDescr;
    @XmlElement(name = "OutGrp")
    protected ArrayOfOutGrmSearchCustPosition outGrp;
    @XmlElement(name = "OutGrpAccBalTotals")
    protected ArrayOfOutGrpAccBalTotalsCustPosition outGrpAccBalTotals;
    @XmlElement(name = "OutGrpApplication")
    protected ArrayOfOutGrpApplicationCustPosition outGrpApplication;
    @XmlElement(name = "OutGrpBill")
    protected ArrayOfOutGrpBillCustPosition outGrpBill;
    @XmlElement(name = "OutGrpShares")
    protected ArrayOfOutGrpSharesCustPosition outGrpShares;
    @XmlElement(name = "OutIefSuppliedFlag")
    protected String outIefSuppliedFlag;
    @XmlElement(name = "OutIncludeAccsAsCobenefIefSuppliedFlag")
    protected String outIncludeAccsAsCobenefIefSuppliedFlag;
    @XmlElement(name = "OutIncludeAccsOfGrpCompanyIefSuppliedFlag")
    protected String outIncludeAccsOfGrpCompanyIefSuppliedFlag;
    @XmlElement(name = "OutListSetDescription")
    protected String outListSetDescription;
    @XmlElement(name = "OutResultApplicationCustomerApplicationApplicationId")
    protected String outResultApplicationCustomerApplicationApplicationId;
    @XmlElement(name = "OutSelectedAgrProfitsAccountAccountCd")
    protected short outSelectedAgrProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedAgrProfitsAccountAccountNumber")
    protected String outSelectedAgrProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedAgrProfitsAccountCDigit")
    protected short outSelectedAgrProfitsAccountCDigit;
    @XmlElement(name = "OutSelectedAgrProfitsAccountCustId")
    protected int outSelectedAgrProfitsAccountCustId;
    @XmlElement(name = "OutSelectedAgrProfitsAccountMonotoringUnit")
    protected int outSelectedAgrProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedAgrProfitsAccountPrftSystem")
    protected short outSelectedAgrProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAccStatus")
    protected String outSelectedLoanProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAccountCd")
    protected short outSelectedLoanProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAccountNumber")
    protected String outSelectedLoanProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAgrMembershipSn")
    protected int outSelectedLoanProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAgrSn")
    protected int outSelectedLoanProfitsAccountAgrSn;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAgrUnit")
    protected int outSelectedLoanProfitsAccountAgrUnit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountAgrYear")
    protected short outSelectedLoanProfitsAccountAgrYear;
    @XmlElement(name = "OutSelectedLoanProfitsAccountCDigit")
    protected short outSelectedLoanProfitsAccountCDigit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountCustId")
    protected int outSelectedLoanProfitsAccountCustId;
    @XmlElement(name = "OutSelectedLoanProfitsAccountDepAccNumber")
    protected double outSelectedLoanProfitsAccountDepAccNumber;
    @XmlElement(name = "OutSelectedLoanProfitsAccountDepOpenUnit")
    protected int outSelectedLoanProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountLgAccSn")
    protected double outSelectedLoanProfitsAccountLgAccSn;
    @XmlElement(name = "OutSelectedLoanProfitsAccountLgOpenUnit")
    protected int outSelectedLoanProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountLimitCurrency")
    protected int outSelectedLoanProfitsAccountLimitCurrency;
    @XmlElement(name = "OutSelectedLoanProfitsAccountLnsOpenUnit")
    protected int outSelectedLoanProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountLnsSn")
    protected int outSelectedLoanProfitsAccountLnsSn;
    @XmlElement(name = "OutSelectedLoanProfitsAccountLnsType")
    protected short outSelectedLoanProfitsAccountLnsType;
    @XmlElement(name = "OutSelectedLoanProfitsAccountMonotoringUnit")
    protected int outSelectedLoanProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountMovementCurrency")
    protected int outSelectedLoanProfitsAccountMovementCurrency;
    @XmlElement(name = "OutSelectedLoanProfitsAccountPrftSystem")
    protected short outSelectedLoanProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedLoanProfitsAccountProductId")
    protected int outSelectedLoanProfitsAccountProductId;
    @XmlElement(name = "OutSelectedLoanProfitsAccountTrOpenUnit")
    protected int outSelectedLoanProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutSelectedLoanProfitsAccountTrSn")
    protected int outSelectedLoanProfitsAccountTrSn;
    @XmlElement(name = "OutSelectedLoanProfitsAccountTrType")
    protected short outSelectedLoanProfitsAccountTrType;
    @XmlElement(name = "OutSelectedProfitsAccountAccStatus")
    protected String outSelectedProfitsAccountAccStatus;
    @XmlElement(name = "OutSelectedProfitsAccountAccountCd")
    protected short outSelectedProfitsAccountAccountCd;
    @XmlElement(name = "OutSelectedProfitsAccountAccountNumber")
    protected String outSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "OutSelectedProfitsAccountAgrMembershipSn")
    protected int outSelectedProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutSelectedProfitsAccountAgrSn")
    protected int outSelectedProfitsAccountAgrSn;
    @XmlElement(name = "OutSelectedProfitsAccountAgrUnit")
    protected int outSelectedProfitsAccountAgrUnit;
    @XmlElement(name = "OutSelectedProfitsAccountAgrYear")
    protected short outSelectedProfitsAccountAgrYear;
    @XmlElement(name = "OutSelectedProfitsAccountCDigit")
    protected short outSelectedProfitsAccountCDigit;
    @XmlElement(name = "OutSelectedProfitsAccountCustId")
    protected int outSelectedProfitsAccountCustId;
    @XmlElement(name = "OutSelectedProfitsAccountDepAccNumber")
    protected double outSelectedProfitsAccountDepAccNumber;
    @XmlElement(name = "OutSelectedProfitsAccountDepOpenUnit")
    protected int outSelectedProfitsAccountDepOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLgAccSn")
    protected double outSelectedProfitsAccountLgAccSn;
    @XmlElement(name = "OutSelectedProfitsAccountLgOpenUnit")
    protected int outSelectedProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLimitCurrency")
    protected int outSelectedProfitsAccountLimitCurrency;
    @XmlElement(name = "OutSelectedProfitsAccountLnsOpenUnit")
    protected int outSelectedProfitsAccountLnsOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountLnsSn")
    protected int outSelectedProfitsAccountLnsSn;
    @XmlElement(name = "OutSelectedProfitsAccountLnsType")
    protected short outSelectedProfitsAccountLnsType;
    @XmlElement(name = "OutSelectedProfitsAccountMonotoringUnit")
    protected int outSelectedProfitsAccountMonotoringUnit;
    @XmlElement(name = "OutSelectedProfitsAccountMovementCurrency")
    protected int outSelectedProfitsAccountMovementCurrency;
    @XmlElement(name = "OutSelectedProfitsAccountPrftSystem")
    protected short outSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "OutSelectedProfitsAccountProductId")
    protected int outSelectedProfitsAccountProductId;
    @XmlElement(name = "OutSelectedProfitsAccountTrOpenUnit")
    protected int outSelectedProfitsAccountTrOpenUnit;
    @XmlElement(name = "OutSelectedProfitsAccountTrSn")
    protected int outSelectedProfitsAccountTrSn;
    @XmlElement(name = "OutSelectedProfitsAccountTrType")
    protected short outSelectedProfitsAccountTrType;
    @XmlElement(name = "OutThinkingCurCurrencyDisplayedDecimalPlaces")
    protected short outThinkingCurCurrencyDisplayedDecimalPlaces;
    @XmlElement(name = "OutThinkingCurCurrencyIdCurrency")
    protected int outThinkingCurCurrencyIdCurrency;
    @XmlElement(name = "OutThinkingCurCurrencyNationalFlag")
    protected String outThinkingCurCurrencyNationalFlag;
    @XmlElement(name = "OutThinkingCurCurrencyShortDescr")
    protected String outThinkingCurCurrencyShortDescr;
    @XmlElement(name = "OutTotalAvailableIefSuppliedAmount", required = true)
    protected BigDecimal outTotalAvailableIefSuppliedAmount;
    @XmlElement(name = "OutGrpApplicDetails")
    protected ArrayOfOutGrpApplicDetailsItem outGrpApplicDetails;

    /**
     * Gets the value of the ourErrorCustomerApplicationRequestForecast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurErrorCustomerApplicationRequestForecast() {
        return ourErrorCustomerApplicationRequestForecast;
    }

    /**
     * Sets the value of the ourErrorCustomerApplicationRequestForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurErrorCustomerApplicationRequestForecast(String value) {
        this.ourErrorCustomerApplicationRequestForecast = value;
    }

    /**
     * Gets the value of the outBillGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutPositionBillGrp }
     *     
     */
    public ArrayOfOutPositionBillGrp getOutBillGrp() {
        return outBillGrp;
    }

    /**
     * Sets the value of the outBillGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutPositionBillGrp }
     *     
     */
    public void setOutBillGrp(ArrayOfOutPositionBillGrp value) {
        this.outBillGrp = value;
    }

    /**
     * Gets the value of the outConfirmCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConfirmCustListSetDescription() {
        return outConfirmCustListSetDescription;
    }

    /**
     * Sets the value of the outConfirmCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConfirmCustListSetDescription(String value) {
        this.outConfirmCustListSetDescription = value;
    }

    /**
     * Gets the value of the outConfirmCustomerCDigit property.
     * 
     */
    public short getOutConfirmCustomerCDigit() {
        return outConfirmCustomerCDigit;
    }

    /**
     * Sets the value of the outConfirmCustomerCDigit property.
     * 
     */
    public void setOutConfirmCustomerCDigit(short value) {
        this.outConfirmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outConfirmCustomerCustId property.
     * 
     */
    public int getOutConfirmCustomerCustId() {
        return outConfirmCustomerCustId;
    }

    /**
     * Sets the value of the outConfirmCustomerCustId property.
     * 
     */
    public void setOutConfirmCustomerCustId(int value) {
        this.outConfirmCustomerCustId = value;
    }

    /**
     * Gets the value of the outConfirmCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConfirmCustomerCustType() {
        return outConfirmCustomerCustType;
    }

    /**
     * Sets the value of the outConfirmCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConfirmCustomerCustType(String value) {
        this.outConfirmCustomerCustType = value;
    }

    /**
     * Gets the value of the outContinueCustomerCustId property.
     * 
     */
    public int getOutContinueCustomerCustId() {
        return outContinueCustomerCustId;
    }

    /**
     * Sets the value of the outContinueCustomerCustId property.
     * 
     */
    public void setOutContinueCustomerCustId(int value) {
        this.outContinueCustomerCustId = value;
    }

    /**
     * Gets the value of the outContinueCustomerApplicationInternalSn property.
     * 
     */
    public double getOutContinueCustomerApplicationInternalSn() {
        return outContinueCustomerApplicationInternalSn;
    }

    /**
     * Sets the value of the outContinueCustomerApplicationInternalSn property.
     * 
     */
    public void setOutContinueCustomerApplicationInternalSn(double value) {
        this.outContinueCustomerApplicationInternalSn = value;
    }

    /**
     * Gets the value of the outContinueSearchCustPositionEntrySn property.
     * 
     */
    public int getOutContinueSearchCustPositionEntrySn() {
        return outContinueSearchCustPositionEntrySn;
    }

    /**
     * Sets the value of the outContinueSearchCustPositionEntrySn property.
     * 
     */
    public void setOutContinueSearchCustPositionEntrySn(int value) {
        this.outContinueSearchCustPositionEntrySn = value;
    }

    /**
     * Gets the value of the outContinueSearchCustPositionTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutContinueSearchCustPositionTmstamp() {
        return outContinueSearchCustPositionTmstamp;
    }

    /**
     * Sets the value of the outContinueSearchCustPositionTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutContinueSearchCustPositionTmstamp(XMLGregorianCalendar value) {
        this.outContinueSearchCustPositionTmstamp = value;
    }

    /**
     * Gets the value of the outCreatedTmstampSearchCustPositionTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCreatedTmstampSearchCustPositionTmstamp() {
        return outCreatedTmstampSearchCustPositionTmstamp;
    }

    /**
     * Sets the value of the outCreatedTmstampSearchCustPositionTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCreatedTmstampSearchCustPositionTmstamp(XMLGregorianCalendar value) {
        this.outCreatedTmstampSearchCustPositionTmstamp = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
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
     * Gets the value of the outCustomerMarketingReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMarketingReminder() {
        return outCustomerMarketingReminder;
    }

    /**
     * Sets the value of the outCustomerMarketingReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMarketingReminder(String value) {
        this.outCustomerMarketingReminder = value;
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
     * Gets the value of the outGroupAvailableIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupAvailableIefSuppliedAmount() {
        return outGroupAvailableIefSuppliedAmount;
    }

    /**
     * Sets the value of the outGroupAvailableIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupAvailableIefSuppliedAmount(BigDecimal value) {
        this.outGroupAvailableIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGroupCustGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupCustGroupDescription() {
        return outGroupCustGroupDescription;
    }

    /**
     * Sets the value of the outGroupCustGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupCustGroupDescription(String value) {
        this.outGroupCustGroupDescription = value;
    }

    /**
     * Gets the value of the outGroupCustGroupGroupId property.
     * 
     */
    public int getOutGroupCustGroupGroupId() {
        return outGroupCustGroupGroupId;
    }

    /**
     * Sets the value of the outGroupCustGroupGroupId property.
     * 
     */
    public void setOutGroupCustGroupGroupId(int value) {
        this.outGroupCustGroupGroupId = value;
    }

    /**
     * Gets the value of the outGroupGenericLimitLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupGenericLimitLimitAmn() {
        return outGroupGenericLimitLimitAmn;
    }

    /**
     * Sets the value of the outGroupGenericLimitLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupGenericLimitLimitAmn(BigDecimal value) {
        this.outGroupGenericLimitLimitAmn = value;
    }

    /**
     * Gets the value of the outGroupGenericLimitUsedLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupGenericLimitUsedLimitAmn() {
        return outGroupGenericLimitUsedLimitAmn;
    }

    /**
     * Sets the value of the outGroupGenericLimitUsedLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupGenericLimitUsedLimitAmn(BigDecimal value) {
        this.outGroupGenericLimitUsedLimitAmn = value;
    }

    /**
     * Gets the value of the outGroupLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupLimitCurrencyShortDescr() {
        return outGroupLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGroupLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupLimitCurrencyShortDescr(String value) {
        this.outGroupLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrmSearchCustPosition }
     *     
     */
    public ArrayOfOutGrmSearchCustPosition getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrmSearchCustPosition }
     *     
     */
    public void setOutGrp(ArrayOfOutGrmSearchCustPosition value) {
        this.outGrp = value;
    }

    /**
     * Gets the value of the outGrpAccBalTotals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAccBalTotalsCustPosition }
     *     
     */
    public ArrayOfOutGrpAccBalTotalsCustPosition getOutGrpAccBalTotals() {
        return outGrpAccBalTotals;
    }

    /**
     * Sets the value of the outGrpAccBalTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAccBalTotalsCustPosition }
     *     
     */
    public void setOutGrpAccBalTotals(ArrayOfOutGrpAccBalTotalsCustPosition value) {
        this.outGrpAccBalTotals = value;
    }

    /**
     * Gets the value of the outGrpApplication property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpApplicationCustPosition }
     *     
     */
    public ArrayOfOutGrpApplicationCustPosition getOutGrpApplication() {
        return outGrpApplication;
    }

    /**
     * Sets the value of the outGrpApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpApplicationCustPosition }
     *     
     */
    public void setOutGrpApplication(ArrayOfOutGrpApplicationCustPosition value) {
        this.outGrpApplication = value;
    }

    /**
     * Gets the value of the outGrpBill property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpBillCustPosition }
     *     
     */
    public ArrayOfOutGrpBillCustPosition getOutGrpBill() {
        return outGrpBill;
    }

    /**
     * Sets the value of the outGrpBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpBillCustPosition }
     *     
     */
    public void setOutGrpBill(ArrayOfOutGrpBillCustPosition value) {
        this.outGrpBill = value;
    }

    /**
     * Gets the value of the outGrpShares property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpSharesCustPosition }
     *     
     */
    public ArrayOfOutGrpSharesCustPosition getOutGrpShares() {
        return outGrpShares;
    }

    /**
     * Sets the value of the outGrpShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpSharesCustPosition }
     *     
     */
    public void setOutGrpShares(ArrayOfOutGrpSharesCustPosition value) {
        this.outGrpShares = value;
    }

    /**
     * Gets the value of the outIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedFlag() {
        return outIefSuppliedFlag;
    }

    /**
     * Sets the value of the outIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedFlag(String value) {
        this.outIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outIncludeAccsAsCobenefIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIncludeAccsAsCobenefIefSuppliedFlag() {
        return outIncludeAccsAsCobenefIefSuppliedFlag;
    }

    /**
     * Sets the value of the outIncludeAccsAsCobenefIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIncludeAccsAsCobenefIefSuppliedFlag(String value) {
        this.outIncludeAccsAsCobenefIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outIncludeAccsOfGrpCompanyIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIncludeAccsOfGrpCompanyIefSuppliedFlag() {
        return outIncludeAccsOfGrpCompanyIefSuppliedFlag;
    }

    /**
     * Sets the value of the outIncludeAccsOfGrpCompanyIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIncludeAccsOfGrpCompanyIefSuppliedFlag(String value) {
        this.outIncludeAccsOfGrpCompanyIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListSetDescription() {
        return outListSetDescription;
    }

    /**
     * Sets the value of the outListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListSetDescription(String value) {
        this.outListSetDescription = value;
    }

    /**
     * Gets the value of the outResultApplicationCustomerApplicationApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutResultApplicationCustomerApplicationApplicationId() {
        return outResultApplicationCustomerApplicationApplicationId;
    }

    /**
     * Sets the value of the outResultApplicationCustomerApplicationApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutResultApplicationCustomerApplicationApplicationId(String value) {
        this.outResultApplicationCustomerApplicationApplicationId = value;
    }

    /**
     * Gets the value of the outSelectedAgrProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedAgrProfitsAccountAccountCd() {
        return outSelectedAgrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedAgrProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedAgrProfitsAccountAccountCd(short value) {
        this.outSelectedAgrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedAgrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedAgrProfitsAccountAccountNumber() {
        return outSelectedAgrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedAgrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedAgrProfitsAccountAccountNumber(String value) {
        this.outSelectedAgrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedAgrProfitsAccountCDigit property.
     * 
     */
    public short getOutSelectedAgrProfitsAccountCDigit() {
        return outSelectedAgrProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outSelectedAgrProfitsAccountCDigit property.
     * 
     */
    public void setOutSelectedAgrProfitsAccountCDigit(short value) {
        this.outSelectedAgrProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outSelectedAgrProfitsAccountCustId property.
     * 
     */
    public int getOutSelectedAgrProfitsAccountCustId() {
        return outSelectedAgrProfitsAccountCustId;
    }

    /**
     * Sets the value of the outSelectedAgrProfitsAccountCustId property.
     * 
     */
    public void setOutSelectedAgrProfitsAccountCustId(int value) {
        this.outSelectedAgrProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outSelectedAgrProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedAgrProfitsAccountMonotoringUnit() {
        return outSelectedAgrProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedAgrProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedAgrProfitsAccountMonotoringUnit(int value) {
        this.outSelectedAgrProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedAgrProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedAgrProfitsAccountPrftSystem() {
        return outSelectedAgrProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedAgrProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedAgrProfitsAccountPrftSystem(short value) {
        this.outSelectedAgrProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLoanProfitsAccountAccStatus() {
        return outSelectedLoanProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLoanProfitsAccountAccStatus(String value) {
        this.outSelectedLoanProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedLoanProfitsAccountAccountCd() {
        return outSelectedLoanProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountAccountCd(short value) {
        this.outSelectedLoanProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedLoanProfitsAccountAccountNumber() {
        return outSelectedLoanProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedLoanProfitsAccountAccountNumber(String value) {
        this.outSelectedLoanProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountAgrMembershipSn() {
        return outSelectedLoanProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountAgrMembershipSn(int value) {
        this.outSelectedLoanProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAgrSn property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountAgrSn() {
        return outSelectedLoanProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAgrSn property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountAgrSn(int value) {
        this.outSelectedLoanProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAgrUnit property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountAgrUnit() {
        return outSelectedLoanProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAgrUnit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountAgrUnit(int value) {
        this.outSelectedLoanProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountAgrYear property.
     * 
     */
    public short getOutSelectedLoanProfitsAccountAgrYear() {
        return outSelectedLoanProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountAgrYear property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountAgrYear(short value) {
        this.outSelectedLoanProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountCDigit property.
     * 
     */
    public short getOutSelectedLoanProfitsAccountCDigit() {
        return outSelectedLoanProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountCDigit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountCDigit(short value) {
        this.outSelectedLoanProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountCustId property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountCustId() {
        return outSelectedLoanProfitsAccountCustId;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountCustId property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountCustId(int value) {
        this.outSelectedLoanProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutSelectedLoanProfitsAccountDepAccNumber() {
        return outSelectedLoanProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountDepAccNumber(double value) {
        this.outSelectedLoanProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountDepOpenUnit() {
        return outSelectedLoanProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountDepOpenUnit(int value) {
        this.outSelectedLoanProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountLgAccSn property.
     * 
     */
    public double getOutSelectedLoanProfitsAccountLgAccSn() {
        return outSelectedLoanProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountLgAccSn property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountLgAccSn(double value) {
        this.outSelectedLoanProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountLgOpenUnit() {
        return outSelectedLoanProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountLgOpenUnit(int value) {
        this.outSelectedLoanProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountLimitCurrency() {
        return outSelectedLoanProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountLimitCurrency(int value) {
        this.outSelectedLoanProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountLnsOpenUnit() {
        return outSelectedLoanProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountLnsOpenUnit(int value) {
        this.outSelectedLoanProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountLnsSn property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountLnsSn() {
        return outSelectedLoanProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountLnsSn property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountLnsSn(int value) {
        this.outSelectedLoanProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountLnsType property.
     * 
     */
    public short getOutSelectedLoanProfitsAccountLnsType() {
        return outSelectedLoanProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountLnsType property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountLnsType(short value) {
        this.outSelectedLoanProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountMonotoringUnit() {
        return outSelectedLoanProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountMonotoringUnit(int value) {
        this.outSelectedLoanProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountMovementCurrency() {
        return outSelectedLoanProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountMovementCurrency(int value) {
        this.outSelectedLoanProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedLoanProfitsAccountPrftSystem() {
        return outSelectedLoanProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountPrftSystem(short value) {
        this.outSelectedLoanProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountProductId property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountProductId() {
        return outSelectedLoanProfitsAccountProductId;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountProductId property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountProductId(int value) {
        this.outSelectedLoanProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountTrOpenUnit() {
        return outSelectedLoanProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountTrOpenUnit(int value) {
        this.outSelectedLoanProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountTrSn property.
     * 
     */
    public int getOutSelectedLoanProfitsAccountTrSn() {
        return outSelectedLoanProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountTrSn property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountTrSn(int value) {
        this.outSelectedLoanProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outSelectedLoanProfitsAccountTrType property.
     * 
     */
    public short getOutSelectedLoanProfitsAccountTrType() {
        return outSelectedLoanProfitsAccountTrType;
    }

    /**
     * Sets the value of the outSelectedLoanProfitsAccountTrType property.
     * 
     */
    public void setOutSelectedLoanProfitsAccountTrType(short value) {
        this.outSelectedLoanProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountAccStatus() {
        return outSelectedProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountAccStatus(String value) {
        this.outSelectedProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getOutSelectedProfitsAccountAccountCd() {
        return outSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setOutSelectedProfitsAccountAccountCd(short value) {
        this.outSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedProfitsAccountAccountNumber() {
        return outSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedProfitsAccountAccountNumber(String value) {
        this.outSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrMembershipSn() {
        return outSelectedProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrMembershipSn(int value) {
        this.outSelectedProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrSn property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrSn() {
        return outSelectedProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrSn property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrSn(int value) {
        this.outSelectedProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountAgrUnit() {
        return outSelectedProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrUnit(int value) {
        this.outSelectedProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountAgrYear property.
     * 
     */
    public short getOutSelectedProfitsAccountAgrYear() {
        return outSelectedProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountAgrYear property.
     * 
     */
    public void setOutSelectedProfitsAccountAgrYear(short value) {
        this.outSelectedProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountCDigit property.
     * 
     */
    public short getOutSelectedProfitsAccountCDigit() {
        return outSelectedProfitsAccountCDigit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountCDigit property.
     * 
     */
    public void setOutSelectedProfitsAccountCDigit(short value) {
        this.outSelectedProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountCustId property.
     * 
     */
    public int getOutSelectedProfitsAccountCustId() {
        return outSelectedProfitsAccountCustId;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountCustId property.
     * 
     */
    public void setOutSelectedProfitsAccountCustId(int value) {
        this.outSelectedProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutSelectedProfitsAccountDepAccNumber() {
        return outSelectedProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutSelectedProfitsAccountDepAccNumber(double value) {
        this.outSelectedProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountDepOpenUnit() {
        return outSelectedProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountDepOpenUnit(int value) {
        this.outSelectedProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLgAccSn property.
     * 
     */
    public double getOutSelectedProfitsAccountLgAccSn() {
        return outSelectedProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLgAccSn property.
     * 
     */
    public void setOutSelectedProfitsAccountLgAccSn(double value) {
        this.outSelectedProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountLgOpenUnit() {
        return outSelectedProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountLgOpenUnit(int value) {
        this.outSelectedProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public int getOutSelectedProfitsAccountLimitCurrency() {
        return outSelectedProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public void setOutSelectedProfitsAccountLimitCurrency(int value) {
        this.outSelectedProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountLnsOpenUnit() {
        return outSelectedProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsOpenUnit(int value) {
        this.outSelectedProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsSn property.
     * 
     */
    public int getOutSelectedProfitsAccountLnsSn() {
        return outSelectedProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsSn property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsSn(int value) {
        this.outSelectedProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountLnsType property.
     * 
     */
    public short getOutSelectedProfitsAccountLnsType() {
        return outSelectedProfitsAccountLnsType;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountLnsType property.
     * 
     */
    public void setOutSelectedProfitsAccountLnsType(short value) {
        this.outSelectedProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountMonotoringUnit() {
        return outSelectedProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountMonotoringUnit(int value) {
        this.outSelectedProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public int getOutSelectedProfitsAccountMovementCurrency() {
        return outSelectedProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public void setOutSelectedProfitsAccountMovementCurrency(int value) {
        this.outSelectedProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getOutSelectedProfitsAccountPrftSystem() {
        return outSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setOutSelectedProfitsAccountPrftSystem(short value) {
        this.outSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountProductId property.
     * 
     */
    public int getOutSelectedProfitsAccountProductId() {
        return outSelectedProfitsAccountProductId;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountProductId property.
     * 
     */
    public void setOutSelectedProfitsAccountProductId(int value) {
        this.outSelectedProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public int getOutSelectedProfitsAccountTrOpenUnit() {
        return outSelectedProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public void setOutSelectedProfitsAccountTrOpenUnit(int value) {
        this.outSelectedProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrSn property.
     * 
     */
    public int getOutSelectedProfitsAccountTrSn() {
        return outSelectedProfitsAccountTrSn;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrSn property.
     * 
     */
    public void setOutSelectedProfitsAccountTrSn(int value) {
        this.outSelectedProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the outSelectedProfitsAccountTrType property.
     * 
     */
    public short getOutSelectedProfitsAccountTrType() {
        return outSelectedProfitsAccountTrType;
    }

    /**
     * Sets the value of the outSelectedProfitsAccountTrType property.
     * 
     */
    public void setOutSelectedProfitsAccountTrType(short value) {
        this.outSelectedProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the outThinkingCurCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public short getOutThinkingCurCurrencyDisplayedDecimalPlaces() {
        return outThinkingCurCurrencyDisplayedDecimalPlaces;
    }

    /**
     * Sets the value of the outThinkingCurCurrencyDisplayedDecimalPlaces property.
     * 
     */
    public void setOutThinkingCurCurrencyDisplayedDecimalPlaces(short value) {
        this.outThinkingCurCurrencyDisplayedDecimalPlaces = value;
    }

    /**
     * Gets the value of the outThinkingCurCurrencyIdCurrency property.
     * 
     */
    public int getOutThinkingCurCurrencyIdCurrency() {
        return outThinkingCurCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outThinkingCurCurrencyIdCurrency property.
     * 
     */
    public void setOutThinkingCurCurrencyIdCurrency(int value) {
        this.outThinkingCurCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outThinkingCurCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThinkingCurCurrencyNationalFlag() {
        return outThinkingCurCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outThinkingCurCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThinkingCurCurrencyNationalFlag(String value) {
        this.outThinkingCurCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outThinkingCurCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutThinkingCurCurrencyShortDescr() {
        return outThinkingCurCurrencyShortDescr;
    }

    /**
     * Sets the value of the outThinkingCurCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutThinkingCurCurrencyShortDescr(String value) {
        this.outThinkingCurCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outTotalAvailableIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalAvailableIefSuppliedAmount() {
        return outTotalAvailableIefSuppliedAmount;
    }

    /**
     * Sets the value of the outTotalAvailableIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalAvailableIefSuppliedAmount(BigDecimal value) {
        this.outTotalAvailableIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the outGrpApplicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpApplicDetailsItem }
     *     
     */
    public ArrayOfOutGrpApplicDetailsItem getOutGrpApplicDetails() {
        return outGrpApplicDetails;
    }

    /**
     * Sets the value of the outGrpApplicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpApplicDetailsItem }
     *     
     */
    public void setOutGrpApplicDetails(ArrayOfOutGrpApplicDetailsItem value) {
        this.outGrpApplicDetails = value;
    }

}
