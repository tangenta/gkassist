package com.tangenta.gkassist.school.representation;

import com.tangenta.gkassist.common.ddd.Representation;
import com.tangenta.gkassist.school.model.Link;
import com.tangenta.gkassist.school.model.SchoolId;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SchoolRepresentation implements Representation {
    private final SchoolId id;
    private final String schoolName;
    private final List<SceneryRepresentation> bannerPics;
    private final List<AdmissionGuideRepresentation> admissionGuideLink;
    private final Link schoolBadge;

    public SchoolRepresentation(SchoolId id, String schoolName, List<SceneryRepresentation> bannerPics, List<AdmissionGuideRepresentation> admissionGuideLink, Link schoolBadge) {
        this.id = id;
        this.schoolName = schoolName;
        this.bannerPics = bannerPics;
        this.admissionGuideLink = admissionGuideLink;
        this.schoolBadge = schoolBadge;
    }

    public SchoolId getId() {
        return id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<SceneryRepresentation> getBannerPics() {
        return bannerPics;
    }

    public List<AdmissionGuideRepresentation> getAdmissionGuideLink() {
        return admissionGuideLink;
    }

    public Link getSchoolBadge() {
        return schoolBadge;
    }
}
