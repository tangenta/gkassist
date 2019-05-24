package com.tangenta.gkassist.school.model;

import com.tangenta.gkassist.school.converter.ListGsonConverter;
import com.tangenta.gkassist.school.converter.SchoolIdConverter;

import javax.persistence.*;
import java.util.List;

@Entity
public class SchoolInfo {
    @Id
    private String schoolId;

    private String name;
    private String province;
    private String city;
    private String county;
    private String address;
    private String belong;
    private Boolean is211;
    private Boolean is985;
    private Boolean isDcs;
    private Boolean isDck;
    private Boolean isDepartment;
    private Boolean isCentral;
    private Boolean hasAdmission;
    private String schoolType;
    private String type;

    @Convert(converter = ListGsonConverter.class)
    private List<String> specialMajors;

    protected SchoolInfo() { }

    public SchoolInfo(String schoolId, String name, String province, String city, String county, String address, String belong, Boolean is211, Boolean is985, Boolean isDcs, Boolean isDck, Boolean isDepartment, Boolean isCentral, Boolean hasAdmission, String schoolType, String type, List<String> specialMajors) {
        this.schoolId = schoolId;
        this.name = name;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.belong = belong;
        this.is211 = is211;
        this.is985 = is985;
        this.isDcs = isDcs;
        this.isDck = isDck;
        this.isDepartment = isDepartment;
        this.isCentral = isCentral;
        this.hasAdmission = hasAdmission;
        this.schoolType = schoolType;
        this.type = type;
        this.specialMajors = specialMajors;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getAddress() {
        return address;
    }

    public String getBelong() {
        return belong;
    }

    public Boolean getIs211() {
        return is211;
    }

    public Boolean getIs985() {
        return is985;
    }

    public Boolean getDcs() {
        return isDcs;
    }

    public Boolean getDck() {
        return isDck;
    }

    public Boolean getDepartment() {
        return isDepartment;
    }

    public Boolean getCentral() {
        return isCentral;
    }

    public Boolean getHasAdmission() {
        return hasAdmission;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public String getType() {
        return type;
    }

    public List<String> getSpecialMajors() {
        return specialMajors;
    }

}
