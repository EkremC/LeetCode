package Algorithms.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/subdomain-visit-count/description/
public class _811_SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
            String[] str = s.split(" ");
            int count = Integer.parseInt(str[0]);
            String domain = str[1];
            putDomainToMap(map, count, domain);

            while (domain.contains(".")) {
                int index = domain.indexOf(".");
                domain = domain.substring(index + 1);
                putDomainToMap(map, count, domain);
            }
        }

        List<String> listStr = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String e = entry.getValue().toString() + " " + entry.getKey();
            listStr.add(e);
        }

        return listStr;
    }

    private void putDomainToMap(Map<String, Integer> map, int count, String domain) {
        if (!map.containsKey(domain)) {
            map.put(domain, count);
        } else {
            map.put(domain, map.get(domain) + count);
        }
    }

}
