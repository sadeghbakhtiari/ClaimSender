
package com.asgarie.ClaimSender.entity.ws.behdasht.thrita.vm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfDO_IDENTIFIER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDO_IDENTIFIER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DO_IDENTIFIER" type="{http://thrita.behdasht.gov.ir/VM/}DO_IDENTIFIER" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDO_IDENTIFIER", propOrder = {
    "doidentifier"
})
public class ArrayOfDOIDENTIFIER {

    @XmlElement(name = "DO_IDENTIFIER", nillable = true)
    protected List<DOIDENTIFIER> doidentifier;

    /**
     * Gets the value of the doidentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doidentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOIDENTIFIER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOIDENTIFIER }
     * 
     * 
     */
    public List<DOIDENTIFIER> getDOIDENTIFIER() {
        if (doidentifier == null) {
            doidentifier = new ArrayList<DOIDENTIFIER>();
        }
        return this.doidentifier;
    }

}
