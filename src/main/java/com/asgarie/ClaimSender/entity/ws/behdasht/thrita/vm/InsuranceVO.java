
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceContribution" type="{http://thrita.behdasht.gov.ir/VM/}DO_QUANTITY" minOccurs="0"/>
 *         &lt;element name="InsuranceOtherCosts" type="{http://thrita.behdasht.gov.ir/VM/}ArrayOfQuantitiesVO" minOccurs="0"/>
 *         &lt;element name="Insurer" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="InsuranceBox" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="InsuranceBookletSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceExpirationDate" type="{http://thrita.behdasht.gov.ir/VM/}DO_DATE" minOccurs="0"/>
 *         &lt;element name="InsuredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHEBAD" type="{http://thrita.behdasht.gov.ir/VM/}DO_IDENTIFIER" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceVO", propOrder = {
    "insuranceContribution",
    "insuranceOtherCosts",
    "insurer",
    "insuranceBox",
    "insuranceBookletSerialNumber",
    "insuranceExpirationDate",
    "insuredNumber",
    "shebad"
})
public class InsuranceVO {

    @XmlElement(name = "InsuranceContribution")
    protected DOQUANTITY insuranceContribution;
    @XmlElement(name = "InsuranceOtherCosts")
    protected ArrayOfQuantitiesVO insuranceOtherCosts;
    @XmlElement(name = "Insurer")
    protected DOCODEDTEXT insurer;
    @XmlElement(name = "InsuranceBox")
    protected DOCODEDTEXT insuranceBox;
    @XmlElement(name = "InsuranceBookletSerialNumber")
    protected String insuranceBookletSerialNumber;
    @XmlElement(name = "InsuranceExpirationDate")
    protected DODATE insuranceExpirationDate;
    @XmlElement(name = "InsuredNumber")
    protected String insuredNumber;
    @XmlElement(name = "SHEBAD")
    protected DOIDENTIFIER shebad;

    /**
     * Gets the value of the insuranceContribution property.
     * 
     * @return
     *     possible object is
     *     {@link DOQUANTITY }
     *     
     */
    public DOQUANTITY getInsuranceContribution() {
        return insuranceContribution;
    }

    /**
     * Sets the value of the insuranceContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOQUANTITY }
     *     
     */
    public void setInsuranceContribution(DOQUANTITY value) {
        this.insuranceContribution = value;
    }

    /**
     * Gets the value of the insuranceOtherCosts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuantitiesVO }
     *     
     */
    public ArrayOfQuantitiesVO getInsuranceOtherCosts() {
        return insuranceOtherCosts;
    }

    /**
     * Sets the value of the insuranceOtherCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuantitiesVO }
     *     
     */
    public void setInsuranceOtherCosts(ArrayOfQuantitiesVO value) {
        this.insuranceOtherCosts = value;
    }

    /**
     * Gets the value of the insurer property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getInsurer() {
        return insurer;
    }

    /**
     * Sets the value of the insurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setInsurer(DOCODEDTEXT value) {
        this.insurer = value;
    }

    /**
     * Gets the value of the insuranceBox property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getInsuranceBox() {
        return insuranceBox;
    }

    /**
     * Sets the value of the insuranceBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setInsuranceBox(DOCODEDTEXT value) {
        this.insuranceBox = value;
    }

    /**
     * Gets the value of the insuranceBookletSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceBookletSerialNumber() {
        return insuranceBookletSerialNumber;
    }

    /**
     * Sets the value of the insuranceBookletSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceBookletSerialNumber(String value) {
        this.insuranceBookletSerialNumber = value;
    }

    /**
     * Gets the value of the insuranceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DODATE }
     *     
     */
    public DODATE getInsuranceExpirationDate() {
        return insuranceExpirationDate;
    }

    /**
     * Sets the value of the insuranceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DODATE }
     *     
     */
    public void setInsuranceExpirationDate(DODATE value) {
        this.insuranceExpirationDate = value;
    }

    /**
     * Gets the value of the insuredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredNumber() {
        return insuredNumber;
    }

    /**
     * Sets the value of the insuredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredNumber(String value) {
        this.insuredNumber = value;
    }

    /**
     * Gets the value of the shebad property.
     * 
     * @return
     *     possible object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public DOIDENTIFIER getSHEBAD() {
        return shebad;
    }

    /**
     * Sets the value of the shebad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOIDENTIFIER }
     *     
     */
    public void setSHEBAD(DOIDENTIFIER value) {
        this.shebad = value;
    }

}
