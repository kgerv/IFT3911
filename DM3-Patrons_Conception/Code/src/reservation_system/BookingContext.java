package reservation_system;

import reservation_system.PricingStratgy;
public class BookingContext {

	public PricingStrategy pricingStrategy;

	/**
	 * 
	 * @param strategy
	 */
	public void setPricingStrategy(PricingStrategy strategy) {
		this.pricingStrategy = strategy;
	}

	public void calculatePrice() {
		// TODO - implement ReservationSystem.BookingContext.calculatePrice
		throw new UnsupportedOperationException();
	}

}