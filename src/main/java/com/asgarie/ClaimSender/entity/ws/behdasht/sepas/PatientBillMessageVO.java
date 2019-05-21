
package com.asgarie.ClaimSender.entity.ws.behdasht.sepas;

import com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm.BillPatientCompositionVO;
import com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm.MessageIdentifierVO;
import com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm.PersonInfoVO;

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
 *         &lt;element ref="{http://thrita.behdasht.gov.ir/VM/}Person" minOccurs="0"/>
 *         &lt;element ref="{http://thrita.behdasht.gov.ir/VM/}MsgID" minOccurs="0"/>
 *         &lt;element ref="{http://thrita.behdasht.gov.ir/VM/}Composition" minOccurs="0"/>
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

    @XmlElement(name = "Person", namespace = "http://thrita.behdasht.gov.ir/VM/")
    protected PersonInfoVO person;
    @XmlElement(name = "MsgID", namespace = "http://thrita.behdasht.gov.ir/VM/")
    protected MessageIdentifierVO msgID;
    @XmlElement(name = "Composition", namespace = "http://thrita.behdasht.gov.ir/VM/")
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
