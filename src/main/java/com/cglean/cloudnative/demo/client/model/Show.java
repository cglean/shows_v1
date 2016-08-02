package com.cglean.cloudnative.demo.client.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "id")
//Adding a comment to test CICD
public class Show {

	private Long id;

	private String title;
	private String episodes;
	private String airDate;

}
