package assigments.ThirdAssigment;

public class ReThrowEx {
    public static void main(String[] args) {
        try {
            except2();
        } catch (Exception e) {
            System.out.println("Exception on Main");
        }
    }

    public static void except1() throws Exception {
        System.out.println("Exception of method except1");
        throw new Exception("This exception is from method except1");
    }

    public static void except2() throws Exception {
        try {
            except1();
        } catch (Exception e) {
            System.out.println("Caught exception on method except2");
            throw e;
        }

    }

}
