package com.application.dtos;

import java.util.List;

public class ProductDto {

	private Long id;

	private String plans;

	private String uid;

	private List<BenefitDto> benefitDto;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<BenefitDto> getBenefitDto() {
		return benefitDto;
	}

	public void setBenefitDto(List<BenefitDto> benefitDto) {
		this.benefitDto = benefitDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlans() {
		return plans;
	}

	public void setPlans(String plans) {
		this.plans = plans;
	}

}
