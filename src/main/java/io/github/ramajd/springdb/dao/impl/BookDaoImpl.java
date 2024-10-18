package io.github.ramajd.springdb.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import io.github.ramajd.springdb.dao.BookDao;
import io.github.ramajd.springdb.domain.Book;

public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Book book) {
        jdbcTemplate.update(
                "INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)",
                book.getIsbn(),
                book.getTitle(),
                book.getAuthorId());
    }
}
