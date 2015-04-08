package cis550.model;

public class Reviews {

	private int id;
	private int business_id;
	private String yelpid;
	private String reviewer_yelpid;
	private float stars;
	private String text;
	private String date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}
	public String getYelpid() {
		return yelpid;
	}
	public void setYelpid(String yelpid) {
		this.yelpid = yelpid;
	}
	public String getReviewer_yelpid() {
		return reviewer_yelpid;
	}
	public void setReviewer_yelpid(String reviewer_yelpid) {
		this.reviewer_yelpid = reviewer_yelpid;
	}
	public float getStars() {
		return stars;
	}
	public void setStars(float stars) {
		this.stars = stars;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
