//region Observer pattern import statements
import com.designpatterns.sample.FirstKotlinClass;
import com.designpatterns.sample.observerpattern.EmailTopic;
import com.designpatterns.sample.observerpattern.EmailTopicSubscriber;
import com.designpatterns.sample.observerpattern.Observer;
//endregion

//region Strategy pattern example one import statements
import com.designpatterns.sample.strategypattern.BalloonAlgorithm;
import com.designpatterns.sample.strategypattern.ScoreBoard;
import com.designpatterns.sample.strategypattern.SquareAlgorithm;
//endregion

//region Strategy pattern example two import statements
import com.designpatterns.sample.strategypattern2.CreditCardAlgorithm;
import com.designpatterns.sample.strategypattern2.PaypalAlgorithm;
import com.designpatterns.sample.strategypattern2.Product;
import com.designpatterns.sample.strategypattern2.ShoppingCart;
//endregion

//region
import com.designpatterns.sample.decoratorpattern.ChocolateIceCream;
import com.designpatterns.sample.decoratorpattern.VanillaIceCream;
import com.designpatterns.sample.decoratorpattern.FruitIceCream;
import com.designpatterns.sample.decoratorpattern.BaseIceCream;
import com.designpatterns.sample.decoratorpattern.IceCream;

//endregion

public class Main {

    public static void main(String[] args) {

        //region Strategy pattern example one invocation
        System.out.println("\nStrategy pattern example one!");

        ScoreBoard sb = new ScoreBoard();

        System.out.print("Square score: ");
        sb.scoreAlgorithmBase = new SquareAlgorithm();
        sb.showScore(5,10);

        System.out.print("Baloon score: ");
        sb.scoreAlgorithmBase = new BalloonAlgorithm();
        sb.showScore(5,10);

        System.out.println("ends");
        //endregion

        //region Strategy pattern example two invocation
        System.out.println("\nStrategy pattern example two!");

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product(1, 10);
        Product p2 = new Product(2, 20);

        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.pay(new CreditCardAlgorithm("65432123456765433", "card name"));
        cart.pay(new PaypalAlgorithm("paypalemail@gmail.com", "1234567"));

        System.out.println("ends");
        //endregion

        //region Observer pattern example invocation
        System.out.println("\nObserver pattern example!");

        EmailTopic topic = new EmailTopic();

        Observer observer1 = new EmailTopicSubscriber("Observer1");
        Observer observer2 = new EmailTopicSubscriber("Observer2");

        observer1.setSubject(topic);
        observer2.setSubject(topic);

        observer1.update();
        observer2.update();

        topic.registerObserver(observer1);
        topic.registerObserver(observer2);

        topic.postMessage("new chapter1 added");

        topic.unregisterObserver(observer1);

        topic.postMessage("new chapter2 added");

        System.out.println("ends");
        //endregion

        //region Decorator pattern example invocation
        System.out.println("\nDecorator pattern example!");
        IceCream baseIceCream = new BaseIceCream();
        System.out.println("base ice-cream cost: "+baseIceCream.cost());

        IceCream vanillaIceCream = new VanillaIceCream(baseIceCream);
        System.out.println("vanilla ice-cream cost: "+vanillaIceCream.cost());

        IceCream chocolate = new ChocolateIceCream(baseIceCream);
        System.out.println("chocolate ice-cream cost: "+chocolate.cost());

        IceCream fruit = new FruitIceCream(baseIceCream);
        System.out.println("fruit ice-cream cost: "+fruit.cost());

        //region magic of decorator pattern
        IceCream mixedIceCream = new FruitIceCream(chocolate);
        System.out.println("fruit with choc ice-cream cost: "+mixedIceCream.cost());


        IceCream addVanilla = new VanillaIceCream(mixedIceCream);
        System.out.println("total cost: " + addVanilla.cost());

        IceCream vanilla = new VanillaIceCream(addVanilla);
        System.out.println("total cost: " + vanilla.cost());
        //endregion

        System.out.println("ends");
        //endregion


    }

}
