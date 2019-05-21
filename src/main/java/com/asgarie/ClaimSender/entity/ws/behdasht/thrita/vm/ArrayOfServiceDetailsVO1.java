
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfServiceDetailsVO1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceDetailsVO1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDetailsVO" type="{http://thrita.behdasht.gov.ir/VM/}ServiceDetailsVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceDetailsVO1", propOrder = {
    "serviceDetailsVO"
})
public class ArrayOfServiceDetailsVO1 {

    @XmlElement(name = "ServiceDetailsVO")
    protected List<ServiceDetailsVO> serviceDetailsVO;

    /**
     * Gets the value of the serviceDetailsVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDetailsVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDetailsVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDetailsVO }
     * 
     * 
     */
    public List<ServiceDetailsVO> getServiceDetailsVO() {
        if (serviceDetailsVO == null) {
            serviceDetailsVO = new ArrayList<ServiceDetailsVO>();
        }
        return this.serviceDetailsVO;
    }

}
