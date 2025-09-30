public class Main {

    public static void main(String[] args) {

    Bank b = new Bank("Merkurbanken");
    Account a = new Account("Søren");
    a.deposit(1000);
    b.accounts.add(a);

    Bank b2 = new Bank("Saxobank");
    Account a2 = new Account("Søren");
    Account a3 = new Account("Marie");
    Account a4 = new Account("Per");
    Account a5 = new Account("Frasier");
    a2.deposit(2000);
    a3.deposit(1000);
    a4.deposit(700);
    a5.deposit(3200);
    b2.accounts.add(a2);
    b2.accounts.add(a3);
    b2.accounts.add(a4);
    b2.accounts.add(a5);



    for(Account acc: b2.accounts)    {
        System.out.println(acc.getBalance());
    }



}
}
