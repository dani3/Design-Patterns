package creational.exercise;

import java.util.ArrayList;
import java.util.List;

public class CodeBuilder {

    private String className;
    private List<Field> fields = new ArrayList<>();

    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(Field field) {
        fields.add(field);

        return this;
    }

    @Override
    public String toString() {
        return "public class " + className + "\n" +
                "{\n" +
                "\t" + fields.get(0) + "\n" +
                "}";
    }
}


