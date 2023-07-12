public class Main {


    static String Mehsul(String meyve){
        return "1 kiloqram " + meyve;
    };

    static String Cekisi(int terevez, int bitki, String meyve){

        return terevez*bitki + " qarpiz";
    };

    public static void main(String[] args) {
        Mehsul("heyva");
        System.out.println(Cekisi(4,2,"alma"));
    }
}