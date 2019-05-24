package com.tangenta.gkassist.school.model;

import com.tangenta.gkassist.school.converter.SchoolIdConverter;

import javax.persistence.*;

/**
 *  招生简介
 */
@Entity
public class AdmissionGuide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guideId;

    @Convert(converter = SchoolIdConverter.class)
    private SchoolId schoolId;
    private String location;
    private String description;

    protected AdmissionGuide() { }

    public AdmissionGuide(SchoolId schoolId, String location, String description) {
        this.schoolId = schoolId;
        this.location = location;
        this.description = description;
    }

    public Integer getGuideId() {
        return guideId;
    }

    public SchoolId getSchoolId() {
        return schoolId;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

}
