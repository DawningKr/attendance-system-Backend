package cn.edu.njupt.attendancesystem.entity;


public class Student {
    private String id;
    private String name;
    private String section;

    public Student() {
    }

    public Student(String id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
