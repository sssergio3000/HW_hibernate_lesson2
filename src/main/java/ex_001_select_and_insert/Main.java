package ex_001_select_and_insert;


import ex_001_select_and_insert.entity.Author;
import ex_001_select_and_insert.entity.Book;
import org.jboss.logging.Logger;

import java.util.List;


public class Main {

    private static final Logger LOG = Logger.getLogger(AuthorHelper.class.getName());

    public static void main(String[] args) {

        AuthorHelper authorHelper = new AuthorHelper();
        BookHelper bookHelper = new BookHelper();


        Author[] authors = {
                new Author("Franz Kafka"),
                new Author("Charles Dickens"),
                new Author("Herman Melville")
        };

//        // Case 1. Insert authors into DB
//        for (Author author : authors) {
//            authorHelper.addAuthor(author);
//        }


        // Case 2.1 Get all authors
//        List<Author> authorList = authorHelper.getAuthorList();
//
//        for (Author author : authorList) {
//            // LOG.debug(author.getId() + " " + author.getName());
//            System.out.println(author);
//            LOG.debug(author);
//        }
//


        // Case 2.2 Get a specific author by id
//        Author author = authorHelper.getAuthorById(1);
//        System.out.println(author);
//        LOG.debug(author.getName());

        Book[] books = {
                new Book("Cheburashka adventures", 2),
                new Book("Chipolino trip", 5),
                new Book("Karlson - mission impossible", 1)
        };

//        add book/books
//        for (Book book : books) {
//            bookHelper.addBook(book);
//        }
// get list of all books
//        List<Book> bookList = bookHelper.getBookList();
//
//        for (Book book : bookList) {
//            LOG.debug(book.getId() + " " + book.getName() + " " + book.getAuthor_id());
//            System.out.println(book);
//            LOG.debug(book);
//        }
// get book by id
//       Book book = bookHelper.getBookById(2);
//       System.out.println(book);
//       LOG.debug(book.getName());


    }


}
