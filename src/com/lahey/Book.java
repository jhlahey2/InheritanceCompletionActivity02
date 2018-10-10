package com.lahey;

public class Book extends Product {

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    private String author;
    private int pages;

    public boolean equals(Book book){
        if( super.equals(book)
                && this.author.equals(book.getAuthor())
                && this.pages == book.getPages()
                ){
            return true;
        }
        else{

            return false;
        }//end if()

    }//end public boolean equals(Book book)


}