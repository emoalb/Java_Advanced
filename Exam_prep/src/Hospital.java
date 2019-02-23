import com.sun.source.tree.Tree;

import java.util.*;

public class Hospital {
    public static void main(String[] args) {
        TreeMap<String, LinkedHashSet<String>> departmentsPatientsNames = new TreeMap<>();
        TreeMap<String, TreeSet<String>> doctorPatientNames = new TreeMap<>();
        Scanner console = new Scanner(System.in);


        String input = console.nextLine();

        while (!input.equals("Output")) {

            String[] parsedData = input.split(" ");
            String department = parsedData[0];
            String doctorName = parsedData[1] + " " + parsedData[2];
            String patient = parsedData[3];


            LinkedHashSet<String> patientsNames = new LinkedHashSet<>();
            TreeSet<String> doctorNamesP = new TreeSet<>();

            departmentsPatientsNames.putIfAbsent(department, patientsNames);
            doctorPatientNames.putIfAbsent(doctorName, doctorNamesP);



            patientsNames = departmentsPatientsNames.get(department);
            doctorNamesP = doctorPatientNames.get(doctorName);

            if (patientsNames.size() <= 20 * 3&&!patientsNames.contains(patient)&&!doctorNamesP.contains(patient)) {
                doctorNamesP.add(patient);
                patientsNames.add(patient);
            }
            doctorPatientNames.put(doctorName, doctorNamesP);
            departmentsPatientsNames.put(department, patientsNames);
            input = console.nextLine();

        }
        input = console.nextLine();
        while (!input.equals("End")) {

            String[] parsedInput = input.split(" ");
            if (parsedInput.length == 1) {
                LinkedHashSet<String> patientsNames = departmentsPatientsNames.get(parsedInput[0]);
                patientsNames.forEach(System.out::println);

            } else if (doctorPatientNames.containsKey(parsedInput[0] + " " + parsedInput[1])) {
                TreeSet<String> patientsNames = doctorPatientNames.get(parsedInput[0] + " " + parsedInput[1]);
                patientsNames.forEach(System.out::println);

            } else {
                String department = parsedInput[0];
                int room = Integer.parseInt(parsedInput[1]);
                int startIndex = (room - 1) * 3;
                int endIndex = startIndex + 3;
                LinkedHashSet<String> patients = new LinkedHashSet<>(departmentsPatientsNames.get(department));
                ArrayList<String> patientNames = new ArrayList<>(patients);
                ArrayList<String> roomP = new ArrayList<>();
               for(int i = startIndex;i<endIndex;i++){
                       if(i<patientNames.size()) {
                  roomP.add(patientNames.get(i));
                                     }
                }
               Collections.sort(roomP);
               roomP.forEach(n->System.out.println(n));

            }

            input = console.nextLine();
        }
    }
}
