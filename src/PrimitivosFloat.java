public class PrimitivosFloat {

    static float varFlotante = 100.10F;
    public static void main(String[] args) {

        float realFloat = 0.00000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en byte a " + Float.SIZE);
        System.out.println("tipo float corresponde en byte a " + Float.MIN_VALUE);
        System.out.println("tipo float corresponde en byte a " + Float.MAX_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);

        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en byte a " + Double.SIZE);
        System.out.println("tipo double corresponde en byte a " + Double.MIN_VALUE);
        System.out.println("tipo double corresponde en byte a " + Double.MAX_VALUE);


        System.out.println("varFlotante = " + varFlotante);


    }
}
