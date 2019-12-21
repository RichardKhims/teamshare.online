package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.contants.ResultColumns;

import javax.persistence.*;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = ResultColumns.COURSE_ID_COLUMN)
    private Course course;

    @ManyToOne
    @JoinColumn(name = ResultColumns.STUDENT_ID_COLUMN)
    private Student student;

    @Column(name = ResultColumns.MARK_COLUMN)
    private String mark;

    @Column(name = ResultColumns.LEVEL_COLUMN)
    private String level;

    @Column(name = ResultColumns.DESCRIPTION_COLUMN)
    private String description;

    @Column(name = ResultColumns.PROJECT_URL_COLUMN)
    private String projectUrl;

    @Column(name = ResultColumns.INTERVIEW_URL_COLUMN)
    private String interviewUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getInterviewUrl() {
        return interviewUrl;
    }

    public void setInterviewUrl(String interviewUrl) {
        this.interviewUrl = interviewUrl;
    }
}
