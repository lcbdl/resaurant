package ca.knc.restaurant.model.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import com.fasterxml.jackson.databind.ObjectMapper;

@SolrDocument(solrCoreName="restaurant")
public class Restaurant {
	
	@Field("_id")
	@Id
	private String id;
	
	@Field("name")
	private String name;
	
	@Field("restaurant_id")
	private String restaurantId;
	
	@Field("borough")
	private String borough;
	
	@Field("cuisine")
	private String cuisine;
	
	@Field("address")
	private Address address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getBorough() {
		return borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(this);
        } catch (IOException e) {
        }
        return json;
	}

}
