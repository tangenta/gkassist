package com.tangenta.gkassist.school.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.persistence.AttributeConverter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ListGsonConverter implements AttributeConverter<List<String>, String> {
    private static Gson gson = new Gson();

    @Override
    public String convertToDatabaseColumn(List<String> strings) {
        return gson.toJson(strings);
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
        Type listType = new TypeToken<ArrayList<String>>(){}.getType();
        return gson.fromJson(s, listType);
    }
}
