package com.aws.codestar.projecttemplates.repository;

import com.aws.codestar.projecttemplates.model.GenericObject;
import java.util.List;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class GenericObjectRepository {

	private final MongoTemplate mongoTemplate;
	
	
	public GenericObjectRepository(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public Iterable<GenericObject> findAll(String collection) {
		return mongoTemplate.findAll(GenericObject.class, collection);
	}

	public Iterable<GenericObject> findAllById(List<String> asList, String collection) {
		return mongoTemplate.find(new Query(Criteria.where("id").is(asList)),
                GenericObject.class, collection);
	}

	public Object saveObj(Object data, String collection) {
		return mongoTemplate.save(data, collection);
	}
}
