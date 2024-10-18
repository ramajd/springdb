package io.github.ramajd.springdb.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import io.github.ramajd.springdb.dao.AuthorDao;
import io.github.ramajd.springdb.domain.Author;

@Component
public class AuthorDaoImpl implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {

        jdbcTemplate.update("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)",
                author.getId(),
                author.getName(),
                author.getAge());
    }

    public Optional<Author> findOne(long id) {

        List<Author> results = jdbcTemplate.query(
                "SELECT id, name, age FROM authors WHERE id = ? LIMIT 1",
                new AuthorRowMapper(),
                id);
        return results.stream().findFirst();
    }

    public List<Author> find() {
        return jdbcTemplate.query("SELECT id, name, age FROM authors", new AuthorRowMapper());
    }

    public static class AuthorRowMapper implements RowMapper<Author> {

        @Override
        @Nullable
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Author.builder()
                    .id(rs.getLong("id"))
                    .name(rs.getString(("name")))
                    .age(rs.getInt("age"))
                    .build();
        }

    }

}
