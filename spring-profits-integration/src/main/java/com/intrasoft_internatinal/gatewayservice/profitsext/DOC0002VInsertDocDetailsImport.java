
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOC0002V_InsertDocDetailsImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOC0002V_InsertDocDetailsImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocCategoriesCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocCategoriesCategoryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedDocCategoriesActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocDetailsDocId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDocDetailsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocDetailsImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InDocDetailsImageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDocDetailsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocDetailsPrftObjValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocDetailsPrftObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocDetailsComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocDetailsActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOC0002V_InsertDocDetailsImport", propOrder = {
    "command",
    "inSelectedDocCategoriesCategoryId",
    "inSelectedDocCategoriesCategoryDesc",
    "inSelectedDocCategoriesActiveFlag",
    "inDocDetailsDocId",
    "inDocDetailsFilename",
    "inDocDetailsImageId",
    "inDocDetailsImageNumber",
    "inDocDetailsDescription",
    "inDocDetailsPrftObjValue",
    "inDocDetailsPrftObjType",
    "inDocDetailsComments",
    "inDocDetailsActiveFlag",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inTrxPrftTransactionIdTransact",
    "inTrxProductIdProduct",
    "inTrxJustificIdJustific",
    "inAuthGrantedIefSuppliedFlag"
})
public class DOC0002VInsertDocDetailsImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InSelectedDocCategoriesCategoryId")
    protected String inSelectedDocCategoriesCategoryId;
    @XmlElement(name = "InSelectedDocCategoriesCategoryDesc")
    protected String inSelectedDocCategoriesCategoryDesc;
    @XmlElement(name = "InSelectedDocCategoriesActiveFlag")
    protected String inSelectedDocCategoriesActiveFlag;
    @XmlElement(name = "InDocDetailsDocId")
    protected double inDocDetailsDocId;
    @XmlElement(name = "InDocDetailsFilename")
    protected String inDocDetailsFilename;
    @XmlElement(name = "InDocDetailsImageId")
    protected double inDocDetailsImageId;
    @XmlElement(name = "InDocDetailsImageNumber")
    protected int inDocDetailsImageNumber;
    @XmlElement(name = "InDocDetailsDescription")
    protected String inDocDetailsDescription;
    @XmlElement(name = "InDocDetailsPrftObjValue")
    protected String inDocDetailsPrftObjValue;
    @XmlElement(name = "InDocDetailsPrftObjType")
    protected String inDocDetailsPrftObjType;
    @XmlElement(name = "InDocDetailsComments")
    protected String inDocDetailsComments;
    @XmlElement(name = "InDocDetailsActiveFlag")
    protected String inDocDetailsActiveFlag;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InTrxProductIdProduct")
    protected int inTrxProductIdProduct;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InAuthGrantedIefSuppliedFlag")
    protected String inAuthGrantedIefSuppliedFlag;

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
     * Gets the value of the inSelectedDocCategoriesCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocCategoriesCategoryId() {
        return inSelectedDocCategoriesCategoryId;
    }

    /**
     * Sets the value of the inSelectedDocCategoriesCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocCategoriesCategoryId(String value) {
        this.inSelectedDocCategoriesCategoryId = value;
    }

    /**
     * Gets the value of the inSelectedDocCategoriesCategoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocCategoriesCategoryDesc() {
        return inSelectedDocCategoriesCategoryDesc;
    }

    /**
     * Sets the value of the inSelectedDocCategoriesCategoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocCategoriesCategoryDesc(String value) {
        this.inSelectedDocCategoriesCategoryDesc = value;
    }

    /**
     * Gets the value of the inSelectedDocCategoriesActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedDocCategoriesActiveFlag() {
        return inSelectedDocCategoriesActiveFlag;
    }

    /**
     * Sets the value of the inSelectedDocCategoriesActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedDocCategoriesActiveFlag(String value) {
        this.inSelectedDocCategoriesActiveFlag = value;
    }

    /**
     * Gets the value of the inDocDetailsDocId property.
     * 
     */
    public double getInDocDetailsDocId() {
        return inDocDetailsDocId;
    }

    /**
     * Sets the value of the inDocDetailsDocId property.
     * 
     */
    public void setInDocDetailsDocId(double value) {
        this.inDocDetailsDocId = value;
    }

    /**
     * Gets the value of the inDocDetailsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocDetailsFilename() {
        return inDocDetailsFilename;
    }

    /**
     * Sets the value of the inDocDetailsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocDetailsFilename(String value) {
        this.inDocDetailsFilename = value;
    }

    /**
     * Gets the value of the inDocDetailsImageId property.
     * 
     */
    public double getInDocDetailsImageId() {
        return inDocDetailsImageId;
    }

    /**
     * Sets the value of the inDocDetailsImageId property.
     * 
     */
    public void setInDocDetailsImageId(double value) {
        this.inDocDetailsImageId = value;
    }

    /**
     * Gets the value of the inDocDetailsImageNumber property.
     * 
     */
    public int getInDocDetailsImageNumber() {
        return inDocDetailsImageNumber;
    }

    /**
     * Sets the value of the inDocDetailsImageNumber property.
     * 
     */
    public void setInDocDetailsImageNumber(int value) {
        this.inDocDetailsImageNumber = value;
    }

    /**
     * Gets the value of the inDocDetailsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocDetailsDescription() {
        return inDocDetailsDescription;
    }

    /**
     * Sets the value of the inDocDetailsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocDetailsDescription(String value) {
        this.inDocDetailsDescription = value;
    }

    /**
     * Gets the value of the inDocDetailsPrftObjValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocDetailsPrftObjValue() {
        return inDocDetailsPrftObjValue;
    }

    /**
     * Sets the value of the inDocDetailsPrftObjValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocDetailsPrftObjValue(String value) {
        this.inDocDetailsPrftObjValue = value;
    }

    /**
     * Gets the value of the inDocDetailsPrftObjType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocDetailsPrftObjType() {
        return inDocDetailsPrftObjType;
    }

    /**
     * Sets the value of the inDocDetailsPrftObjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocDetailsPrftObjType(String value) {
        this.inDocDetailsPrftObjType = value;
    }

    /**
     * Gets the value of the inDocDetailsComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocDetailsComments() {
        return inDocDetailsComments;
    }

    /**
     * Sets the value of the inDocDetailsComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocDetailsComments(String value) {
        this.inDocDetailsComments = value;
    }

    /**
     * Gets the value of the inDocDetailsActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocDetailsActiveFlag() {
        return inDocDetailsActiveFlag;
    }

    /**
     * Sets the value of the inDocDetailsActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocDetailsActiveFlag(String value) {
        this.inDocDetailsActiveFlag = value;
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

    /**
     * Gets the value of the inTrxProductIdProduct property.
     * 
     */
    public int getInTrxProductIdProduct() {
        return inTrxProductIdProduct;
    }

    /**
     * Sets the value of the inTrxProductIdProduct property.
     * 
     */
    public void setInTrxProductIdProduct(int value) {
        this.inTrxProductIdProduct = value;
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

}
