
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPatientCompositionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPatientCompositionVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Admission" type="{http://thrita.behdasht.gov.ir/VM/}AdmissionVO" minOccurs="0"/>
 *         &lt;element name="Discharge" type="{http://thrita.behdasht.gov.ir/VM/}DischargeVO" minOccurs="0"/>
 *         &lt;element name="BillSummary" type="{http://thrita.behdasht.gov.ir/VM/}BillSummaryVO" minOccurs="0"/>
 *         &lt;element name="BillServices" type="{http://thrita.behdasht.gov.ir/VM/}ArrayOfServiceDetailsVO1" minOccurs="0"/>
 *         &lt;element name="Insurance" type="{http://thrita.behdasht.gov.ir/VM/}ArrayOfInsuranceVO" minOccurs="0"/>
 *         &lt;element name="Death" type="{http://thrita.behdasht.gov.ir/VM/}BasicDeathDetailsVO" minOccurs="0"/>
 *         &lt;element name="Diagnosis" type="{http://thrita.behdasht.gov.ir/VM/}ArrayOfDiagnosisVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPatientCompositionVO", propOrder = {
    "admission",
    "discharge",
    "billSummary",
    "billServices",
    "insurance",
    "death",
    "diagnosis"
})
public class BillPatientCompositionVO {

    @XmlElement(name = "Admission")
    protected AdmissionVO admission;
    @XmlElement(name = "Discharge")
    protected DischargeVO discharge;
    @XmlElement(name = "BillSummary")
    protected BillSummaryVO billSummary;
    @XmlElement(name = "BillServices")
    protected ArrayOfServiceDetailsVO1 billServices;
    @XmlElement(name = "Insurance")
    protected ArrayOfInsuranceVO insurance;
    @XmlElement(name = "Death")
    protected BasicDeathDetailsVO death;
    @XmlElement(name = "Diagnosis")
    protected ArrayOfDiagnosisVO diagnosis;

    /**
     * Gets the value of the admission property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionVO }
     *     
     */
    public AdmissionVO getAdmission() {
        return admission;
    }

    /**
     * Sets the value of the admission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionVO }
     *     
     */
    public void setAdmission(AdmissionVO value) {
        this.admission = value;
    }

    /**
     * Gets the value of the discharge property.
     * 
     * @return
     *     possible object is
     *     {@link DischargeVO }
     *     
     */
    public DischargeVO getDischarge() {
        return discharge;
    }

    /**
     * Sets the value of the discharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link DischargeVO }
     *     
     */
    public void setDischarge(DischargeVO value) {
        this.discharge = value;
    }

    /**
     * Gets the value of the billSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BillSummaryVO }
     *     
     */
    public BillSummaryVO getBillSummary() {
        return billSummary;
    }

    /**
     * Sets the value of the billSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSummaryVO }
     *     
     */
    public void setBillSummary(BillSummaryVO value) {
        this.billSummary = value;
    }

    /**
     * Gets the value of the billServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceDetailsVO1 }
     *     
     */
    public ArrayOfServiceDetailsVO1 getBillServices() {
        return billServices;
    }

    /**
     * Sets the value of the billServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceDetailsVO1 }
     *     
     */
    public void setBillServices(ArrayOfServiceDetailsVO1 value) {
        this.billServices = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsuranceVO }
     *     
     */
    public ArrayOfInsuranceVO getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsuranceVO }
     *     
     */
    public void setInsurance(ArrayOfInsuranceVO value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the death property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDeathDetailsVO }
     *     
     */
    public BasicDeathDetailsVO getDeath() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDeathDetailsVO }
     *     
     */
    public void setDeath(BasicDeathDetailsVO value) {
        this.death = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDiagnosisVO }
     *     
     */
    public ArrayOfDiagnosisVO getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDiagnosisVO }
     *     
     */
    public void setDiagnosis(ArrayOfDiagnosisVO value) {
        this.diagnosis = value;
    }

}
