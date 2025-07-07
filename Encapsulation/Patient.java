// Abstract Class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void displayDetails() {
        System.out.println("ID : " + patientId + "; Name : " + name + "; Age : " + age);
    }
}

//Interface
interface MedicalRecord {
	String addRecord();
    String viewRecord();
}

//InPatient class
class InPatient extends Patient implements MedicalRecord {
	private int admittedDays;
	private double roomCharge;
	private double treatmentCharge;

	InPatient(int patientId, String name, int age, int admittedDays, double roomCharge, double treatmentCharge) {
		super(patientId, name, age);
		this.admittedDays = admittedDays;
		this.roomCharge = roomCharge;
		this.treatmentCharge = treatmentCharge;
	}

	@Override
	public double calculateBill() {
		return admittedDays * roomCharge + treatmentCharge;
	}

	@Override
	public String addRecord() {
		return "InPatient record added.";
	}

 @Override
 public String viewRecord() {
     return "Viewing InPatient record.";
 }
}

//OutPatient class
class OutPatient extends Patient implements MedicalRecord {
	private double consultationFee;

	public OutPatient(int patientId, String name, int age, double consultationFee) {
		super(patientId, name, age);
		this.consultationFee = consultationFee;
	}

	@Override
	public double calculateBill() {
		return consultationFee;
	}

	@Override
	public String addRecord() {
		return "OutPatient record added.";
	}

	@Override
	public String viewRecord() {
		return "Viewing OutPatient record.";
	}
}
