package yufjin.software.nju;

import java.util.ArrayList;


public class VehicleTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> vehilceList = new ArrayList<>();
		vehilceList.add(new Vehicle());
		vehilceList.add(new Motor());
		vehilceList.add(new Ship());
		vehilceList.add(new Aeroplane());
		vehilceList.add(new Bus());
		vehilceList.add(new Car());
		for (Vehicle vehicle:vehilceList) {
			vehicle.run();
		}
	}

}
