package com.tangenta.gkassist.school.representation;

import com.tangenta.gkassist.common.ddd.Representation;

import java.util.List;

public class BasicInfoRepresentation implements Representation {
    public final List<String> campus;
    public final List<String> campusLocation;
    public final String belongTo;
    public final String typeOfSchool;
    public final String institutionType;
    public final List<String> characteristicMajor;

    public BasicInfoRepresentation(List<String> campus, List<String> campusLocation, String belongTo,
                                   String typeOfSchool, String institutionType,
                                   List<String> characteristicMajor) {
        this.campus = campus;
        this.campusLocation = campusLocation;
        this.belongTo = belongTo;
        this.typeOfSchool = typeOfSchool;
        this.institutionType = institutionType;
        this.characteristicMajor = characteristicMajor;
    }


    public String getBelongTo() {
        return belongTo;
    }

    public String getTypeOfSchool() {
        return typeOfSchool;
    }

    public String getInstitutionType() {
        return institutionType;
    }
    public List<String> getCharacteristicMajor() {
        return characteristicMajor;
    }
}
