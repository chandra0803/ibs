package com.ibsplc.framework.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author a-5316
 *
 */
@Configuration
 
@ComponentScan({ "com.ibsplc.framework.configuration" })
@PropertySources({
	@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true),
	@PropertySource(value = "classpath:query.properties" , ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:timezones.properties" , ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:FlexPricerDetailsList.xlsx" , ignoreResourceNotFound=true)
})
public class HibernateConfiguration {
/*	@Autowired
    private Environment environment;
	
	@Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

        try {
			sessionFactory.setDataSource(dataSource());
		} catch (NamingException e) {
			throw new CustomGenericException(e.getMessage(), e);
		}

        sessionFactory.setPackagesToScan(new String[] { "com.ibsplc" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }
	
	@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }
	
	@Bean
    public DataSource dataSource() throws NamingException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
       	dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
        
        // server pooling
        return (DataSource) new JndiTemplate().lookup(environment.getRequiredProperty("connection.datasource"));
   }
	
	private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        return properties;        
    }
	
	@Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
*/
}
