package com.coma.comaexjobb.client;

import com.google.appengine.api.users.User;
import com.google.gwt.user.client.rpc.RemoteService;

public interface DBConnection extends RemoteService {

	public void test();
	public void authenticateUser(String user, String pass);
}
