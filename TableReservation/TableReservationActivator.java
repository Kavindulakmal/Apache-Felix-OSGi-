package restuaranttablereservation;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import restuaranttablereservation.TableReservationPublisher;
import restuaranttablereservation.TableReservationPublisherImpl;

public class TableReservationActivator implements BundleActivator {

	ServiceRegistration publishReservationRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Customer subcriber .!");
		TableReservationPublisher publishService = new TableReservationPublisherImpl();
		publishReservationRegistration = context.registerService(TableReservationPublisher.class.getName(), publishService, null);
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Customer subcriber.!");
		publishReservationRegistration.unregister();
	}

} 
