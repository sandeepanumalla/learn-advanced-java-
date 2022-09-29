import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
         EmpPOJO emp = new EmpPOJO("John", 27, 23334);

        objectMapper.writeValue(new File("Target/emp.json"), emp);
    }
}
