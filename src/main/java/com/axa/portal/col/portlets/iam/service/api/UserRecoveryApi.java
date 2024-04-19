package com.axa.portal.col.portlets.iam.service.api;

import com.liferay.portal.kernel.json.JSONObject;

import javax.portlet.PortletException;

import aQute.bnd.annotation.ProviderType;

/**
 * @author juan.guayana
 */
@ProviderType
public interface UserRecoveryApi {
	
	public JSONObject getUserInfo() throws PortletException;
	
	public void notifyUser() throws PortletException;
}