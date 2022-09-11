class A{
    int bal;
    void display(){
        System.out.println("Avaliable balance is"+bal);
    }
      void withdraw(int amt){
        if(amt>bal){
            System.out.println("Your not having the suffcient balance ");
        return;

        } 
        // disp code
        bal=bal-amt;
        System.out.println("The amount going to dispact "+bal);
    }
}
class Atm{
    public static void main(String... args){
        A q1=new A();
        q1.bal=10000;
        q1.display();
        withdraw(3000);
        q1.display();
    }
}