package ATMMM;

public class Deposit extends ATMMachineMain
{
    static double deposit;
    public void setDeposit(double d)
    {
        deposit = d;
    }
    public static double getDeposit()
    {
        return deposit;
    }
}