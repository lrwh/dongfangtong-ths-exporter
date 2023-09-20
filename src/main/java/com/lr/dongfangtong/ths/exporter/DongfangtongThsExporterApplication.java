package com.lr.dongfangtong.ths.exporter;

import io.prometheus.client.exporter.MetricsServlet;
import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DongfangtongThsExporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DongfangtongThsExporterApplication.class, args);
	}

	@Bean
	public OkHttpClient okHttpClient() {
		return new OkHttpClient();
	}

	/**
	 * Expose Prometheus metrics.
	 */
	@Bean
	public ServletRegistrationBean<MetricsServlet> metricsServlet() {
		ServletRegistrationBean<MetricsServlet> bean = new ServletRegistrationBean<>(new MetricsServlet(), "/ths/metrics");
		bean.setLoadOnStartup(1);
		return bean;
	}
}
