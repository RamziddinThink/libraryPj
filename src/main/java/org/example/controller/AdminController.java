package org.example.controller;

import org.example.service.BookService;
import org.example.service.CategoryService;
import org.example.service.ProfileService;
import org.example.service.StudentService;
import org.example.util.GetAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    @Autowired
    private BookController bookController;

    @Autowired
    private CategoryController categoryController;

    @Autowired
    private ProfileController profileController;

    @Autowired
    private StudentController studentController;

    public void start(){
        boolean t=true;
        while (t){
            show();
            switch (GetAction.getAction()){
                case 1->bookController.start();
//                case 2->categoryController;//only for admin
//                case 3->profileController;
//                case 4->studentController;//only for admin
                case 0 ->t=false;
                default -> System.out.println("Not found num");
            }
        }

    }


    public void show(){
        System.out.println("**MENU**");
        System.out.println("1. Book.");
        System.out.println("2. Category.");
        System.out.println("3. Student.");
        System.out.println("4. Profile.");
        System.out.println("0. Exit.");

    }


}
