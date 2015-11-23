package edu.iut.app;

import edu.iut.app.IApplicationLogListener;

public interface IApplicationLog {
	/** TP1 : Créérr les méthodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener listener);
	public IApplicationLogListener[] getApplicationLogListeners();
}
