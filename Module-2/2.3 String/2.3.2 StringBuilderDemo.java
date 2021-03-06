package core.string;

public class StringBuilderDemo {

    public static void main(String[] args) {
        //creating object of StringBuilder class
        StringBuilder str = new StringBuilder("Tops");
        System.out.println("str = " + str);

        str.append("Technologies");
        str.append(25);

        System.out.println("str = " + str);

        str.reverse();
        System.out.println(str);

        str.delete(2, 5);
        System.out.println(str);
    }

}
