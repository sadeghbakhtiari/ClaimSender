
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DO_QUANTITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DO_QUANTITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Magnitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DO_QUANTITY", propOrder = {
    "magnitude"
})
public class DOQUANTITY {

    @XmlElement(name = "Magnitude", required = true, type = Double.class, nillable = true)
    protected Double magnitude;
    @XmlAttribute(name = "Unit")
    protected String unit;

    /**
     * Gets the value of the magnitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMagnitude() {
        return magnitude;
    }

    /**
     * Sets the value of the magnitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMagnitude(Double value) {
        this.magnitude = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
