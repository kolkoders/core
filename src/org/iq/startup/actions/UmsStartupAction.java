package org.iq.startup.actions;

import org.iq.exception.CoreException;


/**
 * @author Sam
 */
public class UmsStartupAction extends StartupAction {

	@Override
	public void init() throws CoreException {
	    System.out.println("STARTING UMS...");
		// TODO Auto-generated method stub
		
	    System.out.println("UMS STARTED SUCCESSFULLY");
	}

	@Override
	public void destroy() {
	    System.out.println("STOPING UMS...");
		// TODO Auto-generated method stub
		
	    System.out.println("UMS STOPPED SUCCESSFULLY");
	}
}