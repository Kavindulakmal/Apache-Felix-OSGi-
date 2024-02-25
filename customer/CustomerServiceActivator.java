package customer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CustomerServiceActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Restaurant Customer types ");
		CustomerServiceActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("stop Restaurant Customer types ");
		CustomerServiceActivator.context = null;
	}

}
