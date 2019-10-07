package org.aem.pharma.core.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.aem.pharma.core.models.CardModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;


@Model(adaptables = Resource.class, resourceType = {"AEMDemo13/components/content/card"}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardController {
	
	@ChildResource
    @Default(values = "")
    @Named("card")
    private Resource card;
	
	private List<CardModel> cardModels = new ArrayList<>();
	
	public Resource getCard() {
		return card;
	}

	public List<CardModel> getCardModels() {
		return cardModels;
	}	
	
	@PostConstruct
	protected void init() {
		if (card != null) {

            final Iterator<Resource> iterator = card.listChildren();
            iterator.forEachRemaining(item -> {
                final CardModel cardModel = new CardModel();
                cardModel.setCssClass(item.getValueMap().get("cssClass", String.class));
                cardModel.setHeading(item.getValueMap().get("heading", String.class));
                cardModel.setDescription(item.getValueMap().get("description", String.class));             
               
                cardModels.add(cardModel);
            });

        }
	}
}
