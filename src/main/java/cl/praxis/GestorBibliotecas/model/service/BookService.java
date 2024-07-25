package cl.praxis.GestorBibliotecas.model.service;


import cl.praxis.GestorBibliotecas.model.dto.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book findOne(int nroLibro);
    boolean create(Book b);
    boolean update(Book b);
    boolean delete(int nroLibro);

}
