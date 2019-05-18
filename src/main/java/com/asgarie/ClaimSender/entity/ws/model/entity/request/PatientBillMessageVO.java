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
 * <p>Java class for PatientBillMessageVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientBillMessageVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person" type="{http://thrita.behdasht.gov.ir/VM}PersonInfoVO" minOccurs="0" form="qualified"/>
 *         &lt;element name="MsgID" type="{http://thrita.behdasht.gov.ir/VM}MessageIdentifierVO" minOccurs="0" form="qualified"/>
 *         &lt;element name="Composition" type="{http://thrita.behdasht.gov.ir/VM}BillPatientCompositionVO" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientBillMessageVO", propOrder = {
    "person",
    "msgID",
    "composition"
})
public class PatientBillMessageVO {

    @XmlElement(name = "Person")
    protected PersonInfoVO person;
    @XmlElement(name = "MsgID")
    protected MessageIdentifierVO msgID;
    @XmlElement(name = "Composition")
    protected BillPatientCompositionVO composition;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoVO }
     *     
     */
    public PersonInfoVO getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoVO }
     *     
     */
    public void setPerson(PersonInfoVO value) {
        this.person = value;
    }

    /**
     * Gets the value of the msgID property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentifierVO }
     *     
     */
    public MessageIdentifierVO getMsgID() {
        return msgID;
    }

    /**
     * Sets the value of the msgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentifierVO }
     *     
     */
    public void setMsgID(MessageIdentifierVO value) {
        this.msgID = value;
    }

    /**
     * Gets the value of the composition property.
     * 
     * @return
     *     possible object is
     *     {@link BillPatientCompositionVO }
     *     
     */
    public BillPatientCompositionVO getComposition() {
        return composition;
    }

    /**
     * Sets the value of the composition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPatientCompositionVO }
     *     
     */
    public void setComposition(BillPatientCompositionVO value) {
        this.composition = value;
    }

}
