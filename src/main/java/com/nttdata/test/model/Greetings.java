package com.nttdata.test.model;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "greetings")
public class Greetings {
	@Id
	private ObjectId id;

	@NotEmpty(message = "Greeting name is mandatory")
	private String name;

	/**
	 * @return the id
	 */
	public String getId() {
		if (null == id) {
			return null;
		}
		return id.toHexString();
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
