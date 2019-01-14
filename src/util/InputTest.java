package util;

public class InputTest {
    public static void main(String[] args) {
       Input.getString();
        Input.yesNo();
        Input.getInt(1,50, "Please enter a number.");
        Input.getInt();
        Input.getDouble(1, 100,"Please enter a number.");
        Input.getDouble();
    }
}
