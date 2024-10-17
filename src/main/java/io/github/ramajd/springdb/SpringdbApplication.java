package io.github.ramajd.springdb;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class SpringdbApplication implements CommandLineRunner {

	private final DataSource dataSource;

	public SpringdbApplication(final DataSource dataSource) { this.dataSource = dataSource; }

	public static void main(String[] args) {
		SpringApplication.run(SpringdbApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info("dataSource: " + dataSource.toString());
		final JdbcTemplate resTemplate = new JdbcTemplate(dataSource);
		resTemplate.execute("select 1");
	}
}
