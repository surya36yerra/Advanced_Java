package lambda.MethodReference;

public class ConstructorReferenceDemo {

    public static void main(String[] args) {
        ProductInterface productInterface =(name,price)->new Product(name,price);
     //   System.out.println(productInterface.getProduct("Apple Mac",2000));

        ProductInterface constRef = Product::new;
        System.out.println(constRef.getProduct("Apple Iphone",1000));
        }
    }

