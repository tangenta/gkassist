package com.tangenta.gkassist.major.representation;

        import com.tangenta.gkassist.common.ddd.Representation;
        import com.tangenta.gkassist.school.model.SchoolId;

public class MajorRepresentation implements Representation {

    private final SchoolId schoolId;
    private final String id;
    private final String ifBK;
    private final String name;
    private final String code;


    public MajorRepresentation(SchoolId schoolId, String id, String ifBK, String name, String code) {
        this.schoolId = schoolId;
        this.id = id;
        this.ifBK = ifBK;
        this.name = name;
        this.code = code;
    }

    public SchoolId getSchoolId() {
        return schoolId;
    }

    public String getId() {
        return id;
    }

    public String getIfBK() {
        return ifBK;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
