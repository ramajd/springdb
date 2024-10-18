package io.github.ramajd.springdb.dao;

import java.util.Optional;

import io.github.ramajd.springdb.domain.Author;

public interface AuthorDao {

    void create(Author author);

    Optional<Author> findOne(long id);
}
