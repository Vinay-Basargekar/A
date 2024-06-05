
class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T setdata(){
        return data;
    }
}

public class generic1 {
    public static void main(String args[]){
        GenericClass<Integer> obj = new GenericClass<>(44);

        System.out.println(obj.setdata());
    }
}
