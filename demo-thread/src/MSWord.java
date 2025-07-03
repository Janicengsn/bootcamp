public class MSWord {

  //Stack
  
  public class MSWord {
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    // constructor
  public MSWord() {
    this.undoStack = new Stack<>();
    this.redoStack = new Stack<>();
  }

    public void undo() {
      if (!undoStack.isEmpty()) {
      String element = undoStack.pop();
     redoStack.push(element);
    }
  }

    public void redo() {
      String element = redoStack.pop();
     undoStack.push(element);
    }

    public void addWord(String word) {
      this.undoStack.push(word);
    }

    public static void main(String[] args) {
      MSWord msWord = new MSWord();
      msWord.undo();
      msWord.redo();
      msWord.addWord("John");
      msWord.addWord("Peter");
      msWord.undo();
      system.out.println(msWord.getWords()); // ["John"]
      
    }
  }
}
