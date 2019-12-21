package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.constants.FeedbackColumns;

import javax.persistence.*;

@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = FeedbackColumns.STUDENT_ID_COLUMN)
    private Student student;

    @ManyToOne
    @JoinColumn(name = FeedbackColumns.COURSE_ID_COLUMN)
    private Course course;

    @Column(name = FeedbackColumns.TEXT_COLUMN)
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
