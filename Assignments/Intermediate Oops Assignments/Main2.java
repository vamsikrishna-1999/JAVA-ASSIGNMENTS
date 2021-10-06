class savings
{
    int fixeddeposits=100000;
    public void total_cash()
    {
        
    }
}
class current extends savings
{
   int sav=super.fixeddeposits;
    int cash_credit=200000;
    public void total_cash()
    {
        int sum=sav+cash_credit;
        System.out.println(sum);
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        current c=new current();
        c.total_cash();
    }
}