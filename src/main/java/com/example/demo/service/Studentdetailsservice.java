
import com.example.demo.entity.Studentdetailsentity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Studentdetailsservice{
    Studententity postData(@RequestBody Studentdetailsentity stu);
}