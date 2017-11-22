package com.example.demo.service;

import com.example.demo.entity.ZYK;
import java.util.List;


public interface ZYKService {

    List<ZYK> getAllBooks();

    List<ZYK> getSearchBook(String title);

    List<ZYK> getSearchBooks(String title);


}