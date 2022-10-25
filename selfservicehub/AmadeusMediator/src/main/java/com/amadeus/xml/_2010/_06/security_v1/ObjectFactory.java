
package com.amadeus.xml._2010._06.security_v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml._2010._06.security_v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml._2010._06.security_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AMASecurityHostedUser }
     * 
     */
    public AMASecurityHostedUser createAMASecurityHostedUser() {
        return new AMASecurityHostedUser();
    }

    /**
     * Create an instance of {@link AMASecurityHostedUser.UserID }
     * 
     */
    public AMASecurityHostedUser.UserID createAMASecurityHostedUserUserID() {
        return new AMASecurityHostedUser.UserID();
    }

}
