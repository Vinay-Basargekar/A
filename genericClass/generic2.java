
class Gen<T1,T2>{
    private T1 data1;
    private T2 data2;

    public Gen(T1 data1,T2 data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public void sendData(){
        System.out.println(data1);
        System.out.println(data2);
    }
}

public class generic2{
    public static void main(String args[]){
        Gen<Integer,String> obj = new Gen<>(22,"Vinay");

        obj.sendData();
    }
}