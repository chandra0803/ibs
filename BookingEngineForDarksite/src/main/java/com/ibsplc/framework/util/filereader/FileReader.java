package com.ibsplc.framework.util.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

import org.springframework.util.ResourceUtils;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

/**
 * @author a-5316
 *
 */
public final class FileReader {

	/**
	 * SERVICE_DOT_PROPERTIES
	 */
	private static final String SERVICE_DOT_PROPERTIES = CommonKeys.SERVICE_DOT_PROPERTIES;

	private static final Logger LOGGER = Log4j2Logger.create(FileReader.class);

	private FileReader() {

	}

	/**
	 * Gives the absolute path where the file is located
	 * 
	 * @return String - having the absolute path of the file
	 */
	public static String getFile(String fileName) {
		String configFileName = fileName;
		//configFileName = System.getProperty(SERVICE_DOT_PROPERTIES) + System.getProperties().get("file.separator")
			//	+ fileName;
		LOGGER.info("configFileName--" + configFileName);
		return configFileName;
	}

	/**
	 * Loads the file and returns it as a property.
	 * 
	 * @return java.util.Properties
	 */
	public static Properties getProperties(String filename) {
		Properties properties = new Properties();
		 InputStream fs = null;
		try {
			//fs = new FileInputStream(getFile(filename));		 
			//if(fs == null){
				 File file = ResourceUtils.getFile("classpath:"+getFile(filename) );
				   fs = new FileInputStream(file);
				//fs = (FileInputStream) Objects.requireNonNull(FileReader.class.getClassLoader().getResourceAsStream(filename));
			//}
			properties.load(fs);

		} catch (IOException e) {
			LOGGER.error("Exception in getProperties" + e);
		} finally {
			if (fs != null) {
				try {
					fs.close();
				} catch (Exception exec) {
					LOGGER.error("Exception occured in getProperties" + exec);
				}
			}
		}
		return properties;
	}

}
