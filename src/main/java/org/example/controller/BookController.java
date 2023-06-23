package org.example.controller;

import org.example.service.BookService;
import org.example.util.GetAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void start(){
        boolean t=true;
        while (t){
            show();
            switch (GetAction.getAction()){
                case 0->t=false;
                case 1->bookService.getBookList();
//                case 2->bookService.search();
//                case 3->bookService.addBook();
//                case 4->bookService.removeBook();
//                case 5->bookService.booksOnHand();
//                case 11->bookService.bookHistory();
//                case 12->bookService.bestBooks();
                default -> System.out.println("Not Found...");
            }
        }
    }

    public void show(){
        System.out.println("**MENU**");
        System.out.println("1. Book list.");
        System.out.println("2. Search.");
        System.out.println("3. Add book.");
        System.out.println("4. Remove book.");
        System.out.println("5. Books on hand.");
        System.out.println("6. Book history.");
        System.out.println("7. Best books.");
        System.out.println("0. Exit.");
    }

}
