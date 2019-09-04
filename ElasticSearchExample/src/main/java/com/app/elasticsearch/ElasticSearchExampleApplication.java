package com.app.elasticsearch;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.elasticsearch")
public class ElasticSearchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchExampleApplication.class, args);
	}
	
	@Bean
	public Client client() throws UnknownHostException {
	    Settings settings = Settings.builder()
	             .put("client.transport.sniff", false)
	                .put("cluster.name", "elasticsearchexample").build();
	    
	    @SuppressWarnings("resource")
	    TransportClient client = new PreBuiltTransportClient(settings)
	    .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
	     return client;
	}

	@Bean
	public ElasticsearchOperations elasticsearchTemplate1() throws UnknownHostException {
	    return new ElasticsearchTemplate(client());
	}

}
