package org.teamshare.itschool.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hr_managers")
public class HRManager {
    @Id
    @GeneratedValue
    private Long id;
}
