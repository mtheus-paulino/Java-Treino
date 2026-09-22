import entities.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

       try (BufferedReader br = new BufferedReader(new FileReader(path))) {
           String employeeCsv = br.readLine();
           while (employeeCsv != null){
               String[] fields = employeeCsv.split(",");
               list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
               employeeCsv = br.readLine();
           }
           Collections.sort(list);
           for ( Employee emp : list){
               System.out.println(emp.getName() + ", "+emp.getSalary());
           }
       } catch (IOException e){
           System.out.println("Error: " + e.getMessage());
       }

    }
}