public class SwitchOperations {
    public static void main(String[] args) {
    int x = 10;
		switch (x) {
        case 0: case 1: case 2: case 3: case 4: case 5:
            System.out.println("012345");
            break;
        case 6: case 8: case 9:
            System.out.println("689");
        default:
            System.out.println("Не знайдено");
        }
    }
}
