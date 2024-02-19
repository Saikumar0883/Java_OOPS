class hi {
   public static void hello(){
      try{
        throw new ClassNotFoundException("NP");
    }
    catch(ClassNotFoundException e)
    {
        System.out.println(e);
        
    }
   }
}

public class fourth {
   public static void main(String[] args) {
    hi obj=new hi();
    obj.hello();
   }
    
}
