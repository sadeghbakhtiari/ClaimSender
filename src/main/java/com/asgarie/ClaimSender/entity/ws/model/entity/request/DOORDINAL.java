//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.11 at 05:06:35 AM IRDT 
//


package com.asgarie.ClaimSender.entity.model.entity.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DO_ORDINAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DO_ORDINAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://thrita.behdasht.gov.ir/VM}DO_CODED_TEXT" minOccurs="0" form="qualified"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DO_ORDINAL", propOrder = {
    "symbol",
    "value"
})
public class DOORDINAL {

    @XmlElement(name = "Symbol")
    protected DOCODEDTEXT symbol;
    @XmlElement(name = "Value", required = true, type = Integer.class, nillable = true)
    protected Integer value;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setSymbol(DOCODEDTEXT value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}