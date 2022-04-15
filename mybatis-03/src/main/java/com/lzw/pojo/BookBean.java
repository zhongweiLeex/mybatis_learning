package com.lzw.pojo;

/**
 * @ClassName BookBean
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/15 16:39
 * @Version 1.0
 **/
public class BookBean {
    private Integer bookId;
    private String bookName;
    private Float price;
    private String content;

    public BookBean() {
    }

    public BookBean(Integer bookId, String bookName, Float price, String content) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.content = content;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }
}
