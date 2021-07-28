import java.util.Iterator;
import java.util.Map;

public class HashMap {


    public static void main(String[] args) {
        // 선언
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();

        // 값 추가
        map.put(1,"장성필");
        map.put(2,"최준배");
        map.put(3,"김민수");

        System.out.println(map);

//        //값 삭제
//        map.remove(2);
//        System.out.println("map = " + map);
//        map.clear();
//        System.out.println("map = " + map);

        // 출력1 - entrySet() 활용
        for(Map.Entry<Integer,String>entry : map.entrySet()){
            System.out.println("[key] = " + entry.getKey()+ "[value] = " + entry.getValue()) ;
        }

        // 출력2 - keySet() 활용
        for(Integer i : map.keySet()){
            System.out.println("[key] = " + i+ "[value] = " + map.get(i)) ;

        }

        // 출력3 - iterator(keyset)
        Iterator<Integer>keys = map.keySet().iterator();
        while(keys.hasNext()){
            int key = keys.next();
            System.out.println("[key] = " + key+ "[value] = " + map.get(key)) ;

        }
    }
}
