
import com.example.demo.entity.Studentdetailsentity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Idcarddetailservice{
    Studentdetailsentity postData(@RequestBody Studentdetailsentity stu);
}