package com.chamath.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoiveRepository extends MongoRepository<Movie, ObjectId> {
    @Override
    Optional<Movie> findById(ObjectId objectId);

    Optional<Movie> findMovieByImdbId(String imdbId);
}
