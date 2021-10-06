class Employee
{
    int Msalary=15000;
    int Lsalary=9000;
    public void getMsalary()
    {
        
    }
    public void getLsalary()
    {
        
    }
}
class Manager extends Employee
{
    int incentive;
    int Msal=super.Msalary;
    public void getMsalary()
    {
        int amt=Msal+incentive;
        System.out.println(amt);
    }
    
}
class Labour extends Employee
{
    int Lsal=super.Lsalary;
    int overtime;
    public void getLsalary(int time)
    {
        int amt=Lsal+(time*100);
        System.out.println(amt);
    }
}
public class Main1
{
    public static void main(String[] args)
    {
        Labour l=new Labour();
        l.getLsalary(2);
        Manager m=new Manager();
        m.getMsalary();
    }
}