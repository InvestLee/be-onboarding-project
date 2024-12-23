package org.survey.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.survey.db")
@EnableJpaRepositories(basePackages = "org.survey.db")
public class JpaConfig {
}
