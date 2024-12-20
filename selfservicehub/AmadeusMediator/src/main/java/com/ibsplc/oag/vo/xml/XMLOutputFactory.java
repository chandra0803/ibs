package com.ibsplc.oag.vo.xml;

import javax.xml.transform.Result;

/**
 * Defines an abstract implementation of a factory for
 * getting XMLEventWriters and XMLStreamWriters.
 *
 * The following table defines the standard properties of this specification.
 * Each property varies in the level of support required by each implementation.
 * The level of support required is described in the 'Required' column.
 *
 *     <table border="2" rules="all" cellpadding="4">
 *     <thead>
 *      <tr>
 *        <th align="center" colspan="2">
 *          Configuration parameters
 *        </th>
 *      </tr>
 *    </thead>
 *    <tbody>
 *      <tr>
 *        <th>Property Name</th>
 *        <th>Behavior</th>
 *        <th>Return type</th>
 *        <th>Default Value</th>
 *        <th>Required</th>
 *              </tr>
 *         <tr><td>javax.xml.stream.isRepairingNamespaces</td><td>defaults prefixes on the output side</td><td>Boolean</td><td>False</td><td>Yes</td></tr>
 *      </tbody>
 *   </table>
 *
 * <p>The following paragraphs describe the namespace and prefix repair algorithm:</p>
 *
 * <p>The property can be set with the following code line:
 * <code>setProperty("javax.xml.stream.isRepairingNamespaces",new Boolean(true|false));</code></p>
 *
 * <p>This property specifies that the writer default namespace prefix declarations.
 * The default value is false. </p>
 *
 * <p>If a writer isRepairingNamespaces it will create a namespace declaration
 * on the current StartElement for
 * any attribute that does not
 * currently have a namespace declaration in scope.  If the StartElement
 * has a uri but no prefix specified a prefix will be assigned, if the prefix
 * has not been declared in a parent of the current StartElement it will be declared
 * on the current StartElement.  If the defaultNamespace is bound and in scope
 * and the default namespace matches the URI of the attribute or StartElement
 * QName no prefix will be assigned.</p>
 *
 * <p>If an element or attribute name has a prefix, but is not
 * bound to any namespace URI, then the prefix will be removed
 * during serialization.</p>
 *
 * <p>If element and/or attribute names in the same start or
 * empty-element tag are bound to different namespace URIs and
 * are using the same prefix then the element or the first
 * occurring attribute retains the original prefix and the
 * following attributes have their prefixes replaced with a
 * new prefix that is bound to the namespace URIs of those
 * attributes. </p>
 *
 * <p>If an element or attribute name uses a prefix that is
 * bound to a different URI than that inherited from the
 * namespace context of the parent of that element and there
 * is no namespace declaration in the context of the current
 * element then such a namespace declaration is added. </p>
 *
 * <p>If an element or attribute name is bound to a prefix and
 * there is a namespace declaration that binds that prefix
 * to a different URI then that namespace declaration is
 * either removed if the correct mapping is inherited from
 * the parent context of that element, or changed to the
 * namespace URI of the element or attribute using that prefix.</p>
 *
 * @version 1.2
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see XMLInputFactory
 * @see XMLEventWriter
 * @see XMLStreamWriter
 * @since 1.6
 */
public abstract class XMLOutputFactory {
  /**
   * Property used to set prefix defaulting on the output side
   */
  public static final String IS_REPAIRING_NAMESPACES=
    "javax.xml.stream.isRepairingNamespaces";

  static final String JAXPFACTORYID = "javax.xml.stream.XMLOutputFactory";
  static final String DEFAULIMPL = "com.sun.xml.internal.stream.XMLOutputFactoryImpl";

  protected XMLOutputFactory(){}

  /**
   * Create a new instance of the factory.
   * @throws FactoryConfigurationError if an instance of this factory cannot be loaded
   */
  public static XMLOutputFactory newInstance()
    throws FactoryConfigurationError
  {
    return (XMLOutputFactory) FactoryFinder.find(JAXPFACTORYID, DEFAULIMPL, true);
  }

  /**
   * Create a new instance of the factory.
   * This static method creates a new factory instance. This method uses the
   * following ordered lookup procedure to determine the XMLOutputFactory
   * implementation class to load:
   *   Use the javax.xml.stream.XMLOutputFactory system property.
   *   Use the properties file "lib/stax.properties" in the JRE directory.
   *     This configuration file is in standard java.util.Properties format
   *     and contains the fully qualified name of the implementation class
   *     with the key being the system property defined above.
   *   Use the Services API (as detailed in the JAR specification), if available,
   *     to determine the classname. The Services API will look for a classname
   *     in the file META-INF/services/javax.xml.stream.XMLOutputFactory in jars
   *     available to the runtime.
   *   Platform default XMLOutputFactory instance.
   *
   * Once an application has obtained a reference to a XMLOutputFactory it
   * can use the factory to configure and obtain stream instances.
   *
   * Note that this is a new method that replaces the deprecated newInstance() method.
   *   No changes in behavior are defined by this replacement method relative to the
   *   deprecated method.
   *
   * @throws FactoryConfigurationError if an instance of this factory cannot be loaded
   */
  public static XMLOutputFactory newFactory()
    throws FactoryConfigurationError
  {
    return (XMLOutputFactory) FactoryFinder.find(JAXPFACTORYID, DEFAULIMPL, true);
  }

