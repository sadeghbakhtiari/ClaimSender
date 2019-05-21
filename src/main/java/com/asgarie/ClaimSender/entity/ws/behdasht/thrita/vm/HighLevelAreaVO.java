
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HighLevelAreaVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighLevelAreaVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NationalAreaCode" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="City" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="Town" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="District" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="RuralArea" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="Village" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighLevelAreaVO", propOrder = {
    "nationalAreaCode",
    "country",
    "province",
    "city",
    "town",
    "district",
    "ruralArea",
    "village"
})
public class HighLevelAreaVO {

    @XmlElement(name = "NationalAreaCode")
    protected DOCODEDTEXT nationalAreaCode;
    @XmlElement(name = "Country")
    protected DOCODEDTEXT country;
    @XmlElement(name = "Province")
    protected DOCODEDTEXT province;
    @XmlElement(name = "City")
    protected DOCODEDTEXT city;
    @XmlElement(name = "Town")
    protected DOCODEDTEXT town;
    @XmlElement(name = "District")
    protected DOCODEDTEXT district;
    @XmlElement(name = "RuralArea")
    protected DOCODEDTEXT ruralArea;
    @XmlElement(name = "Village")
    protected DOCODEDTEXT village;

    /**
     * Gets the value of the nationalAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getNationalAreaCode() {
        return nationalAreaCode;
    }

    /**
     * Sets the value of the nationalAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setNationalAreaCode(DOCODEDTEXT value) {
        this.nationalAreaCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setCountry(DOCODEDTEXT value) {
        this.country = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setProvince(DOCODEDTEXT value) {
        this.province = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setCity(DOCODEDTEXT value) {
        this.city = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setTown(DOCODEDTEXT value) {
        this.town = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setDistrict(DOCODEDTEXT value) {
        this.district = value;
    }

    /**
     * Gets the value of the ruralArea property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getRuralArea() {
        return ruralArea;
    }

    /**
     * Sets the value of the ruralArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setRuralArea(DOCODEDTEXT value) {
        this.ruralArea = value;
    }

    /**
     * Gets the value of the village property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getVillage() {
        return village;
    }

    /**
     * Sets the value of the village property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setVillage(DOCODEDTEXT value) {
        this.village = value;
    }

}
