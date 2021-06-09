package day_51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer=new Employee();
        developer.jobTitle="Java Developer";
        developer.calculateSalary(55.0);
        System.out.println("Developers salary => " + developer.calculateSalary(55.0));

        double annualDevSalary=developer.calculateSalary(62.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor sdetContractor=new Contractor();
        sdetContractor.jobTitle="SDET";
      double sdetSalary=sdetContractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);
        System.out.println(developer.toString());
        System.out.println(sdetContractor.toString());

      }



    }
