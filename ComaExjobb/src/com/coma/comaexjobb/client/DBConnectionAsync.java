package com.coma.comaexjobb.client;
import com.google.appengine.api.users.User;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DBConnectionAsync {

	void test(AsyncCallback<Void> callback);
	 void authenticateUser(String user, String pass, AsyncCallback<Void> callback);
	
}
