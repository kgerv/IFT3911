package reservation_system.visitor;

public interface Visitable {

	/**
	 * 
	 * @param v
	 */
	void accept(Visitor v);

}