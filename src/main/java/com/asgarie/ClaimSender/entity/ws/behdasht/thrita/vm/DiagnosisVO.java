
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosisVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosisVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Diagnosis" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="DiagnosisDate" type="{http://thrita.behdasht.gov.ir/VM/}DO_DATE" minOccurs="0"/>
 *         &lt;element name="DiagnosisTime" type="{http://thrita.behdasht.gov.ir/VM/}DO_TIME" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://thrita.behdasht.gov.ir/VM/}DO_ORDINAL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisVO", propOrder = {
    "diagnosis",
    "comment",
    "status",
    "diagnosisDate",
    "diagnosisTime",
    "severity"
})
public class DiagnosisVO {

    @XmlElement(name = "Diagnosis")
    protected DOCODEDTEXT diagnosis;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Status")
    protected DOCODEDTEXT status;
    @XmlElement(name = "DiagnosisDate")
    protected DODATE diagnosisDate;
    @XmlElement(name = "DiagnosisTime")
    protected DOTIME diagnosisTime;
    @XmlElement(name = "Severity")
    protected DOORDINAL severity;

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setDiagnosis(DOCODEDTEXT value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setStatus(DOCODEDTEXT value) {
        this.status = value;
    }

    /**
     * Gets the value of the diagnosisDate property.
     * 
     * @return
     *     possible object is
     *     {@link DODATE }
     *     
     */
    public DODATE getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * Sets the value of the diagnosisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DODATE }
     *     
     */
    public void setDiagnosisDate(DODATE value) {
        this.diagnosisDate = value;
    }

    /**
     * Gets the value of the diagnosisTime property.
     * 
     * @return
     *     possible object is
     *     {@link DOTIME }
     *     
     */
    public DOTIME getDiagnosisTime() {
        return diagnosisTime;
    }

    /**
     * Sets the value of the diagnosisTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOTIME }
     *     
     */
    public void setDiagnosisTime(DOTIME value) {
        this.diagnosisTime = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link DOORDINAL }
     *     
     */
    public DOORDINAL getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOORDINAL }
     *     
     */
    public void setSeverity(DOORDINAL value) {
        this.severity = value;
    }

}
