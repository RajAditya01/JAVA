public class logicalOperator {
    public static void main(String[] arrg){
        int a=10;
        int b=40;
        if(a<50 && b<50)
        System.out.println("both less than 50");

        if(a<50 || b<50)
        System.out.println("atleast one less than 50");

        boolean isAdult = false;
        // if(isAdult)-->isadult=true keliye check hoga.
        if(!isAdult)    //-->not is adult keliye check krega.
        System.out.println("is adult");
        else 
        System.out.println("not adult");
    }
    
}
