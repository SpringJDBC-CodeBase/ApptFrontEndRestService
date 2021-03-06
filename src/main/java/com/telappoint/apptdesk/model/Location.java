package com.telappoint.apptdesk.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import com.telappoint.apptdesk.common.model.BaseRequest;

/**
 * 
 * @author Balaji N
 *
 */

@JsonSerialize(include = Inclusion.NON_NULL)
public class Location extends BaseRequest {
	private int locationId;
	private String locationName;
	private String locationNameIvrTts;
	private String locationNameIvrAudio;
	private String website;
	private String workPhone;
	private String fax;
	private String address;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String timeZone;
	private String closed;
	private String enable="Y";
	private String locationErrorCode;
	private String locationGoogleMap;
	private String locationGoogleMapLink;
	private String closedTts;
	private String closedAudio;
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getLocationNameIvrTts() {
		return locationNameIvrTts;
	}
	public void setLocationNameIvrTts(String locationNameIvrTts) {
		this.locationNameIvrTts = locationNameIvrTts;
	}
	public String getLocationNameIvrAudio() {
		return locationNameIvrAudio;
	}
	public void setLocationNameIvrAudio(String locationNameIvrAudio) {
		this.locationNameIvrAudio = locationNameIvrAudio;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getClosed() {
		return closed;
	}
	public void setClosed(String closed) {
		this.closed = closed;
	}
	public String getLocationErrorCode() {
		return locationErrorCode;
	}
	public void setLocationErrorCode(String locationErrorCode) {
		this.locationErrorCode = locationErrorCode;
	}
	public String getLocationGoogleMap() {
		return locationGoogleMap;
	}
	public void setLocationGoogleMap(String locationGoogleMap) {
		this.locationGoogleMap = locationGoogleMap;
	}
	public String getLocationGoogleMapLink() {
		return locationGoogleMapLink;
	}
	public void setLocationGoogleMapLink(String locationGoogleMapLink) {
		this.locationGoogleMapLink = locationGoogleMapLink;
	}
	public String getClosedTts() {
		return closedTts;
	}
	public void setClosedTts(String closedTts) {
		this.closedTts = closedTts;
	}
	public String getClosedAudio() {
		return closedAudio;
	}
	public void setClosedAudio(String closedAudio) {
		this.closedAudio = closedAudio;
	}
}
