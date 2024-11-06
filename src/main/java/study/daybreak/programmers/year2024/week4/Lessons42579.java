package study.daybreak.programmers.year2024.week4;

import java.util.*;
import java.util.stream.Collectors;

/*
    코딩테스트 연습 > 해시 > 베스트앨범
    https://school.programmers.co.kr/learn/courses/30/lessons/42579

    문제 설명

    스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

        속한 노래가 많이 재생된 장르를 먼저 수록합니다.
        장르 내에서 많이 재생된 노래를 먼저 수록합니다.
        장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

    노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
    제한사항

        genres[i]는 고유번호가 i인 노래의 장르입니다.
        plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
        genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
        장르 종류는 100개 미만입니다.
        장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
        모든 장르는 재생된 횟수가 다릅니다.

    입출력 예
    genres 	plays 	return
    ["classic", "pop", "classic", "classic", "pop"] 	[500, 600, 150, 800, 2500] 	[4, 1, 3, 0]
    입출력 예 설명

    classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.

        고유 번호 3: 800회 재생
        고유 번호 0: 500회 재생
        고유 번호 2: 150회 재생

    pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.

        고유 번호 4: 2,500회 재생
        고유 번호 1: 600회 재생

    따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.

        장르 별로 가장 많이 재생된 노래를 최대 두 개까지 모아 베스트 앨범을 출시하므로 2번 노래는 수록되지 않습니다.

* */
public class Lessons42579 {
    private static <K, V extends Comparable<? super V>> Map<K, V> getSortedMap(Map<K, V> genresPlaySumMap) {
        Map<K, V> sortedMap = genresPlaySumMap.entrySet()
                .stream()
                .sorted(Map.Entry.<K, V>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,       // key 유지
                        Map.Entry::getValue,     // value 유지
                        (e1, e2) -> e1,          // 중복 키 처리 (실제 중복 없음)
                        LinkedHashMap::new       // 순서 유지를 위해 LinkedHashMap 사용
                ));
        return sortedMap;
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        // 장르별 재생수 합
        Map<String, Integer> genresPlaySumMap = new HashMap();
        // 장르별 플레이 리스트 map(k: 장르 v: map(k: index, v: play count))
        Map<String, Map<Integer, Integer>> playCountListOfGenresMap = new HashMap();

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            if (genresPlaySumMap.containsKey(genres[i])) {
                genresPlaySumMap.put(genres[i], genresPlaySumMap.get(genres[i]) + plays[i]);

                Map<Integer, Integer> playCountList = playCountListOfGenresMap.get(genres[i]);
                playCountList.put(i, plays[i]);
                playCountListOfGenresMap.put(genres[i], playCountList);
            } else {
                genresPlaySumMap.put(genres[i], plays[i]);

                Map<Integer, Integer> playCountList = new HashMap<>();
                playCountList.put(i, plays[i]);
                playCountListOfGenresMap.put(genres[i], playCountList);
            }
        }

        System.out.println("정렬전 genresPlaySumMap: " + genresPlaySumMap);
        System.out.println("playCountListOfGenresMap: " + playCountListOfGenresMap);

        // value를 기준으로 내림차순 정렬
        Map<String, Integer> sortedGenresPlaySumMap = getSortedMap(genresPlaySumMap);

        // 결과 출력
        System.out.println("내림차순 정렬된 genresPlaySumMap: " + sortedGenresPlaySumMap);

        Set<String> sortedKey = sortedGenresPlaySumMap.keySet();
        Iterator<String> iteratorSortedKey = sortedKey.iterator();
        while (iteratorSortedKey.hasNext()) {
            String targetGenresKey = iteratorSortedKey.next();
            System.out.println("targetGenresKey : " + targetGenresKey);

            Map<Integer, Integer> playCountListMap = playCountListOfGenresMap.get(targetGenresKey);
            Map<Integer, Integer> sortedPlayCountListMap = getSortedMap(playCountListMap);

            System.out.println("내림차순 정렬된 playlistMap" + sortedPlayCountListMap);
            sortedPlayCountListMap.entrySet().stream().limit(2).forEach((entry) -> {
                resultList.add(entry.getKey());
            });
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
