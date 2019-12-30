package website.itschool.emailer.servlets.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@SessionScoped
public class Subscription implements Serializable {
    private String course;
    private String level;
    private String contact;
    private String text;

    @JsonIgnore
    private LocalDateTime date = LocalDateTime.now();

    public Subscription() {
    }

    public Subscription(String course, String level, String contact, String text) {
        this.course = course;
        this.level = level;
        this.contact = contact;
        this.text = text;
    }

    public String getCourse() {
        return course;
    }

    public Subscription setCourse(String course) {
        this.course = course;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Subscription setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public Subscription setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public String getText() {
        return text;
    }

    public Subscription setText(String text) {
        this.text = text;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Subscription setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscription)) return false;

        Subscription that = (Subscription) o;

        if (!level.equals(that.level)) return false;
        if (!course.equals(that.course)) return false;
        return contact.equals(that.contact);
    }

    @Override
    public int hashCode() {
        int result = course.hashCode();
        result = 31 * result + level.hashCode();
        result = 31 * result + contact.hashCode();
        return result;
    }
}
