package nitinn;

 class shape1{
    public void print_shape(){
        System.out.println("This is a shape!");
    }
}
    class rectangle1 extends shape1{
        public void print_rect(){
            System.out.println("This is rectangle! ");
        }
    }
    class circle extends shape1{
        public void print_circle(){
            
        }
    }
    class square1 extends rectangle1{
        public  void print_square(){
            System.out.println("Square is a rectangle");
        }
    }
    
    public class Module_2_33 {
        public static void main(String[] args){
            square1 sq = new square1();
            sq.print_shape();
            sq.print_rect();
            sq.print_square();
        }
    }


	


