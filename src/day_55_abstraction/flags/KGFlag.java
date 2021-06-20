package day_55_abstraction.flags;
import java.awt.*;
public class KGFlag extends Flag {
    @Override
    public void draw() {
        Grid grid = new Grid();
        int height = grid.getHt();
        int width = grid.getWd();
//Paints everything Blue
        for (int c = 0; c < height; c++) {
            for (int d = 0; d < width; d++) {
                grid.setColor(c, d, Color.CYAN);
            }
        }
//Paints a Yellow Line
        for (int c = (height / 3); c < ((height * 2) / 3); c++) {
            for (int d = 0; d < width; d++) {
                grid.setColor(c, d, Color.YELLOW);
            }
        }
        //makes the triangle
        int temp;
        temp = 0;
        for (int d = 0; d < (width - 2) / 4; d++) {
            for (int c = 0 + temp; c < height - temp; c++) {
                grid.setColor(c, d, Color.BLACK);
            }
            temp++;
        }
//Makes that last black dot at the end of the triangle
        if (height <= 9) {
            for (int c = (height - 1) / 2; ; ) {
                for (int d = 0; d <= (width - 2) / 4; d++) {
                    grid.setColor(c, d, Color.BLACK);
                }
            }
        } else {
            for (int j = 0; j <= 2; j++) {
                int z = 0;
                for (int c = 0; c < (height - 1) / 2; c++) {
                    for (int d = 0; d <= (width - 2) / 4; d++) {
                        grid.setColor(c - 1, d, Color.BLACK);
                    }
                }
            }
        }
    }
}

