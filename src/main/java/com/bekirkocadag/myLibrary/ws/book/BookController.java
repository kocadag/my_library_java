package com.bekirkocadag.myLibrary.ws.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // tüm http req lerin geldiği yeri belirtiyor bu anatotion
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @CrossOrigin
    @PostMapping("/api/1.0/users")
    public void createBook(@RequestBody Book book) {
        log.info(book.toString());
    }
}
