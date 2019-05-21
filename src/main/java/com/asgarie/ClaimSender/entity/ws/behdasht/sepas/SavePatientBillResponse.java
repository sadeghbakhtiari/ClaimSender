
package com.asgarie.ClaimSender.entity.ws.behdasht.sepas;

import com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm.ResultVO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePatientBillResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePatientBillResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultVO" type="{http://thrita.behdasht.gov.ir/VM/}ResultVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePatientBillResponse", namespace = "ns2", propOrder = {
    "resultVO"
})
public class SavePatientBillResponse {

    @XmlElement(name = "ResultVO", namespace = "")
    protected ResultVO resultVO;

    /**
     * Gets the value of the resultVO property.
     * 
     * @return
     *     possible object is
     *     {@link ResultVO }
     *     
     */
    public ResultVO getResultVO() {
        return resultVO;
    }

    /**
     * Sets the value of the resultVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultVO }
     *     
     */
    public void setResultVO(ResultVO value) {
        this.resultVO = value;
    }

}
