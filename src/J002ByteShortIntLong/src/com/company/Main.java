package J002ByteShortIntLong.src.com.company;

public class Main {

    public static void main(String[] args) {

        /* 8 - Primitive Data Types is ;
        * 1) Byte (Occupies 8 bits, byte has width of 8)
        * 2) Short (Occupies 16 bits, short has width of 16)
        * 3) Integer (Occupies 32 bits, integer has width of 32)
        * 4) Long (Occupies 64 bits, long has width of 64)
        * 5) Float
        * 6) Double
        * 7) Char
        * 8) Boolean  */

       int myValue = 10000;

       // Integer(capital letters start is class name) is wrapped class in java,
        // all primitive types have a wrapped class
       int myMinValue = Integer.MIN_VALUE;
       int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer min value is : " + myMinValue);
        System.out.println("Integer max value is : " + myMaxValue);

        //System.out.println("Integer Overflow is : " + myMaxValue + 1); // overflowed !!! range not supported
        //System.out.println("Integer Underflow is : " + myMinValue - 1); // underflow !!! range not supported

        int myUnderScoreValue = 1_000_500; // for readability use _ (underscore) instead of an example.
        System.out.println(myUnderScoreValue); // 1_000_500 == 1000500

        // ================================================= //

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("My Byte Min Value is : " + myByteMinValue);
        System.out.println("My Byte Max Value is : " + myByteMaxValue);

        // ================================================= //
        // Select lines that (Command + R) use replace functions in intelliJ

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("My Short Min Value is : " + myShortMinValue);
        System.out.println("My Short Max Value is : " + myShortMaxValue);

        // ================================================= //

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("My Long Min Value is : " + myLongMinValue);
        System.out.println("My Long Max Value is : " + myLongMaxValue);

        long myLong = 100L; // (value + L) for declared to Java this is Long Data Type






    }
}
