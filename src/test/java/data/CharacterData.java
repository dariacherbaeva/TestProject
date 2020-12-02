package data;

import java.io.File;

public class CharacterData {

    public String name;
    public String lastName;
    public String age;
    //чистокровный(ая), полукровка или  магглорождённый(ая)
    public String bloodStatus;
    public String description;
    public String faculty;
    public String year;
    public String photoPath;

    public CharacterData(String name, String lastName, String age, String bloodStatus, String description, String faculty, String year, String photoPath) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.bloodStatus = bloodStatus;
        this.description = description;
        this.faculty = faculty;
        this.year = year;
        this.photoPath = photoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
