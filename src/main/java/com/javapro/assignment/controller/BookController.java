package com.javapro.assignment.controller;

import com.javapro.assignment.domain.Book;
import com.javapro.assignment.domain.Customer;
import com.javapro.assignment.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public String book() {
        return "book";
    }

    @PostMapping
    public String createBook(@ModelAttribute Book book){
        bookRepository.save(book);
        return "redirect:/books/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Book> list = bookRepository.findAll();
        model.addAttribute("list", list);
        return "book-list";
    }
}
