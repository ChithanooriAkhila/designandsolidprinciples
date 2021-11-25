/*DRY:

Don't repeat yourself.
 if a few lines of code are repeated more than once then move that code from there to a separate method.
 Replace those few lines of code with a separate method.
now called that method by replacing these few lines of code.
there will be no scope for changing the code at multiple places.
 You can just change lines of code in that method it is not necessary to change at multiple places.
 keep your core dry and don't let it become WET-Wasting everyone's time.
*/
public class Laundry {
    public void washWhiteClothes(){
        System.out.println("washing white clothes");
        commonClothes();
    }
    public void washColorClothes(){
        System.out.println("washing coloured clothes");
        commonClothes();
    }
    public void commonClothes(){
        //put in water,detergent
        //drain out water
    }
}
