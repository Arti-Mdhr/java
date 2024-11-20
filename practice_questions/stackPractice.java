package practice_questions;
import java.util.Stack;

public class stackPractice {
    public static void main(String[] args) {
        TextInter tt = new TextInter();
        tt.addText("I like kids");
        tt.getText();
        tt.addText("Hellll Yeahhh");
        tt.getText();
        
    }
}
class TextInter{
    private Stack<String>textFace;
    private String currentText;
    TextInter(){
        textFace=new Stack<>();
        currentText="";
    }
    public void addText(String text){
       textFace.push(currentText);
       currentText+=text;

    }
    public void undoText(){
        if(!textFace.isEmpty()){
            currentText=textFace.pop();

        }else{
            System.out.println("nothing to undo here.");
        }
    }
    public String getText(){
        return currentText;
    }
}
