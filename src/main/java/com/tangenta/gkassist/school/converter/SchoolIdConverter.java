package com.tangenta.gkassist.school.converter;

import com.tangenta.gkassist.school.model.SchoolId;

import javax.persistence.AttributeConverter;

public class SchoolIdConverter implements AttributeConverter<SchoolId, String> {
    @Override
    public String convertToDatabaseColumn(SchoolId schoolId) {
        return schoolId.getSchoolId();
    }

    @Override
    public SchoolId convertToEntityAttribute(String s) {
        return SchoolId.of(s);
    }
}
