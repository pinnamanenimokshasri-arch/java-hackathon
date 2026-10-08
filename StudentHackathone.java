
class Student {
    
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    
    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

       public double calculateFee() {
        return courseCredits * 1500.0;
    }

        public boolean checkEligibility() {
        return marks >= 50.0;
    }

      public double calculateScholarship(double totalFee) {
        if (marks >= 85.0) {
            return totalFee * 0.20;
        } else if (marks >= 70.0 && marks <= 84.0) {
            return totalFee * 0.10;
        } else {
            return 0.0;
        }
    }

       public double calculateFinalFee(double totalFee, double scholarship) {
        return totalFee - scholarship;
    }

       public void displayDetails() {
        boolean eligible = checkEligibility();
        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Course Credit: " + courseCredits);
        System.out.println("Eligible     : " + (eligible ? "Yes" : "No"));

        if (eligible) {
            double totalFee = calculateFee();
            double scholarship = calculateScholarship(totalFee);
            double finalFee = calculateFinalFee(totalFee, scholarship);

            System.out.println("Total Fee    : Rs. " + totalFee);
            System.out.println("Scholarship  : Rs. " + scholarship);
            System.out.println("Final Fee    : Rs. " + finalFee);
        } else {
            System.out.println("Status       : Not eligible for registration (Marks are below 50).");
        }
    }
}

public class StudentCourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = scanner.nextInt();

               Student student = new Student(name, rollNo, marks, courseName, credits);

       
        if (student.checkEligibility()) {
                       student.displayDetails();
        } else {
            
            System.out.println("\nRegistration Failed: Student " + name + " (Roll No: " + rollNo + ") is not eligible because marks (" + marks + ") are less than 50.");
        }

        scanner.close();
    }
}
