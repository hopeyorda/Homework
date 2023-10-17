package loye;

public class output {
    public static void main(String [] args) {
        String name="yordanos";//This is declaration of variable.
        int num=21;
        int a=10;
        double nm=45.6;
        int intnum=(int)nm;//This narowwing casting the data type
        double doubnum=num;//This widening  casting the data type
        char letter='Y';
        boolean bool=true;
        System.out.println(name);
        System.out.println(num);
        System.out.println(doubnum);
        System.out.println(nm);
        System.out.println(intnum);
        System.out.println(letter);
        System.out.println(bool);
        System.out.println("Java");
        System.out.println("C++");
        System.out.println("Python");//This code displey java c++ python strings//
        //Arithemetic operaor
        System.out.println(num +a);
        System.out.println(num / a);
        //Relational operator
        System.out.println(num > a);
        System.out.println(num <=a);
        //Logical operator
        System.out.println(num >a && num<a);
        System.out.println(a >num || a < num);
        //This is conditional statment
        if(num%2==0){
      System.out.println(num + ": is Even number.") ;
        }
        else {
            System.out.println(num + ": is not even number");
        }
        //This is switch statment
        char operator='-';
        switch(operator){
            case '+':
                System.out.println(num + a);
                break;
            case '-':
                System.out.println(num - a);
                break;
            case '*':
                System.out.println(num * a);
                break;
            default:
                System.out.println("This not operator ");
        }
        //This is looping  statment.
        int x=0;
        while(x<7){
            System.out.println(x);
            x++;
        }
        loye("Loty");

    }
       static void loye(String myname){

        System.out.println(myname);
    }
}
