import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a velocity and acceleration in meters per second (m/s): ");
		int velocity = input.nextInt();
		int acceleration = input.nextInt();
		int length = (velocity * velocity)/(2 * acceleration);
		System.out.print("The minimum airplane length for the airplane is "+length+" meters.");
	}
}
