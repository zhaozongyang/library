package com.example.demo.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias(value = "zyk")
public class ZYK {
    private String bookNumber;
    private String title;
    private String authors;
    private String index;
    private String isbn;
    private String publisher;
    private String publishPlace;
    private String publishTime;
    private Float price;
    private String YSBMY;
    private Date entryTime;
    private String context;
    private String pages;
    private String format;

    public ZYK(){

    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(String publishPlace) {
        this.publishPlace = publishPlace;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getYSBMY() {
        return YSBMY;
    }

    public void setYSBMY(String YSBMY) {
        this.YSBMY = YSBMY;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
