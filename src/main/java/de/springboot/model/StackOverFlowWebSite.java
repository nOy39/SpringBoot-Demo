package de.springboot.model;

/**
 * Created by @author OGI aka nOy39
 *
 * @Date 03.04.2018
 * @Time 22:22
 */
public class StackOverFlowWebSite {
    private final String id;
    private final String website;
    private final String iconImageUrl;
    private final String title;
    private final String description;

    public StackOverFlowWebSite(String id, String website, String iconImageUrl, String title, String description) {
        this.id = id;
        this.website = website;
        this.iconImageUrl = iconImageUrl;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "StackOverFlowWebSite{" +
                "id='" + id + '\'' +
                ", website='" + website + '\'' +
                ", iconImageUrl='" + iconImageUrl + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
