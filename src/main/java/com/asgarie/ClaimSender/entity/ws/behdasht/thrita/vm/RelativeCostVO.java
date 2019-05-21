
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeCostVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeCostVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KType" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeCostVO", propOrder = {
    "kValue",
    "kType"
})
public class RelativeCostVO {

    @XmlElement(name = "KValue", required = true, type = Double.class, nillable = true)
    protected Double kValue;
    @XmlElement(name = "KType")
    protected DOCODEDTEXT kType;

    /**
     * Gets the value of the kValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKValue() {
        return kValue;
    }

    /**
     * Sets the value of the kValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKValue(Double value) {
        this.kValue = value;
    }

    /**
     * Gets the value of the kType property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getKType() {
        return kType;
    }

    /**
     * Sets the value of the kType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setKType(DOCODEDTEXT value) {
        this.kType = value;
    }

}
