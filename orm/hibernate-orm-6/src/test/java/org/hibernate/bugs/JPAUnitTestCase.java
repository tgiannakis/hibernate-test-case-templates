package org.hibernate.bugs;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class JPAUnitTestCase
{
    @Autowired
    private TestEntityManager testEntity;
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testRepoSave() {
        Book b1 = new Book("Book A");
        bookRepository.save(b1);

        Long savedBookID = b1.getId();
        Book book = bookRepository.findById(savedBookID).orElseThrow();

        assertEquals(savedBookID, book.getId());
        assertEquals("Book A", book.getTitle());
    }

    @Test
    public void testEntitySave() {
        Book b1 = new Book("Book B");
        testEntity.persistAndFlush(b1);

        Long savedBookID = b1.getId();
        Book book = testEntity.find(Book.class, savedBookID);
        // Book book = testEM.find(Book.class, savedBookID);

        assertEquals(savedBookID, book.getId());
        assertEquals("Book B", book.getTitle());
    }
}