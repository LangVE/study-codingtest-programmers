package study.daybreak.programmers.week2;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public boolean solution(String[] phone_book) {
        Map<String, String> phoneMap = new HashMap<>();

        for (String p : phone_book) {
            phoneMap.put(p, p);
        }

        for (String p : phone_book) {
            for (int i = 1; i < p.length(); i++) {
                String pSub = p.substring(0, i);
                if (phoneMap.containsKey(pSub)) {
                    return false;
                }
            }
        }
        return true;
    }
}
