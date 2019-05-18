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
 * <p>Java class for ServiceDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetailsVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PKID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="RelativeCost" type="{http://thrita.behdasht.gov.ir/VM}ArrayOfRelativeCostVO" minOccurs="0" form="qualified"/>
 *         &lt;element name="OtherCosts" type="{http://thrita.behdasht.gov.ir/VM}ArrayOfQuantitiesVO" minOccurs="0" form="qualified"/>
 *         &lt;element name="BasicInsuranceContribution" type="{http://thrita.behdasht.gov.ir/VM}DO_QUANTITY" minOccurs="0" form="qualified"/>
 *         &lt;element name="Bed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ServiceCount" type="{http://thrita.behdasht.gov.ir/VM}DO_QUANTITY" minOccurs="0" form="qualified"/>
 *         &lt;element name="PatientContribution" type="{http://thrita.behdasht.gov.ir/VM}DO_QUANTITY" minOccurs="0" form="qualified"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="Service" type="{http://thrita.behdasht.gov.ir/VM}DO_CODED_TEXT" minOccurs="0" form="qualified"/>
 *         &lt;element name="StartDate" type="{http://thrita.behdasht.gov.ir/VM}DO_DATE" minOccurs="0" form="qualified"/>
 *         &lt;element name="StartTime" type="{http://thrita.behdasht.gov.ir/VM}DO_TIME" minOccurs="0" form="qualified"/>
 *         &lt;element name="EndDate" type="{http://thrita.behdasht.gov.ir/VM}DO_DATE" minOccurs="0" form="qualified"/>
 *         &lt;element name="EndTime" type="{http://thrita.behdasht.gov.ir/VM}DO_TIME" minOccurs="0" form="qualified"/>
 *         &lt;element name="ServiceType" type="{http://thrita.behdasht.gov.ir/VM}DO_CODED_TEXT" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalCharge" type="{http://thrita.behdasht.gov.ir/VM}DO_QUANTITY" minOccurs="0" form="qualified"/>
 *         &lt;element name="WardType" type="{http://thrita.behdasht.gov.ir/VM}DO_CODED_TEXT" minOccurs="0" form="qualified"/>
 *         &lt;element name="WardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="ServiceProvider" type="{http://thrita.behdasht.gov.ir/VM}HealthcareProviderVO" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDetailsVO", propOrder = {
    "pkid",
    "relativeCost",
    "otherCosts",
    "basicInsuranceContribution",
    "bed",
    "serviceCount",
    "patientContribution",
    "room",
    "service",
    "startDate",
    "startTime",
    "endDate",
    "endTime",
    "serviceType",
    "totalCharge",
    "wardType",
    "wardName",
    "serviceProvider"
})
public class ServiceDetailsVO {

    @XmlElement(name = "PKID")
    protected String pkid;
    @XmlElement(name = "RelativeCost")
    protected ArrayOfRelativeCostVO relativeCost;
    @XmlElement(name = "OtherCosts")
    protected ArrayOfQuantitiesVO otherCosts;
    @XmlElement(name = "BasicInsuranceContribution")
    protected DOQUANTITY basicInsuranceContribution;
    @XmlElement(name = "Bed")
    protected String bed;
    @XmlElement(name = "ServiceCount")
    protected DOQUANTITY serviceCount;
    @XmlElement(name = "PatientContribution")
    protected DOQUANTITY patientContribution;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "Service")
    protected DOCODEDTEXT service;
    @XmlElement(name = "StartDate")
    protected DODATE startDate;
    @XmlElement(name = "StartTime")
    protected DOTIME startTime;
    @XmlElement(name = "EndDate")
    protected DODATE endDate;
    @XmlElement(name = "EndTime")
    protected DOTIME endTime;
    @XmlElement(name = "ServiceType")
    protected DOCODEDTEXT serviceType;
    @XmlElement(name = "TotalCharge")
    protected DOQUANTITY totalCharge;
    @XmlElement(name = "WardType")
    protected DOCODEDTEXT wardType;
    @XmlElement(name = "WardName")
    protected String wardName;
    @XmlElement(name = "ServiceProvider")
    protected HealthcareProviderVO serviceProvider;

    /**
     * Gets the value of the pkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKID() {
        return pkid;
    }

    /**
     * Sets the value of the pkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKID(String value) {
        this.pkid = value;
    }

    /**
     * Gets the value of the relativeCost property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelativeCostVO }
     *     
     */
    public ArrayOfRelativeCostVO getRelativeCost() {
        return relativeCost;
    }

    /**
     * Sets the value of the relativeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelativeCostVO }
     *     
     */
    public void setRelativeCost(ArrayOfRelativeCostVO value) {
        this.relativeCost = value;
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
     * Gets the value of the bed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBed() {
        return bed;
    }

    /**
     * Sets the value of the bed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBed(String value) {
        this.bed = value;
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
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setService(DOCODEDTEXT value) {
        this.service = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DODATE }
     *     
     */
    public DODATE getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DODATE }
     *     
     */
    public void setStartDate(DODATE value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link DOTIME }
     *     
     */
    public DOTIME getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOTIME }
     *     
     */
    public void setStartTime(DOTIME value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DODATE }
     *     
     */
    public DODATE getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DODATE }
     *     
     */
    public void setEndDate(DODATE value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link DOTIME }
     *     
     */
    public DOTIME getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOTIME }
     *     
     */
    public void setEndTime(DOTIME value) {
        this.endTime = value;
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

    /**
     * Gets the value of the wardType property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getWardType() {
        return wardType;
    }

    /**
     * Sets the value of the wardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setWardType(DOCODEDTEXT value) {
        this.wardType = value;
    }

    /**
     * Gets the value of the wardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * Sets the value of the wardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWardName(String value) {
        this.wardName = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareProviderVO }
     *     
     */
    public HealthcareProviderVO getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareProviderVO }
     *     
     */
    public void setServiceProvider(HealthcareProviderVO value) {
        this.serviceProvider = value;
    }

}
