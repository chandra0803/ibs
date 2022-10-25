package com.bookingEngine.bookingenginejunittest;

import java.io.IOException;
import java.util.Properties;

/*import org.apache.log4j.Logger;*/
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;

import com.ibsplc.common.constants.CommonKeys;

public class BookingEngineJunitTest {

/*	private static final Logger LOG = Logger.getLogger(BookingEngineJunitTest.class);*/

	protected Properties propertiesConfiguration;
	protected Properties propertiesQuery;
	protected Properties propertiesMessage;
	protected Properties propertiesApplication;

	@Mock
	protected Environment environment;

	@Before
	public void setup() {
		try {
			MockitoAnnotations.initMocks(this);

			propertiesConfiguration = new Properties();
			propertiesConfiguration.load(BookingEngineJunitTest.class.getResourceAsStream("/configuration.properties"));

			propertiesQuery = new Properties();
			propertiesQuery.load(BookingEngineJunitTest.class.getResourceAsStream("/query.properties"));

			propertiesMessage = new Properties();
			propertiesMessage.load(BookingEngineJunitTest.class.getResourceAsStream("/message.properties"));

			propertiesApplication = new Properties();
			propertiesApplication.load(BookingEngineJunitTest.class.getResourceAsStream("/application.properties"));

			Mockito.when(environment.getRequiredProperty(CommonKeys.SESSION_KEY))
					.thenReturn(propertiesConfiguration.getProperty(CommonKeys.SESSION_KEY));

			Mockito.when(environment.getRequiredProperty(CommonKeys.SESSION_INITVECTOR))
					.thenReturn(propertiesConfiguration.getProperty(CommonKeys.SESSION_INITVECTOR));

			Mockito.when(environment.getRequiredProperty(CommonKeys.SESSION_IDENTIFIER))
					.thenReturn(propertiesConfiguration.getProperty(CommonKeys.SESSION_IDENTIFIER));

			Mockito.when(environment.getRequiredProperty("view.trip.no.records"))
					.thenReturn(propertiesConfiguration.getProperty("view.trip.no.records"));

			Mockito.when(environment.getRequiredProperty("view.my.trips.booking.vo.null.error.message"))
					.thenReturn(propertiesConfiguration.getProperty("view.my.trips.booking.vo.null.error.message"));
		} catch (IOException e) {
		/*	LOG.error(e);*/
			
		} catch (IllegalArgumentException e) {
		/*	LOG.error(e);*/
		}

	}

	protected String getConfiguration(String configurationProperty) {
		return propertiesConfiguration.getProperty(configurationProperty);
	}

	protected String getQuery(String queryProperty) {
		return propertiesQuery.getProperty(queryProperty);
	}

	protected String getMessage(String messageProperty) {
		return propertiesMessage.getProperty(messageProperty);
	}

	protected String getApplication(String applicationProperty) {
		return propertiesApplication.getProperty(applicationProperty);
	}

}
