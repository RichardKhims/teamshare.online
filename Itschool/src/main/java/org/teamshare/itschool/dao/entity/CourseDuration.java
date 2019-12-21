package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.contants.CourseDurationColumns;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course_durations")
public class CourseDuration {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = CourseDurationColumns.COURSE_ID_COLUMN)
    private Course course;

    @Column(name = CourseDurationColumns.START_COLUMN)
    private Date start;

    @Column(name = CourseDurationColumns.END_COLUMN)
    private Date end;

    @Column(name = CourseDurationColumns.CUSTOM_URL_COLUMN)
    private String customUrl;

    @Column(name = CourseDurationColumns.PHOTO_URLS_COLUMN)
    private String photoUrls;

    @Column(name = CourseDurationColumns.DESCRIPTION_COLUMN)
    private String description;

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    public String getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        this.photoUrls = photoUrls;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
