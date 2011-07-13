package info.kwarc.mmt.api;

import info.kwarc.mmt.api.wrappers.MMTController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static Map<String, MMTController> controllers = null; 
	
	static BundleContext getContext() {
		return context;
	}
	
	/**
	 * Returns the MMTController associated with the parameters URI 
	 * @param URI of the requested MMT Controller. If null, URI="info.kwarc.mmt.api.generic"
	 * @return MMTController instance
	 */
	public static MMTController getController(String URI) {
		if (URI == null) {
			URI = "info.kwarc.mmt.api.generic";
		}
		Logger lg = Logger.getLogger("Activator");
		String bootstrapPath = getContext().getBundle().getLocation()+"bootstrap";
		String []split = bootstrapPath.split(":/");
		bootstrapPath = "/"+split[1];
		if (controllers == null)
			controllers = new HashMap<String, MMTController>();
		if (controllers.containsKey(URI))
			return controllers.get(URI);
		else {
			MMTController c = new MMTController();
			controllers.put(URI, c);
			return c;
		}		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