  /**
   * Create a new instance of the factory.
   *
   * @param factoryId             Name of the factory to find, same as
   *                              a property name
   * @param classLoader           classLoader to use
   * @return the factory implementation
   * @throws FactoryConfigurationError if an instance of this factory cannot be loaded
   *
   * @deprecated  This method has been deprecated because it returns an
   *              instance of XMLInputFactory, which is of the wrong class.
   *              Use the new method {@link #newFactory(java.lang.String,
   *              java.lang.ClassLoader)} instead.
   */
  public static XMLInputFactory newInstance(String factoryId,
          ClassLoader classLoader)
          throws FactoryConfigurationError {
      try {
          //do not fallback if given classloader can't find the class, throw exception
          return (XMLInputFactory) FactoryFinder.find(factoryId, classLoader,
                  null, factoryId.equals(JAXPFACTORYID) ? true : false);
      } catch (FactoryFinder.ConfigurationError e) {
          throw new FactoryConfigurationError(e.getException(),
                  e.getMessage());
      }
  }

  /**
   * Create a new instance of the factory.
   * If the classLoader argument is null, then the ContextClassLoader is used.
   *
   * Note that this is a new method that replaces the deprecated
   *   newInstance(String factoryId, ClassLoader classLoader) method.
   *
   *   No changes in behavior are defined by this replacement method relative
   *   to the deprecated method.
   *
   *
   * @param factoryId             Name of the factory to find, same as
   *                              a property name
   * @param classLoader           classLoader to use
   * @return the factory implementation
   * @throws FactoryConfigurationError if an instance of this factory cannot be loaded
   */
  public static XMLOutputFactory newFactory(String factoryId,
          ClassLoader classLoader)
          throws FactoryConfigurationError {
      try {
          //do not fallback if given classloader can't find the class, throw exception
          return (XMLOutputFactory) FactoryFinder.find(factoryId, classLoader,
                  null, factoryId.equals(JAXPFACTORYID) ? true : false);
      } catch (FactoryFinder.ConfigurationError e) {
          throw new FactoryConfigurationError(e.getException(),
                  e.getMessage());
      }
  }

  /**
   * Create a new XMLStreamWriter that writes to a writer
   * @param stream the writer to write to
   * @throws XMLStreamException
   */
  public abstract XMLStreamWriter createXMLStreamWriter(java.io.Writer stream) throws XMLStreamException;

  /**
   * Create a new XMLStreamWriter that writes to a stream
   * @param stream the stream to write to
   * @throws XMLStreamException
   */
  public abstract XMLStreamWriter createXMLStreamWriter(java.io.OutputStream stream) throws XMLStreamException;

  /**
   * Create a new XMLStreamWriter that writes to a stream
   * @param stream the stream to write to
   * @param encoding the encoding to use
   * @throws XMLStreamException
   */
  public abstract XMLStreamWriter createXMLStreamWriter(java.io.OutputStream stream,
                                         String encoding) throws XMLStreamException;

  /**
   * Create a new XMLStreamWriter that writes to a JAXP result.  This method is optional.
   * @param result the result to write to
   * @throws UnsupportedOperationException if this method is not
   * supported by this XMLOutputFactory
   * @throws XMLStreamException
   */
  public abstract XMLStreamWriter createXMLStreamWriter(Result result) throws XMLStreamException;


  /**
   * Create a new XMLEventWriter that writes to a JAXP result.  This method is optional.
   * @param result the result to write to
   * @throws UnsupportedOperationException if this method is not
   * supported by this XMLOutputFactory
   * @throws XMLStreamException
   */
  public abstract XMLEventWriter createXMLEventWriter(Result result) throws XMLStreamException;

  /**
   * Create a new XMLEventWriter that writes to a stream
   * @param stream the stream to write to
   * @throws XMLStreamException
   */
  public abstract XMLEventWriter createXMLEventWriter(java.io.OutputStream stream) throws XMLStreamException;



  /**
   * Create a new XMLEventWriter that writes to a stream
   * @param stream the stream to write to
   * @param encoding the encoding to use
   * @throws XMLStreamException
   */
  public abstract XMLEventWriter createXMLEventWriter(java.io.OutputStream stream,
                                                     String encoding) throws XMLStreamException;

  /**
   * Create a new XMLEventWriter that writes to a writer
   * @param stream the stream to write to
   * @throws XMLStreamException
   */
  public abstract XMLEventWriter createXMLEventWriter(java.io.Writer stream) throws XMLStreamException;

  /**
   * Allows the user to set specific features/properties on the underlying implementation.
   * @param name The name of the property
   * @param value The value of the property
   * @throws java.lang.IllegalArgumentException if the property is not supported
   */
  public abstract void setProperty(java.lang.String name,
                                    Object value)
    throws IllegalArgumentException;

  /**
   * Get a feature/property on the underlying implementation
   * @param name The name of the property
   * @return The value of the property
   * @throws java.lang.IllegalArgumentException if the property is not supported
   */
  public abstract Object getProperty(java.lang.String name)
    throws IllegalArgumentException;

  /**
   * Query the set of properties that this factory supports.
   *
   * @param name The name of the property (may not be null)
   * @return true if the property is supported and false otherwise
   */
  public abstract boolean isPropertySupported(String name);
}
