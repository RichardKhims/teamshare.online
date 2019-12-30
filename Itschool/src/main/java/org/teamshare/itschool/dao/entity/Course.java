package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.constants.CourseColumns;

import javax.persistence.*;
import java.util.List;

/**
 * Информация о различных дисциплинах курсов обучения
 */
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = CourseColumns.NAME_COLUMN)
    private String name;

    @Column(name = CourseColumns.TYPE_COLUMN)
    private String type;

    @Column(name = CourseColumns.DIFFICULT_COLUMN)
    private Integer difficult;

    @Column(name = CourseColumns.DESCRIPTION_URL)
    private String descriptionUrl;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<CourseDuration> durations;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Result> results;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public String getDescriptionUrl() {
        return descriptionUrl;
    }

    public void setDescriptionUrl(String descriptionUrl) {
        this.descriptionUrl = descriptionUrl;
    }

    public List<CourseDuration> getDurations() {
        return durations;
    }

    public void setDurations(List<CourseDuration> durations) {
        this.durations = durations;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
