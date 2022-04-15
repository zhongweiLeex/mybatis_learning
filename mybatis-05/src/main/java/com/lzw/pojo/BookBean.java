package com.lzw.pojo;

/**
 * @ClassName BookBean
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/15 17:52
 * @Version 1.0
 **/
public class BookBean extends SubBean{
        private String bookName;
        private Float price;
        private String content;

    public BookBean() {
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

/*    @Override
    public String toString() {
        return "BookBean{" +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "BookBean{" +
                "bookId=" + getSubId() +
                "bookName=' " + bookName + '\'' +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }
}
