package com.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dtos.BenefitDto;
import com.application.dtos.ProductDto;
import com.application.entities.BenefitEntity;
import com.application.entities.ProductEntity;
import com.application.repositories.ProductRepository;
import com.application.utils.Converters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ProductService {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductRepository productRepository;

	public List<ProductDto> getAllProduct() {

		log.error("Error happended while fetthicing the products");

		List<ProductEntity> pentity = productRepository.findAll();

		List<ProductDto> pdto = new ArrayList<ProductDto>();

		for (ProductEntity pr : pentity) {

			ProductDto dto = convertProduct(pr);

			pdto.add(dto);
		}

		return pdto;

	}

	public ProductDto convertProduct(ProductEntity entity) {

		ProductDto dto = null;
		if (entity != null) {
			dto = new ProductDto();

			dto.setId(entity.getId());
			dto.setPlans(entity.getPlans());

			List<BenefitDto> bdto = new ArrayList<BenefitDto>();

			for (BenefitEntity bentity : entity.getBenefit()) {

				BenefitDto benefitDto = Converters.convertToDto(bentity);

				bdto.add(benefitDto);
			}

			dto.setBenefitDto(bdto);
		}

		return dto;
	}

	// posting data

	public void saveProduct(ProductDto productDto) {

		ProductEntity product = null;

		if (productDto != null) {

			product = new ProductEntity();

			product.setId(productDto.getId());
			product.setPlans(productDto.getPlans());
			product.setUid(UUID.randomUUID().toString());

			List<BenefitEntity> benefitEntity = new ArrayList<BenefitEntity>();
			for (BenefitDto benefitDto : productDto.getBenefitDto()) {

				BenefitEntity bentity = Converters.convertToEntity(benefitDto);
				bentity.setProduct(product);
				benefitEntity.add(bentity);
			}
			product.setBenefit(benefitEntity);
		}

		productRepository.save(product);
	}

}
