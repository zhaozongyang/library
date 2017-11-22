package com.example.demo.util;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.util.IOUtils;

import java.io.Reader;
import java.io.StringReader;

public class MyIkAnalyzer extends Analyzer{
    @Override
    protected TokenStreamComponents createComponents(String arg0) {
        Reader reader=null;
        try{
            reader=new StringReader(arg0);
            MyIKTokenizer it = new MyIKTokenizer(reader);
            return new TokenStreamComponents(it);
        }finally {
            IOUtils.closeWhileHandlingException(reader);
        }
    }
}
