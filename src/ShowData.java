import java.util.ArrayList;

public class ShowData {
    public static void main(String[] args) {
        //instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();

        ArrayList<Book> mybooklist = b.bookdetails();
            for(Book showValue: mybooklist) {
                //---- invoking getter method for geting Data---------
                System.out.println(showValue.getNumber() + " " + showValue.getName() +
                        " " + showValue.getAuthor() + " " + showValue.getCategory());
            }
    }
}
