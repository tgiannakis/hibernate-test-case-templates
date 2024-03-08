package org.hibernate.bugs;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * This entity implements java.util.Map. If this implementation is removed the tests pass.
 */
@Entity
public class Book implements BookInterface
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    // for JPA only, no use
    protected Book() {}

    public Book(String title) {
        this.title = title;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}