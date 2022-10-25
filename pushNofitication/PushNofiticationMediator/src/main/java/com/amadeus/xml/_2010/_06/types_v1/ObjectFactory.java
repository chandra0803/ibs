
package com.amadeus.xml._2010._06.types_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml._2010._06.types_v1 package. 
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

    private final static QName _GenericWarningsTypeWarnings_QNAME = new QName("http://xml.amadeus.com/2010/06/Types_v1", "Warnings");
    private final static QName _GenericErrorsTypeErrors_QNAME = new QName("http://xml.amadeus.com/2010/06/Types_v1", "Errors");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml._2010._06.types_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PointOfSaleType }
     * 
     */
    public PointOfSaleType createPointOfSaleType() {
        return new PointOfSaleType();
    }

    /**
     * Create an instance of {@link CriteriaSetType }
     * 
     */
    public CriteriaSetType createCriteriaSetType() {
        return new CriteriaSetType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link GenericErrorsType }
     * 
     */
    public GenericErrorsType createGenericErrorsType() {
        return new GenericErrorsType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link RawDataType }
     * 
     */
    public RawDataType createRawDataType() {
        return new RawDataType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link GenericWarningsType }
     * 
     */
    public GenericWarningsType createGenericWarningsType() {
        return new GenericWarningsType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link ReplyType }
     * 
     */
    public ReplyType createReplyType() {
        return new ReplyType();
    }

    /**
     * Create an instance of {@link PointsOfSaleType }
     * 
     */
    public PointsOfSaleType createPointsOfSaleType() {
        return new PointsOfSaleType();
    }

    /**
     * Create an instance of {@link PointOfSaleType.BookingChannel }
     * 
     */
    public PointOfSaleType.BookingChannel createPointOfSaleTypeBookingChannel() {
        return new PointOfSaleType.BookingChannel();
    }

    /**
     * Create an instance of {@link CriteriaSetType.Criteria }
     * 
     */
    public CriteriaSetType.Criteria createCriteriaSetTypeCriteria() {
        return new CriteriaSetType.Criteria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarningsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.amadeus.com/2010/06/Types_v1", name = "Warnings", scope = GenericWarningsType.class)
    public JAXBElement<WarningsType> createGenericWarningsTypeWarnings(WarningsType value) {
        return new JAXBElement<WarningsType>(_GenericWarningsTypeWarnings_QNAME, WarningsType.class, GenericWarningsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.amadeus.com/2010/06/Types_v1", name = "Errors", scope = GenericErrorsType.class)
    public JAXBElement<ErrorsType> createGenericErrorsTypeErrors(ErrorsType value) {
        return new JAXBElement<ErrorsType>(_GenericErrorsTypeErrors_QNAME, ErrorsType.class, GenericErrorsType.class, value);
    }

}
