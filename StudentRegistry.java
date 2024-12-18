import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    void register(String key, Student val){
        map.put(key, val);
    }

    Student get(String key){
        return map.get(key);
    }
}
