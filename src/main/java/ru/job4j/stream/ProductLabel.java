package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .flatMap(Stream::ofNullable)
                .filter(pr -> (pr.getStandart() - pr.getActual()) <= 3)
                .filter(pr -> (pr.getStandart() - pr.getActual()) >= 0)
                .map(pr -> new Label(pr.getName(), (pr.getPrice() / 2)))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}
