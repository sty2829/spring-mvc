package com.test.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "gugun")
@Data
public class Gugun {

	@Id
	@Column(name = "gu_num")
	private Integer guNum;
	@Column(name = "gu_name")
	private String guName;
	@Column(name = "si_num")
	private Integer siNum;
}
