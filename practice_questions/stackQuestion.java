package practice_questions;
import java.util.Stack;

public class stackQuestion{
  public static void main(String [] args) {
    textEditor ed = new textEditor();
    ed.addText("Hello");
    System.out.println("Current Text: " + ed.getCurrentText());
    ed.addText("World");
    System.out.println("Current Text: " + ed.getCurrentText());
    ed.undo();
    System.out.println("After first undo: " + ed.getCurrentText());
    ed.undo();
    System.out.println("After second undo: " + ed.getCurrentText());
    ed.undo();
  }
}
class textEditor{
  private Stack<String> textStack;
  private String currentText;
  textEditor(){
    textStack = new Stack<>();
    currentText = "";
  }
  public void addText(String text){
    textStack.push(currentText);
    currentText += text;
  }
  public void undo(){
    if (!textStack.isEmpty()){
      currentText = textStack.pop();
    }
    else{
      System.out.println("No more undo operation available");
    }
  }
  public String getCurrentText(){
    return currentText;
  }
}
