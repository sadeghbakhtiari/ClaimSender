
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfServiceGroupRowVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceGroupRowVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceGroupRowVO" type="{http://thrita.behdasht.gov.ir/VM/}ServiceGroupRowVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceGroupRowVO", propOrder = {
    "serviceGroupRowVO"
})
public class ArrayOfServiceGroupRowVO {

    @XmlElement(name = "ServiceGroupRowVO")
    protected List<ServiceGroupRowVO> serviceGroupRowVO;

    /**
     * Gets the value of the serviceGroupRowVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceGroupRowVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceGroupRowVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceGroupRowVO }
     * 
     * 
     */
    public List<ServiceGroupRowVO> getServiceGroupRowVO() {
        if (serviceGroupRowVO == null) {
            serviceGroupRowVO = new ArrayList<ServiceGroupRowVO>();
        }
        return this.serviceGroupRowVO;
    }

}
