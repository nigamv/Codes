package cis550.controller;

import cis550.model.Business;
import cis550.model.Reviewers;
import cis550.model.Reviews;
import cis550.model.Trips;
import cis550.model.Visits;

public class DBLayer {
	
	private Business business;
	private Reviewers reviewers;
	private Reviews reviews;
	private Trips trips;
	private Visits visits;
	
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public Reviewers getReviewers() {
		return reviewers;
	}
	public void setReviewers(Reviewers reviewers) {
		this.reviewers = reviewers;
	}
	public Reviews getReviews() {
		return reviews;
	}
	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}
	public Trips getTrips() {
		return trips;
	}
	public void setTrips(Trips trips) {
		this.trips = trips;
	}
	public Visits getVisits() {
		return visits;
	}
	public void setVisits(Visits visits) {
		this.visits = visits;
	}
	
}
