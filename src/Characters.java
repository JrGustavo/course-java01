public class Characters {

    public static void main(String[] args) {
        var  caracter = '\u0040';
        char decimal  = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = catacter " + (decimal ==  caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo ==  caracter));

        System.out.println("Char corresponde en byte = " + Character.SIZE);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE  = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE  = " + Character.MAX_VALUE);
    }
}
