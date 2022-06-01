package sorting;

public class Main {
    public static void main(final String[] args) {
        sorting.App app = new sorting.App();
        switch(args.length) {
            case 0: {
                app.computeWord();
                break;
            }
            case 1: {
                if(args[0].equals("-sortIntegers")) {
                    app.sortIntegers();
                }else app.incompatibleParameter();
            }
            break;
            case 2: {
                if((args[0].equals("-dataType") && args[1].equals("word"))) {
                    app.computeWord();
                }else if(args[0].equals("-dataType") && args[1].equals("line")) {
                    app.computeLine();
                }else if(args[0].equals("-dataType") && args[1].equals("long")) {
                    app.computeLong();
                }else app.incompatibleParameter();
            }
            break;
            case 3: {
                if(args[0].equals("-dataType") && args[1].equals("word") && args[2].equals("-sortIntegers")) {
                    app.sortIntegers();
                }else if(args[0].equals("-dataType") && args[1].equals("long") && args[2].equals("-sortIntegers")) {
                    app.sortIntegers();
                }else if(args[0].equals("-sortIntegers") || args[1].equals("-sortIntegers") || args[2].equals("-sortIntegers")) {
                    app.sortIntegers();
                }else app.incompatibleParameter();
            }
            break;

            default: {
                app.incompatibleParameter();
            }
            break;
        }

    }

}
