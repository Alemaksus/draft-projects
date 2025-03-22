package tau.java_course_tau.chapter12_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gradebook {

    // Метод для вычисления финальных оценок
    public static Map<String, Integer> calculateFinalGrades(Map<String, Integer> originalGrades, Map<String, Integer> makeUpGrades) {
        Map<String, Integer> finalGrades = new HashMap<>();

        for (String student : originalGrades.keySet()) {
            // Получаем оригинальную и пересдачу для студента
            int originalScore = originalGrades.get(student);
            int makeUpScore = makeUpGrades.get(student);

            // Выбираем наибольшую из двух оценок как финальную
            finalGrades.put(student, Math.max(originalScore, makeUpScore));
        }
        return finalGrades;
    }

    // Метод для сортировки по оценкам (от высшего к низшему) и по имени (если оценки одинаковые)
    public static List<Map.Entry<String, Integer>> sortByScoresAndNames(Map<String, Integer> finalGrades) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(finalGrades.entrySet());

        // Сортируем по оценкам от высшего к низшему, а в случае равенства — по имени
        sortedList.sort((entry1, entry2) -> {
            int scoreComparison = entry2.getValue() - entry1.getValue();  // Сортируем по оценке
            if (scoreComparison != 0) {
                return scoreComparison;
            } else {
                return entry1.getKey().compareTo(entry2.getKey());  // Если оценки одинаковые, сортируем по имени
            }
        });

        return sortedList;
    }

    // Основной метод для выполнения программы
    public static void main(String[] args) {
        // Получаем оригинальные оценки и оценки после пересдачи из класса TestResults
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        // Вычисляем финальные оценки
        Map<String, Integer> finalGrades = calculateFinalGrades(originalGrades, makeUpGrades);

        // Сортируем студентов по оценкам от высших к низшим и по имени (если оценки одинаковые)
        List<Map.Entry<String, Integer>> sortedGrades = sortByScoresAndNames(finalGrades);

        // Выводим финальные оценки с сортировкой
        for (Map.Entry<String, Integer> entry : sortedGrades) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
