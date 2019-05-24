package com.tangenta.gkassist.common.util;

import com.tangenta.gkassist.common.exception.AppException;
import com.tangenta.gkassist.school.exception.SchoolNonExistException;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class Basics {
    public static<T, R> R nilOrTr(T srcObj, Function<T, R> func) {
        if (srcObj == null) return null;
        return func.apply(srcObj);
    }

    public static <K, V> Map<K, V> immMap(K key, V value) {
        return Collections.unmodifiableMap(Collections.singletonMap(key, value));
    }

    public static <T, E extends AppException> T tryGet(Optional<T> optional, E exception) {
        if (!optional.isPresent()) throw exception;
        else return optional.get();
    }
}
