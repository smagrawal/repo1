package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter employee Id");
    int id = Integer.parseInt(br.readLine());
    System.out.println("\n");
    
    System.out.println("Enter name");
    String name = br.readLine();
    System.out.println("\n");
    
    System.out.println("Enter salary");
    double salary = Double.parseDouble(br.readLine());
    System.out.println("\n");
    
    System.out.println("Enter designation");
    String designation = br.readLine();
    System.out.println("\n");
    
    System.out.println("Enter address");
    String address = br.readLine();
    System.out.println("\n");
    
    EmployeeRecord er = new EmployeeRecord(id, name, designation, salary, address);
    er.showRecord();
    
    EmployeeRecord er1 = (EmployeeRecord)er.getClone();
    er1.showRecord();
    
	}

}
