package com.application.utils;

import com.application.dtos.BenefitDto;
import com.application.entities.BenefitEntity;

public class Converters {

	public static BenefitDto convertToDto(BenefitEntity entity) {

		BenefitDto dto = null;
		if (entity != null) {

			dto = new BenefitDto();

			dto.setId(entity.getId());
			dto.setDescription(entity.getDescription());
			dto.setBenefits(entity.getBenefits());
			dto.setUnit(entity.getUnit());
			
		}
		return dto;

	}

	public static BenefitEntity convertToEntity(BenefitDto dto) {

		BenefitEntity entity = null;
		if (dto != null) {
			entity = new BenefitEntity();

			entity.setId(dto.getId());
			entity.setUnit(dto.getUnit());
			entity.setDescription(dto.getDescription());
			entity.setBenefits(dto.getBenefits());

		}
		return entity;
	}

}
