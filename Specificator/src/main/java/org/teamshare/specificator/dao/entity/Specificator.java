package org.teamshare.specificator.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "specifications")
public class Specificator {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "price", precision = 2)
    private Double price;

    @Column(name = "created_agent_id")
    private Integer createdAgentId;

    @Column(name = "last_modified_agent_id")
    private Integer lasyModifiedAgentId;

    @Column(name = "created")
    private Date created;

    @Column(name = "last_modified")
    private Date lastModified;

    @Column(name = "json_data")
    private String jsonData;

    @Column(name = "hash")
    private String hash;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCreatedAgentId() {
        return createdAgentId;
    }

    public void setCreatedAgentId(Integer createdAgentId) {
        this.createdAgentId = createdAgentId;
    }

    public Integer getLasyModifiedAgentId() {
        return lasyModifiedAgentId;
    }

    public void setLasyModifiedAgentId(Integer lasyModifiedAgentId) {
        this.lasyModifiedAgentId = lasyModifiedAgentId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
