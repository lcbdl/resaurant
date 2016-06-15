package ca.knc.restaurant.repository.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import ca.knc.restaurant.model.solr.Restaurant;

public interface RestaurantRepository extends SolrCrudRepository<Restaurant, String> {
	
	List<Restaurant> findByName(String name);
	
}
