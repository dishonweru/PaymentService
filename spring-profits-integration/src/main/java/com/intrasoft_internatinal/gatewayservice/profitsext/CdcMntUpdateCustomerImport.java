
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CdcMntUpdateCustomerImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdcMntUpdateCustomerImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InActivityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBirthCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InEconomicGroupGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InEducationLevelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFamilyStatusGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIdCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIdTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InNationalityGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfessionCategoryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfessionGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InThinkingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerBirthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDaiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOfficeCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOfficeCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOfficeDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCitizenshipGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProfessionStatusGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLawshapeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCommunMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerIapplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIncomeLevelGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCommunicationLanguageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdcMntUpdateCustomerImport", propOrder = {
    "inActivityGenericDetailSerialNum",
    "inAddressCountryGenericDetailShortDescription",
    "inAddressDistrictGenericDetailSerialNum",
    "inBankemployeeId",
    "inBirthCountryGenericDetailShortDescription",
    "inEconomicGroupGenericDetailSerialNum",
    "inEducationLevelGenericDetailSerialNum",
    "inFamilyStatusGenericDetailSerialNum",
    "inIdCountryGenericDetailShortDescription",
    "inIdTypeGenericDetailSerialNum",
    "inMonitoringBankemployeeId",
    "inMonitoringUnitCode",
    "inNationalityGenericDetailSerialNum",
    "inProfessionCategoryGenericDetailSerialNum",
    "inProfessionGenericDetailSerialNum",
    "inThinkingCurrencyIdCurrency",
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressAddressType",
    "inCustAddressCity",
    "inCustAddressCommunicationAddress",
    "inCustAddressEntryStatus",
    "inCustAddressFaxNo",
    "inCustAddressMailBox",
    "inCustAddressRegion",
    "inCustAddressSegmFlags",
    "inCustAddressSerialNum",
    "inCustAddressTelephone",
    "inCustAddressTmstamp",
    "inCustAddressZipCode",
    "inCustomerBirthplace",
    "inCustomerCustId",
    "inCustomerCustType",
    "inCustomerDaiNumber",
    "inCustomerDateOfBirth",
    "inCustomerEMail",
    "inCustomerEmployer",
    "inCustomerFamilyMembers",
    "inCustomerFatherName",
    "inCustomerFirstName",
    "inCustomerMiddleName",
    "inCustomerMobileTel",
    "inCustomerNonResident",
    "inCustomerSex",
    "inCustomerSurname",
    "inCustomerTelephone1",
    "inOfficeCountryGenericDetailShortDescription",
    "inOfficeCustAddressAddress1",
    "inOfficeCustAddressAddress2",
    "inOfficeCustAddressAddressType",
    "inOfficeCustAddressCity",
    "inOfficeCustAddressCommunicationAddress",
    "inOfficeCustAddressEntryStatus",
    "inOfficeCustAddressFaxNo",
    "inOfficeCustAddressMailBox",
    "inOfficeCustAddressRegion",
    "inOfficeCustAddressSegmFlags",
    "inOfficeCustAddressSerialNum",
    "inOfficeCustAddressTelephone",
    "inOfficeCustAddressTmstamp",
    "inOfficeCustAddressZipCode",
    "inOfficeDistrictGenericDetailSerialNum",
    "inOtherAfmAfmNo",
    "inOtherAfmTmstamp",
    "inOtherIdExpiryDate",
    "inOtherIdIdNo",
    "inOtherIdIssueAuthority",
    "inOtherIdIssueDate",
    "inOtherIdMainFlag",
    "inOtherIdSerialNo",
    "inOtherIdTmstamp",
    "inParametersInGrmTerminalTerminalNumber",
    "inCitizenshipGenericDetailSerialNum",
    "inProfessionStatusGenericDetailSerialNum",
    "inLawshapeGenericDetailSerialNum",
    "inCustomerTitle",
    "inCustomerCommunMethod",
    "inCustomerIapplyId",
    "inCustomerCrmId",
    "inIncomeLevelGenericDetailSerialNum",
    "inCommunicationLanguageGenericDetailSerialNum",
    "inCustomerNoAfm"
})
public class CdcMntUpdateCustomerImport
    extends BaseImport
{

    @XmlElement(name = "InActivityGenericDetailSerialNum")
    protected int inActivityGenericDetailSerialNum;
    @XmlElement(name = "InAddressCountryGenericDetailShortDescription")
    protected String inAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "InAddressDistrictGenericDetailSerialNum")
    protected int inAddressDistrictGenericDetailSerialNum;
    @XmlElement(name = "InBankemployeeId")
    protected String inBankemployeeId;
    @XmlElement(name = "InBirthCountryGenericDetailShortDescription")
    protected String inBirthCountryGenericDetailShortDescription;
    @XmlElement(name = "InEconomicGroupGenericDetailSerialNum")
    protected int inEconomicGroupGenericDetailSerialNum;
    @XmlElement(name = "InEducationLevelGenericDetailSerialNum")
    protected int inEducationLevelGenericDetailSerialNum;
    @XmlElement(name = "InFamilyStatusGenericDetailSerialNum")
    protected int inFamilyStatusGenericDetailSerialNum;
    @XmlElement(name = "InIdCountryGenericDetailShortDescription")
    protected String inIdCountryGenericDetailShortDescription;
    @XmlElement(name = "InIdTypeGenericDetailSerialNum")
    protected int inIdTypeGenericDetailSerialNum;
    @XmlElement(name = "InMonitoringBankemployeeId")
    protected String inMonitoringBankemployeeId;
    @XmlElement(name = "InMonitoringUnitCode")
    protected int inMonitoringUnitCode;
    @XmlElement(name = "InNationalityGenericDetailSerialNum")
    protected int inNationalityGenericDetailSerialNum;
    @XmlElement(name = "InProfessionCategoryGenericDetailSerialNum")
    protected int inProfessionCategoryGenericDetailSerialNum;
    @XmlElement(name = "InProfessionGenericDetailSerialNum")
    protected int inProfessionGenericDetailSerialNum;
    @XmlElement(name = "InThinkingCurrencyIdCurrency")
    protected int inThinkingCurrencyIdCurrency;
    @XmlElement(name = "InCustAddressAddress1")
    protected String inCustAddressAddress1;
    @XmlElement(name = "InCustAddressAddress2")
    protected String inCustAddressAddress2;
    @XmlElement(name = "InCustAddressAddressType")
    protected String inCustAddressAddressType;
    @XmlElement(name = "InCustAddressCity")
    protected String inCustAddressCity;
    @XmlElement(name = "InCustAddressCommunicationAddress")
    protected String inCustAddressCommunicationAddress;
    @XmlElement(name = "InCustAddressEntryStatus")
    protected String inCustAddressEntryStatus;
    @XmlElement(name = "InCustAddressFaxNo")
    protected String inCustAddressFaxNo;
    @XmlElement(name = "InCustAddressMailBox")
    protected String inCustAddressMailBox;
    @XmlElement(name = "InCustAddressRegion")
    protected String inCustAddressRegion;
    @XmlElement(name = "InCustAddressSegmFlags")
    protected String inCustAddressSegmFlags;
    @XmlElement(name = "InCustAddressSerialNum")
    protected short inCustAddressSerialNum;
    @XmlElement(name = "InCustAddressTelephone")
    protected String inCustAddressTelephone;
    @XmlElement(name = "InCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressTmstamp;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustomerBirthplace")
    protected String inCustomerBirthplace;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerCustType")
    protected String inCustomerCustType;
    @XmlElement(name = "InCustomerDaiNumber")
    protected String inCustomerDaiNumber;
    @XmlElement(name = "InCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDateOfBirth;
    @XmlElement(name = "InCustomerEMail")
    protected String inCustomerEMail;
    @XmlElement(name = "InCustomerEmployer")
    protected String inCustomerEmployer;
    @XmlElement(name = "InCustomerFamilyMembers")
    protected short inCustomerFamilyMembers;
    @XmlElement(name = "InCustomerFatherName")
    protected String inCustomerFatherName;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InCustomerMiddleName")
    protected String inCustomerMiddleName;
    @XmlElement(name = "InCustomerMobileTel")
    protected String inCustomerMobileTel;
    @XmlElement(name = "InCustomerNonResident")
    protected String inCustomerNonResident;
    @XmlElement(name = "InCustomerSex")
    protected String inCustomerSex;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InCustomerTelephone1")
    protected String inCustomerTelephone1;
    @XmlElement(name = "InOfficeCountryGenericDetailShortDescription")
    protected String inOfficeCountryGenericDetailShortDescription;
    @XmlElement(name = "InOfficeCustAddressAddress1")
    protected String inOfficeCustAddressAddress1;
    @XmlElement(name = "InOfficeCustAddressAddress2")
    protected String inOfficeCustAddressAddress2;
    @XmlElement(name = "InOfficeCustAddressAddressType")
    protected String inOfficeCustAddressAddressType;
    @XmlElement(name = "InOfficeCustAddressCity")
    protected String inOfficeCustAddressCity;
    @XmlElement(name = "InOfficeCustAddressCommunicationAddress")
    protected String inOfficeCustAddressCommunicationAddress;
    @XmlElement(name = "InOfficeCustAddressEntryStatus")
    protected String inOfficeCustAddressEntryStatus;
    @XmlElement(name = "InOfficeCustAddressFaxNo")
    protected String inOfficeCustAddressFaxNo;
    @XmlElement(name = "InOfficeCustAddressMailBox")
    protected String inOfficeCustAddressMailBox;
    @XmlElement(name = "InOfficeCustAddressRegion")
    protected String inOfficeCustAddressRegion;
    @XmlElement(name = "InOfficeCustAddressSegmFlags")
    protected String inOfficeCustAddressSegmFlags;
    @XmlElement(name = "InOfficeCustAddressSerialNum")
    protected short inOfficeCustAddressSerialNum;
    @XmlElement(name = "InOfficeCustAddressTelephone")
    protected String inOfficeCustAddressTelephone;
    @XmlElement(name = "InOfficeCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOfficeCustAddressTmstamp;
    @XmlElement(name = "InOfficeCustAddressZipCode")
    protected String inOfficeCustAddressZipCode;
    @XmlElement(name = "InOfficeDistrictGenericDetailSerialNum")
    protected int inOfficeDistrictGenericDetailSerialNum;
    @XmlElement(name = "InOtherAfmAfmNo")
    protected String inOtherAfmAfmNo;
    @XmlElement(name = "InOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherAfmTmstamp;
    @XmlElement(name = "InOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherIdExpiryDate;
    @XmlElement(name = "InOtherIdIdNo")
    protected String inOtherIdIdNo;
    @XmlElement(name = "InOtherIdIssueAuthority")
    protected String inOtherIdIssueAuthority;
    @XmlElement(name = "InOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherIdIssueDate;
    @XmlElement(name = "InOtherIdMainFlag")
    protected String inOtherIdMainFlag;
    @XmlElement(name = "InOtherIdSerialNo")
    protected short inOtherIdSerialNo;
    @XmlElement(name = "InOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inOtherIdTmstamp;
    @XmlElement(name = "InParametersInGrmTerminalTerminalNumber")
    protected String inParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InCitizenshipGenericDetailSerialNum")
    protected int inCitizenshipGenericDetailSerialNum;
    @XmlElement(name = "InProfessionStatusGenericDetailSerialNum")
    protected int inProfessionStatusGenericDetailSerialNum;
    @XmlElement(name = "InLawshapeGenericDetailSerialNum")
    protected int inLawshapeGenericDetailSerialNum;
    @XmlElement(name = "InCustomerTitle")
    protected String inCustomerTitle;
    @XmlElement(name = "InCustomerCommunMethod")
    protected String inCustomerCommunMethod;
    @XmlElement(name = "InCustomerIapplyId")
    protected String inCustomerIapplyId;
    @XmlElement(name = "InCustomerCrmId")
    protected String inCustomerCrmId;
    @XmlElement(name = "InIncomeLevelGenericDetailSerialNum")
    protected int inIncomeLevelGenericDetailSerialNum;
    @XmlElement(name = "InCommunicationLanguageGenericDetailSerialNum")
    protected int inCommunicationLanguageGenericDetailSerialNum;
    @XmlElement(name = "InCustomerNoAfm")
    protected String inCustomerNoAfm;

    /**
     * Gets the value of the inActivityGenericDetailSerialNum property.
     * 
     */
    public int getInActivityGenericDetailSerialNum() {
        return inActivityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inActivityGenericDetailSerialNum property.
     * 
     */
    public void setInActivityGenericDetailSerialNum(int value) {
        this.inActivityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddressCountryGenericDetailShortDescription() {
        return inAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddressCountryGenericDetailShortDescription(String value) {
        this.inAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public int getInAddressDistrictGenericDetailSerialNum() {
        return inAddressDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAddressDistrictGenericDetailSerialNum property.
     * 
     */
    public void setInAddressDistrictGenericDetailSerialNum(int value) {
        this.inAddressDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBankemployeeId() {
        return inBankemployeeId;
    }

    /**
     * Sets the value of the inBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBankemployeeId(String value) {
        this.inBankemployeeId = value;
    }

    /**
     * Gets the value of the inBirthCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBirthCountryGenericDetailShortDescription() {
        return inBirthCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inBirthCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBirthCountryGenericDetailShortDescription(String value) {
        this.inBirthCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inEconomicGroupGenericDetailSerialNum property.
     * 
     */
    public int getInEconomicGroupGenericDetailSerialNum() {
        return inEconomicGroupGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEconomicGroupGenericDetailSerialNum property.
     * 
     */
    public void setInEconomicGroupGenericDetailSerialNum(int value) {
        this.inEconomicGroupGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inEducationLevelGenericDetailSerialNum property.
     * 
     */
    public int getInEducationLevelGenericDetailSerialNum() {
        return inEducationLevelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inEducationLevelGenericDetailSerialNum property.
     * 
     */
    public void setInEducationLevelGenericDetailSerialNum(int value) {
        this.inEducationLevelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inFamilyStatusGenericDetailSerialNum property.
     * 
     */
    public int getInFamilyStatusGenericDetailSerialNum() {
        return inFamilyStatusGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inFamilyStatusGenericDetailSerialNum property.
     * 
     */
    public void setInFamilyStatusGenericDetailSerialNum(int value) {
        this.inFamilyStatusGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIdCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIdCountryGenericDetailShortDescription() {
        return inIdCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inIdCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIdCountryGenericDetailShortDescription(String value) {
        this.inIdCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inIdTypeGenericDetailSerialNum property.
     * 
     */
    public int getInIdTypeGenericDetailSerialNum() {
        return inIdTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inIdTypeGenericDetailSerialNum property.
     * 
     */
    public void setInIdTypeGenericDetailSerialNum(int value) {
        this.inIdTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inMonitoringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringBankemployeeId() {
        return inMonitoringBankemployeeId;
    }

    /**
     * Sets the value of the inMonitoringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringBankemployeeId(String value) {
        this.inMonitoringBankemployeeId = value;
    }

    /**
     * Gets the value of the inMonitoringUnitCode property.
     * 
     */
    public int getInMonitoringUnitCode() {
        return inMonitoringUnitCode;
    }

    /**
     * Sets the value of the inMonitoringUnitCode property.
     * 
     */
    public void setInMonitoringUnitCode(int value) {
        this.inMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the inNationalityGenericDetailSerialNum property.
     * 
     */
    public int getInNationalityGenericDetailSerialNum() {
        return inNationalityGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inNationalityGenericDetailSerialNum property.
     * 
     */
    public void setInNationalityGenericDetailSerialNum(int value) {
        this.inNationalityGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inProfessionCategoryGenericDetailSerialNum property.
     * 
     */
    public int getInProfessionCategoryGenericDetailSerialNum() {
        return inProfessionCategoryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfessionCategoryGenericDetailSerialNum property.
     * 
     */
    public void setInProfessionCategoryGenericDetailSerialNum(int value) {
        this.inProfessionCategoryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inProfessionGenericDetailSerialNum property.
     * 
     */
    public int getInProfessionGenericDetailSerialNum() {
        return inProfessionGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfessionGenericDetailSerialNum property.
     * 
     */
    public void setInProfessionGenericDetailSerialNum(int value) {
        this.inProfessionGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inThinkingCurrencyIdCurrency property.
     * 
     */
    public int getInThinkingCurrencyIdCurrency() {
        return inThinkingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inThinkingCurrencyIdCurrency property.
     * 
     */
    public void setInThinkingCurrencyIdCurrency(int value) {
        this.inThinkingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress1() {
        return inCustAddressAddress1;
    }

    /**
     * Sets the value of the inCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress1(String value) {
        this.inCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress2() {
        return inCustAddressAddress2;
    }

    /**
     * Sets the value of the inCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress2(String value) {
        this.inCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddressType() {
        return inCustAddressAddressType;
    }

    /**
     * Sets the value of the inCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddressType(String value) {
        this.inCustAddressAddressType = value;
    }

    /**
     * Gets the value of the inCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCity() {
        return inCustAddressCity;
    }

    /**
     * Sets the value of the inCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCity(String value) {
        this.inCustAddressCity = value;
    }

    /**
     * Gets the value of the inCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCommunicationAddress() {
        return inCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCommunicationAddress(String value) {
        this.inCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryStatus() {
        return inCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryStatus(String value) {
        this.inCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressFaxNo() {
        return inCustAddressFaxNo;
    }

    /**
     * Sets the value of the inCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressFaxNo(String value) {
        this.inCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressMailBox() {
        return inCustAddressMailBox;
    }

    /**
     * Sets the value of the inCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressMailBox(String value) {
        this.inCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressRegion() {
        return inCustAddressRegion;
    }

    /**
     * Sets the value of the inCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressRegion(String value) {
        this.inCustAddressRegion = value;
    }

    /**
     * Gets the value of the inCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressSegmFlags() {
        return inCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressSegmFlags(String value) {
        this.inCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inCustAddressSerialNum property.
     * 
     */
    public short getInCustAddressSerialNum() {
        return inCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCustAddressSerialNum property.
     * 
     */
    public void setInCustAddressSerialNum(short value) {
        this.inCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone() {
        return inCustAddressTelephone;
    }

    /**
     * Sets the value of the inCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone(String value) {
        this.inCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustAddressTmstamp() {
        return inCustAddressTmstamp;
    }

    /**
     * Sets the value of the inCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the inCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressZipCode() {
        return inCustAddressZipCode;
    }

    /**
     * Sets the value of the inCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressZipCode(String value) {
        this.inCustAddressZipCode = value;
    }

    /**
     * Gets the value of the inCustomerBirthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerBirthplace() {
        return inCustomerBirthplace;
    }

    /**
     * Sets the value of the inCustomerBirthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerBirthplace(String value) {
        this.inCustomerBirthplace = value;
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
     * Gets the value of the inCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCustType() {
        return inCustomerCustType;
    }

    /**
     * Sets the value of the inCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCustType(String value) {
        this.inCustomerCustType = value;
    }

    /**
     * Gets the value of the inCustomerDaiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDaiNumber() {
        return inCustomerDaiNumber;
    }

    /**
     * Sets the value of the inCustomerDaiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDaiNumber(String value) {
        this.inCustomerDaiNumber = value;
    }

    /**
     * Gets the value of the inCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDateOfBirth() {
        return inCustomerDateOfBirth;
    }

    /**
     * Sets the value of the inCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.inCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the inCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEMail() {
        return inCustomerEMail;
    }

    /**
     * Sets the value of the inCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEMail(String value) {
        this.inCustomerEMail = value;
    }

    /**
     * Gets the value of the inCustomerEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEmployer() {
        return inCustomerEmployer;
    }

    /**
     * Sets the value of the inCustomerEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEmployer(String value) {
        this.inCustomerEmployer = value;
    }

    /**
     * Gets the value of the inCustomerFamilyMembers property.
     * 
     */
    public short getInCustomerFamilyMembers() {
        return inCustomerFamilyMembers;
    }

    /**
     * Sets the value of the inCustomerFamilyMembers property.
     * 
     */
    public void setInCustomerFamilyMembers(short value) {
        this.inCustomerFamilyMembers = value;
    }

    /**
     * Gets the value of the inCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFatherName() {
        return inCustomerFatherName;
    }

    /**
     * Sets the value of the inCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFatherName(String value) {
        this.inCustomerFatherName = value;
    }

    /**
     * Gets the value of the inCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFirstName() {
        return inCustomerFirstName;
    }

    /**
     * Sets the value of the inCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFirstName(String value) {
        this.inCustomerFirstName = value;
    }

    /**
     * Gets the value of the inCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMiddleName() {
        return inCustomerMiddleName;
    }

    /**
     * Sets the value of the inCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMiddleName(String value) {
        this.inCustomerMiddleName = value;
    }

    /**
     * Gets the value of the inCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMobileTel() {
        return inCustomerMobileTel;
    }

    /**
     * Sets the value of the inCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMobileTel(String value) {
        this.inCustomerMobileTel = value;
    }

    /**
     * Gets the value of the inCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNonResident() {
        return inCustomerNonResident;
    }

    /**
     * Sets the value of the inCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNonResident(String value) {
        this.inCustomerNonResident = value;
    }

    /**
     * Gets the value of the inCustomerSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSex() {
        return inCustomerSex;
    }

    /**
     * Sets the value of the inCustomerSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSex(String value) {
        this.inCustomerSex = value;
    }

    /**
     * Gets the value of the inCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSurname() {
        return inCustomerSurname;
    }

    /**
     * Sets the value of the inCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSurname(String value) {
        this.inCustomerSurname = value;
    }

    /**
     * Gets the value of the inCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTelephone1() {
        return inCustomerTelephone1;
    }

    /**
     * Sets the value of the inCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTelephone1(String value) {
        this.inCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the inOfficeCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCountryGenericDetailShortDescription() {
        return inOfficeCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inOfficeCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCountryGenericDetailShortDescription(String value) {
        this.inOfficeCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress1() {
        return inOfficeCustAddressAddress1;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress1(String value) {
        this.inOfficeCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddress2() {
        return inOfficeCustAddressAddress2;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddress2(String value) {
        this.inOfficeCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressAddressType() {
        return inOfficeCustAddressAddressType;
    }

    /**
     * Sets the value of the inOfficeCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressAddressType(String value) {
        this.inOfficeCustAddressAddressType = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressCity() {
        return inOfficeCustAddressCity;
    }

    /**
     * Sets the value of the inOfficeCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressCity(String value) {
        this.inOfficeCustAddressCity = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressCommunicationAddress() {
        return inOfficeCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inOfficeCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressCommunicationAddress(String value) {
        this.inOfficeCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressEntryStatus() {
        return inOfficeCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inOfficeCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressEntryStatus(String value) {
        this.inOfficeCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressFaxNo() {
        return inOfficeCustAddressFaxNo;
    }

    /**
     * Sets the value of the inOfficeCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressFaxNo(String value) {
        this.inOfficeCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressMailBox() {
        return inOfficeCustAddressMailBox;
    }

    /**
     * Sets the value of the inOfficeCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressMailBox(String value) {
        this.inOfficeCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressRegion() {
        return inOfficeCustAddressRegion;
    }

    /**
     * Sets the value of the inOfficeCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressRegion(String value) {
        this.inOfficeCustAddressRegion = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressSegmFlags() {
        return inOfficeCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inOfficeCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressSegmFlags(String value) {
        this.inOfficeCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressSerialNum property.
     * 
     */
    public short getInOfficeCustAddressSerialNum() {
        return inOfficeCustAddressSerialNum;
    }

    /**
     * Sets the value of the inOfficeCustAddressSerialNum property.
     * 
     */
    public void setInOfficeCustAddressSerialNum(short value) {
        this.inOfficeCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressTelephone() {
        return inOfficeCustAddressTelephone;
    }

    /**
     * Sets the value of the inOfficeCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressTelephone(String value) {
        this.inOfficeCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOfficeCustAddressTmstamp() {
        return inOfficeCustAddressTmstamp;
    }

    /**
     * Sets the value of the inOfficeCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOfficeCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inOfficeCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the inOfficeCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOfficeCustAddressZipCode() {
        return inOfficeCustAddressZipCode;
    }

    /**
     * Sets the value of the inOfficeCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOfficeCustAddressZipCode(String value) {
        this.inOfficeCustAddressZipCode = value;
    }

    /**
     * Gets the value of the inOfficeDistrictGenericDetailSerialNum property.
     * 
     */
    public int getInOfficeDistrictGenericDetailSerialNum() {
        return inOfficeDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inOfficeDistrictGenericDetailSerialNum property.
     * 
     */
    public void setInOfficeDistrictGenericDetailSerialNum(int value) {
        this.inOfficeDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherAfmAfmNo() {
        return inOtherAfmAfmNo;
    }

    /**
     * Sets the value of the inOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherAfmAfmNo(String value) {
        this.inOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the inOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherAfmTmstamp() {
        return inOtherAfmTmstamp;
    }

    /**
     * Sets the value of the inOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.inOtherAfmTmstamp = value;
    }

    /**
     * Gets the value of the inOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherIdExpiryDate() {
        return inOtherIdExpiryDate;
    }

    /**
     * Sets the value of the inOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.inOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the inOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdIdNo() {
        return inOtherIdIdNo;
    }

    /**
     * Sets the value of the inOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdIdNo(String value) {
        this.inOtherIdIdNo = value;
    }

    /**
     * Gets the value of the inOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdIssueAuthority() {
        return inOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the inOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdIssueAuthority(String value) {
        this.inOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the inOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherIdIssueDate() {
        return inOtherIdIssueDate;
    }

    /**
     * Sets the value of the inOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherIdIssueDate(XMLGregorianCalendar value) {
        this.inOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the inOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdMainFlag() {
        return inOtherIdMainFlag;
    }

    /**
     * Sets the value of the inOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdMainFlag(String value) {
        this.inOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the inOtherIdSerialNo property.
     * 
     */
    public short getInOtherIdSerialNo() {
        return inOtherIdSerialNo;
    }

    /**
     * Sets the value of the inOtherIdSerialNo property.
     * 
     */
    public void setInOtherIdSerialNo(short value) {
        this.inOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the inOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInOtherIdTmstamp() {
        return inOtherIdTmstamp;
    }

    /**
     * Sets the value of the inOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInOtherIdTmstamp(XMLGregorianCalendar value) {
        this.inOtherIdTmstamp = value;
    }

    /**
     * Gets the value of the inParametersInGrmTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInGrmTerminalTerminalNumber() {
        return inParametersInGrmTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInGrmTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInGrmTerminalTerminalNumber(String value) {
        this.inParametersInGrmTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inCitizenshipGenericDetailSerialNum property.
     * 
     */
    public int getInCitizenshipGenericDetailSerialNum() {
        return inCitizenshipGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCitizenshipGenericDetailSerialNum property.
     * 
     */
    public void setInCitizenshipGenericDetailSerialNum(int value) {
        this.inCitizenshipGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inProfessionStatusGenericDetailSerialNum property.
     * 
     */
    public int getInProfessionStatusGenericDetailSerialNum() {
        return inProfessionStatusGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inProfessionStatusGenericDetailSerialNum property.
     * 
     */
    public void setInProfessionStatusGenericDetailSerialNum(int value) {
        this.inProfessionStatusGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLawshapeGenericDetailSerialNum property.
     * 
     */
    public int getInLawshapeGenericDetailSerialNum() {
        return inLawshapeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLawshapeGenericDetailSerialNum property.
     * 
     */
    public void setInLawshapeGenericDetailSerialNum(int value) {
        this.inLawshapeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustomerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerTitle() {
        return inCustomerTitle;
    }

    /**
     * Sets the value of the inCustomerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerTitle(String value) {
        this.inCustomerTitle = value;
    }

    /**
     * Gets the value of the inCustomerCommunMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCommunMethod() {
        return inCustomerCommunMethod;
    }

    /**
     * Sets the value of the inCustomerCommunMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCommunMethod(String value) {
        this.inCustomerCommunMethod = value;
    }

    /**
     * Gets the value of the inCustomerIapplyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerIapplyId() {
        return inCustomerIapplyId;
    }

    /**
     * Sets the value of the inCustomerIapplyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerIapplyId(String value) {
        this.inCustomerIapplyId = value;
    }

    /**
     * Gets the value of the inCustomerCrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCrmId() {
        return inCustomerCrmId;
    }

    /**
     * Sets the value of the inCustomerCrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCrmId(String value) {
        this.inCustomerCrmId = value;
    }

    /**
     * Gets the value of the inIncomeLevelGenericDetailSerialNum property.
     * 
     */
    public int getInIncomeLevelGenericDetailSerialNum() {
        return inIncomeLevelGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inIncomeLevelGenericDetailSerialNum property.
     * 
     */
    public void setInIncomeLevelGenericDetailSerialNum(int value) {
        this.inIncomeLevelGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCommunicationLanguageGenericDetailSerialNum property.
     * 
     */
    public int getInCommunicationLanguageGenericDetailSerialNum() {
        return inCommunicationLanguageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCommunicationLanguageGenericDetailSerialNum property.
     * 
     */
    public void setInCommunicationLanguageGenericDetailSerialNum(int value) {
        this.inCommunicationLanguageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inCustomerNoAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerNoAfm() {
        return inCustomerNoAfm;
    }

    /**
     * Sets the value of the inCustomerNoAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerNoAfm(String value) {
        this.inCustomerNoAfm = value;
    }

}
