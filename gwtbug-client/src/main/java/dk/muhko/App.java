package dk.muhko;

import com.google.gwt.core.client.EntryPoint;
import dk.muhko.test.Worker;

public class App implements EntryPoint {
	@Override
	public void onModuleLoad() {
		new Worker().work();
	}
}
