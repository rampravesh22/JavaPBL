package FlowControl;

public class FC15 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        for(int i=0;i<a;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
