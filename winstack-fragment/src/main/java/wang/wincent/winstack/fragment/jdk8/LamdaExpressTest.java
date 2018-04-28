package wang.wincent.winstack.fragment.jdk8;

import java.util.*;
import java.util.stream.Collectors;

public class LamdaExpressTest {


    public static void main(String[] args) {
//        String test="12-1,13-2,15-3,16-4";
//        Map<String, String> collect = Arrays.stream(test.split(",")).map(s -> s.split("-")).collect(Collectors.toMap(s -> s[0], s -> s[1]));
//        System.out.println(collect);
//        collect.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v);
//        });
        Long a0=1l;
        Long a1=12l;
        Long a2=123l;
        Long a3=1234l;
        Long a4=12345l;
        Long a5=123456l;
        Long a6=1234567l;
        List<Long> list=new ArrayList<>();
        list.add(a0);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        List<Long> list2=new ArrayList<>();
        list2.add(a2);
        list2.add(a3);
        list2.add(a4);
        List<Long> collect = list.stream().filter(s -> list2.contains(s)).collect(Collectors.toList());
        collect.forEach(System.out::println);





    }

}
