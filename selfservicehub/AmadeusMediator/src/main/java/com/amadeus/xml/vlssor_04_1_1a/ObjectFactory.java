
package com.amadeus.xml.vlssor_04_1_1a;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml.vlssor_04_1_1a package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml.vlssor_04_1_1a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecuritySignOutReply }
     * 
     */
    public SecuritySignOutReply createSecuritySignOutReply() {
        return new SecuritySignOutReply();
    }

    /**
     * Create an instance of {@link SecuritySignOutReply.ErrorSection }
     * 
     */
    public SecuritySignOutReply.ErrorSection createSecuritySignOutReplyErrorSection() {
        return new SecuritySignOutReply.ErrorSection();
    }

    /**
     * Create an instance of {@link ResponseAnalysisDetailsType }
     * 
     */
    public ResponseAnalysisDetailsType createResponseAnalysisDetailsType() {
        return new ResponseAnalysisDetailsType();
    }

    /**
     * Create an instance of {@link ApplicationErrorDetailType }
     * 
     */
    public ApplicationErrorDetailType createApplicationErrorDetailType() {
        return new ApplicationErrorDetailType();
    }

    /**
     * Create an instance of {@link ApplicationErrorInformationType }
     * 
     */
    public ApplicationErrorInformationType createApplicationErrorInformationType() {
        return new ApplicationErrorInformationType();
    }

    /**
     * Create an instance of {@link FreeTextQualificationTypeI }
     * 
     */
    public FreeTextQualificationTypeI createFreeTextQualificationTypeI() {
        return new FreeTextQualificationTypeI();
    }

    /**
     * Create an instance of {@link InteractiveFreeTextTypeI }
     * 
     */
    public InteractiveFreeTextTypeI createInteractiveFreeTextTypeI() {
        return new InteractiveFreeTextTypeI();
    }

}
