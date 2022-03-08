package MementoPattern;

/*
 * 
 *  In the Memento pattern, these three classes are called Originator,
 *  Memento, and Caretaker. Let’s map into our previous example.
 *  Originator(Editor) class — This is the place that is required to include undo feature.
 *  Memento(EditorState) class — This class consists of all revertible fields(in this example,
 *  it keeps the content field). An instance of this class is taken as the state.
 *  Caretaker(History) class — This is the place that maintains the collection of states.
 * 
 * */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var editor = new Editor(); //var included in java 10 for local variable types
        var history = new History();
        editor.setContent("I");
        history.save(editor.createState());
        editor.setContent("I am");
        history.save(editor.createState());
        editor.setContent("I am Jalitha");

        System.out.println(editor.getContent());
        //output will be "I am Jalitha"
        history.revert(editor);
        System.out.println(editor.getContent());
        //output will be "I am"
        history.revert(editor);
        System.out.println(editor.getContent());
        //output will be "I"
        history.revert(editor);
         //output will be "Cannot undo !"



	}

}
