package org.hom.quiz.repository.example;

import java.math.BigInteger;
import java.util.List;

import org.hom.quiz.model.example.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {

	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);

}
