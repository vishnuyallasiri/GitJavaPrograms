class Box11{
    int height;
    int width;
    int length;
    Box11(){

    }
    Box11(int d){
        height=d;
        width=d;
        length=d;

    }
    Box11(int height, int width, int length){
        this.height=height;
        this.width=width;
        this.length=length; 
        
    }
    void dispaly(){
        System.out.println("THe height of the box"+height);
          System.out.println("THe width of the box"+width);
            System.out.println("THe length of the box"+length);
            System.out.println("........................");


    }
    
}
class Box{
    public static void main(String[]args){
        Box11 B2=new Box11();
        Box11 B=new Box11(10);
        Box11 B1=new Box11(10, 20, 15);
        B.dispaly();
        B1.dispaly();
        B2.dispaly();
        
    }
}