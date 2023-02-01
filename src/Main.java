import java.util.HashMap;
import java.util.Map;
/*

Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
 «Название книги» И. О. Автора.

 Напишите пример обработки нескольких исключений в одном блоке catch.


*/

public class Main {
    public static void main(String[] args) {
     Map<String,String> map = new HashMap<>();

     map.put ("Марсиане","Иванов ИВанович\n");
     map.put("Останкино", "Петров Сергей");
        System.out.println(map);

        try
        {
            int a = 1 / 0;
        }
        catch (NullPointerException e)
        {
            System.out.println("Ссылка равна 0");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Дуление на 0");
        }
        catch (Exception e)
        {
            System.out.println("Остальные ошибки");
        }
    }


}