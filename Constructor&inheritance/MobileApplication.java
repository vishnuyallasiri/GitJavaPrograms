class mobile{
    String brand;
    String color;
    double camera;
    mobile(String brand,String color, double camera){
        this.brand=brand;
        this.color=color;
        this.camera=camera;

    }
    void dispaly(){
        System.out.println("the brand is"+brand);
        System.out.println("the clor is"+color);
        System.out.println("the camera is"+camera);
    }
    void calling(String n){
        if(n.equals("avaliable")) System.out.println("The mobile will work");
        else
        System.out.println("The network not avaliable");
    }
}
class MobileApplication{
    public static void main(String []args){
        mobile m1=new mobile();
        m1.moble("Iphone", "black", 5);
        m1.display();
        m1.calling("avaliable")
    }
}