package com.learning.HttpLearning;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"adjClose", "adjHigh", "adjLow", "adjOpen", "divCash", "spliFactor"})
public class StocksPOJO {
    public String date;
    public double open;
    public double close;
    public double volume;
   public double adjVolume;

    public StocksPOJO(String date, double open, double close, double volume, double adjVolume) {
        this.date = date;
        this.open = open;
        this.close = close;
        this.volume = volume;
        this.adjVolume = adjVolume;
    }
}
