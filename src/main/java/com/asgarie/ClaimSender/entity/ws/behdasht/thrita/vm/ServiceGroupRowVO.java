
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceGroupRowVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceGroupRowVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatientContribution" type="{http://thrita.behdasht.gov.ir/VM/}DO_QUANTITY" minOccurs="0"/>
 *         &lt;element name="OtherCosts" type="{http://thrita.behdasht.gov.ir/VM/}ArrayOfQuantitiesVO" minOccurs="0"/>
 *         &lt;element name="BasicInsuranceContribution" type="{http://thrita.behdasht.gov.ir/VM/}DO_QUANTITY" minOccurs="0"/>
 *         &lt;element name="ServiceCount" type="{http://thrita.behdasht.gov.ir/VM/}DO_QUANTITY" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="TotalCharge" type="{http://thrita.behdasht.gov.ir/VM/}DO_QUANTITY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceGroupRowVO", propOrder = {
    "patientContribution",
    "otherCosts",
    "basicInsuranceContribution",
    "serviceCount",
    "serviceType",
    "totalCharge"
})
public class ServiceGroupRowVO {

    @XmlElement(name = "PatientContribution")
    protected DOQUANTITY patientContribution;
    @XmlElement(name = "OtherCosts")
    protected ArrayOfQuantitiesVO otherCosts;
    @XmlElement(name = "BasicInsuranceContribution")
    protected DOQUANTITY basicInsuranceContribution;
    @XmlElement(name = "ServiceCount")
    protected DOQUANTITY serviceCount;
    @XmlElement(name = "ServiceType")
    protected DOCODEDTEXT serviceType;
    @XmlElement(name = "TotalCharge")
    protected DOQUANTITY totalCharge;

    /**
     * Gets the value of the patientContribution property.
     * 
     * @return
     *     possible object is
     *     {@link DOQUANTITY }
     *     
     */
    public DOQUANTITY getPatientContribution() {
        return patientContribution;
    }

    /**
     * Sets the value of the patientContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOQUANTITY }
     *     
     */
    public void setPatientContribution(DOQUANTITY value) {
        this.patientContribution = value;
    }

    /**
     * Gets the value of the otherCosts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuantitiesVO }
     *     
     */
    public ArrayOfQuantitiesVO getOtherCosts() {
        return otherCosts;
    }

    /**
     * Sets the value of the otherCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuantitiesVO }
     *     
     */
    public void setOtherCosts(ArrayOfQuantitiesVO value) {
        this.otherCosts = value;
    }

    /**
     * Gets the value of the basicInsuranceContribution property.
     * 
     * @return
     *     possible object is
     *     {@link DOQUANTITY }
     *     
     */
    public DOQUANTITY getBasicInsuranceContribution() {
        return basicInsuranceContribution;
    }

    /**
     * Sets the value of the basicInsuranceContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOQUANTITY }
     *     
     */
    public void setBasicInsuranceContribution(DOQUANTITY value) {
        this.basicInsuranceContribution = value;
    }

    /**
     * Gets the value of the serviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link DOQUANTITY }
     *     
     */
    public DOQUANTITY getServiceCount() {
        return serviceCount;
    }

    /**
     * Sets the value of the serviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOQUANTITY }
     *     
     */
    public void setServiceCount(DOQUANTITY value) {
        this.serviceCount = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setServiceType(DOCODEDTEXT value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link DOQUANTITY }
     *     
     */
    public DOQUANTITY getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOQUANTITY }
     *     
     */
    public void setTotalCharge(DOQUANTITY value) {
        this.totalCharge = value;
    }

}
