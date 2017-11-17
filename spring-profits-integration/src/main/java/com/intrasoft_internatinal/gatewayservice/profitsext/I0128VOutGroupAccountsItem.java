
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for I0128VOutGroupAccountsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0128VOutGroupAccountsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGroupAccountsOutGrpAccDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupAccountsOutGrpAccDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0128VOutGroupAccountsItem", propOrder = {
    "outGroupAccountsOutGrpAccDepositAccountAccountNumber",
    "outGroupAccountsOutGrpAccDepositAccountCDigit"
})
public class I0128VOutGroupAccountsItem {

    @XmlElement(name = "OutGroupAccountsOutGrpAccDepositAccountAccountNumber")
    protected double outGroupAccountsOutGrpAccDepositAccountAccountNumber;
    @XmlElement(name = "OutGroupAccountsOutGrpAccDepositAccountCDigit")
    protected short outGroupAccountsOutGrpAccDepositAccountCDigit;

    /**
     * Gets the value of the outGroupAccountsOutGrpAccDepositAccountAccountNumber property.
     * 
     */
    public double getOutGroupAccountsOutGrpAccDepositAccountAccountNumber() {
        return outGroupAccountsOutGrpAccDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGroupAccountsOutGrpAccDepositAccountAccountNumber property.
     * 
     */
    public void setOutGroupAccountsOutGrpAccDepositAccountAccountNumber(double value) {
        this.outGroupAccountsOutGrpAccDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGroupAccountsOutGrpAccDepositAccountCDigit property.
     * 
     */
    public short getOutGroupAccountsOutGrpAccDepositAccountCDigit() {
        return outGroupAccountsOutGrpAccDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGroupAccountsOutGrpAccDepositAccountCDigit property.
     * 
     */
    public void setOutGroupAccountsOutGrpAccDepositAccountCDigit(short value) {
        this.outGroupAccountsOutGrpAccDepositAccountCDigit = value;
    }

}
