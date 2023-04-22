import java.util.HashMap;
import java.util.Map;

public class CustomKeyHashMap {
        private String firstName;
        private String lastName;
        private int id;

        public CustomKeyHashMap(String firstName, String lastName, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }



        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }



        public String getLastName() {
            return lastName;
        }



        public void setLastName(String lastName) {
            this.lastName = lastName;
        }



        public int getId() {
            return id;
        }



        public void setId(int id) {
            this.id = id;
        }


        @Override
        public String toString() {
            return "CustomKeyHashMap [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
        }

        public static void main(String[] args) {
            Map<CustomKeyHashMap,Integer> map =new HashMap<>();

         //   map.put("rahul","vijay",17, 1);

         CustomKeyHashMap key = new CustomKeyHashMap("rahul", "vijay", 17);
         CustomKeyHashMap key1 = new CustomKeyHashMap("rahul", "vijay", 17);

            map.put(key, 1);
            map.put(key1, 1);


          for(Map.Entry<CustomKeyHashMap,Integer> entry : map.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
}

        }
        
    
}
