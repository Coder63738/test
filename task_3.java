public class task_3{
    public static int chekcing(int[] asciiIndex,int password_length,int accuracy,int border1,int border2){
        for (int i = 0; i < password_length; i++) {
            if(asciiIndex[i]>=border1&&asciiIndex[i]<=border2){
                accuracy++;
                break;}}
        return accuracy;
    }
}