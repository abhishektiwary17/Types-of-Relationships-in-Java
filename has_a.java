class Employee
{  
  double salary=80000;  
}  
class Developer extends Employee
{ 
  double bonous=7000;
  public static void main(String args[])
  {
    Employee obj=new Employee();
    System.out.println("Salary is:"+obj.salary);  
  }  
}
