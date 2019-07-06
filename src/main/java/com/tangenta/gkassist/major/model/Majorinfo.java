package com.tangenta.gkassist.major.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Majorinfo {
    @Id
    @GeneratedValue
    private int mainid;

    public int getMainid() {
        return mainid;
    }

    public void setMainid(int mainid) {
        this.mainid = mainid;
    }

    private String schoolId;

    private String id;
    private String ifBK;
    private String name;
    private String code;

    public Majorinfo(){ };

    public Majorinfo( String id,  String schoolId, String ifBK, String name, String code){
        this.id=id;
        this.schoolId=schoolId;
        this.ifBK=ifBK;
        this.name=name;
        this.code=code;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getIfBK() {
        return ifBK;
    }

    public void setIfBK(String ifBK) {
        this.ifBK = ifBK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
