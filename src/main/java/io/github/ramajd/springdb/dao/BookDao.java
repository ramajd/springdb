
package io.github.ramajd.springdb.dao;

import java.util.List;
import java.util.Optional;

import io.github.ramajd.springdb.domain.Book;

public interface BookDao {

    void create(Book book);

    Optional<Book> findOne(String isbn);

    List<Book> find();

}
