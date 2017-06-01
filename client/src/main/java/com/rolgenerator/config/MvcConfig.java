package com.rolgenerator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// TODO: Auto-generated Javadoc
/**
 * The Class MvcConfig.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * Data source.
	 *
	 * @return the driver manager data source
	 */
	@Bean(name = "datasource")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/users");
		driverManagerDataSource.setUsername("admin");
		driverManagerDataSource.setPassword("admin");

		return driverManagerDataSource;
	}

	/**
	 * User details service.
	 *
	 * @return the user details service
	 */
	@Bean(name = "userDetailsService")
	public UserDetailsService userDetailsService() {
		JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();

		jdbcImpl.setDataSource(dataSource());
		jdbcImpl.setUsersByUsernameQuery("select username,password,enabled from users where username=?");
		jdbcImpl.setAuthoritiesByUsernameQuery("select username,role from user_roles where username=?");

		return jdbcImpl;
	}
}
