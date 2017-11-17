
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI3496V_UsersListExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI3496V_UsersListExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutContinueUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUsers" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfCI3496VOutGrpUsersItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI3496V_UsersListExport", propOrder = {
    "outContinueUsrCode",
    "outGrpUsers"
})
public class CI3496VUsersListExport
    extends BaseExport
{

    @XmlElement(name = "OutContinueUsrCode")
    protected String outContinueUsrCode;
    @XmlElement(name = "OutGrpUsers")
    protected ArrayOfCI3496VOutGrpUsersItem outGrpUsers;

    /**
     * Gets the value of the outContinueUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContinueUsrCode() {
        return outContinueUsrCode;
    }

    /**
     * Sets the value of the outContinueUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContinueUsrCode(String value) {
        this.outContinueUsrCode = value;
    }

    /**
     * Gets the value of the outGrpUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCI3496VOutGrpUsersItem }
     *     
     */
    public ArrayOfCI3496VOutGrpUsersItem getOutGrpUsers() {
        return outGrpUsers;
    }

    /**
     * Sets the value of the outGrpUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCI3496VOutGrpUsersItem }
     *     
     */
    public void setOutGrpUsers(ArrayOfCI3496VOutGrpUsersItem value) {
        this.outGrpUsers = value;
    }

}
