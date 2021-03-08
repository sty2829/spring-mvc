package com.test.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_info")
public class GameInfo {

	@Id
	@Column(name = "gi_num")
	private Long giNum;
	@Column(name = "gi_name")
	private String giName;
	@Column(name = "gi_vendor")
	private String giVendor;
	@Column(name = "gi_platform")
	private String giPlatform;
	@Column(name = "gi_genre")
	private String giGenre;
	@Column(name = "gi_credat")
	private String giCredat;
	@Column(name = "gi_engin")
	private String giEngin;
	@Column(name = "gi_desc")
	private String giDesc;
	
	public Long getGiNum() {
		return giNum;
	}
	public void setGiNum(Long giNum) {
		this.giNum = giNum;
	}
	public String getGiName() {
		return giName;
	}
	public void setGiName(String giName) {
		this.giName = giName;
	}
	public String getGiVendor() {
		return giVendor;
	}
	public void setGiVendor(String giVendor) {
		this.giVendor = giVendor;
	}
	public String getGiPlatform() {
		return giPlatform;
	}
	public void setGiPlatform(String giPlatform) {
		this.giPlatform = giPlatform;
	}
	public String getGiGenre() {
		return giGenre;
	}
	public void setGiGenre(String giGenre) {
		this.giGenre = giGenre;
	}
	public String getGiCredat() {
		return giCredat;
	}
	public void setGiCredat(String giCredat) {
		this.giCredat = giCredat;
	}
	public String getGiEngin() {
		return giEngin;
	}
	public void setGiEngin(String giEngin) {
		this.giEngin = giEngin;
	}
	public String getGiDesc() {
		return giDesc;
	}
	public void setGiDesc(String giDesc) {
		this.giDesc = giDesc;
	}
	
	@Override
	public String toString() {
		return "GameInfo [giNum=" + giNum + ", giName=" + giName + ", giVendor=" + giVendor + ", giPlatform="
				+ giPlatform + ", giGenre=" + giGenre + ", giCredat=" + giCredat + ", giEngin=" + giEngin + ", giDesc="
				+ giDesc + "]";
	}
	
	
}
