package finalProjectDuplicate;

import java.util.Scanner;

public class AdvisorFunctions {
	
	private static StudentFunctions studentRecord = new StudentFunctions();
	
	// Display Menu
	public void menu() {
		System.out.println(" -------------------------------");
		System.out.println("|          Advisor Menu         |");
		System.out.println(" -------------------------------");
		System.out.println("| 1 | Search student            |");
		System.out.println("| 2 | View curriculum progress  |");
		System.out.println("| 3 | Register course           |");
		System.out.println("| 4 | Withdrawal course         |");
		System.out.println("| 5 | View graduation risks     |");
		System.out.println(" -------------------------------");
	}	
		
	// Search Student by ID
	public void searchStudent(String studentID) {
		studentRecord.printCompletedCourse(studentID);
	}
	
	// View Student Curriculum Progress	
	public void viewProgress(String studentID) {
		PrintProgress printProgress = new PrintProgress();
		printProgress.checkMajorAndPrint(studentID);
		}
	
	// Assign Course for Student
	public void registerCourse(String studentID, String courseCode, int section) {
	    studentRecord.registerCourse(studentID, courseCode, section);
	}
		
	// Withdraw Course for Student
	public void withdrawCourse(String studentID, String courseCode, int section) {
			studentRecord.withdrawCourse(studentID, courseCode, section);
	}
	
	// View Graduation Risk
	public void graduationRisks() {
		System.out.println("\n==================================================================");
	    System.out.println("                     GRADUATION RISKS REPORT                     ");
	    System.out.println("==================================================================");
	    System.out.println("Student ID | Name               | Progress           | Risk Level");
	    System.out.println("-----------+--------------------+--------------------+------------");
	    for (Student s: studentRecord.getStudent()) {
	    	int totalCourses = (s.getCompletedCourses().size() + s.getFreeElective().size());
	        int perTerm =  totalCourses / s.getTermsCount();
	        String risk;
	        if (perTerm < 2) {
	            risk = "HIGH";
	        } else if (perTerm < 4) {
	            risk = "MEDIUM";
	        } else {
	            risk = "LOW";
	        }
	        System.out.println( s.getId() + " | " + s.getName() + " | " + perTerm + " courses per term | " + risk);
	        
	    }

	    System.out.println("==================================================================");
	}

	
	// Apply Method according to user selection
	public void selection(int option) {
		Scanner advisorInput = new Scanner(System.in);	
		if (option == 1) {
			System.out.println("\n==================================");
			System.out.println("     Enter Student ID To Search     ");
			System.out.println("==================================");
			System.out.println("Student ID : ");
			String studentID = advisorInput.nextLine();
			searchStudent(studentID);
		}
		else if (option == 2) {
			System.out.println("\n===============================");
			System.out.println("     View Curriculum Progress     ");
			System.out.println("===============================");
			System.out.println("Student ID : ");
			String studentID = advisorInput.nextLine();
			viewProgress(studentID);
		}
		else if (option == 3) {
			System.out.println("\n===============================");
			System.out.println("     Assign Course To Student     ");
			System.out.println("===============================");
			System.out.print("Student ID : ");
			String studentID = advisorInput.nextLine();
			System.out.print("Course code : ");
			String courseCode = advisorInput.next();
			System.out.print("Setion : ");
			int section = advisorInput.nextInt();
			registerCourse(studentID, courseCode, section);
		}
		else if (option == 4) {
			System.out.println("\n===================================");
			System.out.println("     Withdraw Course For Student     ");
			System.out.println("===================================");
			System.out.print("Student ID : ");
			String studentID = advisorInput.nextLine();
			System.out.print("Course code : ");
			String courseCode = advisorInput.next();
			System.out.print("Setion : ");
			int section = advisorInput.nextInt();
			withdrawCourse(studentID, courseCode, section);
		}
		else if (option == 5) {
			graduationRisks();
		}
		else {
			System.out.println("\n❌ Invalid choice. Please try again!\n");
			System.out.print("\nYour selection is:");
			option = advisorInput.nextInt();
	}
	}
}
