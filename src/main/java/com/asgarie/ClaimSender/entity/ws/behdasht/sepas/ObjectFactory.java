
package com.asgarie.ClaimSender.entity.ws.behdasht.sepas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ir.gov.behdasht.sepas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PatientBillMessageVO_QNAME = new QName("http://sepas.behdasht.gov.ir/", "PatientBillMessageVO");
    private final static QName _SavePatientBillResponse_QNAME = new QName("http://sepas.behdasht.gov.ir/", "savePatientBillResponse");
    private final static QName _SavePatientBill_QNAME = new QName("http://sepas.behdasht.gov.ir/", "savePatientBill");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ir.gov.behdasht.sepas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PatientBillMessageVO }
     * 
     */
    public PatientBillMessageVO createPatientBillMessageVO() {
        return new PatientBillMessageVO();
    }

    /**
     * Create an instance of {@link SavePatientBillResponse }
     * 
     */
    public SavePatientBillResponse createSavePatientBillResponse() {
        return new SavePatientBillResponse();
    }

    /**
     * Create an instance of {@link SavePatientBill }
     * 
     */
    public SavePatientBill createSavePatientBill() {
        return new SavePatientBill();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatientBillMessageVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sepas.behdasht.gov.ir/", name = "PatientBillMessageVO")
    public JAXBElement<PatientBillMessageVO> createPatientBillMessageVO(PatientBillMessageVO value) {
        return new JAXBElement<PatientBillMessageVO>(_PatientBillMessageVO_QNAME, PatientBillMessageVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePatientBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sepas.behdasht.gov.ir/", name = "savePatientBillResponse")
    public JAXBElement<SavePatientBillResponse> createSavePatientBillResponse(SavePatientBillResponse value) {
        return new JAXBElement<SavePatientBillResponse>(_SavePatientBillResponse_QNAME, SavePatientBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePatientBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sepas.behdasht.gov.ir/", name = "savePatientBill")
    public JAXBElement<SavePatientBill> createSavePatientBill(SavePatientBill value) {
        return new JAXBElement<SavePatientBill>(_SavePatientBill_QNAME, SavePatientBill.class, null, value);
    }

}
