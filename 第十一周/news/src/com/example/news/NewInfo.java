package com.example.news;

import android.app.Activity;

public class NewInfo extends Activity {
	
	
	protected Integer id;
	protected String titleString;
	protected String conterString;
	protected String imgUrl;
	
	
	public NewInfo(int id, String titleString, String contentString,
			String imgeUrl) {
		this.id = id;
		this.titleString = titleString;
		this.conterString = contentString;
		this.imgUrl = imgeUrl;
	}	
	
	@Override
	public String toString() {
		return "NewInfo [id=" + id + ", titleString=" + titleString
				+ ", conterString=" + conterString + ", imgUrl=" + imgUrl + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getConterString() {
		return conterString;
	}
	public void setConterString(String conterString) {
		this.conterString = conterString;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
