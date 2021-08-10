package chapter6.publication;

import chapter6.Util;

import java.util.Objects;

/**
 * Parent class for entity book.
 *
 * Ahtirskij Yuriy 10.08.2021
 */
public abstract class Book implements IPublication{
    private long id;
    private String title;
    private String author;
    private String summary;
    private int circulation;

    //=================== Constructors ===================
    public Book() {
        id= Util.generateID();
    }

    public Book(String title, String author, String summary, int circulation) {
        id= Util.generateID();
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.circulation = circulation;
    }

    //=================== Getters and setters ===================

    public long getId() {
        return id;
    }

     public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    //=================== Overridden methods ===================
    @Override
    public String toString() {
        return "Book: " + title +
                "\n\tauthor: " + author +
                "\n\tsummary: " + summary +
                "\n\tcirculation: " + circulation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                circulation == book.circulation &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                summary.equals(book.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, summary, circulation);
    }
}
