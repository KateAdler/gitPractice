import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<String> res = Util.getDiff(Util.getProp("str1"), Util.getProp("str2"));
        System.out.println(res);

        System.out.println(Util.wordCounter(Util.getProp("str1"), Util.getProp("str2")));



    }
}
