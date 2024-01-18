package functional.programming.practice.jan17;

public class RobotPosition {
    public static void main(String[] args) {
        String input = "ULLD";
        String input2 = "U R WELCOME";
        findPositionOfRobot(input);
        findPositionOfRobot(input2);
    }

    public static void findPositionOfRobot(String input) {
        input = input.toUpperCase();
        int countUpPosition = 0, countDownPosition = 0, countLeftPosition = 0, countRightPosition = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'U') {
                countUpPosition++;
            } else if (input.charAt(i) == 'D') {
                countDownPosition++;
            } else if (input.charAt(i) == 'L') {
                countLeftPosition++;
            } else if (input.charAt(i) == 'R') {
                countRightPosition++;
            }
        }
        System.out.println("Final Coordinates of Robot are : (" + (countRightPosition - countLeftPosition) +
                ", " + (countUpPosition - countDownPosition) + ")");
    }
}
