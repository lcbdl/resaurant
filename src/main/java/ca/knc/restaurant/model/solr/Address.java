package ca.knc.restaurant.model.solr;

import org.apache.solr.client.solrj.beans.Field;

public class Address {
	@Field("building")
	private String building;
	
	@Field("street")
	private String street;
	
	@Field("zipcode")
	private String zipcode;
	
	@Field("coord")
	private float[] coord;

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public float[] getCoord() {
		return coord;
	}

	public void setCoord(float[] coord) {
		this.coord = coord;
	}
	
	

}
