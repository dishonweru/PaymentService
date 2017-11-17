
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T1477_GetTheVoucherExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T1477_GetTheVoucherExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutWordIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpVoucher" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfT1477VOutGrpVoucherItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T1477_GetTheVoucherExport", propOrder = {
    "outWordIefSuppliedFlag",
    "outGrpVoucher"
})
public class T1477GetTheVoucherExport
    extends BaseExport
{

    @XmlElement(name = "OutWordIefSuppliedFlag")
    protected String outWordIefSuppliedFlag;
    @XmlElement(name = "OutGrpVoucher")
    protected ArrayOfT1477VOutGrpVoucherItem outGrpVoucher;

    /**
     * Gets the value of the outWordIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutWordIefSuppliedFlag() {
        return outWordIefSuppliedFlag;
    }

    /**
     * Sets the value of the outWordIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutWordIefSuppliedFlag(String value) {
        this.outWordIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfT1477VOutGrpVoucherItem }
     *     
     */
    public ArrayOfT1477VOutGrpVoucherItem getOutGrpVoucher() {
        return outGrpVoucher;
    }

    /**
     * Sets the value of the outGrpVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfT1477VOutGrpVoucherItem }
     *     
     */
    public void setOutGrpVoucher(ArrayOfT1477VOutGrpVoucherItem value) {
        this.outGrpVoucher = value;
    }

}
