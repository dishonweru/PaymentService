
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SL705VProfitsUserListSearchImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL705VProfitsUserListSearchImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InExpirGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterAtmUsrAtmUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterBatchUsrBatchUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterLoggedUserIefSuppliedSelectionCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterProfileUnitCategoryPerRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterRmUsrRmInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFilterSecRoleCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InFilterVirtualUsrVirtualUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelCrPassEndLoggedUserPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InSortingIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL705VProfitsUserListSearchImport", propOrder = {
    "command",
    "inDefaultBankemployeeLastName",
    "inDefaultUsrCode",
    "inExpirGenericDetailDescription",
    "inFilterAtmUsrAtmUser",
    "inFilterBankemployeeLastName",
    "inFilterBatchUsrBatchUser",
    "inFilterLoggedUserIefSuppliedSelectionCriteria",
    "inFilterProfileUnitCategoryPerRoleId",
    "inFilterRmUsrRmInd",
    "inFilterSecRoleCode",
    "inFilterUnitCode",
    "inFilterVirtualUsrVirtualUser",
    "inSelCrPassEndLoggedUserPasswordChangeDate",
    "inSortingIefSuppliedFlag",
    "inTrxSsSecurityCmcbTranCode"
})
public class SL705VProfitsUserListSearchImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InDefaultBankemployeeLastName")
    protected String inDefaultBankemployeeLastName;
    @XmlElement(name = "InDefaultUsrCode")
    protected String inDefaultUsrCode;
    @XmlElement(name = "InExpirGenericDetailDescription")
    protected String inExpirGenericDetailDescription;
    @XmlElement(name = "InFilterAtmUsrAtmUser")
    protected String inFilterAtmUsrAtmUser;
    @XmlElement(name = "InFilterBankemployeeLastName")
    protected String inFilterBankemployeeLastName;
    @XmlElement(name = "InFilterBatchUsrBatchUser")
    protected String inFilterBatchUsrBatchUser;
    @XmlElement(name = "InFilterLoggedUserIefSuppliedSelectionCriteria")
    protected String inFilterLoggedUserIefSuppliedSelectionCriteria;
    @XmlElement(name = "InFilterProfileUnitCategoryPerRoleId")
    protected String inFilterProfileUnitCategoryPerRoleId;
    @XmlElement(name = "InFilterRmUsrRmInd")
    protected String inFilterRmUsrRmInd;
    @XmlElement(name = "InFilterSecRoleCode")
    protected int inFilterSecRoleCode;
    @XmlElement(name = "InFilterUnitCode")
    protected int inFilterUnitCode;
    @XmlElement(name = "InFilterVirtualUsrVirtualUser")
    protected String inFilterVirtualUsrVirtualUser;
    @XmlElement(name = "InSelCrPassEndLoggedUserPasswordChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inSelCrPassEndLoggedUserPasswordChangeDate;
    @XmlElement(name = "InSortingIefSuppliedFlag")
    protected String inSortingIefSuppliedFlag;
    @XmlElement(name = "InTrxSsSecurityCmcbTranCode")
    protected String inTrxSsSecurityCmcbTranCode;

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
     * Gets the value of the inDefaultBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultBankemployeeLastName() {
        return inDefaultBankemployeeLastName;
    }

    /**
     * Sets the value of the inDefaultBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultBankemployeeLastName(String value) {
        this.inDefaultBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inDefaultUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultUsrCode() {
        return inDefaultUsrCode;
    }

    /**
     * Sets the value of the inDefaultUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultUsrCode(String value) {
        this.inDefaultUsrCode = value;
    }

    /**
     * Gets the value of the inExpirGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInExpirGenericDetailDescription() {
        return inExpirGenericDetailDescription;
    }

    /**
     * Sets the value of the inExpirGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInExpirGenericDetailDescription(String value) {
        this.inExpirGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inFilterAtmUsrAtmUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterAtmUsrAtmUser() {
        return inFilterAtmUsrAtmUser;
    }

    /**
     * Sets the value of the inFilterAtmUsrAtmUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterAtmUsrAtmUser(String value) {
        this.inFilterAtmUsrAtmUser = value;
    }

    /**
     * Gets the value of the inFilterBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterBankemployeeLastName() {
        return inFilterBankemployeeLastName;
    }

    /**
     * Sets the value of the inFilterBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterBankemployeeLastName(String value) {
        this.inFilterBankemployeeLastName = value;
    }

    /**
     * Gets the value of the inFilterBatchUsrBatchUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterBatchUsrBatchUser() {
        return inFilterBatchUsrBatchUser;
    }

    /**
     * Sets the value of the inFilterBatchUsrBatchUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterBatchUsrBatchUser(String value) {
        this.inFilterBatchUsrBatchUser = value;
    }

    /**
     * Gets the value of the inFilterLoggedUserIefSuppliedSelectionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterLoggedUserIefSuppliedSelectionCriteria() {
        return inFilterLoggedUserIefSuppliedSelectionCriteria;
    }

    /**
     * Sets the value of the inFilterLoggedUserIefSuppliedSelectionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterLoggedUserIefSuppliedSelectionCriteria(String value) {
        this.inFilterLoggedUserIefSuppliedSelectionCriteria = value;
    }

    /**
     * Gets the value of the inFilterProfileUnitCategoryPerRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterProfileUnitCategoryPerRoleId() {
        return inFilterProfileUnitCategoryPerRoleId;
    }

    /**
     * Sets the value of the inFilterProfileUnitCategoryPerRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterProfileUnitCategoryPerRoleId(String value) {
        this.inFilterProfileUnitCategoryPerRoleId = value;
    }

    /**
     * Gets the value of the inFilterRmUsrRmInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterRmUsrRmInd() {
        return inFilterRmUsrRmInd;
    }

    /**
     * Sets the value of the inFilterRmUsrRmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterRmUsrRmInd(String value) {
        this.inFilterRmUsrRmInd = value;
    }

    /**
     * Gets the value of the inFilterSecRoleCode property.
     * 
     */
    public int getInFilterSecRoleCode() {
        return inFilterSecRoleCode;
    }

    /**
     * Sets the value of the inFilterSecRoleCode property.
     * 
     */
    public void setInFilterSecRoleCode(int value) {
        this.inFilterSecRoleCode = value;
    }

    /**
     * Gets the value of the inFilterUnitCode property.
     * 
     */
    public int getInFilterUnitCode() {
        return inFilterUnitCode;
    }

    /**
     * Sets the value of the inFilterUnitCode property.
     * 
     */
    public void setInFilterUnitCode(int value) {
        this.inFilterUnitCode = value;
    }

    /**
     * Gets the value of the inFilterVirtualUsrVirtualUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFilterVirtualUsrVirtualUser() {
        return inFilterVirtualUsrVirtualUser;
    }

    /**
     * Sets the value of the inFilterVirtualUsrVirtualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFilterVirtualUsrVirtualUser(String value) {
        this.inFilterVirtualUsrVirtualUser = value;
    }

    /**
     * Gets the value of the inSelCrPassEndLoggedUserPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInSelCrPassEndLoggedUserPasswordChangeDate() {
        return inSelCrPassEndLoggedUserPasswordChangeDate;
    }

    /**
     * Sets the value of the inSelCrPassEndLoggedUserPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInSelCrPassEndLoggedUserPasswordChangeDate(XMLGregorianCalendar value) {
        this.inSelCrPassEndLoggedUserPasswordChangeDate = value;
    }

    /**
     * Gets the value of the inSortingIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSortingIefSuppliedFlag() {
        return inSortingIefSuppliedFlag;
    }

    /**
     * Sets the value of the inSortingIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSortingIefSuppliedFlag(String value) {
        this.inSortingIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inTrxSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxSsSecurityCmcbTranCode() {
        return inTrxSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inTrxSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxSsSecurityCmcbTranCode(String value) {
        this.inTrxSsSecurityCmcbTranCode = value;
    }

}
