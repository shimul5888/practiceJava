public class Assignment2a {
    public static void main(String[] args) {
        double rent = 1500;
        double groceries = 1200;
        double entertainment = 1000;
        double transportation = 200;
        if (rent > groceries && rent > entertainment && rent > transportation) {
                System.out.println("Rent is high enough");}
            else if (groceries > entertainment && groceries > transportation)  {
                System.out.println("Groceries are lesser than rent");
            }
             else if (entertainment > transportation)
            {
                System.out.println("Entertainment is good for health");
            }
             else {
            System.out.println("Transportation is the highest");
        }

        }
    }
