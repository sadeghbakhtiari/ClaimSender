
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantitiesVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantitiesVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://thrita.behdasht.gov.ir/VM/}DO_QUANTITY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantitiesVO", propOrder = {
    "name",
    "value"
})
public class QuantitiesVO {

    @XmlElement(name = "Name")
    protected DOCODEDTEXT name;
    @XmlElement(name = "Value")
    protected DOQUANTITY value;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setName(DOCODEDTEXT value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DOQUANTITY }
     *     
     */
    public DOQUANTITY getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOQUANTITY }
     *     
     */
    public void setValue(DOQUANTITY value) {
        this.value = value;
    }

}
