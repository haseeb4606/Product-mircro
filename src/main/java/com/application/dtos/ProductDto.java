package com.application.dtos;

import java.util.List;

public class ProductDto {

	private Long id;

	private String plans;

	private List<BenefitDto> benefitDto;


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
