package Classes.CompanyRoster;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Employee em;
            String[] line = in.nextLine().split("\\s+");

            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];
            int age;
            if(line.length == 4){
                age = -1;
                 em = new Employee(name, salary, position, department, "n/a",age);

            }else if(line.length == 5){
                boolean isTrue = tryParse(line[4]);
                if(isTrue){
                    age = Integer.parseInt(line[4]);
                     em = new Employee(name, salary, position, department,"n/a", age);
                }else {
                    age = -1;
                    String email = line[4];
                     em = new Employee(name ,salary, position, department, email, age);
                }
            }else {
                String email = line[4];
                 age = Integer.parseInt(line[5]);
                 em = new Employee(name,salary,position,department ,email, age);

            }
            list.add(em);
        }

        Map<String, Double> totalSalaries = new LinkedHashMap<>();
        for (Employee s : list) {
            if(totalSalaries.containsKey(s.getDepartment())){
                double sal = totalSalaries.get(s.getDepartment());
                totalSalaries.put(s.getDepartment(), sal += s.getSalary());
            }
            else {
                totalSalaries.put(s.getDepartment(),s.getSalary());
            }
        }

        String dep="";
        double maxSalary = Double.MIN_VALUE;

        for (Map.Entry<String, Double> stringDoubleEntry : totalSalaries.entrySet()) {
            if(maxSalary < stringDoubleEntry.getValue()){
                maxSalary = stringDoubleEntry.getValue();
                dep = stringDoubleEntry.getKey();
            }
        }

        List<Employee> EM = new ArrayList<>();
        for (Employee employee : list) {
            if(employee.getDepartment().equals(dep)){
                EM.add(employee);
            }
        }
        Comparator<Employee> comparator = Comparator.comparingDouble(Employee::getSalary).reversed();

        System.out.println(String.format("Highest Average Salary: %s",dep));
        EM.stream().sorted(comparator).forEach(e ->
                System.out.println(String.format("%s %.2f %s %d", e.getName(),e.getSalary(),
                e.getEmail(),e.getAge())));
    }

    private static boolean tryParse(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
