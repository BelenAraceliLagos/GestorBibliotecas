package cl.praxis.GestorBibliotecas.controller;

import cl.praxis.GestorBibliotecas.GestorBibliotecasApplication;
import cl.praxis.GestorBibliotecas.model.service.BookService;
import io.lsn.logger.factory.LoggerFactory;
import io.lsn.logger.factory.logger.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/books")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(GestorBibliotecasApplication.class);
    BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @GetMapping()
    public String findAll(Model model){

        logger.info("Iniciando findAll()");
        model.addAttribute("books", service.findAll());
        return "booksList";
    }
}
