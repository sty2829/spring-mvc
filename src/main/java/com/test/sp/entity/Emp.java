package com.test.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp")
public class Emp {

	@Id
	@SequenceGenerator(name = "seqEmpno", sequenceName = "seq_empno", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEmpno")
	@Column(name = "empno")
	private Long empno;
	private String name;
	private Integer sal;
	
}