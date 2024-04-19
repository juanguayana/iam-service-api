package com.axa.portal.col.portlets.iam.service.config;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

@ExtendedObjectClassDefinition(
        category = "transversal-authentication",
        scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE)
@Meta.OCD(id = "com.axa.portal.col.portlets.iam.service.config.UserRecoveryConfiguration",
localization = "content/Language")
public interface UserRecoveryConfiguration {
	
	@Meta.AD(deflt = StringPool.BLANK, required = false)
	public String userRecoveryConfiguration();
	
}
