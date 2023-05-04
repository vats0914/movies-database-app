package dev.vatsal.movies;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface MovieRepository extends MongoRepository<movies, ObjectId> {

}
