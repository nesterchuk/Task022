import java.io.IOException;

public class ConsoleHelper {
    public void start() {
        String choice ="";
        FixedList<String> fixedList = null;
        while (!choice.equals("0")) {
            ConsoleReader reader = new ConsoleReader();
            while ((fixedList == null) && !choice.equals("0")){
                System.out.print(
                        "Menu: \n" +
                                " 0) Exit \n" +
                                " 2) Create a standard collection \n" +
                                " 1) Create Collection of specified size \n" +
                                " Select from the list: "
                );
                choice = reader.readString();
                switch (choice) {
                    case ("0"):
                        break;
                    case ("1"):
                        System.out.print("Enter the size of the collection: ");
                            fixedList = new FixedList<String>(reader.readInteger());
                            System.out.println("Collection created");
                        break;
                    case ("2"):
                        fixedList = new FixedList<>();
                        System.out.println("Collection created");
                        break;
                    default:
                        System.out.println("This item does not exist");

                }
            }

            if (choice.equals("0")){
                break;
            }

            System.out.print(
                    "Menu: \n" +
                            " 0) Exit \n" +
                            " 2) Add item to collection \n" +
                            " 3) Show collection \n" +
                            " Select from the list: "
            );
            choice = reader.readString();
                switch (choice) {
                    case ("0"):
                        break;
                    case("2"):
                        fixedList.push(reader.readString());
                        break;
                    case("3"):
                        System.out.println(fixedList.getList());
                        break;
                    default:
                        System.out.println("This item does not exist");
            }
        }
    }
}
