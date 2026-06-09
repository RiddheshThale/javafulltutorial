class computer {
  public void playmusic() {
    System.out.println("music playing");
  }

  public String getpen(int cost) {
    return "pen";
  }
}

public class oops2 {
  public static void main(String[] args) {
    computer comps = new computer();
    comps.playmusic();
    String str = comps.getpen(10);
    System.out.println(str);
  }
}
