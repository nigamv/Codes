package cis550.model;

public class Reviewers {

	private int id;
	private String 	yelpid;
	private String name;
	private int review_count;
	private float average_stars;
	private int funny_votes;
	private int useful_votes;
	private int cool_votes;
	private String elite;
	private String yelping_since;
	private int fans;
	
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
	public int getReview_count() {
		return review_count;
	}
	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}
	public float getAverage_stars() {
		return average_stars;
	}
	public void setAverage_stars(float average_stars) {
		this.average_stars = average_stars;
	}
	public int getFunny_votes() {
		return funny_votes;
	}
	public void setFunny_votes(int funny_votes) {
		this.funny_votes = funny_votes;
	}
	public int getUseful_votes() {
		return useful_votes;
	}
	public void setUseful_votes(int useful_votes) {
		this.useful_votes = useful_votes;
	}
	public int getCool_votes() {
		return cool_votes;
	}
	public void setCool_votes(int cool_votes) {
		this.cool_votes = cool_votes;
	}
	public String getElite() {
		return elite;
	}
	public void setElite(String elite) {
		this.elite = elite;
	}
	public String getYelping_since() {
		return yelping_since;
	}
	public void setYelping_since(String yelping_since) {
		this.yelping_since = yelping_since;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
}
