package com.example.demo.service.impl;


import com.example.demo.dao.ZYKMapper;
import com.example.demo.entity.ZYK;
import com.example.demo.service.ZYKService;
import com.example.demo.util.ZYKLucene;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ZYKServiceImpl implements ZYKService{

    @Autowired
    private ZYKMapper zykMapper;

    ZYKLucene zykLucene = new ZYKLucene();

    @Override
    public List<ZYK> getAllBooks() {
        return zykMapper.getAllBooks();
    }

    @Override
    public List<ZYK> getSearchBook(String title) {
        List<ZYK> lists =zykMapper.getAllBooks();
        List<ZYK> results = null;
        try{
            zykLucene.createIndex(lists);
            TopDocs topDocs = zykLucene.search(title);
            ScoreDoc[] scoreDocs = topDocs.scoreDocs;
            results = zykLucene.addHitsToList(scoreDocs);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("查询数据库时出错！");
        }
        return results;
    }

    @Override
    public List<ZYK> getSearchBooks(String title) {
        List<ZYK> results = null;
        try{
            TopDocs topDocs = zykLucene.search(title);
            ScoreDoc[] scoreDocs = topDocs.scoreDocs;
            results = zykLucene.addHitsToList(scoreDocs);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("查询数据库时出错！");
        }
        return results;
    }


}
