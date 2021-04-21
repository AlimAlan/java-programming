package officeHours.OfficeHours;

public class CastingPractice {
    public static void main(String[] args) {
        byte b=10;
        short s= b;
        byte b2=(byte)s;

        double d = 5.3;
        int i = (int)d;
        int i2= (short)d;
        System.out.println(i);
        System.out.println((double)i);


        float f =3;
        float f2=3.54f;
        float f3=(float)3.54;

        float f4=5;
        float f5 = 5.5F;

        long l=22313;
        long l2=454635254623L;

        System.out.println(l);
        System.out.println((double)l);
        System.out.println((float)l);
        System.out.println(l2);


        double million = 1_000_000;
        System.out.println("million = " + million);






    }
}
