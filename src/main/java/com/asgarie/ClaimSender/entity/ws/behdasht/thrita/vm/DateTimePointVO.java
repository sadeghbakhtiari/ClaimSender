
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimePointVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimePointVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Point" type="{http://thrita.behdasht.gov.ir/VM/}DO_CODED_TEXT" minOccurs="0"/>
 *         &lt;element name="PointDate" type="{http://thrita.behdasht.gov.ir/VM/}DO_DATE" minOccurs="0"/>
 *         &lt;element name="PointTime" type="{http://thrita.behdasht.gov.ir/VM/}DO_TIME" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimePointVO", propOrder = {
    "point",
    "pointDate",
    "pointTime"
})
public class DateTimePointVO {

    @XmlElement(name = "Point")
    protected DOCODEDTEXT point;
    @XmlElement(name = "PointDate")
    protected DODATE pointDate;
    @XmlElement(name = "PointTime")
    protected DOTIME pointTime;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public DOCODEDTEXT getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCODEDTEXT }
     *     
     */
    public void setPoint(DOCODEDTEXT value) {
        this.point = value;
    }

    /**
     * Gets the value of the pointDate property.
     * 
     * @return
     *     possible object is
     *     {@link DODATE }
     *     
     */
    public DODATE getPointDate() {
        return pointDate;
    }

    /**
     * Sets the value of the pointDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DODATE }
     *     
     */
    public void setPointDate(DODATE value) {
        this.pointDate = value;
    }

    /**
     * Gets the value of the pointTime property.
     * 
     * @return
     *     possible object is
     *     {@link DOTIME }
     *     
     */
    public DOTIME getPointTime() {
        return pointTime;
    }

    /**
     * Sets the value of the pointTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DOTIME }
     *     
     */
    public void setPointTime(DOTIME value) {
        this.pointTime = value;
    }

}
