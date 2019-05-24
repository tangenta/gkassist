package com.tangenta.gkassist.school.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

public class SchoolId implements Serializable {
    private String schoolId;

    private SchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public SchoolId() { }

    public static SchoolId of(String schoolId) {
        return new SchoolId(schoolId);
    }

    public String getSchoolId() {
        return schoolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolId schoolId1 = (SchoolId) o;
        return Objects.equals(schoolId, schoolId1.schoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolId);
    }
}
