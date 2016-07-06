package com.cglean.cloudnative.demo.client.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "id")
public class Show {

	private Long id;

	private String title;
	private String episodes;
	private String airDate;

}
