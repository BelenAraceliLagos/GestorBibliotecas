package cl.praxis.GestorBibliotecas.model.service;

import cl.praxis.GestorBibliotecas.model.dto.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private List<Book> bookList;

    public BookServiceImpl() {

        bookList = new ArrayList<>();
        bookList.add(new Book(98765, "Cancion de Hielo y Fuego", "G.R.R. Martin", "novela", 1996));
        bookList.add(new Book(98675, "El Resplandor", "Stephen King", "novela", 1997));
        bookList.add(new Book(90905, "Inferno", "Dan Brown", "novela", 2013));
        bookList.add(new Book(98765, "Cien Años de Soledad", "Gabriel García Marquez", "novela", 1967));
    }

    public BookServiceImpl(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public List<Book> findAll() {
        return bookList;
    }

    @Override
    public Book findOne(int nroLibro) {
        return null;
    }

    @Override
    public boolean create(Book b) {
        return false;
    }

    @Override
    public boolean update(Book b) {
        return false;
    }

    @Override
    public boolean delete(int nroLibro) {
        return false;
    }
}
