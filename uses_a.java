class Employee
{  
  double salary=80000;  
}  
class Salary extends Employee
{
  void disp()
  {
    double bonous=7000;
    Employee obj=new Employee();
    float Total=obj.salary+bonous;
    System.out.println("Total Salary is:"+Total);  
  }
}
class Developer
{ 
  public static void main(String args[])
  {
    Salary s=new Salary();
    s.disp();
  }  
} 
