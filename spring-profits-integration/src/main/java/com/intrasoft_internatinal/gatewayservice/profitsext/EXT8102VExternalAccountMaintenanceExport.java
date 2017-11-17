
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXT8102VExternalAccountMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXT8102VExternalAccountMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoAmount11" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount12" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount13" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount14" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount15" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount16" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount17" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount18" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount19" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount20" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount21" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount22" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount23" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount24" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoAmount25" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutExtrnlAccInfoChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoChar9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate10" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate11" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate12" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate13" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate14" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate15" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate3" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate4" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate5" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate6" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoDate9" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutExtrnlAccInfoFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoFlag9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoLargeChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoLargeChar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoLargeChar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoLargeChar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutExtrnlAccInfoLargeChar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLimitCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovementCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovementCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovementCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountAccountSerNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn10" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn8" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysAmn9" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutProfitsAccountExtsysFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProfitsAccountExtsysProcessDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutProfitsAccountIdPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXT8102VExternalAccountMaintenanceExport", propOrder = {
    "outCustomerCDigit",
    "outCustomerCustId",
    "outCustomerCustType",
    "outCustomerFirstName",
    "outCustomerSurname",
    "outExtrnlAccInfoAmount11",
    "outExtrnlAccInfoAmount12",
    "outExtrnlAccInfoAmount13",
    "outExtrnlAccInfoAmount14",
    "outExtrnlAccInfoAmount15",
    "outExtrnlAccInfoAmount16",
    "outExtrnlAccInfoAmount17",
    "outExtrnlAccInfoAmount18",
    "outExtrnlAccInfoAmount19",
    "outExtrnlAccInfoAmount20",
    "outExtrnlAccInfoAmount21",
    "outExtrnlAccInfoAmount22",
    "outExtrnlAccInfoAmount23",
    "outExtrnlAccInfoAmount24",
    "outExtrnlAccInfoAmount25",
    "outExtrnlAccInfoChar1",
    "outExtrnlAccInfoChar10",
    "outExtrnlAccInfoChar2",
    "outExtrnlAccInfoChar3",
    "outExtrnlAccInfoChar4",
    "outExtrnlAccInfoChar5",
    "outExtrnlAccInfoChar6",
    "outExtrnlAccInfoChar7",
    "outExtrnlAccInfoChar8",
    "outExtrnlAccInfoChar9",
    "outExtrnlAccInfoDate1",
    "outExtrnlAccInfoDate10",
    "outExtrnlAccInfoDate11",
    "outExtrnlAccInfoDate12",
    "outExtrnlAccInfoDate13",
    "outExtrnlAccInfoDate14",
    "outExtrnlAccInfoDate15",
    "outExtrnlAccInfoDate2",
    "outExtrnlAccInfoDate3",
    "outExtrnlAccInfoDate4",
    "outExtrnlAccInfoDate5",
    "outExtrnlAccInfoDate6",
    "outExtrnlAccInfoDate7",
    "outExtrnlAccInfoDate8",
    "outExtrnlAccInfoDate9",
    "outExtrnlAccInfoFlag1",
    "outExtrnlAccInfoFlag10",
    "outExtrnlAccInfoFlag2",
    "outExtrnlAccInfoFlag3",
    "outExtrnlAccInfoFlag4",
    "outExtrnlAccInfoFlag5",
    "outExtrnlAccInfoFlag6",
    "outExtrnlAccInfoFlag7",
    "outExtrnlAccInfoFlag8",
    "outExtrnlAccInfoFlag9",
    "outExtrnlAccInfoLargeChar1",
    "outExtrnlAccInfoLargeChar2",
    "outExtrnlAccInfoLargeChar3",
    "outExtrnlAccInfoLargeChar4",
    "outExtrnlAccInfoLargeChar5",
    "outLimitCurrencyDescription",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outMonitoringUnitCode",
    "outMonitoringUnitUnitName",
    "outMovementCurrencyDescription",
    "outMovementCurrencyIdCurrency",
    "outMovementCurrencyShortDescr",
    "outProductDescription",
    "outProductIdProduct",
    "outProfitsAccountAccStatus",
    "outProfitsAccountAccountCd",
    "outProfitsAccountAccountNumber",
    "outProfitsAccountAccountSerNum",
    "outProfitsAccountExtsysAmn1",
    "outProfitsAccountExtsysAmn10",
    "outProfitsAccountExtsysAmn2",
    "outProfitsAccountExtsysAmn3",
    "outProfitsAccountExtsysAmn4",
    "outProfitsAccountExtsysAmn5",
    "outProfitsAccountExtsysAmn6",
    "outProfitsAccountExtsysAmn7",
    "outProfitsAccountExtsysAmn8",
    "outProfitsAccountExtsysAmn9",
    "outProfitsAccountExtsysFlg",
    "outProfitsAccountExtsysProcessDt",
    "outProfitsAccountIdPackage",
    "outProfitsAccountPrftSystem"
})
public class EXT8102VExternalAccountMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCustType")
    protected String outCustomerCustType;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutExtrnlAccInfoAmount11", required = true)
    protected BigDecimal outExtrnlAccInfoAmount11;
    @XmlElement(name = "OutExtrnlAccInfoAmount12", required = true)
    protected BigDecimal outExtrnlAccInfoAmount12;
    @XmlElement(name = "OutExtrnlAccInfoAmount13", required = true)
    protected BigDecimal outExtrnlAccInfoAmount13;
    @XmlElement(name = "OutExtrnlAccInfoAmount14", required = true)
    protected BigDecimal outExtrnlAccInfoAmount14;
    @XmlElement(name = "OutExtrnlAccInfoAmount15", required = true)
    protected BigDecimal outExtrnlAccInfoAmount15;
    @XmlElement(name = "OutExtrnlAccInfoAmount16", required = true)
    protected BigDecimal outExtrnlAccInfoAmount16;
    @XmlElement(name = "OutExtrnlAccInfoAmount17", required = true)
    protected BigDecimal outExtrnlAccInfoAmount17;
    @XmlElement(name = "OutExtrnlAccInfoAmount18", required = true)
    protected BigDecimal outExtrnlAccInfoAmount18;
    @XmlElement(name = "OutExtrnlAccInfoAmount19", required = true)
    protected BigDecimal outExtrnlAccInfoAmount19;
    @XmlElement(name = "OutExtrnlAccInfoAmount20", required = true)
    protected BigDecimal outExtrnlAccInfoAmount20;
    @XmlElement(name = "OutExtrnlAccInfoAmount21", required = true)
    protected BigDecimal outExtrnlAccInfoAmount21;
    @XmlElement(name = "OutExtrnlAccInfoAmount22", required = true)
    protected BigDecimal outExtrnlAccInfoAmount22;
    @XmlElement(name = "OutExtrnlAccInfoAmount23", required = true)
    protected BigDecimal outExtrnlAccInfoAmount23;
    @XmlElement(name = "OutExtrnlAccInfoAmount24", required = true)
    protected BigDecimal outExtrnlAccInfoAmount24;
    @XmlElement(name = "OutExtrnlAccInfoAmount25", required = true)
    protected BigDecimal outExtrnlAccInfoAmount25;
    @XmlElement(name = "OutExtrnlAccInfoChar1")
    protected String outExtrnlAccInfoChar1;
    @XmlElement(name = "OutExtrnlAccInfoChar10")
    protected String outExtrnlAccInfoChar10;
    @XmlElement(name = "OutExtrnlAccInfoChar2")
    protected String outExtrnlAccInfoChar2;
    @XmlElement(name = "OutExtrnlAccInfoChar3")
    protected String outExtrnlAccInfoChar3;
    @XmlElement(name = "OutExtrnlAccInfoChar4")
    protected String outExtrnlAccInfoChar4;
    @XmlElement(name = "OutExtrnlAccInfoChar5")
    protected String outExtrnlAccInfoChar5;
    @XmlElement(name = "OutExtrnlAccInfoChar6")
    protected String outExtrnlAccInfoChar6;
    @XmlElement(name = "OutExtrnlAccInfoChar7")
    protected String outExtrnlAccInfoChar7;
    @XmlElement(name = "OutExtrnlAccInfoChar8")
    protected String outExtrnlAccInfoChar8;
    @XmlElement(name = "OutExtrnlAccInfoChar9")
    protected String outExtrnlAccInfoChar9;
    @XmlElement(name = "OutExtrnlAccInfoDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate1;
    @XmlElement(name = "OutExtrnlAccInfoDate10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate10;
    @XmlElement(name = "OutExtrnlAccInfoDate11", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate11;
    @XmlElement(name = "OutExtrnlAccInfoDate12", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate12;
    @XmlElement(name = "OutExtrnlAccInfoDate13", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate13;
    @XmlElement(name = "OutExtrnlAccInfoDate14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate14;
    @XmlElement(name = "OutExtrnlAccInfoDate15", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate15;
    @XmlElement(name = "OutExtrnlAccInfoDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate2;
    @XmlElement(name = "OutExtrnlAccInfoDate3", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate3;
    @XmlElement(name = "OutExtrnlAccInfoDate4", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate4;
    @XmlElement(name = "OutExtrnlAccInfoDate5", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate5;
    @XmlElement(name = "OutExtrnlAccInfoDate6", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate6;
    @XmlElement(name = "OutExtrnlAccInfoDate7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate7;
    @XmlElement(name = "OutExtrnlAccInfoDate8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate8;
    @XmlElement(name = "OutExtrnlAccInfoDate9", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outExtrnlAccInfoDate9;
    @XmlElement(name = "OutExtrnlAccInfoFlag1")
    protected String outExtrnlAccInfoFlag1;
    @XmlElement(name = "OutExtrnlAccInfoFlag10")
    protected String outExtrnlAccInfoFlag10;
    @XmlElement(name = "OutExtrnlAccInfoFlag2")
    protected String outExtrnlAccInfoFlag2;
    @XmlElement(name = "OutExtrnlAccInfoFlag3")
    protected String outExtrnlAccInfoFlag3;
    @XmlElement(name = "OutExtrnlAccInfoFlag4")
    protected String outExtrnlAccInfoFlag4;
    @XmlElement(name = "OutExtrnlAccInfoFlag5")
    protected String outExtrnlAccInfoFlag5;
    @XmlElement(name = "OutExtrnlAccInfoFlag6")
    protected String outExtrnlAccInfoFlag6;
    @XmlElement(name = "OutExtrnlAccInfoFlag7")
    protected String outExtrnlAccInfoFlag7;
    @XmlElement(name = "OutExtrnlAccInfoFlag8")
    protected String outExtrnlAccInfoFlag8;
    @XmlElement(name = "OutExtrnlAccInfoFlag9")
    protected String outExtrnlAccInfoFlag9;
    @XmlElement(name = "OutExtrnlAccInfoLargeChar1")
    protected String outExtrnlAccInfoLargeChar1;
    @XmlElement(name = "OutExtrnlAccInfoLargeChar2")
    protected String outExtrnlAccInfoLargeChar2;
    @XmlElement(name = "OutExtrnlAccInfoLargeChar3")
    protected String outExtrnlAccInfoLargeChar3;
    @XmlElement(name = "OutExtrnlAccInfoLargeChar4")
    protected String outExtrnlAccInfoLargeChar4;
    @XmlElement(name = "OutExtrnlAccInfoLargeChar5")
    protected String outExtrnlAccInfoLargeChar5;
    @XmlElement(name = "OutLimitCurrencyDescription")
    protected String outLimitCurrencyDescription;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutMonitoringUnitCode")
    protected int outMonitoringUnitCode;
    @XmlElement(name = "OutMonitoringUnitUnitName")
    protected String outMonitoringUnitUnitName;
    @XmlElement(name = "OutMovementCurrencyDescription")
    protected String outMovementCurrencyDescription;
    @XmlElement(name = "OutMovementCurrencyIdCurrency")
    protected int outMovementCurrencyIdCurrency;
    @XmlElement(name = "OutMovementCurrencyShortDescr")
    protected String outMovementCurrencyShortDescr;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProfitsAccountAccStatus")
    protected String outProfitsAccountAccStatus;
    @XmlElement(name = "OutProfitsAccountAccountCd")
    protected short outProfitsAccountAccountCd;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutProfitsAccountAccountSerNum")
    protected double outProfitsAccountAccountSerNum;
    @XmlElement(name = "OutProfitsAccountExtsysAmn1", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn1;
    @XmlElement(name = "OutProfitsAccountExtsysAmn10", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn10;
    @XmlElement(name = "OutProfitsAccountExtsysAmn2", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn2;
    @XmlElement(name = "OutProfitsAccountExtsysAmn3", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn3;
    @XmlElement(name = "OutProfitsAccountExtsysAmn4", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn4;
    @XmlElement(name = "OutProfitsAccountExtsysAmn5", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn5;
    @XmlElement(name = "OutProfitsAccountExtsysAmn6", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn6;
    @XmlElement(name = "OutProfitsAccountExtsysAmn7", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn7;
    @XmlElement(name = "OutProfitsAccountExtsysAmn8", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn8;
    @XmlElement(name = "OutProfitsAccountExtsysAmn9", required = true)
    protected BigDecimal outProfitsAccountExtsysAmn9;
    @XmlElement(name = "OutProfitsAccountExtsysFlg")
    protected String outProfitsAccountExtsysFlg;
    @XmlElement(name = "OutProfitsAccountExtsysProcessDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outProfitsAccountExtsysProcessDt;
    @XmlElement(name = "OutProfitsAccountIdPackage")
    protected int outProfitsAccountIdPackage;
    @XmlElement(name = "OutProfitsAccountPrftSystem")
    protected short outProfitsAccountPrftSystem;

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
     * Gets the value of the outCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerCustType() {
        return outCustomerCustType;
    }

    /**
     * Sets the value of the outCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerCustType(String value) {
        this.outCustomerCustType = value;
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
     * Gets the value of the outExtrnlAccInfoAmount11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount11() {
        return outExtrnlAccInfoAmount11;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount11(BigDecimal value) {
        this.outExtrnlAccInfoAmount11 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount12() {
        return outExtrnlAccInfoAmount12;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount12(BigDecimal value) {
        this.outExtrnlAccInfoAmount12 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount13() {
        return outExtrnlAccInfoAmount13;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount13(BigDecimal value) {
        this.outExtrnlAccInfoAmount13 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount14() {
        return outExtrnlAccInfoAmount14;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount14(BigDecimal value) {
        this.outExtrnlAccInfoAmount14 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount15() {
        return outExtrnlAccInfoAmount15;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount15(BigDecimal value) {
        this.outExtrnlAccInfoAmount15 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount16 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount16() {
        return outExtrnlAccInfoAmount16;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount16(BigDecimal value) {
        this.outExtrnlAccInfoAmount16 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount17 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount17() {
        return outExtrnlAccInfoAmount17;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount17(BigDecimal value) {
        this.outExtrnlAccInfoAmount17 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount18 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount18() {
        return outExtrnlAccInfoAmount18;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount18(BigDecimal value) {
        this.outExtrnlAccInfoAmount18 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount19 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount19() {
        return outExtrnlAccInfoAmount19;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount19(BigDecimal value) {
        this.outExtrnlAccInfoAmount19 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount20 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount20() {
        return outExtrnlAccInfoAmount20;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount20(BigDecimal value) {
        this.outExtrnlAccInfoAmount20 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount21 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount21() {
        return outExtrnlAccInfoAmount21;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount21(BigDecimal value) {
        this.outExtrnlAccInfoAmount21 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount22 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount22() {
        return outExtrnlAccInfoAmount22;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount22(BigDecimal value) {
        this.outExtrnlAccInfoAmount22 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount23 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount23() {
        return outExtrnlAccInfoAmount23;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount23(BigDecimal value) {
        this.outExtrnlAccInfoAmount23 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount24 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount24() {
        return outExtrnlAccInfoAmount24;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount24(BigDecimal value) {
        this.outExtrnlAccInfoAmount24 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoAmount25 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutExtrnlAccInfoAmount25() {
        return outExtrnlAccInfoAmount25;
    }

    /**
     * Sets the value of the outExtrnlAccInfoAmount25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutExtrnlAccInfoAmount25(BigDecimal value) {
        this.outExtrnlAccInfoAmount25 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar1() {
        return outExtrnlAccInfoChar1;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar1(String value) {
        this.outExtrnlAccInfoChar1 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar10() {
        return outExtrnlAccInfoChar10;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar10(String value) {
        this.outExtrnlAccInfoChar10 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar2() {
        return outExtrnlAccInfoChar2;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar2(String value) {
        this.outExtrnlAccInfoChar2 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar3() {
        return outExtrnlAccInfoChar3;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar3(String value) {
        this.outExtrnlAccInfoChar3 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar4() {
        return outExtrnlAccInfoChar4;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar4(String value) {
        this.outExtrnlAccInfoChar4 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar5() {
        return outExtrnlAccInfoChar5;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar5(String value) {
        this.outExtrnlAccInfoChar5 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar6() {
        return outExtrnlAccInfoChar6;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar6(String value) {
        this.outExtrnlAccInfoChar6 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar7() {
        return outExtrnlAccInfoChar7;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar7(String value) {
        this.outExtrnlAccInfoChar7 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar8() {
        return outExtrnlAccInfoChar8;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar8(String value) {
        this.outExtrnlAccInfoChar8 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoChar9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoChar9() {
        return outExtrnlAccInfoChar9;
    }

    /**
     * Sets the value of the outExtrnlAccInfoChar9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoChar9(String value) {
        this.outExtrnlAccInfoChar9 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate1() {
        return outExtrnlAccInfoDate1;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate1(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate1 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate10 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate10() {
        return outExtrnlAccInfoDate10;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate10(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate10 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate11 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate11() {
        return outExtrnlAccInfoDate11;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate11(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate11 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate12 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate12() {
        return outExtrnlAccInfoDate12;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate12(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate12 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate13 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate13() {
        return outExtrnlAccInfoDate13;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate13(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate13 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate14 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate14() {
        return outExtrnlAccInfoDate14;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate14(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate14 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate15 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate15() {
        return outExtrnlAccInfoDate15;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate15(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate15 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate2() {
        return outExtrnlAccInfoDate2;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate2(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate2 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate3() {
        return outExtrnlAccInfoDate3;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate3(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate3 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate4() {
        return outExtrnlAccInfoDate4;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate4(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate4 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate5 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate5() {
        return outExtrnlAccInfoDate5;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate5(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate5 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate6 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate6() {
        return outExtrnlAccInfoDate6;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate6(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate6 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate7 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate7() {
        return outExtrnlAccInfoDate7;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate7(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate7 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate8 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate8() {
        return outExtrnlAccInfoDate8;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate8(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate8 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoDate9 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutExtrnlAccInfoDate9() {
        return outExtrnlAccInfoDate9;
    }

    /**
     * Sets the value of the outExtrnlAccInfoDate9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutExtrnlAccInfoDate9(XMLGregorianCalendar value) {
        this.outExtrnlAccInfoDate9 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag1() {
        return outExtrnlAccInfoFlag1;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag1(String value) {
        this.outExtrnlAccInfoFlag1 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag10() {
        return outExtrnlAccInfoFlag10;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag10(String value) {
        this.outExtrnlAccInfoFlag10 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag2() {
        return outExtrnlAccInfoFlag2;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag2(String value) {
        this.outExtrnlAccInfoFlag2 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag3() {
        return outExtrnlAccInfoFlag3;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag3(String value) {
        this.outExtrnlAccInfoFlag3 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag4() {
        return outExtrnlAccInfoFlag4;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag4(String value) {
        this.outExtrnlAccInfoFlag4 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag5() {
        return outExtrnlAccInfoFlag5;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag5(String value) {
        this.outExtrnlAccInfoFlag5 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag6() {
        return outExtrnlAccInfoFlag6;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag6(String value) {
        this.outExtrnlAccInfoFlag6 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag7() {
        return outExtrnlAccInfoFlag7;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag7(String value) {
        this.outExtrnlAccInfoFlag7 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag8() {
        return outExtrnlAccInfoFlag8;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag8(String value) {
        this.outExtrnlAccInfoFlag8 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoFlag9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoFlag9() {
        return outExtrnlAccInfoFlag9;
    }

    /**
     * Sets the value of the outExtrnlAccInfoFlag9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoFlag9(String value) {
        this.outExtrnlAccInfoFlag9 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoLargeChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoLargeChar1() {
        return outExtrnlAccInfoLargeChar1;
    }

    /**
     * Sets the value of the outExtrnlAccInfoLargeChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoLargeChar1(String value) {
        this.outExtrnlAccInfoLargeChar1 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoLargeChar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoLargeChar2() {
        return outExtrnlAccInfoLargeChar2;
    }

    /**
     * Sets the value of the outExtrnlAccInfoLargeChar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoLargeChar2(String value) {
        this.outExtrnlAccInfoLargeChar2 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoLargeChar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoLargeChar3() {
        return outExtrnlAccInfoLargeChar3;
    }

    /**
     * Sets the value of the outExtrnlAccInfoLargeChar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoLargeChar3(String value) {
        this.outExtrnlAccInfoLargeChar3 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoLargeChar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoLargeChar4() {
        return outExtrnlAccInfoLargeChar4;
    }

    /**
     * Sets the value of the outExtrnlAccInfoLargeChar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoLargeChar4(String value) {
        this.outExtrnlAccInfoLargeChar4 = value;
    }

    /**
     * Gets the value of the outExtrnlAccInfoLargeChar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutExtrnlAccInfoLargeChar5() {
        return outExtrnlAccInfoLargeChar5;
    }

    /**
     * Sets the value of the outExtrnlAccInfoLargeChar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutExtrnlAccInfoLargeChar5(String value) {
        this.outExtrnlAccInfoLargeChar5 = value;
    }

    /**
     * Gets the value of the outLimitCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyDescription() {
        return outLimitCurrencyDescription;
    }

    /**
     * Sets the value of the outLimitCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyDescription(String value) {
        this.outLimitCurrencyDescription = value;
    }

    /**
     * Gets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public int getOutLimitCurrencyIdCurrency() {
        return outLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public void setOutLimitCurrencyIdCurrency(int value) {
        this.outLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyShortDescr() {
        return outLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyShortDescr(String value) {
        this.outLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outMonitoringUnitCode property.
     * 
     */
    public int getOutMonitoringUnitCode() {
        return outMonitoringUnitCode;
    }

    /**
     * Sets the value of the outMonitoringUnitCode property.
     * 
     */
    public void setOutMonitoringUnitCode(int value) {
        this.outMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringUnitUnitName() {
        return outMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringUnitUnitName(String value) {
        this.outMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outMovementCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovementCurrencyDescription() {
        return outMovementCurrencyDescription;
    }

    /**
     * Sets the value of the outMovementCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovementCurrencyDescription(String value) {
        this.outMovementCurrencyDescription = value;
    }

    /**
     * Gets the value of the outMovementCurrencyIdCurrency property.
     * 
     */
    public int getOutMovementCurrencyIdCurrency() {
        return outMovementCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovementCurrencyIdCurrency property.
     * 
     */
    public void setOutMovementCurrencyIdCurrency(int value) {
        this.outMovementCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovementCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovementCurrencyShortDescr() {
        return outMovementCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovementCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovementCurrencyShortDescr(String value) {
        this.outMovementCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductDescription() {
        return outProductDescription;
    }

    /**
     * Sets the value of the outProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductDescription(String value) {
        this.outProductDescription = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccStatus() {
        return outProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the outProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccStatus(String value) {
        this.outProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public short getOutProfitsAccountAccountCd() {
        return outProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outProfitsAccountAccountCd property.
     * 
     */
    public void setOutProfitsAccountAccountCd(short value) {
        this.outProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outProfitsAccountAccountSerNum property.
     * 
     */
    public double getOutProfitsAccountAccountSerNum() {
        return outProfitsAccountAccountSerNum;
    }

    /**
     * Sets the value of the outProfitsAccountAccountSerNum property.
     * 
     */
    public void setOutProfitsAccountAccountSerNum(double value) {
        this.outProfitsAccountAccountSerNum = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn1() {
        return outProfitsAccountExtsysAmn1;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn1(BigDecimal value) {
        this.outProfitsAccountExtsysAmn1 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn10() {
        return outProfitsAccountExtsysAmn10;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn10(BigDecimal value) {
        this.outProfitsAccountExtsysAmn10 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn2() {
        return outProfitsAccountExtsysAmn2;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn2(BigDecimal value) {
        this.outProfitsAccountExtsysAmn2 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn3() {
        return outProfitsAccountExtsysAmn3;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn3(BigDecimal value) {
        this.outProfitsAccountExtsysAmn3 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn4() {
        return outProfitsAccountExtsysAmn4;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn4(BigDecimal value) {
        this.outProfitsAccountExtsysAmn4 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn5() {
        return outProfitsAccountExtsysAmn5;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn5(BigDecimal value) {
        this.outProfitsAccountExtsysAmn5 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn6() {
        return outProfitsAccountExtsysAmn6;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn6(BigDecimal value) {
        this.outProfitsAccountExtsysAmn6 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn7() {
        return outProfitsAccountExtsysAmn7;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn7(BigDecimal value) {
        this.outProfitsAccountExtsysAmn7 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn8 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn8() {
        return outProfitsAccountExtsysAmn8;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn8(BigDecimal value) {
        this.outProfitsAccountExtsysAmn8 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysAmn9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutProfitsAccountExtsysAmn9() {
        return outProfitsAccountExtsysAmn9;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysAmn9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutProfitsAccountExtsysAmn9(BigDecimal value) {
        this.outProfitsAccountExtsysAmn9 = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountExtsysFlg() {
        return outProfitsAccountExtsysFlg;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountExtsysFlg(String value) {
        this.outProfitsAccountExtsysFlg = value;
    }

    /**
     * Gets the value of the outProfitsAccountExtsysProcessDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutProfitsAccountExtsysProcessDt() {
        return outProfitsAccountExtsysProcessDt;
    }

    /**
     * Sets the value of the outProfitsAccountExtsysProcessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutProfitsAccountExtsysProcessDt(XMLGregorianCalendar value) {
        this.outProfitsAccountExtsysProcessDt = value;
    }

    /**
     * Gets the value of the outProfitsAccountIdPackage property.
     * 
     */
    public int getOutProfitsAccountIdPackage() {
        return outProfitsAccountIdPackage;
    }

    /**
     * Sets the value of the outProfitsAccountIdPackage property.
     * 
     */
    public void setOutProfitsAccountIdPackage(int value) {
        this.outProfitsAccountIdPackage = value;
    }

    /**
     * Gets the value of the outProfitsAccountPrftSystem property.
     * 
     */
    public short getOutProfitsAccountPrftSystem() {
        return outProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outProfitsAccountPrftSystem property.
     * 
     */
    public void setOutProfitsAccountPrftSystem(short value) {
        this.outProfitsAccountPrftSystem = value;
    }

}
