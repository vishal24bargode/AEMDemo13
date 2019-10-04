package org.aem.pharma.core.models;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=SlingHttpServletRequest.class, resourceType = {"AEMDemo13/components/content/banner"}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerModel {
	 
	@Inject
	@ValueMapValue
	@Default(values = "bannerText")
	private String bannerText;
	
	@Inject
	@ValueMapValue
	@Default(values = "bannerDescription")
	private String bannerDescription;
	
	@Inject
	@ValueMapValue
	@Default(values = "buttonLabel")
	private String buttonLabel;
	
	@Inject
	@ValueMapValue
	@Default(values = "bannerImage")
	private String bannerImage;

	public String getBannerText() {
		return bannerText;
	}

	public String getBannerDescription() {
		return bannerDescription;
	}

	public String getButtonLabel() {
		return buttonLabel;
	}

	public String getBannerImage() {
		return bannerImage;
	}
	
}
