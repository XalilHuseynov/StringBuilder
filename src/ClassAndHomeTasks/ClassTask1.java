package ClassAndHomeTasks;

public class ClassTask1 {
    public static void main(String[] args) {
        String[] words1= {"Xalil","Java","Oyrenir","Salam"};
        String sentence="";
        for (int i = 0; i < words1.length ; i++) {
            if(i== words1.length-1){
                sentence+=words1[i]+".";
            } else if (i== words1.length-2) {
                sentence+=words1[i]+" və ";
            }else{
                sentence+= words1[i]+",";
            }
        }
        System.out.println("Sentence: "+sentence);



    }
}
