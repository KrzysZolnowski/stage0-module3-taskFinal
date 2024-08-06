package lang.print.gaps.finalModuleTask;

import java.lang.reflect.Array;

public class NumberReverter {
    public void revert(int number) {
        int reverse;
        for(reverse = 0; number != 0; number /= 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println(reverse);

    }
}
