package pl.piomin.service.sample.config;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.monitor.GitlabPropertyPathNotificationExtractor;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

	@Bean
	public GitlabPropertyPathNotificationExtractor gitlabPropertyPathNotificationExtractor() {
		return new GitlabPropertyPathNotificationExtractor();
	}

}
