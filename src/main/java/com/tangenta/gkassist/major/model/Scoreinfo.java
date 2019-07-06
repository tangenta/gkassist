package com.tangenta.gkassist.major.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Scoreinfo {

    @Id
    @GeneratedValue
    private int mainid;

    private String name;
    private String school_name;
    private String level1;
    private String level2;
    private String level3;
    private String local_batch;
    private String province;
    private String type;
    private int year;
    private double max;
    private double min;
    private double avg;


    public int getMainid() {
        return mainid;
    }

    public void setMainid(int mainid) {
        this.mainid = mainid;
    }

    public Scoreinfo() {
    }

    public Scoreinfo(String name, String school_name, String level1, String level2, String level3, String local_batch, String province, String type, int year, double max, double min, double avg) {
        this.name = name;
        this.school_name = school_name;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.local_batch = local_batch;
        this.province = province;
        this.type = type;
        this.year = year;
        this.max = max;
        this.min = min;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getLocal_batch() {
        return local_batch;
    }

    public void setLocal_batch(String local_batch) {
        this.local_batch = local_batch;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
