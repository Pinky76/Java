public class Child extends Parent{
    String child ;
    Child(String child, String Parent){
       System.out.println(child + Parent);
    }
    Child(String child){
        System.out.println(child);
    }
    Child(){
        this.child = "Default Child Constructor is Called";
//        super.parent ="Parent variable is initialised Child Default Constructor";
        System.out.println(child);
        System.out.println(parent);
    }
}
