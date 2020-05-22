package com.kayrasolutions.aem.experienceframework.core.models.experience.v1;

import com.kayrasolutions.aem.experienceframework.api.models.experience.Experience;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, adapters = Experience.class, resourceType = DefaultExperience.RESOURCE_TYPE)
public class DefaultExperience implements Experience {

    public static final String RESOURCE_TYPE = "experience-framework/components/content/experience/v1/experience";

    @Inject @Optional
    List<String> intent;

    @Inject @Optional
    List<String> style;

    @Override
    public List<String> getIntent() {
        return null;
    }

    @Override
    public List<String> getStyle() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

}
