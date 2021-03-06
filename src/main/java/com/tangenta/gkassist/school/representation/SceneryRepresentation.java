package com.tangenta.gkassist.school.representation;

import com.tangenta.gkassist.common.ddd.Representation;
import com.tangenta.gkassist.school.model.Link;

public class SceneryRepresentation implements Representation {
    private Link link;
    private String description;

    public SceneryRepresentation(Link link, String description) {
        this.link = link;
        this.description = description;
    }

    public Link getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }
}
