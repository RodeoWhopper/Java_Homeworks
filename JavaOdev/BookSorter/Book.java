package BookSorter;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String bookName;
    private int pageNumber;
    private String author;
    private String releaseDate;
    public Book(String bookName, int pageNumber, String author, String releaseDate) throws Exception {
        this.setBookName(bookName);
        this.setPageNumber(pageNumber);
        this.setAuthor(author);
        this.setReleaseDate(releaseDate);
    }
    public Book(){
        this.bookName = null;
        this.author = null;
        this.releaseDate = null;
        this.pageNumber = 0;
    }
    public void sortByName(Set<Book> bookSet){
        Set<Book> newSet = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.bookName.compareTo(o2.bookName);
            }

        });
        newSet.addAll(bookSet);
        bookSet = newSet;
    }
    public void sortByPage(Set<Book> bookSet){
        Set<Book> newSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.pageNumber,o2.pageNumber);
            }
        });
        newSet.addAll(bookSet);
        bookSet = newSet;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    //For homework
    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }
}
