import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testAdd() {
        Solution sol = new Solution();
        Assertions.assertArrayEquals(new int[]{0,1}, sol.twoSum(new int[]{2,7,11,15}, 9));
        Assertions.assertArrayEquals(new int[]{1,2}, sol.twoSum(new int[]{3,2,4}, 6));
    }
}
