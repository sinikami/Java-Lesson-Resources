package homework;

/**
 * Created by ikocos on 30/01/2017.
 */
public class homework_03_03 {
    int width, height;

    homework_03_03(int width, int height) throws Exception {
        if (width * height > 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new Exception("width 와 height 는 0보다 커야 합니다");
        }

    }

    int getArea() {
        return width * height;
    }
}
