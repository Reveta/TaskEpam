package ua.com.Epam.task11RegExStringBuilderI18N.lessonMaterials.java.com.pavelchak.tasks;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    private List<Object> objects = new ArrayList<>();

    public StringUtils addToParameters(Object obj){
        objects.add(obj);
        return this;
    }

    public String concat(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : objects){
            stringBuilder.append(obj).append("  ");
        }
        return stringBuilder.toString();
    }
}
