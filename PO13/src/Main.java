public class Main {
    public static void main(String[] args){
        /*  FEW NOTES
        1. Drawing works only when there is more than 1 point passed
        2. There are few "magic numbers" in code (for example when defining frame size or bounds)


            WHAT CAN BE DONE TO ENHANCE THIS APPLICATION
         1. Dynamic scale with labels to increase visibility
         2. Point sorting to prevent strange charts
         3. Error handling during passing point coordinates (although it`s not stopping application)
         4. Creating custom classes extending textfield, label etc. to increase scalability (at the moment it`s a little hard coded)
         */
        new AddPointFrame();
    }
}
