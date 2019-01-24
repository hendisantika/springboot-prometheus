package com.hendisantika.springbootprometheus.config;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import com.ryantenney.metrics.spring.config.annotation.MetricsConfigurerAdapter;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-prometheus
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-24
 * Time: 07:58
 */
@Configuration
@EnableMetrics
public class SpringConfiguringClass extends MetricsConfigurerAdapter {

    @Override
    public void configureReporters(MetricRegistry metricRegistry) {
        // registerReporter allows the MetricsConfigurerAdapter to
        // shut down the reporter when the Spring context is closed
        registerReporter(ConsoleReporter.forRegistry(metricRegistry).build())
                .start(1, TimeUnit.MINUTES);
    }
}