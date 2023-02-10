package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        double rsl = 0;
        for (Pupil pupil: pupils) {
            for (Subject sub: pupil.subjects()) {
                sum = sum + sub.score();
                count += 1;
            }
        }
        rsl = sum / count;
        return rsl;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject sub : pupil.subjects()) {
                sum = sum + sub.score();
            }
            labels.add(new Label(pupil.name(), sum / pupil.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        LinkedHashMap<String, Integer> subj = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject sub : pupil.subjects()) {
                int score = subj.getOrDefault(sub.name(), 0);
                subj.put(sub.name(), sub.score() + score);
            }
        }
        for (String name: subj.keySet()) {
            labels.add(new Label(name, subj.get(name) / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject sub : pupil.subjects()) {
                sum = sum + sub.score();
            }
            labels.add(new Label(pupil.name(), sum));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        LinkedHashMap<String, Integer> subj = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject sub : pupil.subjects()) {
                int score = subj.getOrDefault(sub.name(), 0);
                subj.put(sub.name(), sub.score() + score);
            }
        }
        for (String name: subj.keySet()) {
            labels.add(new Label(name, subj.get(name)));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
