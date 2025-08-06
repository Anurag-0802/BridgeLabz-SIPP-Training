package Policy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(15)));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.now().minusDays(10)));
        manager.addPolicy(new Policy("P004", "Alice", LocalDate.now().plusDays(5)));

        System.out.println("All Policies:");
        manager.printAllPolicies();

        System.out.println("\nPolicies expiring in next 30 days:");
        for (Policy p : manager.getPoliciesExpiringIn30Days()) {
            System.out.println(p);
        }

        System.out.println("\nPolicies held by Alice:");
        for (Policy p : manager.getPoliciesByHolder("Alice")) {
            System.out.println(p);
        }

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("\nPolicies after removal:");
        manager.printAllPolicies();
    }
}

