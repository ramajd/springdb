package io.github.ramajd.springdb.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import io.github.ramajd.springdb.dao.AuthorDao;

public class AuthorDaoImpl implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;


    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
