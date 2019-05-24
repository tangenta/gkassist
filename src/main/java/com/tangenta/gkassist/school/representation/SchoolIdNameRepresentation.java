package com.tangenta.gkassist.school.representation;

import com.tangenta.gkassist.common.ddd.Representation;
import com.tangenta.gkassist.school.model.SchoolId;

public class SchoolIdNameRepresentation implements Representation {
    private final SchoolId schoolId;
    private final String schoolName;

    public SchoolIdNameRepresentation(SchoolId schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public SchoolId getSchoolId() {
        return schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
