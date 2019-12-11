package org.teamshare.specificator.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "specifications")
public class Specificator {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = SpecificatorColumns.TITLE_COLUMN)
    private String title;

    @Column(name = SpecificatorColumns.PRICE_COLUMN)
    private Double price;

    @Column(name = SpecificatorColumns.CREATED_AGENT_ID_COLUMN)
    private Integer createdAgentId;

    @Column(name = SpecificatorColumns.LAST_MODIFIED_AGENT_ID_COLUMN)
    private Integer lastModifiedAgentId;

    @Column(name = SpecificatorColumns.CREATED_COLUMN)
    private Date created;

    @Column(name = SpecificatorColumns.LAST_MODIFIED_COLUMN)
    private Date lastModified;

    @Column(name = SpecificatorColumns.DATA_COLUMN)
    private String jsonData;

    @Column(name = SpecificatorColumns.HASH_COLUMN)
    private String hash;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getLastModifiedAgentId() {
        return lastModifiedAgentId;
    }

    public void setLastModifiedAgentId(Integer lasyModifiedAgentId) {
        this.lastModifiedAgentId = lasyModifiedAgentId;
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
