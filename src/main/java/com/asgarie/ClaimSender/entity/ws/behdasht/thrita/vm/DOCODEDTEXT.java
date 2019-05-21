
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DO_CODED_TEXT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DO_CODED_TEXT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Terminology_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Coded_string" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DO_CODED_TEXT")
public class DOCODEDTEXT {

    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "Terminology_id")
    protected String terminologyId;
    @XmlAttribute(name = "Coded_string")
    protected String codedString;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the terminologyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminologyId() {
        return terminologyId;
    }

    /**
     * Sets the value of the terminologyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminologyId(String value) {
        this.terminologyId = value;
    }

    /**
     * Gets the value of the codedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedString() {
        return codedString;
    }

    /**
     * Sets the value of the codedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedString(String value) {
        this.codedString = value;
    }

}
