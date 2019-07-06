package com.tangenta.gkassist.major.representation;

import com.tangenta.gkassist.major.model.Majorinfo;
import com.tangenta.gkassist.school.model.SchoolId;

public class MajorRepresentationService {
    public static MajorRepresentation toRepresentation(Majorinfo majorinfo){

        return new MajorRepresentation(SchoolId.of(majorinfo.getSchoolId()),majorinfo.getId(),majorinfo.getIfBK(),majorinfo.getName(),majorinfo.getCode());
    }
}
