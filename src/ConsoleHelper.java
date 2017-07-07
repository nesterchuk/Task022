public class ConsoleHelper {
    CustomCollection<String> customCollection = null;

    public void start() {
        String choice ="";
        while (!choice.equals("0")) {
            ConsoleReader reader = new ConsoleReader();
                System.out.print(
                        "Menu: \n" +
                                " 0) Exit \n" +
                                " 1) Create Collection of specified size \n" +
                                " 2) Create a standard collection \n" +
                                " 3) Add item to collection \n" +
                                " 4) Show collection \n" +
                                " Select from the list: "
                );
                choice = reader.readString();
                switch (choice) {
                    case ("0"):
                        break;
                    case ("1"):
                        if (isCustomCollectionInitialized()){
                            System.out.println("The collection is already initialized");
                             break;
                        }
                        System.out.print("Enter the size of the collection: ");
                        try {
                            customCollection = new CustomCollection<String>(reader.readInteger());
                            System.out.println("Collection created");
                        } catch (NotCorrectSizeException e){
                            System.out.println("The collection is not initialized (Invalid size)");
                        }
                        break;
                    case("2"):
                        if (isCustomCollectionInitialized()){
                            System.out.println("The collection is already initialized");
                            break;
                        }
                        customCollection = new CustomCollection<>();
                        System.out.println("Collection created");
                        break;
                    case("3"):
                        if(isCustomCollectionInitialized()){
                        customCollection.push(reader.readString());
                        } else {
                            System.out.println("The collection is not initialized");
                        }
                        break;
                    case("4"):
                        if (isCustomCollectionInitialized()){
                            System.out.println(customCollection.getList());
                        } else {
                            System.out.println("The collection is not initialized");
                        }
                        break;
                    default:
                        System.out.println("This item does not exist");
                }
        }
    }

    private boolean isCustomCollectionInitialized(){return  customCollection != null;}

}
