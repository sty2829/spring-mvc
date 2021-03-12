package com.test.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "sido")
@Data
public class Sido {

	@Id
	@Column(name = "si_num")
	private Integer siNum;
	@Column(name = "si_name")
	private String siName;
}
