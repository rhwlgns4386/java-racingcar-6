package racingcar.domain;

import java.util.Collections;
import java.util.List;

public class Navigation {

    private final List<Car> cars;

    public Navigation(List<Car> cars) {
        validateSameName(cars);
        this.cars = cars;
    }

    public void moveAll() {
        for (Car car : getList()) {
            car.move();
        }
    }

    public List<Car> getList() {
        return Collections.unmodifiableList(cars);
    }

    private void validateSameName(List<Car> cars) {
        if(hasSameName(cars)){
            throw new IllegalArgumentException("같은 이름이 존재 합니다.");
        }
    }

    private static boolean hasSameName(List<Car> cars) {
        long count = cars.stream().map(Car::getName).distinct().count();
        return count != cars.size();
    }
}
