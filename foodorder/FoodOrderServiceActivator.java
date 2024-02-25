package foodorder;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class FoodOrderServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Meal Order Publish.!");
		FoodOrderServicePublish publishService = new FoodOrderServicePublishImpl();
		publishServiceRegistration = context.registerService(FoodOrderServicePublish.class.getName(), publishService, null);
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop  Meal Order Publish");
		publishServiceRegistration.unregister();
	}

}
