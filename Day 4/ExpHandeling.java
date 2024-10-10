class ExpHandeling {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int arr[]= new int[5];
        try {
            // if (i == 0)
            //     throw new ArithmeticException();
            // j = 18 / i;
            arr[6] = 6;
        } catch (ArithmeticException e) {
            System.out.println("cannot divisible by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of boud");
        }
        catch (Exception e) {
            System.out.println("somthing went wrong");
        }
    }
}