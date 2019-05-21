
package com.asgarie.ClaimSender.entity.ws.behdasht.sepas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePatientBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePatientBill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientBillMessageVO" type="{http://sepas.behdasht.gov.ir/}PatientBillMessageVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePatientBill", namespace = "ns1", propOrder = {
    "patientBillMessageVO"
})
public class SavePatientBill {

    @XmlElement(name = "PatientBillMessageVO", namespace = "")
    protected PatientBillMessageVO patientBillMessageVO;

    /**
     * Gets the value of the patientBillMessageVO property.
     * 
     * @return
     *     possible object is
     *     {@link PatientBillMessageVO }
     *     
     */
    public PatientBillMessageVO getPatientBillMessageVO() {
        return patientBillMessageVO;
    }

    /**
     * Sets the value of the patientBillMessageVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientBillMessageVO }
     *     
     */
    public void setPatientBillMessageVO(PatientBillMessageVO value) {
        this.patientBillMessageVO = value;
    }

}
