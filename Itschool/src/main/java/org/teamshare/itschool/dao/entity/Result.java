package org.teamshare.itschool.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue
    private Long id;
}
