package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.contants.TeacherColumns;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = TeacherColumns.FULLNAME_COLUMN)
    private String fullName;

    @Column(name = TeacherColumns.ABOUT_COLUMN)
    private String about;

    @Column(name = TeacherColumns.PHOTO_URL_COLUMN)
    private String photoUrl;

    @ManyToOne
    @JoinColumn(name = TeacherColumns.COMPANY_ID_COLUMN)
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
