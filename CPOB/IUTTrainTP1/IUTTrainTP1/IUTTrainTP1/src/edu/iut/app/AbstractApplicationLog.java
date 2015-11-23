package edu.iut.app;

import java.util.ArrayList;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList<IApplicationLogListener> listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	
    /** TP1 : Fonction venant de l'interface par héritage */
		public void addListener(IApplicationLogListener listener) {
			listeners.add(listener);
		}
		
		public IApplicationLogListener[] getApplicationLogListeners() {
			return (IApplicationLogListener[])listeners.toArray();
		}

	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
