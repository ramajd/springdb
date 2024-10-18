package io.github.ramajd.springdb;

import io.github.ramajd.springdb.domain.Author;
import io.github.ramajd.springdb.domain.Book;

public class TestDataUtil {

    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("J. R. R. Tolkien")
                .age(80)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("Tomas Cronin")
                .age(44)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("Jesse A Cassey")
                .age(24)
                .build();
    }

    public static Book createTestBookA() {
        return Book.builder()
                .isbn("978-1-56619-909-4")
                .title("Lord of the Rings: The Fellowship of the Ring")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("123-456-789-0")
                .title("Lord of the Rings: The Two Towers")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("567-890-123-4")
                .title("Lord of the Rings: The Return of the King")
                .authorId(1L)
                .build();
    }

}
