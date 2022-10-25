package com.ibsplc.framework.util.sogl;

import java.io.File;
import java.io.StringWriter;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.ibsplc.common.excelparsing.ReadExcel;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;



public final class SOGLFormatter {


	private SOGLFormatter(){
		
	}

	private static final Logger LOGGER = Log4j2Logger.create(SOGLFormatter.class);
	
	private static final String SOGL_XSD = "SOGL.xsd";
	private static final String SOGL_path="com.ibsplc.framework.util.sogl";

	
	public static String formatStandAloneSOGL(SOGL soglRequest){
		StringWriter soglXML = new StringWriter() ;
		// JAXB implementation
        ObjectFactory factory = new ObjectFactory();
        SOGL record = factory.createSOGL();
        record = soglRequest;   
        try{
		JAXBContext theJaxbContext = JAXBContext.newInstance(SOGL_path);
        soglXML = new StringWriter();
		SchemaFactory schemaFac = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFac.newSchema(new File(SOGLFormatter.class.getClassLoader().getResource(SOGL_XSD).getFile()));
 
		LOGGER.info("schema created");
        Marshaller marshaller = theJaxbContext.createMarshaller();
        //marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "iso-8859-1"); 
        marshaller.setSchema(schema);	
        marshaller.marshal(record, soglXML);
        }catch(Exception e){
        	 LOGGER.error("Exceptions during conversion from SOGL to xml"+e);
        }
        LOGGER.info("SOGL- stand alone---"+soglXML);
        
        //To remove standalone="yes"
        String sogl = soglXML.toString();
        String standalone = " standalone=\"yes\"";
        sogl = sogl.replace(standalone, "");
        
        return sogl;
	}

}
