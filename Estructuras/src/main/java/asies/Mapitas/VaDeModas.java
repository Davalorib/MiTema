package asies.Mapitas;


import java.util.HashMap;
import java.util.Map;
public class VaDeModas {
    static java.util.Scanner in;
    public static boolean casoDePrueba() {
        if (in.nextInt() == 0)
            return false;
        else {
            in.nextLine();
            String[] nums = in.nextLine().split(" ");
            Map<String,Integer> map = new HashMap<>();
            String clave_max = "";
            Integer max = 0;
            for (String n:nums){
                if (map.containsKey(n)){
                    map.put(n,map.get(n)+1);
                } else {
                    map.put(n,1);
                }
                if (map.get(n)>max){
                    max = map.get(n);
                    clave_max = n;
                }
            }
            System.out.println(clave_max);
            return true;
        }
    }
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}