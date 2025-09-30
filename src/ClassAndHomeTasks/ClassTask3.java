package ClassAndHomeTasks;

public class ClassTask3 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Bu bir test cümlədir");

        System.out.print(stringBuilder+" ----> ");
        int[] vowelCodes = {97, 101, 601, 105, 305, 111, 246, 117, 252,65, 69, 399, 304, 73, 79, 214, 85, 220};

        //Ozum yazdigdan sonra, siz yazana da baxdim String ile daha rahatdır.
        for (int i = 0; i <stringBuilder.length() ; i++) {
            for (int a: vowelCodes){
                if(stringBuilder.charAt(i) == (char)a){
                    stringBuilder.setCharAt(i,'*');
                    break;
                }
            }
        }

        System.out.println(stringBuilder);
    }
}
