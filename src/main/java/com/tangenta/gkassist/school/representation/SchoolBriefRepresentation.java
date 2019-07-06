package com.tangenta.gkassist.school.representation;

import com.tangenta.gkassist.common.ddd.Representation;
import com.tangenta.gkassist.school.model.SchoolId;

import java.util.List;

public class SchoolBriefRepresentation implements Representation {
    private long totalNum;
    private List<SchoolId> schoolIds;
    private List<String> schoolNames;

    public SchoolBriefRepresentation(long totalNum, List<SchoolId> schoolIds, List<String> schoolNames) {
        this.totalNum = totalNum;
        this.schoolIds = schoolIds;
        this.schoolNames = schoolNames;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public List<SchoolId> getSchoolIds() {
        return schoolIds;
    }

    public List<String> getSchoolNames() {
        return schoolNames;
    }
}
