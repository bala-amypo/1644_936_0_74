
import com.example.demo.entity.Studententity;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
public interface Studentdetailsservice{
    Studententity postData(@RequestBody Studentdetailsentity stu);
}