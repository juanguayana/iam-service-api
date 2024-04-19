package com.axa.portal.col.portlets.iam.service.impl;

import com.axa.portal.col.portlets.iam.service.api.UserRecoveryApi;
import com.liferay.portal.kernel.json.JSONObject;

import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        service = UserRecoveryApi.class,
        configurationPid = "com.axa.portal.col.portlets.iam.service.config.UserRecoveryConfiguration")
public class UserRecoveryImpl implements UserRecoveryApi{

	@Override
	public JSONObject getUserInfo() throws PortletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void notifyUser() throws PortletException {
		// TODO Auto-generated method stub
		
	}

}
