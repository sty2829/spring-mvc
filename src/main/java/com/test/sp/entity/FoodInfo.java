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
@Table(name = "food_info")
public class FoodInfo {

	@Id
	@SequenceGenerator(name = "seqFiNum", sequenceName = "seq_fi_num", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqFiNum")
	@Column(name = "fi_num")
	private Long fiNum;
	@Column(name = "fi_name")
	private String fiName;
	@Column(name = "fi_price")
	private Integer fiPrice;
	@Column(name = "fi_type")
	private String fiType;
	@Column(name = "fi_credat")
	private String fiCredat = DateUtil.getDate();
	@Column(name = "fi_cretim")
	private String fiCretim = DateUtil.getTime();
	
	public Long getFiNum() {
		return fiNum;
	}
	public void setFiNum(Long fiNum) {
		this.fiNum = fiNum;
	}
	public String getFiName() {
		return fiName;
	}
	public void setFiName(String fiName) {
		this.fiName = fiName;
	}
	public Integer getFiPrice() {
		return fiPrice;
	}
	public void setFiPrice(Integer fiPrice) {
		this.fiPrice = fiPrice;
	}
	public String getFiType() {
		return fiType;
	}
	public void setFiType(String fiType) {
		this.fiType = fiType;
	}
	public String getFiCredat() {
		return fiCredat;
	}
	public void setFiCredat(String fiCredat) {
		this.fiCredat = fiCredat;
	}
	public String getFiCretim() {
		return fiCretim;
	}
	public void setFiCretim(String fiCretim) {
		this.fiCretim = fiCretim;
	}
	
	@Override
	public String toString() {
		return "FoodInfo [fiNum=" + fiNum + ", fiName=" + fiName + ", fiPrice=" + fiPrice + ", fiType=" + fiType
				+ ", fiCredat=" + fiCredat + ", fiCretim=" + fiCretim + "]";
	}
	
}
