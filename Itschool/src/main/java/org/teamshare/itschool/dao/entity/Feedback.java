package org.teamshare.itschool.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;
}
