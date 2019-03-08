package util;

import java.util.Random;

public class ColorSelecter {
    private String [] Color={"label-default","label-primary","label-success","label-info","label-warning","label-danger"};
    public  String getRandomColor(){
        Random rd=new Random();

        return Color[rd.nextInt(6)];
    }
}
