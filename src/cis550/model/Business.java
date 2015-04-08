package cis550.model;

public class Business {
private int id;
private String yelpid;
private String name;
private String full_address;
private String city;
private String state;
private float stars;
private String categories;
private boolean open;
private float longitude;
private float latitude;
private String yelp_attributes;
private String text;
private int review_count;
private String checkin_info;
private String hours;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getYelpid() {
	return yelpid;
}
public void setYelpid(String yelpid) {
	this.yelpid = yelpid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFull_address() {
	return full_address;
}
public void setFull_address(String full_address) {
	this.full_address = full_address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public float getStars() {
	return stars;
}
public void setStars(float stars) {
	this.stars = stars;
}

public String getCategories() {
	return categories;
}
public void setCategories(String categories) {
	this.categories = categories;
}
public boolean isOpen() {
	return open;
}
public void setOpen(boolean open) {
	this.open = open;
}
public float getLongitude() {
	return longitude;
}
public void setLongitude(float longitude) {
	this.longitude = longitude;
}
public float getLatitude() {
	return latitude;
}
public void setLatitude(float latitude) {
	this.latitude = latitude;
}
public String getYelp_attributes() {
	return yelp_attributes;
}
public void setYelp_attributes(String yelp_attributes) {
	this.yelp_attributes = yelp_attributes;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public int getReview_count() {
	return review_count;
}
public void setReview_count(int review_count) {
	this.review_count = review_count;
}
public String getCheckin_info() {
	return checkin_info;
}
public void setCheckin_info(String checkin_info) {
	this.checkin_info = checkin_info;
}
public String getHours() {
	return hours;
}
public void setHours(String hours) {
	this.hours = hours;
}

}
