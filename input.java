import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.InputMap;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class input {
  public static void main(String[] args) throws IOException {
    System.out.println("enter a number");
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);
    int num = Integer.parseInt(bf.readLine());

    System.out.println(num);

  }
}
