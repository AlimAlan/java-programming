package day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Meerim";
        employee.jobTitle="SDET";
        System.out.println(employee.name);
        System.out.println(employee.jobTitle);
        System.out.println(employee.name +" works as  "+employee.jobTitle);
        employee.work();

        Employee employee1=new Employee();
        employee1.name="Arstanbek Bektemirov";
        employee1.jobTitle="Full stack developer";
        employee1.work();
        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);
        employee.work();
    }
}
