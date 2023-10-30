package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements Generator {

    private static final int MIN = 0;
    private static final int MAX = 9;

    @Override
    public Integer generate() {
        Integer choose = Randoms.pickNumberInRange(MIN, MAX);

        assert inRange(choose);
        return choose;
    }

    private boolean inRange(Integer choose) {
        return MIN <= choose && choose <= MAX;
    }
}
