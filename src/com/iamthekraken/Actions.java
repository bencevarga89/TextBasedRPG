package com.iamthekraken;

/**
 * Created by iamthekraken on 2017.03.07..
 */
public class Actions {

    public int pageNumber;
    public String pageText;

    public Actions(int pageNumber, String pageText) {
        this.pageNumber = pageNumber;
        this.pageText = pageText;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageText() {
        return pageText;
    }

    public void setPageText(String pageText) {
        this.pageText = pageText;
    }
}



