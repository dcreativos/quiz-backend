package org.hom.quiz.model.example;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "tutorial")
public class Tutorial {
	

	@Id
	@Indexed(unique = true)
	private String id;
	
	@Field(name = "title")
	private String title;

	@Field(name = "description")
	private String description;

	@Field(name = "published")
	private boolean published;
	
	public Tutorial() {

	}

	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}

}
