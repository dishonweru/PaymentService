
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrmSearchCustPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrmSearchCustPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAccountCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount10Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount11Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount12Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount13" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount13Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount14" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount14Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount15Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount16" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount16Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount17" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount17Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount18" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount18Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount19" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount19Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount1Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount20" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount20Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount21" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount21Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount22" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount22Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount23" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount23Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount24" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount24Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount25" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount25Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount26" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount26Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount27" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount27Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount28" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount28Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount29" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount29Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount2Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount30" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount30Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount3Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount4Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount5Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount6Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount7Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount8Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionAmount9Lc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCurrencyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCustCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCustFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCustSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate11" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate12" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate13" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate14" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate15" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate16" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate17" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate18" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate19" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate20" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate21" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate22" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate23" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate24" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate25" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionEntrySn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionEntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFixingRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag08" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag09" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber10" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber11" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber12" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber13" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber14" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber15" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber16" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber17" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber18" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber19" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber20" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber21" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber22" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber23" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber24" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber25" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionNumber9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPercentage9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionProblemDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionProblemRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionProductDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionSpecAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionText9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSearchCustPositionUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrmSearchCustPosition", propOrder = {
    "outGrpOutGrmSearchCustPositionAccountCd",
    "outGrpOutGrmSearchCustPositionAccountNumber",
    "outGrpOutGrmSearchCustPositionAmount1",
    "outGrpOutGrmSearchCustPositionAmount10",
    "outGrpOutGrmSearchCustPositionAmount10Lc",
    "outGrpOutGrmSearchCustPositionAmount11",
    "outGrpOutGrmSearchCustPositionAmount11Lc",
    "outGrpOutGrmSearchCustPositionAmount12",
    "outGrpOutGrmSearchCustPositionAmount12Lc",
    "outGrpOutGrmSearchCustPositionAmount13",
    "outGrpOutGrmSearchCustPositionAmount13Lc",
    "outGrpOutGrmSearchCustPositionAmount14",
    "outGrpOutGrmSearchCustPositionAmount14Lc",
    "outGrpOutGrmSearchCustPositionAmount15",
    "outGrpOutGrmSearchCustPositionAmount15Lc",
    "outGrpOutGrmSearchCustPositionAmount16",
    "outGrpOutGrmSearchCustPositionAmount16Lc",
    "outGrpOutGrmSearchCustPositionAmount17",
    "outGrpOutGrmSearchCustPositionAmount17Lc",
    "outGrpOutGrmSearchCustPositionAmount18",
    "outGrpOutGrmSearchCustPositionAmount18Lc",
    "outGrpOutGrmSearchCustPositionAmount19",
    "outGrpOutGrmSearchCustPositionAmount19Lc",
    "outGrpOutGrmSearchCustPositionAmount1Lc",
    "outGrpOutGrmSearchCustPositionAmount2",
    "outGrpOutGrmSearchCustPositionAmount20",
    "outGrpOutGrmSearchCustPositionAmount20Lc",
    "outGrpOutGrmSearchCustPositionAmount21",
    "outGrpOutGrmSearchCustPositionAmount21Lc",
    "outGrpOutGrmSearchCustPositionAmount22",
    "outGrpOutGrmSearchCustPositionAmount22Lc",
    "outGrpOutGrmSearchCustPositionAmount23",
    "outGrpOutGrmSearchCustPositionAmount23Lc",
    "outGrpOutGrmSearchCustPositionAmount24",
    "outGrpOutGrmSearchCustPositionAmount24Lc",
    "outGrpOutGrmSearchCustPositionAmount25",
    "outGrpOutGrmSearchCustPositionAmount25Lc",
    "outGrpOutGrmSearchCustPositionAmount26",
    "outGrpOutGrmSearchCustPositionAmount26Lc",
    "outGrpOutGrmSearchCustPositionAmount27",
    "outGrpOutGrmSearchCustPositionAmount27Lc",
    "outGrpOutGrmSearchCustPositionAmount28",
    "outGrpOutGrmSearchCustPositionAmount28Lc",
    "outGrpOutGrmSearchCustPositionAmount29",
    "outGrpOutGrmSearchCustPositionAmount29Lc",
    "outGrpOutGrmSearchCustPositionAmount2Lc",
    "outGrpOutGrmSearchCustPositionAmount3",
    "outGrpOutGrmSearchCustPositionAmount30",
    "outGrpOutGrmSearchCustPositionAmount30Lc",
    "outGrpOutGrmSearchCustPositionAmount3Lc",
    "outGrpOutGrmSearchCustPositionAmount4",
    "outGrpOutGrmSearchCustPositionAmount4Lc",
    "outGrpOutGrmSearchCustPositionAmount5",
    "outGrpOutGrmSearchCustPositionAmount5Lc",
    "outGrpOutGrmSearchCustPositionAmount6",
    "outGrpOutGrmSearchCustPositionAmount6Lc",
    "outGrpOutGrmSearchCustPositionAmount7",
    "outGrpOutGrmSearchCustPositionAmount7Lc",
    "outGrpOutGrmSearchCustPositionAmount8",
    "outGrpOutGrmSearchCustPositionAmount8Lc",
    "outGrpOutGrmSearchCustPositionAmount9",
    "outGrpOutGrmSearchCustPositionAmount9Lc",
    "outGrpOutGrmSearchCustPositionCurrencyDesc",
    "outGrpOutGrmSearchCustPositionCurrencyId",
    "outGrpOutGrmSearchCustPositionCustCd",
    "outGrpOutGrmSearchCustPositionCustFirstName",
    "outGrpOutGrmSearchCustPositionCustId",
    "outGrpOutGrmSearchCustPositionCustSurname",
    "outGrpOutGrmSearchCustPositionCustType",
    "outGrpOutGrmSearchCustPositionDate1",
    "outGrpOutGrmSearchCustPositionDate10",
    "outGrpOutGrmSearchCustPositionDate11",
    "outGrpOutGrmSearchCustPositionDate12",
    "outGrpOutGrmSearchCustPositionDate13",
    "outGrpOutGrmSearchCustPositionDate14",
    "outGrpOutGrmSearchCustPositionDate15",
    "outGrpOutGrmSearchCustPositionDate16",
    "outGrpOutGrmSearchCustPositionDate17",
    "outGrpOutGrmSearchCustPositionDate18",
    "outGrpOutGrmSearchCustPositionDate19",
    "outGrpOutGrmSearchCustPositionDate2",
    "outGrpOutGrmSearchCustPositionDate20",
    "outGrpOutGrmSearchCustPositionDate21",
    "outGrpOutGrmSearchCustPositionDate22",
    "outGrpOutGrmSearchCustPositionDate23",
    "outGrpOutGrmSearchCustPositionDate24",
    "outGrpOutGrmSearchCustPositionDate25",
    "outGrpOutGrmSearchCustPositionDate3",
    "outGrpOutGrmSearchCustPositionDate4",
    "outGrpOutGrmSearchCustPositionDate5",
    "outGrpOutGrmSearchCustPositionDate6",
    "outGrpOutGrmSearchCustPositionDate7",
    "outGrpOutGrmSearchCustPositionDate8",
    "outGrpOutGrmSearchCustPositionDate9",
    "outGrpOutGrmSearchCustPositionEntrySn",
    "outGrpOutGrmSearchCustPositionEntryType",
    "outGrpOutGrmSearchCustPositionFixingRate",
    "outGrpOutGrmSearchCustPositionFlag01",
    "outGrpOutGrmSearchCustPositionFlag02",
    "outGrpOutGrmSearchCustPositionFlag03",
    "outGrpOutGrmSearchCustPositionFlag04",
    "outGrpOutGrmSearchCustPositionFlag05",
    "outGrpOutGrmSearchCustPositionFlag06",
    "outGrpOutGrmSearchCustPositionFlag07",
    "outGrpOutGrmSearchCustPositionFlag08",
    "outGrpOutGrmSearchCustPositionFlag09",
    "outGrpOutGrmSearchCustPositionFlag10",
    "outGrpOutGrmSearchCustPositionNumber1",
    "outGrpOutGrmSearchCustPositionNumber10",
    "outGrpOutGrmSearchCustPositionNumber11",
    "outGrpOutGrmSearchCustPositionNumber12",
    "outGrpOutGrmSearchCustPositionNumber13",
    "outGrpOutGrmSearchCustPositionNumber14",
    "outGrpOutGrmSearchCustPositionNumber15",
    "outGrpOutGrmSearchCustPositionNumber16",
    "outGrpOutGrmSearchCustPositionNumber17",
    "outGrpOutGrmSearchCustPositionNumber18",
    "outGrpOutGrmSearchCustPositionNumber19",
    "outGrpOutGrmSearchCustPositionNumber2",
    "outGrpOutGrmSearchCustPositionNumber20",
    "outGrpOutGrmSearchCustPositionNumber21",
    "outGrpOutGrmSearchCustPositionNumber22",
    "outGrpOutGrmSearchCustPositionNumber23",
    "outGrpOutGrmSearchCustPositionNumber24",
    "outGrpOutGrmSearchCustPositionNumber25",
    "outGrpOutGrmSearchCustPositionNumber3",
    "outGrpOutGrmSearchCustPositionNumber4",
    "outGrpOutGrmSearchCustPositionNumber5",
    "outGrpOutGrmSearchCustPositionNumber6",
    "outGrpOutGrmSearchCustPositionNumber7",
    "outGrpOutGrmSearchCustPositionNumber8",
    "outGrpOutGrmSearchCustPositionNumber9",
    "outGrpOutGrmSearchCustPositionPercentage1",
    "outGrpOutGrmSearchCustPositionPercentage10",
    "outGrpOutGrmSearchCustPositionPercentage2",
    "outGrpOutGrmSearchCustPositionPercentage3",
    "outGrpOutGrmSearchCustPositionPercentage4",
    "outGrpOutGrmSearchCustPositionPercentage5",
    "outGrpOutGrmSearchCustPositionPercentage6",
    "outGrpOutGrmSearchCustPositionPercentage7",
    "outGrpOutGrmSearchCustPositionPercentage8",
    "outGrpOutGrmSearchCustPositionPercentage9",
    "outGrpOutGrmSearchCustPositionPrftSystem",
    "outGrpOutGrmSearchCustPositionProblemDescr",
    "outGrpOutGrmSearchCustPositionProblemRecord",
    "outGrpOutGrmSearchCustPositionProductDesc",
    "outGrpOutGrmSearchCustPositionProductId",
    "outGrpOutGrmSearchCustPositionSpecAgrFlg",
    "outGrpOutGrmSearchCustPositionText1",
    "outGrpOutGrmSearchCustPositionText10",
    "outGrpOutGrmSearchCustPositionText11",
    "outGrpOutGrmSearchCustPositionText12",
    "outGrpOutGrmSearchCustPositionText13",
    "outGrpOutGrmSearchCustPositionText14",
    "outGrpOutGrmSearchCustPositionText15",
    "outGrpOutGrmSearchCustPositionText16",
    "outGrpOutGrmSearchCustPositionText17",
    "outGrpOutGrmSearchCustPositionText18",
    "outGrpOutGrmSearchCustPositionText19",
    "outGrpOutGrmSearchCustPositionText2",
    "outGrpOutGrmSearchCustPositionText20",
    "outGrpOutGrmSearchCustPositionText21",
    "outGrpOutGrmSearchCustPositionText22",
    "outGrpOutGrmSearchCustPositionText23",
    "outGrpOutGrmSearchCustPositionText24",
    "outGrpOutGrmSearchCustPositionText25",
    "outGrpOutGrmSearchCustPositionText26",
    "outGrpOutGrmSearchCustPositionText27",
    "outGrpOutGrmSearchCustPositionText28",
    "outGrpOutGrmSearchCustPositionText29",
    "outGrpOutGrmSearchCustPositionText3",
    "outGrpOutGrmSearchCustPositionText30",
    "outGrpOutGrmSearchCustPositionText4",
    "outGrpOutGrmSearchCustPositionText5",
    "outGrpOutGrmSearchCustPositionText6",
    "outGrpOutGrmSearchCustPositionText7",
    "outGrpOutGrmSearchCustPositionText8",
    "outGrpOutGrmSearchCustPositionText9",
    "outGrpOutGrmSearchCustPositionTmstamp",
    "outGrpOutGrmSearchCustPositionUnitCode",
    "outGrpOutGrmSearchCustPositionUnitName"
})
public class OutGrmSearchCustPosition {

    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAccountCd")
    protected int outGrpOutGrmSearchCustPositionAccountCd;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAccountNumber")
    protected String outGrpOutGrmSearchCustPositionAccountNumber;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount1", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount1;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount10", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount10;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount10Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount10Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount11", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount11;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount11Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount11Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount12", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount12;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount12Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount12Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount13", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount13;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount13Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount13Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount14", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount14;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount14Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount14Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount15", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount15;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount15Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount15Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount16", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount16;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount16Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount16Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount17", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount17;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount17Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount17Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount18", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount18;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount18Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount18Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount19", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount19;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount19Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount19Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount1Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount1Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount2", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount2;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount20", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount20;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount20Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount20Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount21", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount21;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount21Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount21Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount22", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount22;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount22Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount22Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount23", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount23;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount23Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount23Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount24", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount24;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount24Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount24Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount25", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount25;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount25Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount25Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount26", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount26;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount26Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount26Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount27", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount27;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount27Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount27Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount28", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount28;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount28Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount28Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount29", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount29;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount29Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount29Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount2Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount2Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount3", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount3;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount30", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount30;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount30Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount30Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount3Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount3Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount4", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount4;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount4Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount4Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount5", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount5;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount5Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount5Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount6", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount6;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount6Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount6Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount7", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount7;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount7Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount7Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount8", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount8;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount8Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount8Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount9", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount9;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionAmount9Lc", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionAmount9Lc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCurrencyDesc")
    protected String outGrpOutGrmSearchCustPositionCurrencyDesc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCurrencyId")
    protected int outGrpOutGrmSearchCustPositionCurrencyId;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCustCd")
    protected short outGrpOutGrmSearchCustPositionCustCd;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCustFirstName")
    protected String outGrpOutGrmSearchCustPositionCustFirstName;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCustId")
    protected int outGrpOutGrmSearchCustPositionCustId;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCustSurname")
    protected String outGrpOutGrmSearchCustPositionCustSurname;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionCustType")
    protected String outGrpOutGrmSearchCustPositionCustType;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate1;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate10;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate11", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate11;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate12", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate12;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate13", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate13;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate14;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate15", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate15;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate16", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate16;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate17", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate17;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate18", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate18;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate19", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate19;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate2;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate20", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate20;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate21", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate21;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate22", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate22;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate23", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate23;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate24", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate24;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate25", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate25;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate3;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate4;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate5;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate6;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate7;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate8;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionDate9;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionEntrySn")
    protected int outGrpOutGrmSearchCustPositionEntrySn;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionEntryType")
    protected String outGrpOutGrmSearchCustPositionEntryType;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFixingRate", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionFixingRate;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag01")
    protected String outGrpOutGrmSearchCustPositionFlag01;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag02")
    protected String outGrpOutGrmSearchCustPositionFlag02;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag03")
    protected String outGrpOutGrmSearchCustPositionFlag03;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag04")
    protected String outGrpOutGrmSearchCustPositionFlag04;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag05")
    protected String outGrpOutGrmSearchCustPositionFlag05;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag06")
    protected String outGrpOutGrmSearchCustPositionFlag06;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag07")
    protected String outGrpOutGrmSearchCustPositionFlag07;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag08")
    protected String outGrpOutGrmSearchCustPositionFlag08;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag09")
    protected String outGrpOutGrmSearchCustPositionFlag09;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionFlag10")
    protected String outGrpOutGrmSearchCustPositionFlag10;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber1")
    protected double outGrpOutGrmSearchCustPositionNumber1;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber10")
    protected double outGrpOutGrmSearchCustPositionNumber10;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber11")
    protected double outGrpOutGrmSearchCustPositionNumber11;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber12")
    protected double outGrpOutGrmSearchCustPositionNumber12;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber13")
    protected double outGrpOutGrmSearchCustPositionNumber13;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber14")
    protected double outGrpOutGrmSearchCustPositionNumber14;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber15")
    protected double outGrpOutGrmSearchCustPositionNumber15;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber16")
    protected double outGrpOutGrmSearchCustPositionNumber16;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber17")
    protected double outGrpOutGrmSearchCustPositionNumber17;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber18")
    protected double outGrpOutGrmSearchCustPositionNumber18;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber19")
    protected double outGrpOutGrmSearchCustPositionNumber19;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber2")
    protected double outGrpOutGrmSearchCustPositionNumber2;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber20")
    protected double outGrpOutGrmSearchCustPositionNumber20;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber21")
    protected double outGrpOutGrmSearchCustPositionNumber21;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber22")
    protected double outGrpOutGrmSearchCustPositionNumber22;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber23")
    protected double outGrpOutGrmSearchCustPositionNumber23;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber24")
    protected double outGrpOutGrmSearchCustPositionNumber24;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber25")
    protected double outGrpOutGrmSearchCustPositionNumber25;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber3")
    protected double outGrpOutGrmSearchCustPositionNumber3;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber4")
    protected double outGrpOutGrmSearchCustPositionNumber4;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber5")
    protected double outGrpOutGrmSearchCustPositionNumber5;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber6")
    protected double outGrpOutGrmSearchCustPositionNumber6;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber7")
    protected double outGrpOutGrmSearchCustPositionNumber7;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber8")
    protected double outGrpOutGrmSearchCustPositionNumber8;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionNumber9")
    protected double outGrpOutGrmSearchCustPositionNumber9;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage1", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage1;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage10", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage10;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage2", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage2;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage3", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage3;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage4", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage4;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage5", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage5;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage6", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage6;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage7", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage7;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage8", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage8;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPercentage9", required = true)
    protected BigDecimal outGrpOutGrmSearchCustPositionPercentage9;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionPrftSystem")
    protected short outGrpOutGrmSearchCustPositionPrftSystem;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionProblemDescr")
    protected String outGrpOutGrmSearchCustPositionProblemDescr;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionProblemRecord")
    protected String outGrpOutGrmSearchCustPositionProblemRecord;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionProductDesc")
    protected String outGrpOutGrmSearchCustPositionProductDesc;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionProductId")
    protected int outGrpOutGrmSearchCustPositionProductId;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionSpecAgrFlg")
    protected String outGrpOutGrmSearchCustPositionSpecAgrFlg;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText1")
    protected String outGrpOutGrmSearchCustPositionText1;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText10")
    protected String outGrpOutGrmSearchCustPositionText10;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText11")
    protected String outGrpOutGrmSearchCustPositionText11;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText12")
    protected String outGrpOutGrmSearchCustPositionText12;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText13")
    protected String outGrpOutGrmSearchCustPositionText13;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText14")
    protected String outGrpOutGrmSearchCustPositionText14;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText15")
    protected String outGrpOutGrmSearchCustPositionText15;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText16")
    protected String outGrpOutGrmSearchCustPositionText16;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText17")
    protected String outGrpOutGrmSearchCustPositionText17;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText18")
    protected String outGrpOutGrmSearchCustPositionText18;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText19")
    protected String outGrpOutGrmSearchCustPositionText19;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText2")
    protected String outGrpOutGrmSearchCustPositionText2;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText20")
    protected String outGrpOutGrmSearchCustPositionText20;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText21")
    protected String outGrpOutGrmSearchCustPositionText21;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText22")
    protected String outGrpOutGrmSearchCustPositionText22;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText23")
    protected String outGrpOutGrmSearchCustPositionText23;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText24")
    protected String outGrpOutGrmSearchCustPositionText24;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText25")
    protected String outGrpOutGrmSearchCustPositionText25;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText26")
    protected String outGrpOutGrmSearchCustPositionText26;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText27")
    protected String outGrpOutGrmSearchCustPositionText27;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText28")
    protected String outGrpOutGrmSearchCustPositionText28;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText29")
    protected String outGrpOutGrmSearchCustPositionText29;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText3")
    protected String outGrpOutGrmSearchCustPositionText3;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText30")
    protected String outGrpOutGrmSearchCustPositionText30;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText4")
    protected String outGrpOutGrmSearchCustPositionText4;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText5")
    protected String outGrpOutGrmSearchCustPositionText5;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText6")
    protected String outGrpOutGrmSearchCustPositionText6;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText7")
    protected String outGrpOutGrmSearchCustPositionText7;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText8")
    protected String outGrpOutGrmSearchCustPositionText8;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionText9")
    protected String outGrpOutGrmSearchCustPositionText9;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSearchCustPositionTmstamp;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionUnitCode")
    protected int outGrpOutGrmSearchCustPositionUnitCode;
    @XmlElement(name = "OutGrpOutGrmSearchCustPositionUnitName")
    protected String outGrpOutGrmSearchCustPositionUnitName;

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAccountCd property.
     * 
     */
    public int getOutGrpOutGrmSearchCustPositionAccountCd() {
        return outGrpOutGrmSearchCustPositionAccountCd;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAccountCd property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionAccountCd(int value) {
        this.outGrpOutGrmSearchCustPositionAccountCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionAccountNumber() {
        return outGrpOutGrmSearchCustPositionAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAccountNumber(String value) {
        this.outGrpOutGrmSearchCustPositionAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount1() {
        return outGrpOutGrmSearchCustPositionAmount1;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount1(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount10() {
        return outGrpOutGrmSearchCustPositionAmount10;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount10(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount10 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount10Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount10Lc() {
        return outGrpOutGrmSearchCustPositionAmount10Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount10Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount10Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount10Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount11() {
        return outGrpOutGrmSearchCustPositionAmount11;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount11(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount11 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount11Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount11Lc() {
        return outGrpOutGrmSearchCustPositionAmount11Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount11Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount11Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount11Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount12() {
        return outGrpOutGrmSearchCustPositionAmount12;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount12(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount12 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount12Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount12Lc() {
        return outGrpOutGrmSearchCustPositionAmount12Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount12Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount12Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount12Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount13() {
        return outGrpOutGrmSearchCustPositionAmount13;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount13(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount13 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount13Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount13Lc() {
        return outGrpOutGrmSearchCustPositionAmount13Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount13Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount13Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount13Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount14() {
        return outGrpOutGrmSearchCustPositionAmount14;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount14(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount14 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount14Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount14Lc() {
        return outGrpOutGrmSearchCustPositionAmount14Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount14Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount14Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount14Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount15() {
        return outGrpOutGrmSearchCustPositionAmount15;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount15(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount15 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount15Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount15Lc() {
        return outGrpOutGrmSearchCustPositionAmount15Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount15Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount15Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount15Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount16 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount16() {
        return outGrpOutGrmSearchCustPositionAmount16;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount16(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount16 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount16Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount16Lc() {
        return outGrpOutGrmSearchCustPositionAmount16Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount16Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount16Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount16Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount17 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount17() {
        return outGrpOutGrmSearchCustPositionAmount17;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount17(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount17 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount17Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount17Lc() {
        return outGrpOutGrmSearchCustPositionAmount17Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount17Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount17Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount17Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount18 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount18() {
        return outGrpOutGrmSearchCustPositionAmount18;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount18(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount18 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount18Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount18Lc() {
        return outGrpOutGrmSearchCustPositionAmount18Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount18Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount18Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount18Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount19 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount19() {
        return outGrpOutGrmSearchCustPositionAmount19;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount19(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount19 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount19Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount19Lc() {
        return outGrpOutGrmSearchCustPositionAmount19Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount19Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount19Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount19Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount1Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount1Lc() {
        return outGrpOutGrmSearchCustPositionAmount1Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount1Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount1Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount1Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount2() {
        return outGrpOutGrmSearchCustPositionAmount2;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount2(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount20 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount20() {
        return outGrpOutGrmSearchCustPositionAmount20;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount20(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount20Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount20Lc() {
        return outGrpOutGrmSearchCustPositionAmount20Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount20Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount20Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount20Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount21 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount21() {
        return outGrpOutGrmSearchCustPositionAmount21;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount21(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount21 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount21Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount21Lc() {
        return outGrpOutGrmSearchCustPositionAmount21Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount21Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount21Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount21Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount22 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount22() {
        return outGrpOutGrmSearchCustPositionAmount22;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount22(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount22 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount22Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount22Lc() {
        return outGrpOutGrmSearchCustPositionAmount22Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount22Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount22Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount22Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount23 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount23() {
        return outGrpOutGrmSearchCustPositionAmount23;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount23(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount23 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount23Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount23Lc() {
        return outGrpOutGrmSearchCustPositionAmount23Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount23Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount23Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount23Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount24 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount24() {
        return outGrpOutGrmSearchCustPositionAmount24;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount24(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount24 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount24Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount24Lc() {
        return outGrpOutGrmSearchCustPositionAmount24Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount24Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount24Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount24Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount25 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount25() {
        return outGrpOutGrmSearchCustPositionAmount25;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount25(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount25Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount25Lc() {
        return outGrpOutGrmSearchCustPositionAmount25Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount25Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount25Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount25Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount26 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount26() {
        return outGrpOutGrmSearchCustPositionAmount26;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount26(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount26 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount26Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount26Lc() {
        return outGrpOutGrmSearchCustPositionAmount26Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount26Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount26Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount26Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount27 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount27() {
        return outGrpOutGrmSearchCustPositionAmount27;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount27(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount27 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount27Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount27Lc() {
        return outGrpOutGrmSearchCustPositionAmount27Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount27Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount27Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount27Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount28 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount28() {
        return outGrpOutGrmSearchCustPositionAmount28;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount28(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount28 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount28Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount28Lc() {
        return outGrpOutGrmSearchCustPositionAmount28Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount28Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount28Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount28Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount29 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount29() {
        return outGrpOutGrmSearchCustPositionAmount29;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount29(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount29 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount29Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount29Lc() {
        return outGrpOutGrmSearchCustPositionAmount29Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount29Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount29Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount29Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount2Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount2Lc() {
        return outGrpOutGrmSearchCustPositionAmount2Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount2Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount2Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount2Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount3() {
        return outGrpOutGrmSearchCustPositionAmount3;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount3(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount3 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount30 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount30() {
        return outGrpOutGrmSearchCustPositionAmount30;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount30(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount30 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount30Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount30Lc() {
        return outGrpOutGrmSearchCustPositionAmount30Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount30Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount30Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount30Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount3Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount3Lc() {
        return outGrpOutGrmSearchCustPositionAmount3Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount3Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount3Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount3Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount4() {
        return outGrpOutGrmSearchCustPositionAmount4;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount4(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount4 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount4Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount4Lc() {
        return outGrpOutGrmSearchCustPositionAmount4Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount4Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount4Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount4Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount5() {
        return outGrpOutGrmSearchCustPositionAmount5;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount5(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount5 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount5Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount5Lc() {
        return outGrpOutGrmSearchCustPositionAmount5Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount5Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount5Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount5Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount6() {
        return outGrpOutGrmSearchCustPositionAmount6;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount6(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount6 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount6Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount6Lc() {
        return outGrpOutGrmSearchCustPositionAmount6Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount6Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount6Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount6Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount7() {
        return outGrpOutGrmSearchCustPositionAmount7;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount7(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount7 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount7Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount7Lc() {
        return outGrpOutGrmSearchCustPositionAmount7Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount7Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount7Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount7Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount8() {
        return outGrpOutGrmSearchCustPositionAmount8;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount8(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount8 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount8Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount8Lc() {
        return outGrpOutGrmSearchCustPositionAmount8Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount8Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount8Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount8Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount9() {
        return outGrpOutGrmSearchCustPositionAmount9;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount9(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount9 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionAmount9Lc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionAmount9Lc() {
        return outGrpOutGrmSearchCustPositionAmount9Lc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionAmount9Lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionAmount9Lc(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionAmount9Lc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCurrencyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionCurrencyDesc() {
        return outGrpOutGrmSearchCustPositionCurrencyDesc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCurrencyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionCurrencyDesc(String value) {
        this.outGrpOutGrmSearchCustPositionCurrencyDesc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCurrencyId property.
     * 
     */
    public int getOutGrpOutGrmSearchCustPositionCurrencyId() {
        return outGrpOutGrmSearchCustPositionCurrencyId;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCurrencyId property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionCurrencyId(int value) {
        this.outGrpOutGrmSearchCustPositionCurrencyId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCustCd property.
     * 
     */
    public short getOutGrpOutGrmSearchCustPositionCustCd() {
        return outGrpOutGrmSearchCustPositionCustCd;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCustCd property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionCustCd(short value) {
        this.outGrpOutGrmSearchCustPositionCustCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCustFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionCustFirstName() {
        return outGrpOutGrmSearchCustPositionCustFirstName;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCustFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionCustFirstName(String value) {
        this.outGrpOutGrmSearchCustPositionCustFirstName = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCustId property.
     * 
     */
    public int getOutGrpOutGrmSearchCustPositionCustId() {
        return outGrpOutGrmSearchCustPositionCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCustId property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionCustId(int value) {
        this.outGrpOutGrmSearchCustPositionCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCustSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionCustSurname() {
        return outGrpOutGrmSearchCustPositionCustSurname;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCustSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionCustSurname(String value) {
        this.outGrpOutGrmSearchCustPositionCustSurname = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionCustType() {
        return outGrpOutGrmSearchCustPositionCustType;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionCustType(String value) {
        this.outGrpOutGrmSearchCustPositionCustType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate1() {
        return outGrpOutGrmSearchCustPositionDate1;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate1(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate10() {
        return outGrpOutGrmSearchCustPositionDate10;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate10(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate10 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate11() {
        return outGrpOutGrmSearchCustPositionDate11;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate11(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate11 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate12() {
        return outGrpOutGrmSearchCustPositionDate12;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate12(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate12 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate13() {
        return outGrpOutGrmSearchCustPositionDate13;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate13(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate13 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate14() {
        return outGrpOutGrmSearchCustPositionDate14;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate14(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate14 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate15() {
        return outGrpOutGrmSearchCustPositionDate15;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate15(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate15 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate16 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate16() {
        return outGrpOutGrmSearchCustPositionDate16;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate16(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate16 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate17 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate17() {
        return outGrpOutGrmSearchCustPositionDate17;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate17(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate17 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate18 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate18() {
        return outGrpOutGrmSearchCustPositionDate18;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate18(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate18 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate19 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate19() {
        return outGrpOutGrmSearchCustPositionDate19;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate19(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate19 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate2() {
        return outGrpOutGrmSearchCustPositionDate2;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate2(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate20 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate20() {
        return outGrpOutGrmSearchCustPositionDate20;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate20(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate21 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate21() {
        return outGrpOutGrmSearchCustPositionDate21;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate21(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate21 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate22 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate22() {
        return outGrpOutGrmSearchCustPositionDate22;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate22(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate22 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate23 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate23() {
        return outGrpOutGrmSearchCustPositionDate23;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate23(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate23 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate24 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate24() {
        return outGrpOutGrmSearchCustPositionDate24;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate24(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate24 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate25 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate25() {
        return outGrpOutGrmSearchCustPositionDate25;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate25(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate3() {
        return outGrpOutGrmSearchCustPositionDate3;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate3(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate3 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate4() {
        return outGrpOutGrmSearchCustPositionDate4;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate4(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate4 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate5() {
        return outGrpOutGrmSearchCustPositionDate5;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate5(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate5 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate6() {
        return outGrpOutGrmSearchCustPositionDate6;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate6(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate6 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate7() {
        return outGrpOutGrmSearchCustPositionDate7;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate7(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate7 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate8() {
        return outGrpOutGrmSearchCustPositionDate8;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate8(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate8 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionDate9() {
        return outGrpOutGrmSearchCustPositionDate9;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionDate9(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionDate9 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionEntrySn property.
     * 
     */
    public int getOutGrpOutGrmSearchCustPositionEntrySn() {
        return outGrpOutGrmSearchCustPositionEntrySn;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionEntrySn property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionEntrySn(int value) {
        this.outGrpOutGrmSearchCustPositionEntrySn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionEntryType() {
        return outGrpOutGrmSearchCustPositionEntryType;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionEntryType(String value) {
        this.outGrpOutGrmSearchCustPositionEntryType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFixingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionFixingRate() {
        return outGrpOutGrmSearchCustPositionFixingRate;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFixingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFixingRate(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionFixingRate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag01() {
        return outGrpOutGrmSearchCustPositionFlag01;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag01(String value) {
        this.outGrpOutGrmSearchCustPositionFlag01 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag02() {
        return outGrpOutGrmSearchCustPositionFlag02;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag02(String value) {
        this.outGrpOutGrmSearchCustPositionFlag02 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag03() {
        return outGrpOutGrmSearchCustPositionFlag03;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag03(String value) {
        this.outGrpOutGrmSearchCustPositionFlag03 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag04() {
        return outGrpOutGrmSearchCustPositionFlag04;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag04(String value) {
        this.outGrpOutGrmSearchCustPositionFlag04 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag05() {
        return outGrpOutGrmSearchCustPositionFlag05;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag05(String value) {
        this.outGrpOutGrmSearchCustPositionFlag05 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag06() {
        return outGrpOutGrmSearchCustPositionFlag06;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag06(String value) {
        this.outGrpOutGrmSearchCustPositionFlag06 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag07() {
        return outGrpOutGrmSearchCustPositionFlag07;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag07(String value) {
        this.outGrpOutGrmSearchCustPositionFlag07 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag08() {
        return outGrpOutGrmSearchCustPositionFlag08;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag08(String value) {
        this.outGrpOutGrmSearchCustPositionFlag08 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag09() {
        return outGrpOutGrmSearchCustPositionFlag09;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag09(String value) {
        this.outGrpOutGrmSearchCustPositionFlag09 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionFlag10() {
        return outGrpOutGrmSearchCustPositionFlag10;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionFlag10(String value) {
        this.outGrpOutGrmSearchCustPositionFlag10 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber1 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber1() {
        return outGrpOutGrmSearchCustPositionNumber1;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber1 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber1(double value) {
        this.outGrpOutGrmSearchCustPositionNumber1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber10 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber10() {
        return outGrpOutGrmSearchCustPositionNumber10;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber10 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber10(double value) {
        this.outGrpOutGrmSearchCustPositionNumber10 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber11 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber11() {
        return outGrpOutGrmSearchCustPositionNumber11;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber11 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber11(double value) {
        this.outGrpOutGrmSearchCustPositionNumber11 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber12 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber12() {
        return outGrpOutGrmSearchCustPositionNumber12;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber12 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber12(double value) {
        this.outGrpOutGrmSearchCustPositionNumber12 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber13 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber13() {
        return outGrpOutGrmSearchCustPositionNumber13;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber13 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber13(double value) {
        this.outGrpOutGrmSearchCustPositionNumber13 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber14 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber14() {
        return outGrpOutGrmSearchCustPositionNumber14;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber14 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber14(double value) {
        this.outGrpOutGrmSearchCustPositionNumber14 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber15 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber15() {
        return outGrpOutGrmSearchCustPositionNumber15;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber15 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber15(double value) {
        this.outGrpOutGrmSearchCustPositionNumber15 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber16 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber16() {
        return outGrpOutGrmSearchCustPositionNumber16;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber16 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber16(double value) {
        this.outGrpOutGrmSearchCustPositionNumber16 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber17 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber17() {
        return outGrpOutGrmSearchCustPositionNumber17;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber17 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber17(double value) {
        this.outGrpOutGrmSearchCustPositionNumber17 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber18 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber18() {
        return outGrpOutGrmSearchCustPositionNumber18;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber18 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber18(double value) {
        this.outGrpOutGrmSearchCustPositionNumber18 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber19 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber19() {
        return outGrpOutGrmSearchCustPositionNumber19;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber19 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber19(double value) {
        this.outGrpOutGrmSearchCustPositionNumber19 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber2 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber2() {
        return outGrpOutGrmSearchCustPositionNumber2;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber2 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber2(double value) {
        this.outGrpOutGrmSearchCustPositionNumber2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber20 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber20() {
        return outGrpOutGrmSearchCustPositionNumber20;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber20 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber20(double value) {
        this.outGrpOutGrmSearchCustPositionNumber20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber21 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber21() {
        return outGrpOutGrmSearchCustPositionNumber21;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber21 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber21(double value) {
        this.outGrpOutGrmSearchCustPositionNumber21 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber22 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber22() {
        return outGrpOutGrmSearchCustPositionNumber22;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber22 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber22(double value) {
        this.outGrpOutGrmSearchCustPositionNumber22 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber23 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber23() {
        return outGrpOutGrmSearchCustPositionNumber23;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber23 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber23(double value) {
        this.outGrpOutGrmSearchCustPositionNumber23 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber24 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber24() {
        return outGrpOutGrmSearchCustPositionNumber24;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber24 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber24(double value) {
        this.outGrpOutGrmSearchCustPositionNumber24 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber25 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber25() {
        return outGrpOutGrmSearchCustPositionNumber25;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber25 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber25(double value) {
        this.outGrpOutGrmSearchCustPositionNumber25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber3 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber3() {
        return outGrpOutGrmSearchCustPositionNumber3;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber3 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber3(double value) {
        this.outGrpOutGrmSearchCustPositionNumber3 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber4 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber4() {
        return outGrpOutGrmSearchCustPositionNumber4;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber4 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber4(double value) {
        this.outGrpOutGrmSearchCustPositionNumber4 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber5 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber5() {
        return outGrpOutGrmSearchCustPositionNumber5;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber5 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber5(double value) {
        this.outGrpOutGrmSearchCustPositionNumber5 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber6 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber6() {
        return outGrpOutGrmSearchCustPositionNumber6;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber6 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber6(double value) {
        this.outGrpOutGrmSearchCustPositionNumber6 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber7 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber7() {
        return outGrpOutGrmSearchCustPositionNumber7;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber7 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber7(double value) {
        this.outGrpOutGrmSearchCustPositionNumber7 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber8 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber8() {
        return outGrpOutGrmSearchCustPositionNumber8;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber8 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber8(double value) {
        this.outGrpOutGrmSearchCustPositionNumber8 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionNumber9 property.
     * 
     */
    public double getOutGrpOutGrmSearchCustPositionNumber9() {
        return outGrpOutGrmSearchCustPositionNumber9;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionNumber9 property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionNumber9(double value) {
        this.outGrpOutGrmSearchCustPositionNumber9 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage1() {
        return outGrpOutGrmSearchCustPositionPercentage1;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage1(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage10() {
        return outGrpOutGrmSearchCustPositionPercentage10;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage10(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage10 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage2() {
        return outGrpOutGrmSearchCustPositionPercentage2;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage2(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage3() {
        return outGrpOutGrmSearchCustPositionPercentage3;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage3(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage3 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage4() {
        return outGrpOutGrmSearchCustPositionPercentage4;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage4(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage4 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage5() {
        return outGrpOutGrmSearchCustPositionPercentage5;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage5(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage5 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage6() {
        return outGrpOutGrmSearchCustPositionPercentage6;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage6(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage6 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage7() {
        return outGrpOutGrmSearchCustPositionPercentage7;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage7(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage7 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage8() {
        return outGrpOutGrmSearchCustPositionPercentage8;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage8(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage8 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPercentage9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSearchCustPositionPercentage9() {
        return outGrpOutGrmSearchCustPositionPercentage9;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPercentage9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionPercentage9(BigDecimal value) {
        this.outGrpOutGrmSearchCustPositionPercentage9 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionPrftSystem property.
     * 
     */
    public short getOutGrpOutGrmSearchCustPositionPrftSystem() {
        return outGrpOutGrmSearchCustPositionPrftSystem;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionPrftSystem property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionPrftSystem(short value) {
        this.outGrpOutGrmSearchCustPositionPrftSystem = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionProblemDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionProblemDescr() {
        return outGrpOutGrmSearchCustPositionProblemDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionProblemDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionProblemDescr(String value) {
        this.outGrpOutGrmSearchCustPositionProblemDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionProblemRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionProblemRecord() {
        return outGrpOutGrmSearchCustPositionProblemRecord;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionProblemRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionProblemRecord(String value) {
        this.outGrpOutGrmSearchCustPositionProblemRecord = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionProductDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionProductDesc() {
        return outGrpOutGrmSearchCustPositionProductDesc;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionProductDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionProductDesc(String value) {
        this.outGrpOutGrmSearchCustPositionProductDesc = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionProductId property.
     * 
     */
    public int getOutGrpOutGrmSearchCustPositionProductId() {
        return outGrpOutGrmSearchCustPositionProductId;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionProductId property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionProductId(int value) {
        this.outGrpOutGrmSearchCustPositionProductId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionSpecAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionSpecAgrFlg() {
        return outGrpOutGrmSearchCustPositionSpecAgrFlg;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionSpecAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionSpecAgrFlg(String value) {
        this.outGrpOutGrmSearchCustPositionSpecAgrFlg = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText1() {
        return outGrpOutGrmSearchCustPositionText1;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText1(String value) {
        this.outGrpOutGrmSearchCustPositionText1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText10() {
        return outGrpOutGrmSearchCustPositionText10;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText10(String value) {
        this.outGrpOutGrmSearchCustPositionText10 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText11() {
        return outGrpOutGrmSearchCustPositionText11;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText11(String value) {
        this.outGrpOutGrmSearchCustPositionText11 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText12() {
        return outGrpOutGrmSearchCustPositionText12;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText12(String value) {
        this.outGrpOutGrmSearchCustPositionText12 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText13() {
        return outGrpOutGrmSearchCustPositionText13;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText13(String value) {
        this.outGrpOutGrmSearchCustPositionText13 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText14() {
        return outGrpOutGrmSearchCustPositionText14;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText14(String value) {
        this.outGrpOutGrmSearchCustPositionText14 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText15() {
        return outGrpOutGrmSearchCustPositionText15;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText15(String value) {
        this.outGrpOutGrmSearchCustPositionText15 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText16() {
        return outGrpOutGrmSearchCustPositionText16;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText16(String value) {
        this.outGrpOutGrmSearchCustPositionText16 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText17() {
        return outGrpOutGrmSearchCustPositionText17;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText17(String value) {
        this.outGrpOutGrmSearchCustPositionText17 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText18() {
        return outGrpOutGrmSearchCustPositionText18;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText18(String value) {
        this.outGrpOutGrmSearchCustPositionText18 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText19() {
        return outGrpOutGrmSearchCustPositionText19;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText19(String value) {
        this.outGrpOutGrmSearchCustPositionText19 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText2() {
        return outGrpOutGrmSearchCustPositionText2;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText2(String value) {
        this.outGrpOutGrmSearchCustPositionText2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText20() {
        return outGrpOutGrmSearchCustPositionText20;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText20(String value) {
        this.outGrpOutGrmSearchCustPositionText20 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText21() {
        return outGrpOutGrmSearchCustPositionText21;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText21(String value) {
        this.outGrpOutGrmSearchCustPositionText21 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText22() {
        return outGrpOutGrmSearchCustPositionText22;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText22(String value) {
        this.outGrpOutGrmSearchCustPositionText22 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText23() {
        return outGrpOutGrmSearchCustPositionText23;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText23(String value) {
        this.outGrpOutGrmSearchCustPositionText23 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText24() {
        return outGrpOutGrmSearchCustPositionText24;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText24(String value) {
        this.outGrpOutGrmSearchCustPositionText24 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText25() {
        return outGrpOutGrmSearchCustPositionText25;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText25(String value) {
        this.outGrpOutGrmSearchCustPositionText25 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText26() {
        return outGrpOutGrmSearchCustPositionText26;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText26(String value) {
        this.outGrpOutGrmSearchCustPositionText26 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText27() {
        return outGrpOutGrmSearchCustPositionText27;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText27(String value) {
        this.outGrpOutGrmSearchCustPositionText27 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText28() {
        return outGrpOutGrmSearchCustPositionText28;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText28(String value) {
        this.outGrpOutGrmSearchCustPositionText28 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText29() {
        return outGrpOutGrmSearchCustPositionText29;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText29(String value) {
        this.outGrpOutGrmSearchCustPositionText29 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText3() {
        return outGrpOutGrmSearchCustPositionText3;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText3(String value) {
        this.outGrpOutGrmSearchCustPositionText3 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText30() {
        return outGrpOutGrmSearchCustPositionText30;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText30(String value) {
        this.outGrpOutGrmSearchCustPositionText30 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText4() {
        return outGrpOutGrmSearchCustPositionText4;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText4(String value) {
        this.outGrpOutGrmSearchCustPositionText4 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText5() {
        return outGrpOutGrmSearchCustPositionText5;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText5(String value) {
        this.outGrpOutGrmSearchCustPositionText5 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText6() {
        return outGrpOutGrmSearchCustPositionText6;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText6(String value) {
        this.outGrpOutGrmSearchCustPositionText6 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText7() {
        return outGrpOutGrmSearchCustPositionText7;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText7(String value) {
        this.outGrpOutGrmSearchCustPositionText7 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText8() {
        return outGrpOutGrmSearchCustPositionText8;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText8(String value) {
        this.outGrpOutGrmSearchCustPositionText8 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionText9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionText9() {
        return outGrpOutGrmSearchCustPositionText9;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionText9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionText9(String value) {
        this.outGrpOutGrmSearchCustPositionText9 = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSearchCustPositionTmstamp() {
        return outGrpOutGrmSearchCustPositionTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmSearchCustPositionTmstamp = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionUnitCode property.
     * 
     */
    public int getOutGrpOutGrmSearchCustPositionUnitCode() {
        return outGrpOutGrmSearchCustPositionUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionUnitCode property.
     * 
     */
    public void setOutGrpOutGrmSearchCustPositionUnitCode(int value) {
        this.outGrpOutGrmSearchCustPositionUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSearchCustPositionUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSearchCustPositionUnitName() {
        return outGrpOutGrmSearchCustPositionUnitName;
    }

    /**
     * Sets the value of the outGrpOutGrmSearchCustPositionUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSearchCustPositionUnitName(String value) {
        this.outGrpOutGrmSearchCustPositionUnitName = value;
    }

}
