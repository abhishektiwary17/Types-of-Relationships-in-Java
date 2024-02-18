class Employee
{  
  double salary=80000;  
}  
class Developer extends Employee
{ 
  double bonous=7000;
  public static void main(String args[])
  {
    Developer obj=new Developer(); 
    System.out.println("Salary is:"+obj.salary);  
    System.out.println("Bonous is:"+obj.bonous);  
  }  
}
