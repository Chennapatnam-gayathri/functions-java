public class funtion2paras {
    public static String fun(int n ,String b){
        String ans="";
        for(int i=0;i<n;i++){
            ans=ans+b;
        }
        return ans;
    }
    public static void main(String[] args){
        String fam=fun(5 ,"gayathri");
        System.out.println(fam);
    }
}
