
package com.amadeus.wsdl._2010._06.ws.link_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.wsdl._2010._06.ws.link_v1 package. 
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

    private final static QName _TransactionFlowLink_QNAME = new QName("http://wsdl.amadeus.com/2010/06/ws/Link_v1", "TransactionFlowLink");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.wsdl._2010._06.ws.link_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionFlowLinkType }
     * 
     */
    public TransactionFlowLinkType createTransactionFlowLinkType() {
        return new TransactionFlowLinkType();
    }

    /**
     * Create an instance of {@link ReceiverType }
     * 
     */
    public ReceiverType createReceiverType() {
        return new ReceiverType();
    }

    /**
     * Create an instance of {@link ConsumerType }
     * 
     */
    public ConsumerType createConsumerType() {
        return new ConsumerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionFlowLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.amadeus.com/2010/06/ws/Link_v1", name = "TransactionFlowLink")
    public JAXBElement<TransactionFlowLinkType> createTransactionFlowLink(TransactionFlowLinkType value) {
        return new JAXBElement<TransactionFlowLinkType>(_TransactionFlowLink_QNAME, TransactionFlowLinkType.class, null, value);
    }

}
