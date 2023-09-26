package JAVA.Homework.Homework_seminar2;

/*Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены
ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

Пример:
{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами */

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        
    System.out.println(task1("select * from students where ",
                       "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}"));
    
    
    } 
    public static StringBuilder task1(String QUERY, String PARAMS) {
        System.out.println(PARAMS);
        PARAMS = PARAMS.replace('{', ' ').replace('}', ' ').replaceAll("\\s", "").replaceAll("\"", "");
        System.out.println(PARAMS);
        String[] pairs = PARAMS.split(",");

        Map<String, String> map = new TreeMap<>(Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (String pair : pairs) {
            String[] keyVal = pair.split(":");
            map.put(keyVal[0], '\'' + keyVal[1] + '\'');
            System.out.println(map);
            stringBuilder.append(keyVal[0] + "=" + keyVal[1]);
        }

        map.values().removeIf(value -> value.contains("null"));

        String resMapToStr = map.entrySet().stream().map(Objects::toString).collect(Collectors.joining(" and "));
        stringBuilder.delete(0, stringBuilder.length());
        System.out.println(resMapToStr);
        stringBuilder.append(QUERY).append(resMapToStr);
        return stringBuilder;
        }
}