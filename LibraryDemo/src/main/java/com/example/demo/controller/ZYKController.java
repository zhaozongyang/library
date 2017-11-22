package com.example.demo.controller;

import com.example.demo.entity.ZYK;
import com.example.demo.service.ZYKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ZYKController {

    @Autowired
    private ZYKService zykService;

    @GetMapping(value = "/getAllBooks")
    public List<ZYK> getAllBooks(){
        return zykService.getAllBooks();
    }

    @GetMapping(value = "/searchBook/{title}")
    public List<ZYK> searchBook(@PathVariable String title){
        return zykService.getSearchBook(title);
    }

    @GetMapping(value = "/search/{title}")
    public List<ZYK> searchBooks(@PathVariable String title){
        return zykService.getSearchBooks(title);
    }


}
