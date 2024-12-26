public class funtion1 {
    public static int fun(){
        return 7;
    }
    public static String hi(){
        return "gayathri";
    }
    public static void a(){
        System.out.println("hi");
    }
    public static void a(int g , String k){
        System.out.println(g);
        System.out.println(k);
    }
    public static void fun(int n, String sup){
        for(int i=0;i<n;i++){
            System.out.println(sup);
        }
    }
    public static void main(String[] args){
        System.out.println(fun());
    
        String g=hi();
        System.out.println(g);
        a();
        a(143,"gaythri");
        fun(5,"bharathi");
    }
}
