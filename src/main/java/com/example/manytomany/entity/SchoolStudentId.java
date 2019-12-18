package com.example.manytomany.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SchoolStudentId implements Serializable {

    @Column(name = "school_id")
    private Long schoolId;

    @Column(name = "student_id")
    private Long studentId;

    public SchoolStudentId() {
    }

    public SchoolStudentId(Long schoolId, Long studentId) {
        this.schoolId = schoolId;
        this.studentId = studentId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolStudentId that = (SchoolStudentId) o;
        return Objects.equals(schoolId, that.schoolId) &&
                Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolId, studentId);
    }
}
