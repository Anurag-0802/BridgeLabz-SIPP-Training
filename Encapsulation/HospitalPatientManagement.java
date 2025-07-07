import java.util.*;

public class HospitalPatientManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("Enter the number of patients : ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter patient type (InPatient/OutPatient) : ");
            String type = sc.nextLine().trim();

            try {
                System.out.print("Enter patient ID : ");
                int id = Integer.parseInt(sc.nextLine().trim());

                System.out.print("Enter patient name : ");
                String name = sc.nextLine();

                System.out.print("Enter age : ");
                int age = Integer.parseInt(sc.nextLine().trim());

                if (type.equalsIgnoreCase("In") || type.equalsIgnoreCase("InPatient")) {
                    System.out.print("Enter days admitted : ");
                    int days = Integer.parseInt(sc.nextLine().trim());

                    System.out.print("Enter room charge per day : ");
                    double charge = Double.parseDouble(sc.nextLine().trim());

                    System.out.print("Enter treatment charge : ");
                    double treatment = Double.parseDouble(sc.nextLine().trim());

                    patients.add(new InPatient(id, name, age, days, charge, treatment));
                } else if (type.equalsIgnoreCase("Out") || type.equalsIgnoreCase("OutPatient")) {
                    System.out.print("Enter consultation fee : ");
                    double fee = Double.parseDouble(sc.nextLine().trim());

                    patients.add(new OutPatient(id, name, age, fee));
                } else {
                    System.out.println("Invalid patient type. Skipping...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format! Skipping this patient.");
            }
        }

        System.out.println("\n---- Patient Summary ----");
        for (Patient p : patients) {
            p.displayDetails();
            System.out.println("Bill : Rs." + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                System.out.println(m.addRecord());
                System.out.println(m.viewRecord());
            }

            System.out.println("-----------------------------");
        }

        sc.close(); // Close only after finishing everything
    }
}
