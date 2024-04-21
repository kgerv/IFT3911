package reservation_system;

import reservation_system.visitor.Visitable;
import reservation_system.visitor.Visitor;

import java.util.List;

public abstract class DBSearch implements Visitable {
	List<String> result;

	public List<String> search() {
		return result;
	}

}