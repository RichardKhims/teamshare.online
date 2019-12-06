package org.teamshare.specificator.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Specificator {
    @Id
    @GeneratedValue
    private Integer id;
}
