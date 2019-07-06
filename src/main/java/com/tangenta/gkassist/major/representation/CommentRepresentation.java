package com.tangenta.gkassist.major.representation;

import com.tangenta.gkassist.common.ddd.Representation;

import java.util.List;

public class CommentRepresentation implements Representation {

    private int totalNum;
    private List<String> users;
    private List<String> contents;

    public CommentRepresentation(int totalNum, List<String> users, List<String> contents) {
        this.totalNum = totalNum;
        this.users = users;
        this.contents = contents;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }
}
