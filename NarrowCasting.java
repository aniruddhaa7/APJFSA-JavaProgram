public class NarrowCasting {

        //Declaring the variables
        double doubleVar=30;
        long longVar =100;

        public void TypeCasting(){
            //Printing values before type casting
        System.out.println("Before Type casting Double:"+doubleVar);
        System.out.println("Before Type casting Long:"+longVar);

        int x=(int)doubleVar; //Type casting datatype Double into Integer
        int y=(int)longVar; //Type casting datatype Long into Integer

        //Printing values after type casting

        System.out.println("After Type casting Double:"+x);
        System.out.println("After Type casting Long:"+y);

        }

        public static void main(String[] args){
            NarrowCasting obj = new NarrowCasting();
            obj.TypeCasting();
        }
}
//OUTPUT
/*Before Type casting Double:30.0
Before Type casting Long:100
After Type casting Double:30
After Type casting Long:100

*/
