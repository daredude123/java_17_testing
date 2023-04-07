/**
 * New_random_test
 */
public class New_random_test {

    public static void main(String[] args) {

        final String b = "3";
        Object o = "s";
        if (b instanceof String) {
            System.out.println("Object is a string");
        }

        switchTest(b);
        switchTest(34f);
        switchTest(2);
        switchTest("jssss");
    }

    private static void switchTest(Object o) {
        switch (o) {
            case Integer i -> System.out.println("its an integer");
            case Float f -> System.out.println("its a float");
            case String s -> System.out.println("its a string");
            default -> System.out.println("asdasdasd");
        };

    }
}