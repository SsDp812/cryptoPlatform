package ru.dev.trade.model.addittional;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InfoCard {
    private Long id;
    private String header;
    private String text;
}
