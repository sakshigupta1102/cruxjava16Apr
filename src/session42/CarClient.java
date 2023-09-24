package session42;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CarClient {
	public static void main(String[] args) {
		Car wagonR = new Car(100, "yellow", 2019);
		Car swift = new Car(120, "red", 2018);
		Car nano = new Car(80, "white", 2017);
		Car creta = new Car(130, "black", 2016);
		Car thar = new Car(80, "yellow", 2015);
		List<Car> carList = new ArrayList();
		carList.add(wagonR);
		carList.add(swift);
		carList.add(nano);
		carList.add(creta);
		carList.add(thar);
 		Collections.sort(carList, new CarComp());
		System.out.println(carList);
	}
}
class CarComp implements Comparator<Car> {
	@Override
	public int compare(Car o1, Car o2) {
		if (o1.speed < o2.speed)
			return -1;
		else if (o1.speed > o2.speed)
			return 1;
		else if (o1.yom < o2.yom)
			return -1;
		return 1;
	}

}
