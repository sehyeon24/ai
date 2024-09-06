package strategy1.step4.interfaces;

import strategy2.interfaces.KmImpl;

public class KmPerLiter implements KmImpl {

	@Override
	public void km() {
		System.out.println("연비 10Km/1");
	}

}
