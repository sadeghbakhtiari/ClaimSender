//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.11 at 05:06:35 AM IRDT 
//


package com.asgarie.ClaimSender.entity.ws.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ID" type="{http://thrita.behdasht.gov.ir/VM}DO_IDENTIFIER" minOccurs="0" form="qualified"/>
 *         &lt;element name="Type" type="{http://thrita.behdasht.gov.ir/VM}DO_CODED_TEXT" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://thrita.behdasht.gov.ir/VM}HighLevelAreaVO" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationVO", propOrder = {
    "name",
    "id",
    "type",
    "location"
})
public class OrganizationVO {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ID")
    protected DOIDENTIFIER id;
    @XmlElement(name = "Type")
    protected DOCODEDTEXT type;
    @XmlElement(name = "Location")
    protected HighLevelAreaVO location;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public DOIDENTIFIER getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public void setID(DOIDENTIFIER value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setType(DOCODEDTEXT value) {
        this.type = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link HighLevelAreaVO }
     *     
     */
    public HighLevelAreaVO getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighLevelAreaVO }
     *     
     */
    public void setLocation(HighLevelAreaVO value) {
        this.location = value;
    }

}