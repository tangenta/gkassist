package com.tangenta.gkassist.school.model;

import com.tangenta.gkassist.school.converter.SchoolIdConverter;

import javax.persistence.*;

/**
 *  校园风光
 */
@Entity
public class CampusScenery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sceneryId;

    @Convert(converter = SchoolIdConverter.class)
    private SchoolId schoolId;

    private String description;
    private String url;

    protected CampusScenery() { }

    public CampusScenery(SchoolId schoolId, String description, String url) {
        this.schoolId = schoolId;
        this.description = description;
        this.url = url;
    }

    public Integer getSceneryId() {
        return sceneryId;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public SchoolId getSchoolId() {
        return schoolId;
    }

}
