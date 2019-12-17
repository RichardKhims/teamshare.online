package org.teamshare.itschool.dao.entity;

import org.teamshare.itschool.dao.contants.CompanyColumns;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = CompanyColumns.NAME_COLUMN)
    private String name;

    @Column(name = CompanyColumns.ACCESS_HASH_COLUMN)
    private String accessHash;

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

    public String getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(String accessHash) {
        this.accessHash = accessHash;
    }
}
