
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageIdentifierVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageIdentifierVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersionLifecycleState" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="IS_Queriable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CompositionSignature" type="{http://thrita.behdasht.gov.ir/VM/}SignatureVO" minOccurs="0"/>
 *         &lt;element name="SystemID" type="{http://thrita.behdasht.gov.ir/VM/}DO_IDENTIFIER" minOccurs="0"/>
 *         &lt;element name="HealthCareFacilityID" type="{http://thrita.behdasht.gov.ir/VM/}DO_IDENTIFIER" minOccurs="0"/>
 *         &lt;element name="PatientUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompositionUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Committer" type="{http://thrita.behdasht.gov.ir/VM/}ProviderInfoVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageIdentifierVO", propOrder = {
    "versionLifecycleState",
    "isQueriable",
    "compositionSignature",
    "systemID",
    "healthCareFacilityID",
    "patientUID",
    "compositionUID",
    "committer"
})
public class MessageIdentifierVO {

    @XmlElement(name = "VersionLifecycleState")
    protected DOCODEDTEXT versionLifecycleState;
    @XmlElement(name = "IS_Queriable", required = true, type = Boolean.class, nillable = true)
    protected Boolean isQueriable;
    @XmlElement(name = "CompositionSignature")
    protected SignatureVO compositionSignature;
    @XmlElement(name = "SystemID")
    protected DOIDENTIFIER systemID;
    @XmlElement(name = "HealthCareFacilityID")
    protected DOIDENTIFIER healthCareFacilityID;
    @XmlElement(name = "PatientUID")
    protected String patientUID;
    @XmlElement(name = "CompositionUID")
    protected String compositionUID;
    @XmlElement(name = "Committer")
    protected ProviderInfoVO committer;

    /**
     * Gets the value of the versionLifecycleState property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getVersionLifecycleState() {
        return versionLifecycleState;
    }

    /**
     * Sets the value of the versionLifecycleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setVersionLifecycleState(DOCODEDTEXT value) {
        this.versionLifecycleState = value;
    }

    /**
     * Gets the value of the isQueriable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISQueriable() {
        return isQueriable;
    }

    /**
     * Sets the value of the isQueriable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISQueriable(Boolean value) {
        this.isQueriable = value;
    }

    /**
     * Gets the value of the compositionSignature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureVO }
     *     
     */
    public SignatureVO getCompositionSignature() {
        return compositionSignature;
    }

    /**
     * Sets the value of the compositionSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureVO }
     *     
     */
    public void setCompositionSignature(SignatureVO value) {
        this.compositionSignature = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public DOIDENTIFIER getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public void setSystemID(DOIDENTIFIER value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the healthCareFacilityID property.
     * 
     * @return
     *     possible object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public DOIDENTIFIER getHealthCareFacilityID() {
        return healthCareFacilityID;
    }

    /**
     * Sets the value of the healthCareFacilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public void setHealthCareFacilityID(DOIDENTIFIER value) {
        this.healthCareFacilityID = value;
    }

    /**
     * Gets the value of the patientUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientUID() {
        return patientUID;
    }

    /**
     * Sets the value of the patientUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientUID(String value) {
        this.patientUID = value;
    }

    /**
     * Gets the value of the compositionUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositionUID() {
        return compositionUID;
    }

    /**
     * Sets the value of the compositionUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositionUID(String value) {
        this.compositionUID = value;
    }

    /**
     * Gets the value of the committer property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderInfoVO }
     *     
     */
    public ProviderInfoVO getCommitter() {
        return committer;
    }

    /**
     * Sets the value of the committer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderInfoVO }
     *     
     */
    public void setCommitter(ProviderInfoVO value) {
        this.committer = value;
    }

}
