
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adds01AdditionalTransactionPostingImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adds01AdditionalTransactionPostingImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAuthorisationGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBopGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFxftProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFxftServiceIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGeneralFxFtRecordingCustIdPasspNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGlgAccountSecLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InInputCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InInputCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainFxftFxFtRecordingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMainFxftPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRecordCaseFxFtRecordingIDrCrFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InRecordCaseFxFtRecordingISegmentType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSectorGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSecurityInBankParametersMaxAmntRateTbl" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSecurityInBankParametersMaxAmntSrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InSecurityInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InToBeConvertedIefSuppliedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InExportPosting" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfAdds01InExportPostingItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adds01AdditionalTransactionPostingImport", propOrder = {
    "command",
    "inAuthorisationGrantedIefSuppliedFlag",
    "inBopGenericDetailShortDescription",
    "inCountryGenericDetailShortDescription",
    "inFxftProductIdProduct",
    "inFxftServiceIdProduct",
    "inGeneralFxFtRecordingCustIdPasspNum",
    "inGlgAccountAccountId",
    "inGlgAccountSecLevel",
    "inInputCurrencyIdCurrency",
    "inInputCurrencyShortDescr",
    "inMainFxftFxFtRecordingComments",
    "inMainFxftPrftTransactionIdTransact",
    "inRecordCaseFxFtRecordingIDrCrFlag",
    "inRecordCaseFxFtRecordingISegmentType",
    "inSectorGenericDetailShortDescription",
    "inSecurityInBankParametersMaxAmntRateTbl",
    "inSecurityInBankParametersMaxAmntSrs",
    "inSecurityInTerminalTerminalNumber",
    "inToBeConvertedIefSuppliedAmount",
    "inExportPosting"
})
public class Adds01AdditionalTransactionPostingImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAuthorisationGrantedIefSuppliedFlag")
    protected String inAuthorisationGrantedIefSuppliedFlag;
    @XmlElement(name = "InBopGenericDetailShortDescription")
    protected String inBopGenericDetailShortDescription;
    @XmlElement(name = "InCountryGenericDetailShortDescription")
    protected String inCountryGenericDetailShortDescription;
    @XmlElement(name = "InFxftProductIdProduct")
    protected int inFxftProductIdProduct;
    @XmlElement(name = "InFxftServiceIdProduct")
    protected int inFxftServiceIdProduct;
    @XmlElement(name = "InGeneralFxFtRecordingCustIdPasspNum")
    protected String inGeneralFxFtRecordingCustIdPasspNum;
    @XmlElement(name = "InGlgAccountAccountId")
    protected String inGlgAccountAccountId;
    @XmlElement(name = "InGlgAccountSecLevel")
    protected short inGlgAccountSecLevel;
    @XmlElement(name = "InInputCurrencyIdCurrency")
    protected int inInputCurrencyIdCurrency;
    @XmlElement(name = "InInputCurrencyShortDescr")
    protected String inInputCurrencyShortDescr;
    @XmlElement(name = "InMainFxftFxFtRecordingComments")
    protected String inMainFxftFxFtRecordingComments;
    @XmlElement(name = "InMainFxftPrftTransactionIdTransact")
    protected int inMainFxftPrftTransactionIdTransact;
    @XmlElement(name = "InRecordCaseFxFtRecordingIDrCrFlag")
    protected short inRecordCaseFxFtRecordingIDrCrFlag;
    @XmlElement(name = "InRecordCaseFxFtRecordingISegmentType")
    protected short inRecordCaseFxFtRecordingISegmentType;
    @XmlElement(name = "InSectorGenericDetailShortDescription")
    protected String inSectorGenericDetailShortDescription;
    @XmlElement(name = "InSecurityInBankParametersMaxAmntRateTbl", required = true)
    protected BigDecimal inSecurityInBankParametersMaxAmntRateTbl;
    @XmlElement(name = "InSecurityInBankParametersMaxAmntSrs", required = true)
    protected BigDecimal inSecurityInBankParametersMaxAmntSrs;
    @XmlElement(name = "InSecurityInTerminalTerminalNumber")
    protected String inSecurityInTerminalTerminalNumber;
    @XmlElement(name = "InToBeConvertedIefSuppliedAmount", required = true)
    protected BigDecimal inToBeConvertedIefSuppliedAmount;
    @XmlElement(name = "InExportPosting")
    protected ArrayOfAdds01InExportPostingItem inExportPosting;

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
     * Gets the value of the inAuthorisationGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorisationGrantedIefSuppliedFlag() {
        return inAuthorisationGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorisationGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorisationGrantedIefSuppliedFlag(String value) {
        this.inAuthorisationGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBopGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBopGenericDetailShortDescription() {
        return inBopGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inBopGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBopGenericDetailShortDescription(String value) {
        this.inBopGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCountryGenericDetailShortDescription() {
        return inCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCountryGenericDetailShortDescription(String value) {
        this.inCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inFxftProductIdProduct property.
     * 
     */
    public int getInFxftProductIdProduct() {
        return inFxftProductIdProduct;
    }

    /**
     * Sets the value of the inFxftProductIdProduct property.
     * 
     */
    public void setInFxftProductIdProduct(int value) {
        this.inFxftProductIdProduct = value;
    }

    /**
     * Gets the value of the inFxftServiceIdProduct property.
     * 
     */
    public int getInFxftServiceIdProduct() {
        return inFxftServiceIdProduct;
    }

    /**
     * Sets the value of the inFxftServiceIdProduct property.
     * 
     */
    public void setInFxftServiceIdProduct(int value) {
        this.inFxftServiceIdProduct = value;
    }

    /**
     * Gets the value of the inGeneralFxFtRecordingCustIdPasspNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGeneralFxFtRecordingCustIdPasspNum() {
        return inGeneralFxFtRecordingCustIdPasspNum;
    }

    /**
     * Sets the value of the inGeneralFxFtRecordingCustIdPasspNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGeneralFxFtRecordingCustIdPasspNum(String value) {
        this.inGeneralFxFtRecordingCustIdPasspNum = value;
    }

    /**
     * Gets the value of the inGlgAccountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlgAccountAccountId() {
        return inGlgAccountAccountId;
    }

    /**
     * Sets the value of the inGlgAccountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlgAccountAccountId(String value) {
        this.inGlgAccountAccountId = value;
    }

    /**
     * Gets the value of the inGlgAccountSecLevel property.
     * 
     */
    public short getInGlgAccountSecLevel() {
        return inGlgAccountSecLevel;
    }

    /**
     * Sets the value of the inGlgAccountSecLevel property.
     * 
     */
    public void setInGlgAccountSecLevel(short value) {
        this.inGlgAccountSecLevel = value;
    }

    /**
     * Gets the value of the inInputCurrencyIdCurrency property.
     * 
     */
    public int getInInputCurrencyIdCurrency() {
        return inInputCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inInputCurrencyIdCurrency property.
     * 
     */
    public void setInInputCurrencyIdCurrency(int value) {
        this.inInputCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inInputCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInInputCurrencyShortDescr() {
        return inInputCurrencyShortDescr;
    }

    /**
     * Sets the value of the inInputCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInInputCurrencyShortDescr(String value) {
        this.inInputCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inMainFxftFxFtRecordingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMainFxftFxFtRecordingComments() {
        return inMainFxftFxFtRecordingComments;
    }

    /**
     * Sets the value of the inMainFxftFxFtRecordingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMainFxftFxFtRecordingComments(String value) {
        this.inMainFxftFxFtRecordingComments = value;
    }

    /**
     * Gets the value of the inMainFxftPrftTransactionIdTransact property.
     * 
     */
    public int getInMainFxftPrftTransactionIdTransact() {
        return inMainFxftPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inMainFxftPrftTransactionIdTransact property.
     * 
     */
    public void setInMainFxftPrftTransactionIdTransact(int value) {
        this.inMainFxftPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inRecordCaseFxFtRecordingIDrCrFlag property.
     * 
     */
    public short getInRecordCaseFxFtRecordingIDrCrFlag() {
        return inRecordCaseFxFtRecordingIDrCrFlag;
    }

    /**
     * Sets the value of the inRecordCaseFxFtRecordingIDrCrFlag property.
     * 
     */
    public void setInRecordCaseFxFtRecordingIDrCrFlag(short value) {
        this.inRecordCaseFxFtRecordingIDrCrFlag = value;
    }

    /**
     * Gets the value of the inRecordCaseFxFtRecordingISegmentType property.
     * 
     */
    public short getInRecordCaseFxFtRecordingISegmentType() {
        return inRecordCaseFxFtRecordingISegmentType;
    }

    /**
     * Sets the value of the inRecordCaseFxFtRecordingISegmentType property.
     * 
     */
    public void setInRecordCaseFxFtRecordingISegmentType(short value) {
        this.inRecordCaseFxFtRecordingISegmentType = value;
    }

    /**
     * Gets the value of the inSectorGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSectorGenericDetailShortDescription() {
        return inSectorGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inSectorGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSectorGenericDetailShortDescription(String value) {
        this.inSectorGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inSecurityInBankParametersMaxAmntRateTbl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSecurityInBankParametersMaxAmntRateTbl() {
        return inSecurityInBankParametersMaxAmntRateTbl;
    }

    /**
     * Sets the value of the inSecurityInBankParametersMaxAmntRateTbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSecurityInBankParametersMaxAmntRateTbl(BigDecimal value) {
        this.inSecurityInBankParametersMaxAmntRateTbl = value;
    }

    /**
     * Gets the value of the inSecurityInBankParametersMaxAmntSrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInSecurityInBankParametersMaxAmntSrs() {
        return inSecurityInBankParametersMaxAmntSrs;
    }

    /**
     * Sets the value of the inSecurityInBankParametersMaxAmntSrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInSecurityInBankParametersMaxAmntSrs(BigDecimal value) {
        this.inSecurityInBankParametersMaxAmntSrs = value;
    }

    /**
     * Gets the value of the inSecurityInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecurityInTerminalTerminalNumber() {
        return inSecurityInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inSecurityInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecurityInTerminalTerminalNumber(String value) {
        this.inSecurityInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inToBeConvertedIefSuppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInToBeConvertedIefSuppliedAmount() {
        return inToBeConvertedIefSuppliedAmount;
    }

    /**
     * Sets the value of the inToBeConvertedIefSuppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInToBeConvertedIefSuppliedAmount(BigDecimal value) {
        this.inToBeConvertedIefSuppliedAmount = value;
    }

    /**
     * Gets the value of the inExportPosting property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdds01InExportPostingItem }
     *     
     */
    public ArrayOfAdds01InExportPostingItem getInExportPosting() {
        return inExportPosting;
    }

    /**
     * Sets the value of the inExportPosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdds01InExportPostingItem }
     *     
     */
    public void setInExportPosting(ArrayOfAdds01InExportPostingItem value) {
        this.inExportPosting = value;
    }

}
