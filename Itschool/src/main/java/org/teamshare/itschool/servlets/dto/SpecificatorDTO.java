package org.teamshare.itschool.servlets.dto;

import org.teamshare.specificator.dao.entity.Specificator;

import java.io.Serializable;
import java.util.Date;

public class SpecificatorDTO implements Serializable {
    private Long id;
    private String title;
    private Double price;
    private Integer createdAgentId;
    private Integer lastModifiedAgentId;
    private Long created;
    private Long lastModified;
    private String jsonData;
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

    public void setLastModifiedAgentId(Integer lastModifiedAgentId) {
        this.lastModifiedAgentId = lastModifiedAgentId;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
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

    public static SpecificatorDTO from(Specificator specificator) {
        SpecificatorDTO dto = new SpecificatorDTO();
        dto.setId(specificator.getId());
        dto.setTitle(specificator.getTitle());
        dto.setPrice(specificator.getPrice());
        dto.setCreatedAgentId(specificator.getCreatedAgentId());
        dto.setLastModifiedAgentId(specificator.getLastModifiedAgentId());
        dto.setCreated(specificator.getCreated().getTime());
        dto.setLastModified(specificator.getLastModified().getTime());
        dto.setJsonData(specificator.getJsonData());
        dto.setHash(specificator.getHash());

        return dto;
    }

    public static Specificator to(SpecificatorDTO dto) {
        Specificator specificator = new Specificator();
        specificator.setId(dto.getId());
        specificator.setTitle(dto.getTitle());
        specificator.setPrice(dto.getPrice());
        specificator.setCreatedAgentId(dto.getCreatedAgentId());
        specificator.setLastModifiedAgentId(dto.getLastModifiedAgentId());
        specificator.setCreated(new Date(dto.getCreated()));
        specificator.setLastModified(new Date(dto.getLastModified()));
        specificator.setJsonData(dto.getJsonData());
        specificator.setHash(dto.getHash());

        return specificator;
    }
}
