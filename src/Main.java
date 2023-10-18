public class Main {
  public static void main(String[] args) {
    String b="lloWorl";
    StringBuilder sb=new StringBuilder();
    sb.append("He11oWor1d");
    sb.replace(2,b.length()+1,b);
    // HelloWorlr1d
    // HelloWorl1d
    String answer = sb.toString();
    System.out.println(answer);

  }
}
