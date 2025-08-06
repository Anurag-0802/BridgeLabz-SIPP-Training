package Policy;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> treeMapByExpiry = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);

        treeMapByExpiry.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    public Policy getPolicyByNumber(String number) {
        return hashMap.get(number);
    }

    public List<Policy> getPoliciesExpiringIn30Days() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);
        NavigableMap<LocalDate, List<Policy>> subMap = treeMapByExpiry.subMap(now, true, limit, true);
        List<Policy> result = new ArrayList<>();
        for (List<Policy> policies : subMap.values()) {
            result.addAll(policies);
        }
        return result;
    }

    public List<Policy> getPoliciesByHolder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(name)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate now = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(now)) {
                iterator.remove();
                linkedHashMap.remove(policy.getPolicyNumber());
                List<Policy> list = treeMapByExpiry.get(policy.getExpiryDate());
                if (list != null) {
                    list.remove(policy);
                    if (list.isEmpty()) {
                        treeMapByExpiry.remove(policy.getExpiryDate());
                    }
                }
            }
        }
    }

    public void printAllPolicies() {
        for (Policy policy : linkedHashMap.values()) {
            System.out.println(policy);
        }
    }
}
