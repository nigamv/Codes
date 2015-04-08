package cis550.model;

public class Trips {
	
	private int id;
	private int user_id;
	private String starts_at;
	private String ends_at;
	private String location;
	private String trip_name;
	private String created_at;
	private String updated_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getStarts_at() {
		return starts_at;
	}
	public void setStarts_at(String starts_at) {
		this.starts_at = starts_at;
	}
	public String getEnds_at() {
		return ends_at;
	}
	public void setEnds_at(String ends_at) {
		this.ends_at = ends_at;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTrip_name() {
		return trip_name;
	}
	public void setTrip_name(String trip_name) {
		this.trip_name = trip_name;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
}
