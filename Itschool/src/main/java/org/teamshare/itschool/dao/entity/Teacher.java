package org.teamshare.itschool.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;
}
