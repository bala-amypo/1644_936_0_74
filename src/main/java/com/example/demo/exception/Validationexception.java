pakage com.example.demo.Exception;


public class Validationexception extends RuntimeException{




    public validationexception(String message){
        super(message);

    }
      @Override
   public Studententity getData(int id){
    return student.findById(id).orElse(null);
   }
    
}