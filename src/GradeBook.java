import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("\n Welcome to the Great Book!");
		System.out.print("\n Enter grades (1-100). Enter -1 to stop.");
		System.out.print("\n Enter Grade:");

		int Number = Integer.parseInt(in.nextLine());
		int Total = 0;
		int High = 0;
		int Low = 100;
		double Average = 0;

		while (Number > -1) {

			while (100 < Number) {
				System.out.print("\n Not Valid");
				System.out.print("\n Enter Grade:");
				Number = Integer.parseInt(in.nextLine());
			}
			
			Total = Total + 1;
			Average = Number + Average;

			if (Number > High) {

				High = Number;

			}

			if (Number < Low) {

				Low = Number;

			}
			
			System.out.print("\n Enter Grade:");
			Number = Integer.parseInt(in.nextLine());

		}

		if (Number == -1) {

			Average = Average / Total;

			System.out.print("\n Total Grades Entered:" + Total);
			System.out.print("\n Highest Grade:" + High);
			System.out.print("\n Lowest Grade:" + Low);
			System.out.print("\n Average:" + Average);

		}

	}
}
