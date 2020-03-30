import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"BMW", "Mercedes-Benz", "VW", "AUDI"},
                        new String[]{"Jaguar", "VW", "AUDI", "JAGUAR"},
                        new String[]{"VW", "AUDI"}
                },

                {
                        new String[]{"Yamaha", "Fender", "Roland", "Cort"},
                        new String[]{"Cort", "Roland", "Yamaha"},
                        new String[]{"Yamaha", "Roland"}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

        assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
                "Common elements are not correct");
    }
}