package com.tangenta.gkassist.school.model;

import com.tangenta.gkassist.school.converter.SchoolIdConverter;

import javax.persistence.*;

@Entity
public class SchoolBadge {
    @Id
    private String schoolId;

    private String schoolBadge;

    protected SchoolBadge() { }

    public SchoolBadge(String schoolId, String schoolBadge) {
        this.schoolId = schoolId;
        this.schoolBadge = schoolBadge;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public String getSchoolBadge() {
        return schoolBadge;
    }
}
