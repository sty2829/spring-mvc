package com.test.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.test.sp.util.DateUtil;

@Entity
@Table(name = "movie_info")
public class MovieInfo {

	@Id
	@SequenceGenerator(name = "seqMiNum", sequenceName = "seq_mi_num", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMiNum")
	@Column(name = "mi_num")
	private Long miNum;
	@Column(name = "mi_name")
	private String miName;
	@Column(name = "mi_genre")
	private String miGenre;
	@Column(name = "mi_producer")
	private String miProducer;
	@Column(name = "mi_director")
	private String miDirector;
	@Column(name = "mi_release_date")
	private String miReleaseDate;
	@Column(name = "mi_credat")
	private String miCredat = DateUtil.getDate();
	@Column(name = "mi_desc")
	private String miDesc;
	
	public Long getMiNum() {
		return miNum;
	}
	public void setMiNum(Long miNum) {
		this.miNum = miNum;
	}
	public String getMiName() {
		return miName;
	}
	public void setMiName(String miName) {
		this.miName = miName;
	}
	public String getMiGenre() {
		return miGenre;
	}
	public void setMiGenre(String miGenre) {
		this.miGenre = miGenre;
	}
	public String getMiProducer() {
		return miProducer;
	}
	public void setMiProducer(String miProducer) {
		this.miProducer = miProducer;
	}
	public String getMiDirector() {
		return miDirector;
	}
	public void setMiDirector(String miDirector) {
		this.miDirector = miDirector;
	}
	public String getMiReleaseDate() {
		return miReleaseDate;
	}
	public void setMiReleaseDate(String miReleaseDate) {
		this.miReleaseDate = miReleaseDate;
	}
	public String getMiCredat() {
		return miCredat;
	}
	public void setMiCredat(String miCredat) {
		this.miCredat = miCredat;
	}
	public String getMiDesc() {
		return miDesc;
	}
	public void setMiDesc(String miDesc) {
		this.miDesc = miDesc;
	}
	
	@Override
	public String toString() {
		return "MovieInfo [miNum=" + miNum + ", miName=" + miName + ", miGenre=" + miGenre + ", miProducer="
				+ miProducer + ", miDirector=" + miDirector + ", miReleaseDate=" + miReleaseDate + ", miCredat="
				+ miCredat + ", miDesc=" + miDesc + "]";
	}
	
	
}
