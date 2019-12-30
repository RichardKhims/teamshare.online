package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.constants.HRManagerColumns;

import javax.persistence.*;

/**
 * HR-менеджеры компаний
 */
@Entity
@Table(name = "hr_managers")
public class HRManager {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = HRManagerColumns.FULLNAME_COLUMN)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = HRManagerColumns.COMPANY_ID_COLUMN)
    private Company company;

    @Column(name = HRManagerColumns.PHOTO_URL_COLUMN)
    private String photoUrl;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
