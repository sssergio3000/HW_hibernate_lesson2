package ex_001_select_and_insert;

import ex_001_select_and_insert.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class BookHelper {

    private final SessionFactory sessionFactory;

    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public Book addBook(Book book) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();

        return book;
    }

    public List<Book> getBookList() {

        Session session = sessionFactory.openSession();




        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Book.class);

        Root<Book> root = criteriaQuery.from(Book.class);

        criteriaQuery.select(root);

        //этап выполнения запроса
        Query query = session.createQuery(criteriaQuery);

        List<Book> bookList = query.getResultList();

        session.close();

        return bookList;
    }

    public Book getBookById(long id) {
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id); // получение объекта по id
        session.close();
        return book;
    }

}
