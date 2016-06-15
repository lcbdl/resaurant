package ca.knc.restaurant.repository.solr;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ca.knc.restaurant.RestaurantApplication;
import ca.knc.restaurant.model.solr.Restaurant;
import ca.knc.restaurant.repository.solr.RestaurantRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestaurantApplication.class)
public class RestaurantRepositoryTest {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Test
	public void findByNameTest() {
		List<Restaurant> restaurants = restaurantRepository.findByName("Morris Park Bake Shop");
		assertNotNull(restaurants);
		assertTrue(restaurants.size() > 0);
		for (Restaurant r : restaurants) {
			System.out.println(r.toString());
		}
	}

}
