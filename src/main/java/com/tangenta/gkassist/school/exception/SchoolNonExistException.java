package com.tangenta.gkassist.school.exception;

import com.tangenta.gkassist.common.exception.AppException;
import com.tangenta.gkassist.common.util.Basics;
import com.tangenta.gkassist.school.model.SchoolId;

import static com.tangenta.gkassist.common.exception.ErrorCode.SCHOOLID_NONEXIST_ERROR;

public class SchoolNonExistException extends AppException {
    public SchoolNonExistException(SchoolId schoolId) {
        super(SCHOOLID_NONEXIST_ERROR, Basics.immMap("schoolId", schoolId.getSchoolId()));
    }
}
