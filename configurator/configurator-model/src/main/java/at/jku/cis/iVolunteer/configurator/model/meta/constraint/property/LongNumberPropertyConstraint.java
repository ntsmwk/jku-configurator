package at.jku.cis.iVolunteer.configurator.model.meta.constraint.property;

import org.springframework.data.mongodb.core.mapping.Document;

import at.jku.cis.iVolunteer.configurator.model.meta.core.property.PropertyType;

@Document
public class LongNumberPropertyConstraint<T> extends PropertyConstraint<T> {
	
	public LongNumberPropertyConstraint() {
		setPropertyType(PropertyType.WHOLE_NUMBER);
	}

}
