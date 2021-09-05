public class valid {
    public static void main(String[] args) {
        double d = 0xb10_000;
        float f = 0b10_000;
//        float f1 = 0b20_000; //int long
//        double d1 = 0b10_000d; //D not defined

//        float f2 = 1.0; //provided double
        float f3 = -1;
        float f4 = 0x0123;
        float F5 = 4;

        byte b = 100;   //8-bit -128 - 127
        int in= 50000; //32 bit -32,768 to 32,767
        long lng = 7000000000L;   //63

        float flot = 5.75f;  //Its value range is infinite. While declaring the floating, we must end the value with an f.

        double dubl= 19.99d; //The default value of the double data type is 0.0d. While declaring the double type values, we must end the value with a d.

    }
}
