package io.github.ramajd.springdb;

import io.github.ramajd.springdb.domain.Author;
import io.github.ramajd.springdb.domain.Book;

public class TestDataUtil {

    private TestDataUtil() {
    }

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-56619-909-4")
                .title("The Clean Coder: A Code of Conduct for Professional Programmers")
                .authorId(1L)
                .build();
    }
}
