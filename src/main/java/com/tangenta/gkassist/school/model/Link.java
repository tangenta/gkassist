package com.tangenta.gkassist.school.model;

public class Link {
    private final String url;

    private Link(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public static Link of(String url) {
        return new Link(url);
    }
}
