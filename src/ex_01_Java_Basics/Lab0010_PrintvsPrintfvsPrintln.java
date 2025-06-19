package ex_01_Java_Basics;

public class Lab0010_PrintvsPrintfvsPrintln {
    public static void main(String[] args) {
        int i=20;
        System.out.print(i);
        System.out.print(i); // print will not add new line at the end, it will add two outputs
        System.out.println("Hello word"); //println will add the new line at the end
        System.out.println("i am checking println whether it is adding new line or not at the end");
        System.out.printf("integer value i is %d",i ); //printf formats the output

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
    }
}
