package org.hibernate.bugs;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


// The Book Repository.
public interface BookRepository extends JpaRepository<Book, Long> {

    // Find by book title
    List<Book> findByTitle(String title);
}
