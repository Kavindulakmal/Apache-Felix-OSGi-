package deliveryservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishDeliveryRegistration;


	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Delivery Service Start");
		
		
		
		ServiceDeliver deliveryService = new ServiceDeliveryImpl();
		publishDeliveryRegistration = context.registerService(ServiceDeliver.class.getName(), deliveryService,null);
		
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Restaurant Food Delivery Publisher.");
		publishDeliveryRegistration.unregister();
	}

}
