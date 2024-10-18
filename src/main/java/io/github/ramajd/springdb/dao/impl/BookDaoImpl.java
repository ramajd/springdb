package io.github.ramajd.springdb.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import io.github.ramajd.springdb.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;


    public BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
