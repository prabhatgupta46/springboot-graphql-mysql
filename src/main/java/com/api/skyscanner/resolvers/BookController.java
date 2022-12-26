package com.api.skyscanner.resolvers;

import com.api.skyscanner.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepo;

    @QueryMapping
    public Iterable<Book> allBooks() {
        return bookRepo.findAll();
    }

    @QueryMapping
    public Book findByAuthor(@Argument String author) {
        return bookRepo.findByAuthor(author);
    }

    @MutationMapping
    public Book createBook(@Argument String title,
                           @Argument int pages,
                           @Argument int rating,
                           @Argument String author){
        Book newBook = bookRepo.save(Book.builder().title(title).pages(pages).rating(rating).author(author).build());

        return newBook;
    }
}