package com.example.Demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "application")
class ApplicationProps {

    private List<Person> profiles;

    public List<Person> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Person> profiles) {
        this.profiles = profiles;
    }

}
