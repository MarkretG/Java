package task2;

public class DefineEnum {
    enum RainbowColor{
        VIOLET (1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
        int value;
        private RainbowColor(int value)
        {
            this.value=value;
        }
    }
}
