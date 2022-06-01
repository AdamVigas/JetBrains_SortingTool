package sorting;

public class Main {
    public static void main(final String[] args) {
        sorting.App app = new sorting.App();
        if(args.length == 0 || (args[0].equals("-dataType") && args[1].equals("word"))){
            app.computeWord();
        }else if(args[0].equals("-dataType") && args[1].equals("line")) {
            app.computeLine();
        }else if(args[0].equals("-dataType") && args[1].equals("long")) {
            app.computeLong();
        }else {
            app.incompatibleParameter();
        }
    }
}
