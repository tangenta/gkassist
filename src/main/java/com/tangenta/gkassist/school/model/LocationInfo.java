package com.tangenta.gkassist.school.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long locationId;
    private SchoolId schoolId;
    private String campus;
    private String locationDetail;

    public LocationInfo() {}

    public LocationInfo(SchoolId schoolId, String campus, String locationDetail) {
        this.schoolId = schoolId;
        this.campus = campus;
        this.locationDetail = locationDetail;
    }

    public SchoolId getSchoolId() {
        return schoolId;
    }

    public String getCampus() {
        return campus;
    }

    public String getLocationDetail() {
        return locationDetail;
    }
}
