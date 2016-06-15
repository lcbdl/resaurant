package ca.knc.restaurant;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages = { "ca.knc.restaurant.repository.solr" }, multicoreSupport = true)
public class SpringSolrConfig {

	@Value("${spring.data.solr.zk-host}")
	private String zkHost;

	@Bean
	public SolrClient solrClient() {
		 return new CloudSolrClient(zkHost);
	}

	@Bean
	public SolrTemplate solrTemplate(SolrClient solrClient) throws Exception {
		return new SolrTemplate(solrClient);
	}

}
