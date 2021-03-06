package com.ssi.ssi.resources;

import com.ssi.ssi.domain.model.MaterialType;

public class MaterialTypeResource {

    private final MaterialType materialType;

    private Long id;

    private String name;

    public MaterialTypeResource(final MaterialType materialType) {
        this.materialType = materialType;
        this.id = materialType.getId();
        this.name = materialType.getName();
    }

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
}
