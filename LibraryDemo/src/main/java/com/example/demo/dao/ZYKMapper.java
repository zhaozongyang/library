package com.example.demo.dao;


import com.example.demo.entity.ZYK;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface ZYKMapper {

    List<ZYK> getAllBooks();




}


