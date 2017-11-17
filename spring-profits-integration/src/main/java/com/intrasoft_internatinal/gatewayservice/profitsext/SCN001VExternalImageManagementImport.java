
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCN001V_ExternalImageManagementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCN001V_ExternalImageManagementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpParametersInGrmTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InImageTypeDocCategoriesCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImageDetailsDocDetailsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImageDetailsDocDetailsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImageDetailsDocDetailsComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InImageCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InImageBlobScannedImageImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCN001V_ExternalImageManagementImport", propOrder = {
    "inCommandIefSuppliedCommand",
    "inGrpParametersInGrmTerminalTerminalNumber",
    "inGrpParametersInGrmTrxCountTrxCounter",
    "inImageTypeDocCategoriesCategoryId",
    "inImageDetailsDocDetailsFilename",
    "inImageDetailsDocDetailsDescription",
    "inImageDetailsDocDetailsComments",
    "inImageCustomerCustId",
    "inImageBlobScannedImageImage"
})
public class SCN001VExternalImageManagementImport
    extends BaseImport
{

    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InGrpParametersInGrmTerminalTerminalNumber")
    protected String inGrpParametersInGrmTerminalTerminalNumber;
    @XmlElement(name = "InGrpParametersInGrmTrxCountTrxCounter")
    protected int inGrpParametersInGrmTrxCountTrxCounter;
    @XmlElement(name = "InImageTypeDocCategoriesCategoryId")
    protected String inImageTypeDocCategoriesCategoryId;
    @XmlElement(name = "InImageDetailsDocDetailsFilename")
    protected String inImageDetailsDocDetailsFilename;
    @XmlElement(name = "InImageDetailsDocDetailsDescription")
    protected String inImageDetailsDocDetailsDescription;
    @XmlElement(name = "InImageDetailsDocDetailsComments")
    protected String inImageDetailsDocDetailsComments;
    @XmlElement(name = "InImageCustomerCustId")
    protected int inImageCustomerCustId;
    @XmlElement(name = "InImageBlobScannedImageImage")
    protected byte[] inImageBlobScannedImageImage;

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
     * Gets the value of the inImageTypeDocCategoriesCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImageTypeDocCategoriesCategoryId() {
        return inImageTypeDocCategoriesCategoryId;
    }

    /**
     * Sets the value of the inImageTypeDocCategoriesCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImageTypeDocCategoriesCategoryId(String value) {
        this.inImageTypeDocCategoriesCategoryId = value;
    }

    /**
     * Gets the value of the inImageDetailsDocDetailsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImageDetailsDocDetailsFilename() {
        return inImageDetailsDocDetailsFilename;
    }

    /**
     * Sets the value of the inImageDetailsDocDetailsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImageDetailsDocDetailsFilename(String value) {
        this.inImageDetailsDocDetailsFilename = value;
    }

    /**
     * Gets the value of the inImageDetailsDocDetailsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImageDetailsDocDetailsDescription() {
        return inImageDetailsDocDetailsDescription;
    }

    /**
     * Sets the value of the inImageDetailsDocDetailsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImageDetailsDocDetailsDescription(String value) {
        this.inImageDetailsDocDetailsDescription = value;
    }

    /**
     * Gets the value of the inImageDetailsDocDetailsComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInImageDetailsDocDetailsComments() {
        return inImageDetailsDocDetailsComments;
    }

    /**
     * Sets the value of the inImageDetailsDocDetailsComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInImageDetailsDocDetailsComments(String value) {
        this.inImageDetailsDocDetailsComments = value;
    }

    /**
     * Gets the value of the inImageCustomerCustId property.
     * 
     */
    public int getInImageCustomerCustId() {
        return inImageCustomerCustId;
    }

    /**
     * Sets the value of the inImageCustomerCustId property.
     * 
     */
    public void setInImageCustomerCustId(int value) {
        this.inImageCustomerCustId = value;
    }

    /**
     * Gets the value of the inImageBlobScannedImageImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInImageBlobScannedImageImage() {
        return inImageBlobScannedImageImage;
    }

    /**
     * Sets the value of the inImageBlobScannedImageImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInImageBlobScannedImageImage(byte[] value) {
        this.inImageBlobScannedImageImage = value;
    }

}
