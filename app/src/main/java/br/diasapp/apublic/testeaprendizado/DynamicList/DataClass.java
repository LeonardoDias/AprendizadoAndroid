package br.diasapp.apublic.testeaprendizado.DynamicList;

/**
 * Created by dias on 10/07/17.
 */

public class DataClass {

    private String name;
    private String initial_hour;
    private String final_hour;

    public DataClass(String name, String initial_hour, String final_hour){
        this.name = name;
        this.initial_hour = initial_hour;
        this.final_hour = final_hour;
    }

    public String getName() {
        return name;
    }

    public String getInitial_hour() {
        return initial_hour;
    }

    public String getFinal_hour() {
        return final_hour;
    }
}
