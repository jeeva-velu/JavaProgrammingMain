
class Computer{

    public void playMusic(){
        System.out.println("Playing Music");
    }

    public String giveMeAPen(int price){
        return "Pen";
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
    }
}
